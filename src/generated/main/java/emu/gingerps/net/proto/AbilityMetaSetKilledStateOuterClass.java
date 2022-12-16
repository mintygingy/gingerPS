// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityMetaSetKilledState.proto

package emu.gingerps.net.proto;

public final class AbilityMetaSetKilledStateOuterClass {
  private AbilityMetaSetKilledStateOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityMetaSetKilledStateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityMetaSetKilledState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool killed = 5;</code>
     * @return The killed.
     */
    boolean getKilled();
  }
  /**
   * Protobuf type {@code AbilityMetaSetKilledState}
   */
  public static final class AbilityMetaSetKilledState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityMetaSetKilledState)
      AbilityMetaSetKilledStateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityMetaSetKilledState.newBuilder() to construct.
    private AbilityMetaSetKilledState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityMetaSetKilledState() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityMetaSetKilledState();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AbilityMetaSetKilledState(
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
            case 40: {

              killed_ = input.readBool();
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
      return emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.internal_static_AbilityMetaSetKilledState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.internal_static_AbilityMetaSetKilledState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState.class, emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState.Builder.class);
    }

    public static final int KILLED_FIELD_NUMBER = 5;
    private boolean killed_;
    /**
     * <code>bool killed = 5;</code>
     * @return The killed.
     */
    @java.lang.Override
    public boolean getKilled() {
      return killed_;
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
      if (killed_ != false) {
        output.writeBool(5, killed_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (killed_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, killed_);
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
      if (!(obj instanceof emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState other = (emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState) obj;

      if (getKilled()
          != other.getKilled()) return false;
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
      hash = (37 * hash) + KILLED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getKilled());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState prototype) {
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
     * Protobuf type {@code AbilityMetaSetKilledState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityMetaSetKilledState)
        emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.internal_static_AbilityMetaSetKilledState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.internal_static_AbilityMetaSetKilledState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState.class, emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState.newBuilder()
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
        killed_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.internal_static_AbilityMetaSetKilledState_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState getDefaultInstanceForType() {
        return emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState build() {
        emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState buildPartial() {
        emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState result = new emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState(this);
        result.killed_ = killed_;
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
        if (other instanceof emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState) {
          return mergeFrom((emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState other) {
        if (other == emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState.getDefaultInstance()) return this;
        if (other.getKilled() != false) {
          setKilled(other.getKilled());
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
        emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean killed_ ;
      /**
       * <code>bool killed = 5;</code>
       * @return The killed.
       */
      @java.lang.Override
      public boolean getKilled() {
        return killed_;
      }
      /**
       * <code>bool killed = 5;</code>
       * @param value The killed to set.
       * @return This builder for chaining.
       */
      public Builder setKilled(boolean value) {
        
        killed_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool killed = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearKilled() {
        
        killed_ = false;
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


      // @@protoc_insertion_point(builder_scope:AbilityMetaSetKilledState)
    }

    // @@protoc_insertion_point(class_scope:AbilityMetaSetKilledState)
    private static final emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState();
    }

    public static emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityMetaSetKilledState>
        PARSER = new com.google.protobuf.AbstractParser<AbilityMetaSetKilledState>() {
      @java.lang.Override
      public AbilityMetaSetKilledState parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AbilityMetaSetKilledState(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AbilityMetaSetKilledState> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityMetaSetKilledState> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityMetaSetKilledState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityMetaSetKilledState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037AbilityMetaSetKilledState.proto\"+\n\031Abi" +
      "lityMetaSetKilledState\022\016\n\006killed\030\005 \001(\010B\033" +
      "\n\031emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AbilityMetaSetKilledState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityMetaSetKilledState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityMetaSetKilledState_descriptor,
        new java.lang.String[] { "Killed", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
