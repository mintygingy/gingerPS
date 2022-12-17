// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AllCoopInfoNotify.proto

package emu.gingerps.net.proto;

public final class AllCoopInfoNotifyOuterClass {
  private AllCoopInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AllCoopInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AllCoopInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .MainCoop main_coop_list = 10;</code>
     */
    java.util.List<emu.gingerps.net.proto.MainCoopOuterClass.MainCoop> 
        getMainCoopListList();
    /**
     * <code>repeated .MainCoop main_coop_list = 10;</code>
     */
    emu.gingerps.net.proto.MainCoopOuterClass.MainCoop getMainCoopList(int index);
    /**
     * <code>repeated .MainCoop main_coop_list = 10;</code>
     */
    int getMainCoopListCount();
    /**
     * <code>repeated .MainCoop main_coop_list = 10;</code>
     */
    java.util.List<? extends emu.gingerps.net.proto.MainCoopOuterClass.MainCoopOrBuilder> 
        getMainCoopListOrBuilderList();
    /**
     * <code>repeated .MainCoop main_coop_list = 10;</code>
     */
    emu.gingerps.net.proto.MainCoopOuterClass.MainCoopOrBuilder getMainCoopListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 1992;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code AllCoopInfoNotify}
   */
  public static final class AllCoopInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AllCoopInfoNotify)
      AllCoopInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AllCoopInfoNotify.newBuilder() to construct.
    private AllCoopInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AllCoopInfoNotify() {
      mainCoopList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AllCoopInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.internal_static_AllCoopInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.internal_static_AllCoopInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify.class, emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify.Builder.class);
    }

    public static final int MAIN_COOP_LIST_FIELD_NUMBER = 10;
    @SuppressWarnings("serial")
    private java.util.List<emu.gingerps.net.proto.MainCoopOuterClass.MainCoop> mainCoopList_;
    /**
     * <code>repeated .MainCoop main_coop_list = 10;</code>
     */
    @java.lang.Override
    public java.util.List<emu.gingerps.net.proto.MainCoopOuterClass.MainCoop> getMainCoopListList() {
      return mainCoopList_;
    }
    /**
     * <code>repeated .MainCoop main_coop_list = 10;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.gingerps.net.proto.MainCoopOuterClass.MainCoopOrBuilder> 
        getMainCoopListOrBuilderList() {
      return mainCoopList_;
    }
    /**
     * <code>repeated .MainCoop main_coop_list = 10;</code>
     */
    @java.lang.Override
    public int getMainCoopListCount() {
      return mainCoopList_.size();
    }
    /**
     * <code>repeated .MainCoop main_coop_list = 10;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.MainCoopOuterClass.MainCoop getMainCoopList(int index) {
      return mainCoopList_.get(index);
    }
    /**
     * <code>repeated .MainCoop main_coop_list = 10;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.MainCoopOuterClass.MainCoopOrBuilder getMainCoopListOrBuilder(
        int index) {
      return mainCoopList_.get(index);
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
      for (int i = 0; i < mainCoopList_.size(); i++) {
        output.writeMessage(10, mainCoopList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < mainCoopList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, mainCoopList_.get(i));
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
      if (!(obj instanceof emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify other = (emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify) obj;

      if (!getMainCoopListList()
          .equals(other.getMainCoopListList())) return false;
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
      if (getMainCoopListCount() > 0) {
        hash = (37 * hash) + MAIN_COOP_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMainCoopListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify prototype) {
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
     *   CMD_ID = 1992;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code AllCoopInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AllCoopInfoNotify)
        emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.internal_static_AllCoopInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.internal_static_AllCoopInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify.class, emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify.newBuilder()
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
        if (mainCoopListBuilder_ == null) {
          mainCoopList_ = java.util.Collections.emptyList();
        } else {
          mainCoopList_ = null;
          mainCoopListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.internal_static_AllCoopInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify build() {
        emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify buildPartial() {
        emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify result = new emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify result) {
        if (mainCoopListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            mainCoopList_ = java.util.Collections.unmodifiableList(mainCoopList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.mainCoopList_ = mainCoopList_;
        } else {
          result.mainCoopList_ = mainCoopListBuilder_.build();
        }
      }

      private void buildPartial0(emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify result) {
        int from_bitField0_ = bitField0_;
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
        if (other instanceof emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify) {
          return mergeFrom((emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify other) {
        if (other == emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify.getDefaultInstance()) return this;
        if (mainCoopListBuilder_ == null) {
          if (!other.mainCoopList_.isEmpty()) {
            if (mainCoopList_.isEmpty()) {
              mainCoopList_ = other.mainCoopList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureMainCoopListIsMutable();
              mainCoopList_.addAll(other.mainCoopList_);
            }
            onChanged();
          }
        } else {
          if (!other.mainCoopList_.isEmpty()) {
            if (mainCoopListBuilder_.isEmpty()) {
              mainCoopListBuilder_.dispose();
              mainCoopListBuilder_ = null;
              mainCoopList_ = other.mainCoopList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              mainCoopListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMainCoopListFieldBuilder() : null;
            } else {
              mainCoopListBuilder_.addAllMessages(other.mainCoopList_);
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
              case 82: {
                emu.gingerps.net.proto.MainCoopOuterClass.MainCoop m =
                    input.readMessage(
                        emu.gingerps.net.proto.MainCoopOuterClass.MainCoop.parser(),
                        extensionRegistry);
                if (mainCoopListBuilder_ == null) {
                  ensureMainCoopListIsMutable();
                  mainCoopList_.add(m);
                } else {
                  mainCoopListBuilder_.addMessage(m);
                }
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

      private java.util.List<emu.gingerps.net.proto.MainCoopOuterClass.MainCoop> mainCoopList_ =
        java.util.Collections.emptyList();
      private void ensureMainCoopListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          mainCoopList_ = new java.util.ArrayList<emu.gingerps.net.proto.MainCoopOuterClass.MainCoop>(mainCoopList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.MainCoopOuterClass.MainCoop, emu.gingerps.net.proto.MainCoopOuterClass.MainCoop.Builder, emu.gingerps.net.proto.MainCoopOuterClass.MainCoopOrBuilder> mainCoopListBuilder_;

      /**
       * <code>repeated .MainCoop main_coop_list = 10;</code>
       */
      public java.util.List<emu.gingerps.net.proto.MainCoopOuterClass.MainCoop> getMainCoopListList() {
        if (mainCoopListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(mainCoopList_);
        } else {
          return mainCoopListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 10;</code>
       */
      public int getMainCoopListCount() {
        if (mainCoopListBuilder_ == null) {
          return mainCoopList_.size();
        } else {
          return mainCoopListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 10;</code>
       */
      public emu.gingerps.net.proto.MainCoopOuterClass.MainCoop getMainCoopList(int index) {
        if (mainCoopListBuilder_ == null) {
          return mainCoopList_.get(index);
        } else {
          return mainCoopListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 10;</code>
       */
      public Builder setMainCoopList(
          int index, emu.gingerps.net.proto.MainCoopOuterClass.MainCoop value) {
        if (mainCoopListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMainCoopListIsMutable();
          mainCoopList_.set(index, value);
          onChanged();
        } else {
          mainCoopListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 10;</code>
       */
      public Builder setMainCoopList(
          int index, emu.gingerps.net.proto.MainCoopOuterClass.MainCoop.Builder builderForValue) {
        if (mainCoopListBuilder_ == null) {
          ensureMainCoopListIsMutable();
          mainCoopList_.set(index, builderForValue.build());
          onChanged();
        } else {
          mainCoopListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 10;</code>
       */
      public Builder addMainCoopList(emu.gingerps.net.proto.MainCoopOuterClass.MainCoop value) {
        if (mainCoopListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMainCoopListIsMutable();
          mainCoopList_.add(value);
          onChanged();
        } else {
          mainCoopListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 10;</code>
       */
      public Builder addMainCoopList(
          int index, emu.gingerps.net.proto.MainCoopOuterClass.MainCoop value) {
        if (mainCoopListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMainCoopListIsMutable();
          mainCoopList_.add(index, value);
          onChanged();
        } else {
          mainCoopListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 10;</code>
       */
      public Builder addMainCoopList(
          emu.gingerps.net.proto.MainCoopOuterClass.MainCoop.Builder builderForValue) {
        if (mainCoopListBuilder_ == null) {
          ensureMainCoopListIsMutable();
          mainCoopList_.add(builderForValue.build());
          onChanged();
        } else {
          mainCoopListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 10;</code>
       */
      public Builder addMainCoopList(
          int index, emu.gingerps.net.proto.MainCoopOuterClass.MainCoop.Builder builderForValue) {
        if (mainCoopListBuilder_ == null) {
          ensureMainCoopListIsMutable();
          mainCoopList_.add(index, builderForValue.build());
          onChanged();
        } else {
          mainCoopListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 10;</code>
       */
      public Builder addAllMainCoopList(
          java.lang.Iterable<? extends emu.gingerps.net.proto.MainCoopOuterClass.MainCoop> values) {
        if (mainCoopListBuilder_ == null) {
          ensureMainCoopListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, mainCoopList_);
          onChanged();
        } else {
          mainCoopListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 10;</code>
       */
      public Builder clearMainCoopList() {
        if (mainCoopListBuilder_ == null) {
          mainCoopList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          mainCoopListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 10;</code>
       */
      public Builder removeMainCoopList(int index) {
        if (mainCoopListBuilder_ == null) {
          ensureMainCoopListIsMutable();
          mainCoopList_.remove(index);
          onChanged();
        } else {
          mainCoopListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 10;</code>
       */
      public emu.gingerps.net.proto.MainCoopOuterClass.MainCoop.Builder getMainCoopListBuilder(
          int index) {
        return getMainCoopListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 10;</code>
       */
      public emu.gingerps.net.proto.MainCoopOuterClass.MainCoopOrBuilder getMainCoopListOrBuilder(
          int index) {
        if (mainCoopListBuilder_ == null) {
          return mainCoopList_.get(index);  } else {
          return mainCoopListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 10;</code>
       */
      public java.util.List<? extends emu.gingerps.net.proto.MainCoopOuterClass.MainCoopOrBuilder> 
           getMainCoopListOrBuilderList() {
        if (mainCoopListBuilder_ != null) {
          return mainCoopListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(mainCoopList_);
        }
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 10;</code>
       */
      public emu.gingerps.net.proto.MainCoopOuterClass.MainCoop.Builder addMainCoopListBuilder() {
        return getMainCoopListFieldBuilder().addBuilder(
            emu.gingerps.net.proto.MainCoopOuterClass.MainCoop.getDefaultInstance());
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 10;</code>
       */
      public emu.gingerps.net.proto.MainCoopOuterClass.MainCoop.Builder addMainCoopListBuilder(
          int index) {
        return getMainCoopListFieldBuilder().addBuilder(
            index, emu.gingerps.net.proto.MainCoopOuterClass.MainCoop.getDefaultInstance());
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 10;</code>
       */
      public java.util.List<emu.gingerps.net.proto.MainCoopOuterClass.MainCoop.Builder> 
           getMainCoopListBuilderList() {
        return getMainCoopListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.MainCoopOuterClass.MainCoop, emu.gingerps.net.proto.MainCoopOuterClass.MainCoop.Builder, emu.gingerps.net.proto.MainCoopOuterClass.MainCoopOrBuilder> 
          getMainCoopListFieldBuilder() {
        if (mainCoopListBuilder_ == null) {
          mainCoopListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.gingerps.net.proto.MainCoopOuterClass.MainCoop, emu.gingerps.net.proto.MainCoopOuterClass.MainCoop.Builder, emu.gingerps.net.proto.MainCoopOuterClass.MainCoopOrBuilder>(
                  mainCoopList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          mainCoopList_ = null;
        }
        return mainCoopListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:AllCoopInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:AllCoopInfoNotify)
    private static final emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify();
    }

    public static emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AllCoopInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<AllCoopInfoNotify>() {
      @java.lang.Override
      public AllCoopInfoNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<AllCoopInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AllCoopInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AllCoopInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AllCoopInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027AllCoopInfoNotify.proto\032\016MainCoop.prot" +
      "o\"6\n\021AllCoopInfoNotify\022!\n\016main_coop_list" +
      "\030\n \003(\0132\t.MainCoopB\030\n\026emu.gingerps.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.MainCoopOuterClass.getDescriptor(),
        });
    internal_static_AllCoopInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AllCoopInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AllCoopInfoNotify_descriptor,
        new java.lang.String[] { "MainCoopList", });
    emu.gingerps.net.proto.MainCoopOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
