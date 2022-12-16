// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FinishMainCoopRsp.proto

package emu.gingerps.net.proto;

public final class FinishMainCoopRspOuterClass {
  private FinishMainCoopRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FinishMainCoopRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FinishMainCoopRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 ending_save_point_id = 4;</code>
     * @return The endingSavePointId.
     */
    int getEndingSavePointId();

    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 id = 13;</code>
     * @return The id.
     */
    int getId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 1981;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code FinishMainCoopRsp}
   */
  public static final class FinishMainCoopRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FinishMainCoopRsp)
      FinishMainCoopRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FinishMainCoopRsp.newBuilder() to construct.
    private FinishMainCoopRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FinishMainCoopRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FinishMainCoopRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FinishMainCoopRsp(
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

              retcode_ = input.readInt32();
              break;
            }
            case 32: {

              endingSavePointId_ = input.readUInt32();
              break;
            }
            case 104: {

              id_ = input.readUInt32();
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
      return emu.gingerps.net.proto.FinishMainCoopRspOuterClass.internal_static_FinishMainCoopRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.FinishMainCoopRspOuterClass.internal_static_FinishMainCoopRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp.class, emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp.Builder.class);
    }

    public static final int ENDING_SAVE_POINT_ID_FIELD_NUMBER = 4;
    private int endingSavePointId_;
    /**
     * <code>uint32 ending_save_point_id = 4;</code>
     * @return The endingSavePointId.
     */
    @java.lang.Override
    public int getEndingSavePointId() {
      return endingSavePointId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 1;
    private int retcode_;
    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int ID_FIELD_NUMBER = 13;
    private int id_;
    /**
     * <code>uint32 id = 13;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
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
        output.writeInt32(1, retcode_);
      }
      if (endingSavePointId_ != 0) {
        output.writeUInt32(4, endingSavePointId_);
      }
      if (id_ != 0) {
        output.writeUInt32(13, id_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, retcode_);
      }
      if (endingSavePointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, endingSavePointId_);
      }
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, id_);
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
      if (!(obj instanceof emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp other = (emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp) obj;

      if (getEndingSavePointId()
          != other.getEndingSavePointId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getId()
          != other.getId()) return false;
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
      hash = (37 * hash) + ENDING_SAVE_POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEndingSavePointId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp prototype) {
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
     *   CMD_ID = 1981;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code FinishMainCoopRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FinishMainCoopRsp)
        emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.FinishMainCoopRspOuterClass.internal_static_FinishMainCoopRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.FinishMainCoopRspOuterClass.internal_static_FinishMainCoopRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp.class, emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp.newBuilder()
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
        endingSavePointId_ = 0;

        retcode_ = 0;

        id_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.FinishMainCoopRspOuterClass.internal_static_FinishMainCoopRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp build() {
        emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp buildPartial() {
        emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp result = new emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp(this);
        result.endingSavePointId_ = endingSavePointId_;
        result.retcode_ = retcode_;
        result.id_ = id_;
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
        if (other instanceof emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp) {
          return mergeFrom((emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp other) {
        if (other == emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp.getDefaultInstance()) return this;
        if (other.getEndingSavePointId() != 0) {
          setEndingSavePointId(other.getEndingSavePointId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getId() != 0) {
          setId(other.getId());
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
        emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int endingSavePointId_ ;
      /**
       * <code>uint32 ending_save_point_id = 4;</code>
       * @return The endingSavePointId.
       */
      @java.lang.Override
      public int getEndingSavePointId() {
        return endingSavePointId_;
      }
      /**
       * <code>uint32 ending_save_point_id = 4;</code>
       * @param value The endingSavePointId to set.
       * @return This builder for chaining.
       */
      public Builder setEndingSavePointId(int value) {
        
        endingSavePointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ending_save_point_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndingSavePointId() {
        
        endingSavePointId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 1;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 13;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 13;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FinishMainCoopRsp)
    }

    // @@protoc_insertion_point(class_scope:FinishMainCoopRsp)
    private static final emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp();
    }

    public static emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FinishMainCoopRsp>
        PARSER = new com.google.protobuf.AbstractParser<FinishMainCoopRsp>() {
      @java.lang.Override
      public FinishMainCoopRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FinishMainCoopRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FinishMainCoopRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FinishMainCoopRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.FinishMainCoopRspOuterClass.FinishMainCoopRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FinishMainCoopRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FinishMainCoopRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027FinishMainCoopRsp.proto\"N\n\021FinishMainC" +
      "oopRsp\022\034\n\024ending_save_point_id\030\004 \001(\r\022\017\n\007" +
      "retcode\030\001 \001(\005\022\n\n\002id\030\r \001(\rB\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FinishMainCoopRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FinishMainCoopRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FinishMainCoopRsp_descriptor,
        new java.lang.String[] { "EndingSavePointId", "Retcode", "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
