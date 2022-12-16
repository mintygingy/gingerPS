// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityMetaSetAbilityTrigger.proto

package emu.gingerps.net.proto;

public final class AbilityMetaSetAbilityTriggerOuterClass {
  private AbilityMetaSetAbilityTriggerOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityMetaSetAbilityTriggerOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityMetaSetAbilityTrigger)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 trigger_ability_entity_id = 1;</code>
     * @return The triggerAbilityEntityId.
     */
    int getTriggerAbilityEntityId();
  }
  /**
   * Protobuf type {@code AbilityMetaSetAbilityTrigger}
   */
  public static final class AbilityMetaSetAbilityTrigger extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityMetaSetAbilityTrigger)
      AbilityMetaSetAbilityTriggerOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityMetaSetAbilityTrigger.newBuilder() to construct.
    private AbilityMetaSetAbilityTrigger(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityMetaSetAbilityTrigger() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityMetaSetAbilityTrigger();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AbilityMetaSetAbilityTrigger(
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

              triggerAbilityEntityId_ = input.readUInt32();
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
      return emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.internal_static_AbilityMetaSetAbilityTrigger_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.internal_static_AbilityMetaSetAbilityTrigger_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger.class, emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger.Builder.class);
    }

    public static final int TRIGGER_ABILITY_ENTITY_ID_FIELD_NUMBER = 1;
    private int triggerAbilityEntityId_;
    /**
     * <code>uint32 trigger_ability_entity_id = 1;</code>
     * @return The triggerAbilityEntityId.
     */
    @java.lang.Override
    public int getTriggerAbilityEntityId() {
      return triggerAbilityEntityId_;
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
      if (triggerAbilityEntityId_ != 0) {
        output.writeUInt32(1, triggerAbilityEntityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (triggerAbilityEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, triggerAbilityEntityId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger other = (emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger) obj;

      if (getTriggerAbilityEntityId()
          != other.getTriggerAbilityEntityId()) return false;
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
      hash = (37 * hash) + TRIGGER_ABILITY_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTriggerAbilityEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger prototype) {
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
     * Protobuf type {@code AbilityMetaSetAbilityTrigger}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityMetaSetAbilityTrigger)
        emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTriggerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.internal_static_AbilityMetaSetAbilityTrigger_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.internal_static_AbilityMetaSetAbilityTrigger_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger.class, emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger.newBuilder()
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
        triggerAbilityEntityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.internal_static_AbilityMetaSetAbilityTrigger_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger getDefaultInstanceForType() {
        return emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger build() {
        emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger buildPartial() {
        emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger result = new emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger(this);
        result.triggerAbilityEntityId_ = triggerAbilityEntityId_;
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
        if (other instanceof emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger) {
          return mergeFrom((emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger other) {
        if (other == emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger.getDefaultInstance()) return this;
        if (other.getTriggerAbilityEntityId() != 0) {
          setTriggerAbilityEntityId(other.getTriggerAbilityEntityId());
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
        emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int triggerAbilityEntityId_ ;
      /**
       * <code>uint32 trigger_ability_entity_id = 1;</code>
       * @return The triggerAbilityEntityId.
       */
      @java.lang.Override
      public int getTriggerAbilityEntityId() {
        return triggerAbilityEntityId_;
      }
      /**
       * <code>uint32 trigger_ability_entity_id = 1;</code>
       * @param value The triggerAbilityEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setTriggerAbilityEntityId(int value) {
        
        triggerAbilityEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 trigger_ability_entity_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTriggerAbilityEntityId() {
        
        triggerAbilityEntityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AbilityMetaSetAbilityTrigger)
    }

    // @@protoc_insertion_point(class_scope:AbilityMetaSetAbilityTrigger)
    private static final emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger();
    }

    public static emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityMetaSetAbilityTrigger>
        PARSER = new com.google.protobuf.AbstractParser<AbilityMetaSetAbilityTrigger>() {
      @java.lang.Override
      public AbilityMetaSetAbilityTrigger parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AbilityMetaSetAbilityTrigger(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AbilityMetaSetAbilityTrigger> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityMetaSetAbilityTrigger> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.AbilityMetaSetAbilityTriggerOuterClass.AbilityMetaSetAbilityTrigger getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityMetaSetAbilityTrigger_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityMetaSetAbilityTrigger_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"AbilityMetaSetAbilityTrigger.proto\"A\n\034" +
      "AbilityMetaSetAbilityTrigger\022!\n\031trigger_" +
      "ability_entity_id\030\001 \001(\rB\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AbilityMetaSetAbilityTrigger_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityMetaSetAbilityTrigger_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityMetaSetAbilityTrigger_descriptor,
        new java.lang.String[] { "TriggerAbilityEntityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
