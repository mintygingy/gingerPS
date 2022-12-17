// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QueryFilter.proto

package emu.gingerps.net.proto;

public final class QueryFilterOuterClass {
  private QueryFilterOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QueryFilterOrBuilder extends
      // @@protoc_insertion_point(interface_extends:QueryFilter)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 area_mask = 4;</code>
     * @return The areaMask.
     */
    int getAreaMask();

    /**
     * <code>int32 type_id = 3;</code>
     * @return The typeId.
     */
    int getTypeId();
  }
  /**
   * Protobuf type {@code QueryFilter}
   */
  public static final class QueryFilter extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:QueryFilter)
      QueryFilterOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use QueryFilter.newBuilder() to construct.
    private QueryFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private QueryFilter() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new QueryFilter();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private QueryFilter(
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
            case 24: {

              typeId_ = input.readInt32();
              break;
            }
            case 32: {

              areaMask_ = input.readInt32();
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
      return emu.gingerps.net.proto.QueryFilterOuterClass.internal_static_QueryFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.QueryFilterOuterClass.internal_static_QueryFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter.class, emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter.Builder.class);
    }

    public static final int AREA_MASK_FIELD_NUMBER = 4;
    private int areaMask_;
    /**
     * <code>int32 area_mask = 4;</code>
     * @return The areaMask.
     */
    @java.lang.Override
    public int getAreaMask() {
      return areaMask_;
    }

    public static final int TYPE_ID_FIELD_NUMBER = 3;
    private int typeId_;
    /**
     * <code>int32 type_id = 3;</code>
     * @return The typeId.
     */
    @java.lang.Override
    public int getTypeId() {
      return typeId_;
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
      if (typeId_ != 0) {
        output.writeInt32(3, typeId_);
      }
      if (areaMask_ != 0) {
        output.writeInt32(4, areaMask_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (typeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, typeId_);
      }
      if (areaMask_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, areaMask_);
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
      if (!(obj instanceof emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter other = (emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter) obj;

      if (getAreaMask()
          != other.getAreaMask()) return false;
      if (getTypeId()
          != other.getTypeId()) return false;
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
      hash = (37 * hash) + AREA_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getAreaMask();
      hash = (37 * hash) + TYPE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTypeId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter prototype) {
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
     * Protobuf type {@code QueryFilter}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:QueryFilter)
        emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilterOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.QueryFilterOuterClass.internal_static_QueryFilter_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.QueryFilterOuterClass.internal_static_QueryFilter_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter.class, emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter.newBuilder()
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
        areaMask_ = 0;

        typeId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.QueryFilterOuterClass.internal_static_QueryFilter_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter getDefaultInstanceForType() {
        return emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter build() {
        emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter buildPartial() {
        emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter result = new emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter(this);
        result.areaMask_ = areaMask_;
        result.typeId_ = typeId_;
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
        if (other instanceof emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter) {
          return mergeFrom((emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter other) {
        if (other == emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter.getDefaultInstance()) return this;
        if (other.getAreaMask() != 0) {
          setAreaMask(other.getAreaMask());
        }
        if (other.getTypeId() != 0) {
          setTypeId(other.getTypeId());
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
        emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int areaMask_ ;
      /**
       * <code>int32 area_mask = 4;</code>
       * @return The areaMask.
       */
      @java.lang.Override
      public int getAreaMask() {
        return areaMask_;
      }
      /**
       * <code>int32 area_mask = 4;</code>
       * @param value The areaMask to set.
       * @return This builder for chaining.
       */
      public Builder setAreaMask(int value) {
        
        areaMask_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 area_mask = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearAreaMask() {
        
        areaMask_ = 0;
        onChanged();
        return this;
      }

      private int typeId_ ;
      /**
       * <code>int32 type_id = 3;</code>
       * @return The typeId.
       */
      @java.lang.Override
      public int getTypeId() {
        return typeId_;
      }
      /**
       * <code>int32 type_id = 3;</code>
       * @param value The typeId to set.
       * @return This builder for chaining.
       */
      public Builder setTypeId(int value) {
        
        typeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 type_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearTypeId() {
        
        typeId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:QueryFilter)
    }

    // @@protoc_insertion_point(class_scope:QueryFilter)
    private static final emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter();
    }

    public static emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QueryFilter>
        PARSER = new com.google.protobuf.AbstractParser<QueryFilter>() {
      @java.lang.Override
      public QueryFilter parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new QueryFilter(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<QueryFilter> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QueryFilter> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.QueryFilterOuterClass.QueryFilter getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_QueryFilter_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_QueryFilter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021QueryFilter.proto\"1\n\013QueryFilter\022\021\n\tar" +
      "ea_mask\030\004 \001(\005\022\017\n\007type_id\030\003 \001(\005B\030\n\026emu.gi" +
      "ngerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_QueryFilter_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_QueryFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_QueryFilter_descriptor,
        new java.lang.String[] { "AreaMask", "TypeId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
