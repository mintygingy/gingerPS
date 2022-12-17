// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryTreasureSeelieInfo.proto

package emu.gingerps.net.proto;

public final class SceneGalleryTreasureSeelieInfoOuterClass {
  private SceneGalleryTreasureSeelieInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryTreasureSeelieInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryTreasureSeelieInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 progress = 1;</code>
     * @return The progress.
     */
    int getProgress();

    /**
     * <code>uint32 goal = 14;</code>
     * @return The goal.
     */
    int getGoal();
  }
  /**
   * Protobuf type {@code SceneGalleryTreasureSeelieInfo}
   */
  public static final class SceneGalleryTreasureSeelieInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryTreasureSeelieInfo)
      SceneGalleryTreasureSeelieInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryTreasureSeelieInfo.newBuilder() to construct.
    private SceneGalleryTreasureSeelieInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryTreasureSeelieInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryTreasureSeelieInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.internal_static_SceneGalleryTreasureSeelieInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.internal_static_SceneGalleryTreasureSeelieInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo.class, emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo.Builder.class);
    }

    public static final int PROGRESS_FIELD_NUMBER = 1;
    private int progress_ = 0;
    /**
     * <code>uint32 progress = 1;</code>
     * @return The progress.
     */
    @java.lang.Override
    public int getProgress() {
      return progress_;
    }

    public static final int GOAL_FIELD_NUMBER = 14;
    private int goal_ = 0;
    /**
     * <code>uint32 goal = 14;</code>
     * @return The goal.
     */
    @java.lang.Override
    public int getGoal() {
      return goal_;
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
      if (progress_ != 0) {
        output.writeUInt32(1, progress_);
      }
      if (goal_ != 0) {
        output.writeUInt32(14, goal_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (progress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, progress_);
      }
      if (goal_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, goal_);
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
      if (!(obj instanceof emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo other = (emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo) obj;

      if (getProgress()
          != other.getProgress()) return false;
      if (getGoal()
          != other.getGoal()) return false;
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
      hash = (37 * hash) + PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getProgress();
      hash = (37 * hash) + GOAL_FIELD_NUMBER;
      hash = (53 * hash) + getGoal();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo prototype) {
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
     * Protobuf type {@code SceneGalleryTreasureSeelieInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryTreasureSeelieInfo)
        emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.internal_static_SceneGalleryTreasureSeelieInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.internal_static_SceneGalleryTreasureSeelieInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo.class, emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo.newBuilder()
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
        progress_ = 0;
        goal_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.internal_static_SceneGalleryTreasureSeelieInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo build() {
        emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo buildPartial() {
        emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo result = new emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.progress_ = progress_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.goal_ = goal_;
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
        if (other instanceof emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo) {
          return mergeFrom((emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo other) {
        if (other == emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo.getDefaultInstance()) return this;
        if (other.getProgress() != 0) {
          setProgress(other.getProgress());
        }
        if (other.getGoal() != 0) {
          setGoal(other.getGoal());
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
                progress_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 112: {
                goal_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 112
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

      private int progress_ ;
      /**
       * <code>uint32 progress = 1;</code>
       * @return The progress.
       */
      @java.lang.Override
      public int getProgress() {
        return progress_;
      }
      /**
       * <code>uint32 progress = 1;</code>
       * @param value The progress to set.
       * @return This builder for chaining.
       */
      public Builder setProgress(int value) {
        
        progress_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 progress = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearProgress() {
        bitField0_ = (bitField0_ & ~0x00000001);
        progress_ = 0;
        onChanged();
        return this;
      }

      private int goal_ ;
      /**
       * <code>uint32 goal = 14;</code>
       * @return The goal.
       */
      @java.lang.Override
      public int getGoal() {
        return goal_;
      }
      /**
       * <code>uint32 goal = 14;</code>
       * @param value The goal to set.
       * @return This builder for chaining.
       */
      public Builder setGoal(int value) {
        
        goal_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 goal = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearGoal() {
        bitField0_ = (bitField0_ & ~0x00000002);
        goal_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryTreasureSeelieInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryTreasureSeelieInfo)
    private static final emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo();
    }

    public static emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryTreasureSeelieInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryTreasureSeelieInfo>() {
      @java.lang.Override
      public SceneGalleryTreasureSeelieInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneGalleryTreasureSeelieInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryTreasureSeelieInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryTreasureSeelieInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryTreasureSeelieInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$SceneGalleryTreasureSeelieInfo.proto\"@" +
      "\n\036SceneGalleryTreasureSeelieInfo\022\020\n\010prog" +
      "ress\030\001 \001(\r\022\014\n\004goal\030\016 \001(\rB\030\n\026emu.gingerps" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGalleryTreasureSeelieInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryTreasureSeelieInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryTreasureSeelieInfo_descriptor,
        new java.lang.String[] { "Progress", "Goal", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
