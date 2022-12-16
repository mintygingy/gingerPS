// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CancelCityReputationRequestReq.proto

package emu.gingerps.net.proto;

public final class CancelCityReputationRequestReqOuterClass {
  private CancelCityReputationRequestReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CancelCityReputationRequestReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CancelCityReputationRequestReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 city_id = 14;</code>
     * @return The cityId.
     */
    int getCityId();

    /**
     * <code>uint32 request_id = 10;</code>
     * @return The requestId.
     */
    int getRequestId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 2857;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code CancelCityReputationRequestReq}
   */
  public static final class CancelCityReputationRequestReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CancelCityReputationRequestReq)
      CancelCityReputationRequestReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CancelCityReputationRequestReq.newBuilder() to construct.
    private CancelCityReputationRequestReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CancelCityReputationRequestReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CancelCityReputationRequestReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CancelCityReputationRequestReq(
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
            case 80: {

              requestId_ = input.readUInt32();
              break;
            }
            case 112: {

              cityId_ = input.readUInt32();
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
      return emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.internal_static_CancelCityReputationRequestReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.internal_static_CancelCityReputationRequestReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq.class, emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq.Builder.class);
    }

    public static final int CITY_ID_FIELD_NUMBER = 14;
    private int cityId_;
    /**
     * <code>uint32 city_id = 14;</code>
     * @return The cityId.
     */
    @java.lang.Override
    public int getCityId() {
      return cityId_;
    }

    public static final int REQUEST_ID_FIELD_NUMBER = 10;
    private int requestId_;
    /**
     * <code>uint32 request_id = 10;</code>
     * @return The requestId.
     */
    @java.lang.Override
    public int getRequestId() {
      return requestId_;
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
      if (requestId_ != 0) {
        output.writeUInt32(10, requestId_);
      }
      if (cityId_ != 0) {
        output.writeUInt32(14, cityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (requestId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, requestId_);
      }
      if (cityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, cityId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq other = (emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq) obj;

      if (getCityId()
          != other.getCityId()) return false;
      if (getRequestId()
          != other.getRequestId()) return false;
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
      hash = (37 * hash) + CITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCityId();
      hash = (37 * hash) + REQUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRequestId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq prototype) {
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
     *   CMD_ID = 2857;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code CancelCityReputationRequestReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CancelCityReputationRequestReq)
        emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.internal_static_CancelCityReputationRequestReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.internal_static_CancelCityReputationRequestReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq.class, emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq.newBuilder()
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
        cityId_ = 0;

        requestId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.internal_static_CancelCityReputationRequestReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq build() {
        emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq buildPartial() {
        emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq result = new emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq(this);
        result.cityId_ = cityId_;
        result.requestId_ = requestId_;
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
        if (other instanceof emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq) {
          return mergeFrom((emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq other) {
        if (other == emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq.getDefaultInstance()) return this;
        if (other.getCityId() != 0) {
          setCityId(other.getCityId());
        }
        if (other.getRequestId() != 0) {
          setRequestId(other.getRequestId());
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
        emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int cityId_ ;
      /**
       * <code>uint32 city_id = 14;</code>
       * @return The cityId.
       */
      @java.lang.Override
      public int getCityId() {
        return cityId_;
      }
      /**
       * <code>uint32 city_id = 14;</code>
       * @param value The cityId to set.
       * @return This builder for chaining.
       */
      public Builder setCityId(int value) {
        
        cityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 city_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearCityId() {
        
        cityId_ = 0;
        onChanged();
        return this;
      }

      private int requestId_ ;
      /**
       * <code>uint32 request_id = 10;</code>
       * @return The requestId.
       */
      @java.lang.Override
      public int getRequestId() {
        return requestId_;
      }
      /**
       * <code>uint32 request_id = 10;</code>
       * @param value The requestId to set.
       * @return This builder for chaining.
       */
      public Builder setRequestId(int value) {
        
        requestId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 request_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearRequestId() {
        
        requestId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CancelCityReputationRequestReq)
    }

    // @@protoc_insertion_point(class_scope:CancelCityReputationRequestReq)
    private static final emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq();
    }

    public static emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CancelCityReputationRequestReq>
        PARSER = new com.google.protobuf.AbstractParser<CancelCityReputationRequestReq>() {
      @java.lang.Override
      public CancelCityReputationRequestReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CancelCityReputationRequestReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CancelCityReputationRequestReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CancelCityReputationRequestReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.CancelCityReputationRequestReqOuterClass.CancelCityReputationRequestReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CancelCityReputationRequestReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CancelCityReputationRequestReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$CancelCityReputationRequestReq.proto\"E" +
      "\n\036CancelCityReputationRequestReq\022\017\n\007city" +
      "_id\030\016 \001(\r\022\022\n\nrequest_id\030\n \001(\rB\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CancelCityReputationRequestReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CancelCityReputationRequestReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CancelCityReputationRequestReq_descriptor,
        new java.lang.String[] { "CityId", "RequestId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
