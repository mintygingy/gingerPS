// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TowerFloorRecordChangeNotify.proto

package emu.gingerps.net.proto;

public final class TowerFloorRecordChangeNotifyOuterClass {
  private TowerFloorRecordChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TowerFloorRecordChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TowerFloorRecordChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_finished_entrance_floor = 4;</code>
     * @return The isFinishedEntranceFloor.
     */
    boolean getIsFinishedEntranceFloor();

    /**
     * <code>repeated .TowerFloorRecord tower_floor_record_list = 15;</code>
     */
    java.util.List<emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord> 
        getTowerFloorRecordListList();
    /**
     * <code>repeated .TowerFloorRecord tower_floor_record_list = 15;</code>
     */
    emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord getTowerFloorRecordList(int index);
    /**
     * <code>repeated .TowerFloorRecord tower_floor_record_list = 15;</code>
     */
    int getTowerFloorRecordListCount();
    /**
     * <code>repeated .TowerFloorRecord tower_floor_record_list = 15;</code>
     */
    java.util.List<? extends emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder> 
        getTowerFloorRecordListOrBuilderList();
    /**
     * <code>repeated .TowerFloorRecord tower_floor_record_list = 15;</code>
     */
    emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder getTowerFloorRecordListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 2430;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code TowerFloorRecordChangeNotify}
   */
  public static final class TowerFloorRecordChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TowerFloorRecordChangeNotify)
      TowerFloorRecordChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TowerFloorRecordChangeNotify.newBuilder() to construct.
    private TowerFloorRecordChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TowerFloorRecordChangeNotify() {
      towerFloorRecordList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TowerFloorRecordChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TowerFloorRecordChangeNotify(
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
            case 32: {

              isFinishedEntranceFloor_ = input.readBool();
              break;
            }
            case 122: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                towerFloorRecordList_ = new java.util.ArrayList<emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord>();
                mutable_bitField0_ |= 0x00000001;
              }
              towerFloorRecordList_.add(
                  input.readMessage(emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          towerFloorRecordList_ = java.util.Collections.unmodifiableList(towerFloorRecordList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.internal_static_TowerFloorRecordChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.internal_static_TowerFloorRecordChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify.class, emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify.Builder.class);
    }

    public static final int IS_FINISHED_ENTRANCE_FLOOR_FIELD_NUMBER = 4;
    private boolean isFinishedEntranceFloor_;
    /**
     * <code>bool is_finished_entrance_floor = 4;</code>
     * @return The isFinishedEntranceFloor.
     */
    @java.lang.Override
    public boolean getIsFinishedEntranceFloor() {
      return isFinishedEntranceFloor_;
    }

    public static final int TOWER_FLOOR_RECORD_LIST_FIELD_NUMBER = 15;
    private java.util.List<emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord> towerFloorRecordList_;
    /**
     * <code>repeated .TowerFloorRecord tower_floor_record_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord> getTowerFloorRecordListList() {
      return towerFloorRecordList_;
    }
    /**
     * <code>repeated .TowerFloorRecord tower_floor_record_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder> 
        getTowerFloorRecordListOrBuilderList() {
      return towerFloorRecordList_;
    }
    /**
     * <code>repeated .TowerFloorRecord tower_floor_record_list = 15;</code>
     */
    @java.lang.Override
    public int getTowerFloorRecordListCount() {
      return towerFloorRecordList_.size();
    }
    /**
     * <code>repeated .TowerFloorRecord tower_floor_record_list = 15;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord getTowerFloorRecordList(int index) {
      return towerFloorRecordList_.get(index);
    }
    /**
     * <code>repeated .TowerFloorRecord tower_floor_record_list = 15;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder getTowerFloorRecordListOrBuilder(
        int index) {
      return towerFloorRecordList_.get(index);
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
      if (isFinishedEntranceFloor_ != false) {
        output.writeBool(4, isFinishedEntranceFloor_);
      }
      for (int i = 0; i < towerFloorRecordList_.size(); i++) {
        output.writeMessage(15, towerFloorRecordList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isFinishedEntranceFloor_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isFinishedEntranceFloor_);
      }
      for (int i = 0; i < towerFloorRecordList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, towerFloorRecordList_.get(i));
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
      if (!(obj instanceof emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify other = (emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify) obj;

      if (getIsFinishedEntranceFloor()
          != other.getIsFinishedEntranceFloor()) return false;
      if (!getTowerFloorRecordListList()
          .equals(other.getTowerFloorRecordListList())) return false;
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
      hash = (37 * hash) + IS_FINISHED_ENTRANCE_FLOOR_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinishedEntranceFloor());
      if (getTowerFloorRecordListCount() > 0) {
        hash = (37 * hash) + TOWER_FLOOR_RECORD_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getTowerFloorRecordListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify prototype) {
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
     *   CMD_ID = 2430;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code TowerFloorRecordChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TowerFloorRecordChangeNotify)
        emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.internal_static_TowerFloorRecordChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.internal_static_TowerFloorRecordChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify.class, emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify.newBuilder()
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
          getTowerFloorRecordListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isFinishedEntranceFloor_ = false;

        if (towerFloorRecordListBuilder_ == null) {
          towerFloorRecordList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          towerFloorRecordListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.internal_static_TowerFloorRecordChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify build() {
        emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify buildPartial() {
        emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify result = new emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify(this);
        int from_bitField0_ = bitField0_;
        result.isFinishedEntranceFloor_ = isFinishedEntranceFloor_;
        if (towerFloorRecordListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            towerFloorRecordList_ = java.util.Collections.unmodifiableList(towerFloorRecordList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.towerFloorRecordList_ = towerFloorRecordList_;
        } else {
          result.towerFloorRecordList_ = towerFloorRecordListBuilder_.build();
        }
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
        if (other instanceof emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify) {
          return mergeFrom((emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify other) {
        if (other == emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify.getDefaultInstance()) return this;
        if (other.getIsFinishedEntranceFloor() != false) {
          setIsFinishedEntranceFloor(other.getIsFinishedEntranceFloor());
        }
        if (towerFloorRecordListBuilder_ == null) {
          if (!other.towerFloorRecordList_.isEmpty()) {
            if (towerFloorRecordList_.isEmpty()) {
              towerFloorRecordList_ = other.towerFloorRecordList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureTowerFloorRecordListIsMutable();
              towerFloorRecordList_.addAll(other.towerFloorRecordList_);
            }
            onChanged();
          }
        } else {
          if (!other.towerFloorRecordList_.isEmpty()) {
            if (towerFloorRecordListBuilder_.isEmpty()) {
              towerFloorRecordListBuilder_.dispose();
              towerFloorRecordListBuilder_ = null;
              towerFloorRecordList_ = other.towerFloorRecordList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              towerFloorRecordListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getTowerFloorRecordListFieldBuilder() : null;
            } else {
              towerFloorRecordListBuilder_.addAllMessages(other.towerFloorRecordList_);
            }
          }
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
        emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean isFinishedEntranceFloor_ ;
      /**
       * <code>bool is_finished_entrance_floor = 4;</code>
       * @return The isFinishedEntranceFloor.
       */
      @java.lang.Override
      public boolean getIsFinishedEntranceFloor() {
        return isFinishedEntranceFloor_;
      }
      /**
       * <code>bool is_finished_entrance_floor = 4;</code>
       * @param value The isFinishedEntranceFloor to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinishedEntranceFloor(boolean value) {
        
        isFinishedEntranceFloor_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finished_entrance_floor = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinishedEntranceFloor() {
        
        isFinishedEntranceFloor_ = false;
        onChanged();
        return this;
      }

      private java.util.List<emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord> towerFloorRecordList_ =
        java.util.Collections.emptyList();
      private void ensureTowerFloorRecordListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          towerFloorRecordList_ = new java.util.ArrayList<emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord>(towerFloorRecordList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord, emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord.Builder, emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder> towerFloorRecordListBuilder_;

      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 15;</code>
       */
      public java.util.List<emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord> getTowerFloorRecordListList() {
        if (towerFloorRecordListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(towerFloorRecordList_);
        } else {
          return towerFloorRecordListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 15;</code>
       */
      public int getTowerFloorRecordListCount() {
        if (towerFloorRecordListBuilder_ == null) {
          return towerFloorRecordList_.size();
        } else {
          return towerFloorRecordListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 15;</code>
       */
      public emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord getTowerFloorRecordList(int index) {
        if (towerFloorRecordListBuilder_ == null) {
          return towerFloorRecordList_.get(index);
        } else {
          return towerFloorRecordListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 15;</code>
       */
      public Builder setTowerFloorRecordList(
          int index, emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord value) {
        if (towerFloorRecordListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTowerFloorRecordListIsMutable();
          towerFloorRecordList_.set(index, value);
          onChanged();
        } else {
          towerFloorRecordListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 15;</code>
       */
      public Builder setTowerFloorRecordList(
          int index, emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord.Builder builderForValue) {
        if (towerFloorRecordListBuilder_ == null) {
          ensureTowerFloorRecordListIsMutable();
          towerFloorRecordList_.set(index, builderForValue.build());
          onChanged();
        } else {
          towerFloorRecordListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 15;</code>
       */
      public Builder addTowerFloorRecordList(emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord value) {
        if (towerFloorRecordListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTowerFloorRecordListIsMutable();
          towerFloorRecordList_.add(value);
          onChanged();
        } else {
          towerFloorRecordListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 15;</code>
       */
      public Builder addTowerFloorRecordList(
          int index, emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord value) {
        if (towerFloorRecordListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTowerFloorRecordListIsMutable();
          towerFloorRecordList_.add(index, value);
          onChanged();
        } else {
          towerFloorRecordListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 15;</code>
       */
      public Builder addTowerFloorRecordList(
          emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord.Builder builderForValue) {
        if (towerFloorRecordListBuilder_ == null) {
          ensureTowerFloorRecordListIsMutable();
          towerFloorRecordList_.add(builderForValue.build());
          onChanged();
        } else {
          towerFloorRecordListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 15;</code>
       */
      public Builder addTowerFloorRecordList(
          int index, emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord.Builder builderForValue) {
        if (towerFloorRecordListBuilder_ == null) {
          ensureTowerFloorRecordListIsMutable();
          towerFloorRecordList_.add(index, builderForValue.build());
          onChanged();
        } else {
          towerFloorRecordListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 15;</code>
       */
      public Builder addAllTowerFloorRecordList(
          java.lang.Iterable<? extends emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord> values) {
        if (towerFloorRecordListBuilder_ == null) {
          ensureTowerFloorRecordListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, towerFloorRecordList_);
          onChanged();
        } else {
          towerFloorRecordListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 15;</code>
       */
      public Builder clearTowerFloorRecordList() {
        if (towerFloorRecordListBuilder_ == null) {
          towerFloorRecordList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          towerFloorRecordListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 15;</code>
       */
      public Builder removeTowerFloorRecordList(int index) {
        if (towerFloorRecordListBuilder_ == null) {
          ensureTowerFloorRecordListIsMutable();
          towerFloorRecordList_.remove(index);
          onChanged();
        } else {
          towerFloorRecordListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 15;</code>
       */
      public emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord.Builder getTowerFloorRecordListBuilder(
          int index) {
        return getTowerFloorRecordListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 15;</code>
       */
      public emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder getTowerFloorRecordListOrBuilder(
          int index) {
        if (towerFloorRecordListBuilder_ == null) {
          return towerFloorRecordList_.get(index);  } else {
          return towerFloorRecordListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 15;</code>
       */
      public java.util.List<? extends emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder> 
           getTowerFloorRecordListOrBuilderList() {
        if (towerFloorRecordListBuilder_ != null) {
          return towerFloorRecordListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(towerFloorRecordList_);
        }
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 15;</code>
       */
      public emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord.Builder addTowerFloorRecordListBuilder() {
        return getTowerFloorRecordListFieldBuilder().addBuilder(
            emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord.getDefaultInstance());
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 15;</code>
       */
      public emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord.Builder addTowerFloorRecordListBuilder(
          int index) {
        return getTowerFloorRecordListFieldBuilder().addBuilder(
            index, emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord.getDefaultInstance());
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 15;</code>
       */
      public java.util.List<emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord.Builder> 
           getTowerFloorRecordListBuilderList() {
        return getTowerFloorRecordListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord, emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord.Builder, emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder> 
          getTowerFloorRecordListFieldBuilder() {
        if (towerFloorRecordListBuilder_ == null) {
          towerFloorRecordListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord, emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord.Builder, emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder>(
                  towerFloorRecordList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          towerFloorRecordList_ = null;
        }
        return towerFloorRecordListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:TowerFloorRecordChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:TowerFloorRecordChangeNotify)
    private static final emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify();
    }

    public static emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TowerFloorRecordChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<TowerFloorRecordChangeNotify>() {
      @java.lang.Override
      public TowerFloorRecordChangeNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TowerFloorRecordChangeNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TowerFloorRecordChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TowerFloorRecordChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TowerFloorRecordChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TowerFloorRecordChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"TowerFloorRecordChangeNotify.proto\032\026To" +
      "werFloorRecord.proto\"v\n\034TowerFloorRecord" +
      "ChangeNotify\022\"\n\032is_finished_entrance_flo" +
      "or\030\004 \001(\010\0222\n\027tower_floor_record_list\030\017 \003(" +
      "\0132\021.TowerFloorRecordB\030\n\026emu.gingerps.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.TowerFloorRecordOuterClass.getDescriptor(),
        });
    internal_static_TowerFloorRecordChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TowerFloorRecordChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TowerFloorRecordChangeNotify_descriptor,
        new java.lang.String[] { "IsFinishedEntranceFloor", "TowerFloorRecordList", });
    emu.gingerps.net.proto.TowerFloorRecordOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
