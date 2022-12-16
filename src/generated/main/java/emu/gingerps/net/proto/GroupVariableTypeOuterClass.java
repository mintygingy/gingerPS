// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GroupVariableType.proto

package emu.gingerps.net.proto;

public final class GroupVariableTypeOuterClass {
  private GroupVariableTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code GroupVariableType}
   */
  public enum GroupVariableType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>GROUP_VARIABLE_TYPE_NORMAL = 0;</code>
     */
    GROUP_VARIABLE_TYPE_NORMAL(0),
    /**
     * <code>GROUP_VARIABLE_TYPE_LOGIC_STATE = 1;</code>
     */
    GROUP_VARIABLE_TYPE_LOGIC_STATE(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>GROUP_VARIABLE_TYPE_NORMAL = 0;</code>
     */
    public static final int GROUP_VARIABLE_TYPE_NORMAL_VALUE = 0;
    /**
     * <code>GROUP_VARIABLE_TYPE_LOGIC_STATE = 1;</code>
     */
    public static final int GROUP_VARIABLE_TYPE_LOGIC_STATE_VALUE = 1;


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
    public static GroupVariableType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GroupVariableType forNumber(int value) {
      switch (value) {
        case 0: return GROUP_VARIABLE_TYPE_NORMAL;
        case 1: return GROUP_VARIABLE_TYPE_LOGIC_STATE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GroupVariableType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GroupVariableType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GroupVariableType>() {
            public GroupVariableType findValueByNumber(int number) {
              return GroupVariableType.forNumber(number);
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
      return emu.gingerps.net.proto.GroupVariableTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final GroupVariableType[] VALUES = values();

    public static GroupVariableType valueOf(
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

    private GroupVariableType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:GroupVariableType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027GroupVariableType.proto*X\n\021GroupVariab" +
      "leType\022\036\n\032GROUP_VARIABLE_TYPE_NORMAL\020\000\022#" +
      "\n\037GROUP_VARIABLE_TYPE_LOGIC_STATE\020\001B\033\n\031e" +
      "mu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
