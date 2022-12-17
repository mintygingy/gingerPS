// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MoonfinTrialActivityDetailInfo.proto

package emu.gingerps.net.proto;

public final class MoonfinTrialActivityDetailInfoOuterClass {
  private MoonfinTrialActivityDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MoonfinTrialActivityDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MoonfinTrialActivityDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 special_fish_count = 13;</code>
     * @return The specialFishCount.
     */
    int getSpecialFishCount();

    /**
     * <code>map&lt;uint32, .MoonfinTrialLevelInfo&gt; level_info_map = 5;</code>
     */
    int getLevelInfoMapCount();
    /**
     * <code>map&lt;uint32, .MoonfinTrialLevelInfo&gt; level_info_map = 5;</code>
     */
    boolean containsLevelInfoMap(
        int key);
    /**
     * Use {@link #getLevelInfoMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo>
    getLevelInfoMap();
    /**
     * <code>map&lt;uint32, .MoonfinTrialLevelInfo&gt; level_info_map = 5;</code>
     */
    java.util.Map<java.lang.Integer, emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo>
    getLevelInfoMapMap();
    /**
     * <code>map&lt;uint32, .MoonfinTrialLevelInfo&gt; level_info_map = 5;</code>
     */

    emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo getLevelInfoMapOrDefault(
        int key,
        emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo defaultValue);
    /**
     * <code>map&lt;uint32, .MoonfinTrialLevelInfo&gt; level_info_map = 5;</code>
     */

    emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo getLevelInfoMapOrThrow(
        int key);
  }
  /**
   * Protobuf type {@code MoonfinTrialActivityDetailInfo}
   */
  public static final class MoonfinTrialActivityDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MoonfinTrialActivityDetailInfo)
      MoonfinTrialActivityDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MoonfinTrialActivityDetailInfo.newBuilder() to construct.
    private MoonfinTrialActivityDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MoonfinTrialActivityDetailInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MoonfinTrialActivityDetailInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MoonfinTrialActivityDetailInfo(
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
            case 42: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                levelInfoMap_ = com.google.protobuf.MapField.newMapField(
                    LevelInfoMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo>
              levelInfoMap__ = input.readMessage(
                  LevelInfoMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              levelInfoMap_.getMutableMap().put(
                  levelInfoMap__.getKey(), levelInfoMap__.getValue());
              break;
            }
            case 104: {

              specialFishCount_ = input.readUInt32();
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
      return emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.internal_static_MoonfinTrialActivityDetailInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 5:
          return internalGetLevelInfoMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.internal_static_MoonfinTrialActivityDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo.class, emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo.Builder.class);
    }

    public static final int SPECIAL_FISH_COUNT_FIELD_NUMBER = 13;
    private int specialFishCount_;
    /**
     * <code>uint32 special_fish_count = 13;</code>
     * @return The specialFishCount.
     */
    @java.lang.Override
    public int getSpecialFishCount() {
      return specialFishCount_;
    }

    public static final int LEVEL_INFO_MAP_FIELD_NUMBER = 5;
    private static final class LevelInfoMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo>newDefaultInstance(
                  emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.internal_static_MoonfinTrialActivityDetailInfo_LevelInfoMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo.getDefaultInstance());
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo> levelInfoMap_;
    private com.google.protobuf.MapField<java.lang.Integer, emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo>
    internalGetLevelInfoMap() {
      if (levelInfoMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            LevelInfoMapDefaultEntryHolder.defaultEntry);
      }
      return levelInfoMap_;
    }

    public int getLevelInfoMapCount() {
      return internalGetLevelInfoMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .MoonfinTrialLevelInfo&gt; level_info_map = 5;</code>
     */

    @java.lang.Override
    public boolean containsLevelInfoMap(
        int key) {
      
      return internalGetLevelInfoMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getLevelInfoMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo> getLevelInfoMap() {
      return getLevelInfoMapMap();
    }
    /**
     * <code>map&lt;uint32, .MoonfinTrialLevelInfo&gt; level_info_map = 5;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo> getLevelInfoMapMap() {
      return internalGetLevelInfoMap().getMap();
    }
    /**
     * <code>map&lt;uint32, .MoonfinTrialLevelInfo&gt; level_info_map = 5;</code>
     */
    @java.lang.Override

    public emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo getLevelInfoMapOrDefault(
        int key,
        emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo defaultValue) {
      
      java.util.Map<java.lang.Integer, emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo> map =
          internalGetLevelInfoMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .MoonfinTrialLevelInfo&gt; level_info_map = 5;</code>
     */
    @java.lang.Override

    public emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo getLevelInfoMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo> map =
          internalGetLevelInfoMap().getMap();
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
          internalGetLevelInfoMap(),
          LevelInfoMapDefaultEntryHolder.defaultEntry,
          5);
      if (specialFishCount_ != 0) {
        output.writeUInt32(13, specialFishCount_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo> entry
           : internalGetLevelInfoMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo>
        levelInfoMap__ = LevelInfoMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(5, levelInfoMap__);
      }
      if (specialFishCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, specialFishCount_);
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
      if (!(obj instanceof emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo other = (emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo) obj;

      if (getSpecialFishCount()
          != other.getSpecialFishCount()) return false;
      if (!internalGetLevelInfoMap().equals(
          other.internalGetLevelInfoMap())) return false;
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
      hash = (37 * hash) + SPECIAL_FISH_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getSpecialFishCount();
      if (!internalGetLevelInfoMap().getMap().isEmpty()) {
        hash = (37 * hash) + LEVEL_INFO_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetLevelInfoMap().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo prototype) {
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
     * Protobuf type {@code MoonfinTrialActivityDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MoonfinTrialActivityDetailInfo)
        emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.internal_static_MoonfinTrialActivityDetailInfo_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 5:
            return internalGetLevelInfoMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 5:
            return internalGetMutableLevelInfoMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.internal_static_MoonfinTrialActivityDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo.class, emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo.newBuilder()
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
        specialFishCount_ = 0;

        internalGetMutableLevelInfoMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.internal_static_MoonfinTrialActivityDetailInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo build() {
        emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo buildPartial() {
        emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo result = new emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo(this);
        int from_bitField0_ = bitField0_;
        result.specialFishCount_ = specialFishCount_;
        result.levelInfoMap_ = internalGetLevelInfoMap();
        result.levelInfoMap_.makeImmutable();
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
        if (other instanceof emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo) {
          return mergeFrom((emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo other) {
        if (other == emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo.getDefaultInstance()) return this;
        if (other.getSpecialFishCount() != 0) {
          setSpecialFishCount(other.getSpecialFishCount());
        }
        internalGetMutableLevelInfoMap().mergeFrom(
            other.internalGetLevelInfoMap());
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
        emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int specialFishCount_ ;
      /**
       * <code>uint32 special_fish_count = 13;</code>
       * @return The specialFishCount.
       */
      @java.lang.Override
      public int getSpecialFishCount() {
        return specialFishCount_;
      }
      /**
       * <code>uint32 special_fish_count = 13;</code>
       * @param value The specialFishCount to set.
       * @return This builder for chaining.
       */
      public Builder setSpecialFishCount(int value) {
        
        specialFishCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 special_fish_count = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearSpecialFishCount() {
        
        specialFishCount_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo> levelInfoMap_;
      private com.google.protobuf.MapField<java.lang.Integer, emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo>
      internalGetLevelInfoMap() {
        if (levelInfoMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              LevelInfoMapDefaultEntryHolder.defaultEntry);
        }
        return levelInfoMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo>
      internalGetMutableLevelInfoMap() {
        onChanged();;
        if (levelInfoMap_ == null) {
          levelInfoMap_ = com.google.protobuf.MapField.newMapField(
              LevelInfoMapDefaultEntryHolder.defaultEntry);
        }
        if (!levelInfoMap_.isMutable()) {
          levelInfoMap_ = levelInfoMap_.copy();
        }
        return levelInfoMap_;
      }

      public int getLevelInfoMapCount() {
        return internalGetLevelInfoMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, .MoonfinTrialLevelInfo&gt; level_info_map = 5;</code>
       */

      @java.lang.Override
      public boolean containsLevelInfoMap(
          int key) {
        
        return internalGetLevelInfoMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getLevelInfoMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo> getLevelInfoMap() {
        return getLevelInfoMapMap();
      }
      /**
       * <code>map&lt;uint32, .MoonfinTrialLevelInfo&gt; level_info_map = 5;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo> getLevelInfoMapMap() {
        return internalGetLevelInfoMap().getMap();
      }
      /**
       * <code>map&lt;uint32, .MoonfinTrialLevelInfo&gt; level_info_map = 5;</code>
       */
      @java.lang.Override

      public emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo getLevelInfoMapOrDefault(
          int key,
          emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo defaultValue) {
        
        java.util.Map<java.lang.Integer, emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo> map =
            internalGetLevelInfoMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .MoonfinTrialLevelInfo&gt; level_info_map = 5;</code>
       */
      @java.lang.Override

      public emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo getLevelInfoMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo> map =
            internalGetLevelInfoMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearLevelInfoMap() {
        internalGetMutableLevelInfoMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .MoonfinTrialLevelInfo&gt; level_info_map = 5;</code>
       */

      public Builder removeLevelInfoMap(
          int key) {
        
        internalGetMutableLevelInfoMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo>
      getMutableLevelInfoMap() {
        return internalGetMutableLevelInfoMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, .MoonfinTrialLevelInfo&gt; level_info_map = 5;</code>
       */
      public Builder putLevelInfoMap(
          int key,
          emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo value) {
        
        if (value == null) { throw new java.lang.NullPointerException(); }
        internalGetMutableLevelInfoMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, .MoonfinTrialLevelInfo&gt; level_info_map = 5;</code>
       */

      public Builder putAllLevelInfoMap(
          java.util.Map<java.lang.Integer, emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.MoonfinTrialLevelInfo> values) {
        internalGetMutableLevelInfoMap().getMutableMap()
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


      // @@protoc_insertion_point(builder_scope:MoonfinTrialActivityDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:MoonfinTrialActivityDetailInfo)
    private static final emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo();
    }

    public static emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MoonfinTrialActivityDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<MoonfinTrialActivityDetailInfo>() {
      @java.lang.Override
      public MoonfinTrialActivityDetailInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MoonfinTrialActivityDetailInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MoonfinTrialActivityDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MoonfinTrialActivityDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.MoonfinTrialActivityDetailInfoOuterClass.MoonfinTrialActivityDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MoonfinTrialActivityDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MoonfinTrialActivityDetailInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MoonfinTrialActivityDetailInfo_LevelInfoMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MoonfinTrialActivityDetailInfo_LevelInfoMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$MoonfinTrialActivityDetailInfo.proto\032\033" +
      "MoonfinTrialLevelInfo.proto\"\324\001\n\036MoonfinT" +
      "rialActivityDetailInfo\022\032\n\022special_fish_c" +
      "ount\030\r \001(\r\022I\n\016level_info_map\030\005 \003(\01321.Moo" +
      "nfinTrialActivityDetailInfo.LevelInfoMap" +
      "Entry\032K\n\021LevelInfoMapEntry\022\013\n\003key\030\001 \001(\r\022" +
      "%\n\005value\030\002 \001(\0132\026.MoonfinTrialLevelInfo:\002" +
      "8\001B\030\n\026emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.getDescriptor(),
        });
    internal_static_MoonfinTrialActivityDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MoonfinTrialActivityDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MoonfinTrialActivityDetailInfo_descriptor,
        new java.lang.String[] { "SpecialFishCount", "LevelInfoMap", });
    internal_static_MoonfinTrialActivityDetailInfo_LevelInfoMapEntry_descriptor =
      internal_static_MoonfinTrialActivityDetailInfo_descriptor.getNestedTypes().get(0);
    internal_static_MoonfinTrialActivityDetailInfo_LevelInfoMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MoonfinTrialActivityDetailInfo_LevelInfoMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.gingerps.net.proto.MoonfinTrialLevelInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
