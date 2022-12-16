// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SalesmanStatusType.proto

package emu.gingerps.net.proto;

public final class SalesmanStatusTypeOuterClass {
  private SalesmanStatusTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code SalesmanStatusType}
   */
  public enum SalesmanStatusType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>SALESMAN_STATUS_TYPE_NONE = 0;</code>
     */
    SALESMAN_STATUS_TYPE_NONE(0),
    /**
     * <code>SALESMAN_STATUS_TYPE_UNSTARTED = 1;</code>
     */
    SALESMAN_STATUS_TYPE_UNSTARTED(1),
    /**
     * <code>SALESMAN_STATUS_TYPE_STARTED = 2;</code>
     */
    SALESMAN_STATUS_TYPE_STARTED(2),
    /**
     * <code>SALESMAN_STATUS_TYPE_DELIVERED = 3;</code>
     */
    SALESMAN_STATUS_TYPE_DELIVERED(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>SALESMAN_STATUS_TYPE_NONE = 0;</code>
     */
    public static final int SALESMAN_STATUS_TYPE_NONE_VALUE = 0;
    /**
     * <code>SALESMAN_STATUS_TYPE_UNSTARTED = 1;</code>
     */
    public static final int SALESMAN_STATUS_TYPE_UNSTARTED_VALUE = 1;
    /**
     * <code>SALESMAN_STATUS_TYPE_STARTED = 2;</code>
     */
    public static final int SALESMAN_STATUS_TYPE_STARTED_VALUE = 2;
    /**
     * <code>SALESMAN_STATUS_TYPE_DELIVERED = 3;</code>
     */
    public static final int SALESMAN_STATUS_TYPE_DELIVERED_VALUE = 3;


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
    public static SalesmanStatusType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static SalesmanStatusType forNumber(int value) {
      switch (value) {
        case 0: return SALESMAN_STATUS_TYPE_NONE;
        case 1: return SALESMAN_STATUS_TYPE_UNSTARTED;
        case 2: return SALESMAN_STATUS_TYPE_STARTED;
        case 3: return SALESMAN_STATUS_TYPE_DELIVERED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SalesmanStatusType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        SalesmanStatusType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SalesmanStatusType>() {
            public SalesmanStatusType findValueByNumber(int number) {
              return SalesmanStatusType.forNumber(number);
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
      return emu.gingerps.net.proto.SalesmanStatusTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final SalesmanStatusType[] VALUES = values();

    public static SalesmanStatusType valueOf(
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

    private SalesmanStatusType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:SalesmanStatusType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030SalesmanStatusType.proto*\235\001\n\022SalesmanS" +
      "tatusType\022\035\n\031SALESMAN_STATUS_TYPE_NONE\020\000" +
      "\022\"\n\036SALESMAN_STATUS_TYPE_UNSTARTED\020\001\022 \n\034" +
      "SALESMAN_STATUS_TYPE_STARTED\020\002\022\"\n\036SALESM" +
      "AN_STATUS_TYPE_DELIVERED\020\003B\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
