// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GadgetGuestBanDrop.proto

package emu.gingerps.net.proto;

public final class GadgetGuestBanDropOuterClass {
  private GadgetGuestBanDropOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code GadgetGuestBanDrop}
   */
  public enum GadgetGuestBanDrop
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>GADGET_GUEST_BAN_DROP_NONE = 0;</code>
     */
    GADGET_GUEST_BAN_DROP_NONE(0),
    /**
     * <code>GADGET_GUEST_BAN_DROP_DIE_LUA = 1;</code>
     */
    GADGET_GUEST_BAN_DROP_DIE_LUA(1),
    /**
     * <code>GADGET_GUEST_BAN_DROP_SUBFIELD = 2;</code>
     */
    GADGET_GUEST_BAN_DROP_SUBFIELD(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>GADGET_GUEST_BAN_DROP_NONE = 0;</code>
     */
    public static final int GADGET_GUEST_BAN_DROP_NONE_VALUE = 0;
    /**
     * <code>GADGET_GUEST_BAN_DROP_DIE_LUA = 1;</code>
     */
    public static final int GADGET_GUEST_BAN_DROP_DIE_LUA_VALUE = 1;
    /**
     * <code>GADGET_GUEST_BAN_DROP_SUBFIELD = 2;</code>
     */
    public static final int GADGET_GUEST_BAN_DROP_SUBFIELD_VALUE = 2;


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
    public static GadgetGuestBanDrop valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GadgetGuestBanDrop forNumber(int value) {
      switch (value) {
        case 0: return GADGET_GUEST_BAN_DROP_NONE;
        case 1: return GADGET_GUEST_BAN_DROP_DIE_LUA;
        case 2: return GADGET_GUEST_BAN_DROP_SUBFIELD;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GadgetGuestBanDrop>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GadgetGuestBanDrop> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GadgetGuestBanDrop>() {
            public GadgetGuestBanDrop findValueByNumber(int number) {
              return GadgetGuestBanDrop.forNumber(number);
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
      return emu.gingerps.net.proto.GadgetGuestBanDropOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final GadgetGuestBanDrop[] VALUES = values();

    public static GadgetGuestBanDrop valueOf(
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

    private GadgetGuestBanDrop(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:GadgetGuestBanDrop)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030GadgetGuestBanDrop.proto*{\n\022GadgetGues" +
      "tBanDrop\022\036\n\032GADGET_GUEST_BAN_DROP_NONE\020\000" +
      "\022!\n\035GADGET_GUEST_BAN_DROP_DIE_LUA\020\001\022\"\n\036G" +
      "ADGET_GUEST_BAN_DROP_SUBFIELD\020\002B\030\n\026emu.g" +
      "ingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
