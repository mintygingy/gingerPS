// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ActivityGiveFriendGiftReq.proto

package emu.gingerps.net.proto;

public final class ActivityGiveFriendGiftReqOuterClass {
  private ActivityGiveFriendGiftReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ActivityGiveFriendGiftReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ActivityGiveFriendGiftReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
     */
    int getGiftNumMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
     */
    boolean containsGiftNumMap(
        int key);
    /**
     * Use {@link #getGiftNumMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getGiftNumMap();
    /**
     * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getGiftNumMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
     */

    int getGiftNumMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
     */

    int getGiftNumMapOrThrow(
        int key);

    /**
     * <code>uint32 schedule_id = 15;</code>
     * @return The scheduleId.
     */
    int getScheduleId();

    /**
     * <code>uint32 uid = 1;</code>
     * @return The uid.
     */
    int getUid();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8178;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ActivityGiveFriendGiftReq}
   */
  public static final class ActivityGiveFriendGiftReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ActivityGiveFriendGiftReq)
      ActivityGiveFriendGiftReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ActivityGiveFriendGiftReq.newBuilder() to construct.
    private ActivityGiveFriendGiftReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ActivityGiveFriendGiftReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ActivityGiveFriendGiftReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ActivityGiveFriendGiftReq(
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
            case 8: {

              uid_ = input.readUInt32();
              break;
            }
            case 82: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                giftNumMap_ = com.google.protobuf.MapField.newMapField(
                    GiftNumMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              giftNumMap__ = input.readMessage(
                  GiftNumMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              giftNumMap_.getMutableMap().put(
                  giftNumMap__.getKey(), giftNumMap__.getValue());
              break;
            }
            case 120: {

              scheduleId_ = input.readUInt32();
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
      return emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.internal_static_ActivityGiveFriendGiftReq_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 10:
          return internalGetGiftNumMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.internal_static_ActivityGiveFriendGiftReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq.class, emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq.Builder.class);
    }

    public static final int GIFT_NUM_MAP_FIELD_NUMBER = 10;
    private static final class GiftNumMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.internal_static_ActivityGiveFriendGiftReq_GiftNumMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> giftNumMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetGiftNumMap() {
      if (giftNumMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            GiftNumMapDefaultEntryHolder.defaultEntry);
      }
      return giftNumMap_;
    }

    public int getGiftNumMapCount() {
      return internalGetGiftNumMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
     */

    @java.lang.Override
    public boolean containsGiftNumMap(
        int key) {
      
      return internalGetGiftNumMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getGiftNumMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getGiftNumMap() {
      return getGiftNumMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getGiftNumMapMap() {
      return internalGetGiftNumMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
     */
    @java.lang.Override

    public int getGiftNumMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetGiftNumMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
     */
    @java.lang.Override

    public int getGiftNumMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetGiftNumMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int SCHEDULE_ID_FIELD_NUMBER = 15;
    private int scheduleId_;
    /**
     * <code>uint32 schedule_id = 15;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
    }

    public static final int UID_FIELD_NUMBER = 1;
    private int uid_;
    /**
     * <code>uint32 uid = 1;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
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
      if (uid_ != 0) {
        output.writeUInt32(1, uid_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetGiftNumMap(),
          GiftNumMapDefaultEntryHolder.defaultEntry,
          10);
      if (scheduleId_ != 0) {
        output.writeUInt32(15, scheduleId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, uid_);
      }
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetGiftNumMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        giftNumMap__ = GiftNumMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(10, giftNumMap__);
      }
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, scheduleId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq other = (emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq) obj;

      if (!internalGetGiftNumMap().equals(
          other.internalGetGiftNumMap())) return false;
      if (getScheduleId()
          != other.getScheduleId()) return false;
      if (getUid()
          != other.getUid()) return false;
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
      if (!internalGetGiftNumMap().getMap().isEmpty()) {
        hash = (37 * hash) + GIFT_NUM_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetGiftNumMap().hashCode();
      }
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq prototype) {
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
     *   CMD_ID = 8178;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ActivityGiveFriendGiftReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ActivityGiveFriendGiftReq)
        emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.internal_static_ActivityGiveFriendGiftReq_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 10:
            return internalGetGiftNumMap();
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
            return internalGetMutableGiftNumMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.internal_static_ActivityGiveFriendGiftReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq.class, emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq.newBuilder()
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
        internalGetMutableGiftNumMap().clear();
        scheduleId_ = 0;

        uid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.internal_static_ActivityGiveFriendGiftReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq build() {
        emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq buildPartial() {
        emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq result = new emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq(this);
        int from_bitField0_ = bitField0_;
        result.giftNumMap_ = internalGetGiftNumMap();
        result.giftNumMap_.makeImmutable();
        result.scheduleId_ = scheduleId_;
        result.uid_ = uid_;
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
        if (other instanceof emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq) {
          return mergeFrom((emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq other) {
        if (other == emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq.getDefaultInstance()) return this;
        internalGetMutableGiftNumMap().mergeFrom(
            other.internalGetGiftNumMap());
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
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
        emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq) e.getUnfinishedMessage();
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
          java.lang.Integer, java.lang.Integer> giftNumMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetGiftNumMap() {
        if (giftNumMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              GiftNumMapDefaultEntryHolder.defaultEntry);
        }
        return giftNumMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableGiftNumMap() {
        onChanged();;
        if (giftNumMap_ == null) {
          giftNumMap_ = com.google.protobuf.MapField.newMapField(
              GiftNumMapDefaultEntryHolder.defaultEntry);
        }
        if (!giftNumMap_.isMutable()) {
          giftNumMap_ = giftNumMap_.copy();
        }
        return giftNumMap_;
      }

      public int getGiftNumMapCount() {
        return internalGetGiftNumMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
       */

      @java.lang.Override
      public boolean containsGiftNumMap(
          int key) {
        
        return internalGetGiftNumMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getGiftNumMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getGiftNumMap() {
        return getGiftNumMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getGiftNumMapMap() {
        return internalGetGiftNumMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
       */
      @java.lang.Override

      public int getGiftNumMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetGiftNumMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
       */
      @java.lang.Override

      public int getGiftNumMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetGiftNumMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearGiftNumMap() {
        internalGetMutableGiftNumMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
       */

      public Builder removeGiftNumMap(
          int key) {
        
        internalGetMutableGiftNumMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableGiftNumMap() {
        return internalGetMutableGiftNumMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
       */
      public Builder putGiftNumMap(
          int key,
          int value) {
        
        
        internalGetMutableGiftNumMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
       */

      public Builder putAllGiftNumMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableGiftNumMap().getMutableMap()
            .putAll(values);
        return this;
      }

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 15;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 15;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {
        
        scheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        
        scheduleId_ = 0;
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 1;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 1;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ActivityGiveFriendGiftReq)
    }

    // @@protoc_insertion_point(class_scope:ActivityGiveFriendGiftReq)
    private static final emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq();
    }

    public static emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ActivityGiveFriendGiftReq>
        PARSER = new com.google.protobuf.AbstractParser<ActivityGiveFriendGiftReq>() {
      @java.lang.Override
      public ActivityGiveFriendGiftReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ActivityGiveFriendGiftReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ActivityGiveFriendGiftReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ActivityGiveFriendGiftReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivityGiveFriendGiftReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActivityGiveFriendGiftReq_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivityGiveFriendGiftReq_GiftNumMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActivityGiveFriendGiftReq_GiftNumMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037ActivityGiveFriendGiftReq.proto\"\262\001\n\031Ac" +
      "tivityGiveFriendGiftReq\022@\n\014gift_num_map\030" +
      "\n \003(\0132*.ActivityGiveFriendGiftReq.GiftNu" +
      "mMapEntry\022\023\n\013schedule_id\030\017 \001(\r\022\013\n\003uid\030\001 " +
      "\001(\r\0321\n\017GiftNumMapEntry\022\013\n\003key\030\001 \001(\r\022\r\n\005v" +
      "alue\030\002 \001(\r:\0028\001B\030\n\026emu.gingerps.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ActivityGiveFriendGiftReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ActivityGiveFriendGiftReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActivityGiveFriendGiftReq_descriptor,
        new java.lang.String[] { "GiftNumMap", "ScheduleId", "Uid", });
    internal_static_ActivityGiveFriendGiftReq_GiftNumMapEntry_descriptor =
      internal_static_ActivityGiveFriendGiftReq_descriptor.getNestedTypes().get(0);
    internal_static_ActivityGiveFriendGiftReq_GiftNumMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActivityGiveFriendGiftReq_GiftNumMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
