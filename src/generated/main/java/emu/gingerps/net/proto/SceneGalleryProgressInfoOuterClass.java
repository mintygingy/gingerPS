// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryProgressInfo.proto

package emu.gingerps.net.proto;

public final class SceneGalleryProgressInfoOuterClass {
  private SceneGalleryProgressInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryProgressInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryProgressInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string key = 3;</code>
     * @return The key.
     */
    java.lang.String getKey();
    /**
     * <code>string key = 3;</code>
     * @return The bytes for key.
     */
    com.google.protobuf.ByteString
        getKeyBytes();

    /**
     * <code>uint32 ui_form = 12;</code>
     * @return The uiForm.
     */
    int getUiForm();

    /**
     * <code>repeated uint32 progress_stage_list = 7;</code>
     * @return A list containing the progressStageList.
     */
    java.util.List<java.lang.Integer> getProgressStageListList();
    /**
     * <code>repeated uint32 progress_stage_list = 7;</code>
     * @return The count of progressStageList.
     */
    int getProgressStageListCount();
    /**
     * <code>repeated uint32 progress_stage_list = 7;</code>
     * @param index The index of the element to return.
     * @return The progressStageList at the given index.
     */
    int getProgressStageList(int index);

    /**
     * <code>uint32 progress = 13;</code>
     * @return The progress.
     */
    int getProgress();
  }
  /**
   * Protobuf type {@code SceneGalleryProgressInfo}
   */
  public static final class SceneGalleryProgressInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryProgressInfo)
      SceneGalleryProgressInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryProgressInfo.newBuilder() to construct.
    private SceneGalleryProgressInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryProgressInfo() {
      key_ = "";
      progressStageList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryProgressInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneGalleryProgressInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              key_ = s;
              break;
            }
            case 56: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                progressStageList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              progressStageList_.addInt(input.readUInt32());
              break;
            }
            case 58: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                progressStageList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                progressStageList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 96: {

              uiForm_ = input.readUInt32();
              break;
            }
            case 104: {

              progress_ = input.readUInt32();
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          progressStageList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.internal_static_SceneGalleryProgressInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.internal_static_SceneGalleryProgressInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo.class, emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo.Builder.class);
    }

    public static final int KEY_FIELD_NUMBER = 3;
    private volatile java.lang.Object key_;
    /**
     * <code>string key = 3;</code>
     * @return The key.
     */
    @java.lang.Override
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      }
    }
    /**
     * <code>string key = 3;</code>
     * @return The bytes for key.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int UI_FORM_FIELD_NUMBER = 12;
    private int uiForm_;
    /**
     * <code>uint32 ui_form = 12;</code>
     * @return The uiForm.
     */
    @java.lang.Override
    public int getUiForm() {
      return uiForm_;
    }

    public static final int PROGRESS_STAGE_LIST_FIELD_NUMBER = 7;
    private com.google.protobuf.Internal.IntList progressStageList_;
    /**
     * <code>repeated uint32 progress_stage_list = 7;</code>
     * @return A list containing the progressStageList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getProgressStageListList() {
      return progressStageList_;
    }
    /**
     * <code>repeated uint32 progress_stage_list = 7;</code>
     * @return The count of progressStageList.
     */
    public int getProgressStageListCount() {
      return progressStageList_.size();
    }
    /**
     * <code>repeated uint32 progress_stage_list = 7;</code>
     * @param index The index of the element to return.
     * @return The progressStageList at the given index.
     */
    public int getProgressStageList(int index) {
      return progressStageList_.getInt(index);
    }
    private int progressStageListMemoizedSerializedSize = -1;

    public static final int PROGRESS_FIELD_NUMBER = 13;
    private int progress_;
    /**
     * <code>uint32 progress = 13;</code>
     * @return The progress.
     */
    @java.lang.Override
    public int getProgress() {
      return progress_;
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
      getSerializedSize();
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, key_);
      }
      if (getProgressStageListList().size() > 0) {
        output.writeUInt32NoTag(58);
        output.writeUInt32NoTag(progressStageListMemoizedSerializedSize);
      }
      for (int i = 0; i < progressStageList_.size(); i++) {
        output.writeUInt32NoTag(progressStageList_.getInt(i));
      }
      if (uiForm_ != 0) {
        output.writeUInt32(12, uiForm_);
      }
      if (progress_ != 0) {
        output.writeUInt32(13, progress_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, key_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < progressStageList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(progressStageList_.getInt(i));
        }
        size += dataSize;
        if (!getProgressStageListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        progressStageListMemoizedSerializedSize = dataSize;
      }
      if (uiForm_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, uiForm_);
      }
      if (progress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, progress_);
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
      if (!(obj instanceof emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo other = (emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo) obj;

      if (!getKey()
          .equals(other.getKey())) return false;
      if (getUiForm()
          != other.getUiForm()) return false;
      if (!getProgressStageListList()
          .equals(other.getProgressStageListList())) return false;
      if (getProgress()
          != other.getProgress()) return false;
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
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey().hashCode();
      hash = (37 * hash) + UI_FORM_FIELD_NUMBER;
      hash = (53 * hash) + getUiForm();
      if (getProgressStageListCount() > 0) {
        hash = (37 * hash) + PROGRESS_STAGE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getProgressStageListList().hashCode();
      }
      hash = (37 * hash) + PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getProgress();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo prototype) {
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
     * Protobuf type {@code SceneGalleryProgressInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryProgressInfo)
        emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.internal_static_SceneGalleryProgressInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.internal_static_SceneGalleryProgressInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo.class, emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo.newBuilder()
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
        key_ = "";

        uiForm_ = 0;

        progressStageList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        progress_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.internal_static_SceneGalleryProgressInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo build() {
        emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo buildPartial() {
        emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo result = new emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo(this);
        int from_bitField0_ = bitField0_;
        result.key_ = key_;
        result.uiForm_ = uiForm_;
        if (((bitField0_ & 0x00000001) != 0)) {
          progressStageList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.progressStageList_ = progressStageList_;
        result.progress_ = progress_;
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
        if (other instanceof emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo) {
          return mergeFrom((emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo other) {
        if (other == emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo.getDefaultInstance()) return this;
        if (!other.getKey().isEmpty()) {
          key_ = other.key_;
          onChanged();
        }
        if (other.getUiForm() != 0) {
          setUiForm(other.getUiForm());
        }
        if (!other.progressStageList_.isEmpty()) {
          if (progressStageList_.isEmpty()) {
            progressStageList_ = other.progressStageList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProgressStageListIsMutable();
            progressStageList_.addAll(other.progressStageList_);
          }
          onChanged();
        }
        if (other.getProgress() != 0) {
          setProgress(other.getProgress());
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
        emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object key_ = "";
      /**
       * <code>string key = 3;</code>
       * @return The key.
       */
      public java.lang.String getKey() {
        java.lang.Object ref = key_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          key_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string key = 3;</code>
       * @return The bytes for key.
       */
      public com.google.protobuf.ByteString
          getKeyBytes() {
        java.lang.Object ref = key_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          key_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string key = 3;</code>
       * @param value The key to set.
       * @return This builder for chaining.
       */
      public Builder setKey(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        key_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string key = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearKey() {
        
        key_ = getDefaultInstance().getKey();
        onChanged();
        return this;
      }
      /**
       * <code>string key = 3;</code>
       * @param value The bytes for key to set.
       * @return This builder for chaining.
       */
      public Builder setKeyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        key_ = value;
        onChanged();
        return this;
      }

      private int uiForm_ ;
      /**
       * <code>uint32 ui_form = 12;</code>
       * @return The uiForm.
       */
      @java.lang.Override
      public int getUiForm() {
        return uiForm_;
      }
      /**
       * <code>uint32 ui_form = 12;</code>
       * @param value The uiForm to set.
       * @return This builder for chaining.
       */
      public Builder setUiForm(int value) {
        
        uiForm_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ui_form = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearUiForm() {
        
        uiForm_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList progressStageList_ = emptyIntList();
      private void ensureProgressStageListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          progressStageList_ = mutableCopy(progressStageList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 progress_stage_list = 7;</code>
       * @return A list containing the progressStageList.
       */
      public java.util.List<java.lang.Integer>
          getProgressStageListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(progressStageList_) : progressStageList_;
      }
      /**
       * <code>repeated uint32 progress_stage_list = 7;</code>
       * @return The count of progressStageList.
       */
      public int getProgressStageListCount() {
        return progressStageList_.size();
      }
      /**
       * <code>repeated uint32 progress_stage_list = 7;</code>
       * @param index The index of the element to return.
       * @return The progressStageList at the given index.
       */
      public int getProgressStageList(int index) {
        return progressStageList_.getInt(index);
      }
      /**
       * <code>repeated uint32 progress_stage_list = 7;</code>
       * @param index The index to set the value at.
       * @param value The progressStageList to set.
       * @return This builder for chaining.
       */
      public Builder setProgressStageList(
          int index, int value) {
        ensureProgressStageListIsMutable();
        progressStageList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 progress_stage_list = 7;</code>
       * @param value The progressStageList to add.
       * @return This builder for chaining.
       */
      public Builder addProgressStageList(int value) {
        ensureProgressStageListIsMutable();
        progressStageList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 progress_stage_list = 7;</code>
       * @param values The progressStageList to add.
       * @return This builder for chaining.
       */
      public Builder addAllProgressStageList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureProgressStageListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, progressStageList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 progress_stage_list = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearProgressStageList() {
        progressStageList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int progress_ ;
      /**
       * <code>uint32 progress = 13;</code>
       * @return The progress.
       */
      @java.lang.Override
      public int getProgress() {
        return progress_;
      }
      /**
       * <code>uint32 progress = 13;</code>
       * @param value The progress to set.
       * @return This builder for chaining.
       */
      public Builder setProgress(int value) {
        
        progress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 progress = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearProgress() {
        
        progress_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryProgressInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryProgressInfo)
    private static final emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo();
    }

    public static emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryProgressInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryProgressInfo>() {
      @java.lang.Override
      public SceneGalleryProgressInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneGalleryProgressInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneGalleryProgressInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryProgressInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.SceneGalleryProgressInfoOuterClass.SceneGalleryProgressInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryProgressInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryProgressInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036SceneGalleryProgressInfo.proto\"g\n\030Scen" +
      "eGalleryProgressInfo\022\013\n\003key\030\003 \001(\t\022\017\n\007ui_" +
      "form\030\014 \001(\r\022\033\n\023progress_stage_list\030\007 \003(\r\022" +
      "\020\n\010progress\030\r \001(\rB\033\n\031emu.gingerps.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGalleryProgressInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryProgressInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryProgressInfo_descriptor,
        new java.lang.String[] { "Key", "UiForm", "ProgressStageList", "Progress", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
