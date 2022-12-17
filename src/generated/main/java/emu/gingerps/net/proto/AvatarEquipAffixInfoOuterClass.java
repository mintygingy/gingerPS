// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarEquipAffixInfo.proto

package emu.gingerps.net.proto;

public final class AvatarEquipAffixInfoOuterClass {
  private AvatarEquipAffixInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarEquipAffixInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarEquipAffixInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 equip_affix_id = 1;</code>
     * @return The equipAffixId.
     */
    int getEquipAffixId();

    /**
     * <code>uint32 left_cd_time = 2;</code>
     * @return The leftCdTime.
     */
    int getLeftCdTime();
  }
  /**
   * Protobuf type {@code AvatarEquipAffixInfo}
   */
  public static final class AvatarEquipAffixInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarEquipAffixInfo)
      AvatarEquipAffixInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarEquipAffixInfo.newBuilder() to construct.
    private AvatarEquipAffixInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarEquipAffixInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarEquipAffixInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AvatarEquipAffixInfo(
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

              equipAffixId_ = input.readUInt32();
              break;
            }
            case 16: {

              leftCdTime_ = input.readUInt32();
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
      return emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.internal_static_AvatarEquipAffixInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.internal_static_AvatarEquipAffixInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.class, emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.Builder.class);
    }

    public static final int EQUIP_AFFIX_ID_FIELD_NUMBER = 1;
    private int equipAffixId_;
    /**
     * <code>uint32 equip_affix_id = 1;</code>
     * @return The equipAffixId.
     */
    @java.lang.Override
    public int getEquipAffixId() {
      return equipAffixId_;
    }

    public static final int LEFT_CD_TIME_FIELD_NUMBER = 2;
    private int leftCdTime_;
    /**
     * <code>uint32 left_cd_time = 2;</code>
     * @return The leftCdTime.
     */
    @java.lang.Override
    public int getLeftCdTime() {
      return leftCdTime_;
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
      if (equipAffixId_ != 0) {
        output.writeUInt32(1, equipAffixId_);
      }
      if (leftCdTime_ != 0) {
        output.writeUInt32(2, leftCdTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (equipAffixId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, equipAffixId_);
      }
      if (leftCdTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, leftCdTime_);
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
      if (!(obj instanceof emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo other = (emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo) obj;

      if (getEquipAffixId()
          != other.getEquipAffixId()) return false;
      if (getLeftCdTime()
          != other.getLeftCdTime()) return false;
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
      hash = (37 * hash) + EQUIP_AFFIX_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEquipAffixId();
      hash = (37 * hash) + LEFT_CD_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getLeftCdTime();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo prototype) {
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
     * Protobuf type {@code AvatarEquipAffixInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarEquipAffixInfo)
        emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.internal_static_AvatarEquipAffixInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.internal_static_AvatarEquipAffixInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.class, emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.newBuilder()
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
        equipAffixId_ = 0;

        leftCdTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.internal_static_AvatarEquipAffixInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo build() {
        emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo buildPartial() {
        emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo result = new emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo(this);
        result.equipAffixId_ = equipAffixId_;
        result.leftCdTime_ = leftCdTime_;
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
        if (other instanceof emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo) {
          return mergeFrom((emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo other) {
        if (other == emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.getDefaultInstance()) return this;
        if (other.getEquipAffixId() != 0) {
          setEquipAffixId(other.getEquipAffixId());
        }
        if (other.getLeftCdTime() != 0) {
          setLeftCdTime(other.getLeftCdTime());
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
        emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int equipAffixId_ ;
      /**
       * <code>uint32 equip_affix_id = 1;</code>
       * @return The equipAffixId.
       */
      @java.lang.Override
      public int getEquipAffixId() {
        return equipAffixId_;
      }
      /**
       * <code>uint32 equip_affix_id = 1;</code>
       * @param value The equipAffixId to set.
       * @return This builder for chaining.
       */
      public Builder setEquipAffixId(int value) {
        
        equipAffixId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 equip_affix_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEquipAffixId() {
        
        equipAffixId_ = 0;
        onChanged();
        return this;
      }

      private int leftCdTime_ ;
      /**
       * <code>uint32 left_cd_time = 2;</code>
       * @return The leftCdTime.
       */
      @java.lang.Override
      public int getLeftCdTime() {
        return leftCdTime_;
      }
      /**
       * <code>uint32 left_cd_time = 2;</code>
       * @param value The leftCdTime to set.
       * @return This builder for chaining.
       */
      public Builder setLeftCdTime(int value) {
        
        leftCdTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 left_cd_time = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearLeftCdTime() {
        
        leftCdTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AvatarEquipAffixInfo)
    }

    // @@protoc_insertion_point(class_scope:AvatarEquipAffixInfo)
    private static final emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo();
    }

    public static emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarEquipAffixInfo>
        PARSER = new com.google.protobuf.AbstractParser<AvatarEquipAffixInfo>() {
      @java.lang.Override
      public AvatarEquipAffixInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AvatarEquipAffixInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AvatarEquipAffixInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarEquipAffixInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarEquipAffixInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarEquipAffixInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032AvatarEquipAffixInfo.proto\"D\n\024AvatarEq" +
      "uipAffixInfo\022\026\n\016equip_affix_id\030\001 \001(\r\022\024\n\014" +
      "left_cd_time\030\002 \001(\rB\030\n\026emu.gingerps.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarEquipAffixInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarEquipAffixInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarEquipAffixInfo_descriptor,
        new java.lang.String[] { "EquipAffixId", "LeftCdTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
