// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RegionSearchInfo.proto

package emu.gingerps.net.proto;

public final class RegionSearchInfoOuterClass {
  private RegionSearchInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RegionSearchInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RegionSearchInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_entered = 2;</code>
     * @return The isEntered.
     */
    boolean getIsEntered();

    /**
     * <code>repeated .RegionSearch region_search_list = 7;</code>
     */
    java.util.List<emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearch> 
        getRegionSearchListList();
    /**
     * <code>repeated .RegionSearch region_search_list = 7;</code>
     */
    emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearch getRegionSearchList(int index);
    /**
     * <code>repeated .RegionSearch region_search_list = 7;</code>
     */
    int getRegionSearchListCount();
    /**
     * <code>repeated .RegionSearch region_search_list = 7;</code>
     */
    java.util.List<? extends emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearchOrBuilder> 
        getRegionSearchListOrBuilderList();
    /**
     * <code>repeated .RegionSearch region_search_list = 7;</code>
     */
    emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearchOrBuilder getRegionSearchListOrBuilder(
        int index);

    /**
     * <code>uint32 id = 9;</code>
     * @return The id.
     */
    int getId();
  }
  /**
   * Protobuf type {@code RegionSearchInfo}
   */
  public static final class RegionSearchInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RegionSearchInfo)
      RegionSearchInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RegionSearchInfo.newBuilder() to construct.
    private RegionSearchInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RegionSearchInfo() {
      regionSearchList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RegionSearchInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.RegionSearchInfoOuterClass.internal_static_RegionSearchInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.RegionSearchInfoOuterClass.internal_static_RegionSearchInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo.class, emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo.Builder.class);
    }

    public static final int IS_ENTERED_FIELD_NUMBER = 2;
    private boolean isEntered_ = false;
    /**
     * <code>bool is_entered = 2;</code>
     * @return The isEntered.
     */
    @java.lang.Override
    public boolean getIsEntered() {
      return isEntered_;
    }

    public static final int REGION_SEARCH_LIST_FIELD_NUMBER = 7;
    @SuppressWarnings("serial")
    private java.util.List<emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearch> regionSearchList_;
    /**
     * <code>repeated .RegionSearch region_search_list = 7;</code>
     */
    @java.lang.Override
    public java.util.List<emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearch> getRegionSearchListList() {
      return regionSearchList_;
    }
    /**
     * <code>repeated .RegionSearch region_search_list = 7;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearchOrBuilder> 
        getRegionSearchListOrBuilderList() {
      return regionSearchList_;
    }
    /**
     * <code>repeated .RegionSearch region_search_list = 7;</code>
     */
    @java.lang.Override
    public int getRegionSearchListCount() {
      return regionSearchList_.size();
    }
    /**
     * <code>repeated .RegionSearch region_search_list = 7;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearch getRegionSearchList(int index) {
      return regionSearchList_.get(index);
    }
    /**
     * <code>repeated .RegionSearch region_search_list = 7;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearchOrBuilder getRegionSearchListOrBuilder(
        int index) {
      return regionSearchList_.get(index);
    }

    public static final int ID_FIELD_NUMBER = 9;
    private int id_ = 0;
    /**
     * <code>uint32 id = 9;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
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
      if (isEntered_ != false) {
        output.writeBool(2, isEntered_);
      }
      for (int i = 0; i < regionSearchList_.size(); i++) {
        output.writeMessage(7, regionSearchList_.get(i));
      }
      if (id_ != 0) {
        output.writeUInt32(9, id_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isEntered_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isEntered_);
      }
      for (int i = 0; i < regionSearchList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, regionSearchList_.get(i));
      }
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, id_);
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
      if (!(obj instanceof emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo other = (emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo) obj;

      if (getIsEntered()
          != other.getIsEntered()) return false;
      if (!getRegionSearchListList()
          .equals(other.getRegionSearchListList())) return false;
      if (getId()
          != other.getId()) return false;
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
      hash = (37 * hash) + IS_ENTERED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsEntered());
      if (getRegionSearchListCount() > 0) {
        hash = (37 * hash) + REGION_SEARCH_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getRegionSearchListList().hashCode();
      }
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo prototype) {
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
     * Protobuf type {@code RegionSearchInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RegionSearchInfo)
        emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.RegionSearchInfoOuterClass.internal_static_RegionSearchInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.RegionSearchInfoOuterClass.internal_static_RegionSearchInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo.class, emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo.newBuilder()
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
        isEntered_ = false;
        if (regionSearchListBuilder_ == null) {
          regionSearchList_ = java.util.Collections.emptyList();
        } else {
          regionSearchList_ = null;
          regionSearchListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        id_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.RegionSearchInfoOuterClass.internal_static_RegionSearchInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo build() {
        emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo buildPartial() {
        emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo result = new emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo result) {
        if (regionSearchListBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            regionSearchList_ = java.util.Collections.unmodifiableList(regionSearchList_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.regionSearchList_ = regionSearchList_;
        } else {
          result.regionSearchList_ = regionSearchListBuilder_.build();
        }
      }

      private void buildPartial0(emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isEntered_ = isEntered_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.id_ = id_;
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
        if (other instanceof emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo) {
          return mergeFrom((emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo other) {
        if (other == emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo.getDefaultInstance()) return this;
        if (other.getIsEntered() != false) {
          setIsEntered(other.getIsEntered());
        }
        if (regionSearchListBuilder_ == null) {
          if (!other.regionSearchList_.isEmpty()) {
            if (regionSearchList_.isEmpty()) {
              regionSearchList_ = other.regionSearchList_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureRegionSearchListIsMutable();
              regionSearchList_.addAll(other.regionSearchList_);
            }
            onChanged();
          }
        } else {
          if (!other.regionSearchList_.isEmpty()) {
            if (regionSearchListBuilder_.isEmpty()) {
              regionSearchListBuilder_.dispose();
              regionSearchListBuilder_ = null;
              regionSearchList_ = other.regionSearchList_;
              bitField0_ = (bitField0_ & ~0x00000002);
              regionSearchListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getRegionSearchListFieldBuilder() : null;
            } else {
              regionSearchListBuilder_.addAllMessages(other.regionSearchList_);
            }
          }
        }
        if (other.getId() != 0) {
          setId(other.getId());
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
              case 16: {
                isEntered_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 16
              case 58: {
                emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearch m =
                    input.readMessage(
                        emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearch.parser(),
                        extensionRegistry);
                if (regionSearchListBuilder_ == null) {
                  ensureRegionSearchListIsMutable();
                  regionSearchList_.add(m);
                } else {
                  regionSearchListBuilder_.addMessage(m);
                }
                break;
              } // case 58
              case 72: {
                id_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 72
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

      private boolean isEntered_ ;
      /**
       * <code>bool is_entered = 2;</code>
       * @return The isEntered.
       */
      @java.lang.Override
      public boolean getIsEntered() {
        return isEntered_;
      }
      /**
       * <code>bool is_entered = 2;</code>
       * @param value The isEntered to set.
       * @return This builder for chaining.
       */
      public Builder setIsEntered(boolean value) {
        
        isEntered_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_entered = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsEntered() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isEntered_ = false;
        onChanged();
        return this;
      }

      private java.util.List<emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearch> regionSearchList_ =
        java.util.Collections.emptyList();
      private void ensureRegionSearchListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          regionSearchList_ = new java.util.ArrayList<emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearch>(regionSearchList_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearch, emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearch.Builder, emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearchOrBuilder> regionSearchListBuilder_;

      /**
       * <code>repeated .RegionSearch region_search_list = 7;</code>
       */
      public java.util.List<emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearch> getRegionSearchListList() {
        if (regionSearchListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(regionSearchList_);
        } else {
          return regionSearchListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .RegionSearch region_search_list = 7;</code>
       */
      public int getRegionSearchListCount() {
        if (regionSearchListBuilder_ == null) {
          return regionSearchList_.size();
        } else {
          return regionSearchListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .RegionSearch region_search_list = 7;</code>
       */
      public emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearch getRegionSearchList(int index) {
        if (regionSearchListBuilder_ == null) {
          return regionSearchList_.get(index);
        } else {
          return regionSearchListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .RegionSearch region_search_list = 7;</code>
       */
      public Builder setRegionSearchList(
          int index, emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearch value) {
        if (regionSearchListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRegionSearchListIsMutable();
          regionSearchList_.set(index, value);
          onChanged();
        } else {
          regionSearchListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .RegionSearch region_search_list = 7;</code>
       */
      public Builder setRegionSearchList(
          int index, emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearch.Builder builderForValue) {
        if (regionSearchListBuilder_ == null) {
          ensureRegionSearchListIsMutable();
          regionSearchList_.set(index, builderForValue.build());
          onChanged();
        } else {
          regionSearchListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RegionSearch region_search_list = 7;</code>
       */
      public Builder addRegionSearchList(emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearch value) {
        if (regionSearchListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRegionSearchListIsMutable();
          regionSearchList_.add(value);
          onChanged();
        } else {
          regionSearchListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .RegionSearch region_search_list = 7;</code>
       */
      public Builder addRegionSearchList(
          int index, emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearch value) {
        if (regionSearchListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRegionSearchListIsMutable();
          regionSearchList_.add(index, value);
          onChanged();
        } else {
          regionSearchListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .RegionSearch region_search_list = 7;</code>
       */
      public Builder addRegionSearchList(
          emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearch.Builder builderForValue) {
        if (regionSearchListBuilder_ == null) {
          ensureRegionSearchListIsMutable();
          regionSearchList_.add(builderForValue.build());
          onChanged();
        } else {
          regionSearchListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RegionSearch region_search_list = 7;</code>
       */
      public Builder addRegionSearchList(
          int index, emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearch.Builder builderForValue) {
        if (regionSearchListBuilder_ == null) {
          ensureRegionSearchListIsMutable();
          regionSearchList_.add(index, builderForValue.build());
          onChanged();
        } else {
          regionSearchListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RegionSearch region_search_list = 7;</code>
       */
      public Builder addAllRegionSearchList(
          java.lang.Iterable<? extends emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearch> values) {
        if (regionSearchListBuilder_ == null) {
          ensureRegionSearchListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, regionSearchList_);
          onChanged();
        } else {
          regionSearchListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .RegionSearch region_search_list = 7;</code>
       */
      public Builder clearRegionSearchList() {
        if (regionSearchListBuilder_ == null) {
          regionSearchList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          regionSearchListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .RegionSearch region_search_list = 7;</code>
       */
      public Builder removeRegionSearchList(int index) {
        if (regionSearchListBuilder_ == null) {
          ensureRegionSearchListIsMutable();
          regionSearchList_.remove(index);
          onChanged();
        } else {
          regionSearchListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .RegionSearch region_search_list = 7;</code>
       */
      public emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearch.Builder getRegionSearchListBuilder(
          int index) {
        return getRegionSearchListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .RegionSearch region_search_list = 7;</code>
       */
      public emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearchOrBuilder getRegionSearchListOrBuilder(
          int index) {
        if (regionSearchListBuilder_ == null) {
          return regionSearchList_.get(index);  } else {
          return regionSearchListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .RegionSearch region_search_list = 7;</code>
       */
      public java.util.List<? extends emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearchOrBuilder> 
           getRegionSearchListOrBuilderList() {
        if (regionSearchListBuilder_ != null) {
          return regionSearchListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(regionSearchList_);
        }
      }
      /**
       * <code>repeated .RegionSearch region_search_list = 7;</code>
       */
      public emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearch.Builder addRegionSearchListBuilder() {
        return getRegionSearchListFieldBuilder().addBuilder(
            emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearch.getDefaultInstance());
      }
      /**
       * <code>repeated .RegionSearch region_search_list = 7;</code>
       */
      public emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearch.Builder addRegionSearchListBuilder(
          int index) {
        return getRegionSearchListFieldBuilder().addBuilder(
            index, emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearch.getDefaultInstance());
      }
      /**
       * <code>repeated .RegionSearch region_search_list = 7;</code>
       */
      public java.util.List<emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearch.Builder> 
           getRegionSearchListBuilderList() {
        return getRegionSearchListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearch, emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearch.Builder, emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearchOrBuilder> 
          getRegionSearchListFieldBuilder() {
        if (regionSearchListBuilder_ == null) {
          regionSearchListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearch, emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearch.Builder, emu.gingerps.net.proto.RegionSearchOuterClass.RegionSearchOrBuilder>(
                  regionSearchList_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          regionSearchList_ = null;
        }
        return regionSearchListBuilder_;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 9;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 9;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        id_ = 0;
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


      // @@protoc_insertion_point(builder_scope:RegionSearchInfo)
    }

    // @@protoc_insertion_point(class_scope:RegionSearchInfo)
    private static final emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo();
    }

    public static emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RegionSearchInfo>
        PARSER = new com.google.protobuf.AbstractParser<RegionSearchInfo>() {
      @java.lang.Override
      public RegionSearchInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<RegionSearchInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RegionSearchInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.RegionSearchInfoOuterClass.RegionSearchInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RegionSearchInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RegionSearchInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026RegionSearchInfo.proto\032\022RegionSearch.p" +
      "roto\"]\n\020RegionSearchInfo\022\022\n\nis_entered\030\002" +
      " \001(\010\022)\n\022region_search_list\030\007 \003(\0132\r.Regio" +
      "nSearch\022\n\n\002id\030\t \001(\rB\030\n\026emu.gingerps.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.RegionSearchOuterClass.getDescriptor(),
        });
    internal_static_RegionSearchInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RegionSearchInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RegionSearchInfo_descriptor,
        new java.lang.String[] { "IsEntered", "RegionSearchList", "Id", });
    emu.gingerps.net.proto.RegionSearchOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
