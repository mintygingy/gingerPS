// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarWearFlycloakRsp.proto

package emu.gingerps.net.proto;

public final class AvatarWearFlycloakRspOuterClass {
  private AvatarWearFlycloakRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarWearFlycloakRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarWearFlycloakRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint64 avatar_guid = 14;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();

    /**
     * <code>uint32 flycloak_id = 1;</code>
     * @return The flycloakId.
     */
    int getFlycloakId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 1613;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code AvatarWearFlycloakRsp}
   */
  public static final class AvatarWearFlycloakRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarWearFlycloakRsp)
      AvatarWearFlycloakRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarWearFlycloakRsp.newBuilder() to construct.
    private AvatarWearFlycloakRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarWearFlycloakRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarWearFlycloakRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.internal_static_AvatarWearFlycloakRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.internal_static_AvatarWearFlycloakRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp.class, emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 12;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 14;
    private long avatarGuid_ = 0L;
    /**
     * <code>uint64 avatar_guid = 14;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
    }

    public static final int FLYCLOAK_ID_FIELD_NUMBER = 1;
    private int flycloakId_ = 0;
    /**
     * <code>uint32 flycloak_id = 1;</code>
     * @return The flycloakId.
     */
    @java.lang.Override
    public int getFlycloakId() {
      return flycloakId_;
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
      if (flycloakId_ != 0) {
        output.writeUInt32(1, flycloakId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(12, retcode_);
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(14, avatarGuid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (flycloakId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, flycloakId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, retcode_);
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(14, avatarGuid_);
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
      if (!(obj instanceof emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp other = (emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
      if (getFlycloakId()
          != other.getFlycloakId()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (37 * hash) + FLYCLOAK_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFlycloakId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp prototype) {
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
     *   CMD_ID = 1613;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code AvatarWearFlycloakRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarWearFlycloakRsp)
        emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.internal_static_AvatarWearFlycloakRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.internal_static_AvatarWearFlycloakRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp.class, emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp.newBuilder()
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
        retcode_ = 0;
        avatarGuid_ = 0L;
        flycloakId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.internal_static_AvatarWearFlycloakRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp build() {
        emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp buildPartial() {
        emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp result = new emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.avatarGuid_ = avatarGuid_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.flycloakId_ = flycloakId_;
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
        if (other instanceof emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp) {
          return mergeFrom((emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp other) {
        if (other == emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
        }
        if (other.getFlycloakId() != 0) {
          setFlycloakId(other.getFlycloakId());
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
                flycloakId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 8
              case 96: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 96
              case 112: {
                avatarGuid_ = input.readUInt64();
                bitField0_ |= 0x00000002;
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 12;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 14;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 14;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        avatarGuid_ = 0L;
        onChanged();
        return this;
      }

      private int flycloakId_ ;
      /**
       * <code>uint32 flycloak_id = 1;</code>
       * @return The flycloakId.
       */
      @java.lang.Override
      public int getFlycloakId() {
        return flycloakId_;
      }
      /**
       * <code>uint32 flycloak_id = 1;</code>
       * @param value The flycloakId to set.
       * @return This builder for chaining.
       */
      public Builder setFlycloakId(int value) {
        
        flycloakId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 flycloak_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFlycloakId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        flycloakId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AvatarWearFlycloakRsp)
    }

    // @@protoc_insertion_point(class_scope:AvatarWearFlycloakRsp)
    private static final emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp();
    }

    public static emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarWearFlycloakRsp>
        PARSER = new com.google.protobuf.AbstractParser<AvatarWearFlycloakRsp>() {
      @java.lang.Override
      public AvatarWearFlycloakRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<AvatarWearFlycloakRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarWearFlycloakRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarWearFlycloakRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarWearFlycloakRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033AvatarWearFlycloakRsp.proto\"R\n\025AvatarW" +
      "earFlycloakRsp\022\017\n\007retcode\030\014 \001(\005\022\023\n\013avata" +
      "r_guid\030\016 \001(\004\022\023\n\013flycloak_id\030\001 \001(\rB\030\n\026emu" +
      ".gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarWearFlycloakRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarWearFlycloakRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarWearFlycloakRsp_descriptor,
        new java.lang.String[] { "Retcode", "AvatarGuid", "FlycloakId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
