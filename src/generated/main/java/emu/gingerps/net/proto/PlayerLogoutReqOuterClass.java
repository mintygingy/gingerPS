// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerLogoutReq.proto

package emu.gingerps.net.proto;

public final class PlayerLogoutReqOuterClass {
  private PlayerLogoutReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerLogoutReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerLogoutReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.PlayerLogoutReq.Reason reason = 9;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.PlayerLogoutReq.Reason reason = 9;</code>
     * @return The reason.
     */
    emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq.Reason getReason();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 200;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code PlayerLogoutReq}
   */
  public static final class PlayerLogoutReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerLogoutReq)
      PlayerLogoutReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerLogoutReq.newBuilder() to construct.
    private PlayerLogoutReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerLogoutReq() {
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerLogoutReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerLogoutReq(
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
            case 72: {
              int rawValue = input.readEnum();

              reason_ = rawValue;
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
      return emu.gingerps.net.proto.PlayerLogoutReqOuterClass.internal_static_PlayerLogoutReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.PlayerLogoutReqOuterClass.internal_static_PlayerLogoutReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq.class, emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq.Builder.class);
    }

    /**
     * Protobuf enum {@code PlayerLogoutReq.Reason}
     */
    public enum Reason
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>REASON_DISCONNECT = 0;</code>
       */
      REASON_DISCONNECT(0),
      /**
       * <code>REASON_CLIENT_REQ = 1;</code>
       */
      REASON_CLIENT_REQ(1),
      /**
       * <code>REASON_TIMEOUT = 2;</code>
       */
      REASON_TIMEOUT(2),
      /**
       * <code>REASON_ADMIN_REQ = 3;</code>
       */
      REASON_ADMIN_REQ(3),
      /**
       * <code>REASON_SERVER_CLOSE = 4;</code>
       */
      REASON_SERVER_CLOSE(4),
      /**
       * <code>REASON_GM_CLEAR = 5;</code>
       */
      REASON_GM_CLEAR(5),
      /**
       * <code>REASON_PLAYER_TRANSFER = 6;</code>
       */
      REASON_PLAYER_TRANSFER(6),
      /**
       * <code>REASON_CLIENT_CHECKSUM_INVALID = 7;</code>
       */
      REASON_CLIENT_CHECKSUM_INVALID(7),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>REASON_DISCONNECT = 0;</code>
       */
      public static final int REASON_DISCONNECT_VALUE = 0;
      /**
       * <code>REASON_CLIENT_REQ = 1;</code>
       */
      public static final int REASON_CLIENT_REQ_VALUE = 1;
      /**
       * <code>REASON_TIMEOUT = 2;</code>
       */
      public static final int REASON_TIMEOUT_VALUE = 2;
      /**
       * <code>REASON_ADMIN_REQ = 3;</code>
       */
      public static final int REASON_ADMIN_REQ_VALUE = 3;
      /**
       * <code>REASON_SERVER_CLOSE = 4;</code>
       */
      public static final int REASON_SERVER_CLOSE_VALUE = 4;
      /**
       * <code>REASON_GM_CLEAR = 5;</code>
       */
      public static final int REASON_GM_CLEAR_VALUE = 5;
      /**
       * <code>REASON_PLAYER_TRANSFER = 6;</code>
       */
      public static final int REASON_PLAYER_TRANSFER_VALUE = 6;
      /**
       * <code>REASON_CLIENT_CHECKSUM_INVALID = 7;</code>
       */
      public static final int REASON_CLIENT_CHECKSUM_INVALID_VALUE = 7;


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
      public static Reason valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static Reason forNumber(int value) {
        switch (value) {
          case 0: return REASON_DISCONNECT;
          case 1: return REASON_CLIENT_REQ;
          case 2: return REASON_TIMEOUT;
          case 3: return REASON_ADMIN_REQ;
          case 4: return REASON_SERVER_CLOSE;
          case 5: return REASON_GM_CLEAR;
          case 6: return REASON_PLAYER_TRANSFER;
          case 7: return REASON_CLIENT_CHECKSUM_INVALID;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Reason>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Reason> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Reason>() {
              public Reason findValueByNumber(int number) {
                return Reason.forNumber(number);
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
        return emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final Reason[] VALUES = values();

      public static Reason valueOf(
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

      private Reason(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:PlayerLogoutReq.Reason)
    }

    public static final int REASON_FIELD_NUMBER = 9;
    private int reason_;
    /**
     * <code>.PlayerLogoutReq.Reason reason = 9;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.PlayerLogoutReq.Reason reason = 9;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq.Reason getReason() {
      @SuppressWarnings("deprecation")
      emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq.Reason result = emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq.Reason.valueOf(reason_);
      return result == null ? emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq.Reason.UNRECOGNIZED : result;
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
      if (reason_ != emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq.Reason.REASON_DISCONNECT.getNumber()) {
        output.writeEnum(9, reason_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reason_ != emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq.Reason.REASON_DISCONNECT.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(9, reason_);
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
      if (!(obj instanceof emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq other = (emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq) obj;

      if (reason_ != other.reason_) return false;
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
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq prototype) {
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
     *   CMD_ID = 200;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code PlayerLogoutReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerLogoutReq)
        emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.PlayerLogoutReqOuterClass.internal_static_PlayerLogoutReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.PlayerLogoutReqOuterClass.internal_static_PlayerLogoutReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq.class, emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq.newBuilder()
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
        reason_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.PlayerLogoutReqOuterClass.internal_static_PlayerLogoutReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq build() {
        emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq buildPartial() {
        emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq result = new emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq(this);
        result.reason_ = reason_;
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
        if (other instanceof emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq) {
          return mergeFrom((emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq other) {
        if (other == emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq.getDefaultInstance()) return this;
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
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
        emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.PlayerLogoutReq.Reason reason = 9;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.PlayerLogoutReq.Reason reason = 9;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.PlayerLogoutReq.Reason reason = 9;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq.Reason getReason() {
        @SuppressWarnings("deprecation")
        emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq.Reason result = emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq.Reason.valueOf(reason_);
        return result == null ? emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq.Reason.UNRECOGNIZED : result;
      }
      /**
       * <code>.PlayerLogoutReq.Reason reason = 9;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq.Reason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.PlayerLogoutReq.Reason reason = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerLogoutReq)
    }

    // @@protoc_insertion_point(class_scope:PlayerLogoutReq)
    private static final emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq();
    }

    public static emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerLogoutReq>
        PARSER = new com.google.protobuf.AbstractParser<PlayerLogoutReq>() {
      @java.lang.Override
      public PlayerLogoutReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerLogoutReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerLogoutReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerLogoutReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerLogoutReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerLogoutReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025PlayerLogoutReq.proto\"\213\002\n\017PlayerLogout" +
      "Req\022\'\n\006reason\030\t \001(\0162\027.PlayerLogoutReq.Re" +
      "ason\"\316\001\n\006Reason\022\025\n\021REASON_DISCONNECT\020\000\022\025" +
      "\n\021REASON_CLIENT_REQ\020\001\022\022\n\016REASON_TIMEOUT\020" +
      "\002\022\024\n\020REASON_ADMIN_REQ\020\003\022\027\n\023REASON_SERVER" +
      "_CLOSE\020\004\022\023\n\017REASON_GM_CLEAR\020\005\022\032\n\026REASON_" +
      "PLAYER_TRANSFER\020\006\022\"\n\036REASON_CLIENT_CHECK" +
      "SUM_INVALID\020\007B\033\n\031emu.gingerps.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayerLogoutReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerLogoutReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerLogoutReq_descriptor,
        new java.lang.String[] { "Reason", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
