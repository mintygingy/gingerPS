// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SealBattleType.proto

package emu.gingerps.net.proto;

public final class SealBattleTypeOuterClass {
  private SealBattleTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code SealBattleType}
   */
  public enum SealBattleType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>SEAL_BATTLE_TYPE_KEEP_ALIVE = 0;</code>
     */
    SEAL_BATTLE_TYPE_KEEP_ALIVE(0),
    /**
     * <code>SEAL_BATTLE_TYPE_KILL_MONSTER = 1;</code>
     */
    SEAL_BATTLE_TYPE_KILL_MONSTER(1),
    /**
     * <code>SEAL_BATTLE_TYPE_ENERGY_CHARGE = 2;</code>
     */
    SEAL_BATTLE_TYPE_ENERGY_CHARGE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>SEAL_BATTLE_TYPE_KEEP_ALIVE = 0;</code>
     */
    public static final int SEAL_BATTLE_TYPE_KEEP_ALIVE_VALUE = 0;
    /**
     * <code>SEAL_BATTLE_TYPE_KILL_MONSTER = 1;</code>
     */
    public static final int SEAL_BATTLE_TYPE_KILL_MONSTER_VALUE = 1;
    /**
     * <code>SEAL_BATTLE_TYPE_ENERGY_CHARGE = 2;</code>
     */
    public static final int SEAL_BATTLE_TYPE_ENERGY_CHARGE_VALUE = 2;


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
    public static SealBattleType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static SealBattleType forNumber(int value) {
      switch (value) {
        case 0: return SEAL_BATTLE_TYPE_KEEP_ALIVE;
        case 1: return SEAL_BATTLE_TYPE_KILL_MONSTER;
        case 2: return SEAL_BATTLE_TYPE_ENERGY_CHARGE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SealBattleType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        SealBattleType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SealBattleType>() {
            public SealBattleType findValueByNumber(int number) {
              return SealBattleType.forNumber(number);
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
      return emu.gingerps.net.proto.SealBattleTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final SealBattleType[] VALUES = values();

    public static SealBattleType valueOf(
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

    private SealBattleType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:SealBattleType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024SealBattleType.proto*x\n\016SealBattleType" +
      "\022\037\n\033SEAL_BATTLE_TYPE_KEEP_ALIVE\020\000\022!\n\035SEA" +
      "L_BATTLE_TYPE_KILL_MONSTER\020\001\022\"\n\036SEAL_BAT" +
      "TLE_TYPE_ENERGY_CHARGE\020\002B\030\n\026emu.gingerps" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
