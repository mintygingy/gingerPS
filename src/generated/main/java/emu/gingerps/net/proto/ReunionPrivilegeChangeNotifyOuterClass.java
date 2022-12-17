// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReunionPrivilegeChangeNotify.proto

package emu.gingerps.net.proto;

public final class ReunionPrivilegeChangeNotifyOuterClass {
  private ReunionPrivilegeChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReunionPrivilegeChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReunionPrivilegeChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ReunionPrivilegeInfo privilege_info = 10;</code>
     * @return Whether the privilegeInfo field is set.
     */
    boolean hasPrivilegeInfo();
    /**
     * <code>.ReunionPrivilegeInfo privilege_info = 10;</code>
     * @return The privilegeInfo.
     */
    emu.gingerps.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo getPrivilegeInfo();
    /**
     * <code>.ReunionPrivilegeInfo privilege_info = 10;</code>
     */
    emu.gingerps.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfoOrBuilder getPrivilegeInfoOrBuilder();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 5087;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ReunionPrivilegeChangeNotify}
   */
  public static final class ReunionPrivilegeChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ReunionPrivilegeChangeNotify)
      ReunionPrivilegeChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReunionPrivilegeChangeNotify.newBuilder() to construct.
    private ReunionPrivilegeChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReunionPrivilegeChangeNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ReunionPrivilegeChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.internal_static_ReunionPrivilegeChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.internal_static_ReunionPrivilegeChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify.class, emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify.Builder.class);
    }

    public static final int PRIVILEGE_INFO_FIELD_NUMBER = 10;
    private emu.gingerps.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo privilegeInfo_;
    /**
     * <code>.ReunionPrivilegeInfo privilege_info = 10;</code>
     * @return Whether the privilegeInfo field is set.
     */
    @java.lang.Override
    public boolean hasPrivilegeInfo() {
      return privilegeInfo_ != null;
    }
    /**
     * <code>.ReunionPrivilegeInfo privilege_info = 10;</code>
     * @return The privilegeInfo.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo getPrivilegeInfo() {
      return privilegeInfo_ == null ? emu.gingerps.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.getDefaultInstance() : privilegeInfo_;
    }
    /**
     * <code>.ReunionPrivilegeInfo privilege_info = 10;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfoOrBuilder getPrivilegeInfoOrBuilder() {
      return privilegeInfo_ == null ? emu.gingerps.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.getDefaultInstance() : privilegeInfo_;
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
      if (privilegeInfo_ != null) {
        output.writeMessage(10, getPrivilegeInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (privilegeInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, getPrivilegeInfo());
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
      if (!(obj instanceof emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify other = (emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify) obj;

      if (hasPrivilegeInfo() != other.hasPrivilegeInfo()) return false;
      if (hasPrivilegeInfo()) {
        if (!getPrivilegeInfo()
            .equals(other.getPrivilegeInfo())) return false;
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
      if (hasPrivilegeInfo()) {
        hash = (37 * hash) + PRIVILEGE_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getPrivilegeInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify prototype) {
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
     *   CMD_ID = 5087;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ReunionPrivilegeChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReunionPrivilegeChangeNotify)
        emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.internal_static_ReunionPrivilegeChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.internal_static_ReunionPrivilegeChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify.class, emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify.newBuilder()
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
        privilegeInfo_ = null;
        if (privilegeInfoBuilder_ != null) {
          privilegeInfoBuilder_.dispose();
          privilegeInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.internal_static_ReunionPrivilegeChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify build() {
        emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify buildPartial() {
        emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify result = new emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.privilegeInfo_ = privilegeInfoBuilder_ == null
              ? privilegeInfo_
              : privilegeInfoBuilder_.build();
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
        if (other instanceof emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify) {
          return mergeFrom((emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify other) {
        if (other == emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify.getDefaultInstance()) return this;
        if (other.hasPrivilegeInfo()) {
          mergePrivilegeInfo(other.getPrivilegeInfo());
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
              case 82: {
                input.readMessage(
                    getPrivilegeInfoFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 82
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

      private emu.gingerps.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo privilegeInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo, emu.gingerps.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.Builder, emu.gingerps.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfoOrBuilder> privilegeInfoBuilder_;
      /**
       * <code>.ReunionPrivilegeInfo privilege_info = 10;</code>
       * @return Whether the privilegeInfo field is set.
       */
      public boolean hasPrivilegeInfo() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.ReunionPrivilegeInfo privilege_info = 10;</code>
       * @return The privilegeInfo.
       */
      public emu.gingerps.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo getPrivilegeInfo() {
        if (privilegeInfoBuilder_ == null) {
          return privilegeInfo_ == null ? emu.gingerps.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.getDefaultInstance() : privilegeInfo_;
        } else {
          return privilegeInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.ReunionPrivilegeInfo privilege_info = 10;</code>
       */
      public Builder setPrivilegeInfo(emu.gingerps.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo value) {
        if (privilegeInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          privilegeInfo_ = value;
        } else {
          privilegeInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.ReunionPrivilegeInfo privilege_info = 10;</code>
       */
      public Builder setPrivilegeInfo(
          emu.gingerps.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.Builder builderForValue) {
        if (privilegeInfoBuilder_ == null) {
          privilegeInfo_ = builderForValue.build();
        } else {
          privilegeInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.ReunionPrivilegeInfo privilege_info = 10;</code>
       */
      public Builder mergePrivilegeInfo(emu.gingerps.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo value) {
        if (privilegeInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            privilegeInfo_ != null &&
            privilegeInfo_ != emu.gingerps.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.getDefaultInstance()) {
            getPrivilegeInfoBuilder().mergeFrom(value);
          } else {
            privilegeInfo_ = value;
          }
        } else {
          privilegeInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.ReunionPrivilegeInfo privilege_info = 10;</code>
       */
      public Builder clearPrivilegeInfo() {
        bitField0_ = (bitField0_ & ~0x00000001);
        privilegeInfo_ = null;
        if (privilegeInfoBuilder_ != null) {
          privilegeInfoBuilder_.dispose();
          privilegeInfoBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.ReunionPrivilegeInfo privilege_info = 10;</code>
       */
      public emu.gingerps.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.Builder getPrivilegeInfoBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getPrivilegeInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.ReunionPrivilegeInfo privilege_info = 10;</code>
       */
      public emu.gingerps.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfoOrBuilder getPrivilegeInfoOrBuilder() {
        if (privilegeInfoBuilder_ != null) {
          return privilegeInfoBuilder_.getMessageOrBuilder();
        } else {
          return privilegeInfo_ == null ?
              emu.gingerps.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.getDefaultInstance() : privilegeInfo_;
        }
      }
      /**
       * <code>.ReunionPrivilegeInfo privilege_info = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo, emu.gingerps.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.Builder, emu.gingerps.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfoOrBuilder> 
          getPrivilegeInfoFieldBuilder() {
        if (privilegeInfoBuilder_ == null) {
          privilegeInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo, emu.gingerps.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.Builder, emu.gingerps.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfoOrBuilder>(
                  getPrivilegeInfo(),
                  getParentForChildren(),
                  isClean());
          privilegeInfo_ = null;
        }
        return privilegeInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ReunionPrivilegeChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:ReunionPrivilegeChangeNotify)
    private static final emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify();
    }

    public static emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReunionPrivilegeChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<ReunionPrivilegeChangeNotify>() {
      @java.lang.Override
      public ReunionPrivilegeChangeNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<ReunionPrivilegeChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReunionPrivilegeChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ReunionPrivilegeChangeNotifyOuterClass.ReunionPrivilegeChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReunionPrivilegeChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReunionPrivilegeChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"ReunionPrivilegeChangeNotify.proto\032\032Re" +
      "unionPrivilegeInfo.proto\"M\n\034ReunionPrivi" +
      "legeChangeNotify\022-\n\016privilege_info\030\n \001(\013" +
      "2\025.ReunionPrivilegeInfoB\030\n\026emu.gingerps." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.ReunionPrivilegeInfoOuterClass.getDescriptor(),
        });
    internal_static_ReunionPrivilegeChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ReunionPrivilegeChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReunionPrivilegeChangeNotify_descriptor,
        new java.lang.String[] { "PrivilegeInfo", });
    emu.gingerps.net.proto.ReunionPrivilegeInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
