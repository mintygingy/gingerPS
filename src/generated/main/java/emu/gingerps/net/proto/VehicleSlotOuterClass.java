// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VehicleSlot.proto

package emu.gingerps.net.proto;

public final class VehicleSlotOuterClass {
  private VehicleSlotOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code VehicleSlot}
   */
  public enum VehicleSlot
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>VEHICLE_SLOT_OPERATOR = 0;</code>
     */
    VEHICLE_SLOT_OPERATOR(0),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>VEHICLE_SLOT_OPERATOR = 0;</code>
     */
    public static final int VEHICLE_SLOT_OPERATOR_VALUE = 0;


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
    public static VehicleSlot valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static VehicleSlot forNumber(int value) {
      switch (value) {
        case 0: return VEHICLE_SLOT_OPERATOR;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<VehicleSlot>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        VehicleSlot> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<VehicleSlot>() {
            public VehicleSlot findValueByNumber(int number) {
              return VehicleSlot.forNumber(number);
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
      return emu.gingerps.net.proto.VehicleSlotOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final VehicleSlot[] VALUES = values();

    public static VehicleSlot valueOf(
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

    private VehicleSlot(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:VehicleSlot)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021VehicleSlot.proto*(\n\013VehicleSlot\022\031\n\025VE" +
      "HICLE_SLOT_OPERATOR\020\000B\030\n\026emu.gingerps.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
