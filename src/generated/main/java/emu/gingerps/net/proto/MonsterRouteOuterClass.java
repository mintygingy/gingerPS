// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MonsterRoute.proto

package emu.gingerps.net.proto;

public final class MonsterRouteOuterClass {
  private MonsterRouteOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MonsterRouteOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MonsterRoute)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .RoutePoint route_points = 1;</code>
     */
    java.util.List<emu.gingerps.net.proto.RoutePointOuterClass.RoutePoint> 
        getRoutePointsList();
    /**
     * <code>repeated .RoutePoint route_points = 1;</code>
     */
    emu.gingerps.net.proto.RoutePointOuterClass.RoutePoint getRoutePoints(int index);
    /**
     * <code>repeated .RoutePoint route_points = 1;</code>
     */
    int getRoutePointsCount();
    /**
     * <code>repeated .RoutePoint route_points = 1;</code>
     */
    java.util.List<? extends emu.gingerps.net.proto.RoutePointOuterClass.RoutePointOrBuilder> 
        getRoutePointsOrBuilderList();
    /**
     * <code>repeated .RoutePoint route_points = 1;</code>
     */
    emu.gingerps.net.proto.RoutePointOuterClass.RoutePointOrBuilder getRoutePointsOrBuilder(
        int index);

    /**
     * <code>uint32 speed_level = 2;</code>
     * @return The speedLevel.
     */
    int getSpeedLevel();

    /**
     * <code>uint32 route_type = 3;</code>
     * @return The routeType.
     */
    int getRouteType();

    /**
     * <code>float arrive_range = 4;</code>
     * @return The arriveRange.
     */
    float getArriveRange();
  }
  /**
   * Protobuf type {@code MonsterRoute}
   */
  public static final class MonsterRoute extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MonsterRoute)
      MonsterRouteOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MonsterRoute.newBuilder() to construct.
    private MonsterRoute(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MonsterRoute() {
      routePoints_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MonsterRoute();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.MonsterRouteOuterClass.internal_static_MonsterRoute_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.MonsterRouteOuterClass.internal_static_MonsterRoute_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute.class, emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute.Builder.class);
    }

    public static final int ROUTE_POINTS_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private java.util.List<emu.gingerps.net.proto.RoutePointOuterClass.RoutePoint> routePoints_;
    /**
     * <code>repeated .RoutePoint route_points = 1;</code>
     */
    @java.lang.Override
    public java.util.List<emu.gingerps.net.proto.RoutePointOuterClass.RoutePoint> getRoutePointsList() {
      return routePoints_;
    }
    /**
     * <code>repeated .RoutePoint route_points = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.gingerps.net.proto.RoutePointOuterClass.RoutePointOrBuilder> 
        getRoutePointsOrBuilderList() {
      return routePoints_;
    }
    /**
     * <code>repeated .RoutePoint route_points = 1;</code>
     */
    @java.lang.Override
    public int getRoutePointsCount() {
      return routePoints_.size();
    }
    /**
     * <code>repeated .RoutePoint route_points = 1;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.RoutePointOuterClass.RoutePoint getRoutePoints(int index) {
      return routePoints_.get(index);
    }
    /**
     * <code>repeated .RoutePoint route_points = 1;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.RoutePointOuterClass.RoutePointOrBuilder getRoutePointsOrBuilder(
        int index) {
      return routePoints_.get(index);
    }

    public static final int SPEED_LEVEL_FIELD_NUMBER = 2;
    private int speedLevel_ = 0;
    /**
     * <code>uint32 speed_level = 2;</code>
     * @return The speedLevel.
     */
    @java.lang.Override
    public int getSpeedLevel() {
      return speedLevel_;
    }

    public static final int ROUTE_TYPE_FIELD_NUMBER = 3;
    private int routeType_ = 0;
    /**
     * <code>uint32 route_type = 3;</code>
     * @return The routeType.
     */
    @java.lang.Override
    public int getRouteType() {
      return routeType_;
    }

    public static final int ARRIVE_RANGE_FIELD_NUMBER = 4;
    private float arriveRange_ = 0F;
    /**
     * <code>float arrive_range = 4;</code>
     * @return The arriveRange.
     */
    @java.lang.Override
    public float getArriveRange() {
      return arriveRange_;
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
      for (int i = 0; i < routePoints_.size(); i++) {
        output.writeMessage(1, routePoints_.get(i));
      }
      if (speedLevel_ != 0) {
        output.writeUInt32(2, speedLevel_);
      }
      if (routeType_ != 0) {
        output.writeUInt32(3, routeType_);
      }
      if (java.lang.Float.floatToRawIntBits(arriveRange_) != 0) {
        output.writeFloat(4, arriveRange_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < routePoints_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, routePoints_.get(i));
      }
      if (speedLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, speedLevel_);
      }
      if (routeType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, routeType_);
      }
      if (java.lang.Float.floatToRawIntBits(arriveRange_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(4, arriveRange_);
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
      if (!(obj instanceof emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute other = (emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute) obj;

      if (!getRoutePointsList()
          .equals(other.getRoutePointsList())) return false;
      if (getSpeedLevel()
          != other.getSpeedLevel()) return false;
      if (getRouteType()
          != other.getRouteType()) return false;
      if (java.lang.Float.floatToIntBits(getArriveRange())
          != java.lang.Float.floatToIntBits(
              other.getArriveRange())) return false;
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
      if (getRoutePointsCount() > 0) {
        hash = (37 * hash) + ROUTE_POINTS_FIELD_NUMBER;
        hash = (53 * hash) + getRoutePointsList().hashCode();
      }
      hash = (37 * hash) + SPEED_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getSpeedLevel();
      hash = (37 * hash) + ROUTE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getRouteType();
      hash = (37 * hash) + ARRIVE_RANGE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getArriveRange());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute prototype) {
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
     * Protobuf type {@code MonsterRoute}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MonsterRoute)
        emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRouteOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.MonsterRouteOuterClass.internal_static_MonsterRoute_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.MonsterRouteOuterClass.internal_static_MonsterRoute_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute.class, emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute.newBuilder()
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
        if (routePointsBuilder_ == null) {
          routePoints_ = java.util.Collections.emptyList();
        } else {
          routePoints_ = null;
          routePointsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        speedLevel_ = 0;
        routeType_ = 0;
        arriveRange_ = 0F;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.MonsterRouteOuterClass.internal_static_MonsterRoute_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute getDefaultInstanceForType() {
        return emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute build() {
        emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute buildPartial() {
        emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute result = new emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute result) {
        if (routePointsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            routePoints_ = java.util.Collections.unmodifiableList(routePoints_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.routePoints_ = routePoints_;
        } else {
          result.routePoints_ = routePointsBuilder_.build();
        }
      }

      private void buildPartial0(emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.speedLevel_ = speedLevel_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.routeType_ = routeType_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.arriveRange_ = arriveRange_;
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
        if (other instanceof emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute) {
          return mergeFrom((emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute other) {
        if (other == emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute.getDefaultInstance()) return this;
        if (routePointsBuilder_ == null) {
          if (!other.routePoints_.isEmpty()) {
            if (routePoints_.isEmpty()) {
              routePoints_ = other.routePoints_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureRoutePointsIsMutable();
              routePoints_.addAll(other.routePoints_);
            }
            onChanged();
          }
        } else {
          if (!other.routePoints_.isEmpty()) {
            if (routePointsBuilder_.isEmpty()) {
              routePointsBuilder_.dispose();
              routePointsBuilder_ = null;
              routePoints_ = other.routePoints_;
              bitField0_ = (bitField0_ & ~0x00000001);
              routePointsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getRoutePointsFieldBuilder() : null;
            } else {
              routePointsBuilder_.addAllMessages(other.routePoints_);
            }
          }
        }
        if (other.getSpeedLevel() != 0) {
          setSpeedLevel(other.getSpeedLevel());
        }
        if (other.getRouteType() != 0) {
          setRouteType(other.getRouteType());
        }
        if (other.getArriveRange() != 0F) {
          setArriveRange(other.getArriveRange());
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
              case 10: {
                emu.gingerps.net.proto.RoutePointOuterClass.RoutePoint m =
                    input.readMessage(
                        emu.gingerps.net.proto.RoutePointOuterClass.RoutePoint.parser(),
                        extensionRegistry);
                if (routePointsBuilder_ == null) {
                  ensureRoutePointsIsMutable();
                  routePoints_.add(m);
                } else {
                  routePointsBuilder_.addMessage(m);
                }
                break;
              } // case 10
              case 16: {
                speedLevel_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                routeType_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 37: {
                arriveRange_ = input.readFloat();
                bitField0_ |= 0x00000008;
                break;
              } // case 37
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

      private java.util.List<emu.gingerps.net.proto.RoutePointOuterClass.RoutePoint> routePoints_ =
        java.util.Collections.emptyList();
      private void ensureRoutePointsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          routePoints_ = new java.util.ArrayList<emu.gingerps.net.proto.RoutePointOuterClass.RoutePoint>(routePoints_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.RoutePointOuterClass.RoutePoint, emu.gingerps.net.proto.RoutePointOuterClass.RoutePoint.Builder, emu.gingerps.net.proto.RoutePointOuterClass.RoutePointOrBuilder> routePointsBuilder_;

      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public java.util.List<emu.gingerps.net.proto.RoutePointOuterClass.RoutePoint> getRoutePointsList() {
        if (routePointsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(routePoints_);
        } else {
          return routePointsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public int getRoutePointsCount() {
        if (routePointsBuilder_ == null) {
          return routePoints_.size();
        } else {
          return routePointsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public emu.gingerps.net.proto.RoutePointOuterClass.RoutePoint getRoutePoints(int index) {
        if (routePointsBuilder_ == null) {
          return routePoints_.get(index);
        } else {
          return routePointsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public Builder setRoutePoints(
          int index, emu.gingerps.net.proto.RoutePointOuterClass.RoutePoint value) {
        if (routePointsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRoutePointsIsMutable();
          routePoints_.set(index, value);
          onChanged();
        } else {
          routePointsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public Builder setRoutePoints(
          int index, emu.gingerps.net.proto.RoutePointOuterClass.RoutePoint.Builder builderForValue) {
        if (routePointsBuilder_ == null) {
          ensureRoutePointsIsMutable();
          routePoints_.set(index, builderForValue.build());
          onChanged();
        } else {
          routePointsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public Builder addRoutePoints(emu.gingerps.net.proto.RoutePointOuterClass.RoutePoint value) {
        if (routePointsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRoutePointsIsMutable();
          routePoints_.add(value);
          onChanged();
        } else {
          routePointsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public Builder addRoutePoints(
          int index, emu.gingerps.net.proto.RoutePointOuterClass.RoutePoint value) {
        if (routePointsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRoutePointsIsMutable();
          routePoints_.add(index, value);
          onChanged();
        } else {
          routePointsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public Builder addRoutePoints(
          emu.gingerps.net.proto.RoutePointOuterClass.RoutePoint.Builder builderForValue) {
        if (routePointsBuilder_ == null) {
          ensureRoutePointsIsMutable();
          routePoints_.add(builderForValue.build());
          onChanged();
        } else {
          routePointsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public Builder addRoutePoints(
          int index, emu.gingerps.net.proto.RoutePointOuterClass.RoutePoint.Builder builderForValue) {
        if (routePointsBuilder_ == null) {
          ensureRoutePointsIsMutable();
          routePoints_.add(index, builderForValue.build());
          onChanged();
        } else {
          routePointsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public Builder addAllRoutePoints(
          java.lang.Iterable<? extends emu.gingerps.net.proto.RoutePointOuterClass.RoutePoint> values) {
        if (routePointsBuilder_ == null) {
          ensureRoutePointsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, routePoints_);
          onChanged();
        } else {
          routePointsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public Builder clearRoutePoints() {
        if (routePointsBuilder_ == null) {
          routePoints_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          routePointsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public Builder removeRoutePoints(int index) {
        if (routePointsBuilder_ == null) {
          ensureRoutePointsIsMutable();
          routePoints_.remove(index);
          onChanged();
        } else {
          routePointsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public emu.gingerps.net.proto.RoutePointOuterClass.RoutePoint.Builder getRoutePointsBuilder(
          int index) {
        return getRoutePointsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public emu.gingerps.net.proto.RoutePointOuterClass.RoutePointOrBuilder getRoutePointsOrBuilder(
          int index) {
        if (routePointsBuilder_ == null) {
          return routePoints_.get(index);  } else {
          return routePointsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public java.util.List<? extends emu.gingerps.net.proto.RoutePointOuterClass.RoutePointOrBuilder> 
           getRoutePointsOrBuilderList() {
        if (routePointsBuilder_ != null) {
          return routePointsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(routePoints_);
        }
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public emu.gingerps.net.proto.RoutePointOuterClass.RoutePoint.Builder addRoutePointsBuilder() {
        return getRoutePointsFieldBuilder().addBuilder(
            emu.gingerps.net.proto.RoutePointOuterClass.RoutePoint.getDefaultInstance());
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public emu.gingerps.net.proto.RoutePointOuterClass.RoutePoint.Builder addRoutePointsBuilder(
          int index) {
        return getRoutePointsFieldBuilder().addBuilder(
            index, emu.gingerps.net.proto.RoutePointOuterClass.RoutePoint.getDefaultInstance());
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public java.util.List<emu.gingerps.net.proto.RoutePointOuterClass.RoutePoint.Builder> 
           getRoutePointsBuilderList() {
        return getRoutePointsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.RoutePointOuterClass.RoutePoint, emu.gingerps.net.proto.RoutePointOuterClass.RoutePoint.Builder, emu.gingerps.net.proto.RoutePointOuterClass.RoutePointOrBuilder> 
          getRoutePointsFieldBuilder() {
        if (routePointsBuilder_ == null) {
          routePointsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.gingerps.net.proto.RoutePointOuterClass.RoutePoint, emu.gingerps.net.proto.RoutePointOuterClass.RoutePoint.Builder, emu.gingerps.net.proto.RoutePointOuterClass.RoutePointOrBuilder>(
                  routePoints_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          routePoints_ = null;
        }
        return routePointsBuilder_;
      }

      private int speedLevel_ ;
      /**
       * <code>uint32 speed_level = 2;</code>
       * @return The speedLevel.
       */
      @java.lang.Override
      public int getSpeedLevel() {
        return speedLevel_;
      }
      /**
       * <code>uint32 speed_level = 2;</code>
       * @param value The speedLevel to set.
       * @return This builder for chaining.
       */
      public Builder setSpeedLevel(int value) {
        
        speedLevel_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 speed_level = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearSpeedLevel() {
        bitField0_ = (bitField0_ & ~0x00000002);
        speedLevel_ = 0;
        onChanged();
        return this;
      }

      private int routeType_ ;
      /**
       * <code>uint32 route_type = 3;</code>
       * @return The routeType.
       */
      @java.lang.Override
      public int getRouteType() {
        return routeType_;
      }
      /**
       * <code>uint32 route_type = 3;</code>
       * @param value The routeType to set.
       * @return This builder for chaining.
       */
      public Builder setRouteType(int value) {
        
        routeType_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 route_type = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRouteType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        routeType_ = 0;
        onChanged();
        return this;
      }

      private float arriveRange_ ;
      /**
       * <code>float arrive_range = 4;</code>
       * @return The arriveRange.
       */
      @java.lang.Override
      public float getArriveRange() {
        return arriveRange_;
      }
      /**
       * <code>float arrive_range = 4;</code>
       * @param value The arriveRange to set.
       * @return This builder for chaining.
       */
      public Builder setArriveRange(float value) {
        
        arriveRange_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>float arrive_range = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearArriveRange() {
        bitField0_ = (bitField0_ & ~0x00000008);
        arriveRange_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:MonsterRoute)
    }

    // @@protoc_insertion_point(class_scope:MonsterRoute)
    private static final emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute();
    }

    public static emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MonsterRoute>
        PARSER = new com.google.protobuf.AbstractParser<MonsterRoute>() {
      @java.lang.Override
      public MonsterRoute parsePartialFrom(
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

    public static com.google.protobuf.Parser<MonsterRoute> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MonsterRoute> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.MonsterRouteOuterClass.MonsterRoute getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MonsterRoute_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MonsterRoute_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022MonsterRoute.proto\032\020RoutePoint.proto\"p" +
      "\n\014MonsterRoute\022!\n\014route_points\030\001 \003(\0132\013.R" +
      "outePoint\022\023\n\013speed_level\030\002 \001(\r\022\022\n\nroute_" +
      "type\030\003 \001(\r\022\024\n\014arrive_range\030\004 \001(\002B\030\n\026emu." +
      "gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.RoutePointOuterClass.getDescriptor(),
        });
    internal_static_MonsterRoute_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MonsterRoute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MonsterRoute_descriptor,
        new java.lang.String[] { "RoutePoints", "SpeedLevel", "RouteType", "ArriveRange", });
    emu.gingerps.net.proto.RoutePointOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
