// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UseItemReq.proto

package emu.gingerps.net.proto;

public final class UseItemReqOuterClass {
  private UseItemReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UseItemReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UseItemReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 count = 14;</code>
     * @return The count.
     */
    int getCount();

    /**
     * <code>uint64 guid = 1;</code>
     * @return The guid.
     */
    long getGuid();

    /**
     * <code>uint64 target_guid = 2;</code>
     * @return The targetGuid.
     */
    long getTargetGuid();

    /**
     * <code>uint32 option_idx = 8;</code>
     * @return The optionIdx.
     */
    int getOptionIdx();

    /**
     * <code>bool is_enter_mp_dungeon_team = 9;</code>
     * @return The isEnterMpDungeonTeam.
     */
    boolean getIsEnterMpDungeonTeam();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 647;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code UseItemReq}
   */
  public static final class UseItemReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UseItemReq)
      UseItemReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UseItemReq.newBuilder() to construct.
    private UseItemReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UseItemReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UseItemReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UseItemReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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

              guid_ = input.readUInt64();
              break;
            }
            case 16: {

              targetGuid_ = input.readUInt64();
              break;
            }
            case 64: {

              optionIdx_ = input.readUInt32();
              break;
            }
            case 72: {

              isEnterMpDungeonTeam_ = input.readBool();
              break;
            }
            case 112: {

              count_ = input.readUInt32();
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
      return emu.gingerps.net.proto.UseItemReqOuterClass.internal_static_UseItemReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.UseItemReqOuterClass.internal_static_UseItemReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq.class, emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq.Builder.class);
    }

    public static final int COUNT_FIELD_NUMBER = 14;
    private int count_;
    /**
     * <code>uint32 count = 14;</code>
     * @return The count.
     */
    @java.lang.Override
    public int getCount() {
      return count_;
    }

    public static final int GUID_FIELD_NUMBER = 1;
    private long guid_;
    /**
     * <code>uint64 guid = 1;</code>
     * @return The guid.
     */
    @java.lang.Override
    public long getGuid() {
      return guid_;
    }

    public static final int TARGET_GUID_FIELD_NUMBER = 2;
    private long targetGuid_;
    /**
     * <code>uint64 target_guid = 2;</code>
     * @return The targetGuid.
     */
    @java.lang.Override
    public long getTargetGuid() {
      return targetGuid_;
    }

    public static final int OPTION_IDX_FIELD_NUMBER = 8;
    private int optionIdx_;
    /**
     * <code>uint32 option_idx = 8;</code>
     * @return The optionIdx.
     */
    @java.lang.Override
    public int getOptionIdx() {
      return optionIdx_;
    }

    public static final int IS_ENTER_MP_DUNGEON_TEAM_FIELD_NUMBER = 9;
    private boolean isEnterMpDungeonTeam_;
    /**
     * <code>bool is_enter_mp_dungeon_team = 9;</code>
     * @return The isEnterMpDungeonTeam.
     */
    @java.lang.Override
    public boolean getIsEnterMpDungeonTeam() {
      return isEnterMpDungeonTeam_;
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
      if (guid_ != 0L) {
        output.writeUInt64(1, guid_);
      }
      if (targetGuid_ != 0L) {
        output.writeUInt64(2, targetGuid_);
      }
      if (optionIdx_ != 0) {
        output.writeUInt32(8, optionIdx_);
      }
      if (isEnterMpDungeonTeam_ != false) {
        output.writeBool(9, isEnterMpDungeonTeam_);
      }
      if (count_ != 0) {
        output.writeUInt32(14, count_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (guid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, guid_);
      }
      if (targetGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, targetGuid_);
      }
      if (optionIdx_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, optionIdx_);
      }
      if (isEnterMpDungeonTeam_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isEnterMpDungeonTeam_);
      }
      if (count_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, count_);
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
      if (!(obj instanceof emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq other = (emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq) obj;

      if (getCount()
          != other.getCount()) return false;
      if (getGuid()
          != other.getGuid()) return false;
      if (getTargetGuid()
          != other.getTargetGuid()) return false;
      if (getOptionIdx()
          != other.getOptionIdx()) return false;
      if (getIsEnterMpDungeonTeam()
          != other.getIsEnterMpDungeonTeam()) return false;
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
      hash = (37 * hash) + COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCount();
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getGuid());
      hash = (37 * hash) + TARGET_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTargetGuid());
      hash = (37 * hash) + OPTION_IDX_FIELD_NUMBER;
      hash = (53 * hash) + getOptionIdx();
      hash = (37 * hash) + IS_ENTER_MP_DUNGEON_TEAM_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsEnterMpDungeonTeam());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq prototype) {
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
     *   CMD_ID = 647;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code UseItemReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UseItemReq)
        emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.UseItemReqOuterClass.internal_static_UseItemReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.UseItemReqOuterClass.internal_static_UseItemReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq.class, emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq.newBuilder()
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
        count_ = 0;

        guid_ = 0L;

        targetGuid_ = 0L;

        optionIdx_ = 0;

        isEnterMpDungeonTeam_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.UseItemReqOuterClass.internal_static_UseItemReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq build() {
        emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq buildPartial() {
        emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq result = new emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq(this);
        result.count_ = count_;
        result.guid_ = guid_;
        result.targetGuid_ = targetGuid_;
        result.optionIdx_ = optionIdx_;
        result.isEnterMpDungeonTeam_ = isEnterMpDungeonTeam_;
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
        if (other instanceof emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq) {
          return mergeFrom((emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq other) {
        if (other == emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq.getDefaultInstance()) return this;
        if (other.getCount() != 0) {
          setCount(other.getCount());
        }
        if (other.getGuid() != 0L) {
          setGuid(other.getGuid());
        }
        if (other.getTargetGuid() != 0L) {
          setTargetGuid(other.getTargetGuid());
        }
        if (other.getOptionIdx() != 0) {
          setOptionIdx(other.getOptionIdx());
        }
        if (other.getIsEnterMpDungeonTeam() != false) {
          setIsEnterMpDungeonTeam(other.getIsEnterMpDungeonTeam());
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
        emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int count_ ;
      /**
       * <code>uint32 count = 14;</code>
       * @return The count.
       */
      @java.lang.Override
      public int getCount() {
        return count_;
      }
      /**
       * <code>uint32 count = 14;</code>
       * @param value The count to set.
       * @return This builder for chaining.
       */
      public Builder setCount(int value) {
        
        count_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 count = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearCount() {
        
        count_ = 0;
        onChanged();
        return this;
      }

      private long guid_ ;
      /**
       * <code>uint64 guid = 1;</code>
       * @return The guid.
       */
      @java.lang.Override
      public long getGuid() {
        return guid_;
      }
      /**
       * <code>uint64 guid = 1;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(long value) {
        
        guid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 guid = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        
        guid_ = 0L;
        onChanged();
        return this;
      }

      private long targetGuid_ ;
      /**
       * <code>uint64 target_guid = 2;</code>
       * @return The targetGuid.
       */
      @java.lang.Override
      public long getTargetGuid() {
        return targetGuid_;
      }
      /**
       * <code>uint64 target_guid = 2;</code>
       * @param value The targetGuid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetGuid(long value) {
        
        targetGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 target_guid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetGuid() {
        
        targetGuid_ = 0L;
        onChanged();
        return this;
      }

      private int optionIdx_ ;
      /**
       * <code>uint32 option_idx = 8;</code>
       * @return The optionIdx.
       */
      @java.lang.Override
      public int getOptionIdx() {
        return optionIdx_;
      }
      /**
       * <code>uint32 option_idx = 8;</code>
       * @param value The optionIdx to set.
       * @return This builder for chaining.
       */
      public Builder setOptionIdx(int value) {
        
        optionIdx_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 option_idx = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearOptionIdx() {
        
        optionIdx_ = 0;
        onChanged();
        return this;
      }

      private boolean isEnterMpDungeonTeam_ ;
      /**
       * <code>bool is_enter_mp_dungeon_team = 9;</code>
       * @return The isEnterMpDungeonTeam.
       */
      @java.lang.Override
      public boolean getIsEnterMpDungeonTeam() {
        return isEnterMpDungeonTeam_;
      }
      /**
       * <code>bool is_enter_mp_dungeon_team = 9;</code>
       * @param value The isEnterMpDungeonTeam to set.
       * @return This builder for chaining.
       */
      public Builder setIsEnterMpDungeonTeam(boolean value) {
        
        isEnterMpDungeonTeam_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_enter_mp_dungeon_team = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsEnterMpDungeonTeam() {
        
        isEnterMpDungeonTeam_ = false;
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


      // @@protoc_insertion_point(builder_scope:UseItemReq)
    }

    // @@protoc_insertion_point(class_scope:UseItemReq)
    private static final emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq();
    }

    public static emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UseItemReq>
        PARSER = new com.google.protobuf.AbstractParser<UseItemReq>() {
      @java.lang.Override
      public UseItemReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UseItemReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UseItemReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UseItemReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UseItemReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UseItemReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020UseItemReq.proto\"t\n\nUseItemReq\022\r\n\005coun" +
      "t\030\016 \001(\r\022\014\n\004guid\030\001 \001(\004\022\023\n\013target_guid\030\002 \001" +
      "(\004\022\022\n\noption_idx\030\010 \001(\r\022 \n\030is_enter_mp_du" +
      "ngeon_team\030\t \001(\010B\033\n\031emu.gingerps.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UseItemReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UseItemReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UseItemReq_descriptor,
        new java.lang.String[] { "Count", "Guid", "TargetGuid", "OptionIdx", "IsEnterMpDungeonTeam", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
