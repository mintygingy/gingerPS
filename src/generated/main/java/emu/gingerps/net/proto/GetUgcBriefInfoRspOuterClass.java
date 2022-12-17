// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetUgcBriefInfoRsp.proto

package emu.gingerps.net.proto;

public final class GetUgcBriefInfoRspOuterClass {
  private GetUgcBriefInfoRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetUgcBriefInfoRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetUgcBriefInfoRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 ugc_guid = 3;</code>
     * @return The ugcGuid.
     */
    long getUgcGuid();

    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>.UgcType ugc_type = 9;</code>
     * @return The enum numeric value on the wire for ugcType.
     */
    int getUgcTypeValue();
    /**
     * <code>.UgcType ugc_type = 9;</code>
     * @return The ugcType.
     */
    emu.gingerps.net.proto.UgcTypeOuterClass.UgcType getUgcType();

    /**
     * <code>.UgcMusicBriefInfo music_brief_info = 7;</code>
     * @return Whether the musicBriefInfo field is set.
     */
    boolean hasMusicBriefInfo();
    /**
     * <code>.UgcMusicBriefInfo music_brief_info = 7;</code>
     * @return The musicBriefInfo.
     */
    emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo getMusicBriefInfo();
    /**
     * <code>.UgcMusicBriefInfo music_brief_info = 7;</code>
     */
    emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfoOrBuilder getMusicBriefInfoOrBuilder();

