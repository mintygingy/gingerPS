// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GMShowNavMeshReq.proto

package emu.gingerps.net.proto;

public final class GMShowNavMeshReqOuterClass {
  private GMShowNavMeshReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GMShowNavMeshReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GMShowNavMeshReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector extent = 3;</code>
     * @return Whether the extent field is set.
     */
    boolean hasExtent();
    /**
     * <code>.Vector extent = 3;</code>
     * @return The extent.
     */
    emu.gingerps.net.proto.VectorOuterClass.Vector getExtent();
    /**
     * <code>.Vector extent = 3;</code>
     */
    emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getExtentOrBuilder();

    /**
     * <code>.Vector center = 4;</code>
     * @return Whether the center field is set.
     */
    boolean hasCenter();
    /**
     * <code>.Vector center = 4;</code>
     * @return The center.
     */
    emu.gingerps.net.proto.VectorOuterClass.Vector getCenter();
    /**
     * <code>.Vector center = 4;</code>
     */
    emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getCenterOrBuilder();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 2363;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GMShowNavMeshReq}
   */
  public static final class GMShowNavMeshReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GMShowNavMeshReq)
      GMShowNavMeshReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GMShowNavMeshReq.newBuilder() to construct.
    private GMShowNavMeshReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GMShowNavMeshReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GMShowNavMeshReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GMShowNavMeshReq(
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
            case 26: {
              emu.gingerps.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (extent_ != null) {
                subBuilder = extent_.toBuilder();
              }
              extent_ = input.readMessage(emu.gingerps.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(extent_);
                extent_ = subBuilder.buildPartial();
              }

              break;
            }
            case 34: {
              emu.gingerps.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (center_ != null) {
                subBuilder = center_.toBuilder();
              }
              center_ = input.readMessage(emu.gingerps.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(center_);
                center_ = subBuilder.buildPartial();
              }

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
      return emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.internal_static_GMShowNavMeshReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.internal_static_GMShowNavMeshReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq.class, emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq.Builder.class);
    }

    public static final int EXTENT_FIELD_NUMBER = 3;
    private emu.gingerps.net.proto.VectorOuterClass.Vector extent_;
    /**
     * <code>.Vector extent = 3;</code>
     * @return Whether the extent field is set.
     */
    @java.lang.Override
    public boolean hasExtent() {
      return extent_ != null;
    }
    /**
     * <code>.Vector extent = 3;</code>
     * @return The extent.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.VectorOuterClass.Vector getExtent() {
      return extent_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : extent_;
    }
    /**
     * <code>.Vector extent = 3;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getExtentOrBuilder() {
      return getExtent();
    }

    public static final int CENTER_FIELD_NUMBER = 4;
    private emu.gingerps.net.proto.VectorOuterClass.Vector center_;
    /**
     * <code>.Vector center = 4;</code>
     * @return Whether the center field is set.
     */
    @java.lang.Override
    public boolean hasCenter() {
      return center_ != null;
    }
    /**
     * <code>.Vector center = 4;</code>
     * @return The center.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.VectorOuterClass.Vector getCenter() {
      return center_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : center_;
    }
    /**
     * <code>.Vector center = 4;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getCenterOrBuilder() {
      return getCenter();
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
      if (extent_ != null) {
        output.writeMessage(3, getExtent());
      }
      if (center_ != null) {
        output.writeMessage(4, getCenter());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (extent_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getExtent());
      }
      if (center_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getCenter());
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
      if (!(obj instanceof emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq other = (emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq) obj;

      if (hasExtent() != other.hasExtent()) return false;
      if (hasExtent()) {
        if (!getExtent()
            .equals(other.getExtent())) return false;
      }
      if (hasCenter() != other.hasCenter()) return false;
      if (hasCenter()) {
        if (!getCenter()
            .equals(other.getCenter())) return false;
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
      if (hasExtent()) {
        hash = (37 * hash) + EXTENT_FIELD_NUMBER;
        hash = (53 * hash) + getExtent().hashCode();
      }
      if (hasCenter()) {
        hash = (37 * hash) + CENTER_FIELD_NUMBER;
        hash = (53 * hash) + getCenter().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq prototype) {
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
     *   CMD_ID = 2363;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GMShowNavMeshReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GMShowNavMeshReq)
        emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.internal_static_GMShowNavMeshReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.internal_static_GMShowNavMeshReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq.class, emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq.newBuilder()
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
        if (extentBuilder_ == null) {
          extent_ = null;
        } else {
          extent_ = null;
          extentBuilder_ = null;
        }
        if (centerBuilder_ == null) {
          center_ = null;
        } else {
          center_ = null;
          centerBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.internal_static_GMShowNavMeshReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq build() {
        emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq buildPartial() {
        emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq result = new emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq(this);
        if (extentBuilder_ == null) {
          result.extent_ = extent_;
        } else {
          result.extent_ = extentBuilder_.build();
        }
        if (centerBuilder_ == null) {
          result.center_ = center_;
        } else {
          result.center_ = centerBuilder_.build();
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
        if (other instanceof emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq) {
          return mergeFrom((emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq other) {
        if (other == emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq.getDefaultInstance()) return this;
        if (other.hasExtent()) {
          mergeExtent(other.getExtent());
        }
        if (other.hasCenter()) {
          mergeCenter(other.getCenter());
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
        emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.gingerps.net.proto.VectorOuterClass.Vector extent_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder> extentBuilder_;
      /**
       * <code>.Vector extent = 3;</code>
       * @return Whether the extent field is set.
       */
      public boolean hasExtent() {
        return extentBuilder_ != null || extent_ != null;
      }
      /**
       * <code>.Vector extent = 3;</code>
       * @return The extent.
       */
      public emu.gingerps.net.proto.VectorOuterClass.Vector getExtent() {
        if (extentBuilder_ == null) {
          return extent_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : extent_;
        } else {
          return extentBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector extent = 3;</code>
       */
      public Builder setExtent(emu.gingerps.net.proto.VectorOuterClass.Vector value) {
        if (extentBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          extent_ = value;
          onChanged();
        } else {
          extentBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector extent = 3;</code>
       */
      public Builder setExtent(
          emu.gingerps.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (extentBuilder_ == null) {
          extent_ = builderForValue.build();
          onChanged();
        } else {
          extentBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector extent = 3;</code>
       */
      public Builder mergeExtent(emu.gingerps.net.proto.VectorOuterClass.Vector value) {
        if (extentBuilder_ == null) {
          if (extent_ != null) {
            extent_ =
              emu.gingerps.net.proto.VectorOuterClass.Vector.newBuilder(extent_).mergeFrom(value).buildPartial();
          } else {
            extent_ = value;
          }
          onChanged();
        } else {
          extentBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector extent = 3;</code>
       */
      public Builder clearExtent() {
        if (extentBuilder_ == null) {
          extent_ = null;
          onChanged();
        } else {
          extent_ = null;
          extentBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector extent = 3;</code>
       */
      public emu.gingerps.net.proto.VectorOuterClass.Vector.Builder getExtentBuilder() {
        
        onChanged();
        return getExtentFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector extent = 3;</code>
       */
      public emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getExtentOrBuilder() {
        if (extentBuilder_ != null) {
          return extentBuilder_.getMessageOrBuilder();
        } else {
          return extent_ == null ?
              emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : extent_;
        }
      }
      /**
       * <code>.Vector extent = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder> 
          getExtentFieldBuilder() {
        if (extentBuilder_ == null) {
          extentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getExtent(),
                  getParentForChildren(),
                  isClean());
          extent_ = null;
        }
        return extentBuilder_;
      }

      private emu.gingerps.net.proto.VectorOuterClass.Vector center_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder> centerBuilder_;
      /**
       * <code>.Vector center = 4;</code>
       * @return Whether the center field is set.
       */
      public boolean hasCenter() {
        return centerBuilder_ != null || center_ != null;
      }
      /**
       * <code>.Vector center = 4;</code>
       * @return The center.
       */
      public emu.gingerps.net.proto.VectorOuterClass.Vector getCenter() {
        if (centerBuilder_ == null) {
          return center_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : center_;
        } else {
          return centerBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector center = 4;</code>
       */
      public Builder setCenter(emu.gingerps.net.proto.VectorOuterClass.Vector value) {
        if (centerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          center_ = value;
          onChanged();
        } else {
          centerBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector center = 4;</code>
       */
      public Builder setCenter(
          emu.gingerps.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (centerBuilder_ == null) {
          center_ = builderForValue.build();
          onChanged();
        } else {
          centerBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector center = 4;</code>
       */
      public Builder mergeCenter(emu.gingerps.net.proto.VectorOuterClass.Vector value) {
        if (centerBuilder_ == null) {
          if (center_ != null) {
            center_ =
              emu.gingerps.net.proto.VectorOuterClass.Vector.newBuilder(center_).mergeFrom(value).buildPartial();
          } else {
            center_ = value;
          }
          onChanged();
        } else {
          centerBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector center = 4;</code>
       */
      public Builder clearCenter() {
        if (centerBuilder_ == null) {
          center_ = null;
          onChanged();
        } else {
          center_ = null;
          centerBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector center = 4;</code>
       */
      public emu.gingerps.net.proto.VectorOuterClass.Vector.Builder getCenterBuilder() {
        
        onChanged();
        return getCenterFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector center = 4;</code>
       */
      public emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getCenterOrBuilder() {
        if (centerBuilder_ != null) {
          return centerBuilder_.getMessageOrBuilder();
        } else {
          return center_ == null ?
              emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : center_;
        }
      }
      /**
       * <code>.Vector center = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder> 
          getCenterFieldBuilder() {
        if (centerBuilder_ == null) {
          centerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getCenter(),
                  getParentForChildren(),
                  isClean());
          center_ = null;
        }
        return centerBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GMShowNavMeshReq)
    }

    // @@protoc_insertion_point(class_scope:GMShowNavMeshReq)
    private static final emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq();
    }

    public static emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GMShowNavMeshReq>
        PARSER = new com.google.protobuf.AbstractParser<GMShowNavMeshReq>() {
      @java.lang.Override
      public GMShowNavMeshReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GMShowNavMeshReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GMShowNavMeshReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GMShowNavMeshReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.GMShowNavMeshReqOuterClass.GMShowNavMeshReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GMShowNavMeshReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GMShowNavMeshReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026GMShowNavMeshReq.proto\032\014Vector.proto\"D" +
      "\n\020GMShowNavMeshReq\022\027\n\006extent\030\003 \001(\0132\007.Vec" +
      "tor\022\027\n\006center\030\004 \001(\0132\007.VectorB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_GMShowNavMeshReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GMShowNavMeshReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GMShowNavMeshReq_descriptor,
        new java.lang.String[] { "Extent", "Center", });
    emu.gingerps.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
