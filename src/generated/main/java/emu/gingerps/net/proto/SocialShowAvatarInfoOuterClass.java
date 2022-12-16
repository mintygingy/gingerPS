// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SocialShowAvatarInfo.proto

package emu.gingerps.net.proto;

public final class SocialShowAvatarInfoOuterClass {
  private SocialShowAvatarInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SocialShowAvatarInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SocialShowAvatarInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 avatar_id = 1;</code>
     * @return The avatarId.
     */
    int getAvatarId();

    /**
     * <code>uint32 level = 2;</code>
     * @return The level.
     */
    int getLevel();

    /**
     * <code>uint32 costume_id = 3;</code>
     * @return The costumeId.
     */
    int getCostumeId();
  }
  /**
   * Protobuf type {@code SocialShowAvatarInfo}
   */
  public static final class SocialShowAvatarInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SocialShowAvatarInfo)
      SocialShowAvatarInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SocialShowAvatarInfo.newBuilder() to construct.
    private SocialShowAvatarInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SocialShowAvatarInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SocialShowAvatarInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SocialShowAvatarInfo(
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

              avatarId_ = input.readUInt32();
              break;
            }
            case 16: {

              level_ = input.readUInt32();
              break;
            }
            case 24: {

              costumeId_ = input.readUInt32();
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
      return emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.internal_static_SocialShowAvatarInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.internal_static_SocialShowAvatarInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo.class, emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo.Builder.class);
    }

    public static final int AVATAR_ID_FIELD_NUMBER = 1;
    private int avatarId_;
    /**
     * <code>uint32 avatar_id = 1;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
    }

    public static final int LEVEL_FIELD_NUMBER = 2;
    private int level_;
    /**
     * <code>uint32 level = 2;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      return level_;
    }

    public static final int COSTUME_ID_FIELD_NUMBER = 3;
    private int costumeId_;
    /**
     * <code>uint32 costume_id = 3;</code>
     * @return The costumeId.
     */
    @java.lang.Override
    public int getCostumeId() {
      return costumeId_;
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
      if (avatarId_ != 0) {
        output.writeUInt32(1, avatarId_);
      }
      if (level_ != 0) {
        output.writeUInt32(2, level_);
      }
      if (costumeId_ != 0) {
        output.writeUInt32(3, costumeId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, avatarId_);
      }
      if (level_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, level_);
      }
      if (costumeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, costumeId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo other = (emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo) obj;

      if (getAvatarId()
          != other.getAvatarId()) return false;
      if (getLevel()
          != other.getLevel()) return false;
      if (getCostumeId()
          != other.getCostumeId()) return false;
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
      hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (37 * hash) + LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getLevel();
      hash = (37 * hash) + COSTUME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCostumeId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo prototype) {
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
     * Protobuf type {@code SocialShowAvatarInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SocialShowAvatarInfo)
        emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.internal_static_SocialShowAvatarInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.internal_static_SocialShowAvatarInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo.class, emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo.newBuilder()
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
        avatarId_ = 0;

        level_ = 0;

        costumeId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.internal_static_SocialShowAvatarInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo build() {
        emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo buildPartial() {
        emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo result = new emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo(this);
        result.avatarId_ = avatarId_;
        result.level_ = level_;
        result.costumeId_ = costumeId_;
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
        if (other instanceof emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo) {
          return mergeFrom((emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo other) {
        if (other == emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo.getDefaultInstance()) return this;
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
        }
        if (other.getLevel() != 0) {
          setLevel(other.getLevel());
        }
        if (other.getCostumeId() != 0) {
          setCostumeId(other.getCostumeId());
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
        emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int avatarId_ ;
      /**
       * <code>uint32 avatar_id = 1;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatar_id = 1;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {
        
        avatarId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        
        avatarId_ = 0;
        onChanged();
        return this;
      }

      private int level_ ;
      /**
       * <code>uint32 level = 2;</code>
       * @return The level.
       */
      @java.lang.Override
      public int getLevel() {
        return level_;
      }
      /**
       * <code>uint32 level = 2;</code>
       * @param value The level to set.
       * @return This builder for chaining.
       */
      public Builder setLevel(int value) {
        
        level_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevel() {
        
        level_ = 0;
        onChanged();
        return this;
      }

      private int costumeId_ ;
      /**
       * <code>uint32 costume_id = 3;</code>
       * @return The costumeId.
       */
      @java.lang.Override
      public int getCostumeId() {
        return costumeId_;
      }
      /**
       * <code>uint32 costume_id = 3;</code>
       * @param value The costumeId to set.
       * @return This builder for chaining.
       */
      public Builder setCostumeId(int value) {
        
        costumeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 costume_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCostumeId() {
        
        costumeId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SocialShowAvatarInfo)
    }

    // @@protoc_insertion_point(class_scope:SocialShowAvatarInfo)
    private static final emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo();
    }

    public static emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SocialShowAvatarInfo>
        PARSER = new com.google.protobuf.AbstractParser<SocialShowAvatarInfo>() {
      @java.lang.Override
      public SocialShowAvatarInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SocialShowAvatarInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SocialShowAvatarInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SocialShowAvatarInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SocialShowAvatarInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SocialShowAvatarInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032SocialShowAvatarInfo.proto\"L\n\024SocialSh" +
      "owAvatarInfo\022\021\n\tavatar_id\030\001 \001(\r\022\r\n\005level" +
      "\030\002 \001(\r\022\022\n\ncostume_id\030\003 \001(\rB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SocialShowAvatarInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SocialShowAvatarInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SocialShowAvatarInfo_descriptor,
        new java.lang.String[] { "AvatarId", "Level", "CostumeId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
