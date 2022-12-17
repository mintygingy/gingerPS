// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetSignInRewardRsp.proto

package emu.gingerps.net.proto;

public final class GetSignInRewardRspOuterClass {
  private GetSignInRewardRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetSignInRewardRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetSignInRewardRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.SignInInfo sign_in_info = 3;</code>
     * @return Whether the signInInfo field is set.
     */
    boolean hasSignInInfo();
    /**
     * <code>.SignInInfo sign_in_info = 3;</code>
     * @return The signInInfo.
     */
    emu.gingerps.net.proto.SignInInfoOuterClass.SignInInfo getSignInInfo();
    /**
     * <code>.SignInInfo sign_in_info = 3;</code>
     */
    emu.gingerps.net.proto.SignInInfoOuterClass.SignInInfoOrBuilder getSignInInfoOrBuilder();

    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 2543;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GetSignInRewardRsp}
   */
  public static final class GetSignInRewardRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetSignInRewardRsp)
      GetSignInRewardRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetSignInRewardRsp.newBuilder() to construct.
    private GetSignInRewardRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetSignInRewardRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetSignInRewardRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetSignInRewardRsp(
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

              retcode_ = input.readInt32();
              break;
            }
            case 26: {
              emu.gingerps.net.proto.SignInInfoOuterClass.SignInInfo.Builder subBuilder = null;
              if (signInInfo_ != null) {
                subBuilder = signInInfo_.toBuilder();
              }
              signInInfo_ = input.readMessage(emu.gingerps.net.proto.SignInInfoOuterClass.SignInInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(signInInfo_);
                signInInfo_ = subBuilder.buildPartial();
              }

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
      return emu.gingerps.net.proto.GetSignInRewardRspOuterClass.internal_static_GetSignInRewardRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.GetSignInRewardRspOuterClass.internal_static_GetSignInRewardRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp.class, emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp.Builder.class);
    }

    public static final int SIGN_IN_INFO_FIELD_NUMBER = 3;
    private emu.gingerps.net.proto.SignInInfoOuterClass.SignInInfo signInInfo_;
    /**
     * <code>.SignInInfo sign_in_info = 3;</code>
     * @return Whether the signInInfo field is set.
     */
    @java.lang.Override
    public boolean hasSignInInfo() {
      return signInInfo_ != null;
    }
    /**
     * <code>.SignInInfo sign_in_info = 3;</code>
     * @return The signInInfo.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.SignInInfoOuterClass.SignInInfo getSignInInfo() {
      return signInInfo_ == null ? emu.gingerps.net.proto.SignInInfoOuterClass.SignInInfo.getDefaultInstance() : signInInfo_;
    }
    /**
     * <code>.SignInInfo sign_in_info = 3;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.SignInInfoOuterClass.SignInInfoOrBuilder getSignInInfoOrBuilder() {
      return getSignInInfo();
    }

    public static final int RETCODE_FIELD_NUMBER = 1;
    private int retcode_;
    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (retcode_ != 0) {
        output.writeInt32(1, retcode_);
      }
      if (signInInfo_ != null) {
        output.writeMessage(3, getSignInInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, retcode_);
      }
      if (signInInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getSignInInfo());
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
      if (!(obj instanceof emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp other = (emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp) obj;

      if (hasSignInInfo() != other.hasSignInInfo()) return false;
      if (hasSignInInfo()) {
        if (!getSignInInfo()
            .equals(other.getSignInInfo())) return false;
      }
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (hasSignInInfo()) {
        hash = (37 * hash) + SIGN_IN_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getSignInInfo().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp prototype) {
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
     *   CMD_ID = 2543;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GetSignInRewardRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetSignInRewardRsp)
        emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.GetSignInRewardRspOuterClass.internal_static_GetSignInRewardRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.GetSignInRewardRspOuterClass.internal_static_GetSignInRewardRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp.class, emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp.newBuilder()
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
        if (signInInfoBuilder_ == null) {
          signInInfo_ = null;
        } else {
          signInInfo_ = null;
          signInInfoBuilder_ = null;
        }
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.GetSignInRewardRspOuterClass.internal_static_GetSignInRewardRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp build() {
        emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp buildPartial() {
        emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp result = new emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp(this);
        if (signInInfoBuilder_ == null) {
          result.signInInfo_ = signInInfo_;
        } else {
          result.signInInfo_ = signInInfoBuilder_.build();
        }
        result.retcode_ = retcode_;
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
        if (other instanceof emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp) {
          return mergeFrom((emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp other) {
        if (other == emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp.getDefaultInstance()) return this;
        if (other.hasSignInInfo()) {
          mergeSignInInfo(other.getSignInInfo());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.gingerps.net.proto.SignInInfoOuterClass.SignInInfo signInInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.SignInInfoOuterClass.SignInInfo, emu.gingerps.net.proto.SignInInfoOuterClass.SignInInfo.Builder, emu.gingerps.net.proto.SignInInfoOuterClass.SignInInfoOrBuilder> signInInfoBuilder_;
      /**
       * <code>.SignInInfo sign_in_info = 3;</code>
       * @return Whether the signInInfo field is set.
       */
      public boolean hasSignInInfo() {
        return signInInfoBuilder_ != null || signInInfo_ != null;
      }
      /**
       * <code>.SignInInfo sign_in_info = 3;</code>
       * @return The signInInfo.
       */
      public emu.gingerps.net.proto.SignInInfoOuterClass.SignInInfo getSignInInfo() {
        if (signInInfoBuilder_ == null) {
          return signInInfo_ == null ? emu.gingerps.net.proto.SignInInfoOuterClass.SignInInfo.getDefaultInstance() : signInInfo_;
        } else {
          return signInInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.SignInInfo sign_in_info = 3;</code>
       */
      public Builder setSignInInfo(emu.gingerps.net.proto.SignInInfoOuterClass.SignInInfo value) {
        if (signInInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          signInInfo_ = value;
          onChanged();
        } else {
          signInInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.SignInInfo sign_in_info = 3;</code>
       */
      public Builder setSignInInfo(
          emu.gingerps.net.proto.SignInInfoOuterClass.SignInInfo.Builder builderForValue) {
        if (signInInfoBuilder_ == null) {
          signInInfo_ = builderForValue.build();
          onChanged();
        } else {
          signInInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.SignInInfo sign_in_info = 3;</code>
       */
      public Builder mergeSignInInfo(emu.gingerps.net.proto.SignInInfoOuterClass.SignInInfo value) {
        if (signInInfoBuilder_ == null) {
          if (signInInfo_ != null) {
            signInInfo_ =
              emu.gingerps.net.proto.SignInInfoOuterClass.SignInInfo.newBuilder(signInInfo_).mergeFrom(value).buildPartial();
          } else {
            signInInfo_ = value;
          }
          onChanged();
        } else {
          signInInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.SignInInfo sign_in_info = 3;</code>
       */
      public Builder clearSignInInfo() {
        if (signInInfoBuilder_ == null) {
          signInInfo_ = null;
          onChanged();
        } else {
          signInInfo_ = null;
          signInInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.SignInInfo sign_in_info = 3;</code>
       */
      public emu.gingerps.net.proto.SignInInfoOuterClass.SignInInfo.Builder getSignInInfoBuilder() {
        
        onChanged();
        return getSignInInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.SignInInfo sign_in_info = 3;</code>
       */
      public emu.gingerps.net.proto.SignInInfoOuterClass.SignInInfoOrBuilder getSignInInfoOrBuilder() {
        if (signInInfoBuilder_ != null) {
          return signInInfoBuilder_.getMessageOrBuilder();
        } else {
          return signInInfo_ == null ?
              emu.gingerps.net.proto.SignInInfoOuterClass.SignInInfo.getDefaultInstance() : signInInfo_;
        }
      }
      /**
       * <code>.SignInInfo sign_in_info = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.SignInInfoOuterClass.SignInInfo, emu.gingerps.net.proto.SignInInfoOuterClass.SignInInfo.Builder, emu.gingerps.net.proto.SignInInfoOuterClass.SignInInfoOrBuilder> 
          getSignInInfoFieldBuilder() {
        if (signInInfoBuilder_ == null) {
          signInInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.SignInInfoOuterClass.SignInInfo, emu.gingerps.net.proto.SignInInfoOuterClass.SignInInfo.Builder, emu.gingerps.net.proto.SignInInfoOuterClass.SignInInfoOrBuilder>(
                  getSignInInfo(),
                  getParentForChildren(),
                  isClean());
          signInInfo_ = null;
        }
        return signInInfoBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 1;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GetSignInRewardRsp)
    }

    // @@protoc_insertion_point(class_scope:GetSignInRewardRsp)
    private static final emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp();
    }

    public static emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetSignInRewardRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetSignInRewardRsp>() {
      @java.lang.Override
      public GetSignInRewardRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetSignInRewardRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetSignInRewardRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetSignInRewardRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.GetSignInRewardRspOuterClass.GetSignInRewardRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetSignInRewardRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetSignInRewardRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030GetSignInRewardRsp.proto\032\020SignInInfo.p" +
      "roto\"H\n\022GetSignInRewardRsp\022!\n\014sign_in_in" +
      "fo\030\003 \001(\0132\013.SignInInfo\022\017\n\007retcode\030\001 \001(\005B\030" +
      "\n\026emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.SignInInfoOuterClass.getDescriptor(),
        });
    internal_static_GetSignInRewardRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetSignInRewardRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetSignInRewardRsp_descriptor,
        new java.lang.String[] { "SignInInfo", "Retcode", });
    emu.gingerps.net.proto.SignInInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
