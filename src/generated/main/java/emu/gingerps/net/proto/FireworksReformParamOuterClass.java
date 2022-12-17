// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FireworksReformParam.proto

package emu.gingerps.net.proto;

public final class FireworksReformParamOuterClass {
  private FireworksReformParamOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FireworksReformParamOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FireworksReformParam)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 value = 1;</code>
     * @return The value.
     */
    int getValue();

    /**
     * <code>.FireworksReformParamType type = 5;</code>
     * @return The enum numeric value on the wire for type.
     */
    int getTypeValue();
    /**
     * <code>.FireworksReformParamType type = 5;</code>
     * @return The type.
     */
    emu.gingerps.net.proto.FireworksReformParamTypeOuterClass.FireworksReformParamType getType();
  }
  /**
   * Protobuf type {@code FireworksReformParam}
   */
  public static final class FireworksReformParam extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FireworksReformParam)
      FireworksReformParamOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FireworksReformParam.newBuilder() to construct.
    private FireworksReformParam(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FireworksReformParam() {
      type_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FireworksReformParam();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.FireworksReformParamOuterClass.internal_static_FireworksReformParam_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.FireworksReformParamOuterClass.internal_static_FireworksReformParam_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam.class, emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam.Builder.class);
    }

    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_ = 0;
    /**
     * <code>int32 value = 1;</code>
     * @return The value.
     */
    @java.lang.Override
    public int getValue() {
      return value_;
    }

    public static final int TYPE_FIELD_NUMBER = 5;
    private int type_ = 0;
    /**
     * <code>.FireworksReformParamType type = 5;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.FireworksReformParamType type = 5;</code>
     * @return The type.
     */
    @java.lang.Override public emu.gingerps.net.proto.FireworksReformParamTypeOuterClass.FireworksReformParamType getType() {
      emu.gingerps.net.proto.FireworksReformParamTypeOuterClass.FireworksReformParamType result = emu.gingerps.net.proto.FireworksReformParamTypeOuterClass.FireworksReformParamType.forNumber(type_);
      return result == null ? emu.gingerps.net.proto.FireworksReformParamTypeOuterClass.FireworksReformParamType.UNRECOGNIZED : result;
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
      if (value_ != 0) {
        output.writeInt32(1, value_);
      }
      if (type_ != emu.gingerps.net.proto.FireworksReformParamTypeOuterClass.FireworksReformParamType.FIREWORKS_REFORM_PARAM_TYPE_NONE.getNumber()) {
        output.writeEnum(5, type_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (value_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, value_);
      }
      if (type_ != emu.gingerps.net.proto.FireworksReformParamTypeOuterClass.FireworksReformParamType.FIREWORKS_REFORM_PARAM_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, type_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam other = (emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam) obj;

      if (getValue()
          != other.getValue()) return false;
      if (type_ != other.type_) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam prototype) {
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
     * Protobuf type {@code FireworksReformParam}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FireworksReformParam)
        emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParamOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.FireworksReformParamOuterClass.internal_static_FireworksReformParam_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.FireworksReformParamOuterClass.internal_static_FireworksReformParam_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam.class, emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        value_ = 0;
        type_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.FireworksReformParamOuterClass.internal_static_FireworksReformParam_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam getDefaultInstanceForType() {
        return emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam build() {
        emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam buildPartial() {
        emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam result = new emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.value_ = value_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.type_ = type_;
        }
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
        if (other instanceof emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam) {
          return mergeFrom((emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam other) {
        if (other == emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam.getDefaultInstance()) return this;
        if (other.getValue() != 0) {
          setValue(other.getValue());
        }
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                value_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 40: {
                type_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 40
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int value_ ;
      /**
       * <code>int32 value = 1;</code>
       * @return The value.
       */
      @java.lang.Override
      public int getValue() {
        return value_;
      }
      /**
       * <code>int32 value = 1;</code>
       * @param value The value to set.
       * @return This builder for chaining.
       */
      public Builder setValue(int value) {
        
        value_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 value = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearValue() {
        bitField0_ = (bitField0_ & ~0x00000001);
        value_ = 0;
        onChanged();
        return this;
      }

      private int type_ = 0;
      /**
       * <code>.FireworksReformParamType type = 5;</code>
       * @return The enum numeric value on the wire for type.
       */
      @java.lang.Override public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.FireworksReformParamType type = 5;</code>
       * @param value The enum numeric value on the wire for type to set.
       * @return This builder for chaining.
       */
      public Builder setTypeValue(int value) {
        type_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.FireworksReformParamType type = 5;</code>
       * @return The type.
       */
      @java.lang.Override
      public emu.gingerps.net.proto.FireworksReformParamTypeOuterClass.FireworksReformParamType getType() {
        emu.gingerps.net.proto.FireworksReformParamTypeOuterClass.FireworksReformParamType result = emu.gingerps.net.proto.FireworksReformParamTypeOuterClass.FireworksReformParamType.forNumber(type_);
        return result == null ? emu.gingerps.net.proto.FireworksReformParamTypeOuterClass.FireworksReformParamType.UNRECOGNIZED : result;
      }
      /**
       * <code>.FireworksReformParamType type = 5;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(emu.gingerps.net.proto.FireworksReformParamTypeOuterClass.FireworksReformParamType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.FireworksReformParamType type = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FireworksReformParam)
    }

    // @@protoc_insertion_point(class_scope:FireworksReformParam)
    private static final emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam();
    }

    public static emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FireworksReformParam>
        PARSER = new com.google.protobuf.AbstractParser<FireworksReformParam>() {
      @java.lang.Override
      public FireworksReformParam parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<FireworksReformParam> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FireworksReformParam> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.FireworksReformParamOuterClass.FireworksReformParam getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FireworksReformParam_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FireworksReformParam_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032FireworksReformParam.proto\032\036FireworksR" +
      "eformParamType.proto\"N\n\024FireworksReformP" +
      "aram\022\r\n\005value\030\001 \001(\005\022\'\n\004type\030\005 \001(\0162\031.Fire" +
      "worksReformParamTypeB\030\n\026emu.gingerps.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.FireworksReformParamTypeOuterClass.getDescriptor(),
        });
    internal_static_FireworksReformParam_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FireworksReformParam_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FireworksReformParam_descriptor,
        new java.lang.String[] { "Value", "Type", });
    emu.gingerps.net.proto.FireworksReformParamTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
