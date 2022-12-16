// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UgcMusicRecord.proto

package emu.gingerps.net.proto;

public final class UgcMusicRecordOuterClass {
  private UgcMusicRecordOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UgcMusicRecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UgcMusicRecord)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 music_id = 1;</code>
     * @return The musicId.
     */
    int getMusicId();

    /**
     * <code>repeated .UgcMusicTrack music_track_list = 4;</code>
     */
    java.util.List<emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack> 
        getMusicTrackListList();
    /**
     * <code>repeated .UgcMusicTrack music_track_list = 4;</code>
     */
    emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack getMusicTrackList(int index);
    /**
     * <code>repeated .UgcMusicTrack music_track_list = 4;</code>
     */
    int getMusicTrackListCount();
    /**
     * <code>repeated .UgcMusicTrack music_track_list = 4;</code>
     */
    java.util.List<? extends emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrackOrBuilder> 
        getMusicTrackListOrBuilderList();
    /**
     * <code>repeated .UgcMusicTrack music_track_list = 4;</code>
     */
    emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrackOrBuilder getMusicTrackListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code UgcMusicRecord}
   */
  public static final class UgcMusicRecord extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UgcMusicRecord)
      UgcMusicRecordOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UgcMusicRecord.newBuilder() to construct.
    private UgcMusicRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UgcMusicRecord() {
      musicTrackList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UgcMusicRecord();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UgcMusicRecord(
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
            case 8: {

              musicId_ = input.readUInt32();
              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                musicTrackList_ = new java.util.ArrayList<emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack>();
                mutable_bitField0_ |= 0x00000001;
              }
              musicTrackList_.add(
                  input.readMessage(emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.parser(), extensionRegistry));
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
          musicTrackList_ = java.util.Collections.unmodifiableList(musicTrackList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.UgcMusicRecordOuterClass.internal_static_UgcMusicRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.UgcMusicRecordOuterClass.internal_static_UgcMusicRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord.class, emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord.Builder.class);
    }

    public static final int MUSIC_ID_FIELD_NUMBER = 1;
    private int musicId_;
    /**
     * <code>uint32 music_id = 1;</code>
     * @return The musicId.
     */
    @java.lang.Override
    public int getMusicId() {
      return musicId_;
    }

    public static final int MUSIC_TRACK_LIST_FIELD_NUMBER = 4;
    private java.util.List<emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack> musicTrackList_;
    /**
     * <code>repeated .UgcMusicTrack music_track_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack> getMusicTrackListList() {
      return musicTrackList_;
    }
    /**
     * <code>repeated .UgcMusicTrack music_track_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrackOrBuilder> 
        getMusicTrackListOrBuilderList() {
      return musicTrackList_;
    }
    /**
     * <code>repeated .UgcMusicTrack music_track_list = 4;</code>
     */
    @java.lang.Override
    public int getMusicTrackListCount() {
      return musicTrackList_.size();
    }
    /**
     * <code>repeated .UgcMusicTrack music_track_list = 4;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack getMusicTrackList(int index) {
      return musicTrackList_.get(index);
    }
    /**
     * <code>repeated .UgcMusicTrack music_track_list = 4;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrackOrBuilder getMusicTrackListOrBuilder(
        int index) {
      return musicTrackList_.get(index);
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
      if (musicId_ != 0) {
        output.writeUInt32(1, musicId_);
      }
      for (int i = 0; i < musicTrackList_.size(); i++) {
        output.writeMessage(4, musicTrackList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (musicId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, musicId_);
      }
      for (int i = 0; i < musicTrackList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, musicTrackList_.get(i));
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
      if (!(obj instanceof emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord other = (emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord) obj;

      if (getMusicId()
          != other.getMusicId()) return false;
      if (!getMusicTrackListList()
          .equals(other.getMusicTrackListList())) return false;
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
      hash = (37 * hash) + MUSIC_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMusicId();
      if (getMusicTrackListCount() > 0) {
        hash = (37 * hash) + MUSIC_TRACK_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMusicTrackListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord prototype) {
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
     * Protobuf type {@code UgcMusicRecord}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UgcMusicRecord)
        emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.UgcMusicRecordOuterClass.internal_static_UgcMusicRecord_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.UgcMusicRecordOuterClass.internal_static_UgcMusicRecord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord.class, emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord.newBuilder()
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
          getMusicTrackListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        musicId_ = 0;

        if (musicTrackListBuilder_ == null) {
          musicTrackList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          musicTrackListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.UgcMusicRecordOuterClass.internal_static_UgcMusicRecord_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord getDefaultInstanceForType() {
        return emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord build() {
        emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord buildPartial() {
        emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord result = new emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord(this);
        int from_bitField0_ = bitField0_;
        result.musicId_ = musicId_;
        if (musicTrackListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            musicTrackList_ = java.util.Collections.unmodifiableList(musicTrackList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.musicTrackList_ = musicTrackList_;
        } else {
          result.musicTrackList_ = musicTrackListBuilder_.build();
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
        if (other instanceof emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord) {
          return mergeFrom((emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord other) {
        if (other == emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord.getDefaultInstance()) return this;
        if (other.getMusicId() != 0) {
          setMusicId(other.getMusicId());
        }
        if (musicTrackListBuilder_ == null) {
          if (!other.musicTrackList_.isEmpty()) {
            if (musicTrackList_.isEmpty()) {
              musicTrackList_ = other.musicTrackList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureMusicTrackListIsMutable();
              musicTrackList_.addAll(other.musicTrackList_);
            }
            onChanged();
          }
        } else {
          if (!other.musicTrackList_.isEmpty()) {
            if (musicTrackListBuilder_.isEmpty()) {
              musicTrackListBuilder_.dispose();
              musicTrackListBuilder_ = null;
              musicTrackList_ = other.musicTrackList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              musicTrackListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMusicTrackListFieldBuilder() : null;
            } else {
              musicTrackListBuilder_.addAllMessages(other.musicTrackList_);
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
        emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int musicId_ ;
      /**
       * <code>uint32 music_id = 1;</code>
       * @return The musicId.
       */
      @java.lang.Override
      public int getMusicId() {
        return musicId_;
      }
      /**
       * <code>uint32 music_id = 1;</code>
       * @param value The musicId to set.
       * @return This builder for chaining.
       */
      public Builder setMusicId(int value) {
        
        musicId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 music_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMusicId() {
        
        musicId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack> musicTrackList_ =
        java.util.Collections.emptyList();
      private void ensureMusicTrackListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          musicTrackList_ = new java.util.ArrayList<emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack>(musicTrackList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack, emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.Builder, emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrackOrBuilder> musicTrackListBuilder_;

      /**
       * <code>repeated .UgcMusicTrack music_track_list = 4;</code>
       */
      public java.util.List<emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack> getMusicTrackListList() {
        if (musicTrackListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(musicTrackList_);
        } else {
          return musicTrackListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 4;</code>
       */
      public int getMusicTrackListCount() {
        if (musicTrackListBuilder_ == null) {
          return musicTrackList_.size();
        } else {
          return musicTrackListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 4;</code>
       */
      public emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack getMusicTrackList(int index) {
        if (musicTrackListBuilder_ == null) {
          return musicTrackList_.get(index);
        } else {
          return musicTrackListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 4;</code>
       */
      public Builder setMusicTrackList(
          int index, emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack value) {
        if (musicTrackListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMusicTrackListIsMutable();
          musicTrackList_.set(index, value);
          onChanged();
        } else {
          musicTrackListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 4;</code>
       */
      public Builder setMusicTrackList(
          int index, emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.Builder builderForValue) {
        if (musicTrackListBuilder_ == null) {
          ensureMusicTrackListIsMutable();
          musicTrackList_.set(index, builderForValue.build());
          onChanged();
        } else {
          musicTrackListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 4;</code>
       */
      public Builder addMusicTrackList(emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack value) {
        if (musicTrackListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMusicTrackListIsMutable();
          musicTrackList_.add(value);
          onChanged();
        } else {
          musicTrackListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 4;</code>
       */
      public Builder addMusicTrackList(
          int index, emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack value) {
        if (musicTrackListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMusicTrackListIsMutable();
          musicTrackList_.add(index, value);
          onChanged();
        } else {
          musicTrackListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 4;</code>
       */
      public Builder addMusicTrackList(
          emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.Builder builderForValue) {
        if (musicTrackListBuilder_ == null) {
          ensureMusicTrackListIsMutable();
          musicTrackList_.add(builderForValue.build());
          onChanged();
        } else {
          musicTrackListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 4;</code>
       */
      public Builder addMusicTrackList(
          int index, emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.Builder builderForValue) {
        if (musicTrackListBuilder_ == null) {
          ensureMusicTrackListIsMutable();
          musicTrackList_.add(index, builderForValue.build());
          onChanged();
        } else {
          musicTrackListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 4;</code>
       */
      public Builder addAllMusicTrackList(
          java.lang.Iterable<? extends emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack> values) {
        if (musicTrackListBuilder_ == null) {
          ensureMusicTrackListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, musicTrackList_);
          onChanged();
        } else {
          musicTrackListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 4;</code>
       */
      public Builder clearMusicTrackList() {
        if (musicTrackListBuilder_ == null) {
          musicTrackList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          musicTrackListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 4;</code>
       */
      public Builder removeMusicTrackList(int index) {
        if (musicTrackListBuilder_ == null) {
          ensureMusicTrackListIsMutable();
          musicTrackList_.remove(index);
          onChanged();
        } else {
          musicTrackListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 4;</code>
       */
      public emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.Builder getMusicTrackListBuilder(
          int index) {
        return getMusicTrackListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 4;</code>
       */
      public emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrackOrBuilder getMusicTrackListOrBuilder(
          int index) {
        if (musicTrackListBuilder_ == null) {
          return musicTrackList_.get(index);  } else {
          return musicTrackListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 4;</code>
       */
      public java.util.List<? extends emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrackOrBuilder> 
           getMusicTrackListOrBuilderList() {
        if (musicTrackListBuilder_ != null) {
          return musicTrackListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(musicTrackList_);
        }
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 4;</code>
       */
      public emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.Builder addMusicTrackListBuilder() {
        return getMusicTrackListFieldBuilder().addBuilder(
            emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.getDefaultInstance());
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 4;</code>
       */
      public emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.Builder addMusicTrackListBuilder(
          int index) {
        return getMusicTrackListFieldBuilder().addBuilder(
            index, emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.getDefaultInstance());
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 4;</code>
       */
      public java.util.List<emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.Builder> 
           getMusicTrackListBuilderList() {
        return getMusicTrackListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack, emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.Builder, emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrackOrBuilder> 
          getMusicTrackListFieldBuilder() {
        if (musicTrackListBuilder_ == null) {
          musicTrackListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack, emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.Builder, emu.gingerps.net.proto.UgcMusicTrackOuterClass.UgcMusicTrackOrBuilder>(
                  musicTrackList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          musicTrackList_ = null;
        }
        return musicTrackListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:UgcMusicRecord)
    }

    // @@protoc_insertion_point(class_scope:UgcMusicRecord)
    private static final emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord();
    }

    public static emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UgcMusicRecord>
        PARSER = new com.google.protobuf.AbstractParser<UgcMusicRecord>() {
      @java.lang.Override
      public UgcMusicRecord parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UgcMusicRecord(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UgcMusicRecord> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UgcMusicRecord> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UgcMusicRecord_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UgcMusicRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024UgcMusicRecord.proto\032\023UgcMusicTrack.pr" +
      "oto\"L\n\016UgcMusicRecord\022\020\n\010music_id\030\001 \001(\r\022" +
      "(\n\020music_track_list\030\004 \003(\0132\016.UgcMusicTrac" +
      "kB\033\n\031emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.UgcMusicTrackOuterClass.getDescriptor(),
        });
    internal_static_UgcMusicRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UgcMusicRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UgcMusicRecord_descriptor,
        new java.lang.String[] { "MusicId", "MusicTrackList", });
    emu.gingerps.net.proto.UgcMusicTrackOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
