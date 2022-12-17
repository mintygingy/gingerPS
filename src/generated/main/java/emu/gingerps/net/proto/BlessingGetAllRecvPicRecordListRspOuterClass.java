// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BlessingGetAllRecvPicRecordListRsp.proto

package emu.gingerps.net.proto;

public final class BlessingGetAllRecvPicRecordListRspOuterClass {
  private BlessingGetAllRecvPicRecordListRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BlessingGetAllRecvPicRecordListRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BlessingGetAllRecvPicRecordListRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated .BlessingRecvPicRecord recv_pic_record_list = 6;</code>
     */
    java.util.List<emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecord> 
        getRecvPicRecordListList();
    /**
     * <code>repeated .BlessingRecvPicRecord recv_pic_record_list = 6;</code>
     */
    emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecord getRecvPicRecordList(int index);
    /**
     * <code>repeated .BlessingRecvPicRecord recv_pic_record_list = 6;</code>
     */
    int getRecvPicRecordListCount();
    /**
     * <code>repeated .BlessingRecvPicRecord recv_pic_record_list = 6;</code>
     */
    java.util.List<? extends emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecordOrBuilder> 
        getRecvPicRecordListOrBuilderList();
    /**
     * <code>repeated .BlessingRecvPicRecord recv_pic_record_list = 6;</code>
     */
    emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecordOrBuilder getRecvPicRecordListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 2058;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code BlessingGetAllRecvPicRecordListRsp}
   */
  public static final class BlessingGetAllRecvPicRecordListRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BlessingGetAllRecvPicRecordListRsp)
      BlessingGetAllRecvPicRecordListRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BlessingGetAllRecvPicRecordListRsp.newBuilder() to construct.
    private BlessingGetAllRecvPicRecordListRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BlessingGetAllRecvPicRecordListRsp() {
      recvPicRecordList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BlessingGetAllRecvPicRecordListRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.internal_static_BlessingGetAllRecvPicRecordListRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.internal_static_BlessingGetAllRecvPicRecordListRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp.class, emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 4;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int RECV_PIC_RECORD_LIST_FIELD_NUMBER = 6;
    @SuppressWarnings("serial")
    private java.util.List<emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecord> recvPicRecordList_;
    /**
     * <code>repeated .BlessingRecvPicRecord recv_pic_record_list = 6;</code>
     */
    @java.lang.Override
    public java.util.List<emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecord> getRecvPicRecordListList() {
      return recvPicRecordList_;
    }
    /**
     * <code>repeated .BlessingRecvPicRecord recv_pic_record_list = 6;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecordOrBuilder> 
        getRecvPicRecordListOrBuilderList() {
      return recvPicRecordList_;
    }
    /**
     * <code>repeated .BlessingRecvPicRecord recv_pic_record_list = 6;</code>
     */
    @java.lang.Override
    public int getRecvPicRecordListCount() {
      return recvPicRecordList_.size();
    }
    /**
     * <code>repeated .BlessingRecvPicRecord recv_pic_record_list = 6;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecord getRecvPicRecordList(int index) {
      return recvPicRecordList_.get(index);
    }
    /**
     * <code>repeated .BlessingRecvPicRecord recv_pic_record_list = 6;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecordOrBuilder getRecvPicRecordListOrBuilder(
        int index) {
      return recvPicRecordList_.get(index);
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
        output.writeInt32(4, retcode_);
      }
      for (int i = 0; i < recvPicRecordList_.size(); i++) {
        output.writeMessage(6, recvPicRecordList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, retcode_);
      }
      for (int i = 0; i < recvPicRecordList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, recvPicRecordList_.get(i));
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
      if (!(obj instanceof emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp other = (emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getRecvPicRecordListList()
          .equals(other.getRecvPicRecordListList())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (getRecvPicRecordListCount() > 0) {
        hash = (37 * hash) + RECV_PIC_RECORD_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getRecvPicRecordListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp prototype) {
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
     *   CMD_ID = 2058;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code BlessingGetAllRecvPicRecordListRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BlessingGetAllRecvPicRecordListRsp)
        emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.internal_static_BlessingGetAllRecvPicRecordListRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.internal_static_BlessingGetAllRecvPicRecordListRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp.class, emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp.newBuilder()
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
        retcode_ = 0;
        if (recvPicRecordListBuilder_ == null) {
          recvPicRecordList_ = java.util.Collections.emptyList();
        } else {
          recvPicRecordList_ = null;
          recvPicRecordListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.internal_static_BlessingGetAllRecvPicRecordListRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp build() {
        emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp buildPartial() {
        emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp result = new emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp result) {
        if (recvPicRecordListBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            recvPicRecordList_ = java.util.Collections.unmodifiableList(recvPicRecordList_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.recvPicRecordList_ = recvPicRecordList_;
        } else {
          result.recvPicRecordList_ = recvPicRecordListBuilder_.build();
        }
      }

      private void buildPartial0(emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.retcode_ = retcode_;
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
        if (other instanceof emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp) {
          return mergeFrom((emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp other) {
        if (other == emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (recvPicRecordListBuilder_ == null) {
          if (!other.recvPicRecordList_.isEmpty()) {
            if (recvPicRecordList_.isEmpty()) {
              recvPicRecordList_ = other.recvPicRecordList_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureRecvPicRecordListIsMutable();
              recvPicRecordList_.addAll(other.recvPicRecordList_);
            }
            onChanged();
          }
        } else {
          if (!other.recvPicRecordList_.isEmpty()) {
            if (recvPicRecordListBuilder_.isEmpty()) {
              recvPicRecordListBuilder_.dispose();
              recvPicRecordListBuilder_ = null;
              recvPicRecordList_ = other.recvPicRecordList_;
              bitField0_ = (bitField0_ & ~0x00000002);
              recvPicRecordListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getRecvPicRecordListFieldBuilder() : null;
            } else {
              recvPicRecordListBuilder_.addAllMessages(other.recvPicRecordList_);
            }
          }
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
              case 32: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 32
              case 50: {
                emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecord m =
                    input.readMessage(
                        emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecord.parser(),
                        extensionRegistry);
                if (recvPicRecordListBuilder_ == null) {
                  ensureRecvPicRecordListIsMutable();
                  recvPicRecordList_.add(m);
                } else {
                  recvPicRecordListBuilder_.addMessage(m);
                }
                break;
              } // case 50
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 4;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecord> recvPicRecordList_ =
        java.util.Collections.emptyList();
      private void ensureRecvPicRecordListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          recvPicRecordList_ = new java.util.ArrayList<emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecord>(recvPicRecordList_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecord, emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecord.Builder, emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecordOrBuilder> recvPicRecordListBuilder_;

      /**
       * <code>repeated .BlessingRecvPicRecord recv_pic_record_list = 6;</code>
       */
      public java.util.List<emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecord> getRecvPicRecordListList() {
        if (recvPicRecordListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(recvPicRecordList_);
        } else {
          return recvPicRecordListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .BlessingRecvPicRecord recv_pic_record_list = 6;</code>
       */
      public int getRecvPicRecordListCount() {
        if (recvPicRecordListBuilder_ == null) {
          return recvPicRecordList_.size();
        } else {
          return recvPicRecordListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .BlessingRecvPicRecord recv_pic_record_list = 6;</code>
       */
      public emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecord getRecvPicRecordList(int index) {
        if (recvPicRecordListBuilder_ == null) {
          return recvPicRecordList_.get(index);
        } else {
          return recvPicRecordListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .BlessingRecvPicRecord recv_pic_record_list = 6;</code>
       */
      public Builder setRecvPicRecordList(
          int index, emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecord value) {
        if (recvPicRecordListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecvPicRecordListIsMutable();
          recvPicRecordList_.set(index, value);
          onChanged();
        } else {
          recvPicRecordListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BlessingRecvPicRecord recv_pic_record_list = 6;</code>
       */
      public Builder setRecvPicRecordList(
          int index, emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecord.Builder builderForValue) {
        if (recvPicRecordListBuilder_ == null) {
          ensureRecvPicRecordListIsMutable();
          recvPicRecordList_.set(index, builderForValue.build());
          onChanged();
        } else {
          recvPicRecordListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BlessingRecvPicRecord recv_pic_record_list = 6;</code>
       */
      public Builder addRecvPicRecordList(emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecord value) {
        if (recvPicRecordListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecvPicRecordListIsMutable();
          recvPicRecordList_.add(value);
          onChanged();
        } else {
          recvPicRecordListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .BlessingRecvPicRecord recv_pic_record_list = 6;</code>
       */
      public Builder addRecvPicRecordList(
          int index, emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecord value) {
        if (recvPicRecordListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecvPicRecordListIsMutable();
          recvPicRecordList_.add(index, value);
          onChanged();
        } else {
          recvPicRecordListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BlessingRecvPicRecord recv_pic_record_list = 6;</code>
       */
      public Builder addRecvPicRecordList(
          emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecord.Builder builderForValue) {
        if (recvPicRecordListBuilder_ == null) {
          ensureRecvPicRecordListIsMutable();
          recvPicRecordList_.add(builderForValue.build());
          onChanged();
        } else {
          recvPicRecordListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BlessingRecvPicRecord recv_pic_record_list = 6;</code>
       */
      public Builder addRecvPicRecordList(
          int index, emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecord.Builder builderForValue) {
        if (recvPicRecordListBuilder_ == null) {
          ensureRecvPicRecordListIsMutable();
          recvPicRecordList_.add(index, builderForValue.build());
          onChanged();
        } else {
          recvPicRecordListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BlessingRecvPicRecord recv_pic_record_list = 6;</code>
       */
      public Builder addAllRecvPicRecordList(
          java.lang.Iterable<? extends emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecord> values) {
        if (recvPicRecordListBuilder_ == null) {
          ensureRecvPicRecordListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, recvPicRecordList_);
          onChanged();
        } else {
          recvPicRecordListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .BlessingRecvPicRecord recv_pic_record_list = 6;</code>
       */
      public Builder clearRecvPicRecordList() {
        if (recvPicRecordListBuilder_ == null) {
          recvPicRecordList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          recvPicRecordListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .BlessingRecvPicRecord recv_pic_record_list = 6;</code>
       */
      public Builder removeRecvPicRecordList(int index) {
        if (recvPicRecordListBuilder_ == null) {
          ensureRecvPicRecordListIsMutable();
          recvPicRecordList_.remove(index);
          onChanged();
        } else {
          recvPicRecordListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .BlessingRecvPicRecord recv_pic_record_list = 6;</code>
       */
      public emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecord.Builder getRecvPicRecordListBuilder(
          int index) {
        return getRecvPicRecordListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .BlessingRecvPicRecord recv_pic_record_list = 6;</code>
       */
      public emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecordOrBuilder getRecvPicRecordListOrBuilder(
          int index) {
        if (recvPicRecordListBuilder_ == null) {
          return recvPicRecordList_.get(index);  } else {
          return recvPicRecordListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .BlessingRecvPicRecord recv_pic_record_list = 6;</code>
       */
      public java.util.List<? extends emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecordOrBuilder> 
           getRecvPicRecordListOrBuilderList() {
        if (recvPicRecordListBuilder_ != null) {
          return recvPicRecordListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(recvPicRecordList_);
        }
      }
      /**
       * <code>repeated .BlessingRecvPicRecord recv_pic_record_list = 6;</code>
       */
      public emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecord.Builder addRecvPicRecordListBuilder() {
        return getRecvPicRecordListFieldBuilder().addBuilder(
            emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecord.getDefaultInstance());
      }
      /**
       * <code>repeated .BlessingRecvPicRecord recv_pic_record_list = 6;</code>
       */
      public emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecord.Builder addRecvPicRecordListBuilder(
          int index) {
        return getRecvPicRecordListFieldBuilder().addBuilder(
            index, emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecord.getDefaultInstance());
      }
      /**
       * <code>repeated .BlessingRecvPicRecord recv_pic_record_list = 6;</code>
       */
      public java.util.List<emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecord.Builder> 
           getRecvPicRecordListBuilderList() {
        return getRecvPicRecordListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecord, emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecord.Builder, emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecordOrBuilder> 
          getRecvPicRecordListFieldBuilder() {
        if (recvPicRecordListBuilder_ == null) {
          recvPicRecordListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecord, emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecord.Builder, emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.BlessingRecvPicRecordOrBuilder>(
                  recvPicRecordList_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          recvPicRecordList_ = null;
        }
        return recvPicRecordListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:BlessingGetAllRecvPicRecordListRsp)
    }

    // @@protoc_insertion_point(class_scope:BlessingGetAllRecvPicRecordListRsp)
    private static final emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp();
    }

    public static emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BlessingGetAllRecvPicRecordListRsp>
        PARSER = new com.google.protobuf.AbstractParser<BlessingGetAllRecvPicRecordListRsp>() {
      @java.lang.Override
      public BlessingGetAllRecvPicRecordListRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<BlessingGetAllRecvPicRecordListRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BlessingGetAllRecvPicRecordListRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.BlessingGetAllRecvPicRecordListRspOuterClass.BlessingGetAllRecvPicRecordListRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BlessingGetAllRecvPicRecordListRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BlessingGetAllRecvPicRecordListRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(BlessingGetAllRecvPicRecordListRsp.pro" +
      "to\032\033BlessingRecvPicRecord.proto\"k\n\"Bless" +
      "ingGetAllRecvPicRecordListRsp\022\017\n\007retcode" +
      "\030\004 \001(\005\0224\n\024recv_pic_record_list\030\006 \003(\0132\026.B" +
      "lessingRecvPicRecordB\030\n\026emu.gingerps.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.getDescriptor(),
        });
    internal_static_BlessingGetAllRecvPicRecordListRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BlessingGetAllRecvPicRecordListRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BlessingGetAllRecvPicRecordListRsp_descriptor,
        new java.lang.String[] { "Retcode", "RecvPicRecordList", });
    emu.gingerps.net.proto.BlessingRecvPicRecordOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
