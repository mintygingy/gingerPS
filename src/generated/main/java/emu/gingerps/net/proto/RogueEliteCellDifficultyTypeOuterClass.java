// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RogueEliteCellDifficultyType.proto

package emu.gingerps.net.proto;

public final class RogueEliteCellDifficultyTypeOuterClass {
  private RogueEliteCellDifficultyTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code RogueEliteCellDifficultyType}
   */
  public enum RogueEliteCellDifficultyType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ROGUE_ELITE_CELL_DIFFICULTY_TYPE_NORMAL = 0;</code>
     */
    ROGUE_ELITE_CELL_DIFFICULTY_TYPE_NORMAL(0),
    /**
     * <code>ROGUE_ELITE_CELL_DIFFICULTY_TYPE_HARD = 1;</code>
     */
    ROGUE_ELITE_CELL_DIFFICULTY_TYPE_HARD(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>ROGUE_ELITE_CELL_DIFFICULTY_TYPE_NORMAL = 0;</code>
     */
    public static final int ROGUE_ELITE_CELL_DIFFICULTY_TYPE_NORMAL_VALUE = 0;
    /**
     * <code>ROGUE_ELITE_CELL_DIFFICULTY_TYPE_HARD = 1;</code>
     */
    public static final int ROGUE_ELITE_CELL_DIFFICULTY_TYPE_HARD_VALUE = 1;


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
    public static RogueEliteCellDifficultyType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static RogueEliteCellDifficultyType forNumber(int value) {
      switch (value) {
        case 0: return ROGUE_ELITE_CELL_DIFFICULTY_TYPE_NORMAL;
        case 1: return ROGUE_ELITE_CELL_DIFFICULTY_TYPE_HARD;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<RogueEliteCellDifficultyType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        RogueEliteCellDifficultyType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<RogueEliteCellDifficultyType>() {
            public RogueEliteCellDifficultyType findValueByNumber(int number) {
              return RogueEliteCellDifficultyType.forNumber(number);
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
      return emu.gingerps.net.proto.RogueEliteCellDifficultyTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final RogueEliteCellDifficultyType[] VALUES = values();

    public static RogueEliteCellDifficultyType valueOf(
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

    private RogueEliteCellDifficultyType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:RogueEliteCellDifficultyType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"RogueEliteCellDifficultyType.proto*v\n\034" +
      "RogueEliteCellDifficultyType\022+\n\'ROGUE_EL" +
      "ITE_CELL_DIFFICULTY_TYPE_NORMAL\020\000\022)\n%ROG" +
      "UE_ELITE_CELL_DIFFICULTY_TYPE_HARD\020\001B\033\n\031" +
      "emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
