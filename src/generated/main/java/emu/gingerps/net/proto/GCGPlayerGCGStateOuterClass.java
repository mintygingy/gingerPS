// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGPlayerGCGState.proto

package emu.gingerps.net.proto;

public final class GCGPlayerGCGStateOuterClass {
  private GCGPlayerGCGStateOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGPlayerGCGStateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGPlayerGCGState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 uid = 14;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>bool Unk3300_GIKOMFNNAAA = 11;</code>
     * @return The unk3300GIKOMFNNAAA.
     */
    boolean getUnk3300GIKOMFNNAAA();

    /**
     * <code>bool Unk3300_DEKGMKCCGEG = 4;</code>
     * @return The unk3300DEKGMKCCGEG.
     */
    boolean getUnk3300DEKGMKCCGEG();
  }
  /**
   * Protobuf type {@code GCGPlayerGCGState}
   */
  public static final class GCGPlayerGCGState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGPlayerGCGState)
      GCGPlayerGCGStateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGPlayerGCGState.newBuilder() to construct.
    private GCGPlayerGCGState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGPlayerGCGState() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGPlayerGCGState();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.internal_static_GCGPlayerGCGState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.internal_static_GCGPlayerGCGState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState.class, emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 14;
    private int uid_ = 0;
    /**
     * <code>uint32 uid = 14;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int UNK3300_GIKOMFNNAAA_FIELD_NUMBER = 11;
    private boolean unk3300GIKOMFNNAAA_ = false;
    /**
     * <code>bool Unk3300_GIKOMFNNAAA = 11;</code>
     * @return The unk3300GIKOMFNNAAA.
     */
    @java.lang.Override
    public boolean getUnk3300GIKOMFNNAAA() {
      return unk3300GIKOMFNNAAA_;
    }

    public static final int UNK3300_DEKGMKCCGEG_FIELD_NUMBER = 4;
    private boolean unk3300DEKGMKCCGEG_ = false;
    /**
     * <code>bool Unk3300_DEKGMKCCGEG = 4;</code>
     * @return The unk3300DEKGMKCCGEG.
     */
    @java.lang.Override
    public boolean getUnk3300DEKGMKCCGEG() {
      return unk3300DEKGMKCCGEG_;
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
      if (unk3300DEKGMKCCGEG_ != false) {
        output.writeBool(4, unk3300DEKGMKCCGEG_);
      }
      if (unk3300GIKOMFNNAAA_ != false) {
        output.writeBool(11, unk3300GIKOMFNNAAA_);
      }
      if (uid_ != 0) {
        output.writeUInt32(14, uid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300DEKGMKCCGEG_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, unk3300DEKGMKCCGEG_);
      }
      if (unk3300GIKOMFNNAAA_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, unk3300GIKOMFNNAAA_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, uid_);
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
      if (!(obj instanceof emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState other = (emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState) obj;

      if (getUid()
          != other.getUid()) return false;
      if (getUnk3300GIKOMFNNAAA()
          != other.getUnk3300GIKOMFNNAAA()) return false;
      if (getUnk3300DEKGMKCCGEG()
          != other.getUnk3300DEKGMKCCGEG()) return false;
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
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (37 * hash) + UNK3300_GIKOMFNNAAA_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3300GIKOMFNNAAA());
      hash = (37 * hash) + UNK3300_DEKGMKCCGEG_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3300DEKGMKCCGEG());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState prototype) {
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
     * Protobuf type {@code GCGPlayerGCGState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGPlayerGCGState)
        emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.internal_static_GCGPlayerGCGState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.internal_static_GCGPlayerGCGState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState.class, emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState.newBuilder()
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
        uid_ = 0;
        unk3300GIKOMFNNAAA_ = false;
        unk3300DEKGMKCCGEG_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.internal_static_GCGPlayerGCGState_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState getDefaultInstanceForType() {
        return emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState build() {
        emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState buildPartial() {
        emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState result = new emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.uid_ = uid_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.unk3300GIKOMFNNAAA_ = unk3300GIKOMFNNAAA_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.unk3300DEKGMKCCGEG_ = unk3300DEKGMKCCGEG_;
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
        if (other instanceof emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState) {
          return mergeFrom((emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState other) {
        if (other == emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.getUnk3300GIKOMFNNAAA() != false) {
          setUnk3300GIKOMFNNAAA(other.getUnk3300GIKOMFNNAAA());
        }
        if (other.getUnk3300DEKGMKCCGEG() != false) {
          setUnk3300DEKGMKCCGEG(other.getUnk3300DEKGMKCCGEG());
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
              case 32: {
                unk3300DEKGMKCCGEG_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 32
              case 88: {
                unk3300GIKOMFNNAAA_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 88
              case 112: {
                uid_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 112
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

      private int uid_ ;
      /**
       * <code>uint32 uid = 14;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 14;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        uid_ = 0;
        onChanged();
        return this;
      }

      private boolean unk3300GIKOMFNNAAA_ ;
      /**
       * <code>bool Unk3300_GIKOMFNNAAA = 11;</code>
       * @return The unk3300GIKOMFNNAAA.
       */
      @java.lang.Override
      public boolean getUnk3300GIKOMFNNAAA() {
        return unk3300GIKOMFNNAAA_;
      }
      /**
       * <code>bool Unk3300_GIKOMFNNAAA = 11;</code>
       * @param value The unk3300GIKOMFNNAAA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300GIKOMFNNAAA(boolean value) {
        
        unk3300GIKOMFNNAAA_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3300_GIKOMFNNAAA = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300GIKOMFNNAAA() {
        bitField0_ = (bitField0_ & ~0x00000002);
        unk3300GIKOMFNNAAA_ = false;
        onChanged();
        return this;
      }

      private boolean unk3300DEKGMKCCGEG_ ;
      /**
       * <code>bool Unk3300_DEKGMKCCGEG = 4;</code>
       * @return The unk3300DEKGMKCCGEG.
       */
      @java.lang.Override
      public boolean getUnk3300DEKGMKCCGEG() {
        return unk3300DEKGMKCCGEG_;
      }
      /**
       * <code>bool Unk3300_DEKGMKCCGEG = 4;</code>
       * @param value The unk3300DEKGMKCCGEG to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300DEKGMKCCGEG(boolean value) {
        
        unk3300DEKGMKCCGEG_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3300_DEKGMKCCGEG = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300DEKGMKCCGEG() {
        bitField0_ = (bitField0_ & ~0x00000004);
        unk3300DEKGMKCCGEG_ = false;
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


      // @@protoc_insertion_point(builder_scope:GCGPlayerGCGState)
    }

    // @@protoc_insertion_point(class_scope:GCGPlayerGCGState)
    private static final emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState();
    }

    public static emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGPlayerGCGState>
        PARSER = new com.google.protobuf.AbstractParser<GCGPlayerGCGState>() {
      @java.lang.Override
      public GCGPlayerGCGState parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGPlayerGCGState> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGPlayerGCGState> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGPlayerGCGState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGPlayerGCGState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027GCGPlayerGCGState.proto\"Z\n\021GCGPlayerGC" +
      "GState\022\013\n\003uid\030\016 \001(\r\022\033\n\023Unk3300_GIKOMFNNA" +
      "AA\030\013 \001(\010\022\033\n\023Unk3300_DEKGMKCCGEG\030\004 \001(\010B\030\n" +
      "\026emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGPlayerGCGState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGPlayerGCGState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGPlayerGCGState_descriptor,
        new java.lang.String[] { "Uid", "Unk3300GIKOMFNNAAA", "Unk3300DEKGMKCCGEG", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
