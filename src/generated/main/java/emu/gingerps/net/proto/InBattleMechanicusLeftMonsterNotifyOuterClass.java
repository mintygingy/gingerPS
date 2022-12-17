// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InBattleMechanicusLeftMonsterNotify.proto

package emu.gingerps.net.proto;

public final class InBattleMechanicusLeftMonsterNotifyOuterClass {
  private InBattleMechanicusLeftMonsterNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InBattleMechanicusLeftMonsterNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InBattleMechanicusLeftMonsterNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 left_monster_num = 5;</code>
     * @return The leftMonsterNum.
     */
    int getLeftMonsterNum();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 5343;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code InBattleMechanicusLeftMonsterNotify}
   */
  public static final class InBattleMechanicusLeftMonsterNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InBattleMechanicusLeftMonsterNotify)
      InBattleMechanicusLeftMonsterNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InBattleMechanicusLeftMonsterNotify.newBuilder() to construct.
    private InBattleMechanicusLeftMonsterNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InBattleMechanicusLeftMonsterNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InBattleMechanicusLeftMonsterNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.internal_static_InBattleMechanicusLeftMonsterNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.internal_static_InBattleMechanicusLeftMonsterNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify.class, emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify.Builder.class);
    }

    public static final int LEFT_MONSTER_NUM_FIELD_NUMBER = 5;
    private int leftMonsterNum_ = 0;
    /**
     * <code>uint32 left_monster_num = 5;</code>
     * @return The leftMonsterNum.
     */
    @java.lang.Override
    public int getLeftMonsterNum() {
      return leftMonsterNum_;
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
      if (leftMonsterNum_ != 0) {
        output.writeUInt32(5, leftMonsterNum_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (leftMonsterNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, leftMonsterNum_);
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
      if (!(obj instanceof emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify other = (emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify) obj;

      if (getLeftMonsterNum()
          != other.getLeftMonsterNum()) return false;
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
      hash = (37 * hash) + LEFT_MONSTER_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getLeftMonsterNum();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify prototype) {
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
     *   CMD_ID = 5343;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code InBattleMechanicusLeftMonsterNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InBattleMechanicusLeftMonsterNotify)
        emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.internal_static_InBattleMechanicusLeftMonsterNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.internal_static_InBattleMechanicusLeftMonsterNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify.class, emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify.newBuilder()
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
        leftMonsterNum_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.internal_static_InBattleMechanicusLeftMonsterNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify build() {
        emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify buildPartial() {
        emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify result = new emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.leftMonsterNum_ = leftMonsterNum_;
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
        if (other instanceof emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify) {
          return mergeFrom((emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify other) {
        if (other == emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify.getDefaultInstance()) return this;
        if (other.getLeftMonsterNum() != 0) {
          setLeftMonsterNum(other.getLeftMonsterNum());
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
                leftMonsterNum_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 40
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

      private int leftMonsterNum_ ;
      /**
       * <code>uint32 left_monster_num = 5;</code>
       * @return The leftMonsterNum.
       */
      @java.lang.Override
      public int getLeftMonsterNum() {
        return leftMonsterNum_;
      }
      /**
       * <code>uint32 left_monster_num = 5;</code>
       * @param value The leftMonsterNum to set.
       * @return This builder for chaining.
       */
      public Builder setLeftMonsterNum(int value) {
        
        leftMonsterNum_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 left_monster_num = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearLeftMonsterNum() {
        bitField0_ = (bitField0_ & ~0x00000001);
        leftMonsterNum_ = 0;
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


      // @@protoc_insertion_point(builder_scope:InBattleMechanicusLeftMonsterNotify)
    }

    // @@protoc_insertion_point(class_scope:InBattleMechanicusLeftMonsterNotify)
    private static final emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify();
    }

    public static emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InBattleMechanicusLeftMonsterNotify>
        PARSER = new com.google.protobuf.AbstractParser<InBattleMechanicusLeftMonsterNotify>() {
      @java.lang.Override
      public InBattleMechanicusLeftMonsterNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<InBattleMechanicusLeftMonsterNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InBattleMechanicusLeftMonsterNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.InBattleMechanicusLeftMonsterNotifyOuterClass.InBattleMechanicusLeftMonsterNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InBattleMechanicusLeftMonsterNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InBattleMechanicusLeftMonsterNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)InBattleMechanicusLeftMonsterNotify.pr" +
      "oto\"?\n#InBattleMechanicusLeftMonsterNoti" +
      "fy\022\030\n\020left_monster_num\030\005 \001(\rB\030\n\026emu.ging" +
      "erps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_InBattleMechanicusLeftMonsterNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InBattleMechanicusLeftMonsterNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InBattleMechanicusLeftMonsterNotify_descriptor,
        new java.lang.String[] { "LeftMonsterNum", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
