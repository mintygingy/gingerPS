// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SvrMsgId.proto

package emu.gingerps.net.proto;

public final class SvrMsgIdOuterClass {
  private SvrMsgIdOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code SvrMsgId}
   */
  public enum SvrMsgId
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>SVR_MSG_ID_UNKNOWN = 0;</code>
     */
    SVR_MSG_ID_UNKNOWN(0),
    /**
     * <code>SVR_MSG_ID_BLOCK_REFRESH_COUNTDOWN = 1;</code>
     */
    SVR_MSG_ID_BLOCK_REFRESH_COUNTDOWN(1),
    /**
     * <code>SVR_MSG_ID_AVATAR_REVIVE_BY_STATUE = 2;</code>
     */
    SVR_MSG_ID_AVATAR_REVIVE_BY_STATUE(2),
    /**
     * <code>SVR_MSG_ID_DAILY_TASK_REWARD_MAX_NUM = 3;</code>
     */
    SVR_MSG_ID_DAILY_TASK_REWARD_MAX_NUM(3),
    /**
     * <code>SVR_MSG_ID_ROUTINE_TYPE_NOT_OPEN = 4;</code>
     */
    SVR_MSG_ID_ROUTINE_TYPE_NOT_OPEN(4),
    /**
     * <code>SVR_MSG_ID_ROUTINE_TYPE_REWARD_MAX_NUM = 5;</code>
     */
    SVR_MSG_ID_ROUTINE_TYPE_REWARD_MAX_NUM(5),
    /**
     * <code>SVR_MSG_ID_MECHANICUS_COIN_LIMIT = 6;</code>
     */
    SVR_MSG_ID_MECHANICUS_COIN_LIMIT(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>SVR_MSG_ID_UNKNOWN = 0;</code>
     */
    public static final int SVR_MSG_ID_UNKNOWN_VALUE = 0;
    /**
     * <code>SVR_MSG_ID_BLOCK_REFRESH_COUNTDOWN = 1;</code>
     */
    public static final int SVR_MSG_ID_BLOCK_REFRESH_COUNTDOWN_VALUE = 1;
    /**
     * <code>SVR_MSG_ID_AVATAR_REVIVE_BY_STATUE = 2;</code>
     */
    public static final int SVR_MSG_ID_AVATAR_REVIVE_BY_STATUE_VALUE = 2;
    /**
     * <code>SVR_MSG_ID_DAILY_TASK_REWARD_MAX_NUM = 3;</code>
     */
    public static final int SVR_MSG_ID_DAILY_TASK_REWARD_MAX_NUM_VALUE = 3;
    /**
     * <code>SVR_MSG_ID_ROUTINE_TYPE_NOT_OPEN = 4;</code>
     */
    public static final int SVR_MSG_ID_ROUTINE_TYPE_NOT_OPEN_VALUE = 4;
    /**
     * <code>SVR_MSG_ID_ROUTINE_TYPE_REWARD_MAX_NUM = 5;</code>
     */
    public static final int SVR_MSG_ID_ROUTINE_TYPE_REWARD_MAX_NUM_VALUE = 5;
    /**
     * <code>SVR_MSG_ID_MECHANICUS_COIN_LIMIT = 6;</code>
     */
    public static final int SVR_MSG_ID_MECHANICUS_COIN_LIMIT_VALUE = 6;


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
    public static SvrMsgId valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static SvrMsgId forNumber(int value) {
      switch (value) {
        case 0: return SVR_MSG_ID_UNKNOWN;
        case 1: return SVR_MSG_ID_BLOCK_REFRESH_COUNTDOWN;
        case 2: return SVR_MSG_ID_AVATAR_REVIVE_BY_STATUE;
        case 3: return SVR_MSG_ID_DAILY_TASK_REWARD_MAX_NUM;
        case 4: return SVR_MSG_ID_ROUTINE_TYPE_NOT_OPEN;
        case 5: return SVR_MSG_ID_ROUTINE_TYPE_REWARD_MAX_NUM;
        case 6: return SVR_MSG_ID_MECHANICUS_COIN_LIMIT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SvrMsgId>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        SvrMsgId> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SvrMsgId>() {
            public SvrMsgId findValueByNumber(int number) {
              return SvrMsgId.forNumber(number);
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
      return emu.gingerps.net.proto.SvrMsgIdOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final SvrMsgId[] VALUES = values();

    public static SvrMsgId valueOf(
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

    private SvrMsgId(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:SvrMsgId)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016SvrMsgId.proto*\224\002\n\010SvrMsgId\022\026\n\022SVR_MSG" +
      "_ID_UNKNOWN\020\000\022&\n\"SVR_MSG_ID_BLOCK_REFRES" +
      "H_COUNTDOWN\020\001\022&\n\"SVR_MSG_ID_AVATAR_REVIV" +
      "E_BY_STATUE\020\002\022(\n$SVR_MSG_ID_DAILY_TASK_R" +
      "EWARD_MAX_NUM\020\003\022$\n SVR_MSG_ID_ROUTINE_TY" +
      "PE_NOT_OPEN\020\004\022*\n&SVR_MSG_ID_ROUTINE_TYPE" +
      "_REWARD_MAX_NUM\020\005\022$\n SVR_MSG_ID_MECHANIC" +
      "US_COIN_LIMIT\020\006B\033\n\031emu.gingerps.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
