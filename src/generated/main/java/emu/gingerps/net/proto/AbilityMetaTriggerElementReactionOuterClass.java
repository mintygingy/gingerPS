// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityMetaTriggerElementReaction.proto

package emu.gingerps.net.proto;

public final class AbilityMetaTriggerElementReactionOuterClass {
  private AbilityMetaTriggerElementReactionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityMetaTriggerElementReactionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityMetaTriggerElementReaction)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 hit_index = 7;</code>
     * @return The hitIndex.
     */
    int getHitIndex();

    /**
     * <code>uint32 trigger_entity_id = 14;</code>
     * @return The triggerEntityId.
     */
    int getTriggerEntityId();

    /**
     * <code>uint32 element_source_type = 13;</code>
     * @return The elementSourceType.
     */
    int getElementSourceType();

    /**
     * <code>uint32 element_reaction_type = 12;</code>
     * @return The elementReactionType.
     */
    int getElementReactionType();

    /**
     * <code>uint32 element_reactor_type = 2;</code>
     * @return The elementReactorType.
     */
    int getElementReactorType();
  }
  /**
   * Protobuf type {@code AbilityMetaTriggerElementReaction}
   */
  public static final class AbilityMetaTriggerElementReaction extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityMetaTriggerElementReaction)
      AbilityMetaTriggerElementReactionOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityMetaTriggerElementReaction.newBuilder() to construct.
    private AbilityMetaTriggerElementReaction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityMetaTriggerElementReaction() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityMetaTriggerElementReaction();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AbilityMetaTriggerElementReaction(
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
            case 16: {

              elementReactorType_ = input.readUInt32();
              break;
            }
            case 56: {

              hitIndex_ = input.readInt32();
              break;
            }
            case 96: {

              elementReactionType_ = input.readUInt32();
              break;
            }
            case 104: {

              elementSourceType_ = input.readUInt32();
              break;
            }
            case 112: {

              triggerEntityId_ = input.readUInt32();
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
      return emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.internal_static_AbilityMetaTriggerElementReaction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.internal_static_AbilityMetaTriggerElementReaction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction.class, emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction.Builder.class);
    }

    public static final int HIT_INDEX_FIELD_NUMBER = 7;
    private int hitIndex_;
    /**
     * <code>int32 hit_index = 7;</code>
     * @return The hitIndex.
     */
    @java.lang.Override
    public int getHitIndex() {
      return hitIndex_;
    }

    public static final int TRIGGER_ENTITY_ID_FIELD_NUMBER = 14;
    private int triggerEntityId_;
    /**
     * <code>uint32 trigger_entity_id = 14;</code>
     * @return The triggerEntityId.
     */
    @java.lang.Override
    public int getTriggerEntityId() {
      return triggerEntityId_;
    }

    public static final int ELEMENT_SOURCE_TYPE_FIELD_NUMBER = 13;
    private int elementSourceType_;
    /**
     * <code>uint32 element_source_type = 13;</code>
     * @return The elementSourceType.
     */
    @java.lang.Override
    public int getElementSourceType() {
      return elementSourceType_;
    }

    public static final int ELEMENT_REACTION_TYPE_FIELD_NUMBER = 12;
    private int elementReactionType_;
    /**
     * <code>uint32 element_reaction_type = 12;</code>
     * @return The elementReactionType.
     */
    @java.lang.Override
    public int getElementReactionType() {
      return elementReactionType_;
    }

    public static final int ELEMENT_REACTOR_TYPE_FIELD_NUMBER = 2;
    private int elementReactorType_;
    /**
     * <code>uint32 element_reactor_type = 2;</code>
     * @return The elementReactorType.
     */
    @java.lang.Override
    public int getElementReactorType() {
      return elementReactorType_;
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
      if (elementReactorType_ != 0) {
        output.writeUInt32(2, elementReactorType_);
      }
      if (hitIndex_ != 0) {
        output.writeInt32(7, hitIndex_);
      }
      if (elementReactionType_ != 0) {
        output.writeUInt32(12, elementReactionType_);
      }
      if (elementSourceType_ != 0) {
        output.writeUInt32(13, elementSourceType_);
      }
      if (triggerEntityId_ != 0) {
        output.writeUInt32(14, triggerEntityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (elementReactorType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, elementReactorType_);
      }
      if (hitIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, hitIndex_);
      }
      if (elementReactionType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, elementReactionType_);
      }
      if (elementSourceType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, elementSourceType_);
      }
      if (triggerEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, triggerEntityId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction other = (emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction) obj;

      if (getHitIndex()
          != other.getHitIndex()) return false;
      if (getTriggerEntityId()
          != other.getTriggerEntityId()) return false;
      if (getElementSourceType()
          != other.getElementSourceType()) return false;
      if (getElementReactionType()
          != other.getElementReactionType()) return false;
      if (getElementReactorType()
          != other.getElementReactorType()) return false;
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
      hash = (37 * hash) + HIT_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getHitIndex();
      hash = (37 * hash) + TRIGGER_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTriggerEntityId();
      hash = (37 * hash) + ELEMENT_SOURCE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getElementSourceType();
      hash = (37 * hash) + ELEMENT_REACTION_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getElementReactionType();
      hash = (37 * hash) + ELEMENT_REACTOR_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getElementReactorType();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction prototype) {
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
     * Protobuf type {@code AbilityMetaTriggerElementReaction}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityMetaTriggerElementReaction)
        emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReactionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.internal_static_AbilityMetaTriggerElementReaction_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.internal_static_AbilityMetaTriggerElementReaction_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction.class, emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction.newBuilder()
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
        hitIndex_ = 0;

        triggerEntityId_ = 0;

        elementSourceType_ = 0;

        elementReactionType_ = 0;

        elementReactorType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.internal_static_AbilityMetaTriggerElementReaction_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction getDefaultInstanceForType() {
        return emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction build() {
        emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction buildPartial() {
        emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction result = new emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction(this);
        result.hitIndex_ = hitIndex_;
        result.triggerEntityId_ = triggerEntityId_;
        result.elementSourceType_ = elementSourceType_;
        result.elementReactionType_ = elementReactionType_;
        result.elementReactorType_ = elementReactorType_;
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
        if (other instanceof emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction) {
          return mergeFrom((emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction other) {
        if (other == emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction.getDefaultInstance()) return this;
        if (other.getHitIndex() != 0) {
          setHitIndex(other.getHitIndex());
        }
        if (other.getTriggerEntityId() != 0) {
          setTriggerEntityId(other.getTriggerEntityId());
        }
        if (other.getElementSourceType() != 0) {
          setElementSourceType(other.getElementSourceType());
        }
        if (other.getElementReactionType() != 0) {
          setElementReactionType(other.getElementReactionType());
        }
        if (other.getElementReactorType() != 0) {
          setElementReactorType(other.getElementReactorType());
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
        emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int hitIndex_ ;
      /**
       * <code>int32 hit_index = 7;</code>
       * @return The hitIndex.
       */
      @java.lang.Override
      public int getHitIndex() {
        return hitIndex_;
      }
      /**
       * <code>int32 hit_index = 7;</code>
       * @param value The hitIndex to set.
       * @return This builder for chaining.
       */
      public Builder setHitIndex(int value) {
        
        hitIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 hit_index = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearHitIndex() {
        
        hitIndex_ = 0;
        onChanged();
        return this;
      }

      private int triggerEntityId_ ;
      /**
       * <code>uint32 trigger_entity_id = 14;</code>
       * @return The triggerEntityId.
       */
      @java.lang.Override
      public int getTriggerEntityId() {
        return triggerEntityId_;
      }
      /**
       * <code>uint32 trigger_entity_id = 14;</code>
       * @param value The triggerEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setTriggerEntityId(int value) {
        
        triggerEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 trigger_entity_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearTriggerEntityId() {
        
        triggerEntityId_ = 0;
        onChanged();
        return this;
      }

      private int elementSourceType_ ;
      /**
       * <code>uint32 element_source_type = 13;</code>
       * @return The elementSourceType.
       */
      @java.lang.Override
      public int getElementSourceType() {
        return elementSourceType_;
      }
      /**
       * <code>uint32 element_source_type = 13;</code>
       * @param value The elementSourceType to set.
       * @return This builder for chaining.
       */
      public Builder setElementSourceType(int value) {
        
        elementSourceType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 element_source_type = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearElementSourceType() {
        
        elementSourceType_ = 0;
        onChanged();
        return this;
      }

      private int elementReactionType_ ;
      /**
       * <code>uint32 element_reaction_type = 12;</code>
       * @return The elementReactionType.
       */
      @java.lang.Override
      public int getElementReactionType() {
        return elementReactionType_;
      }
      /**
       * <code>uint32 element_reaction_type = 12;</code>
       * @param value The elementReactionType to set.
       * @return This builder for chaining.
       */
      public Builder setElementReactionType(int value) {
        
        elementReactionType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 element_reaction_type = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearElementReactionType() {
        
        elementReactionType_ = 0;
        onChanged();
        return this;
      }

      private int elementReactorType_ ;
      /**
       * <code>uint32 element_reactor_type = 2;</code>
       * @return The elementReactorType.
       */
      @java.lang.Override
      public int getElementReactorType() {
        return elementReactorType_;
      }
      /**
       * <code>uint32 element_reactor_type = 2;</code>
       * @param value The elementReactorType to set.
       * @return This builder for chaining.
       */
      public Builder setElementReactorType(int value) {
        
        elementReactorType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 element_reactor_type = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearElementReactorType() {
        
        elementReactorType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AbilityMetaTriggerElementReaction)
    }

    // @@protoc_insertion_point(class_scope:AbilityMetaTriggerElementReaction)
    private static final emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction();
    }

    public static emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityMetaTriggerElementReaction>
        PARSER = new com.google.protobuf.AbstractParser<AbilityMetaTriggerElementReaction>() {
      @java.lang.Override
      public AbilityMetaTriggerElementReaction parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AbilityMetaTriggerElementReaction(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AbilityMetaTriggerElementReaction> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityMetaTriggerElementReaction> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityMetaTriggerElementReaction_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityMetaTriggerElementReaction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'AbilityMetaTriggerElementReaction.prot" +
      "o\"\253\001\n!AbilityMetaTriggerElementReaction\022" +
      "\021\n\thit_index\030\007 \001(\005\022\031\n\021trigger_entity_id\030" +
      "\016 \001(\r\022\033\n\023element_source_type\030\r \001(\r\022\035\n\025el" +
      "ement_reaction_type\030\014 \001(\r\022\034\n\024element_rea" +
      "ctor_type\030\002 \001(\rB\030\n\026emu.gingerps.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AbilityMetaTriggerElementReaction_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityMetaTriggerElementReaction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityMetaTriggerElementReaction_descriptor,
        new java.lang.String[] { "HitIndex", "TriggerEntityId", "ElementSourceType", "ElementReactionType", "ElementReactorType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
