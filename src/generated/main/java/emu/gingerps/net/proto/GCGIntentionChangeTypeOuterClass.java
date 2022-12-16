// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGIntentionChangeType.proto

package emu.gingerps.net.proto;

public final class GCGIntentionChangeTypeOuterClass {
  private GCGIntentionChangeTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code GCGIntentionChangeType}
   */
  public enum GCGIntentionChangeType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>GCG_INTENTION_CHANGE_TYPE_NONE = 0;</code>
     */
    GCG_INTENTION_CHANGE_TYPE_NONE(0),
    /**
     * <code>GCG_INTENTION_CHANGE_TYPE_RM = 1;</code>
     */
    GCG_INTENTION_CHANGE_TYPE_RM(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>GCG_INTENTION_CHANGE_TYPE_NONE = 0;</code>
     */
    public static final int GCG_INTENTION_CHANGE_TYPE_NONE_VALUE = 0;
    /**
     * <code>GCG_INTENTION_CHANGE_TYPE_RM = 1;</code>
     */
    public static final int GCG_INTENTION_CHANGE_TYPE_RM_VALUE = 1;


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
    public static GCGIntentionChangeType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GCGIntentionChangeType forNumber(int value) {
      switch (value) {
        case 0: return GCG_INTENTION_CHANGE_TYPE_NONE;
        case 1: return GCG_INTENTION_CHANGE_TYPE_RM;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GCGIntentionChangeType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GCGIntentionChangeType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GCGIntentionChangeType>() {
            public GCGIntentionChangeType findValueByNumber(int number) {
              return GCGIntentionChangeType.forNumber(number);
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
      return emu.gingerps.net.proto.GCGIntentionChangeTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final GCGIntentionChangeType[] VALUES = values();

    public static GCGIntentionChangeType valueOf(
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

    private GCGIntentionChangeType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:GCGIntentionChangeType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034GCGIntentionChangeType.proto*^\n\026GCGInt" +
      "entionChangeType\022\"\n\036GCG_INTENTION_CHANGE" +
      "_TYPE_NONE\020\000\022 \n\034GCG_INTENTION_CHANGE_TYP" +
      "E_RM\020\001B\033\n\031emu.gingerps.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
