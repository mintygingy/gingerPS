// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SelectWorktopOptionReq.proto

package emu.gingerps.net.proto;

public final class SelectWorktopOptionReqOuterClass {
  private SelectWorktopOptionReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SelectWorktopOptionReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SelectWorktopOptionReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 option_id = 7;</code>
     * @return The optionId.
     */
    int getOptionId();

    /**
     * <code>uint32 gadget_entity_id = 5;</code>
     * @return The gadgetEntityId.
     */
    int getGadgetEntityId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 900;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code SelectWorktopOptionReq}
   */
  public static final class SelectWorktopOptionReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SelectWorktopOptionReq)
      SelectWorktopOptionReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SelectWorktopOptionReq.newBuilder() to construct.
    private SelectWorktopOptionReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SelectWorktopOptionReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SelectWorktopOptionReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.internal_static_SelectWorktopOptionReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.internal_static_SelectWorktopOptionReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq.class, emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq.Builder.class);
    }

    public static final int OPTION_ID_FIELD_NUMBER = 7;
    private int optionId_ = 0;
    /**
     * <code>uint32 option_id = 7;</code>
     * @return The optionId.
     */
    @java.lang.Override
    public int getOptionId() {
      return optionId_;
    }

    public static final int GADGET_ENTITY_ID_FIELD_NUMBER = 5;
    private int gadgetEntityId_ = 0;
    /**
     * <code>uint32 gadget_entity_id = 5;</code>
     * @return The gadgetEntityId.
     */
    @java.lang.Override
    public int getGadgetEntityId() {
      return gadgetEntityId_;
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
      if (gadgetEntityId_ != 0) {
        output.writeUInt32(5, gadgetEntityId_);
      }
      if (optionId_ != 0) {
        output.writeUInt32(7, optionId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (gadgetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, gadgetEntityId_);
      }
      if (optionId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, optionId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq other = (emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq) obj;

      if (getOptionId()
          != other.getOptionId()) return false;
      if (getGadgetEntityId()
          != other.getGadgetEntityId()) return false;
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
      hash = (37 * hash) + OPTION_ID_FIELD_NUMBER;
      hash = (53 * hash) + getOptionId();
      hash = (37 * hash) + GADGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetEntityId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq prototype) {
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
     *   CMD_ID = 900;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code SelectWorktopOptionReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SelectWorktopOptionReq)
        emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.internal_static_SelectWorktopOptionReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.internal_static_SelectWorktopOptionReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq.class, emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq.newBuilder()
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
        optionId_ = 0;
        gadgetEntityId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.internal_static_SelectWorktopOptionReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq build() {
        emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq buildPartial() {
        emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq result = new emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.optionId_ = optionId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.gadgetEntityId_ = gadgetEntityId_;
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
        if (other instanceof emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq) {
          return mergeFrom((emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq other) {
        if (other == emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq.getDefaultInstance()) return this;
        if (other.getOptionId() != 0) {
          setOptionId(other.getOptionId());
        }
        if (other.getGadgetEntityId() != 0) {
          setGadgetEntityId(other.getGadgetEntityId());
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
              case 40: {
                gadgetEntityId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 40
              case 56: {
                optionId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 56
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

      private int optionId_ ;
      /**
       * <code>uint32 option_id = 7;</code>
       * @return The optionId.
       */
      @java.lang.Override
      public int getOptionId() {
        return optionId_;
      }
      /**
       * <code>uint32 option_id = 7;</code>
       * @param value The optionId to set.
       * @return This builder for chaining.
       */
      public Builder setOptionId(int value) {
        
        optionId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 option_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearOptionId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        optionId_ = 0;
        onChanged();
        return this;
      }

      private int gadgetEntityId_ ;
      /**
       * <code>uint32 gadget_entity_id = 5;</code>
       * @return The gadgetEntityId.
       */
      @java.lang.Override
      public int getGadgetEntityId() {
        return gadgetEntityId_;
      }
      /**
       * <code>uint32 gadget_entity_id = 5;</code>
       * @param value The gadgetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetEntityId(int value) {
        
        gadgetEntityId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_entity_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetEntityId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        gadgetEntityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SelectWorktopOptionReq)
    }

    // @@protoc_insertion_point(class_scope:SelectWorktopOptionReq)
    private static final emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq();
    }

    public static emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SelectWorktopOptionReq>
        PARSER = new com.google.protobuf.AbstractParser<SelectWorktopOptionReq>() {
      @java.lang.Override
      public SelectWorktopOptionReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<SelectWorktopOptionReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SelectWorktopOptionReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SelectWorktopOptionReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SelectWorktopOptionReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034SelectWorktopOptionReq.proto\"E\n\026Select" +
      "WorktopOptionReq\022\021\n\toption_id\030\007 \001(\r\022\030\n\020g" +
      "adget_entity_id\030\005 \001(\rB\030\n\026emu.gingerps.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SelectWorktopOptionReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SelectWorktopOptionReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SelectWorktopOptionReq_descriptor,
        new java.lang.String[] { "OptionId", "GadgetEntityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
