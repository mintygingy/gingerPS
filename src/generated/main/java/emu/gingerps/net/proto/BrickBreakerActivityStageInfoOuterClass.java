// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BrickBreakerActivityStageInfo.proto

package emu.gingerps.net.proto;

public final class BrickBreakerActivityStageInfoOuterClass {
  private BrickBreakerActivityStageInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BrickBreakerActivityStageInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BrickBreakerActivityStageInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 stage_id = 3;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>bool Unk3300_ALOGIKNHEIM = 2;</code>
     * @return The unk3300ALOGIKNHEIM.
     */
    boolean getUnk3300ALOGIKNHEIM();

    /**
     * <code>bool Unk3300_FFKIEDNGNGK = 10;</code>
     * @return The unk3300FFKIEDNGNGK.
     */
    boolean getUnk3300FFKIEDNGNGK();
  }
  /**
   * Protobuf type {@code BrickBreakerActivityStageInfo}
   */
  public static final class BrickBreakerActivityStageInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BrickBreakerActivityStageInfo)
      BrickBreakerActivityStageInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BrickBreakerActivityStageInfo.newBuilder() to construct.
    private BrickBreakerActivityStageInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BrickBreakerActivityStageInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BrickBreakerActivityStageInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BrickBreakerActivityStageInfo(
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
            case 16: {

              unk3300ALOGIKNHEIM_ = input.readBool();
              break;
            }
            case 24: {

              stageId_ = input.readUInt32();
              break;
            }
            case 80: {

              unk3300FFKIEDNGNGK_ = input.readBool();
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
      return emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.internal_static_BrickBreakerActivityStageInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.internal_static_BrickBreakerActivityStageInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo.class, emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo.Builder.class);
    }

    public static final int STAGE_ID_FIELD_NUMBER = 3;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 3;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int UNK3300_ALOGIKNHEIM_FIELD_NUMBER = 2;
    private boolean unk3300ALOGIKNHEIM_;
    /**
     * <code>bool Unk3300_ALOGIKNHEIM = 2;</code>
     * @return The unk3300ALOGIKNHEIM.
     */
    @java.lang.Override
    public boolean getUnk3300ALOGIKNHEIM() {
      return unk3300ALOGIKNHEIM_;
    }

    public static final int UNK3300_FFKIEDNGNGK_FIELD_NUMBER = 10;
    private boolean unk3300FFKIEDNGNGK_;
    /**
     * <code>bool Unk3300_FFKIEDNGNGK = 10;</code>
     * @return The unk3300FFKIEDNGNGK.
     */
    @java.lang.Override
    public boolean getUnk3300FFKIEDNGNGK() {
      return unk3300FFKIEDNGNGK_;
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
      if (unk3300ALOGIKNHEIM_ != false) {
        output.writeBool(2, unk3300ALOGIKNHEIM_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(3, stageId_);
      }
      if (unk3300FFKIEDNGNGK_ != false) {
        output.writeBool(10, unk3300FFKIEDNGNGK_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300ALOGIKNHEIM_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, unk3300ALOGIKNHEIM_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, stageId_);
      }
      if (unk3300FFKIEDNGNGK_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, unk3300FFKIEDNGNGK_);
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
      if (!(obj instanceof emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo other = (emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo) obj;

      if (getStageId()
          != other.getStageId()) return false;
      if (getUnk3300ALOGIKNHEIM()
          != other.getUnk3300ALOGIKNHEIM()) return false;
      if (getUnk3300FFKIEDNGNGK()
          != other.getUnk3300FFKIEDNGNGK()) return false;
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
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + UNK3300_ALOGIKNHEIM_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3300ALOGIKNHEIM());
      hash = (37 * hash) + UNK3300_FFKIEDNGNGK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3300FFKIEDNGNGK());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo prototype) {
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
     * Protobuf type {@code BrickBreakerActivityStageInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BrickBreakerActivityStageInfo)
        emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.internal_static_BrickBreakerActivityStageInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.internal_static_BrickBreakerActivityStageInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo.class, emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo.newBuilder()
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
        stageId_ = 0;

        unk3300ALOGIKNHEIM_ = false;

        unk3300FFKIEDNGNGK_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.internal_static_BrickBreakerActivityStageInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo build() {
        emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo buildPartial() {
        emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo result = new emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo(this);
        result.stageId_ = stageId_;
        result.unk3300ALOGIKNHEIM_ = unk3300ALOGIKNHEIM_;
        result.unk3300FFKIEDNGNGK_ = unk3300FFKIEDNGNGK_;
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
        if (other instanceof emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo) {
          return mergeFrom((emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo other) {
        if (other == emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo.getDefaultInstance()) return this;
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getUnk3300ALOGIKNHEIM() != false) {
          setUnk3300ALOGIKNHEIM(other.getUnk3300ALOGIKNHEIM());
        }
        if (other.getUnk3300FFKIEDNGNGK() != false) {
          setUnk3300FFKIEDNGNGK(other.getUnk3300FFKIEDNGNGK());
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
        emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 3;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 3;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private boolean unk3300ALOGIKNHEIM_ ;
      /**
       * <code>bool Unk3300_ALOGIKNHEIM = 2;</code>
       * @return The unk3300ALOGIKNHEIM.
       */
      @java.lang.Override
      public boolean getUnk3300ALOGIKNHEIM() {
        return unk3300ALOGIKNHEIM_;
      }
      /**
       * <code>bool Unk3300_ALOGIKNHEIM = 2;</code>
       * @param value The unk3300ALOGIKNHEIM to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300ALOGIKNHEIM(boolean value) {
        
        unk3300ALOGIKNHEIM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3300_ALOGIKNHEIM = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300ALOGIKNHEIM() {
        
        unk3300ALOGIKNHEIM_ = false;
        onChanged();
        return this;
      }

      private boolean unk3300FFKIEDNGNGK_ ;
      /**
       * <code>bool Unk3300_FFKIEDNGNGK = 10;</code>
       * @return The unk3300FFKIEDNGNGK.
       */
      @java.lang.Override
      public boolean getUnk3300FFKIEDNGNGK() {
        return unk3300FFKIEDNGNGK_;
      }
      /**
       * <code>bool Unk3300_FFKIEDNGNGK = 10;</code>
       * @param value The unk3300FFKIEDNGNGK to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300FFKIEDNGNGK(boolean value) {
        
        unk3300FFKIEDNGNGK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3300_FFKIEDNGNGK = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300FFKIEDNGNGK() {
        
        unk3300FFKIEDNGNGK_ = false;
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


      // @@protoc_insertion_point(builder_scope:BrickBreakerActivityStageInfo)
    }

    // @@protoc_insertion_point(class_scope:BrickBreakerActivityStageInfo)
    private static final emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo();
    }

    public static emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BrickBreakerActivityStageInfo>
        PARSER = new com.google.protobuf.AbstractParser<BrickBreakerActivityStageInfo>() {
      @java.lang.Override
      public BrickBreakerActivityStageInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BrickBreakerActivityStageInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BrickBreakerActivityStageInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BrickBreakerActivityStageInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.BrickBreakerActivityStageInfoOuterClass.BrickBreakerActivityStageInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BrickBreakerActivityStageInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BrickBreakerActivityStageInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#BrickBreakerActivityStageInfo.proto\"k\n" +
      "\035BrickBreakerActivityStageInfo\022\020\n\010stage_" +
      "id\030\003 \001(\r\022\033\n\023Unk3300_ALOGIKNHEIM\030\002 \001(\010\022\033\n" +
      "\023Unk3300_FFKIEDNGNGK\030\n \001(\010B\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BrickBreakerActivityStageInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BrickBreakerActivityStageInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BrickBreakerActivityStageInfo_descriptor,
        new java.lang.String[] { "StageId", "Unk3300ALOGIKNHEIM", "Unk3300FFKIEDNGNGK", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
