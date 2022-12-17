// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FireworksLaunchParamType.proto

package emu.gingerps.net.proto;

public final class FireworksLaunchParamTypeOuterClass {
  private FireworksLaunchParamTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code FireworksLaunchParamType}
   */
  public enum FireworksLaunchParamType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>FIREWORKS_LAUNCH_PARAM_TYPE_NONE = 0;</code>
     */
    FIREWORKS_LAUNCH_PARAM_TYPE_NONE(0),
    /**
     * <code>FIREWORKS_LAUNCH_PARAM_TYPE_REPEAT = 1;</code>
     */
    FIREWORKS_LAUNCH_PARAM_TYPE_REPEAT(1),
    /**
     * <code>FIREWORKS_LAUNCH_PARAM_TYPE_INTERVAL = 2;</code>
     */
    FIREWORKS_LAUNCH_PARAM_TYPE_INTERVAL(2),
    /**
     * <code>FIREWORKS_LAUNCH_PARAM_TYPE_DELAY = 3;</code>
     */
    FIREWORKS_LAUNCH_PARAM_TYPE_DELAY(3),
    /**
     * <code>FIREWORKS_LAUNCH_PARAM_TYPE_ROUND_INTERVAL = 4;</code>
     */
    FIREWORKS_LAUNCH_PARAM_TYPE_ROUND_INTERVAL(4),
    /**
     * <code>FIREWORKS_LAUNCH_PARAM_TYPE_MAX = 5;</code>
     */
    FIREWORKS_LAUNCH_PARAM_TYPE_MAX(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>FIREWORKS_LAUNCH_PARAM_TYPE_NONE = 0;</code>
     */
    public static final int FIREWORKS_LAUNCH_PARAM_TYPE_NONE_VALUE = 0;
    /**
     * <code>FIREWORKS_LAUNCH_PARAM_TYPE_REPEAT = 1;</code>
     */
    public static final int FIREWORKS_LAUNCH_PARAM_TYPE_REPEAT_VALUE = 1;
    /**
     * <code>FIREWORKS_LAUNCH_PARAM_TYPE_INTERVAL = 2;</code>
     */
    public static final int FIREWORKS_LAUNCH_PARAM_TYPE_INTERVAL_VALUE = 2;
    /**
     * <code>FIREWORKS_LAUNCH_PARAM_TYPE_DELAY = 3;</code>
     */
    public static final int FIREWORKS_LAUNCH_PARAM_TYPE_DELAY_VALUE = 3;
    /**
     * <code>FIREWORKS_LAUNCH_PARAM_TYPE_ROUND_INTERVAL = 4;</code>
     */
    public static final int FIREWORKS_LAUNCH_PARAM_TYPE_ROUND_INTERVAL_VALUE = 4;
    /**
     * <code>FIREWORKS_LAUNCH_PARAM_TYPE_MAX = 5;</code>
     */
    public static final int FIREWORKS_LAUNCH_PARAM_TYPE_MAX_VALUE = 5;


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
    public static FireworksLaunchParamType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static FireworksLaunchParamType forNumber(int value) {
      switch (value) {
        case 0: return FIREWORKS_LAUNCH_PARAM_TYPE_NONE;
        case 1: return FIREWORKS_LAUNCH_PARAM_TYPE_REPEAT;
        case 2: return FIREWORKS_LAUNCH_PARAM_TYPE_INTERVAL;
        case 3: return FIREWORKS_LAUNCH_PARAM_TYPE_DELAY;
        case 4: return FIREWORKS_LAUNCH_PARAM_TYPE_ROUND_INTERVAL;
        case 5: return FIREWORKS_LAUNCH_PARAM_TYPE_MAX;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<FireworksLaunchParamType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        FireworksLaunchParamType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<FireworksLaunchParamType>() {
            public FireworksLaunchParamType findValueByNumber(int number) {
              return FireworksLaunchParamType.forNumber(number);
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
      return emu.gingerps.net.proto.FireworksLaunchParamTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final FireworksLaunchParamType[] VALUES = values();

    public static FireworksLaunchParamType valueOf(
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

    private FireworksLaunchParamType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:FireworksLaunchParamType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036FireworksLaunchParamType.proto*\216\002\n\030Fir" +
      "eworksLaunchParamType\022$\n FIREWORKS_LAUNC" +
      "H_PARAM_TYPE_NONE\020\000\022&\n\"FIREWORKS_LAUNCH_" +
      "PARAM_TYPE_REPEAT\020\001\022(\n$FIREWORKS_LAUNCH_" +
      "PARAM_TYPE_INTERVAL\020\002\022%\n!FIREWORKS_LAUNC" +
      "H_PARAM_TYPE_DELAY\020\003\022.\n*FIREWORKS_LAUNCH" +
      "_PARAM_TYPE_ROUND_INTERVAL\020\004\022#\n\037FIREWORK" +
      "S_LAUNCH_PARAM_TYPE_MAX\020\005B\030\n\026emu.gingerp" +
      "s.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
