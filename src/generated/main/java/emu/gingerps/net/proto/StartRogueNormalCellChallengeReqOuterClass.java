// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StartRogueNormalCellChallengeReq.proto

package emu.gingerps.net.proto;

public final class StartRogueNormalCellChallengeReqOuterClass {
  private StartRogueNormalCellChallengeReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StartRogueNormalCellChallengeReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:StartRogueNormalCellChallengeReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 cell_id = 8;</code>
     * @return The cellId.
     */
    int getCellId();

    /**
     * <code>uint32 dungeon_id = 4;</code>
     * @return The dungeonId.
     */
    int getDungeonId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8247;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code StartRogueNormalCellChallengeReq}
   */
  public static final class StartRogueNormalCellChallengeReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:StartRogueNormalCellChallengeReq)
      StartRogueNormalCellChallengeReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StartRogueNormalCellChallengeReq.newBuilder() to construct.
    private StartRogueNormalCellChallengeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StartRogueNormalCellChallengeReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new StartRogueNormalCellChallengeReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private StartRogueNormalCellChallengeReq(
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
            case 32: {

              dungeonId_ = input.readUInt32();
              break;
            }
            case 64: {

              cellId_ = input.readUInt32();
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
      return emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.internal_static_StartRogueNormalCellChallengeReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.internal_static_StartRogueNormalCellChallengeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq.class, emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq.Builder.class);
    }

    public static final int CELL_ID_FIELD_NUMBER = 8;
    private int cellId_;
    /**
     * <code>uint32 cell_id = 8;</code>
     * @return The cellId.
     */
    @java.lang.Override
    public int getCellId() {
      return cellId_;
    }

    public static final int DUNGEON_ID_FIELD_NUMBER = 4;
    private int dungeonId_;
    /**
     * <code>uint32 dungeon_id = 4;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
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
      if (dungeonId_ != 0) {
        output.writeUInt32(4, dungeonId_);
      }
      if (cellId_ != 0) {
        output.writeUInt32(8, cellId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, dungeonId_);
      }
      if (cellId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, cellId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq other = (emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq) obj;

      if (getCellId()
          != other.getCellId()) return false;
      if (getDungeonId()
          != other.getDungeonId()) return false;
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
      hash = (37 * hash) + CELL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCellId();
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq prototype) {
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
     *   CMD_ID = 8247;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code StartRogueNormalCellChallengeReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:StartRogueNormalCellChallengeReq)
        emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.internal_static_StartRogueNormalCellChallengeReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.internal_static_StartRogueNormalCellChallengeReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq.class, emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq.newBuilder()
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
        cellId_ = 0;

        dungeonId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.internal_static_StartRogueNormalCellChallengeReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq build() {
        emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq buildPartial() {
        emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq result = new emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq(this);
        result.cellId_ = cellId_;
        result.dungeonId_ = dungeonId_;
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
        if (other instanceof emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq) {
          return mergeFrom((emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq other) {
        if (other == emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq.getDefaultInstance()) return this;
        if (other.getCellId() != 0) {
          setCellId(other.getCellId());
        }
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
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
        emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int cellId_ ;
      /**
       * <code>uint32 cell_id = 8;</code>
       * @return The cellId.
       */
      @java.lang.Override
      public int getCellId() {
        return cellId_;
      }
      /**
       * <code>uint32 cell_id = 8;</code>
       * @param value The cellId to set.
       * @return This builder for chaining.
       */
      public Builder setCellId(int value) {
        
        cellId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cell_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearCellId() {
        
        cellId_ = 0;
        onChanged();
        return this;
      }

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 4;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 4;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:StartRogueNormalCellChallengeReq)
    }

    // @@protoc_insertion_point(class_scope:StartRogueNormalCellChallengeReq)
    private static final emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq();
    }

    public static emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StartRogueNormalCellChallengeReq>
        PARSER = new com.google.protobuf.AbstractParser<StartRogueNormalCellChallengeReq>() {
      @java.lang.Override
      public StartRogueNormalCellChallengeReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StartRogueNormalCellChallengeReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<StartRogueNormalCellChallengeReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StartRogueNormalCellChallengeReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.StartRogueNormalCellChallengeReqOuterClass.StartRogueNormalCellChallengeReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StartRogueNormalCellChallengeReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StartRogueNormalCellChallengeReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&StartRogueNormalCellChallengeReq.proto" +
      "\"G\n StartRogueNormalCellChallengeReq\022\017\n\007" +
      "cell_id\030\010 \001(\r\022\022\n\ndungeon_id\030\004 \001(\rB\033\n\031emu" +
      ".gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_StartRogueNormalCellChallengeReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_StartRogueNormalCellChallengeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StartRogueNormalCellChallengeReq_descriptor,
        new java.lang.String[] { "CellId", "DungeonId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
