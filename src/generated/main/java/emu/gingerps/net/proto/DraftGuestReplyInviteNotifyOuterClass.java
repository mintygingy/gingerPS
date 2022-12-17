// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DraftGuestReplyInviteNotify.proto

package emu.gingerps.net.proto;

public final class DraftGuestReplyInviteNotifyOuterClass {
  private DraftGuestReplyInviteNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DraftGuestReplyInviteNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DraftGuestReplyInviteNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_agree = 1;</code>
     * @return The isAgree.
     */
    boolean getIsAgree();

    /**
     * <code>uint32 guest_uid = 13;</code>
     * @return The guestUid.
     */
    int getGuestUid();

    /**
     * <code>uint32 draft_id = 2;</code>
     * @return The draftId.
     */
    int getDraftId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 5447;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code DraftGuestReplyInviteNotify}
   */
  public static final class DraftGuestReplyInviteNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DraftGuestReplyInviteNotify)
      DraftGuestReplyInviteNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DraftGuestReplyInviteNotify.newBuilder() to construct.
    private DraftGuestReplyInviteNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DraftGuestReplyInviteNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DraftGuestReplyInviteNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.internal_static_DraftGuestReplyInviteNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.internal_static_DraftGuestReplyInviteNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify.class, emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify.Builder.class);
    }

    public static final int IS_AGREE_FIELD_NUMBER = 1;
    private boolean isAgree_ = false;
    /**
     * <code>bool is_agree = 1;</code>
     * @return The isAgree.
     */
    @java.lang.Override
    public boolean getIsAgree() {
      return isAgree_;
    }

    public static final int GUEST_UID_FIELD_NUMBER = 13;
    private int guestUid_ = 0;
    /**
     * <code>uint32 guest_uid = 13;</code>
     * @return The guestUid.
     */
    @java.lang.Override
    public int getGuestUid() {
      return guestUid_;
    }

    public static final int DRAFT_ID_FIELD_NUMBER = 2;
    private int draftId_ = 0;
    /**
     * <code>uint32 draft_id = 2;</code>
     * @return The draftId.
     */
    @java.lang.Override
    public int getDraftId() {
      return draftId_;
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
      if (isAgree_ != false) {
        output.writeBool(1, isAgree_);
      }
      if (draftId_ != 0) {
        output.writeUInt32(2, draftId_);
      }
      if (guestUid_ != 0) {
        output.writeUInt32(13, guestUid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isAgree_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isAgree_);
      }
      if (draftId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, draftId_);
      }
      if (guestUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, guestUid_);
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
      if (!(obj instanceof emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify other = (emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify) obj;

      if (getIsAgree()
          != other.getIsAgree()) return false;
      if (getGuestUid()
          != other.getGuestUid()) return false;
      if (getDraftId()
          != other.getDraftId()) return false;
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
      hash = (37 * hash) + IS_AGREE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAgree());
      hash = (37 * hash) + GUEST_UID_FIELD_NUMBER;
      hash = (53 * hash) + getGuestUid();
      hash = (37 * hash) + DRAFT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDraftId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify prototype) {
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
     *   CMD_ID = 5447;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code DraftGuestReplyInviteNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DraftGuestReplyInviteNotify)
        emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.internal_static_DraftGuestReplyInviteNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.internal_static_DraftGuestReplyInviteNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify.class, emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify.newBuilder()
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
        isAgree_ = false;
        guestUid_ = 0;
        draftId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.internal_static_DraftGuestReplyInviteNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify build() {
        emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify buildPartial() {
        emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify result = new emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isAgree_ = isAgree_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.guestUid_ = guestUid_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.draftId_ = draftId_;
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
        if (other instanceof emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify) {
          return mergeFrom((emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify other) {
        if (other == emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify.getDefaultInstance()) return this;
        if (other.getIsAgree() != false) {
          setIsAgree(other.getIsAgree());
        }
        if (other.getGuestUid() != 0) {
          setGuestUid(other.getGuestUid());
        }
        if (other.getDraftId() != 0) {
          setDraftId(other.getDraftId());
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
                isAgree_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                draftId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 16
              case 104: {
                guestUid_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 104
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

      private boolean isAgree_ ;
      /**
       * <code>bool is_agree = 1;</code>
       * @return The isAgree.
       */
      @java.lang.Override
      public boolean getIsAgree() {
        return isAgree_;
      }
      /**
       * <code>bool is_agree = 1;</code>
       * @param value The isAgree to set.
       * @return This builder for chaining.
       */
      public Builder setIsAgree(boolean value) {
        
        isAgree_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_agree = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAgree() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isAgree_ = false;
        onChanged();
        return this;
      }

      private int guestUid_ ;
      /**
       * <code>uint32 guest_uid = 13;</code>
       * @return The guestUid.
       */
      @java.lang.Override
      public int getGuestUid() {
        return guestUid_;
      }
      /**
       * <code>uint32 guest_uid = 13;</code>
       * @param value The guestUid to set.
       * @return This builder for chaining.
       */
      public Builder setGuestUid(int value) {
        
        guestUid_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 guest_uid = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuestUid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        guestUid_ = 0;
        onChanged();
        return this;
      }

      private int draftId_ ;
      /**
       * <code>uint32 draft_id = 2;</code>
       * @return The draftId.
       */
      @java.lang.Override
      public int getDraftId() {
        return draftId_;
      }
      /**
       * <code>uint32 draft_id = 2;</code>
       * @param value The draftId to set.
       * @return This builder for chaining.
       */
      public Builder setDraftId(int value) {
        
        draftId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 draft_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDraftId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        draftId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DraftGuestReplyInviteNotify)
    }

    // @@protoc_insertion_point(class_scope:DraftGuestReplyInviteNotify)
    private static final emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify();
    }

    public static emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DraftGuestReplyInviteNotify>
        PARSER = new com.google.protobuf.AbstractParser<DraftGuestReplyInviteNotify>() {
      @java.lang.Override
      public DraftGuestReplyInviteNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<DraftGuestReplyInviteNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DraftGuestReplyInviteNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DraftGuestReplyInviteNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DraftGuestReplyInviteNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!DraftGuestReplyInviteNotify.proto\"T\n\033D" +
      "raftGuestReplyInviteNotify\022\020\n\010is_agree\030\001" +
      " \001(\010\022\021\n\tguest_uid\030\r \001(\r\022\020\n\010draft_id\030\002 \001(" +
      "\rB\030\n\026emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DraftGuestReplyInviteNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DraftGuestReplyInviteNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DraftGuestReplyInviteNotify_descriptor,
        new java.lang.String[] { "IsAgree", "GuestUid", "DraftId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
