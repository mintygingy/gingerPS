// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReliquaryFilterStateNotify.proto

package emu.gingerps.net.proto;

public final class ReliquaryFilterStateNotifyOuterClass {
  private ReliquaryFilterStateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReliquaryFilterStateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReliquaryFilterStateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 10;</code>
     */
    int getReliquaryFilterStateMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 10;</code>
     */
    boolean containsReliquaryFilterStateMap(
        int key);
    /**
     * Use {@link #getReliquaryFilterStateMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getReliquaryFilterStateMap();
    /**
     * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 10;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getReliquaryFilterStateMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 10;</code>
     */

    int getReliquaryFilterStateMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 10;</code>
     */

    int getReliquaryFilterStateMapOrThrow(
        int key);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 669;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ReliquaryFilterStateNotify}
   */
  public static final class ReliquaryFilterStateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ReliquaryFilterStateNotify)
      ReliquaryFilterStateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReliquaryFilterStateNotify.newBuilder() to construct.
    private ReliquaryFilterStateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReliquaryFilterStateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ReliquaryFilterStateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReliquaryFilterStateNotify(
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
            case 82: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                reliquaryFilterStateMap_ = com.google.protobuf.MapField.newMapField(
                    ReliquaryFilterStateMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              reliquaryFilterStateMap__ = input.readMessage(
                  ReliquaryFilterStateMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              reliquaryFilterStateMap_.getMutableMap().put(
                  reliquaryFilterStateMap__.getKey(), reliquaryFilterStateMap__.getValue());
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
      return emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.internal_static_ReliquaryFilterStateNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 10:
          return internalGetReliquaryFilterStateMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.internal_static_ReliquaryFilterStateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify.class, emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify.Builder.class);
    }

    public static final int RELIQUARY_FILTER_STATE_MAP_FIELD_NUMBER = 10;
    private static final class ReliquaryFilterStateMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.internal_static_ReliquaryFilterStateNotify_ReliquaryFilterStateMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> reliquaryFilterStateMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetReliquaryFilterStateMap() {
      if (reliquaryFilterStateMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ReliquaryFilterStateMapDefaultEntryHolder.defaultEntry);
      }
      return reliquaryFilterStateMap_;
    }

    public int getReliquaryFilterStateMapCount() {
      return internalGetReliquaryFilterStateMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 10;</code>
     */

    @java.lang.Override
    public boolean containsReliquaryFilterStateMap(
        int key) {
      
      return internalGetReliquaryFilterStateMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getReliquaryFilterStateMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getReliquaryFilterStateMap() {
      return getReliquaryFilterStateMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 10;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getReliquaryFilterStateMapMap() {
      return internalGetReliquaryFilterStateMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 10;</code>
     */
    @java.lang.Override

    public int getReliquaryFilterStateMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetReliquaryFilterStateMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 10;</code>
     */
    @java.lang.Override

    public int getReliquaryFilterStateMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetReliquaryFilterStateMap().getMap();
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
          internalGetReliquaryFilterStateMap(),
          ReliquaryFilterStateMapDefaultEntryHolder.defaultEntry,
          10);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetReliquaryFilterStateMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        reliquaryFilterStateMap__ = ReliquaryFilterStateMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(10, reliquaryFilterStateMap__);
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
      if (!(obj instanceof emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify other = (emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify) obj;

      if (!internalGetReliquaryFilterStateMap().equals(
          other.internalGetReliquaryFilterStateMap())) return false;
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
      if (!internalGetReliquaryFilterStateMap().getMap().isEmpty()) {
        hash = (37 * hash) + RELIQUARY_FILTER_STATE_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetReliquaryFilterStateMap().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify prototype) {
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
     *   CMD_ID = 669;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ReliquaryFilterStateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReliquaryFilterStateNotify)
        emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.internal_static_ReliquaryFilterStateNotify_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 10:
            return internalGetReliquaryFilterStateMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 10:
            return internalGetMutableReliquaryFilterStateMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.internal_static_ReliquaryFilterStateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify.class, emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify.newBuilder()
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
        internalGetMutableReliquaryFilterStateMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.internal_static_ReliquaryFilterStateNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify build() {
        emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify buildPartial() {
        emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify result = new emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify(this);
        int from_bitField0_ = bitField0_;
        result.reliquaryFilterStateMap_ = internalGetReliquaryFilterStateMap();
        result.reliquaryFilterStateMap_.makeImmutable();
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
        if (other instanceof emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify) {
          return mergeFrom((emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify other) {
        if (other == emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify.getDefaultInstance()) return this;
        internalGetMutableReliquaryFilterStateMap().mergeFrom(
            other.internalGetReliquaryFilterStateMap());
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
        emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify) e.getUnfinishedMessage();
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
          java.lang.Integer, java.lang.Integer> reliquaryFilterStateMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetReliquaryFilterStateMap() {
        if (reliquaryFilterStateMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              ReliquaryFilterStateMapDefaultEntryHolder.defaultEntry);
        }
        return reliquaryFilterStateMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableReliquaryFilterStateMap() {
        onChanged();;
        if (reliquaryFilterStateMap_ == null) {
          reliquaryFilterStateMap_ = com.google.protobuf.MapField.newMapField(
              ReliquaryFilterStateMapDefaultEntryHolder.defaultEntry);
        }
        if (!reliquaryFilterStateMap_.isMutable()) {
          reliquaryFilterStateMap_ = reliquaryFilterStateMap_.copy();
        }
        return reliquaryFilterStateMap_;
      }

      public int getReliquaryFilterStateMapCount() {
        return internalGetReliquaryFilterStateMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 10;</code>
       */

      @java.lang.Override
      public boolean containsReliquaryFilterStateMap(
          int key) {
        
        return internalGetReliquaryFilterStateMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getReliquaryFilterStateMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getReliquaryFilterStateMap() {
        return getReliquaryFilterStateMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 10;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getReliquaryFilterStateMapMap() {
        return internalGetReliquaryFilterStateMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 10;</code>
       */
      @java.lang.Override

      public int getReliquaryFilterStateMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetReliquaryFilterStateMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 10;</code>
       */
      @java.lang.Override

      public int getReliquaryFilterStateMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetReliquaryFilterStateMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearReliquaryFilterStateMap() {
        internalGetMutableReliquaryFilterStateMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 10;</code>
       */

      public Builder removeReliquaryFilterStateMap(
          int key) {
        
        internalGetMutableReliquaryFilterStateMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableReliquaryFilterStateMap() {
        return internalGetMutableReliquaryFilterStateMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 10;</code>
       */
      public Builder putReliquaryFilterStateMap(
          int key,
          int value) {
        
        
        internalGetMutableReliquaryFilterStateMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 10;</code>
       */

      public Builder putAllReliquaryFilterStateMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableReliquaryFilterStateMap().getMutableMap()
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


      // @@protoc_insertion_point(builder_scope:ReliquaryFilterStateNotify)
    }

    // @@protoc_insertion_point(class_scope:ReliquaryFilterStateNotify)
    private static final emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify();
    }

    public static emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReliquaryFilterStateNotify>
        PARSER = new com.google.protobuf.AbstractParser<ReliquaryFilterStateNotify>() {
      @java.lang.Override
      public ReliquaryFilterStateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReliquaryFilterStateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReliquaryFilterStateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReliquaryFilterStateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReliquaryFilterStateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReliquaryFilterStateNotify_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReliquaryFilterStateNotify_ReliquaryFilterStateMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReliquaryFilterStateNotify_ReliquaryFilterStateMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n ReliquaryFilterStateNotify.proto\"\272\001\n\032R" +
      "eliquaryFilterStateNotify\022\\\n\032reliquary_f" +
      "ilter_state_map\030\n \003(\01328.ReliquaryFilterS" +
      "tateNotify.ReliquaryFilterStateMapEntry\032" +
      ">\n\034ReliquaryFilterStateMapEntry\022\013\n\003key\030\001" +
      " \001(\r\022\r\n\005value\030\002 \001(\r:\0028\001B\030\n\026emu.gingerps." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ReliquaryFilterStateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ReliquaryFilterStateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReliquaryFilterStateNotify_descriptor,
        new java.lang.String[] { "ReliquaryFilterStateMap", });
    internal_static_ReliquaryFilterStateNotify_ReliquaryFilterStateMapEntry_descriptor =
      internal_static_ReliquaryFilterStateNotify_descriptor.getNestedTypes().get(0);
    internal_static_ReliquaryFilterStateNotify_ReliquaryFilterStateMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReliquaryFilterStateNotify_ReliquaryFilterStateMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
