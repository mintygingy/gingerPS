// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CustomDungeonAbstract.proto

package emu.gingerps.net.proto;

public final class CustomDungeonAbstractOuterClass {
  private CustomDungeonAbstractOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CustomDungeonAbstractOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CustomDungeonAbstract)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3300_EJGBHGHLFPI = 7;</code>
     * @return The unk3300EJGBHGHLFPI.
     */
    int getUnk3300EJGBHGHLFPI();

    /**
     * <code>uint32 last_publish_time = 12;</code>
     * @return The lastPublishTime.
     */
    int getLastPublishTime();

    /**
     * <code>map&lt;uint32, uint32&gt; brick_statistics_map = 2;</code>
     */
    int getBrickStatisticsMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; brick_statistics_map = 2;</code>
     */
    boolean containsBrickStatisticsMap(
        int key);
    /**
     * Use {@link #getBrickStatisticsMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getBrickStatisticsMap();
    /**
     * <code>map&lt;uint32, uint32&gt; brick_statistics_map = 2;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getBrickStatisticsMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; brick_statistics_map = 2;</code>
     */

    int getBrickStatisticsMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; brick_statistics_map = 2;</code>
     */

    int getBrickStatisticsMapOrThrow(
        int key);

    /**
     * <code>uint32 first_publish_time = 8;</code>
     * @return The firstPublishTime.
     */
    int getFirstPublishTime();

    /**
     * <code>uint32 Unk3300_JPFIHKECLMF = 4;</code>
     * @return The unk3300JPFIHKECLMF.
     */
    int getUnk3300JPFIHKECLMF();
  }
  /**
   * Protobuf type {@code CustomDungeonAbstract}
   */
  public static final class CustomDungeonAbstract extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CustomDungeonAbstract)
      CustomDungeonAbstractOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CustomDungeonAbstract.newBuilder() to construct.
    private CustomDungeonAbstract(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CustomDungeonAbstract() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CustomDungeonAbstract();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CustomDungeonAbstract(
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
            case 18: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                brickStatisticsMap_ = com.google.protobuf.MapField.newMapField(
                    BrickStatisticsMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              brickStatisticsMap__ = input.readMessage(
                  BrickStatisticsMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              brickStatisticsMap_.getMutableMap().put(
                  brickStatisticsMap__.getKey(), brickStatisticsMap__.getValue());
              break;
            }
            case 32: {

              unk3300JPFIHKECLMF_ = input.readUInt32();
              break;
            }
            case 56: {

              unk3300EJGBHGHLFPI_ = input.readUInt32();
              break;
            }
            case 64: {

              firstPublishTime_ = input.readUInt32();
              break;
            }
            case 96: {

              lastPublishTime_ = input.readUInt32();
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
      return emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.internal_static_CustomDungeonAbstract_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetBrickStatisticsMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.internal_static_CustomDungeonAbstract_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract.class, emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract.Builder.class);
    }

    public static final int UNK3300_EJGBHGHLFPI_FIELD_NUMBER = 7;
    private int unk3300EJGBHGHLFPI_;
    /**
     * <code>uint32 Unk3300_EJGBHGHLFPI = 7;</code>
     * @return The unk3300EJGBHGHLFPI.
     */
    @java.lang.Override
    public int getUnk3300EJGBHGHLFPI() {
      return unk3300EJGBHGHLFPI_;
    }

    public static final int LAST_PUBLISH_TIME_FIELD_NUMBER = 12;
    private int lastPublishTime_;
    /**
     * <code>uint32 last_publish_time = 12;</code>
     * @return The lastPublishTime.
     */
    @java.lang.Override
    public int getLastPublishTime() {
      return lastPublishTime_;
    }

    public static final int BRICK_STATISTICS_MAP_FIELD_NUMBER = 2;
    private static final class BrickStatisticsMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.internal_static_CustomDungeonAbstract_BrickStatisticsMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> brickStatisticsMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetBrickStatisticsMap() {
      if (brickStatisticsMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            BrickStatisticsMapDefaultEntryHolder.defaultEntry);
      }
      return brickStatisticsMap_;
    }

    public int getBrickStatisticsMapCount() {
      return internalGetBrickStatisticsMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; brick_statistics_map = 2;</code>
     */

    @java.lang.Override
    public boolean containsBrickStatisticsMap(
        int key) {
      
      return internalGetBrickStatisticsMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getBrickStatisticsMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getBrickStatisticsMap() {
      return getBrickStatisticsMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; brick_statistics_map = 2;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getBrickStatisticsMapMap() {
      return internalGetBrickStatisticsMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; brick_statistics_map = 2;</code>
     */
    @java.lang.Override

    public int getBrickStatisticsMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetBrickStatisticsMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; brick_statistics_map = 2;</code>
     */
    @java.lang.Override

    public int getBrickStatisticsMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetBrickStatisticsMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int FIRST_PUBLISH_TIME_FIELD_NUMBER = 8;
    private int firstPublishTime_;
    /**
     * <code>uint32 first_publish_time = 8;</code>
     * @return The firstPublishTime.
     */
    @java.lang.Override
    public int getFirstPublishTime() {
      return firstPublishTime_;
    }

    public static final int UNK3300_JPFIHKECLMF_FIELD_NUMBER = 4;
    private int unk3300JPFIHKECLMF_;
    /**
     * <code>uint32 Unk3300_JPFIHKECLMF = 4;</code>
     * @return The unk3300JPFIHKECLMF.
     */
    @java.lang.Override
    public int getUnk3300JPFIHKECLMF() {
      return unk3300JPFIHKECLMF_;
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
          internalGetBrickStatisticsMap(),
          BrickStatisticsMapDefaultEntryHolder.defaultEntry,
          2);
      if (unk3300JPFIHKECLMF_ != 0) {
        output.writeUInt32(4, unk3300JPFIHKECLMF_);
      }
      if (unk3300EJGBHGHLFPI_ != 0) {
        output.writeUInt32(7, unk3300EJGBHGHLFPI_);
      }
      if (firstPublishTime_ != 0) {
        output.writeUInt32(8, firstPublishTime_);
      }
      if (lastPublishTime_ != 0) {
        output.writeUInt32(12, lastPublishTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetBrickStatisticsMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        brickStatisticsMap__ = BrickStatisticsMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(2, brickStatisticsMap__);
      }
      if (unk3300JPFIHKECLMF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, unk3300JPFIHKECLMF_);
      }
      if (unk3300EJGBHGHLFPI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, unk3300EJGBHGHLFPI_);
      }
      if (firstPublishTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, firstPublishTime_);
      }
      if (lastPublishTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, lastPublishTime_);
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
      if (!(obj instanceof emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract other = (emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract) obj;

      if (getUnk3300EJGBHGHLFPI()
          != other.getUnk3300EJGBHGHLFPI()) return false;
      if (getLastPublishTime()
          != other.getLastPublishTime()) return false;
      if (!internalGetBrickStatisticsMap().equals(
          other.internalGetBrickStatisticsMap())) return false;
      if (getFirstPublishTime()
          != other.getFirstPublishTime()) return false;
      if (getUnk3300JPFIHKECLMF()
          != other.getUnk3300JPFIHKECLMF()) return false;
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
      hash = (37 * hash) + UNK3300_EJGBHGHLFPI_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300EJGBHGHLFPI();
      hash = (37 * hash) + LAST_PUBLISH_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getLastPublishTime();
      if (!internalGetBrickStatisticsMap().getMap().isEmpty()) {
        hash = (37 * hash) + BRICK_STATISTICS_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetBrickStatisticsMap().hashCode();
      }
      hash = (37 * hash) + FIRST_PUBLISH_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getFirstPublishTime();
      hash = (37 * hash) + UNK3300_JPFIHKECLMF_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300JPFIHKECLMF();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract prototype) {
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
     * Protobuf type {@code CustomDungeonAbstract}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CustomDungeonAbstract)
        emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstractOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.internal_static_CustomDungeonAbstract_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 2:
            return internalGetBrickStatisticsMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 2:
            return internalGetMutableBrickStatisticsMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.internal_static_CustomDungeonAbstract_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract.class, emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract.newBuilder()
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
        unk3300EJGBHGHLFPI_ = 0;

        lastPublishTime_ = 0;

        internalGetMutableBrickStatisticsMap().clear();
        firstPublishTime_ = 0;

        unk3300JPFIHKECLMF_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.internal_static_CustomDungeonAbstract_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract getDefaultInstanceForType() {
        return emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract build() {
        emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract buildPartial() {
        emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract result = new emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract(this);
        int from_bitField0_ = bitField0_;
        result.unk3300EJGBHGHLFPI_ = unk3300EJGBHGHLFPI_;
        result.lastPublishTime_ = lastPublishTime_;
        result.brickStatisticsMap_ = internalGetBrickStatisticsMap();
        result.brickStatisticsMap_.makeImmutable();
        result.firstPublishTime_ = firstPublishTime_;
        result.unk3300JPFIHKECLMF_ = unk3300JPFIHKECLMF_;
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
        if (other instanceof emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract) {
          return mergeFrom((emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract other) {
        if (other == emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract.getDefaultInstance()) return this;
        if (other.getUnk3300EJGBHGHLFPI() != 0) {
          setUnk3300EJGBHGHLFPI(other.getUnk3300EJGBHGHLFPI());
        }
        if (other.getLastPublishTime() != 0) {
          setLastPublishTime(other.getLastPublishTime());
        }
        internalGetMutableBrickStatisticsMap().mergeFrom(
            other.internalGetBrickStatisticsMap());
        if (other.getFirstPublishTime() != 0) {
          setFirstPublishTime(other.getFirstPublishTime());
        }
        if (other.getUnk3300JPFIHKECLMF() != 0) {
          setUnk3300JPFIHKECLMF(other.getUnk3300JPFIHKECLMF());
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
        emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int unk3300EJGBHGHLFPI_ ;
      /**
       * <code>uint32 Unk3300_EJGBHGHLFPI = 7;</code>
       * @return The unk3300EJGBHGHLFPI.
       */
      @java.lang.Override
      public int getUnk3300EJGBHGHLFPI() {
        return unk3300EJGBHGHLFPI_;
      }
      /**
       * <code>uint32 Unk3300_EJGBHGHLFPI = 7;</code>
       * @param value The unk3300EJGBHGHLFPI to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300EJGBHGHLFPI(int value) {
        
        unk3300EJGBHGHLFPI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_EJGBHGHLFPI = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300EJGBHGHLFPI() {
        
        unk3300EJGBHGHLFPI_ = 0;
        onChanged();
        return this;
      }

      private int lastPublishTime_ ;
      /**
       * <code>uint32 last_publish_time = 12;</code>
       * @return The lastPublishTime.
       */
      @java.lang.Override
      public int getLastPublishTime() {
        return lastPublishTime_;
      }
      /**
       * <code>uint32 last_publish_time = 12;</code>
       * @param value The lastPublishTime to set.
       * @return This builder for chaining.
       */
      public Builder setLastPublishTime(int value) {
        
        lastPublishTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 last_publish_time = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearLastPublishTime() {
        
        lastPublishTime_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> brickStatisticsMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetBrickStatisticsMap() {
        if (brickStatisticsMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              BrickStatisticsMapDefaultEntryHolder.defaultEntry);
        }
        return brickStatisticsMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableBrickStatisticsMap() {
        onChanged();;
        if (brickStatisticsMap_ == null) {
          brickStatisticsMap_ = com.google.protobuf.MapField.newMapField(
              BrickStatisticsMapDefaultEntryHolder.defaultEntry);
        }
        if (!brickStatisticsMap_.isMutable()) {
          brickStatisticsMap_ = brickStatisticsMap_.copy();
        }
        return brickStatisticsMap_;
      }

      public int getBrickStatisticsMapCount() {
        return internalGetBrickStatisticsMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; brick_statistics_map = 2;</code>
       */

      @java.lang.Override
      public boolean containsBrickStatisticsMap(
          int key) {
        
        return internalGetBrickStatisticsMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getBrickStatisticsMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getBrickStatisticsMap() {
        return getBrickStatisticsMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; brick_statistics_map = 2;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getBrickStatisticsMapMap() {
        return internalGetBrickStatisticsMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; brick_statistics_map = 2;</code>
       */
      @java.lang.Override

      public int getBrickStatisticsMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetBrickStatisticsMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; brick_statistics_map = 2;</code>
       */
      @java.lang.Override

      public int getBrickStatisticsMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetBrickStatisticsMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearBrickStatisticsMap() {
        internalGetMutableBrickStatisticsMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; brick_statistics_map = 2;</code>
       */

      public Builder removeBrickStatisticsMap(
          int key) {
        
        internalGetMutableBrickStatisticsMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableBrickStatisticsMap() {
        return internalGetMutableBrickStatisticsMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; brick_statistics_map = 2;</code>
       */
      public Builder putBrickStatisticsMap(
          int key,
          int value) {
        
        
        internalGetMutableBrickStatisticsMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; brick_statistics_map = 2;</code>
       */

      public Builder putAllBrickStatisticsMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableBrickStatisticsMap().getMutableMap()
            .putAll(values);
        return this;
      }

      private int firstPublishTime_ ;
      /**
       * <code>uint32 first_publish_time = 8;</code>
       * @return The firstPublishTime.
       */
      @java.lang.Override
      public int getFirstPublishTime() {
        return firstPublishTime_;
      }
      /**
       * <code>uint32 first_publish_time = 8;</code>
       * @param value The firstPublishTime to set.
       * @return This builder for chaining.
       */
      public Builder setFirstPublishTime(int value) {
        
        firstPublishTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 first_publish_time = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearFirstPublishTime() {
        
        firstPublishTime_ = 0;
        onChanged();
        return this;
      }

      private int unk3300JPFIHKECLMF_ ;
      /**
       * <code>uint32 Unk3300_JPFIHKECLMF = 4;</code>
       * @return The unk3300JPFIHKECLMF.
       */
      @java.lang.Override
      public int getUnk3300JPFIHKECLMF() {
        return unk3300JPFIHKECLMF_;
      }
      /**
       * <code>uint32 Unk3300_JPFIHKECLMF = 4;</code>
       * @param value The unk3300JPFIHKECLMF to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300JPFIHKECLMF(int value) {
        
        unk3300JPFIHKECLMF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_JPFIHKECLMF = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300JPFIHKECLMF() {
        
        unk3300JPFIHKECLMF_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CustomDungeonAbstract)
    }

    // @@protoc_insertion_point(class_scope:CustomDungeonAbstract)
    private static final emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract();
    }

    public static emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CustomDungeonAbstract>
        PARSER = new com.google.protobuf.AbstractParser<CustomDungeonAbstract>() {
      @java.lang.Override
      public CustomDungeonAbstract parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CustomDungeonAbstract(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CustomDungeonAbstract> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CustomDungeonAbstract> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.CustomDungeonAbstractOuterClass.CustomDungeonAbstract getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CustomDungeonAbstract_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CustomDungeonAbstract_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CustomDungeonAbstract_BrickStatisticsMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CustomDungeonAbstract_BrickStatisticsMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033CustomDungeonAbstract.proto\"\221\002\n\025Custom" +
      "DungeonAbstract\022\033\n\023Unk3300_EJGBHGHLFPI\030\007" +
      " \001(\r\022\031\n\021last_publish_time\030\014 \001(\r\022L\n\024brick" +
      "_statistics_map\030\002 \003(\0132..CustomDungeonAbs" +
      "tract.BrickStatisticsMapEntry\022\032\n\022first_p" +
      "ublish_time\030\010 \001(\r\022\033\n\023Unk3300_JPFIHKECLMF" +
      "\030\004 \001(\r\0329\n\027BrickStatisticsMapEntry\022\013\n\003key" +
      "\030\001 \001(\r\022\r\n\005value\030\002 \001(\r:\0028\001B\030\n\026emu.gingerp" +
      "s.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CustomDungeonAbstract_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CustomDungeonAbstract_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CustomDungeonAbstract_descriptor,
        new java.lang.String[] { "Unk3300EJGBHGHLFPI", "LastPublishTime", "BrickStatisticsMap", "FirstPublishTime", "Unk3300JPFIHKECLMF", });
    internal_static_CustomDungeonAbstract_BrickStatisticsMapEntry_descriptor =
      internal_static_CustomDungeonAbstract_descriptor.getNestedTypes().get(0);
    internal_static_CustomDungeonAbstract_BrickStatisticsMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CustomDungeonAbstract_BrickStatisticsMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
