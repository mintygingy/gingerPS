// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGMsgWaitingListChange.proto

package emu.gingerps.net.proto;

public final class GCGMsgWaitingListChangeOuterClass {
  private GCGMsgWaitingListChangeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGMsgWaitingListChangeOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGMsgWaitingListChange)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 controller_id = 11;</code>
     * @return The controllerId.
     */
    int getControllerId();

    /**
     * <code>uint32 cur_index = 3;</code>
     * @return The curIndex.
     */
    int getCurIndex();
  }
  /**
   * Protobuf type {@code GCGMsgWaitingListChange}
   */
  public static final class GCGMsgWaitingListChange extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGMsgWaitingListChange)
      GCGMsgWaitingListChangeOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGMsgWaitingListChange.newBuilder() to construct.
    private GCGMsgWaitingListChange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGMsgWaitingListChange() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGMsgWaitingListChange();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGMsgWaitingListChange(
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

              curIndex_ = input.readUInt32();
              break;
            }
            case 88: {

              controllerId_ = input.readUInt32();
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
      return emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.internal_static_GCGMsgWaitingListChange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.internal_static_GCGMsgWaitingListChange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange.class, emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange.Builder.class);
    }

    public static final int CONTROLLER_ID_FIELD_NUMBER = 11;
    private int controllerId_;
    /**
     * <code>uint32 controller_id = 11;</code>
     * @return The controllerId.
     */
    @java.lang.Override
    public int getControllerId() {
      return controllerId_;
    }

    public static final int CUR_INDEX_FIELD_NUMBER = 3;
    private int curIndex_;
    /**
     * <code>uint32 cur_index = 3;</code>
     * @return The curIndex.
     */
    @java.lang.Override
    public int getCurIndex() {
      return curIndex_;
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
      if (curIndex_ != 0) {
        output.writeUInt32(3, curIndex_);
      }
      if (controllerId_ != 0) {
        output.writeUInt32(11, controllerId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (curIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, curIndex_);
      }
      if (controllerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, controllerId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange other = (emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange) obj;

      if (getControllerId()
          != other.getControllerId()) return false;
      if (getCurIndex()
          != other.getCurIndex()) return false;
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
      hash = (37 * hash) + CONTROLLER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getControllerId();
      hash = (37 * hash) + CUR_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getCurIndex();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange prototype) {
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
     * Protobuf type {@code GCGMsgWaitingListChange}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGMsgWaitingListChange)
        emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChangeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.internal_static_GCGMsgWaitingListChange_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.internal_static_GCGMsgWaitingListChange_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange.class, emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange.newBuilder()
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
        controllerId_ = 0;

        curIndex_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.internal_static_GCGMsgWaitingListChange_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange getDefaultInstanceForType() {
        return emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange build() {
        emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange buildPartial() {
        emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange result = new emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange(this);
        result.controllerId_ = controllerId_;
        result.curIndex_ = curIndex_;
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
        if (other instanceof emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange) {
          return mergeFrom((emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange other) {
        if (other == emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange.getDefaultInstance()) return this;
        if (other.getControllerId() != 0) {
          setControllerId(other.getControllerId());
        }
        if (other.getCurIndex() != 0) {
          setCurIndex(other.getCurIndex());
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
        emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int controllerId_ ;
      /**
       * <code>uint32 controller_id = 11;</code>
       * @return The controllerId.
       */
      @java.lang.Override
      public int getControllerId() {
        return controllerId_;
      }
      /**
       * <code>uint32 controller_id = 11;</code>
       * @param value The controllerId to set.
       * @return This builder for chaining.
       */
      public Builder setControllerId(int value) {
        
        controllerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 controller_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearControllerId() {
        
        controllerId_ = 0;
        onChanged();
        return this;
      }

      private int curIndex_ ;
      /**
       * <code>uint32 cur_index = 3;</code>
       * @return The curIndex.
       */
      @java.lang.Override
      public int getCurIndex() {
        return curIndex_;
      }
      /**
       * <code>uint32 cur_index = 3;</code>
       * @param value The curIndex to set.
       * @return This builder for chaining.
       */
      public Builder setCurIndex(int value) {
        
        curIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_index = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurIndex() {
        
        curIndex_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGMsgWaitingListChange)
    }

    // @@protoc_insertion_point(class_scope:GCGMsgWaitingListChange)
    private static final emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange();
    }

    public static emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGMsgWaitingListChange>
        PARSER = new com.google.protobuf.AbstractParser<GCGMsgWaitingListChange>() {
      @java.lang.Override
      public GCGMsgWaitingListChange parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGMsgWaitingListChange(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGMsgWaitingListChange> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGMsgWaitingListChange> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGMsgWaitingListChange_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGMsgWaitingListChange_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035GCGMsgWaitingListChange.proto\"C\n\027GCGMs" +
      "gWaitingListChange\022\025\n\rcontroller_id\030\013 \001(" +
      "\r\022\021\n\tcur_index\030\003 \001(\rB\033\n\031emu.gingerps." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGMsgWaitingListChange_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGMsgWaitingListChange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGMsgWaitingListChange_descriptor,
        new java.lang.String[] { "ControllerId", "CurIndex", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
