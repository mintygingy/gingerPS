// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BargainSnapshot.proto

package emu.gingerps.net.proto;

public final class BargainSnapshotOuterClass {
  private BargainSnapshotOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BargainSnapshotOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BargainSnapshot)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3300_KOCJELACJLM = 11;</code>
     * @return The unk3300KOCJELACJLM.
     */
    int getUnk3300KOCJELACJLM();

    /**
     * <code>uint32 Unk3300_MHFDEBOBFNE = 14;</code>
     * @return The unk3300MHFDEBOBFNE.
     */
    int getUnk3300MHFDEBOBFNE();

    /**
     * <code>uint32 bargain_id = 3;</code>
     * @return The bargainId.
     */
    int getBargainId();

    /**
     * <code>int32 cur_mood = 8;</code>
     * @return The curMood.
     */
    int getCurMood();
  }
  /**
   * Protobuf type {@code BargainSnapshot}
   */
  public static final class BargainSnapshot extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BargainSnapshot)
      BargainSnapshotOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BargainSnapshot.newBuilder() to construct.
    private BargainSnapshot(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BargainSnapshot() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BargainSnapshot();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.BargainSnapshotOuterClass.internal_static_BargainSnapshot_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.BargainSnapshotOuterClass.internal_static_BargainSnapshot_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot.class, emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot.Builder.class);
    }

    public static final int UNK3300_KOCJELACJLM_FIELD_NUMBER = 11;
    private int unk3300KOCJELACJLM_ = 0;
    /**
     * <code>uint32 Unk3300_KOCJELACJLM = 11;</code>
     * @return The unk3300KOCJELACJLM.
     */
    @java.lang.Override
    public int getUnk3300KOCJELACJLM() {
      return unk3300KOCJELACJLM_;
    }

    public static final int UNK3300_MHFDEBOBFNE_FIELD_NUMBER = 14;
    private int unk3300MHFDEBOBFNE_ = 0;
    /**
     * <code>uint32 Unk3300_MHFDEBOBFNE = 14;</code>
     * @return The unk3300MHFDEBOBFNE.
     */
    @java.lang.Override
    public int getUnk3300MHFDEBOBFNE() {
      return unk3300MHFDEBOBFNE_;
    }

    public static final int BARGAIN_ID_FIELD_NUMBER = 3;
    private int bargainId_ = 0;
    /**
     * <code>uint32 bargain_id = 3;</code>
     * @return The bargainId.
     */
    @java.lang.Override
    public int getBargainId() {
      return bargainId_;
    }

    public static final int CUR_MOOD_FIELD_NUMBER = 8;
    private int curMood_ = 0;
    /**
     * <code>int32 cur_mood = 8;</code>
     * @return The curMood.
     */
    @java.lang.Override
    public int getCurMood() {
      return curMood_;
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
      if (bargainId_ != 0) {
        output.writeUInt32(3, bargainId_);
      }
      if (curMood_ != 0) {
        output.writeInt32(8, curMood_);
      }
      if (unk3300KOCJELACJLM_ != 0) {
        output.writeUInt32(11, unk3300KOCJELACJLM_);
      }
      if (unk3300MHFDEBOBFNE_ != 0) {
        output.writeUInt32(14, unk3300MHFDEBOBFNE_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (bargainId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, bargainId_);
      }
      if (curMood_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, curMood_);
      }
      if (unk3300KOCJELACJLM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, unk3300KOCJELACJLM_);
      }
      if (unk3300MHFDEBOBFNE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, unk3300MHFDEBOBFNE_);
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
      if (!(obj instanceof emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot other = (emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot) obj;

      if (getUnk3300KOCJELACJLM()
          != other.getUnk3300KOCJELACJLM()) return false;
      if (getUnk3300MHFDEBOBFNE()
          != other.getUnk3300MHFDEBOBFNE()) return false;
      if (getBargainId()
          != other.getBargainId()) return false;
      if (getCurMood()
          != other.getCurMood()) return false;
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
      hash = (37 * hash) + UNK3300_KOCJELACJLM_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300KOCJELACJLM();
      hash = (37 * hash) + UNK3300_MHFDEBOBFNE_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300MHFDEBOBFNE();
      hash = (37 * hash) + BARGAIN_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBargainId();
      hash = (37 * hash) + CUR_MOOD_FIELD_NUMBER;
      hash = (53 * hash) + getCurMood();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot prototype) {
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
     * Protobuf type {@code BargainSnapshot}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BargainSnapshot)
        emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshotOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.BargainSnapshotOuterClass.internal_static_BargainSnapshot_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.BargainSnapshotOuterClass.internal_static_BargainSnapshot_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot.class, emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot.newBuilder()
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
        unk3300KOCJELACJLM_ = 0;
        unk3300MHFDEBOBFNE_ = 0;
        bargainId_ = 0;
        curMood_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.BargainSnapshotOuterClass.internal_static_BargainSnapshot_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot getDefaultInstanceForType() {
        return emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot build() {
        emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot buildPartial() {
        emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot result = new emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.unk3300KOCJELACJLM_ = unk3300KOCJELACJLM_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.unk3300MHFDEBOBFNE_ = unk3300MHFDEBOBFNE_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.bargainId_ = bargainId_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.curMood_ = curMood_;
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
        if (other instanceof emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot) {
          return mergeFrom((emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot other) {
        if (other == emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot.getDefaultInstance()) return this;
        if (other.getUnk3300KOCJELACJLM() != 0) {
          setUnk3300KOCJELACJLM(other.getUnk3300KOCJELACJLM());
        }
        if (other.getUnk3300MHFDEBOBFNE() != 0) {
          setUnk3300MHFDEBOBFNE(other.getUnk3300MHFDEBOBFNE());
        }
        if (other.getBargainId() != 0) {
          setBargainId(other.getBargainId());
        }
        if (other.getCurMood() != 0) {
          setCurMood(other.getCurMood());
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
              case 24: {
                bargainId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 64: {
                curMood_ = input.readInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 64
              case 88: {
                unk3300KOCJELACJLM_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 88
              case 112: {
                unk3300MHFDEBOBFNE_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 112
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

      private int unk3300KOCJELACJLM_ ;
      /**
       * <code>uint32 Unk3300_KOCJELACJLM = 11;</code>
       * @return The unk3300KOCJELACJLM.
       */
      @java.lang.Override
      public int getUnk3300KOCJELACJLM() {
        return unk3300KOCJELACJLM_;
      }
      /**
       * <code>uint32 Unk3300_KOCJELACJLM = 11;</code>
       * @param value The unk3300KOCJELACJLM to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300KOCJELACJLM(int value) {
        
        unk3300KOCJELACJLM_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_KOCJELACJLM = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300KOCJELACJLM() {
        bitField0_ = (bitField0_ & ~0x00000001);
        unk3300KOCJELACJLM_ = 0;
        onChanged();
        return this;
      }

      private int unk3300MHFDEBOBFNE_ ;
      /**
       * <code>uint32 Unk3300_MHFDEBOBFNE = 14;</code>
       * @return The unk3300MHFDEBOBFNE.
       */
      @java.lang.Override
      public int getUnk3300MHFDEBOBFNE() {
        return unk3300MHFDEBOBFNE_;
      }
      /**
       * <code>uint32 Unk3300_MHFDEBOBFNE = 14;</code>
       * @param value The unk3300MHFDEBOBFNE to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300MHFDEBOBFNE(int value) {
        
        unk3300MHFDEBOBFNE_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_MHFDEBOBFNE = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300MHFDEBOBFNE() {
        bitField0_ = (bitField0_ & ~0x00000002);
        unk3300MHFDEBOBFNE_ = 0;
        onChanged();
        return this;
      }

      private int bargainId_ ;
      /**
       * <code>uint32 bargain_id = 3;</code>
       * @return The bargainId.
       */
      @java.lang.Override
      public int getBargainId() {
        return bargainId_;
      }
      /**
       * <code>uint32 bargain_id = 3;</code>
       * @param value The bargainId to set.
       * @return This builder for chaining.
       */
      public Builder setBargainId(int value) {
        
        bargainId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 bargain_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearBargainId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        bargainId_ = 0;
        onChanged();
        return this;
      }

      private int curMood_ ;
      /**
       * <code>int32 cur_mood = 8;</code>
       * @return The curMood.
       */
      @java.lang.Override
      public int getCurMood() {
        return curMood_;
      }
      /**
       * <code>int32 cur_mood = 8;</code>
       * @param value The curMood to set.
       * @return This builder for chaining.
       */
      public Builder setCurMood(int value) {
        
        curMood_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>int32 cur_mood = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurMood() {
        bitField0_ = (bitField0_ & ~0x00000008);
        curMood_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BargainSnapshot)
    }

    // @@protoc_insertion_point(class_scope:BargainSnapshot)
    private static final emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot();
    }

    public static emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BargainSnapshot>
        PARSER = new com.google.protobuf.AbstractParser<BargainSnapshot>() {
      @java.lang.Override
      public BargainSnapshot parsePartialFrom(
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

    public static com.google.protobuf.Parser<BargainSnapshot> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BargainSnapshot> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.BargainSnapshotOuterClass.BargainSnapshot getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BargainSnapshot_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BargainSnapshot_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025BargainSnapshot.proto\"q\n\017BargainSnapsh" +
      "ot\022\033\n\023Unk3300_KOCJELACJLM\030\013 \001(\r\022\033\n\023Unk33" +
      "00_MHFDEBOBFNE\030\016 \001(\r\022\022\n\nbargain_id\030\003 \001(\r" +
      "\022\020\n\010cur_mood\030\010 \001(\005B\030\n\026emu.gingerps.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BargainSnapshot_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BargainSnapshot_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BargainSnapshot_descriptor,
        new java.lang.String[] { "Unk3300KOCJELACJLM", "Unk3300MHFDEBOBFNE", "BargainId", "CurMood", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
