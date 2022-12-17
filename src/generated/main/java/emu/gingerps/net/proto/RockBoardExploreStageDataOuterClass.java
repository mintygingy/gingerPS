// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RockBoardExploreStageData.proto

package emu.gingerps.net.proto;

public final class RockBoardExploreStageDataOuterClass {
  private RockBoardExploreStageDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RockBoardExploreStageDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RockBoardExploreStageData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_finish = 8;</code>
     * @return The isFinish.
     */
    boolean getIsFinish();

    /**
     * <code>bool is_open = 9;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 open_time = 12;</code>
     * @return The openTime.
     */
    int getOpenTime();

    /**
     * <code>uint32 stage_id = 13;</code>
     * @return The stageId.
     */
    int getStageId();
  }
  /**
   * Protobuf type {@code RockBoardExploreStageData}
   */
  public static final class RockBoardExploreStageData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RockBoardExploreStageData)
      RockBoardExploreStageDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RockBoardExploreStageData.newBuilder() to construct.
    private RockBoardExploreStageData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RockBoardExploreStageData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RockBoardExploreStageData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RockBoardExploreStageData(
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
            case 64: {

              isFinish_ = input.readBool();
              break;
            }
            case 72: {

              isOpen_ = input.readBool();
              break;
            }
            case 96: {

              openTime_ = input.readUInt32();
              break;
            }
            case 104: {

              stageId_ = input.readUInt32();
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
      return emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.internal_static_RockBoardExploreStageData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.internal_static_RockBoardExploreStageData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData.class, emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData.Builder.class);
    }

    public static final int IS_FINISH_FIELD_NUMBER = 8;
    private boolean isFinish_;
    /**
     * <code>bool is_finish = 8;</code>
     * @return The isFinish.
     */
    @java.lang.Override
    public boolean getIsFinish() {
      return isFinish_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 9;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 9;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int OPEN_TIME_FIELD_NUMBER = 12;
    private int openTime_;
    /**
     * <code>uint32 open_time = 12;</code>
     * @return The openTime.
     */
    @java.lang.Override
    public int getOpenTime() {
      return openTime_;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 13;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 13;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
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
      if (isFinish_ != false) {
        output.writeBool(8, isFinish_);
      }
      if (isOpen_ != false) {
        output.writeBool(9, isOpen_);
      }
      if (openTime_ != 0) {
        output.writeUInt32(12, openTime_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(13, stageId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isFinish_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isFinish_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isOpen_);
      }
      if (openTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, openTime_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, stageId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData other = (emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData) obj;

      if (getIsFinish()
          != other.getIsFinish()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getOpenTime()
          != other.getOpenTime()) return false;
      if (getStageId()
          != other.getStageId()) return false;
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
      hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinish());
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + OPEN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getOpenTime();
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData prototype) {
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
     * Protobuf type {@code RockBoardExploreStageData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RockBoardExploreStageData)
        emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.internal_static_RockBoardExploreStageData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.internal_static_RockBoardExploreStageData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData.class, emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData.newBuilder()
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
        isFinish_ = false;

        isOpen_ = false;

        openTime_ = 0;

        stageId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.internal_static_RockBoardExploreStageData_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData getDefaultInstanceForType() {
        return emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData build() {
        emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData buildPartial() {
        emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData result = new emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData(this);
        result.isFinish_ = isFinish_;
        result.isOpen_ = isOpen_;
        result.openTime_ = openTime_;
        result.stageId_ = stageId_;
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
        if (other instanceof emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData) {
          return mergeFrom((emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData other) {
        if (other == emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData.getDefaultInstance()) return this;
        if (other.getIsFinish() != false) {
          setIsFinish(other.getIsFinish());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getOpenTime() != 0) {
          setOpenTime(other.getOpenTime());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
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
        emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isFinish_ ;
      /**
       * <code>bool is_finish = 8;</code>
       * @return The isFinish.
       */
      @java.lang.Override
      public boolean getIsFinish() {
        return isFinish_;
      }
      /**
       * <code>bool is_finish = 8;</code>
       * @param value The isFinish to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinish(boolean value) {
        
        isFinish_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finish = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinish() {
        
        isFinish_ = false;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 9;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 9;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int openTime_ ;
      /**
       * <code>uint32 open_time = 12;</code>
       * @return The openTime.
       */
      @java.lang.Override
      public int getOpenTime() {
        return openTime_;
      }
      /**
       * <code>uint32 open_time = 12;</code>
       * @param value The openTime to set.
       * @return This builder for chaining.
       */
      public Builder setOpenTime(int value) {
        
        openTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 open_time = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpenTime() {
        
        openTime_ = 0;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 13;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 13;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:RockBoardExploreStageData)
    }

    // @@protoc_insertion_point(class_scope:RockBoardExploreStageData)
    private static final emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData();
    }

    public static emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RockBoardExploreStageData>
        PARSER = new com.google.protobuf.AbstractParser<RockBoardExploreStageData>() {
      @java.lang.Override
      public RockBoardExploreStageData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RockBoardExploreStageData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RockBoardExploreStageData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RockBoardExploreStageData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.RockBoardExploreStageDataOuterClass.RockBoardExploreStageData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RockBoardExploreStageData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RockBoardExploreStageData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037RockBoardExploreStageData.proto\"d\n\031Roc" +
      "kBoardExploreStageData\022\021\n\tis_finish\030\010 \001(" +
      "\010\022\017\n\007is_open\030\t \001(\010\022\021\n\topen_time\030\014 \001(\r\022\020\n" +
      "\010stage_id\030\r \001(\rB\030\n\026emu.gingerps.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RockBoardExploreStageData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RockBoardExploreStageData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RockBoardExploreStageData_descriptor,
        new java.lang.String[] { "IsFinish", "IsOpen", "OpenTime", "StageId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
