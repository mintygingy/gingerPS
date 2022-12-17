// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PhotoActivityDetailInfo.proto

package emu.gingerps.net.proto;

public final class PhotoActivityDetailInfoOuterClass {
  private PhotoActivityDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PhotoActivityDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PhotoActivityDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_content_closed = 5;</code>
     * @return The isContentClosed.
     */
    boolean getIsContentClosed();

    /**
     * <code>repeated .PhotoPosData photo_pos_data_list = 14;</code>
     */
    java.util.List<emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosData> 
        getPhotoPosDataListList();
    /**
     * <code>repeated .PhotoPosData photo_pos_data_list = 14;</code>
     */
    emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosData getPhotoPosDataList(int index);
    /**
     * <code>repeated .PhotoPosData photo_pos_data_list = 14;</code>
     */
    int getPhotoPosDataListCount();
    /**
     * <code>repeated .PhotoPosData photo_pos_data_list = 14;</code>
     */
    java.util.List<? extends emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosDataOrBuilder> 
        getPhotoPosDataListOrBuilderList();
    /**
     * <code>repeated .PhotoPosData photo_pos_data_list = 14;</code>
     */
    emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosDataOrBuilder getPhotoPosDataListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code PhotoActivityDetailInfo}
   */
  public static final class PhotoActivityDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PhotoActivityDetailInfo)
      PhotoActivityDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PhotoActivityDetailInfo.newBuilder() to construct.
    private PhotoActivityDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PhotoActivityDetailInfo() {
      photoPosDataList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PhotoActivityDetailInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PhotoActivityDetailInfo(
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
            case 40: {

              isContentClosed_ = input.readBool();
              break;
            }
            case 114: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                photoPosDataList_ = new java.util.ArrayList<emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosData>();
                mutable_bitField0_ |= 0x00000001;
              }
              photoPosDataList_.add(
                  input.readMessage(emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosData.parser(), extensionRegistry));
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
          photoPosDataList_ = java.util.Collections.unmodifiableList(photoPosDataList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.internal_static_PhotoActivityDetailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.internal_static_PhotoActivityDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo.class, emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo.Builder.class);
    }

    public static final int IS_CONTENT_CLOSED_FIELD_NUMBER = 5;
    private boolean isContentClosed_;
    /**
     * <code>bool is_content_closed = 5;</code>
     * @return The isContentClosed.
     */
    @java.lang.Override
    public boolean getIsContentClosed() {
      return isContentClosed_;
    }

    public static final int PHOTO_POS_DATA_LIST_FIELD_NUMBER = 14;
    private java.util.List<emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosData> photoPosDataList_;
    /**
     * <code>repeated .PhotoPosData photo_pos_data_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosData> getPhotoPosDataListList() {
      return photoPosDataList_;
    }
    /**
     * <code>repeated .PhotoPosData photo_pos_data_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosDataOrBuilder> 
        getPhotoPosDataListOrBuilderList() {
      return photoPosDataList_;
    }
    /**
     * <code>repeated .PhotoPosData photo_pos_data_list = 14;</code>
     */
    @java.lang.Override
    public int getPhotoPosDataListCount() {
      return photoPosDataList_.size();
    }
    /**
     * <code>repeated .PhotoPosData photo_pos_data_list = 14;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosData getPhotoPosDataList(int index) {
      return photoPosDataList_.get(index);
    }
    /**
     * <code>repeated .PhotoPosData photo_pos_data_list = 14;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosDataOrBuilder getPhotoPosDataListOrBuilder(
        int index) {
      return photoPosDataList_.get(index);
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
      if (isContentClosed_ != false) {
        output.writeBool(5, isContentClosed_);
      }
      for (int i = 0; i < photoPosDataList_.size(); i++) {
        output.writeMessage(14, photoPosDataList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isContentClosed_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isContentClosed_);
      }
      for (int i = 0; i < photoPosDataList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, photoPosDataList_.get(i));
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
      if (!(obj instanceof emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo other = (emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo) obj;

      if (getIsContentClosed()
          != other.getIsContentClosed()) return false;
      if (!getPhotoPosDataListList()
          .equals(other.getPhotoPosDataListList())) return false;
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
      hash = (37 * hash) + IS_CONTENT_CLOSED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsContentClosed());
      if (getPhotoPosDataListCount() > 0) {
        hash = (37 * hash) + PHOTO_POS_DATA_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getPhotoPosDataListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo prototype) {
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
     * Protobuf type {@code PhotoActivityDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PhotoActivityDetailInfo)
        emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.internal_static_PhotoActivityDetailInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.internal_static_PhotoActivityDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo.class, emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo.newBuilder()
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
          getPhotoPosDataListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isContentClosed_ = false;

        if (photoPosDataListBuilder_ == null) {
          photoPosDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          photoPosDataListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.internal_static_PhotoActivityDetailInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo build() {
        emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo buildPartial() {
        emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo result = new emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo(this);
        int from_bitField0_ = bitField0_;
        result.isContentClosed_ = isContentClosed_;
        if (photoPosDataListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            photoPosDataList_ = java.util.Collections.unmodifiableList(photoPosDataList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.photoPosDataList_ = photoPosDataList_;
        } else {
          result.photoPosDataList_ = photoPosDataListBuilder_.build();
        }
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
        if (other instanceof emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo) {
          return mergeFrom((emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo other) {
        if (other == emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo.getDefaultInstance()) return this;
        if (other.getIsContentClosed() != false) {
          setIsContentClosed(other.getIsContentClosed());
        }
        if (photoPosDataListBuilder_ == null) {
          if (!other.photoPosDataList_.isEmpty()) {
            if (photoPosDataList_.isEmpty()) {
              photoPosDataList_ = other.photoPosDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePhotoPosDataListIsMutable();
              photoPosDataList_.addAll(other.photoPosDataList_);
            }
            onChanged();
          }
        } else {
          if (!other.photoPosDataList_.isEmpty()) {
            if (photoPosDataListBuilder_.isEmpty()) {
              photoPosDataListBuilder_.dispose();
              photoPosDataListBuilder_ = null;
              photoPosDataList_ = other.photoPosDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              photoPosDataListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPhotoPosDataListFieldBuilder() : null;
            } else {
              photoPosDataListBuilder_.addAllMessages(other.photoPosDataList_);
            }
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
        emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean isContentClosed_ ;
      /**
       * <code>bool is_content_closed = 5;</code>
       * @return The isContentClosed.
       */
      @java.lang.Override
      public boolean getIsContentClosed() {
        return isContentClosed_;
      }
      /**
       * <code>bool is_content_closed = 5;</code>
       * @param value The isContentClosed to set.
       * @return This builder for chaining.
       */
      public Builder setIsContentClosed(boolean value) {
        
        isContentClosed_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_content_closed = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsContentClosed() {
        
        isContentClosed_ = false;
        onChanged();
        return this;
      }

      private java.util.List<emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosData> photoPosDataList_ =
        java.util.Collections.emptyList();
      private void ensurePhotoPosDataListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          photoPosDataList_ = new java.util.ArrayList<emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosData>(photoPosDataList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosData, emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosData.Builder, emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosDataOrBuilder> photoPosDataListBuilder_;

      /**
       * <code>repeated .PhotoPosData photo_pos_data_list = 14;</code>
       */
      public java.util.List<emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosData> getPhotoPosDataListList() {
        if (photoPosDataListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(photoPosDataList_);
        } else {
          return photoPosDataListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .PhotoPosData photo_pos_data_list = 14;</code>
       */
      public int getPhotoPosDataListCount() {
        if (photoPosDataListBuilder_ == null) {
          return photoPosDataList_.size();
        } else {
          return photoPosDataListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .PhotoPosData photo_pos_data_list = 14;</code>
       */
      public emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosData getPhotoPosDataList(int index) {
        if (photoPosDataListBuilder_ == null) {
          return photoPosDataList_.get(index);
        } else {
          return photoPosDataListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .PhotoPosData photo_pos_data_list = 14;</code>
       */
      public Builder setPhotoPosDataList(
          int index, emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosData value) {
        if (photoPosDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePhotoPosDataListIsMutable();
          photoPosDataList_.set(index, value);
          onChanged();
        } else {
          photoPosDataListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PhotoPosData photo_pos_data_list = 14;</code>
       */
      public Builder setPhotoPosDataList(
          int index, emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosData.Builder builderForValue) {
        if (photoPosDataListBuilder_ == null) {
          ensurePhotoPosDataListIsMutable();
          photoPosDataList_.set(index, builderForValue.build());
          onChanged();
        } else {
          photoPosDataListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PhotoPosData photo_pos_data_list = 14;</code>
       */
      public Builder addPhotoPosDataList(emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosData value) {
        if (photoPosDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePhotoPosDataListIsMutable();
          photoPosDataList_.add(value);
          onChanged();
        } else {
          photoPosDataListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .PhotoPosData photo_pos_data_list = 14;</code>
       */
      public Builder addPhotoPosDataList(
          int index, emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosData value) {
        if (photoPosDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePhotoPosDataListIsMutable();
          photoPosDataList_.add(index, value);
          onChanged();
        } else {
          photoPosDataListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PhotoPosData photo_pos_data_list = 14;</code>
       */
      public Builder addPhotoPosDataList(
          emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosData.Builder builderForValue) {
        if (photoPosDataListBuilder_ == null) {
          ensurePhotoPosDataListIsMutable();
          photoPosDataList_.add(builderForValue.build());
          onChanged();
        } else {
          photoPosDataListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PhotoPosData photo_pos_data_list = 14;</code>
       */
      public Builder addPhotoPosDataList(
          int index, emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosData.Builder builderForValue) {
        if (photoPosDataListBuilder_ == null) {
          ensurePhotoPosDataListIsMutable();
          photoPosDataList_.add(index, builderForValue.build());
          onChanged();
        } else {
          photoPosDataListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PhotoPosData photo_pos_data_list = 14;</code>
       */
      public Builder addAllPhotoPosDataList(
          java.lang.Iterable<? extends emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosData> values) {
        if (photoPosDataListBuilder_ == null) {
          ensurePhotoPosDataListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, photoPosDataList_);
          onChanged();
        } else {
          photoPosDataListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .PhotoPosData photo_pos_data_list = 14;</code>
       */
      public Builder clearPhotoPosDataList() {
        if (photoPosDataListBuilder_ == null) {
          photoPosDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          photoPosDataListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .PhotoPosData photo_pos_data_list = 14;</code>
       */
      public Builder removePhotoPosDataList(int index) {
        if (photoPosDataListBuilder_ == null) {
          ensurePhotoPosDataListIsMutable();
          photoPosDataList_.remove(index);
          onChanged();
        } else {
          photoPosDataListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .PhotoPosData photo_pos_data_list = 14;</code>
       */
      public emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosData.Builder getPhotoPosDataListBuilder(
          int index) {
        return getPhotoPosDataListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .PhotoPosData photo_pos_data_list = 14;</code>
       */
      public emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosDataOrBuilder getPhotoPosDataListOrBuilder(
          int index) {
        if (photoPosDataListBuilder_ == null) {
          return photoPosDataList_.get(index);  } else {
          return photoPosDataListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .PhotoPosData photo_pos_data_list = 14;</code>
       */
      public java.util.List<? extends emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosDataOrBuilder> 
           getPhotoPosDataListOrBuilderList() {
        if (photoPosDataListBuilder_ != null) {
          return photoPosDataListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(photoPosDataList_);
        }
      }
      /**
       * <code>repeated .PhotoPosData photo_pos_data_list = 14;</code>
       */
      public emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosData.Builder addPhotoPosDataListBuilder() {
        return getPhotoPosDataListFieldBuilder().addBuilder(
            emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosData.getDefaultInstance());
      }
      /**
       * <code>repeated .PhotoPosData photo_pos_data_list = 14;</code>
       */
      public emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosData.Builder addPhotoPosDataListBuilder(
          int index) {
        return getPhotoPosDataListFieldBuilder().addBuilder(
            index, emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosData.getDefaultInstance());
      }
      /**
       * <code>repeated .PhotoPosData photo_pos_data_list = 14;</code>
       */
      public java.util.List<emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosData.Builder> 
           getPhotoPosDataListBuilderList() {
        return getPhotoPosDataListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosData, emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosData.Builder, emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosDataOrBuilder> 
          getPhotoPosDataListFieldBuilder() {
        if (photoPosDataListBuilder_ == null) {
          photoPosDataListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosData, emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosData.Builder, emu.gingerps.net.proto.PhotoPosDataOuterClass.PhotoPosDataOrBuilder>(
                  photoPosDataList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          photoPosDataList_ = null;
        }
        return photoPosDataListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:PhotoActivityDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:PhotoActivityDetailInfo)
    private static final emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo();
    }

    public static emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PhotoActivityDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<PhotoActivityDetailInfo>() {
      @java.lang.Override
      public PhotoActivityDetailInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PhotoActivityDetailInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PhotoActivityDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PhotoActivityDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.PhotoActivityDetailInfoOuterClass.PhotoActivityDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PhotoActivityDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PhotoActivityDetailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035PhotoActivityDetailInfo.proto\032\022PhotoPo" +
      "sData.proto\"`\n\027PhotoActivityDetailInfo\022\031" +
      "\n\021is_content_closed\030\005 \001(\010\022*\n\023photo_pos_d" +
      "ata_list\030\016 \003(\0132\r.PhotoPosDataB\030\n\026emu.gin" +
      "gerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.PhotoPosDataOuterClass.getDescriptor(),
        });
    internal_static_PhotoActivityDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PhotoActivityDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PhotoActivityDetailInfo_descriptor,
        new java.lang.String[] { "IsContentClosed", "PhotoPosDataList", });
    emu.gingerps.net.proto.PhotoPosDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
