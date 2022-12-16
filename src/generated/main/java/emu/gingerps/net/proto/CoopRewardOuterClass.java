// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CoopReward.proto

package emu.gingerps.net.proto;

public final class CoopRewardOuterClass {
  private CoopRewardOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CoopRewardOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CoopReward)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 id = 5;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>.CoopReward.State state = 6;</code>
     * @return The enum numeric value on the wire for state.
     */
    int getStateValue();
    /**
     * <code>.CoopReward.State state = 6;</code>
     * @return The state.
     */
    emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.State getState();
  }
  /**
   * Protobuf type {@code CoopReward}
   */
  public static final class CoopReward extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CoopReward)
      CoopRewardOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CoopReward.newBuilder() to construct.
    private CoopReward(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CoopReward() {
      state_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CoopReward();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CoopReward(
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
            case 40: {

              id_ = input.readUInt32();
              break;
            }
            case 48: {
              int rawValue = input.readEnum();

              state_ = rawValue;
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
      return emu.gingerps.net.proto.CoopRewardOuterClass.internal_static_CoopReward_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.CoopRewardOuterClass.internal_static_CoopReward_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.class, emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.Builder.class);
    }

    /**
     * Protobuf enum {@code CoopReward.State}
     */
    public enum State
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>STATE_UNLOCK = 0;</code>
       */
      STATE_UNLOCK(0),
      /**
       * <code>STATE_LOCK = 1;</code>
       */
      STATE_LOCK(1),
      /**
       * <code>STATE_TAKEN = 2;</code>
       */
      STATE_TAKEN(2),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>STATE_UNLOCK = 0;</code>
       */
      public static final int STATE_UNLOCK_VALUE = 0;
      /**
       * <code>STATE_LOCK = 1;</code>
       */
      public static final int STATE_LOCK_VALUE = 1;
      /**
       * <code>STATE_TAKEN = 2;</code>
       */
      public static final int STATE_TAKEN_VALUE = 2;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static State valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static State forNumber(int value) {
        switch (value) {
          case 0: return STATE_UNLOCK;
          case 1: return STATE_LOCK;
          case 2: return STATE_TAKEN;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<State>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          State> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<State>() {
              public State findValueByNumber(int number) {
                return State.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.getDescriptor().getEnumTypes().get(0);
      }

      private static final State[] VALUES = values();

      public static State valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private State(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:CoopReward.State)
    }

    public static final int ID_FIELD_NUMBER = 5;
    private int id_;
    /**
     * <code>uint32 id = 5;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int STATE_FIELD_NUMBER = 6;
    private int state_;
    /**
     * <code>.CoopReward.State state = 6;</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <code>.CoopReward.State state = 6;</code>
     * @return The state.
     */
    @java.lang.Override public emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.State getState() {
      @SuppressWarnings("deprecation")
      emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.State result = emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.State.valueOf(state_);
      return result == null ? emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.State.UNRECOGNIZED : result;
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
      if (id_ != 0) {
        output.writeUInt32(5, id_);
      }
      if (state_ != emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.State.STATE_UNLOCK.getNumber()) {
        output.writeEnum(6, state_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, id_);
      }
      if (state_ != emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.State.STATE_UNLOCK.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(6, state_);
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
      if (!(obj instanceof emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward other = (emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward) obj;

      if (getId()
          != other.getId()) return false;
      if (state_ != other.state_) return false;
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + state_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward prototype) {
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
     * Protobuf type {@code CoopReward}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CoopReward)
        emu.gingerps.net.proto.CoopRewardOuterClass.CoopRewardOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.CoopRewardOuterClass.internal_static_CoopReward_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.CoopRewardOuterClass.internal_static_CoopReward_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.class, emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.newBuilder()
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
        id_ = 0;

        state_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.CoopRewardOuterClass.internal_static_CoopReward_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward getDefaultInstanceForType() {
        return emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward build() {
        emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward buildPartial() {
        emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward result = new emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward(this);
        result.id_ = id_;
        result.state_ = state_;
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
        if (other instanceof emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward) {
          return mergeFrom((emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward other) {
        if (other == emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (other.state_ != 0) {
          setStateValue(other.getStateValue());
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
        emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 5;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 5;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private int state_ = 0;
      /**
       * <code>.CoopReward.State state = 6;</code>
       * @return The enum numeric value on the wire for state.
       */
      @java.lang.Override public int getStateValue() {
        return state_;
      }
      /**
       * <code>.CoopReward.State state = 6;</code>
       * @param value The enum numeric value on the wire for state to set.
       * @return This builder for chaining.
       */
      public Builder setStateValue(int value) {
        
        state_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.CoopReward.State state = 6;</code>
       * @return The state.
       */
      @java.lang.Override
      public emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.State getState() {
        @SuppressWarnings("deprecation")
        emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.State result = emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.State.valueOf(state_);
        return result == null ? emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.State.UNRECOGNIZED : result;
      }
      /**
       * <code>.CoopReward.State state = 6;</code>
       * @param value The state to set.
       * @return This builder for chaining.
       */
      public Builder setState(emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.State value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        state_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.CoopReward.State state = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearState() {
        
        state_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CoopReward)
    }

    // @@protoc_insertion_point(class_scope:CoopReward)
    private static final emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward();
    }

    public static emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CoopReward>
        PARSER = new com.google.protobuf.AbstractParser<CoopReward>() {
      @java.lang.Override
      public CoopReward parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CoopReward(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CoopReward> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CoopReward> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CoopReward_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CoopReward_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020CoopReward.proto\"v\n\nCoopReward\022\n\n\002id\030\005" +
      " \001(\r\022 \n\005state\030\006 \001(\0162\021.CoopReward.State\":" +
      "\n\005State\022\020\n\014STATE_UNLOCK\020\000\022\016\n\nSTATE_LOCK\020" +
      "\001\022\017\n\013STATE_TAKEN\020\002B\033\n\031emu.gingerps.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CoopReward_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CoopReward_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CoopReward_descriptor,
        new java.lang.String[] { "Id", "State", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}