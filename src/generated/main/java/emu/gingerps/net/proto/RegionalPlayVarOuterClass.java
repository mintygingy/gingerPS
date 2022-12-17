// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RegionalPlayVar.proto

package emu.gingerps.net.proto;

public final class RegionalPlayVarOuterClass {
  private RegionalPlayVarOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RegionalPlayVarOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RegionalPlayVar)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 type = 5;</code>
     * @return The type.
     */
    int getType();

    /**
     * <code>float Unk3300_FOBMHHNIPPH = 4;</code>
     * @return The unk3300FOBMHHNIPPH.
     */
    float getUnk3300FOBMHHNIPPH();

    /**
     * <code>float Unk3300_PIDHFABKIJN = 3;</code>
     * @return The unk3300PIDHFABKIJN.
     */
    float getUnk3300PIDHFABKIJN();

    /**
     * <code>float value = 2;</code>
     * @return The value.
     */
    float getValue();
  }
  /**
   * Protobuf type {@code RegionalPlayVar}
   */
  public static final class RegionalPlayVar extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RegionalPlayVar)
      RegionalPlayVarOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RegionalPlayVar.newBuilder() to construct.
    private RegionalPlayVar(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RegionalPlayVar() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RegionalPlayVar();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RegionalPlayVar(
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
            case 21: {

              value_ = input.readFloat();
              break;
            }
            case 29: {

              unk3300PIDHFABKIJN_ = input.readFloat();
              break;
            }
            case 37: {

              unk3300FOBMHHNIPPH_ = input.readFloat();
              break;
            }
            case 40: {

              type_ = input.readUInt32();
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
      return emu.gingerps.net.proto.RegionalPlayVarOuterClass.internal_static_RegionalPlayVar_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.RegionalPlayVarOuterClass.internal_static_RegionalPlayVar_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar.class, emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar.Builder.class);
    }

    public static final int TYPE_FIELD_NUMBER = 5;
    private int type_;
    /**
     * <code>uint32 type = 5;</code>
     * @return The type.
     */
    @java.lang.Override
    public int getType() {
      return type_;
    }

    public static final int UNK3300_FOBMHHNIPPH_FIELD_NUMBER = 4;
    private float unk3300FOBMHHNIPPH_;
    /**
     * <code>float Unk3300_FOBMHHNIPPH = 4;</code>
     * @return The unk3300FOBMHHNIPPH.
     */
    @java.lang.Override
    public float getUnk3300FOBMHHNIPPH() {
      return unk3300FOBMHHNIPPH_;
    }

    public static final int UNK3300_PIDHFABKIJN_FIELD_NUMBER = 3;
    private float unk3300PIDHFABKIJN_;
    /**
     * <code>float Unk3300_PIDHFABKIJN = 3;</code>
     * @return The unk3300PIDHFABKIJN.
     */
    @java.lang.Override
    public float getUnk3300PIDHFABKIJN() {
      return unk3300PIDHFABKIJN_;
    }

    public static final int VALUE_FIELD_NUMBER = 2;
    private float value_;
    /**
     * <code>float value = 2;</code>
     * @return The value.
     */
    @java.lang.Override
    public float getValue() {
      return value_;
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
      if (value_ != 0F) {
        output.writeFloat(2, value_);
      }
      if (unk3300PIDHFABKIJN_ != 0F) {
        output.writeFloat(3, unk3300PIDHFABKIJN_);
      }
      if (unk3300FOBMHHNIPPH_ != 0F) {
        output.writeFloat(4, unk3300FOBMHHNIPPH_);
      }
      if (type_ != 0) {
        output.writeUInt32(5, type_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (value_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, value_);
      }
      if (unk3300PIDHFABKIJN_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(3, unk3300PIDHFABKIJN_);
      }
      if (unk3300FOBMHHNIPPH_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(4, unk3300FOBMHHNIPPH_);
      }
      if (type_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, type_);
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
      if (!(obj instanceof emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar other = (emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar) obj;

      if (getType()
          != other.getType()) return false;
      if (java.lang.Float.floatToIntBits(getUnk3300FOBMHHNIPPH())
          != java.lang.Float.floatToIntBits(
              other.getUnk3300FOBMHHNIPPH())) return false;
      if (java.lang.Float.floatToIntBits(getUnk3300PIDHFABKIJN())
          != java.lang.Float.floatToIntBits(
              other.getUnk3300PIDHFABKIJN())) return false;
      if (java.lang.Float.floatToIntBits(getValue())
          != java.lang.Float.floatToIntBits(
              other.getValue())) return false;
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
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType();
      hash = (37 * hash) + UNK3300_FOBMHHNIPPH_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getUnk3300FOBMHHNIPPH());
      hash = (37 * hash) + UNK3300_PIDHFABKIJN_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getUnk3300PIDHFABKIJN());
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getValue());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar prototype) {
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
     * Protobuf type {@code RegionalPlayVar}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RegionalPlayVar)
        emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVarOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.RegionalPlayVarOuterClass.internal_static_RegionalPlayVar_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.RegionalPlayVarOuterClass.internal_static_RegionalPlayVar_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar.class, emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar.newBuilder()
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
        type_ = 0;

        unk3300FOBMHHNIPPH_ = 0F;

        unk3300PIDHFABKIJN_ = 0F;

        value_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.RegionalPlayVarOuterClass.internal_static_RegionalPlayVar_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar getDefaultInstanceForType() {
        return emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar build() {
        emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar buildPartial() {
        emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar result = new emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar(this);
        result.type_ = type_;
        result.unk3300FOBMHHNIPPH_ = unk3300FOBMHHNIPPH_;
        result.unk3300PIDHFABKIJN_ = unk3300PIDHFABKIJN_;
        result.value_ = value_;
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
        if (other instanceof emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar) {
          return mergeFrom((emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar other) {
        if (other == emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar.getDefaultInstance()) return this;
        if (other.getType() != 0) {
          setType(other.getType());
        }
        if (other.getUnk3300FOBMHHNIPPH() != 0F) {
          setUnk3300FOBMHHNIPPH(other.getUnk3300FOBMHHNIPPH());
        }
        if (other.getUnk3300PIDHFABKIJN() != 0F) {
          setUnk3300PIDHFABKIJN(other.getUnk3300PIDHFABKIJN());
        }
        if (other.getValue() != 0F) {
          setValue(other.getValue());
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
        emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int type_ ;
      /**
       * <code>uint32 type = 5;</code>
       * @return The type.
       */
      @java.lang.Override
      public int getType() {
        return type_;
      }
      /**
       * <code>uint32 type = 5;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(int value) {
        
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 type = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private float unk3300FOBMHHNIPPH_ ;
      /**
       * <code>float Unk3300_FOBMHHNIPPH = 4;</code>
       * @return The unk3300FOBMHHNIPPH.
       */
      @java.lang.Override
      public float getUnk3300FOBMHHNIPPH() {
        return unk3300FOBMHHNIPPH_;
      }
      /**
       * <code>float Unk3300_FOBMHHNIPPH = 4;</code>
       * @param value The unk3300FOBMHHNIPPH to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300FOBMHHNIPPH(float value) {
        
        unk3300FOBMHHNIPPH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float Unk3300_FOBMHHNIPPH = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300FOBMHHNIPPH() {
        
        unk3300FOBMHHNIPPH_ = 0F;
        onChanged();
        return this;
      }

      private float unk3300PIDHFABKIJN_ ;
      /**
       * <code>float Unk3300_PIDHFABKIJN = 3;</code>
       * @return The unk3300PIDHFABKIJN.
       */
      @java.lang.Override
      public float getUnk3300PIDHFABKIJN() {
        return unk3300PIDHFABKIJN_;
      }
      /**
       * <code>float Unk3300_PIDHFABKIJN = 3;</code>
       * @param value The unk3300PIDHFABKIJN to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300PIDHFABKIJN(float value) {
        
        unk3300PIDHFABKIJN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float Unk3300_PIDHFABKIJN = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300PIDHFABKIJN() {
        
        unk3300PIDHFABKIJN_ = 0F;
        onChanged();
        return this;
      }

      private float value_ ;
      /**
       * <code>float value = 2;</code>
       * @return The value.
       */
      @java.lang.Override
      public float getValue() {
        return value_;
      }
      /**
       * <code>float value = 2;</code>
       * @param value The value to set.
       * @return This builder for chaining.
       */
      public Builder setValue(float value) {
        
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float value = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearValue() {
        
        value_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:RegionalPlayVar)
    }

    // @@protoc_insertion_point(class_scope:RegionalPlayVar)
    private static final emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar();
    }

    public static emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RegionalPlayVar>
        PARSER = new com.google.protobuf.AbstractParser<RegionalPlayVar>() {
      @java.lang.Override
      public RegionalPlayVar parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RegionalPlayVar(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RegionalPlayVar> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RegionalPlayVar> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.RegionalPlayVarOuterClass.RegionalPlayVar getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RegionalPlayVar_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RegionalPlayVar_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025RegionalPlayVar.proto\"h\n\017RegionalPlayV" +
      "ar\022\014\n\004type\030\005 \001(\r\022\033\n\023Unk3300_FOBMHHNIPPH\030" +
      "\004 \001(\002\022\033\n\023Unk3300_PIDHFABKIJN\030\003 \001(\002\022\r\n\005va" +
      "lue\030\002 \001(\002B\030\n\026emu.gingerps.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RegionalPlayVar_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RegionalPlayVar_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RegionalPlayVar_descriptor,
        new java.lang.String[] { "Type", "Unk3300FOBMHHNIPPH", "Unk3300PIDHFABKIJN", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
