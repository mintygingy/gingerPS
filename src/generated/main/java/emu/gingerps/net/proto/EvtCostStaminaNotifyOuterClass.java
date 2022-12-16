// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtCostStaminaNotify.proto

package emu.gingerps.net.proto;

public final class EvtCostStaminaNotifyOuterClass {
  private EvtCostStaminaNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtCostStaminaNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtCostStaminaNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float cost_stamina = 4;</code>
     * @return The costStamina.
     */
    float getCostStamina();

    /**
     * <code>uint32 skill_id = 1;</code>
     * @return The skillId.
     */
    int getSkillId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 378;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code EvtCostStaminaNotify}
   */
  public static final class EvtCostStaminaNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtCostStaminaNotify)
      EvtCostStaminaNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtCostStaminaNotify.newBuilder() to construct.
    private EvtCostStaminaNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtCostStaminaNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtCostStaminaNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EvtCostStaminaNotify(
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

              skillId_ = input.readUInt32();
              break;
            }
            case 37: {

              costStamina_ = input.readFloat();
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
      return emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.internal_static_EvtCostStaminaNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.internal_static_EvtCostStaminaNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify.class, emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify.Builder.class);
    }

    public static final int COST_STAMINA_FIELD_NUMBER = 4;
    private float costStamina_;
    /**
     * <code>float cost_stamina = 4;</code>
     * @return The costStamina.
     */
    @java.lang.Override
    public float getCostStamina() {
      return costStamina_;
    }

    public static final int SKILL_ID_FIELD_NUMBER = 1;
    private int skillId_;
    /**
     * <code>uint32 skill_id = 1;</code>
     * @return The skillId.
     */
    @java.lang.Override
    public int getSkillId() {
      return skillId_;
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
      if (skillId_ != 0) {
        output.writeUInt32(1, skillId_);
      }
      if (costStamina_ != 0F) {
        output.writeFloat(4, costStamina_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (skillId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, skillId_);
      }
      if (costStamina_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(4, costStamina_);
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
      if (!(obj instanceof emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify other = (emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify) obj;

      if (java.lang.Float.floatToIntBits(getCostStamina())
          != java.lang.Float.floatToIntBits(
              other.getCostStamina())) return false;
      if (getSkillId()
          != other.getSkillId()) return false;
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
      hash = (37 * hash) + COST_STAMINA_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getCostStamina());
      hash = (37 * hash) + SKILL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSkillId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify prototype) {
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
     *   CMD_ID = 378;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code EvtCostStaminaNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtCostStaminaNotify)
        emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.internal_static_EvtCostStaminaNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.internal_static_EvtCostStaminaNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify.class, emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify.newBuilder()
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
        costStamina_ = 0F;

        skillId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.internal_static_EvtCostStaminaNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify build() {
        emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify buildPartial() {
        emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify result = new emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify(this);
        result.costStamina_ = costStamina_;
        result.skillId_ = skillId_;
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
        if (other instanceof emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify) {
          return mergeFrom((emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify other) {
        if (other == emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify.getDefaultInstance()) return this;
        if (other.getCostStamina() != 0F) {
          setCostStamina(other.getCostStamina());
        }
        if (other.getSkillId() != 0) {
          setSkillId(other.getSkillId());
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
        emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float costStamina_ ;
      /**
       * <code>float cost_stamina = 4;</code>
       * @return The costStamina.
       */
      @java.lang.Override
      public float getCostStamina() {
        return costStamina_;
      }
      /**
       * <code>float cost_stamina = 4;</code>
       * @param value The costStamina to set.
       * @return This builder for chaining.
       */
      public Builder setCostStamina(float value) {
        
        costStamina_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float cost_stamina = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearCostStamina() {
        
        costStamina_ = 0F;
        onChanged();
        return this;
      }

      private int skillId_ ;
      /**
       * <code>uint32 skill_id = 1;</code>
       * @return The skillId.
       */
      @java.lang.Override
      public int getSkillId() {
        return skillId_;
      }
      /**
       * <code>uint32 skill_id = 1;</code>
       * @param value The skillId to set.
       * @return This builder for chaining.
       */
      public Builder setSkillId(int value) {
        
        skillId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 skill_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillId() {
        
        skillId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EvtCostStaminaNotify)
    }

    // @@protoc_insertion_point(class_scope:EvtCostStaminaNotify)
    private static final emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify();
    }

    public static emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtCostStaminaNotify>
        PARSER = new com.google.protobuf.AbstractParser<EvtCostStaminaNotify>() {
      @java.lang.Override
      public EvtCostStaminaNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EvtCostStaminaNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EvtCostStaminaNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtCostStaminaNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtCostStaminaNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtCostStaminaNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032EvtCostStaminaNotify.proto\">\n\024EvtCostS" +
      "taminaNotify\022\024\n\014cost_stamina\030\004 \001(\002\022\020\n\010sk" +
      "ill_id\030\001 \001(\rB\033\n\031emu.gingerps.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EvtCostStaminaNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtCostStaminaNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtCostStaminaNotify_descriptor,
        new java.lang.String[] { "CostStamina", "SkillId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
