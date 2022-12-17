// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetBargainDataRsp.proto

package emu.gingerps.net.proto;

public final class GetBargainDataRspOuterClass {
  private GetBargainDataRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetBargainDataRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetBargainDataRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 bargain_id = 4;</code>
     * @return The bargainId.
     */
    int getBargainId();

    /**
     * <code>.BargainSnapshot snapshot = 15;</code>
     * @return Whether the snapshot field is set.
     */
    boolean hasSnapshot();
    /**
     * <code>.BargainSnapshot snapshot = 15;</code>
     * @return The snapshot.
     */
    emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot getSnapshot();
    /**
     * <code>.BargainSnapshot snapshot = 15;</code>
     */
    emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshotOrBuilder getSnapshotOrBuilder();

    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 472;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GetBargainDataRsp}
   */
  public static final class GetBargainDataRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetBargainDataRsp)
      GetBargainDataRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetBargainDataRsp.newBuilder() to construct.
    private GetBargainDataRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetBargainDataRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetBargainDataRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetBargainDataRsp(
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

              retcode_ = input.readInt32();
              break;
            }
            case 32: {

              bargainId_ = input.readUInt32();
              break;
            }
            case 122: {
              emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot.Builder subBuilder = null;
              if (snapshot_ != null) {
                subBuilder = snapshot_.toBuilder();
              }
              snapshot_ = input.readMessage(emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(snapshot_);
                snapshot_ = subBuilder.buildPartial();
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
      return emu.gingerps.net.proto.GetBargainDataRspOuterClass.internal_static_GetBargainDataRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.GetBargainDataRspOuterClass.internal_static_GetBargainDataRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp.class, emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp.Builder.class);
    }

    public static final int BARGAIN_ID_FIELD_NUMBER = 4;
    private int bargainId_;
    /**
     * <code>uint32 bargain_id = 4;</code>
     * @return The bargainId.
     */
    @java.lang.Override
    public int getBargainId() {
      return bargainId_;
    }

    public static final int SNAPSHOT_FIELD_NUMBER = 15;
    private emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot snapshot_;
    /**
     * <code>.BargainSnapshot snapshot = 15;</code>
     * @return Whether the snapshot field is set.
     */
    @java.lang.Override
    public boolean hasSnapshot() {
      return snapshot_ != null;
    }
    /**
     * <code>.BargainSnapshot snapshot = 15;</code>
     * @return The snapshot.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot getSnapshot() {
      return snapshot_ == null ? emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot.getDefaultInstance() : snapshot_;
    }
    /**
     * <code>.BargainSnapshot snapshot = 15;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshotOrBuilder getSnapshotOrBuilder() {
      return getSnapshot();
    }

    public static final int RETCODE_FIELD_NUMBER = 2;
    private int retcode_;
    /**
     * <code>int32 retcode = 2;</code>
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
        output.writeInt32(2, retcode_);
      }
      if (bargainId_ != 0) {
        output.writeUInt32(4, bargainId_);
      }
      if (snapshot_ != null) {
        output.writeMessage(15, getSnapshot());
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
          .computeInt32Size(2, retcode_);
      }
      if (bargainId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, bargainId_);
      }
      if (snapshot_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getSnapshot());
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
      if (!(obj instanceof emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp other = (emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp) obj;

      if (getBargainId()
          != other.getBargainId()) return false;
      if (hasSnapshot() != other.hasSnapshot()) return false;
      if (hasSnapshot()) {
        if (!getSnapshot()
            .equals(other.getSnapshot())) return false;
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
      hash = (37 * hash) + BARGAIN_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBargainId();
      if (hasSnapshot()) {
        hash = (37 * hash) + SNAPSHOT_FIELD_NUMBER;
        hash = (53 * hash) + getSnapshot().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp prototype) {
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
     *   CMD_ID = 472;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GetBargainDataRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetBargainDataRsp)
        emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.GetBargainDataRspOuterClass.internal_static_GetBargainDataRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.GetBargainDataRspOuterClass.internal_static_GetBargainDataRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp.class, emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp.newBuilder()
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
        bargainId_ = 0;

        if (snapshotBuilder_ == null) {
          snapshot_ = null;
        } else {
          snapshot_ = null;
          snapshotBuilder_ = null;
        }
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.GetBargainDataRspOuterClass.internal_static_GetBargainDataRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp build() {
        emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp buildPartial() {
        emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp result = new emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp(this);
        result.bargainId_ = bargainId_;
        if (snapshotBuilder_ == null) {
          result.snapshot_ = snapshot_;
        } else {
          result.snapshot_ = snapshotBuilder_.build();
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
        if (other instanceof emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp) {
          return mergeFrom((emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp other) {
        if (other == emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp.getDefaultInstance()) return this;
        if (other.getBargainId() != 0) {
          setBargainId(other.getBargainId());
        }
        if (other.hasSnapshot()) {
          mergeSnapshot(other.getSnapshot());
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
        emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bargainId_ ;
      /**
       * <code>uint32 bargain_id = 4;</code>
       * @return The bargainId.
       */
      @java.lang.Override
      public int getBargainId() {
        return bargainId_;
      }
      /**
       * <code>uint32 bargain_id = 4;</code>
       * @param value The bargainId to set.
       * @return This builder for chaining.
       */
      public Builder setBargainId(int value) {
        
        bargainId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 bargain_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearBargainId() {
        
        bargainId_ = 0;
        onChanged();
        return this;
      }

      private emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot snapshot_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot, emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot.Builder, emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshotOrBuilder> snapshotBuilder_;
      /**
       * <code>.BargainSnapshot snapshot = 15;</code>
       * @return Whether the snapshot field is set.
       */
      public boolean hasSnapshot() {
        return snapshotBuilder_ != null || snapshot_ != null;
      }
      /**
       * <code>.BargainSnapshot snapshot = 15;</code>
       * @return The snapshot.
       */
      public emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot getSnapshot() {
        if (snapshotBuilder_ == null) {
          return snapshot_ == null ? emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot.getDefaultInstance() : snapshot_;
        } else {
          return snapshotBuilder_.getMessage();
        }
      }
      /**
       * <code>.BargainSnapshot snapshot = 15;</code>
       */
      public Builder setSnapshot(emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot value) {
        if (snapshotBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          snapshot_ = value;
          onChanged();
        } else {
          snapshotBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.BargainSnapshot snapshot = 15;</code>
       */
      public Builder setSnapshot(
          emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot.Builder builderForValue) {
        if (snapshotBuilder_ == null) {
          snapshot_ = builderForValue.build();
          onChanged();
        } else {
          snapshotBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.BargainSnapshot snapshot = 15;</code>
       */
      public Builder mergeSnapshot(emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot value) {
        if (snapshotBuilder_ == null) {
          if (snapshot_ != null) {
            snapshot_ =
              emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot.newBuilder(snapshot_).mergeFrom(value).buildPartial();
          } else {
            snapshot_ = value;
          }
          onChanged();
        } else {
          snapshotBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.BargainSnapshot snapshot = 15;</code>
       */
      public Builder clearSnapshot() {
        if (snapshotBuilder_ == null) {
          snapshot_ = null;
          onChanged();
        } else {
          snapshot_ = null;
          snapshotBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.BargainSnapshot snapshot = 15;</code>
       */
      public emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot.Builder getSnapshotBuilder() {
        
        onChanged();
        return getSnapshotFieldBuilder().getBuilder();
      }
      /**
       * <code>.BargainSnapshot snapshot = 15;</code>
       */
      public emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshotOrBuilder getSnapshotOrBuilder() {
        if (snapshotBuilder_ != null) {
          return snapshotBuilder_.getMessageOrBuilder();
        } else {
          return snapshot_ == null ?
              emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot.getDefaultInstance() : snapshot_;
        }
      }
      /**
       * <code>.BargainSnapshot snapshot = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot, emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot.Builder, emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshotOrBuilder> 
          getSnapshotFieldBuilder() {
        if (snapshotBuilder_ == null) {
          snapshotBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot, emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot.Builder, emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshotOrBuilder>(
                  getSnapshot(),
                  getParentForChildren(),
                  isClean());
          snapshot_ = null;
        }
        return snapshotBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 2;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 2;</code>
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


      // @@protoc_insertion_point(builder_scope:GetBargainDataRsp)
    }

    // @@protoc_insertion_point(class_scope:GetBargainDataRsp)
    private static final emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp();
    }

    public static emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetBargainDataRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetBargainDataRsp>() {
      @java.lang.Override
      public GetBargainDataRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetBargainDataRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetBargainDataRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetBargainDataRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.GetBargainDataRspOuterClass.GetBargainDataRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetBargainDataRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetBargainDataRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027GetBargainDataRsp.proto\032\025BargainSnapsh" +
      "ot.proto\"\\\n\021GetBargainDataRsp\022\022\n\nbargain" +
      "_id\030\004 \001(\r\022\"\n\010snapshot\030\017 \001(\0132\020.BargainSna" +
      "pshot\022\017\n\007retcode\030\002 \001(\005B\030\n\026emu.gingerps.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.BargainSnapshotOuterClass.getDescriptor(),
        });
    internal_static_GetBargainDataRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetBargainDataRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetBargainDataRsp_descriptor,
        new java.lang.String[] { "BargainId", "Snapshot", "Retcode", });
    emu.gingerps.net.proto.BargainSnapshotOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
