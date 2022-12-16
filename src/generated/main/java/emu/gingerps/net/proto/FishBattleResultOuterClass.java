// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FishBattleResult.proto

package emu.gingerps.net.proto;

public final class FishBattleResultOuterClass {
  private FishBattleResultOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code FishBattleResult}
   */
  public enum FishBattleResult
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>FISH_BATTLE_RESULT_NONE = 0;</code>
     */
    FISH_BATTLE_RESULT_NONE(0),
    /**
     * <code>FISH_BATTLE_RESULT_SUCC = 1;</code>
     */
    FISH_BATTLE_RESULT_SUCC(1),
    /**
     * <code>FISH_BATTLE_RESULT_FAIL = 2;</code>
     */
    FISH_BATTLE_RESULT_FAIL(2),
    /**
     * <code>FISH_BATTLE_RESULT_TIMEOUT = 3;</code>
     */
    FISH_BATTLE_RESULT_TIMEOUT(3),
    /**
     * <code>FISH_BATTLE_RESULT_CANCEL = 4;</code>
     */
    FISH_BATTLE_RESULT_CANCEL(4),
    /**
     * <code>FISH_BATTLE_RESULT_EXIT = 5;</code>
     */
    FISH_BATTLE_RESULT_EXIT(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>FISH_BATTLE_RESULT_NONE = 0;</code>
     */
    public static final int FISH_BATTLE_RESULT_NONE_VALUE = 0;
    /**
     * <code>FISH_BATTLE_RESULT_SUCC = 1;</code>
     */
    public static final int FISH_BATTLE_RESULT_SUCC_VALUE = 1;
    /**
     * <code>FISH_BATTLE_RESULT_FAIL = 2;</code>
     */
    public static final int FISH_BATTLE_RESULT_FAIL_VALUE = 2;
    /**
     * <code>FISH_BATTLE_RESULT_TIMEOUT = 3;</code>
     */
    public static final int FISH_BATTLE_RESULT_TIMEOUT_VALUE = 3;
    /**
     * <code>FISH_BATTLE_RESULT_CANCEL = 4;</code>
     */
    public static final int FISH_BATTLE_RESULT_CANCEL_VALUE = 4;
    /**
     * <code>FISH_BATTLE_RESULT_EXIT = 5;</code>
     */
    public static final int FISH_BATTLE_RESULT_EXIT_VALUE = 5;


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
    public static FishBattleResult valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static FishBattleResult forNumber(int value) {
      switch (value) {
        case 0: return FISH_BATTLE_RESULT_NONE;
        case 1: return FISH_BATTLE_RESULT_SUCC;
        case 2: return FISH_BATTLE_RESULT_FAIL;
        case 3: return FISH_BATTLE_RESULT_TIMEOUT;
        case 4: return FISH_BATTLE_RESULT_CANCEL;
        case 5: return FISH_BATTLE_RESULT_EXIT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<FishBattleResult>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        FishBattleResult> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<FishBattleResult>() {
            public FishBattleResult findValueByNumber(int number) {
              return FishBattleResult.forNumber(number);
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
      return emu.gingerps.net.proto.FishBattleResultOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final FishBattleResult[] VALUES = values();

    public static FishBattleResult valueOf(
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

    private FishBattleResult(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:FishBattleResult)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026FishBattleResult.proto*\305\001\n\020FishBattleR" +
      "esult\022\033\n\027FISH_BATTLE_RESULT_NONE\020\000\022\033\n\027FI" +
      "SH_BATTLE_RESULT_SUCC\020\001\022\033\n\027FISH_BATTLE_R" +
      "ESULT_FAIL\020\002\022\036\n\032FISH_BATTLE_RESULT_TIMEO" +
      "UT\020\003\022\035\n\031FISH_BATTLE_RESULT_CANCEL\020\004\022\033\n\027F" +
      "ISH_BATTLE_RESULT_EXIT\020\005B\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
