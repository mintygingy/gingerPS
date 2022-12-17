// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGChangeOnstageInfo.proto

package emu.gingerps.net.proto;

public final class GCGChangeOnstageInfoOuterClass {
  private GCGChangeOnstageInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGChangeOnstageInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGChangeOnstageInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_quick = 11;</code>
     * @return The isQuick.
     */
    boolean getIsQuick();

    /**
     * <code>uint32 card_guid = 6;</code>
     * @return The cardGuid.
     */
    int getCardGuid();

    /**
     * <code>.GCGSkillPreviewInfo change_onstage_preview_info = 5;</code>
     * @return Whether the changeOnstagePreviewInfo field is set.
     */
    boolean hasChangeOnstagePreviewInfo();
    /**
     * <code>.GCGSkillPreviewInfo change_onstage_preview_info = 5;</code>
     * @return The changeOnstagePreviewInfo.
     */
    emu.gingerps.net.proto.GCGSkillPreviewInfoOuterClass.GCGSkillPreviewInfo getChangeOnstagePreviewInfo();
    /**
     * <code>.GCGSkillPreviewInfo change_onstage_preview_info = 5;</code>
     */
    emu.gingerps.net.proto.GCGSkillPreviewInfoOuterClass.GCGSkillPreviewInfoOrBuilder getChangeOnstagePreviewInfoOrBuilder();
  }
  /**
   * Protobuf type {@code GCGChangeOnstageInfo}
   */
  public static final class GCGChangeOnstageInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGChangeOnstageInfo)
      GCGChangeOnstageInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGChangeOnstageInfo.newBuilder() to construct.
    private GCGChangeOnstageInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGChangeOnstageInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGChangeOnstageInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGChangeOnstageInfo(
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
            case 42: {
              emu.gingerps.net.proto.GCGSkillPreviewInfoOuterClass.GCGSkillPreviewInfo.Builder subBuilder = null;
              if (changeOnstagePreviewInfo_ != null) {
                subBuilder = changeOnstagePreviewInfo_.toBuilder();
              }
              changeOnstagePreviewInfo_ = input.readMessage(emu.gingerps.net.proto.GCGSkillPreviewInfoOuterClass.GCGSkillPreviewInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(changeOnstagePreviewInfo_);
                changeOnstagePreviewInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 48: {

              cardGuid_ = input.readUInt32();
              break;
            }
            case 88: {

              isQuick_ = input.readBool();
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
      return emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.internal_static_GCGChangeOnstageInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.internal_static_GCGChangeOnstageInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo.class, emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo.Builder.class);
    }

    public static final int IS_QUICK_FIELD_NUMBER = 11;
    private boolean isQuick_;
    /**
     * <code>bool is_quick = 11;</code>
     * @return The isQuick.
     */
    @java.lang.Override
    public boolean getIsQuick() {
      return isQuick_;
    }

    public static final int CARD_GUID_FIELD_NUMBER = 6;
    private int cardGuid_;
    /**
     * <code>uint32 card_guid = 6;</code>
     * @return The cardGuid.
     */
    @java.lang.Override
    public int getCardGuid() {
      return cardGuid_;
    }

    public static final int CHANGE_ONSTAGE_PREVIEW_INFO_FIELD_NUMBER = 5;
    private emu.gingerps.net.proto.GCGSkillPreviewInfoOuterClass.GCGSkillPreviewInfo changeOnstagePreviewInfo_;
    /**
     * <code>.GCGSkillPreviewInfo change_onstage_preview_info = 5;</code>
     * @return Whether the changeOnstagePreviewInfo field is set.
     */
    @java.lang.Override
    public boolean hasChangeOnstagePreviewInfo() {
      return changeOnstagePreviewInfo_ != null;
    }
    /**
     * <code>.GCGSkillPreviewInfo change_onstage_preview_info = 5;</code>
     * @return The changeOnstagePreviewInfo.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.GCGSkillPreviewInfoOuterClass.GCGSkillPreviewInfo getChangeOnstagePreviewInfo() {
      return changeOnstagePreviewInfo_ == null ? emu.gingerps.net.proto.GCGSkillPreviewInfoOuterClass.GCGSkillPreviewInfo.getDefaultInstance() : changeOnstagePreviewInfo_;
    }
    /**
     * <code>.GCGSkillPreviewInfo change_onstage_preview_info = 5;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.GCGSkillPreviewInfoOuterClass.GCGSkillPreviewInfoOrBuilder getChangeOnstagePreviewInfoOrBuilder() {
      return getChangeOnstagePreviewInfo();
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
      if (changeOnstagePreviewInfo_ != null) {
        output.writeMessage(5, getChangeOnstagePreviewInfo());
      }
      if (cardGuid_ != 0) {
        output.writeUInt32(6, cardGuid_);
      }
      if (isQuick_ != false) {
        output.writeBool(11, isQuick_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (changeOnstagePreviewInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getChangeOnstagePreviewInfo());
      }
      if (cardGuid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, cardGuid_);
      }
      if (isQuick_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, isQuick_);
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
      if (!(obj instanceof emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo other = (emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo) obj;

      if (getIsQuick()
          != other.getIsQuick()) return false;
      if (getCardGuid()
          != other.getCardGuid()) return false;
      if (hasChangeOnstagePreviewInfo() != other.hasChangeOnstagePreviewInfo()) return false;
      if (hasChangeOnstagePreviewInfo()) {
        if (!getChangeOnstagePreviewInfo()
            .equals(other.getChangeOnstagePreviewInfo())) return false;
      }
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
      hash = (37 * hash) + IS_QUICK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsQuick());
      hash = (37 * hash) + CARD_GUID_FIELD_NUMBER;
      hash = (53 * hash) + getCardGuid();
      if (hasChangeOnstagePreviewInfo()) {
        hash = (37 * hash) + CHANGE_ONSTAGE_PREVIEW_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getChangeOnstagePreviewInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo prototype) {
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
     * Protobuf type {@code GCGChangeOnstageInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGChangeOnstageInfo)
        emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.internal_static_GCGChangeOnstageInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.internal_static_GCGChangeOnstageInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo.class, emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo.newBuilder()
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
        isQuick_ = false;

        cardGuid_ = 0;

        if (changeOnstagePreviewInfoBuilder_ == null) {
          changeOnstagePreviewInfo_ = null;
        } else {
          changeOnstagePreviewInfo_ = null;
          changeOnstagePreviewInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.internal_static_GCGChangeOnstageInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo build() {
        emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo buildPartial() {
        emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo result = new emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo(this);
        result.isQuick_ = isQuick_;
        result.cardGuid_ = cardGuid_;
        if (changeOnstagePreviewInfoBuilder_ == null) {
          result.changeOnstagePreviewInfo_ = changeOnstagePreviewInfo_;
        } else {
          result.changeOnstagePreviewInfo_ = changeOnstagePreviewInfoBuilder_.build();
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
        if (other instanceof emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo) {
          return mergeFrom((emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo other) {
        if (other == emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo.getDefaultInstance()) return this;
        if (other.getIsQuick() != false) {
          setIsQuick(other.getIsQuick());
        }
        if (other.getCardGuid() != 0) {
          setCardGuid(other.getCardGuid());
        }
        if (other.hasChangeOnstagePreviewInfo()) {
          mergeChangeOnstagePreviewInfo(other.getChangeOnstagePreviewInfo());
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
        emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isQuick_ ;
      /**
       * <code>bool is_quick = 11;</code>
       * @return The isQuick.
       */
      @java.lang.Override
      public boolean getIsQuick() {
        return isQuick_;
      }
      /**
       * <code>bool is_quick = 11;</code>
       * @param value The isQuick to set.
       * @return This builder for chaining.
       */
      public Builder setIsQuick(boolean value) {
        
        isQuick_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_quick = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsQuick() {
        
        isQuick_ = false;
        onChanged();
        return this;
      }

      private int cardGuid_ ;
      /**
       * <code>uint32 card_guid = 6;</code>
       * @return The cardGuid.
       */
      @java.lang.Override
      public int getCardGuid() {
        return cardGuid_;
      }
      /**
       * <code>uint32 card_guid = 6;</code>
       * @param value The cardGuid to set.
       * @return This builder for chaining.
       */
      public Builder setCardGuid(int value) {
        
        cardGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_guid = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardGuid() {
        
        cardGuid_ = 0;
        onChanged();
        return this;
      }

      private emu.gingerps.net.proto.GCGSkillPreviewInfoOuterClass.GCGSkillPreviewInfo changeOnstagePreviewInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.GCGSkillPreviewInfoOuterClass.GCGSkillPreviewInfo, emu.gingerps.net.proto.GCGSkillPreviewInfoOuterClass.GCGSkillPreviewInfo.Builder, emu.gingerps.net.proto.GCGSkillPreviewInfoOuterClass.GCGSkillPreviewInfoOrBuilder> changeOnstagePreviewInfoBuilder_;
      /**
       * <code>.GCGSkillPreviewInfo change_onstage_preview_info = 5;</code>
       * @return Whether the changeOnstagePreviewInfo field is set.
       */
      public boolean hasChangeOnstagePreviewInfo() {
        return changeOnstagePreviewInfoBuilder_ != null || changeOnstagePreviewInfo_ != null;
      }
      /**
       * <code>.GCGSkillPreviewInfo change_onstage_preview_info = 5;</code>
       * @return The changeOnstagePreviewInfo.
       */
      public emu.gingerps.net.proto.GCGSkillPreviewInfoOuterClass.GCGSkillPreviewInfo getChangeOnstagePreviewInfo() {
        if (changeOnstagePreviewInfoBuilder_ == null) {
          return changeOnstagePreviewInfo_ == null ? emu.gingerps.net.proto.GCGSkillPreviewInfoOuterClass.GCGSkillPreviewInfo.getDefaultInstance() : changeOnstagePreviewInfo_;
        } else {
          return changeOnstagePreviewInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.GCGSkillPreviewInfo change_onstage_preview_info = 5;</code>
       */
      public Builder setChangeOnstagePreviewInfo(emu.gingerps.net.proto.GCGSkillPreviewInfoOuterClass.GCGSkillPreviewInfo value) {
        if (changeOnstagePreviewInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          changeOnstagePreviewInfo_ = value;
          onChanged();
        } else {
          changeOnstagePreviewInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.GCGSkillPreviewInfo change_onstage_preview_info = 5;</code>
       */
      public Builder setChangeOnstagePreviewInfo(
          emu.gingerps.net.proto.GCGSkillPreviewInfoOuterClass.GCGSkillPreviewInfo.Builder builderForValue) {
        if (changeOnstagePreviewInfoBuilder_ == null) {
          changeOnstagePreviewInfo_ = builderForValue.build();
          onChanged();
        } else {
          changeOnstagePreviewInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.GCGSkillPreviewInfo change_onstage_preview_info = 5;</code>
       */
      public Builder mergeChangeOnstagePreviewInfo(emu.gingerps.net.proto.GCGSkillPreviewInfoOuterClass.GCGSkillPreviewInfo value) {
        if (changeOnstagePreviewInfoBuilder_ == null) {
          if (changeOnstagePreviewInfo_ != null) {
            changeOnstagePreviewInfo_ =
              emu.gingerps.net.proto.GCGSkillPreviewInfoOuterClass.GCGSkillPreviewInfo.newBuilder(changeOnstagePreviewInfo_).mergeFrom(value).buildPartial();
          } else {
            changeOnstagePreviewInfo_ = value;
          }
          onChanged();
        } else {
          changeOnstagePreviewInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.GCGSkillPreviewInfo change_onstage_preview_info = 5;</code>
       */
      public Builder clearChangeOnstagePreviewInfo() {
        if (changeOnstagePreviewInfoBuilder_ == null) {
          changeOnstagePreviewInfo_ = null;
          onChanged();
        } else {
          changeOnstagePreviewInfo_ = null;
          changeOnstagePreviewInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.GCGSkillPreviewInfo change_onstage_preview_info = 5;</code>
       */
      public emu.gingerps.net.proto.GCGSkillPreviewInfoOuterClass.GCGSkillPreviewInfo.Builder getChangeOnstagePreviewInfoBuilder() {
        
        onChanged();
        return getChangeOnstagePreviewInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.GCGSkillPreviewInfo change_onstage_preview_info = 5;</code>
       */
      public emu.gingerps.net.proto.GCGSkillPreviewInfoOuterClass.GCGSkillPreviewInfoOrBuilder getChangeOnstagePreviewInfoOrBuilder() {
        if (changeOnstagePreviewInfoBuilder_ != null) {
          return changeOnstagePreviewInfoBuilder_.getMessageOrBuilder();
        } else {
          return changeOnstagePreviewInfo_ == null ?
              emu.gingerps.net.proto.GCGSkillPreviewInfoOuterClass.GCGSkillPreviewInfo.getDefaultInstance() : changeOnstagePreviewInfo_;
        }
      }
      /**
       * <code>.GCGSkillPreviewInfo change_onstage_preview_info = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.GCGSkillPreviewInfoOuterClass.GCGSkillPreviewInfo, emu.gingerps.net.proto.GCGSkillPreviewInfoOuterClass.GCGSkillPreviewInfo.Builder, emu.gingerps.net.proto.GCGSkillPreviewInfoOuterClass.GCGSkillPreviewInfoOrBuilder> 
          getChangeOnstagePreviewInfoFieldBuilder() {
        if (changeOnstagePreviewInfoBuilder_ == null) {
          changeOnstagePreviewInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.GCGSkillPreviewInfoOuterClass.GCGSkillPreviewInfo, emu.gingerps.net.proto.GCGSkillPreviewInfoOuterClass.GCGSkillPreviewInfo.Builder, emu.gingerps.net.proto.GCGSkillPreviewInfoOuterClass.GCGSkillPreviewInfoOrBuilder>(
                  getChangeOnstagePreviewInfo(),
                  getParentForChildren(),
                  isClean());
          changeOnstagePreviewInfo_ = null;
        }
        return changeOnstagePreviewInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GCGChangeOnstageInfo)
    }

    // @@protoc_insertion_point(class_scope:GCGChangeOnstageInfo)
    private static final emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo();
    }

    public static emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGChangeOnstageInfo>
        PARSER = new com.google.protobuf.AbstractParser<GCGChangeOnstageInfo>() {
      @java.lang.Override
      public GCGChangeOnstageInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGChangeOnstageInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGChangeOnstageInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGChangeOnstageInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGChangeOnstageInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGChangeOnstageInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032GCGChangeOnstageInfo.proto\032\031GCGSkillPr" +
      "eviewInfo.proto\"v\n\024GCGChangeOnstageInfo\022" +
      "\020\n\010is_quick\030\013 \001(\010\022\021\n\tcard_guid\030\006 \001(\r\0229\n\033" +
      "change_onstage_preview_info\030\005 \001(\0132\024.GCGS" +
      "killPreviewInfoB\030\n\026emu.gingerps.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.GCGSkillPreviewInfoOuterClass.getDescriptor(),
        });
    internal_static_GCGChangeOnstageInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGChangeOnstageInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGChangeOnstageInfo_descriptor,
        new java.lang.String[] { "IsQuick", "CardGuid", "ChangeOnstagePreviewInfo", });
    emu.gingerps.net.proto.GCGSkillPreviewInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
