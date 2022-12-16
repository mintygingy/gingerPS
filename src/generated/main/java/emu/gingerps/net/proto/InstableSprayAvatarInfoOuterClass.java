// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InstableSprayAvatarInfo.proto

package emu.gingerps.net.proto;

public final class InstableSprayAvatarInfoOuterClass {
  private InstableSprayAvatarInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InstableSprayAvatarInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InstableSprayAvatarInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 avatar_id = 10;</code>
     * @return The avatarId.
     */
    long getAvatarId();

    /**
     * <code>bool is_trial = 12;</code>
     * @return The isTrial.
     */
    boolean getIsTrial();
  }
  /**
   * Protobuf type {@code InstableSprayAvatarInfo}
   */
  public static final class InstableSprayAvatarInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InstableSprayAvatarInfo)
      InstableSprayAvatarInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InstableSprayAvatarInfo.newBuilder() to construct.
    private InstableSprayAvatarInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InstableSprayAvatarInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InstableSprayAvatarInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private InstableSprayAvatarInfo(
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
            case 80: {

              avatarId_ = input.readUInt64();
              break;
            }
            case 96: {

              isTrial_ = input.readBool();
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
      return emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.internal_static_InstableSprayAvatarInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.internal_static_InstableSprayAvatarInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.class, emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.Builder.class);
    }

    public static final int AVATAR_ID_FIELD_NUMBER = 10;
    private long avatarId_;
    /**
     * <code>uint64 avatar_id = 10;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public long getAvatarId() {
      return avatarId_;
    }

    public static final int IS_TRIAL_FIELD_NUMBER = 12;
    private boolean isTrial_;
    /**
     * <code>bool is_trial = 12;</code>
     * @return The isTrial.
     */
    @java.lang.Override
    public boolean getIsTrial() {
      return isTrial_;
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
      if (avatarId_ != 0L) {
        output.writeUInt64(10, avatarId_);
      }
      if (isTrial_ != false) {
        output.writeBool(12, isTrial_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (avatarId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(10, avatarId_);
      }
      if (isTrial_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isTrial_);
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
      if (!(obj instanceof emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo other = (emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo) obj;

      if (getAvatarId()
          != other.getAvatarId()) return false;
      if (getIsTrial()
          != other.getIsTrial()) return false;
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
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarId());
      hash = (37 * hash) + IS_TRIAL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsTrial());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo prototype) {
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
     * Protobuf type {@code InstableSprayAvatarInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InstableSprayAvatarInfo)
        emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.internal_static_InstableSprayAvatarInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.internal_static_InstableSprayAvatarInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.class, emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.newBuilder()
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
        avatarId_ = 0L;

        isTrial_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.internal_static_InstableSprayAvatarInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo build() {
        emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo buildPartial() {
        emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo result = new emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo(this);
        result.avatarId_ = avatarId_;
        result.isTrial_ = isTrial_;
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
        if (other instanceof emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo) {
          return mergeFrom((emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo other) {
        if (other == emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.getDefaultInstance()) return this;
        if (other.getAvatarId() != 0L) {
          setAvatarId(other.getAvatarId());
        }
        if (other.getIsTrial() != false) {
          setIsTrial(other.getIsTrial());
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
        emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long avatarId_ ;
      /**
       * <code>uint64 avatar_id = 10;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public long getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint64 avatar_id = 10;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(long value) {
        
        avatarId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        
        avatarId_ = 0L;
        onChanged();
        return this;
      }

      private boolean isTrial_ ;
      /**
       * <code>bool is_trial = 12;</code>
       * @return The isTrial.
       */
      @java.lang.Override
      public boolean getIsTrial() {
        return isTrial_;
      }
      /**
       * <code>bool is_trial = 12;</code>
       * @param value The isTrial to set.
       * @return This builder for chaining.
       */
      public Builder setIsTrial(boolean value) {
        
        isTrial_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_trial = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsTrial() {
        
        isTrial_ = false;
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


      // @@protoc_insertion_point(builder_scope:InstableSprayAvatarInfo)
    }

    // @@protoc_insertion_point(class_scope:InstableSprayAvatarInfo)
    private static final emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo();
    }

    public static emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InstableSprayAvatarInfo>
        PARSER = new com.google.protobuf.AbstractParser<InstableSprayAvatarInfo>() {
      @java.lang.Override
      public InstableSprayAvatarInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new InstableSprayAvatarInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<InstableSprayAvatarInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InstableSprayAvatarInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InstableSprayAvatarInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InstableSprayAvatarInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035InstableSprayAvatarInfo.proto\">\n\027Insta" +
      "bleSprayAvatarInfo\022\021\n\tavatar_id\030\n \001(\004\022\020\n" +
      "\010is_trial\030\014 \001(\010B\033\n\031emu.gingerps.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_InstableSprayAvatarInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InstableSprayAvatarInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InstableSprayAvatarInfo_descriptor,
        new java.lang.String[] { "AvatarId", "IsTrial", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}