// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGMsgDuelDataChange.proto

package emu.gingerps.net.proto;

public final class GCGMsgDuelDataChangeOuterClass {
  private GCGMsgDuelDataChangeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGMsgDuelDataChangeOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGMsgDuelDataChange)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 round = 6;</code>
     * @return The round.
     */
    int getRound();
  }
  /**
   * Protobuf type {@code GCGMsgDuelDataChange}
   */
  public static final class GCGMsgDuelDataChange extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGMsgDuelDataChange)
      GCGMsgDuelDataChangeOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGMsgDuelDataChange.newBuilder() to construct.
    private GCGMsgDuelDataChange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGMsgDuelDataChange() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGMsgDuelDataChange();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGMsgDuelDataChange(
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

              round_ = input.readUInt32();
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
      return emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.internal_static_GCGMsgDuelDataChange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.internal_static_GCGMsgDuelDataChange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange.class, emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange.Builder.class);
    }

    public static final int ROUND_FIELD_NUMBER = 6;
    private int round_;
    /**
     * <code>uint32 round = 6;</code>
     * @return The round.
     */
    @java.lang.Override
    public int getRound() {
      return round_;
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
      if (round_ != 0) {
        output.writeUInt32(6, round_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (round_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, round_);
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
      if (!(obj instanceof emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange other = (emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange) obj;

      if (getRound()
          != other.getRound()) return false;
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
      hash = (37 * hash) + ROUND_FIELD_NUMBER;
      hash = (53 * hash) + getRound();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange prototype) {
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
     * Protobuf type {@code GCGMsgDuelDataChange}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGMsgDuelDataChange)
        emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChangeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.internal_static_GCGMsgDuelDataChange_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.internal_static_GCGMsgDuelDataChange_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange.class, emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange.newBuilder()
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
        round_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.internal_static_GCGMsgDuelDataChange_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange getDefaultInstanceForType() {
        return emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange build() {
        emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange buildPartial() {
        emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange result = new emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange(this);
        result.round_ = round_;
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
        if (other instanceof emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange) {
          return mergeFrom((emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange other) {
        if (other == emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange.getDefaultInstance()) return this;
        if (other.getRound() != 0) {
          setRound(other.getRound());
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
        emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int round_ ;
      /**
       * <code>uint32 round = 6;</code>
       * @return The round.
       */
      @java.lang.Override
      public int getRound() {
        return round_;
      }
      /**
       * <code>uint32 round = 6;</code>
       * @param value The round to set.
       * @return This builder for chaining.
       */
      public Builder setRound(int value) {
        
        round_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 round = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRound() {
        
        round_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGMsgDuelDataChange)
    }

    // @@protoc_insertion_point(class_scope:GCGMsgDuelDataChange)
    private static final emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange();
    }

    public static emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGMsgDuelDataChange>
        PARSER = new com.google.protobuf.AbstractParser<GCGMsgDuelDataChange>() {
      @java.lang.Override
      public GCGMsgDuelDataChange parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGMsgDuelDataChange(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGMsgDuelDataChange> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGMsgDuelDataChange> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGMsgDuelDataChange_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGMsgDuelDataChange_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032GCGMsgDuelDataChange.proto\"%\n\024GCGMsgDu" +
      "elDataChange\022\r\n\005round\030\006 \001(\rB\030\n\026emu.ginge" +
      "rps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGMsgDuelDataChange_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGMsgDuelDataChange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGMsgDuelDataChange_descriptor,
        new java.lang.String[] { "Round", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
