// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StopServerInfo.proto

package emu.gingerps.net.proto;

public final class StopServerInfoOuterClass {
  private StopServerInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StopServerInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:StopServerInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 stop_begin_time = 1;</code>
     * @return The stopBeginTime.
     */
    int getStopBeginTime();

    /**
     * <code>uint32 stop_end_time = 2;</code>
     * @return The stopEndTime.
     */
    int getStopEndTime();

    /**
     * <code>string url = 3;</code>
     * @return The url.
     */
    java.lang.String getUrl();
    /**
     * <code>string url = 3;</code>
     * @return The bytes for url.
     */
    com.google.protobuf.ByteString
        getUrlBytes();

    /**
     * <code>string content_msg = 4;</code>
     * @return The contentMsg.
     */
    java.lang.String getContentMsg();
    /**
     * <code>string content_msg = 4;</code>
     * @return The bytes for contentMsg.
     */
    com.google.protobuf.ByteString
        getContentMsgBytes();
  }
  /**
   * Protobuf type {@code StopServerInfo}
   */
  public static final class StopServerInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:StopServerInfo)
      StopServerInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StopServerInfo.newBuilder() to construct.
    private StopServerInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StopServerInfo() {
      url_ = "";
      contentMsg_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new StopServerInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private StopServerInfo(
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
            case 8: {

              stopBeginTime_ = input.readUInt32();
              break;
            }
            case 16: {

              stopEndTime_ = input.readUInt32();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              url_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              contentMsg_ = s;
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
      return emu.gingerps.net.proto.StopServerInfoOuterClass.internal_static_StopServerInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.StopServerInfoOuterClass.internal_static_StopServerInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo.class, emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo.Builder.class);
    }

    public static final int STOP_BEGIN_TIME_FIELD_NUMBER = 1;
    private int stopBeginTime_;
    /**
     * <code>uint32 stop_begin_time = 1;</code>
     * @return The stopBeginTime.
     */
    @java.lang.Override
    public int getStopBeginTime() {
      return stopBeginTime_;
    }

    public static final int STOP_END_TIME_FIELD_NUMBER = 2;
    private int stopEndTime_;
    /**
     * <code>uint32 stop_end_time = 2;</code>
     * @return The stopEndTime.
     */
    @java.lang.Override
    public int getStopEndTime() {
      return stopEndTime_;
    }

    public static final int URL_FIELD_NUMBER = 3;
    private volatile java.lang.Object url_;
    /**
     * <code>string url = 3;</code>
     * @return The url.
     */
    @java.lang.Override
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      }
    }
    /**
     * <code>string url = 3;</code>
     * @return The bytes for url.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CONTENT_MSG_FIELD_NUMBER = 4;
    private volatile java.lang.Object contentMsg_;
    /**
     * <code>string content_msg = 4;</code>
     * @return The contentMsg.
     */
    @java.lang.Override
    public java.lang.String getContentMsg() {
      java.lang.Object ref = contentMsg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        contentMsg_ = s;
        return s;
      }
    }
    /**
     * <code>string content_msg = 4;</code>
     * @return The bytes for contentMsg.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getContentMsgBytes() {
      java.lang.Object ref = contentMsg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        contentMsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (stopBeginTime_ != 0) {
        output.writeUInt32(1, stopBeginTime_);
      }
      if (stopEndTime_ != 0) {
        output.writeUInt32(2, stopEndTime_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, url_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contentMsg_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, contentMsg_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (stopBeginTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, stopBeginTime_);
      }
      if (stopEndTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, stopEndTime_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, url_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contentMsg_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, contentMsg_);
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
      if (!(obj instanceof emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo other = (emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo) obj;

      if (getStopBeginTime()
          != other.getStopBeginTime()) return false;
      if (getStopEndTime()
          != other.getStopEndTime()) return false;
      if (!getUrl()
          .equals(other.getUrl())) return false;
      if (!getContentMsg()
          .equals(other.getContentMsg())) return false;
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
      hash = (37 * hash) + STOP_BEGIN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStopBeginTime();
      hash = (37 * hash) + STOP_END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStopEndTime();
      hash = (37 * hash) + URL_FIELD_NUMBER;
      hash = (53 * hash) + getUrl().hashCode();
      hash = (37 * hash) + CONTENT_MSG_FIELD_NUMBER;
      hash = (53 * hash) + getContentMsg().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo prototype) {
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
     * Protobuf type {@code StopServerInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:StopServerInfo)
        emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.StopServerInfoOuterClass.internal_static_StopServerInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.StopServerInfoOuterClass.internal_static_StopServerInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo.class, emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo.newBuilder()
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
        stopBeginTime_ = 0;

        stopEndTime_ = 0;

        url_ = "";

        contentMsg_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.StopServerInfoOuterClass.internal_static_StopServerInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo build() {
        emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo buildPartial() {
        emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo result = new emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo(this);
        result.stopBeginTime_ = stopBeginTime_;
        result.stopEndTime_ = stopEndTime_;
        result.url_ = url_;
        result.contentMsg_ = contentMsg_;
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
        if (other instanceof emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo) {
          return mergeFrom((emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo other) {
        if (other == emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo.getDefaultInstance()) return this;
        if (other.getStopBeginTime() != 0) {
          setStopBeginTime(other.getStopBeginTime());
        }
        if (other.getStopEndTime() != 0) {
          setStopEndTime(other.getStopEndTime());
        }
        if (!other.getUrl().isEmpty()) {
          url_ = other.url_;
          onChanged();
        }
        if (!other.getContentMsg().isEmpty()) {
          contentMsg_ = other.contentMsg_;
          onChanged();
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
        emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int stopBeginTime_ ;
      /**
       * <code>uint32 stop_begin_time = 1;</code>
       * @return The stopBeginTime.
       */
      @java.lang.Override
      public int getStopBeginTime() {
        return stopBeginTime_;
      }
      /**
       * <code>uint32 stop_begin_time = 1;</code>
       * @param value The stopBeginTime to set.
       * @return This builder for chaining.
       */
      public Builder setStopBeginTime(int value) {
        
        stopBeginTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stop_begin_time = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearStopBeginTime() {
        
        stopBeginTime_ = 0;
        onChanged();
        return this;
      }

      private int stopEndTime_ ;
      /**
       * <code>uint32 stop_end_time = 2;</code>
       * @return The stopEndTime.
       */
      @java.lang.Override
      public int getStopEndTime() {
        return stopEndTime_;
      }
      /**
       * <code>uint32 stop_end_time = 2;</code>
       * @param value The stopEndTime to set.
       * @return This builder for chaining.
       */
      public Builder setStopEndTime(int value) {
        
        stopEndTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stop_end_time = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearStopEndTime() {
        
        stopEndTime_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object url_ = "";
      /**
       * <code>string url = 3;</code>
       * @return The url.
       */
      public java.lang.String getUrl() {
        java.lang.Object ref = url_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          url_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string url = 3;</code>
       * @return The bytes for url.
       */
      public com.google.protobuf.ByteString
          getUrlBytes() {
        java.lang.Object ref = url_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          url_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string url = 3;</code>
       * @param value The url to set.
       * @return This builder for chaining.
       */
      public Builder setUrl(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        url_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string url = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUrl() {
        
        url_ = getDefaultInstance().getUrl();
        onChanged();
        return this;
      }
      /**
       * <code>string url = 3;</code>
       * @param value The bytes for url to set.
       * @return This builder for chaining.
       */
      public Builder setUrlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        url_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object contentMsg_ = "";
      /**
       * <code>string content_msg = 4;</code>
       * @return The contentMsg.
       */
      public java.lang.String getContentMsg() {
        java.lang.Object ref = contentMsg_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          contentMsg_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string content_msg = 4;</code>
       * @return The bytes for contentMsg.
       */
      public com.google.protobuf.ByteString
          getContentMsgBytes() {
        java.lang.Object ref = contentMsg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          contentMsg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string content_msg = 4;</code>
       * @param value The contentMsg to set.
       * @return This builder for chaining.
       */
      public Builder setContentMsg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        contentMsg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string content_msg = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearContentMsg() {
        
        contentMsg_ = getDefaultInstance().getContentMsg();
        onChanged();
        return this;
      }
      /**
       * <code>string content_msg = 4;</code>
       * @param value The bytes for contentMsg to set.
       * @return This builder for chaining.
       */
      public Builder setContentMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        contentMsg_ = value;
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


      // @@protoc_insertion_point(builder_scope:StopServerInfo)
    }

    // @@protoc_insertion_point(class_scope:StopServerInfo)
    private static final emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo();
    }

    public static emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StopServerInfo>
        PARSER = new com.google.protobuf.AbstractParser<StopServerInfo>() {
      @java.lang.Override
      public StopServerInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StopServerInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<StopServerInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StopServerInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.StopServerInfoOuterClass.StopServerInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StopServerInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StopServerInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024StopServerInfo.proto\"b\n\016StopServerInfo" +
      "\022\027\n\017stop_begin_time\030\001 \001(\r\022\025\n\rstop_end_ti" +
      "me\030\002 \001(\r\022\013\n\003url\030\003 \001(\t\022\023\n\013content_msg\030\004 \001" +
      "(\tB\030\n\026emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_StopServerInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_StopServerInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StopServerInfo_descriptor,
        new java.lang.String[] { "StopBeginTime", "StopEndTime", "Url", "ContentMsg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