    public emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp.BriefCase getBriefCase();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 6335;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GetUgcBriefInfoRsp}
   */
  public static final class GetUgcBriefInfoRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetUgcBriefInfoRsp)
      GetUgcBriefInfoRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetUgcBriefInfoRsp.newBuilder() to construct.
    private GetUgcBriefInfoRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetUgcBriefInfoRsp() {
      ugcType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetUgcBriefInfoRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetUgcBriefInfoRsp(
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

              ugcGuid_ = input.readUInt64();
              break;
            }
            case 58: {
              emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo.Builder subBuilder = null;
              if (briefCase_ == 7) {
                subBuilder = ((emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo) brief_).toBuilder();
              }
              brief_ =
                  input.readMessage(emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo) brief_);
                brief_ = subBuilder.buildPartial();
              }
              briefCase_ = 7;
              break;
            }
            case 72: {
              int rawValue = input.readEnum();

              ugcType_ = rawValue;
              break;
            }
            case 96: {

              retcode_ = input.readInt32();
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
      return emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.internal_static_GetUgcBriefInfoRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.internal_static_GetUgcBriefInfoRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp.class, emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp.Builder.class);
    }

    private int briefCase_ = 0;
    private java.lang.Object brief_;
    public enum BriefCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      MUSIC_BRIEF_INFO(7),
      BRIEF_NOT_SET(0);
      private final int value;
      private BriefCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static BriefCase valueOf(int value) {
        return forNumber(value);
      }

      public static BriefCase forNumber(int value) {
        switch (value) {
          case 7: return MUSIC_BRIEF_INFO;
          case 0: return BRIEF_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public BriefCase
    getBriefCase() {
      return BriefCase.forNumber(
          briefCase_);
    }

    public static final int UGC_GUID_FIELD_NUMBER = 3;
    private long ugcGuid_;
    /**
     * <code>uint64 ugc_guid = 3;</code>
     * @return The ugcGuid.
     */
    @java.lang.Override
    public long getUgcGuid() {
      return ugcGuid_;
    }

    public static final int RETCODE_FIELD_NUMBER = 12;
    private int retcode_;
    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int UGC_TYPE_FIELD_NUMBER = 9;
    private int ugcType_;
    /**
     * <code>.UgcType ugc_type = 9;</code>
     * @return The enum numeric value on the wire for ugcType.
     */
    @java.lang.Override public int getUgcTypeValue() {
      return ugcType_;
    }
    /**
     * <code>.UgcType ugc_type = 9;</code>
     * @return The ugcType.
     */
    @java.lang.Override public emu.gingerps.net.proto.UgcTypeOuterClass.UgcType getUgcType() {
      @SuppressWarnings("deprecation")
      emu.gingerps.net.proto.UgcTypeOuterClass.UgcType result = emu.gingerps.net.proto.UgcTypeOuterClass.UgcType.valueOf(ugcType_);
      return result == null ? emu.gingerps.net.proto.UgcTypeOuterClass.UgcType.UNRECOGNIZED : result;
    }

    public static final int MUSIC_BRIEF_INFO_FIELD_NUMBER = 7;
    /**
     * <code>.UgcMusicBriefInfo music_brief_info = 7;</code>
     * @return Whether the musicBriefInfo field is set.
     */
    @java.lang.Override
    public boolean hasMusicBriefInfo() {
      return briefCase_ == 7;
    }
    /**
     * <code>.UgcMusicBriefInfo music_brief_info = 7;</code>
     * @return The musicBriefInfo.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo getMusicBriefInfo() {
      if (briefCase_ == 7) {
         return (emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo) brief_;
      }
      return emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo.getDefaultInstance();
    }
    /**
     * <code>.UgcMusicBriefInfo music_brief_info = 7;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfoOrBuilder getMusicBriefInfoOrBuilder() {
      if (briefCase_ == 7) {
         return (emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo) brief_;
      }
      return emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo.getDefaultInstance();
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
      if (ugcGuid_ != 0L) {
        output.writeUInt64(3, ugcGuid_);
      }
      if (briefCase_ == 7) {
        output.writeMessage(7, (emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo) brief_);
      }
      if (ugcType_ != emu.gingerps.net.proto.UgcTypeOuterClass.UgcType.UGC_TYPE_NONE.getNumber()) {
        output.writeEnum(9, ugcType_);
      }
      if (retcode_ != 0) {
        output.writeInt32(12, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (ugcGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, ugcGuid_);
      }
      if (briefCase_ == 7) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, (emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo) brief_);
      }
      if (ugcType_ != emu.gingerps.net.proto.UgcTypeOuterClass.UgcType.UGC_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(9, ugcType_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, retcode_);
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
      if (!(obj instanceof emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp other = (emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp) obj;

      if (getUgcGuid()
          != other.getUgcGuid()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (ugcType_ != other.ugcType_) return false;
      if (!getBriefCase().equals(other.getBriefCase())) return false;
      switch (briefCase_) {
        case 7:
          if (!getMusicBriefInfo()
              .equals(other.getMusicBriefInfo())) return false;
          break;
        case 0:
        default:
      }
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
      hash = (37 * hash) + UGC_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getUgcGuid());
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + UGC_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + ugcType_;
      switch (briefCase_) {
        case 7:
          hash = (37 * hash) + MUSIC_BRIEF_INFO_FIELD_NUMBER;
          hash = (53 * hash) + getMusicBriefInfo().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp prototype) {
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
     *   CMD_ID = 6335;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GetUgcBriefInfoRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetUgcBriefInfoRsp)
        emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.internal_static_GetUgcBriefInfoRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.internal_static_GetUgcBriefInfoRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp.class, emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp.newBuilder()
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
        ugcGuid_ = 0L;

        retcode_ = 0;

        ugcType_ = 0;

        briefCase_ = 0;
        brief_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.internal_static_GetUgcBriefInfoRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp build() {
        emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp buildPartial() {
        emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp result = new emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp(this);
        result.ugcGuid_ = ugcGuid_;
        result.retcode_ = retcode_;
        result.ugcType_ = ugcType_;
        if (briefCase_ == 7) {
          if (musicBriefInfoBuilder_ == null) {
            result.brief_ = brief_;
          } else {
            result.brief_ = musicBriefInfoBuilder_.build();
          }
        }
        result.briefCase_ = briefCase_;
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
        if (other instanceof emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp) {
          return mergeFrom((emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp other) {
        if (other == emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp.getDefaultInstance()) return this;
        if (other.getUgcGuid() != 0L) {
          setUgcGuid(other.getUgcGuid());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.ugcType_ != 0) {
          setUgcTypeValue(other.getUgcTypeValue());
        }
        switch (other.getBriefCase()) {
          case MUSIC_BRIEF_INFO: {
            mergeMusicBriefInfo(other.getMusicBriefInfo());
            break;
          }
          case BRIEF_NOT_SET: {
            break;
          }
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
        emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int briefCase_ = 0;
      private java.lang.Object brief_;
      public BriefCase
          getBriefCase() {
        return BriefCase.forNumber(
            briefCase_);
      }

      public Builder clearBrief() {
        briefCase_ = 0;
        brief_ = null;
        onChanged();
        return this;
      }


      private long ugcGuid_ ;
      /**
       * <code>uint64 ugc_guid = 3;</code>
       * @return The ugcGuid.
       */
      @java.lang.Override
      public long getUgcGuid() {
        return ugcGuid_;
      }
      /**
       * <code>uint64 ugc_guid = 3;</code>
       * @param value The ugcGuid to set.
       * @return This builder for chaining.
       */
      public Builder setUgcGuid(long value) {
        
        ugcGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 ugc_guid = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUgcGuid() {
        
        ugcGuid_ = 0L;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 12;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int ugcType_ = 0;
      /**
       * <code>.UgcType ugc_type = 9;</code>
       * @return The enum numeric value on the wire for ugcType.
       */
      @java.lang.Override public int getUgcTypeValue() {
        return ugcType_;
      }
      /**
       * <code>.UgcType ugc_type = 9;</code>
       * @param value The enum numeric value on the wire for ugcType to set.
       * @return This builder for chaining.
       */
      public Builder setUgcTypeValue(int value) {
        
        ugcType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.UgcType ugc_type = 9;</code>
       * @return The ugcType.
       */
      @java.lang.Override
      public emu.gingerps.net.proto.UgcTypeOuterClass.UgcType getUgcType() {
        @SuppressWarnings("deprecation")
        emu.gingerps.net.proto.UgcTypeOuterClass.UgcType result = emu.gingerps.net.proto.UgcTypeOuterClass.UgcType.valueOf(ugcType_);
        return result == null ? emu.gingerps.net.proto.UgcTypeOuterClass.UgcType.UNRECOGNIZED : result;
      }
      /**
       * <code>.UgcType ugc_type = 9;</code>
       * @param value The ugcType to set.
       * @return This builder for chaining.
       */
      public Builder setUgcType(emu.gingerps.net.proto.UgcTypeOuterClass.UgcType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        ugcType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.UgcType ugc_type = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearUgcType() {
        
        ugcType_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo, emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo.Builder, emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfoOrBuilder> musicBriefInfoBuilder_;
      /**
       * <code>.UgcMusicBriefInfo music_brief_info = 7;</code>
       * @return Whether the musicBriefInfo field is set.
       */
      @java.lang.Override
      public boolean hasMusicBriefInfo() {
        return briefCase_ == 7;
      }
      /**
       * <code>.UgcMusicBriefInfo music_brief_info = 7;</code>
       * @return The musicBriefInfo.
       */
      @java.lang.Override
      public emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo getMusicBriefInfo() {
        if (musicBriefInfoBuilder_ == null) {
          if (briefCase_ == 7) {
            return (emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo) brief_;
          }
          return emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo.getDefaultInstance();
        } else {
          if (briefCase_ == 7) {
            return musicBriefInfoBuilder_.getMessage();
          }
          return emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo.getDefaultInstance();
        }
      }
      /**
       * <code>.UgcMusicBriefInfo music_brief_info = 7;</code>
       */
      public Builder setMusicBriefInfo(emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo value) {
        if (musicBriefInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          brief_ = value;
          onChanged();
        } else {
          musicBriefInfoBuilder_.setMessage(value);
        }
        briefCase_ = 7;
        return this;
      }
      /**
       * <code>.UgcMusicBriefInfo music_brief_info = 7;</code>
       */
      public Builder setMusicBriefInfo(
          emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo.Builder builderForValue) {
        if (musicBriefInfoBuilder_ == null) {
          brief_ = builderForValue.build();
          onChanged();
        } else {
          musicBriefInfoBuilder_.setMessage(builderForValue.build());
        }
        briefCase_ = 7;
        return this;
      }
      /**
       * <code>.UgcMusicBriefInfo music_brief_info = 7;</code>
       */
      public Builder mergeMusicBriefInfo(emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo value) {
        if (musicBriefInfoBuilder_ == null) {
          if (briefCase_ == 7 &&
              brief_ != emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo.getDefaultInstance()) {
            brief_ = emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo.newBuilder((emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo) brief_)
                .mergeFrom(value).buildPartial();
          } else {
            brief_ = value;
          }
          onChanged();
        } else {
          if (briefCase_ == 7) {
            musicBriefInfoBuilder_.mergeFrom(value);
          }
          musicBriefInfoBuilder_.setMessage(value);
        }
        briefCase_ = 7;
        return this;
      }
      /**
       * <code>.UgcMusicBriefInfo music_brief_info = 7;</code>
       */
      public Builder clearMusicBriefInfo() {
        if (musicBriefInfoBuilder_ == null) {
          if (briefCase_ == 7) {
            briefCase_ = 0;
            brief_ = null;
            onChanged();
          }
        } else {
          if (briefCase_ == 7) {
            briefCase_ = 0;
            brief_ = null;
          }
          musicBriefInfoBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.UgcMusicBriefInfo music_brief_info = 7;</code>
       */
      public emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo.Builder getMusicBriefInfoBuilder() {
        return getMusicBriefInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.UgcMusicBriefInfo music_brief_info = 7;</code>
       */
      @java.lang.Override
      public emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfoOrBuilder getMusicBriefInfoOrBuilder() {
        if ((briefCase_ == 7) && (musicBriefInfoBuilder_ != null)) {
          return musicBriefInfoBuilder_.getMessageOrBuilder();
        } else {
          if (briefCase_ == 7) {
            return (emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo) brief_;
          }
          return emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo.getDefaultInstance();
        }
      }
      /**
       * <code>.UgcMusicBriefInfo music_brief_info = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo, emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo.Builder, emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfoOrBuilder> 
          getMusicBriefInfoFieldBuilder() {
        if (musicBriefInfoBuilder_ == null) {
          if (!(briefCase_ == 7)) {
            brief_ = emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo.getDefaultInstance();
          }
          musicBriefInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo, emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo.Builder, emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfoOrBuilder>(
                  (emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo) brief_,
                  getParentForChildren(),
                  isClean());
          brief_ = null;
        }
        briefCase_ = 7;
        onChanged();;
        return musicBriefInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GetUgcBriefInfoRsp)
    }

    // @@protoc_insertion_point(class_scope:GetUgcBriefInfoRsp)
    private static final emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp();
    }

    public static emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetUgcBriefInfoRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetUgcBriefInfoRsp>() {
      @java.lang.Override
      public GetUgcBriefInfoRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetUgcBriefInfoRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetUgcBriefInfoRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetUgcBriefInfoRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetUgcBriefInfoRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetUgcBriefInfoRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030GetUgcBriefInfoRsp.proto\032\027UgcMusicBrie" +
      "fInfo.proto\032\rUgcType.proto\"\214\001\n\022GetUgcBri" +
      "efInfoRsp\022\020\n\010ugc_guid\030\003 \001(\004\022\017\n\007retcode\030\014" +
      " \001(\005\022\032\n\010ugc_type\030\t \001(\0162\010.UgcType\022.\n\020musi" +
      "c_brief_info\030\007 \001(\0132\022.UgcMusicBriefInfoH\000" +
      "B\007\n\005briefB\030\n\026emu.gingerps.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.getDescriptor(),
          emu.gingerps.net.proto.UgcTypeOuterClass.getDescriptor(),
        });
    internal_static_GetUgcBriefInfoRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetUgcBriefInfoRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetUgcBriefInfoRsp_descriptor,
        new java.lang.String[] { "UgcGuid", "Retcode", "UgcType", "MusicBriefInfo", "Brief", });
    emu.gingerps.net.proto.UgcMusicBriefInfoOuterClass.getDescriptor();
    emu.gingerps.net.proto.UgcTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
