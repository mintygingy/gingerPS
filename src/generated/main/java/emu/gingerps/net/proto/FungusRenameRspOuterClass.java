// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FungusRenameRsp.proto

package emu.gingerps.net.proto;

public final class FungusRenameRspOuterClass {
  private FungusRenameRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FungusRenameRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FungusRenameRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 fungus_id = 1;</code>
     * @return The fungusId.
     */
    int getFungusId();

    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 name_id = 6;</code>
     * @return The nameId.
     */
    int getNameId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 22216;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code FungusRenameRsp}
   */
  public static final class FungusRenameRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FungusRenameRsp)
      FungusRenameRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FungusRenameRsp.newBuilder() to construct.
    private FungusRenameRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FungusRenameRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FungusRenameRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FungusRenameRsp(
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
            case 8: {

              fungusId_ = input.readUInt32();
              break;
            }
            case 48: {

              nameId_ = input.readUInt32();
              break;
            }
            case 56: {

              retcode_ = input.readInt32();
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
      return emu.gingerps.net.proto.FungusRenameRspOuterClass.internal_static_FungusRenameRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.FungusRenameRspOuterClass.internal_static_FungusRenameRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp.class, emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp.Builder.class);
    }

    public static final int FUNGUS_ID_FIELD_NUMBER = 1;
    private int fungusId_;
    /**
     * <code>uint32 fungus_id = 1;</code>
     * @return The fungusId.
     */
    @java.lang.Override
    public int getFungusId() {
      return fungusId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 7;
    private int retcode_;
    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int NAME_ID_FIELD_NUMBER = 6;
    private int nameId_;
    /**
     * <code>uint32 name_id = 6;</code>
     * @return The nameId.
     */
    @java.lang.Override
    public int getNameId() {
      return nameId_;
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
      if (fungusId_ != 0) {
        output.writeUInt32(1, fungusId_);
      }
      if (nameId_ != 0) {
        output.writeUInt32(6, nameId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(7, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (fungusId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, fungusId_);
      }
      if (nameId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, nameId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, retcode_);
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
      if (!(obj instanceof emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp other = (emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp) obj;

      if (getFungusId()
          != other.getFungusId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getNameId()
          != other.getNameId()) return false;
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
      hash = (37 * hash) + FUNGUS_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFungusId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + NAME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getNameId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp prototype) {
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
     *   CMD_ID = 22216;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code FungusRenameRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FungusRenameRsp)
        emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.FungusRenameRspOuterClass.internal_static_FungusRenameRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.FungusRenameRspOuterClass.internal_static_FungusRenameRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp.class, emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp.newBuilder()
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
        fungusId_ = 0;

        retcode_ = 0;

        nameId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.FungusRenameRspOuterClass.internal_static_FungusRenameRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp build() {
        emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp buildPartial() {
        emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp result = new emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp(this);
        result.fungusId_ = fungusId_;
        result.retcode_ = retcode_;
        result.nameId_ = nameId_;
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
        if (other instanceof emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp) {
          return mergeFrom((emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp other) {
        if (other == emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp.getDefaultInstance()) return this;
        if (other.getFungusId() != 0) {
          setFungusId(other.getFungusId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getNameId() != 0) {
          setNameId(other.getNameId());
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
        emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int fungusId_ ;
      /**
       * <code>uint32 fungus_id = 1;</code>
       * @return The fungusId.
       */
      @java.lang.Override
      public int getFungusId() {
        return fungusId_;
      }
      /**
       * <code>uint32 fungus_id = 1;</code>
       * @param value The fungusId to set.
       * @return This builder for chaining.
       */
      public Builder setFungusId(int value) {
        
        fungusId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 fungus_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFungusId() {
        
        fungusId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 7;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int nameId_ ;
      /**
       * <code>uint32 name_id = 6;</code>
       * @return The nameId.
       */
      @java.lang.Override
      public int getNameId() {
        return nameId_;
      }
      /**
       * <code>uint32 name_id = 6;</code>
       * @param value The nameId to set.
       * @return This builder for chaining.
       */
      public Builder setNameId(int value) {
        
        nameId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 name_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearNameId() {
        
        nameId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FungusRenameRsp)
    }

    // @@protoc_insertion_point(class_scope:FungusRenameRsp)
    private static final emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp();
    }

    public static emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FungusRenameRsp>
        PARSER = new com.google.protobuf.AbstractParser<FungusRenameRsp>() {
      @java.lang.Override
      public FungusRenameRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FungusRenameRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FungusRenameRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FungusRenameRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.FungusRenameRspOuterClass.FungusRenameRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FungusRenameRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FungusRenameRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025FungusRenameRsp.proto\"F\n\017FungusRenameR" +
      "sp\022\021\n\tfungus_id\030\001 \001(\r\022\017\n\007retcode\030\007 \001(\005\022\017" +
      "\n\007name_id\030\006 \001(\rB\030\n\026emu.gingerps.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FungusRenameRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FungusRenameRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FungusRenameRsp_descriptor,
        new java.lang.String[] { "FungusId", "Retcode", "NameId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
