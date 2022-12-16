// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CustomDungeonState.proto

package emu.gingerps.net.proto;

public final class CustomDungeonStateOuterClass {
  private CustomDungeonStateOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code CustomDungeonState}
   */
  public enum CustomDungeonState
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CUSTOM_DUNGEON_STATE_EDIT = 0;</code>
     */
    CUSTOM_DUNGEON_STATE_EDIT(0),
    /**
     * <code>CUSTOM_DUNGEON_STATE_SELF_PASS = 1;</code>
     */
    CUSTOM_DUNGEON_STATE_SELF_PASS(1),
    /**
     * <code>CUSTOM_DUNGEON_STATE_PUBLISHED = 2;</code>
     */
    CUSTOM_DUNGEON_STATE_PUBLISHED(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>CUSTOM_DUNGEON_STATE_EDIT = 0;</code>
     */
    public static final int CUSTOM_DUNGEON_STATE_EDIT_VALUE = 0;
    /**
     * <code>CUSTOM_DUNGEON_STATE_SELF_PASS = 1;</code>
     */
    public static final int CUSTOM_DUNGEON_STATE_SELF_PASS_VALUE = 1;
    /**
     * <code>CUSTOM_DUNGEON_STATE_PUBLISHED = 2;</code>
     */
    public static final int CUSTOM_DUNGEON_STATE_PUBLISHED_VALUE = 2;


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
    public static CustomDungeonState valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CustomDungeonState forNumber(int value) {
      switch (value) {
        case 0: return CUSTOM_DUNGEON_STATE_EDIT;
        case 1: return CUSTOM_DUNGEON_STATE_SELF_PASS;
        case 2: return CUSTOM_DUNGEON_STATE_PUBLISHED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CustomDungeonState>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CustomDungeonState> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CustomDungeonState>() {
            public CustomDungeonState findValueByNumber(int number) {
              return CustomDungeonState.forNumber(number);
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
      return emu.gingerps.net.proto.CustomDungeonStateOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final CustomDungeonState[] VALUES = values();

    public static CustomDungeonState valueOf(
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

    private CustomDungeonState(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:CustomDungeonState)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030CustomDungeonState.proto*{\n\022CustomDung" +
      "eonState\022\035\n\031CUSTOM_DUNGEON_STATE_EDIT\020\000\022" +
      "\"\n\036CUSTOM_DUNGEON_STATE_SELF_PASS\020\001\022\"\n\036C" +
      "USTOM_DUNGEON_STATE_PUBLISHED\020\002B\033\n\031emu.g" +
      "rasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
