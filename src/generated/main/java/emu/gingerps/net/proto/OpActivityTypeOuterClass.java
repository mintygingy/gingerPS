// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OpActivityType.proto

package emu.gingerps.net.proto;

public final class OpActivityTypeOuterClass {
  private OpActivityTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code OpActivityType}
   */
  public enum OpActivityType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>OP_ACTIVITY_TYPE_NONE = 0;</code>
     */
    OP_ACTIVITY_TYPE_NONE(0),
    /**
     * <code>OP_ACTIVITY_TYPE_SIGN_IN = 1;</code>
     */
    OP_ACTIVITY_TYPE_SIGN_IN(1),
    /**
     * <code>OP_ACTIVITY_TYPE_BONUS = 2;</code>
     */
    OP_ACTIVITY_TYPE_BONUS(2),
    /**
     * <code>OP_ACTIVITY_TYPE_TRAVEL_BUSINESS = 3;</code>
     */
    OP_ACTIVITY_TYPE_TRAVEL_BUSINESS(3),
    /**
     * <code>OP_ACTIVITY_TYPE_CRUCIBLE = 4;</code>
     */
    OP_ACTIVITY_TYPE_CRUCIBLE(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>OP_ACTIVITY_TYPE_NONE = 0;</code>
     */
    public static final int OP_ACTIVITY_TYPE_NONE_VALUE = 0;
    /**
     * <code>OP_ACTIVITY_TYPE_SIGN_IN = 1;</code>
     */
    public static final int OP_ACTIVITY_TYPE_SIGN_IN_VALUE = 1;
    /**
     * <code>OP_ACTIVITY_TYPE_BONUS = 2;</code>
     */
    public static final int OP_ACTIVITY_TYPE_BONUS_VALUE = 2;
    /**
     * <code>OP_ACTIVITY_TYPE_TRAVEL_BUSINESS = 3;</code>
     */
    public static final int OP_ACTIVITY_TYPE_TRAVEL_BUSINESS_VALUE = 3;
    /**
     * <code>OP_ACTIVITY_TYPE_CRUCIBLE = 4;</code>
     */
    public static final int OP_ACTIVITY_TYPE_CRUCIBLE_VALUE = 4;


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
    public static OpActivityType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static OpActivityType forNumber(int value) {
      switch (value) {
        case 0: return OP_ACTIVITY_TYPE_NONE;
        case 1: return OP_ACTIVITY_TYPE_SIGN_IN;
        case 2: return OP_ACTIVITY_TYPE_BONUS;
        case 3: return OP_ACTIVITY_TYPE_TRAVEL_BUSINESS;
        case 4: return OP_ACTIVITY_TYPE_CRUCIBLE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<OpActivityType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        OpActivityType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<OpActivityType>() {
            public OpActivityType findValueByNumber(int number) {
              return OpActivityType.forNumber(number);
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
      return emu.gingerps.net.proto.OpActivityTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final OpActivityType[] VALUES = values();

    public static OpActivityType valueOf(
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

    private OpActivityType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:OpActivityType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024OpActivityType.proto*\252\001\n\016OpActivityTyp" +
      "e\022\031\n\025OP_ACTIVITY_TYPE_NONE\020\000\022\034\n\030OP_ACTIV" +
      "ITY_TYPE_SIGN_IN\020\001\022\032\n\026OP_ACTIVITY_TYPE_B" +
      "ONUS\020\002\022$\n OP_ACTIVITY_TYPE_TRAVEL_BUSINE" +
      "SS\020\003\022\035\n\031OP_ACTIVITY_TYPE_CRUCIBLE\020\004B\030\n\026e" +
      "mu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
