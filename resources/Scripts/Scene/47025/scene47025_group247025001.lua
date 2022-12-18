local base_info = {group_id = 247025001}
local defs = {
  gallery_id = 27008,
  operator_time_1 = 20,
  operator_time_2 = 20,
  stage2_coin_goal = 15,
  stage4_coin_goal = 15,
  abililty_region = 1149
}
local stage_challenge_id = {
  27,
  25,
  31,
  29,
  33
}
local stage_challenge_time = {
  90,
  60,
  90,
  60,
  90
}
local operator_list = {
  [1034] = {
    1022,
    1023,
    1024,
    1026,
    1036,
    1041
  },
  [1043] = {
    1022,
    1023,
    1024,
    1026,
    1036,
    1041
  },
  [1082] = {
    1133,
    1136,
    1112,
    1079,
    1080,
    1088,
    1089,
    1091
  },
  [1085] = {
    1133,
    1136,
    1112,
    1079,
    1080,
    1088,
    1089,
    1091
  }
}
local revivepoint_list = {
  [1142] = 1148
}
monsters = {
  {
    config_id = 1011,
    monster_id = 21030101,
    pos = {
      x = -580.511,
      y = 89.846,
      z = -253.403
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 1012,
    monster_id = 21030101,
    pos = {
      x = -574.805,
      y = 89.905,
      z = -247.81
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 1014,
    monster_id = 21010701,
    pos = {
      x = -576.787,
      y = 89.823,
      z = -257.143
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 1015,
    monster_id = 21010701,
    pos = {
      x = -575.209,
      y = 89.811,
      z = -253.577
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 1016,
    monster_id = 21010701,
    pos = {
      x = -571.586,
      y = 89.814,
      z = -252.478
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 1017,
    monster_id = 21010502,
    pos = {
      x = -578.792,
      y = 89.826,
      z = -253.519
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 1018,
    monster_id = 21010502,
    pos = {
      x = -574.769,
      y = 89.842,
      z = -249.8
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 1019,
    monster_id = 21020202,
    pos = {
      x = -577.014,
      y = 89.87,
      z = -251.386
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 1020,
    monster_id = 21020201,
    pos = {
      x = -579.296,
      y = 89.818,
      z = -258.61
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 1021,
    monster_id = 21020201,
    pos = {
      x = -569.604,
      y = 89.815,
      z = -249.628
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 1067,
    monster_id = 21030103,
    pos = {
      x = -581.259,
      y = 89.836,
      z = -255.022
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 1068,
    monster_id = 21030101,
    pos = {
      x = -573.43,
      y = 89.893,
      z = -247.208
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 1069,
    monster_id = 21020703,
    pos = {
      x = -578.154,
      y = 89.824,
      z = -253.275
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 1070,
    monster_id = 21020703,
    pos = {
      x = -575.46,
      y = 89.841,
      z = -250.61
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 1071,
    monster_id = 21020801,
    pos = {
      x = -577.084,
      y = 89.859,
      z = -251.697
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 1114,
    monster_id = 21020703,
    pos = {
      x = -578.323,
      y = 89.812,
      z = -257.563
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 1115,
    monster_id = 21020703,
    pos = {
      x = -577.787,
      y = 89.883,
      z = -250.949
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 1116,
    monster_id = 21020703,
    pos = {
      x = -571.085,
      y = 89.815,
      z = -250.228
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 1117,
    monster_id = 21011002,
    pos = {
      x = -582.716,
      y = 89.837,
      z = -255.152
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 1118,
    monster_id = 21011002,
    pos = {
      x = -580.231,
      y = 89.813,
      z = -248.484
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 1119,
    monster_id = 21011002,
    pos = {
      x = -574.113,
      y = 89.892,
      z = -246.89
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 1120,
    monster_id = 21010701,
    pos = {
      x = -579.442,
      y = 89.81,
      z = -256.272
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 1121,
    monster_id = 21010701,
    pos = {
      x = -576.711,
      y = 89.843,
      z = -251.744
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 1122,
    monster_id = 21010701,
    pos = {
      x = -572.76,
      y = 89.811,
      z = -250.277
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 1123,
    monster_id = 21020401,
    pos = {
      x = -577.602,
      y = 89.877,
      z = -251.496
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 1124,
    monster_id = 21020601,
    pos = {
      x = -581.485,
      y = 89.859,
      z = -253.453
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  }
}
npcs = {}
gadgets = {
  {
    config_id = 1001,
    gadget_id = 70350005,
    pos = {
      x = -556.72,
      y = 89.432,
      z = -271.092
    },
    rot = {
      x = 0.0,
      y = 315.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1002,
    gadget_id = 70360010,
    pos = {
      x = -571.361,
      y = 89.684,
      z = -256.611
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1005,
    gadget_id = 70360001,
    pos = {
      x = -581.557,
      y = 97.04,
      z = -249.739
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_guest_can_operate = true
  },
  {
    config_id = 1010,
    gadget_id = 70800275,
    pos = {
      x = -577.099,
      y = 95.038,
      z = -241.254
    },
    rot = {
      x = 0.0,
      y = 45.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 1022,
    gadget_id = 70800246,
    pos = {
      x = -584.418,
      y = 89.806,
      z = -242.7
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    is_guest_can_operate = true,
    server_global_value_config = {SGV_Switch_UpDown = 1}
  },
  {
    config_id = 1023,
    gadget_id = 70800246,
    pos = {
      x = -560.42,
      y = 89.883,
      z = -243.789
    },
    rot = {
      x = 0.0,
      y = 225.0,
      z = 0.0
    },
    level = 1,
    is_guest_can_operate = true,
    server_global_value_config = {SGV_Switch_UpDown = 1}
  },
  {
    config_id = 1025,
    gadget_id = 70800274,
    pos = {
      x = -577.105,
      y = 95.038,
      z = -248.314
    },
    rot = {
      x = 0.0,
      y = 45.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 1026,
    gadget_id = 70800246,
    pos = {
      x = -577.092,
      y = 96.315,
      z = -248.28
    },
    rot = {
      x = 0.0,
      y = 45.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart,
    is_guest_can_operate = true,
    server_global_value_config = {SGV_Left_Dir = 2}
  },
  {
    config_id = 1027,
    gadget_id = 70800274,
    pos = {
      x = -570.034,
      y = 95.038,
      z = -241.243
    },
    rot = {
      x = 0.0,
      y = 45.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 1028,
    gadget_id = 70800274,
    pos = {
      x = -566.499,
      y = 95.038,
      z = -237.707
    },
    rot = {
      x = 0.0,
      y = 45.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 1029,
    gadget_id = 70800274,
    pos = {
      x = -565.247,
      y = 95.038,
      z = -243.553
    },
    rot = {
      x = 0.0,
      y = 45.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 1030,
    gadget_id = 70800274,
    pos = {
      x = -559.428,
      y = 95.038,
      z = -244.778
    },
    rot = {
      x = 0.0,
      y = 45.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 1031,
    gadget_id = 70800275,
    pos = {
      x = -566.493,
      y = 95.038,
      z = -251.86
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 1032,
    gadget_id = 70800274,
    pos = {
      x = -573.57,
      y = 95.038,
      z = -251.849
    },
    rot = {
      x = 0.0,
      y = 45.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 1033,
    gadget_id = 70800274,
    pos = {
      x = -586.226,
      y = 106.038,
      z = -245.293
    },
    rot = {
      x = 0.0,
      y = 45.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 1034,
    gadget_id = 70800248,
    pos = {
      x = -578.781,
      y = 96.983,
      z = -241.492
    },
    rot = {
      x = 0.0,
      y = 315.0,
      z = 0.0
    },
    level = 1,
    is_guest_can_operate = true
  },
  {
    config_id = 1035,
    gadget_id = 70800275,
    pos = {
      x = -593.354,
      y = 106.038,
      z = -252.422
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 1036,
    gadget_id = 70800246,
    pos = {
      x = -596.49,
      y = 107.166,
      z = -255.587
    },
    rot = {
      x = 0.0,
      y = 45.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart,
    is_guest_can_operate = true
  },
  {
    config_id = 1037,
    gadget_id = 70800275,
    pos = {
      x = -579.194,
      y = 106.038,
      z = -252.404
    },
    rot = {
      x = 0.0,
      y = 45.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 1038,
    gadget_id = 70800274,
    pos = {
      x = -579.194,
      y = 106.038,
      z = -259.475
    },
    rot = {
      x = 0.0,
      y = 45.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 1039,
    gadget_id = 70800274,
    pos = {
      x = -582.73,
      y = 106.038,
      z = -263.01
    },
    rot = {
      x = 0.0,
      y = 45.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 1040,
    gadget_id = 70800274,
    pos = {
      x = -586.265,
      y = 106.038,
      z = -266.546
    },
    rot = {
      x = 0.0,
      y = 45.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 1041,
    gadget_id = 70800246,
    pos = {
      x = -586.252,
      y = 107.317,
      z = -266.531
    },
    rot = {
      x = 0.0,
      y = 45.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart,
    is_guest_can_operate = true
  },
  {
    config_id = 1042,
    gadget_id = 70800274,
    pos = {
      x = -572.123,
      y = 106.038,
      z = -259.475
    },
    rot = {
      x = 0.0,
      y = 45.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 1043,
    gadget_id = 70800247,
    pos = {
      x = -572.231,
      y = 108.089,
      z = -257.893
    },
    rot = {
      x = 0.0,
      y = 315.0,
      z = 0.0
    },
    level = 1,
    is_guest_can_operate = true
  },
  {
    config_id = 1044,
    gadget_id = 70800276,
    pos = {
      x = -591.543,
      y = 106.024,
      z = -261.237
    },
    rot = {
      x = 0.0,
      y = 45.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1045,
    gadget_id = 70800269,
    pos = {
      x = -584.367,
      y = 93.889,
      z = -242.444
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1046,
    gadget_id = 70800269,
    pos = {
      x = -584.367,
      y = 96.889,
      z = -242.444
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1047,
    gadget_id = 70800269,
    pos = {
      x = -573.429,
      y = 97.371,
      z = -244.578
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1048,
    gadget_id = 70800269,
    pos = {
      x = -569.579,
      y = 97.359,
      z = -240.964
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1049,
    gadget_id = 70800269,
    pos = {
      x = -566.54,
      y = 97.359,
      z = -237.975
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1050,
    gadget_id = 70800269,
    pos = {
      x = -562.902,
      y = 97.371,
      z = -248.112
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1051,
    gadget_id = 70800269,
    pos = {
      x = -566.803,
      y = 97.371,
      z = -251.75
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1052,
    gadget_id = 70800269,
    pos = {
      x = -570.377,
      y = 97.371,
      z = -255.235
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1053,
    gadget_id = 70800269,
    pos = {
      x = -577.583,
      y = 100.359,
      z = -247.262
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1054,
    gadget_id = 70800269,
    pos = {
      x = -577.583,
      y = 103.359,
      z = -247.262
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1055,
    gadget_id = 70800269,
    pos = {
      x = -577.583,
      y = 106.359,
      z = -247.262
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1056,
    gadget_id = 70800269,
    pos = {
      x = -589.718,
      y = 108.359,
      z = -248.835
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1057,
    gadget_id = 70800269,
    pos = {
      x = -593.336,
      y = 108.359,
      z = -252.509
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1058,
    gadget_id = 70800269,
    pos = {
      x = -580.773,
      y = 108.359,
      z = -250.893
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1059,
    gadget_id = 70800269,
    pos = {
      x = -576.085,
      y = 108.359,
      z = -255.772
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1060,
    gadget_id = 70800269,
    pos = {
      x = -580.48,
      y = 108.359,
      z = -260.359
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1061,
    gadget_id = 70800269,
    pos = {
      x = -584.49,
      y = 108.359,
      z = -264.328
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1062,
    gadget_id = 70800269,
    pos = {
      x = -596.41,
      y = 111.269,
      z = -255.46
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1063,
    gadget_id = 70800269,
    pos = {
      x = -596.41,
      y = 113.269,
      z = -255.46
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1064,
    gadget_id = 70800269,
    pos = {
      x = -596.41,
      y = 115.269,
      z = -255.46
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1077,
    gadget_id = 70800275,
    pos = {
      x = -566.755,
      y = 95.06,
      z = -243.389
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 1078,
    gadget_id = 70800274,
    pos = {
      x = -573.818,
      y = 95.06,
      z = -243.38
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 1079,
    gadget_id = 70800246,
    pos = {
      x = -573.826,
      y = 96.332,
      z = -243.397
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart,
    is_guest_can_operate = true
  },
  {
    config_id = 1080,
    gadget_id = 70800246,
    pos = {
      x = -560.072,
      y = 96.202,
      z = -250.737
    },
    rot = {
      x = 0.0,
      y = 225.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart,
    is_guest_can_operate = true
  },
  {
    config_id = 1081,
    gadget_id = 70800274,
    pos = {
      x = -566.742,
      y = 95.06,
      z = -250.418
    },
    rot = {
      x = 0.0,
      y = 45.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 1082,
    gadget_id = 70800248,
    pos = {
      x = -566.825,
      y = 97.044,
      z = -241.815
    },
    rot = {
      x = 0.0,
      y = 45.0,
      z = 0.0
    },
    level = 1,
    is_guest_can_operate = true
  },
  {
    config_id = 1083,
    gadget_id = 70800275,
    pos = {
      x = -563.182,
      y = 95.06,
      z = -253.958
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 1084,
    gadget_id = 70800275,
    pos = {
      x = -574.495,
      y = 95.06,
      z = -256.786
    },
    rot = {
      x = 0.0,
      y = 225.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 1085,
    gadget_id = 70800248,
    pos = {
      x = -569.473,
      y = 108.106,
      z = -259.967
    },
    rot = {
      x = 0.0,
      y = 315.0,
      z = 0.0
    },
    level = 1,
    is_guest_can_operate = true
  },
  {
    config_id = 1086,
    gadget_id = 70800276,
    pos = {
      x = -565.677,
      y = 106.022,
      z = -258.533
    },
    rot = {
      x = 0.0,
      y = 45.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1087,
    gadget_id = 70800274,
    pos = {
      x = -570.94,
      y = 106.058,
      z = -253.255
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 1088,
    gadget_id = 70800246,
    pos = {
      x = -570.942,
      y = 107.318,
      z = -253.276
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart,
    is_guest_can_operate = true
  },
  {
    config_id = 1089,
    gadget_id = 70800246,
    pos = {
      x = -567.543,
      y = 96.399,
      z = -263.729
    },
    rot = {
      x = 0.0,
      y = 315.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart,
    is_guest_can_operate = true
  },
  {
    config_id = 1090,
    gadget_id = 70800274,
    pos = {
      x = -574.475,
      y = 106.058,
      z = -256.79
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 1091,
    gadget_id = 70800246,
    pos = {
      x = -585.082,
      y = 107.336,
      z = -246.198
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart,
    is_guest_can_operate = true
  },
  {
    config_id = 1092,
    gadget_id = 70800269,
    pos = {
      x = -565.122,
      y = 97.165,
      z = -241.841
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1093,
    gadget_id = 70800274,
    pos = {
      x = -581.547,
      y = 95.058,
      z = -249.719
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop,
    route_id = 1,
    start_route = false
  },
  {
    config_id = 1094,
    gadget_id = 70800269,
    pos = {
      x = -581.294,
      y = 97.381,
      z = -249.809
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1095,
    gadget_id = 70800269,
    pos = {
      x = -570.134,
      y = 97.381,
      z = -246.751
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1096,
    gadget_id = 70800269,
    pos = {
      x = -567.074,
      y = 97.381,
      z = -250.155
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1097,
    gadget_id = 70800269,
    pos = {
      x = -563.375,
      y = 97.381,
      z = -253.765
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1098,
    gadget_id = 70800269,
    pos = {
      x = -566.787,
      y = 97.381,
      z = -257.225
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1099,
    gadget_id = 70800269,
    pos = {
      x = -570.431,
      y = 97.381,
      z = -260.82
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1100,
    gadget_id = 70800269,
    pos = {
      x = -573.67,
      y = 97.381,
      z = -257.616
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1101,
    gadget_id = 70800269,
    pos = {
      x = -577.374,
      y = 97.381,
      z = -253.967
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1102,
    gadget_id = 70800269,
    pos = {
      x = -574.717,
      y = 108.494,
      z = -256.544
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1103,
    gadget_id = 70800269,
    pos = {
      x = -578.14,
      y = 108.494,
      z = -252.948
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1104,
    gadget_id = 70800269,
    pos = {
      x = -567.708,
      y = 108.841,
      z = -257.05
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1105,
    gadget_id = 70800269,
    pos = {
      x = -564.329,
      y = 108.766,
      z = -260.47
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1106,
    gadget_id = 70800269,
    pos = {
      x = -560.305,
      y = 108.851,
      z = -256.431
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1107,
    gadget_id = 70800269,
    pos = {
      x = -556.637,
      y = 108.851,
      z = -252.851
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1108,
    gadget_id = 70800276,
    pos = {
      x = -562.133,
      y = 106.022,
      z = -247.946
    },
    rot = {
      x = 0.0,
      y = 45.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1109,
    gadget_id = 70800269,
    pos = {
      x = -559.92,
      y = 108.851,
      z = -249.805
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1110,
    gadget_id = 70800269,
    pos = {
      x = -563.529,
      y = 108.851,
      z = -246.369
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1111,
    gadget_id = 70800274,
    pos = {
      x = -560.349,
      y = 106.058,
      z = -242.66
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 1112,
    gadget_id = 70800246,
    pos = {
      x = -560.364,
      y = 107.342,
      z = -242.655
    },
    rot = {
      x = 0.0,
      y = 225.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart,
    is_guest_can_operate = true
  },
  {
    config_id = 1113,
    gadget_id = 70800269,
    pos = {
      x = -581.422,
      y = 108.461,
      z = -249.622
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1129,
    gadget_id = 70800274,
    pos = {
      x = -567.404,
      y = 95.058,
      z = -263.862
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop,
    route_id = 1,
    start_route = false
  },
  {
    config_id = 1130,
    gadget_id = 70800274,
    pos = {
      x = -585.082,
      y = 106.058,
      z = -246.184
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 1131,
    gadget_id = 70800274,
    pos = {
      x = -570.94,
      y = 106.058,
      z = -260.326
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 1132,
    gadget_id = 70800274,
    pos = {
      x = -567.404,
      y = 106.058,
      z = -263.861
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 1133,
    gadget_id = 70800246,
    pos = {
      x = -567.438,
      y = 107.327,
      z = -263.88
    },
    rot = {
      x = 0.0,
      y = 45.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart,
    is_guest_can_operate = true
  },
  {
    config_id = 1134,
    gadget_id = 70800276,
    pos = {
      x = -558.598,
      y = 106.022,
      z = -255.027
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1135,
    gadget_id = 70800274,
    pos = {
      x = -553.262,
      y = 106.058,
      z = -256.79
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 1136,
    gadget_id = 70800246,
    pos = {
      x = -553.275,
      y = 107.331,
      z = -256.81
    },
    rot = {
      x = 0.0,
      y = 315.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart,
    is_guest_can_operate = true
  },
  {
    config_id = 1137,
    gadget_id = 70800269,
    pos = {
      x = -566.816,
      y = 108.851,
      z = -249.135
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1138,
    gadget_id = 70800269,
    pos = {
      x = -566.816,
      y = 106.851,
      z = -249.135
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1153,
    gadget_id = 70800274,
    pos = {
      x = -578.011,
      y = 106.058,
      z = -253.255
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  }
}
regions = {
  {
    config_id = 1007,
    shape = RegionShape.SPHERE,
    radius = 50,
    pos = {
      x = -571.59,
      y = 89.815,
      z = -257.337
    }
  },
  {
    config_id = 1073,
    shape = RegionShape.SPHERE,
    radius = 50,
    pos = {
      x = -571.59,
      y = 89.815,
      z = -257.337
    }
  },
  {
    config_id = 1142,
    shape = RegionShape.SPHERE,
    radius = 50,
    pos = {
      x = -569.059,
      y = 89.819,
      z = -252.644
    }
  },
  {
    config_id = 1143,
    shape = RegionShape.SPHERE,
    radius = 50,
    pos = {
      x = -571.59,
      y = 89.815,
      z = -257.337
    }
  },
  {
    config_id = 1145,
    shape = RegionShape.SPHERE,
    radius = 50,
    pos = {
      x = -571.59,
      y = 89.815,
      z = -257.337
    }
  },
  {
    config_id = 1147,
    shape = RegionShape.SPHERE,
    radius = 30,
    pos = {
      x = -571.59,
      y = 89.815,
      z = -257.337
    }
  },
  {
    config_id = 1149,
    shape = RegionShape.SPHERE,
    radius = 50,
    pos = {
      x = -569.059,
      y = 89.819,
      z = -252.644
    }
  }
}
triggers = {
  {
    config_id = 1001003,
    name = "GADGET_CREATE_1003",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_1003",
    action = "action_EVENT_GADGET_CREATE_1003"
  },
  {
    config_id = 1001004,
    name = "SELECT_OPTION_1004",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_1004",
    action = "action_EVENT_SELECT_OPTION_1004"
  },
  {
    config_id = 1001006,
    name = "ANY_MONSTER_DIE_1006",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_1006",
    action = "action_EVENT_ANY_MONSTER_DIE_1006"
  },
  {
    config_id = 1001007,
    name = "ENTER_REGION_1007",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_1007",
    action = "action_EVENT_ENTER_REGION_1007",
    forbid_guest = false
  },
  {
    config_id = 1001008,
    name = "TIME_AXIS_PASS_1008",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_1008",
    action = "action_EVENT_TIME_AXIS_PASS_1008"
  },
  {
    config_id = 1001009,
    name = "ANY_MONSTER_DIE_1009",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_1009",
    action = "action_EVENT_ANY_MONSTER_DIE_1009"
  },
  {
    config_id = 1001013,
    name = "ANY_MONSTER_DIE_1013",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_1013",
    action = "action_EVENT_ANY_MONSTER_DIE_1013"
  },
  {
    config_id = 1001024,
    name = "ANY_MONSTER_DIE_1024",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_1024",
    action = "action_EVENT_ANY_MONSTER_DIE_1024"
  },
  {
    config_id = 1001065,
    name = "TIME_AXIS_PASS_1065",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_1065",
    action = "action_EVENT_TIME_AXIS_PASS_1065"
  },
  {
    config_id = 1001066,
    name = "VARIABLE_CHANGE_1066",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_1066",
    action = "action_EVENT_VARIABLE_CHANGE_1066"
  },
  {
    config_id = 1001072,
    name = "ANY_MONSTER_DIE_1072",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_1072",
    action = "action_EVENT_ANY_MONSTER_DIE_1072"
  },
  {
    config_id = 1001073,
    name = "ENTER_REGION_1073",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_1073",
    action = "action_EVENT_ENTER_REGION_1073",
    forbid_guest = false
  },
  {
    config_id = 1001074,
    name = "GADGET_CREATE_1074",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_1074",
    action = "action_EVENT_GADGET_CREATE_1074"
  },
  {
    config_id = 1001075,
    name = "TIME_AXIS_PASS_1075",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_1075",
    action = "action_EVENT_TIME_AXIS_PASS_1075"
  },
  {
    config_id = 1001076,
    name = "VARIABLE_CHANGE_1076",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_1076",
    action = "action_EVENT_VARIABLE_CHANGE_1076"
  },
  {
    config_id = 1001125,
    name = "ANY_MONSTER_DIE_1125",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_1125",
    action = "action_EVENT_ANY_MONSTER_DIE_1125"
  },
  {
    config_id = 1001126,
    name = "ANY_MONSTER_DIE_1126",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_1126",
    action = "action_EVENT_ANY_MONSTER_DIE_1126"
  },
  {
    config_id = 1001127,
    name = "VARIABLE_CHANGE_1127",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_1127",
    action = "action_EVENT_VARIABLE_CHANGE_1127"
  },
  {
    config_id = 1001128,
    name = "VARIABLE_CHANGE_1128",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_1128",
    action = "action_EVENT_VARIABLE_CHANGE_1128"
  },
  {
    config_id = 1001139,
    name = "TIME_AXIS_PASS_1139",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_1139",
    action = "action_EVENT_TIME_AXIS_PASS_1139"
  },
  {
    config_id = 1001140,
    name = "SELECT_OPTION_1140",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_1140",
    action = "action_EVENT_SELECT_OPTION_1140",
    forbid_guest = false
  },
  {
    config_id = 1001141,
    name = "TIME_AXIS_PASS_1141",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_1141",
    action = "action_EVENT_TIME_AXIS_PASS_1141"
  },
  {
    config_id = 1001142,
    name = "ENTER_REGION_1142",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "",
    action = "",
    trigger_count = 0,
    forbid_guest = false
  },
  {
    config_id = 1001143,
    name = "ENTER_REGION_1143",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_1143",
    action = "action_EVENT_ENTER_REGION_1143",
    forbid_guest = false
  },
  {
    config_id = 1001144,
    name = "TIME_AXIS_PASS_1144",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_1144",
    action = "action_EVENT_TIME_AXIS_PASS_1144"
  },
  {
    config_id = 1001145,
    name = "ENTER_REGION_1145",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_1145",
    action = "action_EVENT_ENTER_REGION_1145",
    forbid_guest = false
  },
  {
    config_id = 1001146,
    name = "TIME_AXIS_PASS_1146",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_1146",
    action = "action_EVENT_TIME_AXIS_PASS_1146"
  },
  {
    config_id = 1001147,
    name = "ENTER_REGION_1147",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_1147",
    action = "action_EVENT_ENTER_REGION_1147",
    forbid_guest = false
  },
  {
    config_id = 1001149,
    name = "ENTER_REGION_1149",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "",
    action = "",
    trigger_count = 0,
    forbid_guest = false
  },
  {
    config_id = 1001150,
    name = "DUNGEON_SETTLE_1150",
    event = EventType.EVENT_DUNGEON_SETTLE,
    source = "",
    condition = "",
    action = "action_EVENT_DUNGEON_SETTLE_1150"
  },
  {
    config_id = 1001151,
    name = "VARIABLE_CHANGE_1151",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_1151",
    action = "action_EVENT_VARIABLE_CHANGE_1151"
  },
  {
    config_id = 1001152,
    name = "VARIABLE_CHANGE_1152",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_1152",
    action = "action_EVENT_VARIABLE_CHANGE_1152"
  }
}
points = {
  {
    config_id = 1148,
    pos = {
      x = -562.434,
      y = 89.925,
      z = -265.192
    },
    rot = {
      x = 0.0,
      y = 315.0,
      z = 0.0
    }
  }
}
variables = {}
init_config = {
  suite = 1,
  end_suite = 0,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {
      1001,
      1002,
      1010,
      1022,
      1023,
      1025,
      1027,
      1028,
      1029,
      1030,
      1031,
      1032,
      1033,
      1035,
      1037,
      1038,
      1039,
      1040,
      1042,
      1077,
      1078,
      1081,
      1083,
      1084,
      1087,
      1090,
      1093,
      1111,
      1129,
      1130,
      1131,
      1132,
      1135,
      1153
    },
    regions = {1142},
    triggers = {
      "GADGET_CREATE_1003",
      "SELECT_OPTION_1004",
      "ENTER_REGION_1142",
      "DUNGEON_SETTLE_1150",
      "VARIABLE_CHANGE_1151",
      "VARIABLE_CHANGE_1152"
    },
    rand_weight = 100
  },
  {
    monsters = {
      1014,
      1015,
      1016,
      1017,
      1018
    },
    gadgets = {},
    regions = {1143},
    triggers = {
      "ANY_MONSTER_DIE_1006",
      "TIME_AXIS_PASS_1008",
      "ENTER_REGION_1143"
    },
    rand_weight = 100
  },
  {
    monsters = {
      1019,
      1020,
      1021
    },
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_1009"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      1026,
      1034,
      1036,
      1041,
      1043,
      1044,
      1045,
      1046,
      1047,
      1048,
      1049,
      1050,
      1051,
      1052,
      1053,
      1054,
      1055,
      1056,
      1057,
      1058,
      1059,
      1060,
      1061,
      1062,
      1063,
      1064
    },
    regions = {},
    triggers = {
      "VARIABLE_CHANGE_1066",
      "VARIABLE_CHANGE_1127"
    },
    rand_weight = 100
  },
  {
    monsters = {
      1067,
      1068,
      1069,
      1070
    },
    gadgets = {},
    regions = {1145},
    triggers = {
      "ANY_MONSTER_DIE_1013",
      "TIME_AXIS_PASS_1144",
      "ENTER_REGION_1145"
    },
    rand_weight = 100
  },
  {
    monsters = {
      1011,
      1012,
      1071
    },
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_1072"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      1005,
      1079,
      1080,
      1082,
      1085,
      1086,
      1088,
      1089,
      1091,
      1092,
      1094,
      1095,
      1096,
      1097,
      1098,
      1099,
      1100,
      1101,
      1102,
      1103,
      1104,
      1105,
      1106,
      1107,
      1108,
      1109,
      1110,
      1112,
      1113,
      1133,
      1134,
      1136,
      1137,
      1138
    },
    regions = {},
    triggers = {
      "GADGET_CREATE_1074",
      "VARIABLE_CHANGE_1076",
      "VARIABLE_CHANGE_1128",
      "SELECT_OPTION_1140"
    },
    rand_weight = 100
  },
  {
    monsters = {
      1114,
      1115,
      1116
    },
    gadgets = {},
    regions = {1147},
    triggers = {
      "ANY_MONSTER_DIE_1125",
      "TIME_AXIS_PASS_1146",
      "ENTER_REGION_1147"
    },
    rand_weight = 100
  },
  {
    monsters = {
      1117,
      1118,
      1119,
      1120,
      1121,
      1122
    },
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_1126"
    },
    rand_weight = 100
  },
  {
    monsters = {1123, 1124},
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_1024"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {1007},
    triggers = {
      "ENTER_REGION_1007",
      "TIME_AXIS_PASS_1065",
      "TIME_AXIS_PASS_1141"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {1073},
    triggers = {
      "ENTER_REGION_1073",
      "TIME_AXIS_PASS_1075",
      "TIME_AXIS_PASS_1139"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {1149},
    triggers = {
      "ENTER_REGION_1149"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_1003(context, evt)
  if 1002 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_1003(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 247025001, 1002, {7}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_1004(context, evt)
  if 1002 ~= evt.param1 then
    return false
  end
  if 7 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_1004(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1002, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 247025001, 2)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 247025001, 1002, 7) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "cur_stage", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_1006(context, evt)
  if ScriptLib.GetGroupMonsterCountByGroupId(context, 247025001) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_1006(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 247025001, 3)
  return 0
end
function condition_EVENT_ENTER_REGION_1007(context, evt)
  if evt.param1 ~= 1007 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_1007(context, evt)
  ScriptLib.InitTimeAxis(context, "timer2", {60, 63}, false)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_1008(context, evt)
  if "timer1" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_1008(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 247025001, 2)
  ScriptLib.RemoveExtraGroupSuite(context, 247025001, 3)
  ScriptLib.AddExtraGroupSuite(context, 247025001, 4)
  local pos = {
    x = -584.4177,
    y = 90.42826,
    z = -242.7002
  }
  local pos_follow = {
    x = 0,
    y = 0,
    z = 0
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = false,
    duration = 2,
    is_force = true,
    is_broadcast = false,
    is_recover_keep_current = true,
    delay = 0,
    is_set_follow_pos = false,
    follow_pos = pos_follow,
    is_force_walk = false,
    is_change_play_mode = false,
    is_set_screen_XY = false,
    screen_x = 0,
    screen_y = 0
  }) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_cameraLook_Begin")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "cur_stage", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1022, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 247025001, 11)
  ScriptLib.AddExtraGroupSuite(context, 247025001, 14)
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_1009(context, evt)
  if ScriptLib.GetGroupMonsterCountByGroupId(context, 247025001) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_1009(context, evt)
  local pos = {
    x = -584.4177,
    y = 90.42826,
    z = -242.7002
  }
  local pos_follow = {
    x = 0,
    y = 0,
    z = 0
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = false,
    duration = 2,
    is_force = true,
    is_broadcast = false,
    is_recover_keep_current = true,
    delay = 0,
    is_set_follow_pos = false,
    follow_pos = pos_follow,
    is_force_walk = false,
    is_change_play_mode = false,
    is_set_screen_XY = false,
    screen_x = 0,
    screen_y = 0
  }) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_cameraLook_Begin")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1022, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "cur_stage", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 247025001, 4)
  ScriptLib.EndTimeAxis(context, "timer1")
  ScriptLib.AddExtraGroupSuite(context, 247025001, 11)
  ScriptLib.AddExtraGroupSuite(context, 247025001, 14)
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_1013(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_1013(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 247025001, 6)
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_1024(context, evt)
  if ScriptLib.GetGroupMonsterCountByGroupId(context, 247025001) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_1024(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "cur_stage", 6) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  ScriptLib.EndTimeAxis(context, "timer7")
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_1065(context, evt)
  if "timer2" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_1065(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 247025001, 4)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1022, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1023, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1010, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1025, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1027, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1028, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1029, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1030, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1031, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1032, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1033, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1035, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1037, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1038, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1039, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1040, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1042, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_1066(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "coin") ~= 20 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_1066(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 247025001, 4)
  ScriptLib.AddExtraGroupSuite(context, 247025001, 5)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "cur_stage", 3) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1022, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.EndTimeAxis(context, "timer2")
  ScriptLib.RemoveExtraGroupSuite(context, 247025001, 11)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1010, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1025, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1027, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1028, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1029, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1030, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1031, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1032, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1033, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1035, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1037, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1038, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1039, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1040, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1042, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_1072(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_1072(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 247025001, 7)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1023, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "cur_stage", 4) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  local pos = {
    x = -560.1932,
    y = 90.48592,
    z = -243.5361
  }
  local pos_follow = {
    x = 0,
    y = 0,
    z = 0
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = false,
    duration = 2,
    is_force = true,
    is_broadcast = false,
    is_recover_keep_current = true,
    delay = 0,
    is_set_follow_pos = false,
    follow_pos = pos_follow,
    is_force_walk = false,
    is_change_play_mode = false,
    is_set_screen_XY = false,
    screen_x = 0,
    screen_y = 0
  }) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_cameraLook_Begin")
    return -1
  end
  ScriptLib.EndTimeAxis(context, "timer4")
  ScriptLib.AddExtraGroupSuite(context, 247025001, 12)
  ScriptLib.AddExtraGroupSuite(context, 247025001, 15)
  return 0
end
function condition_EVENT_ENTER_REGION_1073(context, evt)
  if evt.param1 ~= 1073 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_1073(context, evt)
  ScriptLib.InitTimeAxis(context, "timer5", {60, 63}, false)
  return 0
end
function condition_EVENT_GADGET_CREATE_1074(context, evt)
  if 1005 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_1074(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 247025001, 1005, {788}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_1075(context, evt)
  if "timer5" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_1075(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 247025001, 7)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1022, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1023, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1077, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1078, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1081, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1083, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1084, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1087, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1093, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1111, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1129, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1130, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1131, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1132, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1135, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1090, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1153, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_1076(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "coin") ~= 20 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_1076(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 247025001, 7)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "cur_stage", 5) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1023, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 247025001, 8)
  ScriptLib.EndTimeAxis(context, "timer5")
  ScriptLib.RemoveExtraGroupSuite(context, 247025001, 12)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1077, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1078, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1081, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1083, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1084, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1087, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1093, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1111, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1129, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1130, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1131, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1132, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1135, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1090, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1153, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_1125(context, evt)
  if ScriptLib.GetGroupMonsterCountByGroupId(context, 247025001) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_1125(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 247025001, 9)
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_1126(context, evt)
  if ScriptLib.GetGroupMonsterCountByGroupId(context, 247025001) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_1126(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 247025001, 10)
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_1127(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "coin") ~= 15 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_1127(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 470250101) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_1128(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "coin") ~= 15 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_1128(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 470250102) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_1139(context, evt)
  if "timer5" ~= evt.source_name or 2 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_1139(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 247025001, 8)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "cur_stage", 5) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_1140(context, evt)
  if 1005 ~= evt.param1 then
    return false
  end
  if 788 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_1140(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 247025001, 1005, 788) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 1093) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_1141(context, evt)
  if "timer2" ~= evt.source_name or 2 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_1141(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 247025001, 5)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "cur_stage", 3) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_1143(context, evt)
  if evt.param1 ~= 1143 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_1143(context, evt)
  ScriptLib.InitTimeAxis(context, "timer1", {90}, false)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_1144(context, evt)
  if "timer4" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_1144(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 247025001, 5)
  ScriptLib.RemoveExtraGroupSuite(context, 247025001, 6)
  ScriptLib.AddExtraGroupSuite(context, 247025001, 7)
  local pos = {
    x = -560.4197,
    y = 89.883,
    z = -243.7889
  }
  local pos_follow = {
    x = 0,
    y = 0,
    z = 0
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = false,
    duration = 2,
    is_force = true,
    is_broadcast = false,
    is_recover_keep_current = true,
    delay = 0,
    is_set_follow_pos = false,
    follow_pos = pos_follow,
    is_force_walk = false,
    is_change_play_mode = false,
    is_set_screen_XY = false,
    screen_x = 0,
    screen_y = 0
  }) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_cameraLook_Begin")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "cur_stage", 4) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1023, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 247025001, 12)
  ScriptLib.AddExtraGroupSuite(context, 247025001, 15)
  return 0
end
function condition_EVENT_ENTER_REGION_1145(context, evt)
  if evt.param1 ~= 1145 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_1145(context, evt)
  ScriptLib.InitTimeAxis(context, "timer4", {90}, false)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_1146(context, evt)
  if "timer7" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_1146(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 247025001, 8)
  ScriptLib.RemoveExtraGroupSuite(context, 247025001, 9)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "cur_stage", 6) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  ScriptLib.RemoveExtraGroupSuite(context, 247025001, 10)
  return 0
end
function condition_EVENT_ENTER_REGION_1147(context, evt)
  if evt.param1 ~= 1147 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_1147(context, evt)
  ScriptLib.InitTimeAxis(context, "timer7", {90}, false)
  return 0
end
function action_EVENT_DUNGEON_SETTLE_1150(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 247025001, 2)
  ScriptLib.RemoveExtraGroupSuite(context, 247025001, 3)
  ScriptLib.RemoveExtraGroupSuite(context, 247025001, 5)
  ScriptLib.RemoveExtraGroupSuite(context, 247025001, 6)
  ScriptLib.RemoveExtraGroupSuite(context, 247025001, 8)
  ScriptLib.RemoveExtraGroupSuite(context, 247025001, 9)
  ScriptLib.RemoveExtraGroupSuite(context, 247025001, 10)
  ScriptLib.RemoveExtraGroupSuite(context, 247025001, 11)
  ScriptLib.RemoveExtraGroupSuite(context, 247025001, 12)
  ScriptLib.RemoveExtraGroupSuite(context, 247025001, 14)
  ScriptLib.RemoveExtraGroupSuite(context, 247025001, 15)
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_1151(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "cur_stage") ~= 2 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_1151(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1010, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1025, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1027, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1028, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1029, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1030, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1031, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1032, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1033, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1035, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1037, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1038, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1039, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1040, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1042, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_1152(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "cur_stage") ~= 4 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_1152(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1077, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1078, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1081, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1083, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1084, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1087, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1093, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1111, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1129, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1130, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1131, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1132, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1135, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1090, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1153, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
require("V3_1/Activity_WindMaze")
require("V3_1/Activity_WindMaze_Battle")
