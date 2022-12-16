// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GadgetChangeLevelTagReq.proto

package emu.gingerps.net.proto;

public final class GadgetChangeLevelTagReqOuterClass {
  private GadgetChangeLevelTagReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GadgetChangeLevelTagReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GadgetChangeLevelTagReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gadget_entity_id = 14;</code>
     * @return The gadgetEntityId.
     */
    int getGadgetEntityId();

    /**
     * <code>uint32 level_tag_id = 6;</code>
     * @return The levelTagId.
     */
    int getLevelTagId();

    /**
     * <code>.CustomGadgetTreeInfo combination_info = 7;</code>
     * @return Whether the combinationInfo field is set.
     */
    boolean hasCombinationInfo();
    /**
     * <code>.CustomGadgetTreeInfo combination_info = 7;</code>
     * @return The combinationInfo.
     */
    emu.gingerps.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo getCombinationInfo();
    /**
     * <code>.CustomGadgetTreeInfo combination_info = 7;</code>
     */
    emu.gingerps.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder getCombinationInfoOrBuilder();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 875;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GadgetChangeLevelTagReq}
   */
  public static final class GadgetChangeLevelTagReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GadgetChangeLevelTagReq)
      GadgetChangeLevelTagReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GadgetChangeLevelTagReq.newBuilder() to construct.
    private GadgetChangeLevelTagReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GadgetChangeLevelTagReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GadgetChangeLevelTagReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GadgetChangeLevelTagReq(
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
            case 48: {

              levelTagId_ = input.readUInt32();
              break;
            }
            case 58: {
              emu.gingerps.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder subBuilder = null;
              if (combinationInfo_ != null) {
                subBuilder = combinationInfo_.toBuilder();
              }
              combinationInfo_ = input.readMessage(emu.gingerps.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(combinationInfo_);
                combinationInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 112: {

              gadgetEntityId_ = input.readUInt32();
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
      return emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.internal_static_GadgetChangeLevelTagReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.internal_static_GadgetChangeLevelTagReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq.class, emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq.Builder.class);
    }

    public static final int GADGET_ENTITY_ID_FIELD_NUMBER = 14;
    private int gadgetEntityId_;
    /**
     * <code>uint32 gadget_entity_id = 14;</code>
     * @return The gadgetEntityId.
     */
    @java.lang.Override
    public int getGadgetEntityId() {
      return gadgetEntityId_;
    }

    public static final int LEVEL_TAG_ID_FIELD_NUMBER = 6;
    private int levelTagId_;
    /**
     * <code>uint32 level_tag_id = 6;</code>
     * @return The levelTagId.
     */
    @java.lang.Override
    public int getLevelTagId() {
      return levelTagId_;
    }

    public static final int COMBINATION_INFO_FIELD_NUMBER = 7;
    private emu.gingerps.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo combinationInfo_;
    /**
     * <code>.CustomGadgetTreeInfo combination_info = 7;</code>
     * @return Whether the combinationInfo field is set.
     */
    @java.lang.Override
    public boolean hasCombinationInfo() {
      return combinationInfo_ != null;
    }
    /**
     * <code>.CustomGadgetTreeInfo combination_info = 7;</code>
     * @return The combinationInfo.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo getCombinationInfo() {
      return combinationInfo_ == null ? emu.gingerps.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.getDefaultInstance() : combinationInfo_;
    }
    /**
     * <code>.CustomGadgetTreeInfo combination_info = 7;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder getCombinationInfoOrBuilder() {
      return getCombinationInfo();
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
      if (levelTagId_ != 0) {
        output.writeUInt32(6, levelTagId_);
      }
      if (combinationInfo_ != null) {
        output.writeMessage(7, getCombinationInfo());
      }
      if (gadgetEntityId_ != 0) {
        output.writeUInt32(14, gadgetEntityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (levelTagId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, levelTagId_);
      }
      if (combinationInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getCombinationInfo());
      }
      if (gadgetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, gadgetEntityId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq other = (emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq) obj;

      if (getGadgetEntityId()
          != other.getGadgetEntityId()) return false;
      if (getLevelTagId()
          != other.getLevelTagId()) return false;
      if (hasCombinationInfo() != other.hasCombinationInfo()) return false;
      if (hasCombinationInfo()) {
        if (!getCombinationInfo()
            .equals(other.getCombinationInfo())) return false;
      }
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
      hash = (37 * hash) + GADGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetEntityId();
      hash = (37 * hash) + LEVEL_TAG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelTagId();
      if (hasCombinationInfo()) {
        hash = (37 * hash) + COMBINATION_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getCombinationInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq prototype) {
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
     *   CMD_ID = 875;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GadgetChangeLevelTagReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GadgetChangeLevelTagReq)
        emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.internal_static_GadgetChangeLevelTagReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.internal_static_GadgetChangeLevelTagReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq.class, emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq.newBuilder()
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
        gadgetEntityId_ = 0;

        levelTagId_ = 0;

        if (combinationInfoBuilder_ == null) {
          combinationInfo_ = null;
        } else {
          combinationInfo_ = null;
          combinationInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.internal_static_GadgetChangeLevelTagReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq build() {
        emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq buildPartial() {
        emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq result = new emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq(this);
        result.gadgetEntityId_ = gadgetEntityId_;
        result.levelTagId_ = levelTagId_;
        if (combinationInfoBuilder_ == null) {
          result.combinationInfo_ = combinationInfo_;
        } else {
          result.combinationInfo_ = combinationInfoBuilder_.build();
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
        if (other instanceof emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq) {
          return mergeFrom((emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq other) {
        if (other == emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq.getDefaultInstance()) return this;
        if (other.getGadgetEntityId() != 0) {
          setGadgetEntityId(other.getGadgetEntityId());
        }
        if (other.getLevelTagId() != 0) {
          setLevelTagId(other.getLevelTagId());
        }
        if (other.hasCombinationInfo()) {
          mergeCombinationInfo(other.getCombinationInfo());
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
        emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int gadgetEntityId_ ;
      /**
       * <code>uint32 gadget_entity_id = 14;</code>
       * @return The gadgetEntityId.
       */
      @java.lang.Override
      public int getGadgetEntityId() {
        return gadgetEntityId_;
      }
      /**
       * <code>uint32 gadget_entity_id = 14;</code>
       * @param value The gadgetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetEntityId(int value) {
        
        gadgetEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_entity_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetEntityId() {
        
        gadgetEntityId_ = 0;
        onChanged();
        return this;
      }

      private int levelTagId_ ;
      /**
       * <code>uint32 level_tag_id = 6;</code>
       * @return The levelTagId.
       */
      @java.lang.Override
      public int getLevelTagId() {
        return levelTagId_;
      }
      /**
       * <code>uint32 level_tag_id = 6;</code>
       * @param value The levelTagId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelTagId(int value) {
        
        levelTagId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_tag_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelTagId() {
        
        levelTagId_ = 0;
        onChanged();
        return this;
      }

      private emu.gingerps.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo combinationInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo, emu.gingerps.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder, emu.gingerps.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder> combinationInfoBuilder_;
      /**
       * <code>.CustomGadgetTreeInfo combination_info = 7;</code>
       * @return Whether the combinationInfo field is set.
       */
      public boolean hasCombinationInfo() {
        return combinationInfoBuilder_ != null || combinationInfo_ != null;
      }
      /**
       * <code>.CustomGadgetTreeInfo combination_info = 7;</code>
       * @return The combinationInfo.
       */
      public emu.gingerps.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo getCombinationInfo() {
        if (combinationInfoBuilder_ == null) {
          return combinationInfo_ == null ? emu.gingerps.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.getDefaultInstance() : combinationInfo_;
        } else {
          return combinationInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.CustomGadgetTreeInfo combination_info = 7;</code>
       */
      public Builder setCombinationInfo(emu.gingerps.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo value) {
        if (combinationInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          combinationInfo_ = value;
          onChanged();
        } else {
          combinationInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.CustomGadgetTreeInfo combination_info = 7;</code>
       */
      public Builder setCombinationInfo(
          emu.gingerps.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder builderForValue) {
        if (combinationInfoBuilder_ == null) {
          combinationInfo_ = builderForValue.build();
          onChanged();
        } else {
          combinationInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.CustomGadgetTreeInfo combination_info = 7;</code>
       */
      public Builder mergeCombinationInfo(emu.gingerps.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo value) {
        if (combinationInfoBuilder_ == null) {
          if (combinationInfo_ != null) {
            combinationInfo_ =
              emu.gingerps.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.newBuilder(combinationInfo_).mergeFrom(value).buildPartial();
          } else {
            combinationInfo_ = value;
          }
          onChanged();
        } else {
          combinationInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.CustomGadgetTreeInfo combination_info = 7;</code>
       */
      public Builder clearCombinationInfo() {
        if (combinationInfoBuilder_ == null) {
          combinationInfo_ = null;
          onChanged();
        } else {
          combinationInfo_ = null;
          combinationInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.CustomGadgetTreeInfo combination_info = 7;</code>
       */
      public emu.gingerps.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder getCombinationInfoBuilder() {
        
        onChanged();
        return getCombinationInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.CustomGadgetTreeInfo combination_info = 7;</code>
       */
      public emu.gingerps.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder getCombinationInfoOrBuilder() {
        if (combinationInfoBuilder_ != null) {
          return combinationInfoBuilder_.getMessageOrBuilder();
        } else {
          return combinationInfo_ == null ?
              emu.gingerps.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.getDefaultInstance() : combinationInfo_;
        }
      }
      /**
       * <code>.CustomGadgetTreeInfo combination_info = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo, emu.gingerps.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder, emu.gingerps.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder> 
          getCombinationInfoFieldBuilder() {
        if (combinationInfoBuilder_ == null) {
          combinationInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo, emu.gingerps.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder, emu.gingerps.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder>(
                  getCombinationInfo(),
                  getParentForChildren(),
                  isClean());
          combinationInfo_ = null;
        }
        return combinationInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GadgetChangeLevelTagReq)
    }

    // @@protoc_insertion_point(class_scope:GadgetChangeLevelTagReq)
    private static final emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq();
    }

    public static emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GadgetChangeLevelTagReq>
        PARSER = new com.google.protobuf.AbstractParser<GadgetChangeLevelTagReq>() {
      @java.lang.Override
      public GadgetChangeLevelTagReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GadgetChangeLevelTagReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GadgetChangeLevelTagReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GadgetChangeLevelTagReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.GadgetChangeLevelTagReqOuterClass.GadgetChangeLevelTagReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GadgetChangeLevelTagReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GadgetChangeLevelTagReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035GadgetChangeLevelTagReq.proto\032\032CustomG" +
      "adgetTreeInfo.proto\"z\n\027GadgetChangeLevel" +
      "TagReq\022\030\n\020gadget_entity_id\030\016 \001(\r\022\024\n\014leve" +
      "l_tag_id\030\006 \001(\r\022/\n\020combination_info\030\007 \001(\013" +
      "2\025.CustomGadgetTreeInfoB\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.CustomGadgetTreeInfoOuterClass.getDescriptor(),
        });
    internal_static_GadgetChangeLevelTagReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GadgetChangeLevelTagReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GadgetChangeLevelTagReq_descriptor,
        new java.lang.String[] { "GadgetEntityId", "LevelTagId", "CombinationInfo", });
    emu.gingerps.net.proto.CustomGadgetTreeInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
