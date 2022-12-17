// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGSettleOption.proto

package emu.gingerps.net.proto;

public final class GCGSettleOptionOuterClass {
  private GCGSettleOptionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code GCGSettleOption}
   */
  public enum GCGSettleOption
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>GCG_SETTLE_OPTION_OPT_NONE = 0;</code>
     */
    GCG_SETTLE_OPTION_OPT_NONE(0),
    /**
     * <code>GCG_SETTLE_OPTION_OPT_EXIT = 1;</code>
     */
    GCG_SETTLE_OPTION_OPT_EXIT(1),
    /**
     * <code>GCG_SETTLE_OPTION_OPT_CONTINUE = 2;</code>
     */
    GCG_SETTLE_OPTION_OPT_CONTINUE(2),
    /**
     * <code>GCG_SETTLE_OPTION_OPT_RESTART = 3;</code>
     */
    GCG_SETTLE_OPTION_OPT_RESTART(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>GCG_SETTLE_OPTION_OPT_NONE = 0;</code>
     */
    public static final int GCG_SETTLE_OPTION_OPT_NONE_VALUE = 0;
    /**
     * <code>GCG_SETTLE_OPTION_OPT_EXIT = 1;</code>
     */
    public static final int GCG_SETTLE_OPTION_OPT_EXIT_VALUE = 1;
    /**
     * <code>GCG_SETTLE_OPTION_OPT_CONTINUE = 2;</code>
     */
    public static final int GCG_SETTLE_OPTION_OPT_CONTINUE_VALUE = 2;
    /**
     * <code>GCG_SETTLE_OPTION_OPT_RESTART = 3;</code>
     */
    public static final int GCG_SETTLE_OPTION_OPT_RESTART_VALUE = 3;


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
    public static GCGSettleOption valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GCGSettleOption forNumber(int value) {
      switch (value) {
        case 0: return GCG_SETTLE_OPTION_OPT_NONE;
        case 1: return GCG_SETTLE_OPTION_OPT_EXIT;
        case 2: return GCG_SETTLE_OPTION_OPT_CONTINUE;
        case 3: return GCG_SETTLE_OPTION_OPT_RESTART;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GCGSettleOption>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GCGSettleOption> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GCGSettleOption>() {
            public GCGSettleOption findValueByNumber(int number) {
              return GCGSettleOption.forNumber(number);
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
      return emu.gingerps.net.proto.GCGSettleOptionOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final GCGSettleOption[] VALUES = values();

    public static GCGSettleOption valueOf(
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

    private GCGSettleOption(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:GCGSettleOption)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025GCGSettleOption.proto*\230\001\n\017GCGSettleOpt" +
      "ion\022\036\n\032GCG_SETTLE_OPTION_OPT_NONE\020\000\022\036\n\032G" +
      "CG_SETTLE_OPTION_OPT_EXIT\020\001\022\"\n\036GCG_SETTL" +
      "E_OPTION_OPT_CONTINUE\020\002\022!\n\035GCG_SETTLE_OP" +
      "TION_OPT_RESTART\020\003B\030\n\026emu.gingerps.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
