// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IrodoriEditFlowerCombinationRsp.proto

package emu.gingerps.net.proto;

public final class IrodoriEditFlowerCombinationRspOuterClass {
  private IrodoriEditFlowerCombinationRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IrodoriEditFlowerCombinationRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IrodoriEditFlowerCombinationRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>bool Unk3300_IAPLHBKJLBF = 8;</code>
     * @return The unk3300IAPLHBKJLBF.
     */
    boolean getUnk3300IAPLHBKJLBF();

    /**
     * <code>bool Unk3300_DBBGPOMDKPK = 9;</code>
     * @return The unk3300DBBGPOMDKPK.
     */
    boolean getUnk3300DBBGPOMDKPK();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8454;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code IrodoriEditFlowerCombinationRsp}
   */
  public static final class IrodoriEditFlowerCombinationRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IrodoriEditFlowerCombinationRsp)
      IrodoriEditFlowerCombinationRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IrodoriEditFlowerCombinationRsp.newBuilder() to construct.
    private IrodoriEditFlowerCombinationRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IrodoriEditFlowerCombinationRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IrodoriEditFlowerCombinationRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.internal_static_IrodoriEditFlowerCombinationRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.internal_static_IrodoriEditFlowerCombinationRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp.class, emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 2;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int UNK3300_IAPLHBKJLBF_FIELD_NUMBER = 8;
    private boolean unk3300IAPLHBKJLBF_ = false;
    /**
     * <code>bool Unk3300_IAPLHBKJLBF = 8;</code>
     * @return The unk3300IAPLHBKJLBF.
     */
    @java.lang.Override
    public boolean getUnk3300IAPLHBKJLBF() {
      return unk3300IAPLHBKJLBF_;
    }

    public static final int UNK3300_DBBGPOMDKPK_FIELD_NUMBER = 9;
    private boolean unk3300DBBGPOMDKPK_ = false;
    /**
     * <code>bool Unk3300_DBBGPOMDKPK = 9;</code>
     * @return The unk3300DBBGPOMDKPK.
     */
    @java.lang.Override
    public boolean getUnk3300DBBGPOMDKPK() {
      return unk3300DBBGPOMDKPK_;
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
      if (retcode_ != 0) {
        output.writeInt32(2, retcode_);
      }
      if (unk3300IAPLHBKJLBF_ != false) {
        output.writeBool(8, unk3300IAPLHBKJLBF_);
      }
      if (unk3300DBBGPOMDKPK_ != false) {
        output.writeBool(9, unk3300DBBGPOMDKPK_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, retcode_);
      }
      if (unk3300IAPLHBKJLBF_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, unk3300IAPLHBKJLBF_);
      }
      if (unk3300DBBGPOMDKPK_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, unk3300DBBGPOMDKPK_);
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
      if (!(obj instanceof emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp other = (emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getUnk3300IAPLHBKJLBF()
          != other.getUnk3300IAPLHBKJLBF()) return false;
      if (getUnk3300DBBGPOMDKPK()
          != other.getUnk3300DBBGPOMDKPK()) return false;
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
      hash = (37 * hash) + UNK3300_IAPLHBKJLBF_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3300IAPLHBKJLBF());
      hash = (37 * hash) + UNK3300_DBBGPOMDKPK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3300DBBGPOMDKPK());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp prototype) {
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
     *   CMD_ID = 8454;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code IrodoriEditFlowerCombinationRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IrodoriEditFlowerCombinationRsp)
        emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.internal_static_IrodoriEditFlowerCombinationRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.internal_static_IrodoriEditFlowerCombinationRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp.class, emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp.newBuilder()
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
        unk3300IAPLHBKJLBF_ = false;
        unk3300DBBGPOMDKPK_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.internal_static_IrodoriEditFlowerCombinationRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp build() {
        emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp buildPartial() {
        emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp result = new emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.unk3300IAPLHBKJLBF_ = unk3300IAPLHBKJLBF_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.unk3300DBBGPOMDKPK_ = unk3300DBBGPOMDKPK_;
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
        if (other instanceof emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp) {
          return mergeFrom((emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp other) {
        if (other == emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getUnk3300IAPLHBKJLBF() != false) {
          setUnk3300IAPLHBKJLBF(other.getUnk3300IAPLHBKJLBF());
        }
        if (other.getUnk3300DBBGPOMDKPK() != false) {
          setUnk3300DBBGPOMDKPK(other.getUnk3300DBBGPOMDKPK());
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
              case 16: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 16
              case 64: {
                unk3300IAPLHBKJLBF_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 64
              case 72: {
                unk3300DBBGPOMDKPK_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 72
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
       * <code>int32 retcode = 2;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 2;</code>
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
       * <code>int32 retcode = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private boolean unk3300IAPLHBKJLBF_ ;
      /**
       * <code>bool Unk3300_IAPLHBKJLBF = 8;</code>
       * @return The unk3300IAPLHBKJLBF.
       */
      @java.lang.Override
      public boolean getUnk3300IAPLHBKJLBF() {
        return unk3300IAPLHBKJLBF_;
      }
      /**
       * <code>bool Unk3300_IAPLHBKJLBF = 8;</code>
       * @param value The unk3300IAPLHBKJLBF to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300IAPLHBKJLBF(boolean value) {
        
        unk3300IAPLHBKJLBF_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3300_IAPLHBKJLBF = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300IAPLHBKJLBF() {
        bitField0_ = (bitField0_ & ~0x00000002);
        unk3300IAPLHBKJLBF_ = false;
        onChanged();
        return this;
      }

      private boolean unk3300DBBGPOMDKPK_ ;
      /**
       * <code>bool Unk3300_DBBGPOMDKPK = 9;</code>
       * @return The unk3300DBBGPOMDKPK.
       */
      @java.lang.Override
      public boolean getUnk3300DBBGPOMDKPK() {
        return unk3300DBBGPOMDKPK_;
      }
      /**
       * <code>bool Unk3300_DBBGPOMDKPK = 9;</code>
       * @param value The unk3300DBBGPOMDKPK to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300DBBGPOMDKPK(boolean value) {
        
        unk3300DBBGPOMDKPK_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3300_DBBGPOMDKPK = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300DBBGPOMDKPK() {
        bitField0_ = (bitField0_ & ~0x00000004);
        unk3300DBBGPOMDKPK_ = false;
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


      // @@protoc_insertion_point(builder_scope:IrodoriEditFlowerCombinationRsp)
    }

    // @@protoc_insertion_point(class_scope:IrodoriEditFlowerCombinationRsp)
    private static final emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp();
    }

    public static emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IrodoriEditFlowerCombinationRsp>
        PARSER = new com.google.protobuf.AbstractParser<IrodoriEditFlowerCombinationRsp>() {
      @java.lang.Override
      public IrodoriEditFlowerCombinationRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<IrodoriEditFlowerCombinationRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IrodoriEditFlowerCombinationRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.IrodoriEditFlowerCombinationRspOuterClass.IrodoriEditFlowerCombinationRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IrodoriEditFlowerCombinationRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IrodoriEditFlowerCombinationRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%IrodoriEditFlowerCombinationRsp.proto\"" +
      "l\n\037IrodoriEditFlowerCombinationRsp\022\017\n\007re" +
      "tcode\030\002 \001(\005\022\033\n\023Unk3300_IAPLHBKJLBF\030\010 \001(\010" +
      "\022\033\n\023Unk3300_DBBGPOMDKPK\030\t \001(\010B\030\n\026emu.gin" +
      "gerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_IrodoriEditFlowerCombinationRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IrodoriEditFlowerCombinationRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IrodoriEditFlowerCombinationRsp_descriptor,
        new java.lang.String[] { "Retcode", "Unk3300IAPLHBKJLBF", "Unk3300DBBGPOMDKPK", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
