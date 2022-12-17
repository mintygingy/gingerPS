// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExecuteGroupTriggerReq.proto

package emu.gingerps.net.proto;

public final class ExecuteGroupTriggerReqOuterClass {
  private ExecuteGroupTriggerReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ExecuteGroupTriggerReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ExecuteGroupTriggerReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 source_entity_id = 7;</code>
     * @return The sourceEntityId.
     */
    int getSourceEntityId();

    /**
     * <code>int32 param3 = 6;</code>
     * @return The param3.
     */
    int getParam3();

    /**
     * <code>int32 param1 = 9;</code>
     * @return The param1.
     */
    int getParam1();

    /**
     * <code>string source_name = 8;</code>
     * @return The sourceName.
     */
    java.lang.String getSourceName();
    /**
     * <code>string source_name = 8;</code>
     * @return The bytes for sourceName.
     */
    com.google.protobuf.ByteString
        getSourceNameBytes();

    /**
     * <code>uint32 target_entity_id = 15;</code>
     * @return The targetEntityId.
     */
    int getTargetEntityId();

    /**
     * <code>int32 param2 = 4;</code>
     * @return The param2.
     */
    int getParam2();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 263;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ExecuteGroupTriggerReq}
   */
  public static final class ExecuteGroupTriggerReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ExecuteGroupTriggerReq)
      ExecuteGroupTriggerReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ExecuteGroupTriggerReq.newBuilder() to construct.
    private ExecuteGroupTriggerReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ExecuteGroupTriggerReq() {
      sourceName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ExecuteGroupTriggerReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ExecuteGroupTriggerReq(
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
            case 32: {

              param2_ = input.readInt32();
              break;
            }
            case 48: {

              param3_ = input.readInt32();
              break;
            }
            case 56: {

              sourceEntityId_ = input.readUInt32();
              break;
            }
            case 66: {
              java.lang.String s = input.readStringRequireUtf8();

              sourceName_ = s;
              break;
            }
            case 72: {

              param1_ = input.readInt32();
              break;
            }
            case 120: {

              targetEntityId_ = input.readUInt32();
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
      return emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.internal_static_ExecuteGroupTriggerReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.internal_static_ExecuteGroupTriggerReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq.class, emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq.Builder.class);
    }

    public static final int SOURCE_ENTITY_ID_FIELD_NUMBER = 7;
    private int sourceEntityId_;
    /**
     * <code>uint32 source_entity_id = 7;</code>
     * @return The sourceEntityId.
     */
    @java.lang.Override
    public int getSourceEntityId() {
      return sourceEntityId_;
    }

    public static final int PARAM3_FIELD_NUMBER = 6;
    private int param3_;
    /**
     * <code>int32 param3 = 6;</code>
     * @return The param3.
     */
    @java.lang.Override
    public int getParam3() {
      return param3_;
    }

    public static final int PARAM1_FIELD_NUMBER = 9;
    private int param1_;
    /**
     * <code>int32 param1 = 9;</code>
     * @return The param1.
     */
    @java.lang.Override
    public int getParam1() {
      return param1_;
    }

    public static final int SOURCE_NAME_FIELD_NUMBER = 8;
    private volatile java.lang.Object sourceName_;
    /**
     * <code>string source_name = 8;</code>
     * @return The sourceName.
     */
    @java.lang.Override
    public java.lang.String getSourceName() {
      java.lang.Object ref = sourceName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sourceName_ = s;
        return s;
      }
    }
    /**
     * <code>string source_name = 8;</code>
     * @return The bytes for sourceName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSourceNameBytes() {
      java.lang.Object ref = sourceName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TARGET_ENTITY_ID_FIELD_NUMBER = 15;
    private int targetEntityId_;
    /**
     * <code>uint32 target_entity_id = 15;</code>
     * @return The targetEntityId.
     */
    @java.lang.Override
    public int getTargetEntityId() {
      return targetEntityId_;
    }

    public static final int PARAM2_FIELD_NUMBER = 4;
    private int param2_;
    /**
     * <code>int32 param2 = 4;</code>
     * @return The param2.
     */
    @java.lang.Override
    public int getParam2() {
      return param2_;
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
      if (param2_ != 0) {
        output.writeInt32(4, param2_);
      }
      if (param3_ != 0) {
        output.writeInt32(6, param3_);
      }
      if (sourceEntityId_ != 0) {
        output.writeUInt32(7, sourceEntityId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sourceName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 8, sourceName_);
      }
      if (param1_ != 0) {
        output.writeInt32(9, param1_);
      }
      if (targetEntityId_ != 0) {
        output.writeUInt32(15, targetEntityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (param2_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, param2_);
      }
      if (param3_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, param3_);
      }
      if (sourceEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, sourceEntityId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sourceName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, sourceName_);
      }
      if (param1_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, param1_);
      }
      if (targetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, targetEntityId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq other = (emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq) obj;

      if (getSourceEntityId()
          != other.getSourceEntityId()) return false;
      if (getParam3()
          != other.getParam3()) return false;
      if (getParam1()
          != other.getParam1()) return false;
      if (!getSourceName()
          .equals(other.getSourceName())) return false;
      if (getTargetEntityId()
          != other.getTargetEntityId()) return false;
      if (getParam2()
          != other.getParam2()) return false;
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
      hash = (37 * hash) + SOURCE_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSourceEntityId();
      hash = (37 * hash) + PARAM3_FIELD_NUMBER;
      hash = (53 * hash) + getParam3();
      hash = (37 * hash) + PARAM1_FIELD_NUMBER;
      hash = (53 * hash) + getParam1();
      hash = (37 * hash) + SOURCE_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getSourceName().hashCode();
      hash = (37 * hash) + TARGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetEntityId();
      hash = (37 * hash) + PARAM2_FIELD_NUMBER;
      hash = (53 * hash) + getParam2();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq prototype) {
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
     *   CMD_ID = 263;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ExecuteGroupTriggerReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ExecuteGroupTriggerReq)
        emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.internal_static_ExecuteGroupTriggerReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.internal_static_ExecuteGroupTriggerReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq.class, emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq.newBuilder()
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
        sourceEntityId_ = 0;

        param3_ = 0;

        param1_ = 0;

        sourceName_ = "";

        targetEntityId_ = 0;

        param2_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.internal_static_ExecuteGroupTriggerReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq build() {
        emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq buildPartial() {
        emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq result = new emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq(this);
        result.sourceEntityId_ = sourceEntityId_;
        result.param3_ = param3_;
        result.param1_ = param1_;
        result.sourceName_ = sourceName_;
        result.targetEntityId_ = targetEntityId_;
        result.param2_ = param2_;
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
        if (other instanceof emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq) {
          return mergeFrom((emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq other) {
        if (other == emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq.getDefaultInstance()) return this;
        if (other.getSourceEntityId() != 0) {
          setSourceEntityId(other.getSourceEntityId());
        }
        if (other.getParam3() != 0) {
          setParam3(other.getParam3());
        }
        if (other.getParam1() != 0) {
          setParam1(other.getParam1());
        }
        if (!other.getSourceName().isEmpty()) {
          sourceName_ = other.sourceName_;
          onChanged();
        }
        if (other.getTargetEntityId() != 0) {
          setTargetEntityId(other.getTargetEntityId());
        }
        if (other.getParam2() != 0) {
          setParam2(other.getParam2());
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
        emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int sourceEntityId_ ;
      /**
       * <code>uint32 source_entity_id = 7;</code>
       * @return The sourceEntityId.
       */
      @java.lang.Override
      public int getSourceEntityId() {
        return sourceEntityId_;
      }
      /**
       * <code>uint32 source_entity_id = 7;</code>
       * @param value The sourceEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setSourceEntityId(int value) {
        
        sourceEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 source_entity_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearSourceEntityId() {
        
        sourceEntityId_ = 0;
        onChanged();
        return this;
      }

      private int param3_ ;
      /**
       * <code>int32 param3 = 6;</code>
       * @return The param3.
       */
      @java.lang.Override
      public int getParam3() {
        return param3_;
      }
      /**
       * <code>int32 param3 = 6;</code>
       * @param value The param3 to set.
       * @return This builder for chaining.
       */
      public Builder setParam3(int value) {
        
        param3_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 param3 = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam3() {
        
        param3_ = 0;
        onChanged();
        return this;
      }

      private int param1_ ;
      /**
       * <code>int32 param1 = 9;</code>
       * @return The param1.
       */
      @java.lang.Override
      public int getParam1() {
        return param1_;
      }
      /**
       * <code>int32 param1 = 9;</code>
       * @param value The param1 to set.
       * @return This builder for chaining.
       */
      public Builder setParam1(int value) {
        
        param1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 param1 = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam1() {
        
        param1_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object sourceName_ = "";
      /**
       * <code>string source_name = 8;</code>
       * @return The sourceName.
       */
      public java.lang.String getSourceName() {
        java.lang.Object ref = sourceName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          sourceName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string source_name = 8;</code>
       * @return The bytes for sourceName.
       */
      public com.google.protobuf.ByteString
          getSourceNameBytes() {
        java.lang.Object ref = sourceName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          sourceName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string source_name = 8;</code>
       * @param value The sourceName to set.
       * @return This builder for chaining.
       */
      public Builder setSourceName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        sourceName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string source_name = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearSourceName() {
        
        sourceName_ = getDefaultInstance().getSourceName();
        onChanged();
        return this;
      }
      /**
       * <code>string source_name = 8;</code>
       * @param value The bytes for sourceName to set.
       * @return This builder for chaining.
       */
      public Builder setSourceNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        sourceName_ = value;
        onChanged();
        return this;
      }

      private int targetEntityId_ ;
      /**
       * <code>uint32 target_entity_id = 15;</code>
       * @return The targetEntityId.
       */
      @java.lang.Override
      public int getTargetEntityId() {
        return targetEntityId_;
      }
      /**
       * <code>uint32 target_entity_id = 15;</code>
       * @param value The targetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setTargetEntityId(int value) {
        
        targetEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_entity_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetEntityId() {
        
        targetEntityId_ = 0;
        onChanged();
        return this;
      }

      private int param2_ ;
      /**
       * <code>int32 param2 = 4;</code>
       * @return The param2.
       */
      @java.lang.Override
      public int getParam2() {
        return param2_;
      }
      /**
       * <code>int32 param2 = 4;</code>
       * @param value The param2 to set.
       * @return This builder for chaining.
       */
      public Builder setParam2(int value) {
        
        param2_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 param2 = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam2() {
        
        param2_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ExecuteGroupTriggerReq)
    }

    // @@protoc_insertion_point(class_scope:ExecuteGroupTriggerReq)
    private static final emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq();
    }

    public static emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ExecuteGroupTriggerReq>
        PARSER = new com.google.protobuf.AbstractParser<ExecuteGroupTriggerReq>() {
      @java.lang.Override
      public ExecuteGroupTriggerReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ExecuteGroupTriggerReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ExecuteGroupTriggerReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExecuteGroupTriggerReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ExecuteGroupTriggerReqOuterClass.ExecuteGroupTriggerReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ExecuteGroupTriggerReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ExecuteGroupTriggerReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034ExecuteGroupTriggerReq.proto\"\221\001\n\026Execu" +
      "teGroupTriggerReq\022\030\n\020source_entity_id\030\007 " +
      "\001(\r\022\016\n\006param3\030\006 \001(\005\022\016\n\006param1\030\t \001(\005\022\023\n\013s" +
      "ource_name\030\010 \001(\t\022\030\n\020target_entity_id\030\017 \001" +
      "(\r\022\016\n\006param2\030\004 \001(\005B\030\n\026emu.gingerps.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ExecuteGroupTriggerReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ExecuteGroupTriggerReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ExecuteGroupTriggerReq_descriptor,
        new java.lang.String[] { "SourceEntityId", "Param3", "Param1", "SourceName", "TargetEntityId", "Param2", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
