// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NpcPositionInfo.proto

package emu.gingerps.net.proto;

public final class NpcPositionInfoOuterClass {
  private NpcPositionInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NpcPositionInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NpcPositionInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 npc_id = 1;</code>
     * @return The npcId.
     */
    int getNpcId();

    /**
     * <code>.Vector pos = 2;</code>
     * @return Whether the pos field is set.
     */
    boolean hasPos();
    /**
     * <code>.Vector pos = 2;</code>
     * @return The pos.
     */
    emu.gingerps.net.proto.VectorOuterClass.Vector getPos();
    /**
     * <code>.Vector pos = 2;</code>
     */
    emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder();
  }
  /**
   * Protobuf type {@code NpcPositionInfo}
   */
  public static final class NpcPositionInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NpcPositionInfo)
      NpcPositionInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NpcPositionInfo.newBuilder() to construct.
    private NpcPositionInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NpcPositionInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NpcPositionInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.NpcPositionInfoOuterClass.internal_static_NpcPositionInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.NpcPositionInfoOuterClass.internal_static_NpcPositionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo.class, emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo.Builder.class);
    }

    public static final int NPC_ID_FIELD_NUMBER = 1;
    private int npcId_ = 0;
    /**
     * <code>uint32 npc_id = 1;</code>
     * @return The npcId.
     */
    @java.lang.Override
    public int getNpcId() {
      return npcId_;
    }

    public static final int POS_FIELD_NUMBER = 2;
    private emu.gingerps.net.proto.VectorOuterClass.Vector pos_;
    /**
     * <code>.Vector pos = 2;</code>
     * @return Whether the pos field is set.
     */
    @java.lang.Override
    public boolean hasPos() {
      return pos_ != null;
    }
    /**
     * <code>.Vector pos = 2;</code>
     * @return The pos.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.VectorOuterClass.Vector getPos() {
      return pos_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
    }
    /**
     * <code>.Vector pos = 2;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
      return pos_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
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
      if (npcId_ != 0) {
        output.writeUInt32(1, npcId_);
      }
      if (pos_ != null) {
        output.writeMessage(2, getPos());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (npcId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, npcId_);
      }
      if (pos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getPos());
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
      if (!(obj instanceof emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo other = (emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo) obj;

      if (getNpcId()
          != other.getNpcId()) return false;
      if (hasPos() != other.hasPos()) return false;
      if (hasPos()) {
        if (!getPos()
            .equals(other.getPos())) return false;
      }
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
      hash = (37 * hash) + NPC_ID_FIELD_NUMBER;
      hash = (53 * hash) + getNpcId();
      if (hasPos()) {
        hash = (37 * hash) + POS_FIELD_NUMBER;
        hash = (53 * hash) + getPos().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo prototype) {
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
     * Protobuf type {@code NpcPositionInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NpcPositionInfo)
        emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.NpcPositionInfoOuterClass.internal_static_NpcPositionInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.NpcPositionInfoOuterClass.internal_static_NpcPositionInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo.class, emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo.newBuilder()
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
        npcId_ = 0;
        pos_ = null;
        if (posBuilder_ != null) {
          posBuilder_.dispose();
          posBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.NpcPositionInfoOuterClass.internal_static_NpcPositionInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo build() {
        emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo buildPartial() {
        emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo result = new emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.npcId_ = npcId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.pos_ = posBuilder_ == null
              ? pos_
              : posBuilder_.build();
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
        if (other instanceof emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo) {
          return mergeFrom((emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo other) {
        if (other == emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo.getDefaultInstance()) return this;
        if (other.getNpcId() != 0) {
          setNpcId(other.getNpcId());
        }
        if (other.hasPos()) {
          mergePos(other.getPos());
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
                npcId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                input.readMessage(
                    getPosFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

      private int npcId_ ;
      /**
       * <code>uint32 npc_id = 1;</code>
       * @return The npcId.
       */
      @java.lang.Override
      public int getNpcId() {
        return npcId_;
      }
      /**
       * <code>uint32 npc_id = 1;</code>
       * @param value The npcId to set.
       * @return This builder for chaining.
       */
      public Builder setNpcId(int value) {
        
        npcId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 npc_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearNpcId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        npcId_ = 0;
        onChanged();
        return this;
      }

      private emu.gingerps.net.proto.VectorOuterClass.Vector pos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder> posBuilder_;
      /**
       * <code>.Vector pos = 2;</code>
       * @return Whether the pos field is set.
       */
      public boolean hasPos() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.Vector pos = 2;</code>
       * @return The pos.
       */
      public emu.gingerps.net.proto.VectorOuterClass.Vector getPos() {
        if (posBuilder_ == null) {
          return pos_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        } else {
          return posBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector pos = 2;</code>
       */
      public Builder setPos(emu.gingerps.net.proto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pos_ = value;
        } else {
          posBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector pos = 2;</code>
       */
      public Builder setPos(
          emu.gingerps.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (posBuilder_ == null) {
          pos_ = builderForValue.build();
        } else {
          posBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector pos = 2;</code>
       */
      public Builder mergePos(emu.gingerps.net.proto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            pos_ != null &&
            pos_ != emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance()) {
            getPosBuilder().mergeFrom(value);
          } else {
            pos_ = value;
          }
        } else {
          posBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector pos = 2;</code>
       */
      public Builder clearPos() {
        bitField0_ = (bitField0_ & ~0x00000002);
        pos_ = null;
        if (posBuilder_ != null) {
          posBuilder_.dispose();
          posBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.Vector pos = 2;</code>
       */
      public emu.gingerps.net.proto.VectorOuterClass.Vector.Builder getPosBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector pos = 2;</code>
       */
      public emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
        if (posBuilder_ != null) {
          return posBuilder_.getMessageOrBuilder();
        } else {
          return pos_ == null ?
              emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        }
      }
      /**
       * <code>.Vector pos = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder> 
          getPosFieldBuilder() {
        if (posBuilder_ == null) {
          posBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getPos(),
                  getParentForChildren(),
                  isClean());
          pos_ = null;
        }
        return posBuilder_;
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


      // @@protoc_insertion_point(builder_scope:NpcPositionInfo)
    }

    // @@protoc_insertion_point(class_scope:NpcPositionInfo)
    private static final emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo();
    }

    public static emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NpcPositionInfo>
        PARSER = new com.google.protobuf.AbstractParser<NpcPositionInfo>() {
      @java.lang.Override
      public NpcPositionInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<NpcPositionInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NpcPositionInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.NpcPositionInfoOuterClass.NpcPositionInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NpcPositionInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NpcPositionInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025NpcPositionInfo.proto\032\014Vector.proto\"7\n" +
      "\017NpcPositionInfo\022\016\n\006npc_id\030\001 \001(\r\022\024\n\003pos\030" +
      "\002 \001(\0132\007.VectorB\030\n\026emu.gingerps.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_NpcPositionInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NpcPositionInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NpcPositionInfo_descriptor,
        new java.lang.String[] { "NpcId", "Pos", });
    emu.gingerps.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
