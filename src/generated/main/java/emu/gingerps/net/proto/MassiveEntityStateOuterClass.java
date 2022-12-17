// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MassiveEntityState.proto

package emu.gingerps.net.proto;

public final class MassiveEntityStateOuterClass {
  private MassiveEntityStateOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MassiveEntityStateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MassiveEntityState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_type = 1;</code>
     * @return The entityType.
     */
    int getEntityType();

    /**
     * <code>int64 obj_id = 2;</code>
     * @return The objId.
     */
    long getObjId();

    /**
     * <code>uint32 element_state = 3;</code>
     * @return The elementState.
     */
    int getElementState();
  }
  /**
   * Protobuf type {@code MassiveEntityState}
   */
  public static final class MassiveEntityState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MassiveEntityState)
      MassiveEntityStateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MassiveEntityState.newBuilder() to construct.
    private MassiveEntityState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MassiveEntityState() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MassiveEntityState();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.MassiveEntityStateOuterClass.internal_static_MassiveEntityState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.MassiveEntityStateOuterClass.internal_static_MassiveEntityState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState.class, emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState.Builder.class);
    }

    public static final int ENTITY_TYPE_FIELD_NUMBER = 1;
    private int entityType_ = 0;
    /**
     * <code>uint32 entity_type = 1;</code>
     * @return The entityType.
     */
    @java.lang.Override
    public int getEntityType() {
      return entityType_;
    }

    public static final int OBJ_ID_FIELD_NUMBER = 2;
    private long objId_ = 0L;
    /**
     * <code>int64 obj_id = 2;</code>
     * @return The objId.
     */
    @java.lang.Override
    public long getObjId() {
      return objId_;
    }

    public static final int ELEMENT_STATE_FIELD_NUMBER = 3;
    private int elementState_ = 0;
    /**
     * <code>uint32 element_state = 3;</code>
     * @return The elementState.
     */
    @java.lang.Override
    public int getElementState() {
      return elementState_;
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
      if (entityType_ != 0) {
        output.writeUInt32(1, entityType_);
      }
      if (objId_ != 0L) {
        output.writeInt64(2, objId_);
      }
      if (elementState_ != 0) {
        output.writeUInt32(3, elementState_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, entityType_);
      }
      if (objId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, objId_);
      }
      if (elementState_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, elementState_);
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
      if (!(obj instanceof emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState other = (emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState) obj;

      if (getEntityType()
          != other.getEntityType()) return false;
      if (getObjId()
          != other.getObjId()) return false;
      if (getElementState()
          != other.getElementState()) return false;
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
      hash = (37 * hash) + ENTITY_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getEntityType();
      hash = (37 * hash) + OBJ_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getObjId());
      hash = (37 * hash) + ELEMENT_STATE_FIELD_NUMBER;
      hash = (53 * hash) + getElementState();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState prototype) {
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
     * Protobuf type {@code MassiveEntityState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MassiveEntityState)
        emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.MassiveEntityStateOuterClass.internal_static_MassiveEntityState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.MassiveEntityStateOuterClass.internal_static_MassiveEntityState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState.class, emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState.newBuilder()
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
        entityType_ = 0;
        objId_ = 0L;
        elementState_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.MassiveEntityStateOuterClass.internal_static_MassiveEntityState_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState getDefaultInstanceForType() {
        return emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState build() {
        emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState buildPartial() {
        emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState result = new emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.entityType_ = entityType_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.objId_ = objId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.elementState_ = elementState_;
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
        if (other instanceof emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState) {
          return mergeFrom((emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState other) {
        if (other == emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState.getDefaultInstance()) return this;
        if (other.getEntityType() != 0) {
          setEntityType(other.getEntityType());
        }
        if (other.getObjId() != 0L) {
          setObjId(other.getObjId());
        }
        if (other.getElementState() != 0) {
          setElementState(other.getElementState());
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
                entityType_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                objId_ = input.readInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                elementState_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

      private int entityType_ ;
      /**
       * <code>uint32 entity_type = 1;</code>
       * @return The entityType.
       */
      @java.lang.Override
      public int getEntityType() {
        return entityType_;
      }
      /**
       * <code>uint32 entity_type = 1;</code>
       * @param value The entityType to set.
       * @return This builder for chaining.
       */
      public Builder setEntityType(int value) {
        
        entityType_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        entityType_ = 0;
        onChanged();
        return this;
      }

      private long objId_ ;
      /**
       * <code>int64 obj_id = 2;</code>
       * @return The objId.
       */
      @java.lang.Override
      public long getObjId() {
        return objId_;
      }
      /**
       * <code>int64 obj_id = 2;</code>
       * @param value The objId to set.
       * @return This builder for chaining.
       */
      public Builder setObjId(long value) {
        
        objId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int64 obj_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearObjId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        objId_ = 0L;
        onChanged();
        return this;
      }

      private int elementState_ ;
      /**
       * <code>uint32 element_state = 3;</code>
       * @return The elementState.
       */
      @java.lang.Override
      public int getElementState() {
        return elementState_;
      }
      /**
       * <code>uint32 element_state = 3;</code>
       * @param value The elementState to set.
       * @return This builder for chaining.
       */
      public Builder setElementState(int value) {
        
        elementState_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 element_state = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearElementState() {
        bitField0_ = (bitField0_ & ~0x00000004);
        elementState_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MassiveEntityState)
    }

    // @@protoc_insertion_point(class_scope:MassiveEntityState)
    private static final emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState();
    }

    public static emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MassiveEntityState>
        PARSER = new com.google.protobuf.AbstractParser<MassiveEntityState>() {
      @java.lang.Override
      public MassiveEntityState parsePartialFrom(
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

    public static com.google.protobuf.Parser<MassiveEntityState> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MassiveEntityState> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.MassiveEntityStateOuterClass.MassiveEntityState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MassiveEntityState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MassiveEntityState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030MassiveEntityState.proto\"P\n\022MassiveEnt" +
      "ityState\022\023\n\013entity_type\030\001 \001(\r\022\016\n\006obj_id\030" +
      "\002 \001(\003\022\025\n\relement_state\030\003 \001(\rB\030\n\026emu.ging" +
      "erps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MassiveEntityState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MassiveEntityState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MassiveEntityState_descriptor,
        new java.lang.String[] { "EntityType", "ObjId", "ElementState", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
