// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SetFriendRemarkNameReq.proto

package emu.gingerps.net.proto;

public final class SetFriendRemarkNameReqOuterClass {
  private SetFriendRemarkNameReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetFriendRemarkNameReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetFriendRemarkNameReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 uid = 14;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>string remark_name = 10;</code>
     * @return The remarkName.
     */
    java.lang.String getRemarkName();
    /**
     * <code>string remark_name = 10;</code>
     * @return The bytes for remarkName.
     */
    com.google.protobuf.ByteString
        getRemarkNameBytes();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4011;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code SetFriendRemarkNameReq}
   */
  public static final class SetFriendRemarkNameReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetFriendRemarkNameReq)
      SetFriendRemarkNameReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetFriendRemarkNameReq.newBuilder() to construct.
    private SetFriendRemarkNameReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetFriendRemarkNameReq() {
      remarkName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SetFriendRemarkNameReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.internal_static_SetFriendRemarkNameReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.internal_static_SetFriendRemarkNameReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq.class, emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq.Builder.class);
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

    public static final int REMARK_NAME_FIELD_NUMBER = 10;
    @SuppressWarnings("serial")
    private volatile java.lang.Object remarkName_ = "";
    /**
     * <code>string remark_name = 10;</code>
     * @return The remarkName.
     */
    @java.lang.Override
    public java.lang.String getRemarkName() {
      java.lang.Object ref = remarkName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        remarkName_ = s;
        return s;
      }
    }
    /**
     * <code>string remark_name = 10;</code>
     * @return The bytes for remarkName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRemarkNameBytes() {
      java.lang.Object ref = remarkName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        remarkName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(remarkName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 10, remarkName_);
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(remarkName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, remarkName_);
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
      if (!(obj instanceof emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq other = (emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq) obj;

      if (getUid()
          != other.getUid()) return false;
      if (!getRemarkName()
          .equals(other.getRemarkName())) return false;
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
      hash = (37 * hash) + REMARK_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getRemarkName().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq prototype) {
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
     *   CMD_ID = 4011;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code SetFriendRemarkNameReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetFriendRemarkNameReq)
        emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.internal_static_SetFriendRemarkNameReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.internal_static_SetFriendRemarkNameReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq.class, emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq.newBuilder()
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
        remarkName_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.internal_static_SetFriendRemarkNameReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq build() {
        emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq buildPartial() {
        emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq result = new emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.uid_ = uid_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.remarkName_ = remarkName_;
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
        if (other instanceof emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq) {
          return mergeFrom((emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq other) {
        if (other == emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (!other.getRemarkName().isEmpty()) {
          remarkName_ = other.remarkName_;
          bitField0_ |= 0x00000002;
          onChanged();
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
              case 82: {
                remarkName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 82
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

      private java.lang.Object remarkName_ = "";
      /**
       * <code>string remark_name = 10;</code>
       * @return The remarkName.
       */
      public java.lang.String getRemarkName() {
        java.lang.Object ref = remarkName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          remarkName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string remark_name = 10;</code>
       * @return The bytes for remarkName.
       */
      public com.google.protobuf.ByteString
          getRemarkNameBytes() {
        java.lang.Object ref = remarkName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          remarkName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string remark_name = 10;</code>
       * @param value The remarkName to set.
       * @return This builder for chaining.
       */
      public Builder setRemarkName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        remarkName_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string remark_name = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearRemarkName() {
        remarkName_ = getDefaultInstance().getRemarkName();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string remark_name = 10;</code>
       * @param value The bytes for remarkName to set.
       * @return This builder for chaining.
       */
      public Builder setRemarkNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        remarkName_ = value;
        bitField0_ |= 0x00000002;
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


      // @@protoc_insertion_point(builder_scope:SetFriendRemarkNameReq)
    }

    // @@protoc_insertion_point(class_scope:SetFriendRemarkNameReq)
    private static final emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq();
    }

    public static emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetFriendRemarkNameReq>
        PARSER = new com.google.protobuf.AbstractParser<SetFriendRemarkNameReq>() {
      @java.lang.Override
      public SetFriendRemarkNameReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<SetFriendRemarkNameReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SetFriendRemarkNameReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.SetFriendRemarkNameReqOuterClass.SetFriendRemarkNameReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetFriendRemarkNameReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetFriendRemarkNameReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034SetFriendRemarkNameReq.proto\":\n\026SetFri" +
      "endRemarkNameReq\022\013\n\003uid\030\016 \001(\r\022\023\n\013remark_" +
      "name\030\n \001(\tB\030\n\026emu.gingerps.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SetFriendRemarkNameReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetFriendRemarkNameReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetFriendRemarkNameReq_descriptor,
        new java.lang.String[] { "Uid", "RemarkName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
