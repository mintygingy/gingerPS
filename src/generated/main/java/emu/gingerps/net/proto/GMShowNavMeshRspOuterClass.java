// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GMShowNavMeshRsp.proto

package emu.gingerps.net.proto;

public final class GMShowNavMeshRspOuterClass {
  private GMShowNavMeshRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GMShowNavMeshRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GMShowNavMeshRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated .PBNavMeshTile tiles = 10;</code>
     */
    java.util.List<emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTile> 
        getTilesList();
    /**
     * <code>repeated .PBNavMeshTile tiles = 10;</code>
     */
    emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTile getTiles(int index);
    /**
     * <code>repeated .PBNavMeshTile tiles = 10;</code>
     */
    int getTilesCount();
    /**
     * <code>repeated .PBNavMeshTile tiles = 10;</code>
     */
    java.util.List<? extends emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTileOrBuilder> 
        getTilesOrBuilderList();
    /**
     * <code>repeated .PBNavMeshTile tiles = 10;</code>
     */
    emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTileOrBuilder getTilesOrBuilder(
        int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 2304;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GMShowNavMeshRsp}
   */
  public static final class GMShowNavMeshRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GMShowNavMeshRsp)
      GMShowNavMeshRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GMShowNavMeshRsp.newBuilder() to construct.
    private GMShowNavMeshRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GMShowNavMeshRsp() {
      tiles_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GMShowNavMeshRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.internal_static_GMShowNavMeshRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.internal_static_GMShowNavMeshRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp.class, emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 1;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int TILES_FIELD_NUMBER = 10;
    @SuppressWarnings("serial")
    private java.util.List<emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTile> tiles_;
    /**
     * <code>repeated .PBNavMeshTile tiles = 10;</code>
     */
    @java.lang.Override
    public java.util.List<emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTile> getTilesList() {
      return tiles_;
    }
    /**
     * <code>repeated .PBNavMeshTile tiles = 10;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTileOrBuilder> 
        getTilesOrBuilderList() {
      return tiles_;
    }
    /**
     * <code>repeated .PBNavMeshTile tiles = 10;</code>
     */
    @java.lang.Override
    public int getTilesCount() {
      return tiles_.size();
    }
    /**
     * <code>repeated .PBNavMeshTile tiles = 10;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTile getTiles(int index) {
      return tiles_.get(index);
    }
    /**
     * <code>repeated .PBNavMeshTile tiles = 10;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTileOrBuilder getTilesOrBuilder(
        int index) {
      return tiles_.get(index);
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
      if (retcode_ != 0) {
        output.writeInt32(1, retcode_);
      }
      for (int i = 0; i < tiles_.size(); i++) {
        output.writeMessage(10, tiles_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, retcode_);
      }
      for (int i = 0; i < tiles_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, tiles_.get(i));
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
      if (!(obj instanceof emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp other = (emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getTilesList()
          .equals(other.getTilesList())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (getTilesCount() > 0) {
        hash = (37 * hash) + TILES_FIELD_NUMBER;
        hash = (53 * hash) + getTilesList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp prototype) {
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
     *   CMD_ID = 2304;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GMShowNavMeshRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GMShowNavMeshRsp)
        emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.internal_static_GMShowNavMeshRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.internal_static_GMShowNavMeshRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp.class, emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp.newBuilder()
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
        retcode_ = 0;
        if (tilesBuilder_ == null) {
          tiles_ = java.util.Collections.emptyList();
        } else {
          tiles_ = null;
          tilesBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.internal_static_GMShowNavMeshRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp build() {
        emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp buildPartial() {
        emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp result = new emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp result) {
        if (tilesBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            tiles_ = java.util.Collections.unmodifiableList(tiles_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.tiles_ = tiles_;
        } else {
          result.tiles_ = tilesBuilder_.build();
        }
      }

      private void buildPartial0(emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.retcode_ = retcode_;
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
        if (other instanceof emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp) {
          return mergeFrom((emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp other) {
        if (other == emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (tilesBuilder_ == null) {
          if (!other.tiles_.isEmpty()) {
            if (tiles_.isEmpty()) {
              tiles_ = other.tiles_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureTilesIsMutable();
              tiles_.addAll(other.tiles_);
            }
            onChanged();
          }
        } else {
          if (!other.tiles_.isEmpty()) {
            if (tilesBuilder_.isEmpty()) {
              tilesBuilder_.dispose();
              tilesBuilder_ = null;
              tiles_ = other.tiles_;
              bitField0_ = (bitField0_ & ~0x00000002);
              tilesBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getTilesFieldBuilder() : null;
            } else {
              tilesBuilder_.addAllMessages(other.tiles_);
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
              case 8: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 82: {
                emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTile m =
                    input.readMessage(
                        emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTile.parser(),
                        extensionRegistry);
                if (tilesBuilder_ == null) {
                  ensureTilesIsMutable();
                  tiles_.add(m);
                } else {
                  tilesBuilder_.addMessage(m);
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 1;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTile> tiles_ =
        java.util.Collections.emptyList();
      private void ensureTilesIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          tiles_ = new java.util.ArrayList<emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTile>(tiles_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTile, emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTile.Builder, emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTileOrBuilder> tilesBuilder_;

      /**
       * <code>repeated .PBNavMeshTile tiles = 10;</code>
       */
      public java.util.List<emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTile> getTilesList() {
        if (tilesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(tiles_);
        } else {
          return tilesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .PBNavMeshTile tiles = 10;</code>
       */
      public int getTilesCount() {
        if (tilesBuilder_ == null) {
          return tiles_.size();
        } else {
          return tilesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .PBNavMeshTile tiles = 10;</code>
       */
      public emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTile getTiles(int index) {
        if (tilesBuilder_ == null) {
          return tiles_.get(index);
        } else {
          return tilesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .PBNavMeshTile tiles = 10;</code>
       */
      public Builder setTiles(
          int index, emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTile value) {
        if (tilesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTilesIsMutable();
          tiles_.set(index, value);
          onChanged();
        } else {
          tilesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PBNavMeshTile tiles = 10;</code>
       */
      public Builder setTiles(
          int index, emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTile.Builder builderForValue) {
        if (tilesBuilder_ == null) {
          ensureTilesIsMutable();
          tiles_.set(index, builderForValue.build());
          onChanged();
        } else {
          tilesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PBNavMeshTile tiles = 10;</code>
       */
      public Builder addTiles(emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTile value) {
        if (tilesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTilesIsMutable();
          tiles_.add(value);
          onChanged();
        } else {
          tilesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .PBNavMeshTile tiles = 10;</code>
       */
      public Builder addTiles(
          int index, emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTile value) {
        if (tilesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTilesIsMutable();
          tiles_.add(index, value);
          onChanged();
        } else {
          tilesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PBNavMeshTile tiles = 10;</code>
       */
      public Builder addTiles(
          emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTile.Builder builderForValue) {
        if (tilesBuilder_ == null) {
          ensureTilesIsMutable();
          tiles_.add(builderForValue.build());
          onChanged();
        } else {
          tilesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PBNavMeshTile tiles = 10;</code>
       */
      public Builder addTiles(
          int index, emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTile.Builder builderForValue) {
        if (tilesBuilder_ == null) {
          ensureTilesIsMutable();
          tiles_.add(index, builderForValue.build());
          onChanged();
        } else {
          tilesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PBNavMeshTile tiles = 10;</code>
       */
      public Builder addAllTiles(
          java.lang.Iterable<? extends emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTile> values) {
        if (tilesBuilder_ == null) {
          ensureTilesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, tiles_);
          onChanged();
        } else {
          tilesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .PBNavMeshTile tiles = 10;</code>
       */
      public Builder clearTiles() {
        if (tilesBuilder_ == null) {
          tiles_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          tilesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .PBNavMeshTile tiles = 10;</code>
       */
      public Builder removeTiles(int index) {
        if (tilesBuilder_ == null) {
          ensureTilesIsMutable();
          tiles_.remove(index);
          onChanged();
        } else {
          tilesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .PBNavMeshTile tiles = 10;</code>
       */
      public emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTile.Builder getTilesBuilder(
          int index) {
        return getTilesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .PBNavMeshTile tiles = 10;</code>
       */
      public emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTileOrBuilder getTilesOrBuilder(
          int index) {
        if (tilesBuilder_ == null) {
          return tiles_.get(index);  } else {
          return tilesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .PBNavMeshTile tiles = 10;</code>
       */
      public java.util.List<? extends emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTileOrBuilder> 
           getTilesOrBuilderList() {
        if (tilesBuilder_ != null) {
          return tilesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(tiles_);
        }
      }
      /**
       * <code>repeated .PBNavMeshTile tiles = 10;</code>
       */
      public emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTile.Builder addTilesBuilder() {
        return getTilesFieldBuilder().addBuilder(
            emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTile.getDefaultInstance());
      }
      /**
       * <code>repeated .PBNavMeshTile tiles = 10;</code>
       */
      public emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTile.Builder addTilesBuilder(
          int index) {
        return getTilesFieldBuilder().addBuilder(
            index, emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTile.getDefaultInstance());
      }
      /**
       * <code>repeated .PBNavMeshTile tiles = 10;</code>
       */
      public java.util.List<emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTile.Builder> 
           getTilesBuilderList() {
        return getTilesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTile, emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTile.Builder, emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTileOrBuilder> 
          getTilesFieldBuilder() {
        if (tilesBuilder_ == null) {
          tilesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTile, emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTile.Builder, emu.gingerps.net.proto.PBNavMeshTileOuterClass.PBNavMeshTileOrBuilder>(
                  tiles_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          tiles_ = null;
        }
        return tilesBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GMShowNavMeshRsp)
    }

    // @@protoc_insertion_point(class_scope:GMShowNavMeshRsp)
    private static final emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp();
    }

    public static emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GMShowNavMeshRsp>
        PARSER = new com.google.protobuf.AbstractParser<GMShowNavMeshRsp>() {
      @java.lang.Override
      public GMShowNavMeshRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<GMShowNavMeshRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GMShowNavMeshRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.GMShowNavMeshRspOuterClass.GMShowNavMeshRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GMShowNavMeshRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GMShowNavMeshRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026GMShowNavMeshRsp.proto\032\023PBNavMeshTile." +
      "proto\"B\n\020GMShowNavMeshRsp\022\017\n\007retcode\030\001 \001" +
      "(\005\022\035\n\005tiles\030\n \003(\0132\016.PBNavMeshTileB\030\n\026emu" +
      ".gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.PBNavMeshTileOuterClass.getDescriptor(),
        });
    internal_static_GMShowNavMeshRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GMShowNavMeshRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GMShowNavMeshRsp_descriptor,
        new java.lang.String[] { "Retcode", "Tiles", });
    emu.gingerps.net.proto.PBNavMeshTileOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
