// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WidgetGadgetAllDataNotify.proto

package emu.gingerps.net.proto;

public final class WidgetGadgetAllDataNotifyOuterClass {
  private WidgetGadgetAllDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WidgetGadgetAllDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WidgetGadgetAllDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .WidgetGadgetData widget_gadget_data = 1;</code>
     */
    java.util.List<emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData> 
        getWidgetGadgetDataList();
    /**
     * <code>repeated .WidgetGadgetData widget_gadget_data = 1;</code>
     */
    emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData getWidgetGadgetData(int index);
    /**
     * <code>repeated .WidgetGadgetData widget_gadget_data = 1;</code>
     */
    int getWidgetGadgetDataCount();
    /**
     * <code>repeated .WidgetGadgetData widget_gadget_data = 1;</code>
     */
    java.util.List<? extends emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder> 
        getWidgetGadgetDataOrBuilderList();
    /**
     * <code>repeated .WidgetGadgetData widget_gadget_data = 1;</code>
     */
    emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder getWidgetGadgetDataOrBuilder(
        int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4288;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code WidgetGadgetAllDataNotify}
   */
  public static final class WidgetGadgetAllDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WidgetGadgetAllDataNotify)
      WidgetGadgetAllDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WidgetGadgetAllDataNotify.newBuilder() to construct.
    private WidgetGadgetAllDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WidgetGadgetAllDataNotify() {
      widgetGadgetData_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WidgetGadgetAllDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WidgetGadgetAllDataNotify(
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
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                widgetGadgetData_ = new java.util.ArrayList<emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData>();
                mutable_bitField0_ |= 0x00000001;
              }
              widgetGadgetData_.add(
                  input.readMessage(emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.parser(), extensionRegistry));
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
          widgetGadgetData_ = java.util.Collections.unmodifiableList(widgetGadgetData_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.internal_static_WidgetGadgetAllDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.internal_static_WidgetGadgetAllDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify.class, emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify.Builder.class);
    }

    public static final int WIDGET_GADGET_DATA_FIELD_NUMBER = 1;
    private java.util.List<emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData> widgetGadgetData_;
    /**
     * <code>repeated .WidgetGadgetData widget_gadget_data = 1;</code>
     */
    @java.lang.Override
    public java.util.List<emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData> getWidgetGadgetDataList() {
      return widgetGadgetData_;
    }
    /**
     * <code>repeated .WidgetGadgetData widget_gadget_data = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder> 
        getWidgetGadgetDataOrBuilderList() {
      return widgetGadgetData_;
    }
    /**
     * <code>repeated .WidgetGadgetData widget_gadget_data = 1;</code>
     */
    @java.lang.Override
    public int getWidgetGadgetDataCount() {
      return widgetGadgetData_.size();
    }
    /**
     * <code>repeated .WidgetGadgetData widget_gadget_data = 1;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData getWidgetGadgetData(int index) {
      return widgetGadgetData_.get(index);
    }
    /**
     * <code>repeated .WidgetGadgetData widget_gadget_data = 1;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder getWidgetGadgetDataOrBuilder(
        int index) {
      return widgetGadgetData_.get(index);
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
      for (int i = 0; i < widgetGadgetData_.size(); i++) {
        output.writeMessage(1, widgetGadgetData_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < widgetGadgetData_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, widgetGadgetData_.get(i));
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
      if (!(obj instanceof emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify other = (emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify) obj;

      if (!getWidgetGadgetDataList()
          .equals(other.getWidgetGadgetDataList())) return false;
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
      if (getWidgetGadgetDataCount() > 0) {
        hash = (37 * hash) + WIDGET_GADGET_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getWidgetGadgetDataList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify prototype) {
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
     *   CMD_ID = 4288;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code WidgetGadgetAllDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WidgetGadgetAllDataNotify)
        emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.internal_static_WidgetGadgetAllDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.internal_static_WidgetGadgetAllDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify.class, emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify.newBuilder()
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
          getWidgetGadgetDataFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (widgetGadgetDataBuilder_ == null) {
          widgetGadgetData_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          widgetGadgetDataBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.internal_static_WidgetGadgetAllDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify build() {
        emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify buildPartial() {
        emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify result = new emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify(this);
        int from_bitField0_ = bitField0_;
        if (widgetGadgetDataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            widgetGadgetData_ = java.util.Collections.unmodifiableList(widgetGadgetData_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.widgetGadgetData_ = widgetGadgetData_;
        } else {
          result.widgetGadgetData_ = widgetGadgetDataBuilder_.build();
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
        if (other instanceof emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify) {
          return mergeFrom((emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify other) {
        if (other == emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify.getDefaultInstance()) return this;
        if (widgetGadgetDataBuilder_ == null) {
          if (!other.widgetGadgetData_.isEmpty()) {
            if (widgetGadgetData_.isEmpty()) {
              widgetGadgetData_ = other.widgetGadgetData_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureWidgetGadgetDataIsMutable();
              widgetGadgetData_.addAll(other.widgetGadgetData_);
            }
            onChanged();
          }
        } else {
          if (!other.widgetGadgetData_.isEmpty()) {
            if (widgetGadgetDataBuilder_.isEmpty()) {
              widgetGadgetDataBuilder_.dispose();
              widgetGadgetDataBuilder_ = null;
              widgetGadgetData_ = other.widgetGadgetData_;
              bitField0_ = (bitField0_ & ~0x00000001);
              widgetGadgetDataBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getWidgetGadgetDataFieldBuilder() : null;
            } else {
              widgetGadgetDataBuilder_.addAllMessages(other.widgetGadgetData_);
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
        emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData> widgetGadgetData_ =
        java.util.Collections.emptyList();
      private void ensureWidgetGadgetDataIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          widgetGadgetData_ = new java.util.ArrayList<emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData>(widgetGadgetData_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData, emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.Builder, emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder> widgetGadgetDataBuilder_;

      /**
       * <code>repeated .WidgetGadgetData widget_gadget_data = 1;</code>
       */
      public java.util.List<emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData> getWidgetGadgetDataList() {
        if (widgetGadgetDataBuilder_ == null) {
          return java.util.Collections.unmodifiableList(widgetGadgetData_);
        } else {
          return widgetGadgetDataBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .WidgetGadgetData widget_gadget_data = 1;</code>
       */
      public int getWidgetGadgetDataCount() {
        if (widgetGadgetDataBuilder_ == null) {
          return widgetGadgetData_.size();
        } else {
          return widgetGadgetDataBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .WidgetGadgetData widget_gadget_data = 1;</code>
       */
      public emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData getWidgetGadgetData(int index) {
        if (widgetGadgetDataBuilder_ == null) {
          return widgetGadgetData_.get(index);
        } else {
          return widgetGadgetDataBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .WidgetGadgetData widget_gadget_data = 1;</code>
       */
      public Builder setWidgetGadgetData(
          int index, emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData value) {
        if (widgetGadgetDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWidgetGadgetDataIsMutable();
          widgetGadgetData_.set(index, value);
          onChanged();
        } else {
          widgetGadgetDataBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .WidgetGadgetData widget_gadget_data = 1;</code>
       */
      public Builder setWidgetGadgetData(
          int index, emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.Builder builderForValue) {
        if (widgetGadgetDataBuilder_ == null) {
          ensureWidgetGadgetDataIsMutable();
          widgetGadgetData_.set(index, builderForValue.build());
          onChanged();
        } else {
          widgetGadgetDataBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WidgetGadgetData widget_gadget_data = 1;</code>
       */
      public Builder addWidgetGadgetData(emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData value) {
        if (widgetGadgetDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWidgetGadgetDataIsMutable();
          widgetGadgetData_.add(value);
          onChanged();
        } else {
          widgetGadgetDataBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .WidgetGadgetData widget_gadget_data = 1;</code>
       */
      public Builder addWidgetGadgetData(
          int index, emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData value) {
        if (widgetGadgetDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWidgetGadgetDataIsMutable();
          widgetGadgetData_.add(index, value);
          onChanged();
        } else {
          widgetGadgetDataBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .WidgetGadgetData widget_gadget_data = 1;</code>
       */
      public Builder addWidgetGadgetData(
          emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.Builder builderForValue) {
        if (widgetGadgetDataBuilder_ == null) {
          ensureWidgetGadgetDataIsMutable();
          widgetGadgetData_.add(builderForValue.build());
          onChanged();
        } else {
          widgetGadgetDataBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WidgetGadgetData widget_gadget_data = 1;</code>
       */
      public Builder addWidgetGadgetData(
          int index, emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.Builder builderForValue) {
        if (widgetGadgetDataBuilder_ == null) {
          ensureWidgetGadgetDataIsMutable();
          widgetGadgetData_.add(index, builderForValue.build());
          onChanged();
        } else {
          widgetGadgetDataBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WidgetGadgetData widget_gadget_data = 1;</code>
       */
      public Builder addAllWidgetGadgetData(
          java.lang.Iterable<? extends emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData> values) {
        if (widgetGadgetDataBuilder_ == null) {
          ensureWidgetGadgetDataIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, widgetGadgetData_);
          onChanged();
        } else {
          widgetGadgetDataBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .WidgetGadgetData widget_gadget_data = 1;</code>
       */
      public Builder clearWidgetGadgetData() {
        if (widgetGadgetDataBuilder_ == null) {
          widgetGadgetData_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          widgetGadgetDataBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .WidgetGadgetData widget_gadget_data = 1;</code>
       */
      public Builder removeWidgetGadgetData(int index) {
        if (widgetGadgetDataBuilder_ == null) {
          ensureWidgetGadgetDataIsMutable();
          widgetGadgetData_.remove(index);
          onChanged();
        } else {
          widgetGadgetDataBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .WidgetGadgetData widget_gadget_data = 1;</code>
       */
      public emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.Builder getWidgetGadgetDataBuilder(
          int index) {
        return getWidgetGadgetDataFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .WidgetGadgetData widget_gadget_data = 1;</code>
       */
      public emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder getWidgetGadgetDataOrBuilder(
          int index) {
        if (widgetGadgetDataBuilder_ == null) {
          return widgetGadgetData_.get(index);  } else {
          return widgetGadgetDataBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .WidgetGadgetData widget_gadget_data = 1;</code>
       */
      public java.util.List<? extends emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder> 
           getWidgetGadgetDataOrBuilderList() {
        if (widgetGadgetDataBuilder_ != null) {
          return widgetGadgetDataBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(widgetGadgetData_);
        }
      }
      /**
       * <code>repeated .WidgetGadgetData widget_gadget_data = 1;</code>
       */
      public emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.Builder addWidgetGadgetDataBuilder() {
        return getWidgetGadgetDataFieldBuilder().addBuilder(
            emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.getDefaultInstance());
      }
      /**
       * <code>repeated .WidgetGadgetData widget_gadget_data = 1;</code>
       */
      public emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.Builder addWidgetGadgetDataBuilder(
          int index) {
        return getWidgetGadgetDataFieldBuilder().addBuilder(
            index, emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.getDefaultInstance());
      }
      /**
       * <code>repeated .WidgetGadgetData widget_gadget_data = 1;</code>
       */
      public java.util.List<emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.Builder> 
           getWidgetGadgetDataBuilderList() {
        return getWidgetGadgetDataFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData, emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.Builder, emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder> 
          getWidgetGadgetDataFieldBuilder() {
        if (widgetGadgetDataBuilder_ == null) {
          widgetGadgetDataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData, emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.Builder, emu.gingerps.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder>(
                  widgetGadgetData_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          widgetGadgetData_ = null;
        }
        return widgetGadgetDataBuilder_;
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


      // @@protoc_insertion_point(builder_scope:WidgetGadgetAllDataNotify)
    }

    // @@protoc_insertion_point(class_scope:WidgetGadgetAllDataNotify)
    private static final emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify();
    }

    public static emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WidgetGadgetAllDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<WidgetGadgetAllDataNotify>() {
      @java.lang.Override
      public WidgetGadgetAllDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WidgetGadgetAllDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WidgetGadgetAllDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WidgetGadgetAllDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WidgetGadgetAllDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WidgetGadgetAllDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037WidgetGadgetAllDataNotify.proto\032\026Widge" +
      "tGadgetData.proto\"J\n\031WidgetGadgetAllData" +
      "Notify\022-\n\022widget_gadget_data\030\001 \003(\0132\021.Wid" +
      "getGadgetDataB\033\n\031emu.gingerps.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.WidgetGadgetDataOuterClass.getDescriptor(),
        });
    internal_static_WidgetGadgetAllDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WidgetGadgetAllDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WidgetGadgetAllDataNotify_descriptor,
        new java.lang.String[] { "WidgetGadgetData", });
    emu.gingerps.net.proto.WidgetGadgetDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
