// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerInvestigationNotify.proto

package emu.gingerps.net.proto;

public final class PlayerInvestigationNotifyOuterClass {
  private PlayerInvestigationNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerInvestigationNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerInvestigationNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .Investigation investigation_list = 12;</code>
     */
    java.util.List<emu.gingerps.net.proto.InvestigationOuterClass.Investigation> 
        getInvestigationListList();
    /**
     * <code>repeated .Investigation investigation_list = 12;</code>
     */
    emu.gingerps.net.proto.InvestigationOuterClass.Investigation getInvestigationList(int index);
    /**
     * <code>repeated .Investigation investigation_list = 12;</code>
     */
    int getInvestigationListCount();
    /**
     * <code>repeated .Investigation investigation_list = 12;</code>
     */
    java.util.List<? extends emu.gingerps.net.proto.InvestigationOuterClass.InvestigationOrBuilder> 
        getInvestigationListOrBuilderList();
    /**
     * <code>repeated .Investigation investigation_list = 12;</code>
     */
    emu.gingerps.net.proto.InvestigationOuterClass.InvestigationOrBuilder getInvestigationListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 1915;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code PlayerInvestigationNotify}
   */
  public static final class PlayerInvestigationNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerInvestigationNotify)
      PlayerInvestigationNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerInvestigationNotify.newBuilder() to construct.
    private PlayerInvestigationNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerInvestigationNotify() {
      investigationList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerInvestigationNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.internal_static_PlayerInvestigationNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.internal_static_PlayerInvestigationNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify.class, emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify.Builder.class);
    }

    public static final int INVESTIGATION_LIST_FIELD_NUMBER = 12;
    @SuppressWarnings("serial")
    private java.util.List<emu.gingerps.net.proto.InvestigationOuterClass.Investigation> investigationList_;
    /**
     * <code>repeated .Investigation investigation_list = 12;</code>
     */
    @java.lang.Override
    public java.util.List<emu.gingerps.net.proto.InvestigationOuterClass.Investigation> getInvestigationListList() {
      return investigationList_;
    }
    /**
     * <code>repeated .Investigation investigation_list = 12;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.gingerps.net.proto.InvestigationOuterClass.InvestigationOrBuilder> 
        getInvestigationListOrBuilderList() {
      return investigationList_;
    }
    /**
     * <code>repeated .Investigation investigation_list = 12;</code>
     */
    @java.lang.Override
    public int getInvestigationListCount() {
      return investigationList_.size();
    }
    /**
     * <code>repeated .Investigation investigation_list = 12;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.InvestigationOuterClass.Investigation getInvestigationList(int index) {
      return investigationList_.get(index);
    }
    /**
     * <code>repeated .Investigation investigation_list = 12;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.InvestigationOuterClass.InvestigationOrBuilder getInvestigationListOrBuilder(
        int index) {
      return investigationList_.get(index);
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
      for (int i = 0; i < investigationList_.size(); i++) {
        output.writeMessage(12, investigationList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < investigationList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, investigationList_.get(i));
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
      if (!(obj instanceof emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify other = (emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify) obj;

      if (!getInvestigationListList()
          .equals(other.getInvestigationListList())) return false;
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
      if (getInvestigationListCount() > 0) {
        hash = (37 * hash) + INVESTIGATION_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getInvestigationListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify prototype) {
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
     *   CMD_ID = 1915;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code PlayerInvestigationNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerInvestigationNotify)
        emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.internal_static_PlayerInvestigationNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.internal_static_PlayerInvestigationNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify.class, emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify.newBuilder()
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
        if (investigationListBuilder_ == null) {
          investigationList_ = java.util.Collections.emptyList();
        } else {
          investigationList_ = null;
          investigationListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.internal_static_PlayerInvestigationNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify build() {
        emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify buildPartial() {
        emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify result = new emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify result) {
        if (investigationListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            investigationList_ = java.util.Collections.unmodifiableList(investigationList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.investigationList_ = investigationList_;
        } else {
          result.investigationList_ = investigationListBuilder_.build();
        }
      }

      private void buildPartial0(emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify result) {
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
        if (other instanceof emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify) {
          return mergeFrom((emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify other) {
        if (other == emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify.getDefaultInstance()) return this;
        if (investigationListBuilder_ == null) {
          if (!other.investigationList_.isEmpty()) {
            if (investigationList_.isEmpty()) {
              investigationList_ = other.investigationList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureInvestigationListIsMutable();
              investigationList_.addAll(other.investigationList_);
            }
            onChanged();
          }
        } else {
          if (!other.investigationList_.isEmpty()) {
            if (investigationListBuilder_.isEmpty()) {
              investigationListBuilder_.dispose();
              investigationListBuilder_ = null;
              investigationList_ = other.investigationList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              investigationListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getInvestigationListFieldBuilder() : null;
            } else {
              investigationListBuilder_.addAllMessages(other.investigationList_);
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
              case 98: {
                emu.gingerps.net.proto.InvestigationOuterClass.Investigation m =
                    input.readMessage(
                        emu.gingerps.net.proto.InvestigationOuterClass.Investigation.parser(),
                        extensionRegistry);
                if (investigationListBuilder_ == null) {
                  ensureInvestigationListIsMutable();
                  investigationList_.add(m);
                } else {
                  investigationListBuilder_.addMessage(m);
                }
                break;
              } // case 98
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

      private java.util.List<emu.gingerps.net.proto.InvestigationOuterClass.Investigation> investigationList_ =
        java.util.Collections.emptyList();
      private void ensureInvestigationListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          investigationList_ = new java.util.ArrayList<emu.gingerps.net.proto.InvestigationOuterClass.Investigation>(investigationList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.InvestigationOuterClass.Investigation, emu.gingerps.net.proto.InvestigationOuterClass.Investigation.Builder, emu.gingerps.net.proto.InvestigationOuterClass.InvestigationOrBuilder> investigationListBuilder_;

      /**
       * <code>repeated .Investigation investigation_list = 12;</code>
       */
      public java.util.List<emu.gingerps.net.proto.InvestigationOuterClass.Investigation> getInvestigationListList() {
        if (investigationListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(investigationList_);
        } else {
          return investigationListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Investigation investigation_list = 12;</code>
       */
      public int getInvestigationListCount() {
        if (investigationListBuilder_ == null) {
          return investigationList_.size();
        } else {
          return investigationListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Investigation investigation_list = 12;</code>
       */
      public emu.gingerps.net.proto.InvestigationOuterClass.Investigation getInvestigationList(int index) {
        if (investigationListBuilder_ == null) {
          return investigationList_.get(index);
        } else {
          return investigationListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Investigation investigation_list = 12;</code>
       */
      public Builder setInvestigationList(
          int index, emu.gingerps.net.proto.InvestigationOuterClass.Investigation value) {
        if (investigationListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInvestigationListIsMutable();
          investigationList_.set(index, value);
          onChanged();
        } else {
          investigationListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Investigation investigation_list = 12;</code>
       */
      public Builder setInvestigationList(
          int index, emu.gingerps.net.proto.InvestigationOuterClass.Investigation.Builder builderForValue) {
        if (investigationListBuilder_ == null) {
          ensureInvestigationListIsMutable();
          investigationList_.set(index, builderForValue.build());
          onChanged();
        } else {
          investigationListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Investigation investigation_list = 12;</code>
       */
      public Builder addInvestigationList(emu.gingerps.net.proto.InvestigationOuterClass.Investigation value) {
        if (investigationListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInvestigationListIsMutable();
          investigationList_.add(value);
          onChanged();
        } else {
          investigationListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Investigation investigation_list = 12;</code>
       */
      public Builder addInvestigationList(
          int index, emu.gingerps.net.proto.InvestigationOuterClass.Investigation value) {
        if (investigationListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInvestigationListIsMutable();
          investigationList_.add(index, value);
          onChanged();
        } else {
          investigationListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Investigation investigation_list = 12;</code>
       */
      public Builder addInvestigationList(
          emu.gingerps.net.proto.InvestigationOuterClass.Investigation.Builder builderForValue) {
        if (investigationListBuilder_ == null) {
          ensureInvestigationListIsMutable();
          investigationList_.add(builderForValue.build());
          onChanged();
        } else {
          investigationListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Investigation investigation_list = 12;</code>
       */
      public Builder addInvestigationList(
          int index, emu.gingerps.net.proto.InvestigationOuterClass.Investigation.Builder builderForValue) {
        if (investigationListBuilder_ == null) {
          ensureInvestigationListIsMutable();
          investigationList_.add(index, builderForValue.build());
          onChanged();
        } else {
          investigationListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Investigation investigation_list = 12;</code>
       */
      public Builder addAllInvestigationList(
          java.lang.Iterable<? extends emu.gingerps.net.proto.InvestigationOuterClass.Investigation> values) {
        if (investigationListBuilder_ == null) {
          ensureInvestigationListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, investigationList_);
          onChanged();
        } else {
          investigationListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Investigation investigation_list = 12;</code>
       */
      public Builder clearInvestigationList() {
        if (investigationListBuilder_ == null) {
          investigationList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          investigationListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Investigation investigation_list = 12;</code>
       */
      public Builder removeInvestigationList(int index) {
        if (investigationListBuilder_ == null) {
          ensureInvestigationListIsMutable();
          investigationList_.remove(index);
          onChanged();
        } else {
          investigationListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Investigation investigation_list = 12;</code>
       */
      public emu.gingerps.net.proto.InvestigationOuterClass.Investigation.Builder getInvestigationListBuilder(
          int index) {
        return getInvestigationListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Investigation investigation_list = 12;</code>
       */
      public emu.gingerps.net.proto.InvestigationOuterClass.InvestigationOrBuilder getInvestigationListOrBuilder(
          int index) {
        if (investigationListBuilder_ == null) {
          return investigationList_.get(index);  } else {
          return investigationListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Investigation investigation_list = 12;</code>
       */
      public java.util.List<? extends emu.gingerps.net.proto.InvestigationOuterClass.InvestigationOrBuilder> 
           getInvestigationListOrBuilderList() {
        if (investigationListBuilder_ != null) {
          return investigationListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(investigationList_);
        }
      }
      /**
       * <code>repeated .Investigation investigation_list = 12;</code>
       */
      public emu.gingerps.net.proto.InvestigationOuterClass.Investigation.Builder addInvestigationListBuilder() {
        return getInvestigationListFieldBuilder().addBuilder(
            emu.gingerps.net.proto.InvestigationOuterClass.Investigation.getDefaultInstance());
      }
      /**
       * <code>repeated .Investigation investigation_list = 12;</code>
       */
      public emu.gingerps.net.proto.InvestigationOuterClass.Investigation.Builder addInvestigationListBuilder(
          int index) {
        return getInvestigationListFieldBuilder().addBuilder(
            index, emu.gingerps.net.proto.InvestigationOuterClass.Investigation.getDefaultInstance());
      }
      /**
       * <code>repeated .Investigation investigation_list = 12;</code>
       */
      public java.util.List<emu.gingerps.net.proto.InvestigationOuterClass.Investigation.Builder> 
           getInvestigationListBuilderList() {
        return getInvestigationListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.InvestigationOuterClass.Investigation, emu.gingerps.net.proto.InvestigationOuterClass.Investigation.Builder, emu.gingerps.net.proto.InvestigationOuterClass.InvestigationOrBuilder> 
          getInvestigationListFieldBuilder() {
        if (investigationListBuilder_ == null) {
          investigationListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.gingerps.net.proto.InvestigationOuterClass.Investigation, emu.gingerps.net.proto.InvestigationOuterClass.Investigation.Builder, emu.gingerps.net.proto.InvestigationOuterClass.InvestigationOrBuilder>(
                  investigationList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          investigationList_ = null;
        }
        return investigationListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:PlayerInvestigationNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerInvestigationNotify)
    private static final emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify();
    }

    public static emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerInvestigationNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerInvestigationNotify>() {
      @java.lang.Override
      public PlayerInvestigationNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerInvestigationNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerInvestigationNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerInvestigationNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerInvestigationNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037PlayerInvestigationNotify.proto\032\023Inves" +
      "tigation.proto\"G\n\031PlayerInvestigationNot" +
      "ify\022*\n\022investigation_list\030\014 \003(\0132\016.Invest" +
      "igationB\030\n\026emu.gingerps.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.InvestigationOuterClass.getDescriptor(),
        });
    internal_static_PlayerInvestigationNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerInvestigationNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerInvestigationNotify_descriptor,
        new java.lang.String[] { "InvestigationList", });
    emu.gingerps.net.proto.InvestigationOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
