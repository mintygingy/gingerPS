// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SalvagePreventSettleInfo.proto

package emu.gingerps.net.proto;

public final class SalvagePreventSettleInfoOuterClass {
  private SalvagePreventSettleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SalvagePreventSettleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SalvagePreventSettleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.SalvagePreventGallerySettleInfo settle_info = 4;</code>
     * @return Whether the settleInfo field is set.
     */
    boolean hasSettleInfo();
    /**
     * <code>.SalvagePreventGallerySettleInfo settle_info = 4;</code>
     * @return The settleInfo.
     */
    emu.gingerps.net.proto.SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo getSettleInfo();
    /**
     * <code>.SalvagePreventGallerySettleInfo settle_info = 4;</code>
     */
    emu.gingerps.net.proto.SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfoOrBuilder getSettleInfoOrBuilder();

    /**
     * <code>bool is_new_record = 12;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();
  }
  /**
   * Protobuf type {@code SalvagePreventSettleInfo}
   */
  public static final class SalvagePreventSettleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SalvagePreventSettleInfo)
      SalvagePreventSettleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SalvagePreventSettleInfo.newBuilder() to construct.
    private SalvagePreventSettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SalvagePreventSettleInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SalvagePreventSettleInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.internal_static_SalvagePreventSettleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.internal_static_SalvagePreventSettleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo.class, emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo.Builder.class);
    }

    public static final int SETTLE_INFO_FIELD_NUMBER = 4;
    private emu.gingerps.net.proto.SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo settleInfo_;
    /**
     * <code>.SalvagePreventGallerySettleInfo settle_info = 4;</code>
     * @return Whether the settleInfo field is set.
     */
    @java.lang.Override
    public boolean hasSettleInfo() {
      return settleInfo_ != null;
    }
    /**
     * <code>.SalvagePreventGallerySettleInfo settle_info = 4;</code>
     * @return The settleInfo.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo getSettleInfo() {
      return settleInfo_ == null ? emu.gingerps.net.proto.SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo.getDefaultInstance() : settleInfo_;
    }
    /**
     * <code>.SalvagePreventGallerySettleInfo settle_info = 4;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfoOrBuilder getSettleInfoOrBuilder() {
      return settleInfo_ == null ? emu.gingerps.net.proto.SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo.getDefaultInstance() : settleInfo_;
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 12;
    private boolean isNewRecord_ = false;
    /**
     * <code>bool is_new_record = 12;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
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
      if (settleInfo_ != null) {
        output.writeMessage(4, getSettleInfo());
      }
      if (isNewRecord_ != false) {
        output.writeBool(12, isNewRecord_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (settleInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getSettleInfo());
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isNewRecord_);
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
      if (!(obj instanceof emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo other = (emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo) obj;

      if (hasSettleInfo() != other.hasSettleInfo()) return false;
      if (hasSettleInfo()) {
        if (!getSettleInfo()
            .equals(other.getSettleInfo())) return false;
      }
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
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
      if (hasSettleInfo()) {
        hash = (37 * hash) + SETTLE_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getSettleInfo().hashCode();
      }
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo prototype) {
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
     * Protobuf type {@code SalvagePreventSettleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SalvagePreventSettleInfo)
        emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.internal_static_SalvagePreventSettleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.internal_static_SalvagePreventSettleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo.class, emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo.newBuilder()
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
        settleInfo_ = null;
        if (settleInfoBuilder_ != null) {
          settleInfoBuilder_.dispose();
          settleInfoBuilder_ = null;
        }
        isNewRecord_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.internal_static_SalvagePreventSettleInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo build() {
        emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo buildPartial() {
        emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo result = new emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.settleInfo_ = settleInfoBuilder_ == null
              ? settleInfo_
              : settleInfoBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isNewRecord_ = isNewRecord_;
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
        if (other instanceof emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo) {
          return mergeFrom((emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo other) {
        if (other == emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo.getDefaultInstance()) return this;
        if (other.hasSettleInfo()) {
          mergeSettleInfo(other.getSettleInfo());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
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
              case 34: {
                input.readMessage(
                    getSettleInfoFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 34
              case 96: {
                isNewRecord_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 96
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

      private emu.gingerps.net.proto.SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo settleInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo, emu.gingerps.net.proto.SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo.Builder, emu.gingerps.net.proto.SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfoOrBuilder> settleInfoBuilder_;
      /**
       * <code>.SalvagePreventGallerySettleInfo settle_info = 4;</code>
       * @return Whether the settleInfo field is set.
       */
      public boolean hasSettleInfo() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.SalvagePreventGallerySettleInfo settle_info = 4;</code>
       * @return The settleInfo.
       */
      public emu.gingerps.net.proto.SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo getSettleInfo() {
        if (settleInfoBuilder_ == null) {
          return settleInfo_ == null ? emu.gingerps.net.proto.SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo.getDefaultInstance() : settleInfo_;
        } else {
          return settleInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.SalvagePreventGallerySettleInfo settle_info = 4;</code>
       */
      public Builder setSettleInfo(emu.gingerps.net.proto.SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo value) {
        if (settleInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          settleInfo_ = value;
        } else {
          settleInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.SalvagePreventGallerySettleInfo settle_info = 4;</code>
       */
      public Builder setSettleInfo(
          emu.gingerps.net.proto.SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo.Builder builderForValue) {
        if (settleInfoBuilder_ == null) {
          settleInfo_ = builderForValue.build();
        } else {
          settleInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.SalvagePreventGallerySettleInfo settle_info = 4;</code>
       */
      public Builder mergeSettleInfo(emu.gingerps.net.proto.SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo value) {
        if (settleInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            settleInfo_ != null &&
            settleInfo_ != emu.gingerps.net.proto.SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo.getDefaultInstance()) {
            getSettleInfoBuilder().mergeFrom(value);
          } else {
            settleInfo_ = value;
          }
        } else {
          settleInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.SalvagePreventGallerySettleInfo settle_info = 4;</code>
       */
      public Builder clearSettleInfo() {
        bitField0_ = (bitField0_ & ~0x00000001);
        settleInfo_ = null;
        if (settleInfoBuilder_ != null) {
          settleInfoBuilder_.dispose();
          settleInfoBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.SalvagePreventGallerySettleInfo settle_info = 4;</code>
       */
      public emu.gingerps.net.proto.SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo.Builder getSettleInfoBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getSettleInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.SalvagePreventGallerySettleInfo settle_info = 4;</code>
       */
      public emu.gingerps.net.proto.SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfoOrBuilder getSettleInfoOrBuilder() {
        if (settleInfoBuilder_ != null) {
          return settleInfoBuilder_.getMessageOrBuilder();
        } else {
          return settleInfo_ == null ?
              emu.gingerps.net.proto.SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo.getDefaultInstance() : settleInfo_;
        }
      }
      /**
       * <code>.SalvagePreventGallerySettleInfo settle_info = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo, emu.gingerps.net.proto.SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo.Builder, emu.gingerps.net.proto.SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfoOrBuilder> 
          getSettleInfoFieldBuilder() {
        if (settleInfoBuilder_ == null) {
          settleInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo, emu.gingerps.net.proto.SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo.Builder, emu.gingerps.net.proto.SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfoOrBuilder>(
                  getSettleInfo(),
                  getParentForChildren(),
                  isClean());
          settleInfo_ = null;
        }
        return settleInfoBuilder_;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 12;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 12;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isNewRecord_ = false;
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


      // @@protoc_insertion_point(builder_scope:SalvagePreventSettleInfo)
    }

    // @@protoc_insertion_point(class_scope:SalvagePreventSettleInfo)
    private static final emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo();
    }

    public static emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SalvagePreventSettleInfo>
        PARSER = new com.google.protobuf.AbstractParser<SalvagePreventSettleInfo>() {
      @java.lang.Override
      public SalvagePreventSettleInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<SalvagePreventSettleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SalvagePreventSettleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.SalvagePreventSettleInfoOuterClass.SalvagePreventSettleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SalvagePreventSettleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SalvagePreventSettleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036SalvagePreventSettleInfo.proto\032%Salvag" +
      "ePreventGallerySettleInfo.proto\"h\n\030Salva" +
      "gePreventSettleInfo\0225\n\013settle_info\030\004 \001(\013" +
      "2 .SalvagePreventGallerySettleInfo\022\025\n\ris" +
      "_new_record\030\014 \001(\010B\030\n\026emu.gingerps.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.SalvagePreventGallerySettleInfoOuterClass.getDescriptor(),
        });
    internal_static_SalvagePreventSettleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SalvagePreventSettleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SalvagePreventSettleInfo_descriptor,
        new java.lang.String[] { "SettleInfo", "IsNewRecord", });
    emu.gingerps.net.proto.SalvagePreventGallerySettleInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
