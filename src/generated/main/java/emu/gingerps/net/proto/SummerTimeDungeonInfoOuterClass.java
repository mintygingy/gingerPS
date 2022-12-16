// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SummerTimeDungeonInfo.proto

package emu.gingerps.net.proto;

public final class SummerTimeDungeonInfoOuterClass {
  private SummerTimeDungeonInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SummerTimeDungeonInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SummerTimeDungeonInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 dungeon_id = 9;</code>
     * @return The dungeonId.
     */
    int getDungeonId();

    /**
     * <code>uint32 Unk3300_GMKMNHIBPEP = 1;</code>
     * @return The unk3300GMKMNHIBPEP.
     */
    int getUnk3300GMKMNHIBPEP();

    /**
     * <code>uint32 Unk3300_HJHODMOIMKG = 8;</code>
     * @return The unk3300HJHODMOIMKG.
     */
    int getUnk3300HJHODMOIMKG();

    /**
     * <code>uint32 Unk3300_GALEDJLAIPM = 5;</code>
     * @return The unk3300GALEDJLAIPM.
     */
    int getUnk3300GALEDJLAIPM();

    /**
     * <code>uint32 Unk3300_EGGFJCICOBD = 12;</code>
     * @return The unk3300EGGFJCICOBD.
     */
    int getUnk3300EGGFJCICOBD();
  }
  /**
   * Protobuf type {@code SummerTimeDungeonInfo}
   */
  public static final class SummerTimeDungeonInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SummerTimeDungeonInfo)
      SummerTimeDungeonInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SummerTimeDungeonInfo.newBuilder() to construct.
    private SummerTimeDungeonInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SummerTimeDungeonInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SummerTimeDungeonInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SummerTimeDungeonInfo(
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

              unk3300GMKMNHIBPEP_ = input.readUInt32();
              break;
            }
            case 40: {

              unk3300GALEDJLAIPM_ = input.readUInt32();
              break;
            }
            case 64: {

              unk3300HJHODMOIMKG_ = input.readUInt32();
              break;
            }
            case 72: {

              dungeonId_ = input.readUInt32();
              break;
            }
            case 96: {

              unk3300EGGFJCICOBD_ = input.readUInt32();
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
      return emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.internal_static_SummerTimeDungeonInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.internal_static_SummerTimeDungeonInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo.class, emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo.Builder.class);
    }

    public static final int DUNGEON_ID_FIELD_NUMBER = 9;
    private int dungeonId_;
    /**
     * <code>uint32 dungeon_id = 9;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
    }

    public static final int UNK3300_GMKMNHIBPEP_FIELD_NUMBER = 1;
    private int unk3300GMKMNHIBPEP_;
    /**
     * <code>uint32 Unk3300_GMKMNHIBPEP = 1;</code>
     * @return The unk3300GMKMNHIBPEP.
     */
    @java.lang.Override
    public int getUnk3300GMKMNHIBPEP() {
      return unk3300GMKMNHIBPEP_;
    }

    public static final int UNK3300_HJHODMOIMKG_FIELD_NUMBER = 8;
    private int unk3300HJHODMOIMKG_;
    /**
     * <code>uint32 Unk3300_HJHODMOIMKG = 8;</code>
     * @return The unk3300HJHODMOIMKG.
     */
    @java.lang.Override
    public int getUnk3300HJHODMOIMKG() {
      return unk3300HJHODMOIMKG_;
    }

    public static final int UNK3300_GALEDJLAIPM_FIELD_NUMBER = 5;
    private int unk3300GALEDJLAIPM_;
    /**
     * <code>uint32 Unk3300_GALEDJLAIPM = 5;</code>
     * @return The unk3300GALEDJLAIPM.
     */
    @java.lang.Override
    public int getUnk3300GALEDJLAIPM() {
      return unk3300GALEDJLAIPM_;
    }

    public static final int UNK3300_EGGFJCICOBD_FIELD_NUMBER = 12;
    private int unk3300EGGFJCICOBD_;
    /**
     * <code>uint32 Unk3300_EGGFJCICOBD = 12;</code>
     * @return The unk3300EGGFJCICOBD.
     */
    @java.lang.Override
    public int getUnk3300EGGFJCICOBD() {
      return unk3300EGGFJCICOBD_;
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
      if (unk3300GMKMNHIBPEP_ != 0) {
        output.writeUInt32(1, unk3300GMKMNHIBPEP_);
      }
      if (unk3300GALEDJLAIPM_ != 0) {
        output.writeUInt32(5, unk3300GALEDJLAIPM_);
      }
      if (unk3300HJHODMOIMKG_ != 0) {
        output.writeUInt32(8, unk3300HJHODMOIMKG_);
      }
      if (dungeonId_ != 0) {
        output.writeUInt32(9, dungeonId_);
      }
      if (unk3300EGGFJCICOBD_ != 0) {
        output.writeUInt32(12, unk3300EGGFJCICOBD_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300GMKMNHIBPEP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, unk3300GMKMNHIBPEP_);
      }
      if (unk3300GALEDJLAIPM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, unk3300GALEDJLAIPM_);
      }
      if (unk3300HJHODMOIMKG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, unk3300HJHODMOIMKG_);
      }
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, dungeonId_);
      }
      if (unk3300EGGFJCICOBD_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, unk3300EGGFJCICOBD_);
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
      if (!(obj instanceof emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo other = (emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo) obj;

      if (getDungeonId()
          != other.getDungeonId()) return false;
      if (getUnk3300GMKMNHIBPEP()
          != other.getUnk3300GMKMNHIBPEP()) return false;
      if (getUnk3300HJHODMOIMKG()
          != other.getUnk3300HJHODMOIMKG()) return false;
      if (getUnk3300GALEDJLAIPM()
          != other.getUnk3300GALEDJLAIPM()) return false;
      if (getUnk3300EGGFJCICOBD()
          != other.getUnk3300EGGFJCICOBD()) return false;
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
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (37 * hash) + UNK3300_GMKMNHIBPEP_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300GMKMNHIBPEP();
      hash = (37 * hash) + UNK3300_HJHODMOIMKG_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300HJHODMOIMKG();
      hash = (37 * hash) + UNK3300_GALEDJLAIPM_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300GALEDJLAIPM();
      hash = (37 * hash) + UNK3300_EGGFJCICOBD_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300EGGFJCICOBD();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo prototype) {
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
     * Protobuf type {@code SummerTimeDungeonInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SummerTimeDungeonInfo)
        emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.internal_static_SummerTimeDungeonInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.internal_static_SummerTimeDungeonInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo.class, emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo.newBuilder()
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
        dungeonId_ = 0;

        unk3300GMKMNHIBPEP_ = 0;

        unk3300HJHODMOIMKG_ = 0;

        unk3300GALEDJLAIPM_ = 0;

        unk3300EGGFJCICOBD_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.internal_static_SummerTimeDungeonInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo build() {
        emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo buildPartial() {
        emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo result = new emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo(this);
        result.dungeonId_ = dungeonId_;
        result.unk3300GMKMNHIBPEP_ = unk3300GMKMNHIBPEP_;
        result.unk3300HJHODMOIMKG_ = unk3300HJHODMOIMKG_;
        result.unk3300GALEDJLAIPM_ = unk3300GALEDJLAIPM_;
        result.unk3300EGGFJCICOBD_ = unk3300EGGFJCICOBD_;
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
        if (other instanceof emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo) {
          return mergeFrom((emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo other) {
        if (other == emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo.getDefaultInstance()) return this;
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
        }
        if (other.getUnk3300GMKMNHIBPEP() != 0) {
          setUnk3300GMKMNHIBPEP(other.getUnk3300GMKMNHIBPEP());
        }
        if (other.getUnk3300HJHODMOIMKG() != 0) {
          setUnk3300HJHODMOIMKG(other.getUnk3300HJHODMOIMKG());
        }
        if (other.getUnk3300GALEDJLAIPM() != 0) {
          setUnk3300GALEDJLAIPM(other.getUnk3300GALEDJLAIPM());
        }
        if (other.getUnk3300EGGFJCICOBD() != 0) {
          setUnk3300EGGFJCICOBD(other.getUnk3300EGGFJCICOBD());
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
        emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 9;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 9;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
        onChanged();
        return this;
      }

      private int unk3300GMKMNHIBPEP_ ;
      /**
       * <code>uint32 Unk3300_GMKMNHIBPEP = 1;</code>
       * @return The unk3300GMKMNHIBPEP.
       */
      @java.lang.Override
      public int getUnk3300GMKMNHIBPEP() {
        return unk3300GMKMNHIBPEP_;
      }
      /**
       * <code>uint32 Unk3300_GMKMNHIBPEP = 1;</code>
       * @param value The unk3300GMKMNHIBPEP to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300GMKMNHIBPEP(int value) {
        
        unk3300GMKMNHIBPEP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_GMKMNHIBPEP = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300GMKMNHIBPEP() {
        
        unk3300GMKMNHIBPEP_ = 0;
        onChanged();
        return this;
      }

      private int unk3300HJHODMOIMKG_ ;
      /**
       * <code>uint32 Unk3300_HJHODMOIMKG = 8;</code>
       * @return The unk3300HJHODMOIMKG.
       */
      @java.lang.Override
      public int getUnk3300HJHODMOIMKG() {
        return unk3300HJHODMOIMKG_;
      }
      /**
       * <code>uint32 Unk3300_HJHODMOIMKG = 8;</code>
       * @param value The unk3300HJHODMOIMKG to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300HJHODMOIMKG(int value) {
        
        unk3300HJHODMOIMKG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_HJHODMOIMKG = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300HJHODMOIMKG() {
        
        unk3300HJHODMOIMKG_ = 0;
        onChanged();
        return this;
      }

      private int unk3300GALEDJLAIPM_ ;
      /**
       * <code>uint32 Unk3300_GALEDJLAIPM = 5;</code>
       * @return The unk3300GALEDJLAIPM.
       */
      @java.lang.Override
      public int getUnk3300GALEDJLAIPM() {
        return unk3300GALEDJLAIPM_;
      }
      /**
       * <code>uint32 Unk3300_GALEDJLAIPM = 5;</code>
       * @param value The unk3300GALEDJLAIPM to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300GALEDJLAIPM(int value) {
        
        unk3300GALEDJLAIPM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_GALEDJLAIPM = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300GALEDJLAIPM() {
        
        unk3300GALEDJLAIPM_ = 0;
        onChanged();
        return this;
      }

      private int unk3300EGGFJCICOBD_ ;
      /**
       * <code>uint32 Unk3300_EGGFJCICOBD = 12;</code>
       * @return The unk3300EGGFJCICOBD.
       */
      @java.lang.Override
      public int getUnk3300EGGFJCICOBD() {
        return unk3300EGGFJCICOBD_;
      }
      /**
       * <code>uint32 Unk3300_EGGFJCICOBD = 12;</code>
       * @param value The unk3300EGGFJCICOBD to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300EGGFJCICOBD(int value) {
        
        unk3300EGGFJCICOBD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_EGGFJCICOBD = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300EGGFJCICOBD() {
        
        unk3300EGGFJCICOBD_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SummerTimeDungeonInfo)
    }

    // @@protoc_insertion_point(class_scope:SummerTimeDungeonInfo)
    private static final emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo();
    }

    public static emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SummerTimeDungeonInfo>
        PARSER = new com.google.protobuf.AbstractParser<SummerTimeDungeonInfo>() {
      @java.lang.Override
      public SummerTimeDungeonInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SummerTimeDungeonInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SummerTimeDungeonInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SummerTimeDungeonInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SummerTimeDungeonInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SummerTimeDungeonInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033SummerTimeDungeonInfo.proto\"\237\001\n\025Summer" +
      "TimeDungeonInfo\022\022\n\ndungeon_id\030\t \001(\r\022\033\n\023U" +
      "nk3300_GMKMNHIBPEP\030\001 \001(\r\022\033\n\023Unk3300_HJHO" +
      "DMOIMKG\030\010 \001(\r\022\033\n\023Unk3300_GALEDJLAIPM\030\005 \001" +
      "(\r\022\033\n\023Unk3300_EGGFJCICOBD\030\014 \001(\rB\033\n\031emu.g" +
      "rasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SummerTimeDungeonInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SummerTimeDungeonInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SummerTimeDungeonInfo_descriptor,
        new java.lang.String[] { "DungeonId", "Unk3300GMKMNHIBPEP", "Unk3300HJHODMOIMKG", "Unk3300GALEDJLAIPM", "Unk3300EGGFJCICOBD", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
