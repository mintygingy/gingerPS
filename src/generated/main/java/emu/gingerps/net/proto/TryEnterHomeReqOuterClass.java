// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TryEnterHomeReq.proto

package emu.gingerps.net.proto;

public final class TryEnterHomeReqOuterClass {
  private TryEnterHomeReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TryEnterHomeReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TryEnterHomeReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_transfer_to_safe_point = 13;</code>
     * @return The isTransferToSafePoint.
     */
    boolean getIsTransferToSafePoint();

    /**
     * <code>uint32 target_point = 10;</code>
     * @return The targetPoint.
     */
    int getTargetPoint();

    /**
     * <code>uint32 target_uid = 1;</code>
     * @return The targetUid.
     */
    int getTargetUid();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4648;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code TryEnterHomeReq}
   */
  public static final class TryEnterHomeReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TryEnterHomeReq)
      TryEnterHomeReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TryEnterHomeReq.newBuilder() to construct.
    private TryEnterHomeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TryEnterHomeReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TryEnterHomeReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.TryEnterHomeReqOuterClass.internal_static_TryEnterHomeReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.TryEnterHomeReqOuterClass.internal_static_TryEnterHomeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.class, emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.Builder.class);
    }

    public static final int IS_TRANSFER_TO_SAFE_POINT_FIELD_NUMBER = 13;
    private boolean isTransferToSafePoint_ = false;
    /**
     * <code>bool is_transfer_to_safe_point = 13;</code>
     * @return The isTransferToSafePoint.
     */
    @java.lang.Override
    public boolean getIsTransferToSafePoint() {
      return isTransferToSafePoint_;
    }

    public static final int TARGET_POINT_FIELD_NUMBER = 10;
    private int targetPoint_ = 0;
    /**
     * <code>uint32 target_point = 10;</code>
     * @return The targetPoint.
     */
    @java.lang.Override
    public int getTargetPoint() {
      return targetPoint_;
    }

    public static final int TARGET_UID_FIELD_NUMBER = 1;
    private int targetUid_ = 0;
    /**
     * <code>uint32 target_uid = 1;</code>
     * @return The targetUid.
     */
    @java.lang.Override
    public int getTargetUid() {
      return targetUid_;
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
      if (targetUid_ != 0) {
        output.writeUInt32(1, targetUid_);
      }
      if (targetPoint_ != 0) {
        output.writeUInt32(10, targetPoint_);
      }
      if (isTransferToSafePoint_ != false) {
        output.writeBool(13, isTransferToSafePoint_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (targetUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, targetUid_);
      }
      if (targetPoint_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, targetPoint_);
      }
      if (isTransferToSafePoint_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isTransferToSafePoint_);
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
      if (!(obj instanceof emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq other = (emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq) obj;

      if (getIsTransferToSafePoint()
          != other.getIsTransferToSafePoint()) return false;
      if (getTargetPoint()
          != other.getTargetPoint()) return false;
      if (getTargetUid()
          != other.getTargetUid()) return false;
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
      hash = (37 * hash) + IS_TRANSFER_TO_SAFE_POINT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsTransferToSafePoint());
      hash = (37 * hash) + TARGET_POINT_FIELD_NUMBER;
      hash = (53 * hash) + getTargetPoint();
      hash = (37 * hash) + TARGET_UID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetUid();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq prototype) {
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
     *   CMD_ID = 4648;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code TryEnterHomeReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TryEnterHomeReq)
        emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.TryEnterHomeReqOuterClass.internal_static_TryEnterHomeReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.TryEnterHomeReqOuterClass.internal_static_TryEnterHomeReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.class, emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.newBuilder()
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
        isTransferToSafePoint_ = false;
        targetPoint_ = 0;
        targetUid_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.TryEnterHomeReqOuterClass.internal_static_TryEnterHomeReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq build() {
        emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq buildPartial() {
        emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq result = new emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isTransferToSafePoint_ = isTransferToSafePoint_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.targetPoint_ = targetPoint_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.targetUid_ = targetUid_;
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
        if (other instanceof emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq) {
          return mergeFrom((emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq other) {
        if (other == emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.getDefaultInstance()) return this;
        if (other.getIsTransferToSafePoint() != false) {
          setIsTransferToSafePoint(other.getIsTransferToSafePoint());
        }
        if (other.getTargetPoint() != 0) {
          setTargetPoint(other.getTargetPoint());
        }
        if (other.getTargetUid() != 0) {
          setTargetUid(other.getTargetUid());
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
                targetUid_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 8
              case 80: {
                targetPoint_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 80
              case 104: {
                isTransferToSafePoint_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 104
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

      private boolean isTransferToSafePoint_ ;
      /**
       * <code>bool is_transfer_to_safe_point = 13;</code>
       * @return The isTransferToSafePoint.
       */
      @java.lang.Override
      public boolean getIsTransferToSafePoint() {
        return isTransferToSafePoint_;
      }
      /**
       * <code>bool is_transfer_to_safe_point = 13;</code>
       * @param value The isTransferToSafePoint to set.
       * @return This builder for chaining.
       */
      public Builder setIsTransferToSafePoint(boolean value) {
        
        isTransferToSafePoint_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_transfer_to_safe_point = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsTransferToSafePoint() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isTransferToSafePoint_ = false;
        onChanged();
        return this;
      }

      private int targetPoint_ ;
      /**
       * <code>uint32 target_point = 10;</code>
       * @return The targetPoint.
       */
      @java.lang.Override
      public int getTargetPoint() {
        return targetPoint_;
      }
      /**
       * <code>uint32 target_point = 10;</code>
       * @param value The targetPoint to set.
       * @return This builder for chaining.
       */
      public Builder setTargetPoint(int value) {
        
        targetPoint_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_point = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetPoint() {
        bitField0_ = (bitField0_ & ~0x00000002);
        targetPoint_ = 0;
        onChanged();
        return this;
      }

      private int targetUid_ ;
      /**
       * <code>uint32 target_uid = 1;</code>
       * @return The targetUid.
       */
      @java.lang.Override
      public int getTargetUid() {
        return targetUid_;
      }
      /**
       * <code>uint32 target_uid = 1;</code>
       * @param value The targetUid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetUid(int value) {
        
        targetUid_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_uid = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetUid() {
        bitField0_ = (bitField0_ & ~0x00000004);
        targetUid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TryEnterHomeReq)
    }

    // @@protoc_insertion_point(class_scope:TryEnterHomeReq)
    private static final emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq();
    }

    public static emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TryEnterHomeReq>
        PARSER = new com.google.protobuf.AbstractParser<TryEnterHomeReq>() {
      @java.lang.Override
      public TryEnterHomeReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<TryEnterHomeReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TryEnterHomeReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TryEnterHomeReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TryEnterHomeReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025TryEnterHomeReq.proto\"^\n\017TryEnterHomeR" +
      "eq\022!\n\031is_transfer_to_safe_point\030\r \001(\010\022\024\n" +
      "\014target_point\030\n \001(\r\022\022\n\ntarget_uid\030\001 \001(\rB" +
      "\030\n\026emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TryEnterHomeReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TryEnterHomeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TryEnterHomeReq_descriptor,
        new java.lang.String[] { "IsTransferToSafePoint", "TargetPoint", "TargetUid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
