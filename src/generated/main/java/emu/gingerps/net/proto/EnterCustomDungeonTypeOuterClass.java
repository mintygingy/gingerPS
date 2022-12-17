// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EnterCustomDungeonType.proto

package emu.gingerps.net.proto;

public final class EnterCustomDungeonTypeOuterClass {
  private EnterCustomDungeonTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code EnterCustomDungeonType}
   */
  public enum EnterCustomDungeonType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ENTER_CUSTOM_DUNGEON_TYPE_NONE = 0;</code>
     */
    ENTER_CUSTOM_DUNGEON_TYPE_NONE(0),
    /**
     * <code>ENTER_CUSTOM_DUNGEON_TYPE_EDIT = 1;</code>
     */
    ENTER_CUSTOM_DUNGEON_TYPE_EDIT(1),
    /**
     * <code>ENTER_CUSTOM_DUNGEON_TYPE_PLAY = 2;</code>
     */
    ENTER_CUSTOM_DUNGEON_TYPE_PLAY(2),
    /**
     * <code>ENTER_CUSTOM_DUNGEON_TYPE_OFFICIAL = 3;</code>
     */
    ENTER_CUSTOM_DUNGEON_TYPE_OFFICIAL(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>ENTER_CUSTOM_DUNGEON_TYPE_NONE = 0;</code>
     */
    public static final int ENTER_CUSTOM_DUNGEON_TYPE_NONE_VALUE = 0;
    /**
     * <code>ENTER_CUSTOM_DUNGEON_TYPE_EDIT = 1;</code>
     */
    public static final int ENTER_CUSTOM_DUNGEON_TYPE_EDIT_VALUE = 1;
    /**
     * <code>ENTER_CUSTOM_DUNGEON_TYPE_PLAY = 2;</code>
     */
    public static final int ENTER_CUSTOM_DUNGEON_TYPE_PLAY_VALUE = 2;
    /**
     * <code>ENTER_CUSTOM_DUNGEON_TYPE_OFFICIAL = 3;</code>
     */
    public static final int ENTER_CUSTOM_DUNGEON_TYPE_OFFICIAL_VALUE = 3;


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
    public static EnterCustomDungeonType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static EnterCustomDungeonType forNumber(int value) {
      switch (value) {
        case 0: return ENTER_CUSTOM_DUNGEON_TYPE_NONE;
        case 1: return ENTER_CUSTOM_DUNGEON_TYPE_EDIT;
        case 2: return ENTER_CUSTOM_DUNGEON_TYPE_PLAY;
        case 3: return ENTER_CUSTOM_DUNGEON_TYPE_OFFICIAL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EnterCustomDungeonType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        EnterCustomDungeonType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EnterCustomDungeonType>() {
            public EnterCustomDungeonType findValueByNumber(int number) {
              return EnterCustomDungeonType.forNumber(number);
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
      return emu.gingerps.net.proto.EnterCustomDungeonTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final EnterCustomDungeonType[] VALUES = values();

    public static EnterCustomDungeonType valueOf(
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

    private EnterCustomDungeonType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:EnterCustomDungeonType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034EnterCustomDungeonType.proto*\254\001\n\026Enter" +
      "CustomDungeonType\022\"\n\036ENTER_CUSTOM_DUNGEO" +
      "N_TYPE_NONE\020\000\022\"\n\036ENTER_CUSTOM_DUNGEON_TY" +
      "PE_EDIT\020\001\022\"\n\036ENTER_CUSTOM_DUNGEON_TYPE_P" +
      "LAY\020\002\022&\n\"ENTER_CUSTOM_DUNGEON_TYPE_OFFIC" +
      "IAL\020\003B\030\n\026emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
