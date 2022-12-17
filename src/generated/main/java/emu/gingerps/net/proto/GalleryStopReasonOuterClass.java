// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GalleryStopReason.proto

package emu.gingerps.net.proto;

public final class GalleryStopReasonOuterClass {
  private GalleryStopReasonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code GalleryStopReason}
   */
  public enum GalleryStopReason
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>GALLERY_STOP_REASON_NONE = 0;</code>
     */
    GALLERY_STOP_REASON_NONE(0),
    /**
     * <code>GALLERY_STOP_REASON_TIMEUP = 1;</code>
     */
    GALLERY_STOP_REASON_TIMEUP(1),
    /**
     * <code>GALLERY_STOP_REASON_CLIENT_INTERRUPT = 2;</code>
     */
    GALLERY_STOP_REASON_CLIENT_INTERRUPT(2),
    /**
     * <code>GALLERY_STOP_REASON_LUA_INTERRUPT_SUCCESS = 3;</code>
     */
    GALLERY_STOP_REASON_LUA_INTERRUPT_SUCCESS(3),
    /**
     * <code>GALLERY_STOP_REASON_LUA_INTERRUPT_FAIL = 4;</code>
     */
    GALLERY_STOP_REASON_LUA_INTERRUPT_FAIL(4),
    /**
     * <code>GALLERY_STOP_REASON_OWNER_LEAVE_SCENE = 5;</code>
     */
    GALLERY_STOP_REASON_OWNER_LEAVE_SCENE(5),
    /**
     * <code>GALLERY_STOP_REASON_PLAY_INIT_FAILED = 6;</code>
     */
    GALLERY_STOP_REASON_PLAY_INIT_FAILED(6),
    /**
     * <code>GALLERY_STOP_REASON_OTHER_PLAYER_ENTER = 7;</code>
     */
    GALLERY_STOP_REASON_OTHER_PLAYER_ENTER(7),
    /**
     * <code>GALLERY_STOP_REASON_AVATAR_DIE = 8;</code>
     */
    GALLERY_STOP_REASON_AVATAR_DIE(8),
    /**
     * <code>GALLERY_STOP_REASON_FINISHED = 9;</code>
     */
    GALLERY_STOP_REASON_FINISHED(9),
    /**
     * <code>GALLERY_STOP_REASON_FUNGUS_ALL_DIE = 10;</code>
     */
    GALLERY_STOP_REASON_FUNGUS_ALL_DIE(10),
    /**
     * <code>GALLERY_STOP_REASON_LIFE_COUNT_ZERO = 11;</code>
     */
    GALLERY_STOP_REASON_LIFE_COUNT_ZERO(11),
    /**
     * <code>GALLERY_STOP_REASON_Unk3300_DFPLGCGIIDM = 12;</code>
     */
    GALLERY_STOP_REASON_Unk3300_DFPLGCGIIDM(12),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>GALLERY_STOP_REASON_NONE = 0;</code>
     */
    public static final int GALLERY_STOP_REASON_NONE_VALUE = 0;
    /**
     * <code>GALLERY_STOP_REASON_TIMEUP = 1;</code>
     */
    public static final int GALLERY_STOP_REASON_TIMEUP_VALUE = 1;
    /**
     * <code>GALLERY_STOP_REASON_CLIENT_INTERRUPT = 2;</code>
     */
    public static final int GALLERY_STOP_REASON_CLIENT_INTERRUPT_VALUE = 2;
    /**
     * <code>GALLERY_STOP_REASON_LUA_INTERRUPT_SUCCESS = 3;</code>
     */
    public static final int GALLERY_STOP_REASON_LUA_INTERRUPT_SUCCESS_VALUE = 3;
    /**
     * <code>GALLERY_STOP_REASON_LUA_INTERRUPT_FAIL = 4;</code>
     */
    public static final int GALLERY_STOP_REASON_LUA_INTERRUPT_FAIL_VALUE = 4;
    /**
     * <code>GALLERY_STOP_REASON_OWNER_LEAVE_SCENE = 5;</code>
     */
    public static final int GALLERY_STOP_REASON_OWNER_LEAVE_SCENE_VALUE = 5;
    /**
     * <code>GALLERY_STOP_REASON_PLAY_INIT_FAILED = 6;</code>
     */
    public static final int GALLERY_STOP_REASON_PLAY_INIT_FAILED_VALUE = 6;
    /**
     * <code>GALLERY_STOP_REASON_OTHER_PLAYER_ENTER = 7;</code>
     */
    public static final int GALLERY_STOP_REASON_OTHER_PLAYER_ENTER_VALUE = 7;
    /**
     * <code>GALLERY_STOP_REASON_AVATAR_DIE = 8;</code>
     */
    public static final int GALLERY_STOP_REASON_AVATAR_DIE_VALUE = 8;
    /**
     * <code>GALLERY_STOP_REASON_FINISHED = 9;</code>
     */
    public static final int GALLERY_STOP_REASON_FINISHED_VALUE = 9;
    /**
     * <code>GALLERY_STOP_REASON_FUNGUS_ALL_DIE = 10;</code>
     */
    public static final int GALLERY_STOP_REASON_FUNGUS_ALL_DIE_VALUE = 10;
    /**
     * <code>GALLERY_STOP_REASON_LIFE_COUNT_ZERO = 11;</code>
     */
    public static final int GALLERY_STOP_REASON_LIFE_COUNT_ZERO_VALUE = 11;
    /**
     * <code>GALLERY_STOP_REASON_Unk3300_DFPLGCGIIDM = 12;</code>
     */
    public static final int GALLERY_STOP_REASON_Unk3300_DFPLGCGIIDM_VALUE = 12;


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
    public static GalleryStopReason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GalleryStopReason forNumber(int value) {
      switch (value) {
        case 0: return GALLERY_STOP_REASON_NONE;
        case 1: return GALLERY_STOP_REASON_TIMEUP;
        case 2: return GALLERY_STOP_REASON_CLIENT_INTERRUPT;
        case 3: return GALLERY_STOP_REASON_LUA_INTERRUPT_SUCCESS;
        case 4: return GALLERY_STOP_REASON_LUA_INTERRUPT_FAIL;
        case 5: return GALLERY_STOP_REASON_OWNER_LEAVE_SCENE;
        case 6: return GALLERY_STOP_REASON_PLAY_INIT_FAILED;
        case 7: return GALLERY_STOP_REASON_OTHER_PLAYER_ENTER;
        case 8: return GALLERY_STOP_REASON_AVATAR_DIE;
        case 9: return GALLERY_STOP_REASON_FINISHED;
        case 10: return GALLERY_STOP_REASON_FUNGUS_ALL_DIE;
        case 11: return GALLERY_STOP_REASON_LIFE_COUNT_ZERO;
        case 12: return GALLERY_STOP_REASON_Unk3300_DFPLGCGIIDM;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GalleryStopReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GalleryStopReason> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GalleryStopReason>() {
            public GalleryStopReason findValueByNumber(int number) {
              return GalleryStopReason.forNumber(number);
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
      return emu.gingerps.net.proto.GalleryStopReasonOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final GalleryStopReason[] VALUES = values();

    public static GalleryStopReason valueOf(
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

    private GalleryStopReason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:GalleryStopReason)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027GalleryStopReason.proto*\233\004\n\021GallerySto" +
      "pReason\022\034\n\030GALLERY_STOP_REASON_NONE\020\000\022\036\n" +
      "\032GALLERY_STOP_REASON_TIMEUP\020\001\022(\n$GALLERY" +
      "_STOP_REASON_CLIENT_INTERRUPT\020\002\022-\n)GALLE" +
      "RY_STOP_REASON_LUA_INTERRUPT_SUCCESS\020\003\022*" +
      "\n&GALLERY_STOP_REASON_LUA_INTERRUPT_FAIL" +
      "\020\004\022)\n%GALLERY_STOP_REASON_OWNER_LEAVE_SC" +
      "ENE\020\005\022(\n$GALLERY_STOP_REASON_PLAY_INIT_F" +
      "AILED\020\006\022*\n&GALLERY_STOP_REASON_OTHER_PLA" +
      "YER_ENTER\020\007\022\"\n\036GALLERY_STOP_REASON_AVATA" +
      "R_DIE\020\010\022 \n\034GALLERY_STOP_REASON_FINISHED\020" +
      "\t\022&\n\"GALLERY_STOP_REASON_FUNGUS_ALL_DIE\020" +
      "\n\022\'\n#GALLERY_STOP_REASON_LIFE_COUNT_ZERO" +
      "\020\013\022+\n\'GALLERY_STOP_REASON_Unk3300_DFPLGC" +
      "GIIDM\020\014B\030\n\026emu.gingerps.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
