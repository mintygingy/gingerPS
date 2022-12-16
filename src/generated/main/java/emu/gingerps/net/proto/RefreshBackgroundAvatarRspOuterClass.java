// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RefreshBackgroundAvatarRsp.proto

package emu.gingerps.net.proto;

public final class RefreshBackgroundAvatarRspOuterClass {
  private RefreshBackgroundAvatarRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RefreshBackgroundAvatarRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RefreshBackgroundAvatarRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint64, uint32&gt; hp_full_time_map = 4;</code>
     */
    int getHpFullTimeMapCount();
    /**
     * <code>map&lt;uint64, uint32&gt; hp_full_time_map = 4;</code>
     */
    boolean containsHpFullTimeMap(
        long key);
    /**
     * Use {@link #getHpFullTimeMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Long, java.lang.Integer>
    getHpFullTimeMap();
    /**
     * <code>map&lt;uint64, uint32&gt; hp_full_time_map = 4;</code>
     */
    java.util.Map<java.lang.Long, java.lang.Integer>
    getHpFullTimeMapMap();
    /**
     * <code>map&lt;uint64, uint32&gt; hp_full_time_map = 4;</code>
     */

    int getHpFullTimeMapOrDefault(
        long key,
        int defaultValue);
    /**
     * <code>map&lt;uint64, uint32&gt; hp_full_time_map = 4;</code>
     */

