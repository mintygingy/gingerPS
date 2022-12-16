// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PotionDungeonAvatar.proto

package emu.gingerps.net.proto;

public final class PotionDungeonAvatarOuterClass {
  private PotionDungeonAvatarOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PotionDungeonAvatarOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PotionDungeonAvatar)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 avatar_guid = 14;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();

    /**
     * <code>bool is_trial = 1;</code>
     * @return The isTrial.
     */
    boolean getIsTrial();
  }
  /**
   * Protobuf type {@code PotionDungeonAvatar}
   */
  public static final class PotionDungeonAvatar extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PotionDungeonAvatar)
      PotionDungeonAvatarOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PotionDungeonAvatar.newBuilder() to construct.
    private PotionDungeonAvatar(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PotionDungeonAvatar() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PotionDungeonAvatar();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PotionDungeonAvatar(
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

              isTrial_ = input.readBool();
              break;
            }
            case 112: {

              avatarGuid_ = input.readUInt64();
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
      return emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.internal_static_PotionDungeonAvatar_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.internal_static_PotionDungeonAvatar_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar.class, emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar.Builder.class);
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 14;
    private long avatarGuid_;
    /**
     * <code>uint64 avatar_guid = 14;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
    }

    public static final int IS_TRIAL_FIELD_NUMBER = 1;
    private boolean isTrial_;
    /**
     * <code>bool is_trial = 1;</code>
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
      if (isTrial_ != false) {
        output.writeBool(1, isTrial_);
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(14, avatarGuid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isTrial_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isTrial_);
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(14, avatarGuid_);
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
      if (!(obj instanceof emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar other = (emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar) obj;

      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
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
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (37 * hash) + IS_TRIAL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsTrial());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar prototype) {
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
     * Protobuf type {@code PotionDungeonAvatar}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PotionDungeonAvatar)
        emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatarOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.internal_static_PotionDungeonAvatar_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.internal_static_PotionDungeonAvatar_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar.class, emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar.newBuilder()
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
        avatarGuid_ = 0L;

        isTrial_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.internal_static_PotionDungeonAvatar_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar getDefaultInstanceForType() {
        return emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar build() {
        emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar buildPartial() {
        emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar result = new emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar(this);
        result.avatarGuid_ = avatarGuid_;
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
        if (other instanceof emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar) {
          return mergeFrom((emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar other) {
        if (other == emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar.getDefaultInstance()) return this;
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
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
        emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 14;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 14;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        
        avatarGuid_ = 0L;
        onChanged();
        return this;
      }

      private boolean isTrial_ ;
      /**
       * <code>bool is_trial = 1;</code>
       * @return The isTrial.
       */
      @java.lang.Override
      public boolean getIsTrial() {
        return isTrial_;
      }
      /**
       * <code>bool is_trial = 1;</code>
       * @param value The isTrial to set.
       * @return This builder for chaining.
       */
      public Builder setIsTrial(boolean value) {
        
        isTrial_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_trial = 1;</code>
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


      // @@protoc_insertion_point(builder_scope:PotionDungeonAvatar)
    }

    // @@protoc_insertion_point(class_scope:PotionDungeonAvatar)
    private static final emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar();
    }

    public static emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PotionDungeonAvatar>
        PARSER = new com.google.protobuf.AbstractParser<PotionDungeonAvatar>() {
      @java.lang.Override
      public PotionDungeonAvatar parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PotionDungeonAvatar(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PotionDungeonAvatar> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PotionDungeonAvatar> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PotionDungeonAvatar_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PotionDungeonAvatar_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031PotionDungeonAvatar.proto\"<\n\023PotionDun" +
      "geonAvatar\022\023\n\013avatar_guid\030\016 \001(\004\022\020\n\010is_tr" +
      "ial\030\001 \001(\010B\033\n\031emu.gingerps.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PotionDungeonAvatar_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PotionDungeonAvatar_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PotionDungeonAvatar_descriptor,
        new java.lang.String[] { "AvatarGuid", "IsTrial", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
