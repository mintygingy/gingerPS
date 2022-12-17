// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ToTheMoonAddObstacleReq.proto

package emu.gingerps.net.proto;

public final class ToTheMoonAddObstacleReqOuterClass {
  private ToTheMoonAddObstacleReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ToTheMoonAddObstacleReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ToTheMoonAddObstacleReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool use_edge = 7;</code>
     * @return The useEdge.
     */
    boolean getUseEdge();

    /**
     * <code>.ToTheMoonObstacleInfo obstacle = 8;</code>
     * @return Whether the obstacle field is set.
     */
    boolean hasObstacle();
    /**
     * <code>.ToTheMoonObstacleInfo obstacle = 8;</code>
     * @return The obstacle.
     */
    emu.gingerps.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo getObstacle();
    /**
     * <code>.ToTheMoonObstacleInfo obstacle = 8;</code>
     */
    emu.gingerps.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfoOrBuilder getObstacleOrBuilder();

    /**
     * <code>uint32 scene_id = 13;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>int32 query_id = 5;</code>
     * @return The queryId.
     */
    int getQueryId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 6143;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ToTheMoonAddObstacleReq}
   */
  public static final class ToTheMoonAddObstacleReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ToTheMoonAddObstacleReq)
      ToTheMoonAddObstacleReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ToTheMoonAddObstacleReq.newBuilder() to construct.
    private ToTheMoonAddObstacleReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ToTheMoonAddObstacleReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ToTheMoonAddObstacleReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.internal_static_ToTheMoonAddObstacleReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.internal_static_ToTheMoonAddObstacleReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq.class, emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq.Builder.class);
    }

    public static final int USE_EDGE_FIELD_NUMBER = 7;
    private boolean useEdge_ = false;
    /**
     * <code>bool use_edge = 7;</code>
     * @return The useEdge.
     */
    @java.lang.Override
    public boolean getUseEdge() {
      return useEdge_;
    }

    public static final int OBSTACLE_FIELD_NUMBER = 8;
    private emu.gingerps.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo obstacle_;
    /**
     * <code>.ToTheMoonObstacleInfo obstacle = 8;</code>
     * @return Whether the obstacle field is set.
     */
    @java.lang.Override
    public boolean hasObstacle() {
      return obstacle_ != null;
    }
    /**
     * <code>.ToTheMoonObstacleInfo obstacle = 8;</code>
     * @return The obstacle.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo getObstacle() {
      return obstacle_ == null ? emu.gingerps.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.getDefaultInstance() : obstacle_;
    }
    /**
     * <code>.ToTheMoonObstacleInfo obstacle = 8;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfoOrBuilder getObstacleOrBuilder() {
      return obstacle_ == null ? emu.gingerps.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.getDefaultInstance() : obstacle_;
    }

    public static final int SCENE_ID_FIELD_NUMBER = 13;
    private int sceneId_ = 0;
    /**
     * <code>uint32 scene_id = 13;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int QUERY_ID_FIELD_NUMBER = 5;
    private int queryId_ = 0;
    /**
     * <code>int32 query_id = 5;</code>
     * @return The queryId.
     */
    @java.lang.Override
    public int getQueryId() {
      return queryId_;
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
      if (queryId_ != 0) {
        output.writeInt32(5, queryId_);
      }
      if (useEdge_ != false) {
        output.writeBool(7, useEdge_);
      }
      if (obstacle_ != null) {
        output.writeMessage(8, getObstacle());
      }
      if (sceneId_ != 0) {
        output.writeUInt32(13, sceneId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (queryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, queryId_);
      }
      if (useEdge_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, useEdge_);
      }
      if (obstacle_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, getObstacle());
      }
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, sceneId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq other = (emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq) obj;

      if (getUseEdge()
          != other.getUseEdge()) return false;
      if (hasObstacle() != other.hasObstacle()) return false;
      if (hasObstacle()) {
        if (!getObstacle()
            .equals(other.getObstacle())) return false;
      }
      if (getSceneId()
          != other.getSceneId()) return false;
      if (getQueryId()
          != other.getQueryId()) return false;
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
      hash = (37 * hash) + USE_EDGE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUseEdge());
      if (hasObstacle()) {
        hash = (37 * hash) + OBSTACLE_FIELD_NUMBER;
        hash = (53 * hash) + getObstacle().hashCode();
      }
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (37 * hash) + QUERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getQueryId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq prototype) {
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
     *   CMD_ID = 6143;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ToTheMoonAddObstacleReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ToTheMoonAddObstacleReq)
        emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.internal_static_ToTheMoonAddObstacleReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.internal_static_ToTheMoonAddObstacleReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq.class, emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq.newBuilder()
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
        useEdge_ = false;
        obstacle_ = null;
        if (obstacleBuilder_ != null) {
          obstacleBuilder_.dispose();
          obstacleBuilder_ = null;
        }
        sceneId_ = 0;
        queryId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.internal_static_ToTheMoonAddObstacleReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq build() {
        emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq buildPartial() {
        emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq result = new emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.useEdge_ = useEdge_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.obstacle_ = obstacleBuilder_ == null
              ? obstacle_
              : obstacleBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.sceneId_ = sceneId_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.queryId_ = queryId_;
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
        if (other instanceof emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq) {
          return mergeFrom((emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq other) {
        if (other == emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq.getDefaultInstance()) return this;
        if (other.getUseEdge() != false) {
          setUseEdge(other.getUseEdge());
        }
        if (other.hasObstacle()) {
          mergeObstacle(other.getObstacle());
        }
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (other.getQueryId() != 0) {
          setQueryId(other.getQueryId());
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
              case 40: {
                queryId_ = input.readInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 40
              case 56: {
                useEdge_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 56
              case 66: {
                input.readMessage(
                    getObstacleFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 66
              case 104: {
                sceneId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 104
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

      private boolean useEdge_ ;
      /**
       * <code>bool use_edge = 7;</code>
       * @return The useEdge.
       */
      @java.lang.Override
      public boolean getUseEdge() {
        return useEdge_;
      }
      /**
       * <code>bool use_edge = 7;</code>
       * @param value The useEdge to set.
       * @return This builder for chaining.
       */
      public Builder setUseEdge(boolean value) {
        
        useEdge_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool use_edge = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUseEdge() {
        bitField0_ = (bitField0_ & ~0x00000001);
        useEdge_ = false;
        onChanged();
        return this;
      }

      private emu.gingerps.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo obstacle_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo, emu.gingerps.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.Builder, emu.gingerps.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfoOrBuilder> obstacleBuilder_;
      /**
       * <code>.ToTheMoonObstacleInfo obstacle = 8;</code>
       * @return Whether the obstacle field is set.
       */
      public boolean hasObstacle() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.ToTheMoonObstacleInfo obstacle = 8;</code>
       * @return The obstacle.
       */
      public emu.gingerps.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo getObstacle() {
        if (obstacleBuilder_ == null) {
          return obstacle_ == null ? emu.gingerps.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.getDefaultInstance() : obstacle_;
        } else {
          return obstacleBuilder_.getMessage();
        }
      }
      /**
       * <code>.ToTheMoonObstacleInfo obstacle = 8;</code>
       */
      public Builder setObstacle(emu.gingerps.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo value) {
        if (obstacleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          obstacle_ = value;
        } else {
          obstacleBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.ToTheMoonObstacleInfo obstacle = 8;</code>
       */
      public Builder setObstacle(
          emu.gingerps.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.Builder builderForValue) {
        if (obstacleBuilder_ == null) {
          obstacle_ = builderForValue.build();
        } else {
          obstacleBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.ToTheMoonObstacleInfo obstacle = 8;</code>
       */
      public Builder mergeObstacle(emu.gingerps.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo value) {
        if (obstacleBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            obstacle_ != null &&
            obstacle_ != emu.gingerps.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.getDefaultInstance()) {
            getObstacleBuilder().mergeFrom(value);
          } else {
            obstacle_ = value;
          }
        } else {
          obstacleBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.ToTheMoonObstacleInfo obstacle = 8;</code>
       */
      public Builder clearObstacle() {
        bitField0_ = (bitField0_ & ~0x00000002);
        obstacle_ = null;
        if (obstacleBuilder_ != null) {
          obstacleBuilder_.dispose();
          obstacleBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.ToTheMoonObstacleInfo obstacle = 8;</code>
       */
      public emu.gingerps.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.Builder getObstacleBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getObstacleFieldBuilder().getBuilder();
      }
      /**
       * <code>.ToTheMoonObstacleInfo obstacle = 8;</code>
       */
      public emu.gingerps.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfoOrBuilder getObstacleOrBuilder() {
        if (obstacleBuilder_ != null) {
          return obstacleBuilder_.getMessageOrBuilder();
        } else {
          return obstacle_ == null ?
              emu.gingerps.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.getDefaultInstance() : obstacle_;
        }
      }
      /**
       * <code>.ToTheMoonObstacleInfo obstacle = 8;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo, emu.gingerps.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.Builder, emu.gingerps.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfoOrBuilder> 
          getObstacleFieldBuilder() {
        if (obstacleBuilder_ == null) {
          obstacleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo, emu.gingerps.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.Builder, emu.gingerps.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfoOrBuilder>(
                  getObstacle(),
                  getParentForChildren(),
                  isClean());
          obstacle_ = null;
        }
        return obstacleBuilder_;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 13;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 13;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private int queryId_ ;
      /**
       * <code>int32 query_id = 5;</code>
       * @return The queryId.
       */
      @java.lang.Override
      public int getQueryId() {
        return queryId_;
      }
      /**
       * <code>int32 query_id = 5;</code>
       * @param value The queryId to set.
       * @return This builder for chaining.
       */
      public Builder setQueryId(int value) {
        
        queryId_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>int32 query_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearQueryId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        queryId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ToTheMoonAddObstacleReq)
    }

    // @@protoc_insertion_point(class_scope:ToTheMoonAddObstacleReq)
    private static final emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq();
    }

    public static emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ToTheMoonAddObstacleReq>
        PARSER = new com.google.protobuf.AbstractParser<ToTheMoonAddObstacleReq>() {
      @java.lang.Override
      public ToTheMoonAddObstacleReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<ToTheMoonAddObstacleReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ToTheMoonAddObstacleReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ToTheMoonAddObstacleReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ToTheMoonAddObstacleReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035ToTheMoonAddObstacleReq.proto\032\033ToTheMo" +
      "onObstacleInfo.proto\"y\n\027ToTheMoonAddObst" +
      "acleReq\022\020\n\010use_edge\030\007 \001(\010\022(\n\010obstacle\030\010 " +
      "\001(\0132\026.ToTheMoonObstacleInfo\022\020\n\010scene_id\030" +
      "\r \001(\r\022\020\n\010query_id\030\005 \001(\005B\030\n\026emu.gingerps." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.ToTheMoonObstacleInfoOuterClass.getDescriptor(),
        });
    internal_static_ToTheMoonAddObstacleReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ToTheMoonAddObstacleReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ToTheMoonAddObstacleReq_descriptor,
        new java.lang.String[] { "UseEdge", "Obstacle", "SceneId", "QueryId", });
    emu.gingerps.net.proto.ToTheMoonObstacleInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