    int getHpFullTimeMapOrThrow(
        long key);

    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 1744;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code RefreshBackgroundAvatarRsp}
   */
  public static final class RefreshBackgroundAvatarRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RefreshBackgroundAvatarRsp)
      RefreshBackgroundAvatarRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RefreshBackgroundAvatarRsp.newBuilder() to construct.
    private RefreshBackgroundAvatarRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RefreshBackgroundAvatarRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RefreshBackgroundAvatarRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RefreshBackgroundAvatarRsp(
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
            case 34: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                hpFullTimeMap_ = com.google.protobuf.MapField.newMapField(
                    HpFullTimeMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Long, java.lang.Integer>
              hpFullTimeMap__ = input.readMessage(
                  HpFullTimeMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              hpFullTimeMap_.getMutableMap().put(
                  hpFullTimeMap__.getKey(), hpFullTimeMap__.getValue());
              break;
            }
            case 88: {

              retcode_ = input.readInt32();
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
      return emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.internal_static_RefreshBackgroundAvatarRsp_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetHpFullTimeMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.internal_static_RefreshBackgroundAvatarRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp.class, emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp.Builder.class);
    }

    public static final int HP_FULL_TIME_MAP_FIELD_NUMBER = 4;
    private static final class HpFullTimeMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Long, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Long, java.lang.Integer>newDefaultInstance(
                  emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.internal_static_RefreshBackgroundAvatarRsp_HpFullTimeMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT64,
                  0L,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Long, java.lang.Integer> hpFullTimeMap_;
    private com.google.protobuf.MapField<java.lang.Long, java.lang.Integer>
    internalGetHpFullTimeMap() {
      if (hpFullTimeMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            HpFullTimeMapDefaultEntryHolder.defaultEntry);
      }
      return hpFullTimeMap_;
    }

    public int getHpFullTimeMapCount() {
      return internalGetHpFullTimeMap().getMap().size();
    }
    /**
     * <code>map&lt;uint64, uint32&gt; hp_full_time_map = 4;</code>
     */

    @java.lang.Override
    public boolean containsHpFullTimeMap(
        long key) {
      
      return internalGetHpFullTimeMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getHpFullTimeMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Long, java.lang.Integer> getHpFullTimeMap() {
      return getHpFullTimeMapMap();
    }
    /**
     * <code>map&lt;uint64, uint32&gt; hp_full_time_map = 4;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Long, java.lang.Integer> getHpFullTimeMapMap() {
      return internalGetHpFullTimeMap().getMap();
    }
    /**
     * <code>map&lt;uint64, uint32&gt; hp_full_time_map = 4;</code>
     */
    @java.lang.Override

    public int getHpFullTimeMapOrDefault(
        long key,
        int defaultValue) {
      
      java.util.Map<java.lang.Long, java.lang.Integer> map =
          internalGetHpFullTimeMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint64, uint32&gt; hp_full_time_map = 4;</code>
     */
    @java.lang.Override

    public int getHpFullTimeMapOrThrow(
        long key) {
      
      java.util.Map<java.lang.Long, java.lang.Integer> map =
          internalGetHpFullTimeMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int RETCODE_FIELD_NUMBER = 11;
    private int retcode_;
    /**
     * <code>int32 retcode = 11;</code>
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
      com.google.protobuf.GeneratedMessageV3
        .serializeLongMapTo(
          output,
          internalGetHpFullTimeMap(),
          HpFullTimeMapDefaultEntryHolder.defaultEntry,
          4);
      if (retcode_ != 0) {
        output.writeInt32(11, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Long, java.lang.Integer> entry
           : internalGetHpFullTimeMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Long, java.lang.Integer>
        hpFullTimeMap__ = HpFullTimeMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(4, hpFullTimeMap__);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, retcode_);
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
      if (!(obj instanceof emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp other = (emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp) obj;

      if (!internalGetHpFullTimeMap().equals(
          other.internalGetHpFullTimeMap())) return false;
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
      if (!internalGetHpFullTimeMap().getMap().isEmpty()) {
        hash = (37 * hash) + HP_FULL_TIME_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetHpFullTimeMap().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp prototype) {
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
     *   CMD_ID = 1744;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code RefreshBackgroundAvatarRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RefreshBackgroundAvatarRsp)
        emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.internal_static_RefreshBackgroundAvatarRsp_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 4:
            return internalGetHpFullTimeMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 4:
            return internalGetMutableHpFullTimeMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.internal_static_RefreshBackgroundAvatarRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp.class, emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp.newBuilder()
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
        internalGetMutableHpFullTimeMap().clear();
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.internal_static_RefreshBackgroundAvatarRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp build() {
        emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp buildPartial() {
        emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp result = new emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp(this);
        int from_bitField0_ = bitField0_;
        result.hpFullTimeMap_ = internalGetHpFullTimeMap();
        result.hpFullTimeMap_.makeImmutable();
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
        if (other instanceof emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp) {
          return mergeFrom((emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp other) {
        if (other == emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp.getDefaultInstance()) return this;
        internalGetMutableHpFullTimeMap().mergeFrom(
            other.internalGetHpFullTimeMap());
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
        emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp) e.getUnfinishedMessage();
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
          java.lang.Long, java.lang.Integer> hpFullTimeMap_;
      private com.google.protobuf.MapField<java.lang.Long, java.lang.Integer>
      internalGetHpFullTimeMap() {
        if (hpFullTimeMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              HpFullTimeMapDefaultEntryHolder.defaultEntry);
        }
        return hpFullTimeMap_;
      }
      private com.google.protobuf.MapField<java.lang.Long, java.lang.Integer>
      internalGetMutableHpFullTimeMap() {
        onChanged();;
        if (hpFullTimeMap_ == null) {
          hpFullTimeMap_ = com.google.protobuf.MapField.newMapField(
              HpFullTimeMapDefaultEntryHolder.defaultEntry);
        }
        if (!hpFullTimeMap_.isMutable()) {
          hpFullTimeMap_ = hpFullTimeMap_.copy();
        }
        return hpFullTimeMap_;
      }

      public int getHpFullTimeMapCount() {
        return internalGetHpFullTimeMap().getMap().size();
      }
      /**
       * <code>map&lt;uint64, uint32&gt; hp_full_time_map = 4;</code>
       */

      @java.lang.Override
      public boolean containsHpFullTimeMap(
          long key) {
        
        return internalGetHpFullTimeMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getHpFullTimeMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Long, java.lang.Integer> getHpFullTimeMap() {
        return getHpFullTimeMapMap();
      }
      /**
       * <code>map&lt;uint64, uint32&gt; hp_full_time_map = 4;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Long, java.lang.Integer> getHpFullTimeMapMap() {
        return internalGetHpFullTimeMap().getMap();
      }
      /**
       * <code>map&lt;uint64, uint32&gt; hp_full_time_map = 4;</code>
       */
      @java.lang.Override

      public int getHpFullTimeMapOrDefault(
          long key,
          int defaultValue) {
        
        java.util.Map<java.lang.Long, java.lang.Integer> map =
            internalGetHpFullTimeMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint64, uint32&gt; hp_full_time_map = 4;</code>
       */
      @java.lang.Override

      public int getHpFullTimeMapOrThrow(
          long key) {
        
        java.util.Map<java.lang.Long, java.lang.Integer> map =
            internalGetHpFullTimeMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearHpFullTimeMap() {
        internalGetMutableHpFullTimeMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint64, uint32&gt; hp_full_time_map = 4;</code>
       */

      public Builder removeHpFullTimeMap(
          long key) {
        
        internalGetMutableHpFullTimeMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Long, java.lang.Integer>
      getMutableHpFullTimeMap() {
        return internalGetMutableHpFullTimeMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint64, uint32&gt; hp_full_time_map = 4;</code>
       */
      public Builder putHpFullTimeMap(
          long key,
          int value) {
        
        
        internalGetMutableHpFullTimeMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint64, uint32&gt; hp_full_time_map = 4;</code>
       */

      public Builder putAllHpFullTimeMap(
          java.util.Map<java.lang.Long, java.lang.Integer> values) {
        internalGetMutableHpFullTimeMap().getMutableMap()
            .putAll(values);
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 11;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 11;</code>
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


      // @@protoc_insertion_point(builder_scope:RefreshBackgroundAvatarRsp)
    }

    // @@protoc_insertion_point(class_scope:RefreshBackgroundAvatarRsp)
    private static final emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp();
    }

    public static emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RefreshBackgroundAvatarRsp>
        PARSER = new com.google.protobuf.AbstractParser<RefreshBackgroundAvatarRsp>() {
      @java.lang.Override
      public RefreshBackgroundAvatarRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RefreshBackgroundAvatarRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RefreshBackgroundAvatarRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RefreshBackgroundAvatarRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.RefreshBackgroundAvatarRspOuterClass.RefreshBackgroundAvatarRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RefreshBackgroundAvatarRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RefreshBackgroundAvatarRsp_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RefreshBackgroundAvatarRsp_HpFullTimeMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RefreshBackgroundAvatarRsp_HpFullTimeMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n RefreshBackgroundAvatarRsp.proto\"\255\001\n\032R" +
      "efreshBackgroundAvatarRsp\022H\n\020hp_full_tim" +
      "e_map\030\004 \003(\0132..RefreshBackgroundAvatarRsp" +
      ".HpFullTimeMapEntry\022\017\n\007retcode\030\013 \001(\005\0324\n\022" +
      "HpFullTimeMapEntry\022\013\n\003key\030\001 \001(\004\022\r\n\005value" +
      "\030\002 \001(\r:\0028\001B\033\n\031emu.gingerps.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RefreshBackgroundAvatarRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RefreshBackgroundAvatarRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RefreshBackgroundAvatarRsp_descriptor,
        new java.lang.String[] { "HpFullTimeMap", "Retcode", });
    internal_static_RefreshBackgroundAvatarRsp_HpFullTimeMapEntry_descriptor =
      internal_static_RefreshBackgroundAvatarRsp_descriptor.getNestedTypes().get(0);
    internal_static_RefreshBackgroundAvatarRsp_HpFullTimeMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RefreshBackgroundAvatarRsp_HpFullTimeMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
