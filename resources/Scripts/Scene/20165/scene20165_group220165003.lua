local base_info = {group_id = 220165003}
local defs = {
  hot_spots = {
    [3032] = {teleport_gadget = 3001, hot_spot = 3023},
    [3033] = {teleport_gadget = 3005, hot_spot = 3024},
    [3034] = {teleport_gadget = 3003, hot_spot = 3025},
    [3035] = {teleport_gadget = 3004, hot_spot = 3026},
    [3036] = {teleport_gadget = 3006, hot_spot = 3027},
    [3037] = {teleport_gadget = 3020, hot_spot = 3028},
    [3038] = {teleport_gadget = 3016, hot_spot = 3030},
    [3039] = {teleport_gadget = 3002, hot_spot = 3029},
    [3040] = {teleport_gadget = 3007, hot_spot = 3031}
  },
  hotspot_cs = 3060,
  target_region = {
    3032,
    3033,
    3034,
    3035,
    3036,
    3037,
    3038,
    3039,
    3040
  }
}
monsters = {}
npcs = {}
gadgets = {
  [3001] = {
    config_id = 3001,
    gadget_id = 70320041,
    pos = {
      x = 227.584,
      y = 14.454,
      z = 168.194
    },
    rot = {
      x = 0.0,
      y = 26.725,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  [3002] = {
    config_id = 3002,
    gadget_id = 70320041,
    pos = {
      x = 872.689,
      y = 25.606,
      z = 224.238
    },
    rot = {
      x = 0.0,
      y = 308.64,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  [3003] = {
    config_id = 3003,
    gadget_id = 70320041,
    pos = {
      x = 872.689,
      y = 25.606,
      z = 224.238
    },
    rot = {
      x = 0.0,
      y = 308.64,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  [3004] = {
    config_id = 3004,
    gadget_id = 70320041,
    pos = {
      x = 272.559,
      y = 26.421,
      z = 217.591
    },
    rot = {
      x = 0.0,
      y = 286.999,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  [3005] = {
    config_id = 3005,
    gadget_id = 70320041,
    pos = {
      x = -536.585,
      y = 23.177,
      z = 192.025
    },
    rot = {
      x = 0.0,
      y = 1.988,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  [3006] = {
    config_id = 3006,
    gadget_id = 70320041,
    pos = {
      x = 813.956,
      y = 15.627,
      z = 265.791
    },
    rot = {
      x = 0.0,
      y = 123.832,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart,
    server_global_value_config = {SGV_DreamPortal_KillAmberBuff = 1}
  },
  [3007] = {
    config_id = 3007,
    gadget_id = 70320041,
    pos = {
      x = 227.386,
      y = 14.455,
      z = 168.209
    },
    rot = {
      x = 0.0,
      y = 26.725,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart,
    server_global_value_config = {SGV_DreamPortal_KillAmberBuff = 1}
  },
  [3016] = {
    config_id = 3016,
    gadget_id = 70320041,
    pos = {
      x = 272.542,
      y = 26.418,
      z = 217.585
    },
    rot = {
      x = 0.0,
      y = 286.999,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  [3020] = {
    config_id = 3020,
    gadget_id = 70320041,
    pos = {
      x = 537.867,
      y = 51.311,
      z = 777.752
    },
    rot = {
      x = 0.0,
      y = 123.832,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  [3023] = {
    config_id = 3023,
    gadget_id = 70320064,
    pos = {
      x = -551.637,
      y = 22.615,
      z = 181.783
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [3024] = {
    config_id = 3024,
    gadget_id = 70320065,
    pos = {
      x = 930.803,
      y = 15.893,
      z = 222.395
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [3025] = {
    config_id = 3025,
    gadget_id = 70320066,
    pos = {
      x = 293.4,
      y = 27.517,
      z = 218.706
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [3026] = {
    config_id = 3026,
    gadget_id = 70320067,
    pos = {
      x = 886.435,
      y = 24.974,
      z = 211.68
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [3027] = {
    config_id = 3027,
    gadget_id = 70320068,
    pos = {
      x = 546.677,
      y = 51.154,
      z = 801.746
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [3028] = {
    config_id = 3028,
    gadget_id = 70320069,
    pos = {
      x = 323.515,
      y = 17.138,
      z = 234.651
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [3029] = {
    config_id = 3029,
    gadget_id = 70320070,
    pos = {
      x = 293.4,
      y = 27.517,
      z = 218.706
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [3030] = {
    config_id = 3030,
    gadget_id = 70320071,
    pos = {
      x = 890.635,
      y = 27.21,
      z = 207.95
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [3031] = {
    config_id = 3031,
    gadget_id = 70320072,
    pos = {
      x = -575.642,
      y = 45.743,
      z = 778.365
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [3060] = {
    config_id = 3060,
    gadget_id = 70320074,
    pos = {
      x = -556.667,
      y = 49.848,
      z = 791.714
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {
  [3008] = {
    config_id = 3008,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 929.81,
      y = 16.412,
      z = 222.788
    }
  },
  [3018] = {
    config_id = 3018,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = -551.346,
      y = 22.602,
      z = 181.401
    }
  },
  [3019] = {
    config_id = 3019,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 546.175,
      y = 52.067,
      z = 801.674
    }
  },
  [3021] = {
    config_id = 3021,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 323.144,
      y = 17.609,
      z = 234.377
    }
  },
  [3022] = {
    config_id = 3022,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = -575.752,
      y = 45.743,
      z = 778.705
    }
  },
  [3032] = {
    config_id = 3032,
    shape = RegionShape.SPHERE,
    radius = 40,
    pos = {
      x = 232.324,
      y = 16.742,
      z = 177.382
    }
  },
  [3033] = {
    config_id = 3033,
    shape = RegionShape.SPHERE,
    radius = 20,
    pos = {
      x = -551.969,
      y = 22.927,
      z = 190.659
    }
  },
  [3034] = {
    config_id = 3034,
    shape = RegionShape.SPHERE,
    radius = 25,
    pos = {
      x = 875.876,
      y = 25.613,
      z = 218.519
    }
  },
  [3035] = {
    config_id = 3035,
    shape = RegionShape.SPHERE,
    radius = 25,
    pos = {
      x = 277.56,
      y = 27.19,
      z = 222.264
    }
  },
  [3036] = {
    config_id = 3036,
    shape = RegionShape.SPHERE,
    radius = 25,
    pos = {
      x = 816.276,
      y = 14.96,
      z = 263.641
    }
  },
  [3037] = {
    config_id = 3037,
    shape = RegionShape.SPHERE,
    radius = 25,
    pos = {
      x = 542.248,
      y = 52.318,
      z = 777.752
    }
  },
  [3038] = {
    config_id = 3038,
    shape = RegionShape.SPHERE,
    radius = 25,
    pos = {
      x = 279.696,
      y = 27.517,
      z = 220.036
    }
  },
  [3039] = {
    config_id = 3039,
    shape = RegionShape.SPHERE,
    radius = 25,
    pos = {
      x = 875.221,
      y = 27.21,
      z = 217.199
    }
  },
  [3040] = {
    config_id = 3040,
    shape = RegionShape.SPHERE,
    radius = 20,
    pos = {
      x = 231.453,
      y = 16.122,
      z = 176.951
    }
  },
  [3043] = {
    config_id = 3043,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = -551.346,
      y = 22.602,
      z = 181.236
    }
  },
  [3046] = {
    config_id = 3046,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 929.81,
      y = 16.412,
      z = 222.788
    }
  },
  [3050] = {
    config_id = 3050,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 546.175,
      y = 52.067,
      z = 801.674
    }
  },
  [3051] = {
    config_id = 3051,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = -575.752,
      y = 45.743,
      z = 778.705
    }
  },
  [3052] = {
    config_id = 3052,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 323.144,
      y = 17.609,
      z = 234.377
    }
  },
  [3055] = {
    config_id = 3055,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 227.534,
      y = 13.0,
      z = 165.773
    }
  },
  [3056] = {
    config_id = 3056,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = -534.035,
      y = 22.543,
      z = 193.387
    }
  },
  [3057] = {
    config_id = 3057,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 811.437,
      y = 15.236,
      z = 267.225
    }
  },
  [3058] = {
    config_id = 3058,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 535.572,
      y = 50.744,
      z = 778.226
    }
  },
  [3059] = {
    config_id = 3059,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 227.716,
      y = 15.13,
      z = 165.126
    }
  }
}
triggers = {
  {
    config_id = 1003008,
    name = "ENTER_REGION_3008",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3008",
    action = "action_EVENT_ENTER_REGION_3008"
  },
  {
    config_id = 1003018,
    name = "ENTER_REGION_3018",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3018",
    action = "action_EVENT_ENTER_REGION_3018"
  },
  {
    config_id = 1003019,
    name = "ENTER_REGION_3019",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3019",
    action = "action_EVENT_ENTER_REGION_3019"
  },
  {
    config_id = 1003021,
    name = "ENTER_REGION_3021",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3021",
    action = "action_EVENT_ENTER_REGION_3021"
  },
  {
    config_id = 1003022,
    name = "ENTER_REGION_3022",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3022",
    action = "action_EVENT_ENTER_REGION_3022"
  },
  {
    config_id = 1003041,
    name = "QUEST_FINISH_3041",
    event = EventType.EVENT_QUEST_FINISH,
    source = "",
    condition = "condition_EVENT_QUEST_FINISH_3041",
    action = "action_EVENT_QUEST_FINISH_3041"
  },
  {
    config_id = 1003042,
    name = "QUEST_FINISH_3042",
    event = EventType.EVENT_QUEST_FINISH,
    source = "",
    condition = "condition_EVENT_QUEST_FINISH_3042",
    action = "action_EVENT_QUEST_FINISH_3042"
  },
  {
    config_id = 1003043,
    name = "ENTER_REGION_3043",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3043",
    action = "action_EVENT_ENTER_REGION_3043"
  },
  {
    config_id = 1003044,
    name = "TIME_AXIS_PASS_3044",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_3044",
    action = "action_EVENT_TIME_AXIS_PASS_3044"
  },
  {
    config_id = 1003045,
    name = "TIME_AXIS_PASS_3045",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_3045",
    action = "action_EVENT_TIME_AXIS_PASS_3045"
  },
  {
    config_id = 1003046,
    name = "ENTER_REGION_3046",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3046",
    action = "action_EVENT_ENTER_REGION_3046"
  },
  {
    config_id = 1003047,
    name = "TIME_AXIS_PASS_3047",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_3047",
    action = "action_EVENT_TIME_AXIS_PASS_3047"
  },
  {
    config_id = 1003048,
    name = "TIME_AXIS_PASS_3048",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_3048",
    action = "action_EVENT_TIME_AXIS_PASS_3048"
  },
  {
    config_id = 1003049,
    name = "TIME_AXIS_PASS_3049",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_3049",
    action = "action_EVENT_TIME_AXIS_PASS_3049"
  },
  {
    config_id = 1003050,
    name = "ENTER_REGION_3050",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3050",
    action = "action_EVENT_ENTER_REGION_3050"
  },
  {
    config_id = 1003051,
    name = "ENTER_REGION_3051",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3051",
    action = "action_EVENT_ENTER_REGION_3051"
  },
  {
    config_id = 1003052,
    name = "ENTER_REGION_3052",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3052",
    action = "action_EVENT_ENTER_REGION_3052"
  },
  {
    config_id = 1003053,
    name = "GADGET_LUA_NOTIFY_3053",
    event = EventType.EVENT_GADGET_LUA_NOTIFY,
    source = "",
    condition = "condition_EVENT_GADGET_LUA_NOTIFY_3053",
    action = "action_EVENT_GADGET_LUA_NOTIFY_3053"
  },
  {
    config_id = 1003054,
    name = "GROUP_LOAD_3054",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_3054"
  },
  {
    config_id = 1003055,
    name = "ENTER_REGION_3055",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3055",
    action = "action_EVENT_ENTER_REGION_3055"
  },
  {
    config_id = 1003056,
    name = "ENTER_REGION_3056",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3056",
    action = "action_EVENT_ENTER_REGION_3056"
  },
  {
    config_id = 1003057,
    name = "ENTER_REGION_3057",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3057",
    action = "action_EVENT_ENTER_REGION_3057"
  },
  {
    config_id = 1003058,
    name = "ENTER_REGION_3058",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3058",
    action = "action_EVENT_ENTER_REGION_3058"
  },
  {
    config_id = 1003059,
    name = "ENTER_REGION_3059",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3059",
    action = "action_EVENT_ENTER_REGION_3059"
  },
  {
    config_id = 1003061,
    name = "QUEST_FINISH_3061",
    event = EventType.EVENT_QUEST_FINISH,
    source = "1301408",
    condition = "",
    action = "action_EVENT_QUEST_FINISH_3061"
  },
  {
    config_id = 1003062,
    name = "QUEST_FINISH_3062",
    event = EventType.EVENT_QUEST_FINISH,
    source = "1301420",
    condition = "",
    action = "action_EVENT_QUEST_FINISH_3062"
  },
  {
    config_id = 1003063,
    name = "QUEST_FINISH_3063",
    event = EventType.EVENT_QUEST_FINISH,
    source = "1301421",
    condition = "",
    action = "action_EVENT_QUEST_FINISH_3063"
  }
}
points = {
  {
    config_id = 3009,
    pos = {
      x = -551.637,
      y = 22.615,
      z = 179.114
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    }
  },
  {
    config_id = 3010,
    pos = {
      x = 929.328,
      y = 15.34,
      z = 223.1
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    }
  },
  {
    config_id = 3011,
    pos = {
      x = 293.4,
      y = 25.764,
      z = 218.706
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    }
  },
  {
    config_id = 3012,
    pos = {
      x = 886.435,
      y = 24.974,
      z = 211.68
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    }
  },
  {
    config_id = 3013,
    pos = {
      x = 546.677,
      y = 51.154,
      z = 801.746
    },
    rot = {
      x = 0.0,
      y = 178.797,
      z = 0.0
    }
  },
  {
    config_id = 3014,
    pos = {
      x = 323.515,
      y = 17.138,
      z = 234.651
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    }
  },
  {
    config_id = 3015,
    pos = {
      x = -550.519,
      y = 22.602,
      z = 181.764
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    }
  },
  {
    config_id = 3017,
    pos = {
      x = -575.642,
      y = 45.743,
      z = 778.365
    },
    rot = {
      x = 0.0,
      y = 30.263,
      z = 0.0
    }
  }
}
variables = {
  {
    config_id = 1,
    name = "stage",
    value = 0,
    no_refresh = false
  }
}
init_config = {
  suite = 1,
  end_suite = 0,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {3001},
    regions = {
      3018,
      3032,
      3055
    },
    triggers = {
      "ENTER_REGION_3018",
      "GROUP_LOAD_3054",
      "ENTER_REGION_3055"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {3008, 3033},
    triggers = {
      "ENTER_REGION_3008",
      "QUEST_FINISH_3041"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {3003},
    regions = {3034},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {3004},
    regions = {3035},
    triggers = {
      "GADGET_LUA_NOTIFY_3053"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {3006},
    regions = {
      3019,
      3036,
      3057
    },
    triggers = {
      "ENTER_REGION_3019",
      "ENTER_REGION_3057"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {3021},
    triggers = {
      "ENTER_REGION_3021",
      "QUEST_FINISH_3042"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {3016},
    regions = {3038},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {3002},
    regions = {3039},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {3007},
    regions = {
      3022,
      3040,
      3059
    },
    triggers = {
      "ENTER_REGION_3022",
      "ENTER_REGION_3059"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {3005},
    regions = {3056},
    triggers = {
      "ENTER_REGION_3056"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {3020},
    regions = {3037, 3058},
    triggers = {
      "ENTER_REGION_3058"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {3043},
    triggers = {
      "ENTER_REGION_3043",
      "TIME_AXIS_PASS_3045",
      "QUEST_FINISH_3061"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {3046},
    triggers = {
      "ENTER_REGION_3046",
      "TIME_AXIS_PASS_3047",
      "QUEST_FINISH_3062"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {3050},
    triggers = {
      "TIME_AXIS_PASS_3044",
      "ENTER_REGION_3050"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {3051},
    triggers = {
      "TIME_AXIS_PASS_3049",
      "ENTER_REGION_3051"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {3052},
    triggers = {
      "TIME_AXIS_PASS_3048",
      "ENTER_REGION_3052",
      "QUEST_FINISH_3063"
    },
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
function condition_EVENT_ENTER_REGION_3008(context, evt)
  if evt.param1 ~= 3008 then
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
function action_EVENT_ENTER_REGION_3008(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220165004, 2)
  ScriptLib.InitTimeAxis(context, "quest2", {3}, false)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "stage", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220165003, 5)
  ScriptLib.AddExtraGroupSuite(context, 220165003, 13)
  ScriptLib.RemoveExtraGroupSuite(context, 220165010, 6)
  return 0
end
function condition_EVENT_ENTER_REGION_3018(context, evt)
  if evt.param1 ~= 3018 then
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
function action_EVENT_ENTER_REGION_3018(context, evt)
  ScriptLib.SetWeatherAreaState(context, 10151, 0)
  ScriptLib.SetWeatherAreaState(context, 10155, 1)
  if 0 ~= ScriptLib.EnterWeatherArea(context, 10155) then
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "stage", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220165003, 2)
  ScriptLib.AddExtraGroupSuite(context, 220165003, 12)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220165010, suite = 5}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220165002, 3)
  ScriptLib.RemoveExtraGroupSuite(context, 220165002, 5)
  ScriptLib.RemoveExtraGroupSuite(context, 220165002, 2)
  ScriptLib.RemoveExtraGroupSuite(context, 220165002, 1)
  return 0
end
function condition_EVENT_ENTER_REGION_3019(context, evt)
  if evt.param1 ~= 3019 then
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
function action_EVENT_ENTER_REGION_3019(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "stage", 3) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  ScriptLib.InitTimeAxis(context, "quest3", {3}, false)
  ScriptLib.AddExtraGroupSuite(context, 220165003, 6)
  ScriptLib.AddExtraGroupSuite(context, 220165003, 14)
  ScriptLib.RemoveExtraGroupSuite(context, 220165010, 12)
  ScriptLib.AddExtraGroupSuite(context, 220165004, 7)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220165010, suite = 13}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  ScriptLib.RemoveExtraGroupSuite(context, 220165004, 2)
  ScriptLib.RemoveExtraGroupSuite(context, 220165004, 1)
  ScriptLib.RemoveExtraGroupSuite(context, 220165004, 3)
  ScriptLib.RemoveExtraGroupSuite(context, 220165004, 4)
  ScriptLib.RemoveExtraGroupSuite(context, 220165004, 5)
  ScriptLib.RemoveExtraGroupSuite(context, 220165004, 6)
  ScriptLib.RemoveExtraGroupSuite(context, 220165004, 7)
  ScriptLib.SetWeatherAreaState(context, 10154, 1)
  if 0 ~= ScriptLib.EnterWeatherArea(context, 10154) then
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_3021(context, evt)
  if evt.param1 ~= 3021 then
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
function action_EVENT_ENTER_REGION_3021(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "stage", 4) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220165003, 16)
  ScriptLib.InitTimeAxis(context, "quest4", {3}, false)
  ScriptLib.AddExtraGroupSuite(context, 220165003, 9)
  ScriptLib.AddExtraGroupSuite(context, 220165005, 2)
  ScriptLib.SetWeatherAreaState(context, 10151, 1)
  if 0 ~= ScriptLib.EnterWeatherArea(context, 10151) then
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_3022(context, evt)
  if evt.param1 ~= 3022 then
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
function action_EVENT_ENTER_REGION_3022(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "stage", 5) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220165003, 15)
  ScriptLib.InitTimeAxis(context, "quest5", {3}, false)
  ScriptLib.RemoveExtraGroupSuite(context, 220165005, 2)
  ScriptLib.RemoveExtraGroupSuite(context, 220165005, 3)
  ScriptLib.RemoveExtraGroupSuite(context, 220165005, 4)
  ScriptLib.RemoveExtraGroupSuite(context, 220165005, 5)
  ScriptLib.RemoveExtraGroupSuite(context, 220165005, 6)
  ScriptLib.SetWeatherAreaState(context, 10154, 1)
  if 0 ~= ScriptLib.EnterWeatherArea(context, 10154) then
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_FINISH_3041(context, evt)
  if 1301425 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_3041(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220165003, 10)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220165010, suite = 6}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_FINISH_3042(context, evt)
  if 1301412 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_3042(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220165003, 11)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220165010, suite = 14}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_3043(context, evt)
  if evt.param1 ~= 3043 then
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
function action_EVENT_ENTER_REGION_3043(context, evt)
  ScriptLib.InitTimeAxis(context, "quest1", {3}, false)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_3044(context, evt)
  if "quest3" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_3044(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "2201650032") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  ScriptLib.RemoveExtraGroupSuite(context, 220165003, 2)
  ScriptLib.RemoveExtraGroupSuite(context, 220165003, 3)
  ScriptLib.RemoveExtraGroupSuite(context, 220165003, 4)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_3045(context, evt)
  if "quest1" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_3045(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "2201650031") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_3046(context, evt)
  if evt.param1 ~= 3046 then
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
function action_EVENT_ENTER_REGION_3046(context, evt)
  ScriptLib.InitTimeAxis(context, "quest2", {4}, false)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_3047(context, evt)
  if "quest2" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_3047(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "2201650034") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_3048(context, evt)
  if "quest4" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_3048(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "2201650035") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_3049(context, evt)
  if "quest5" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_3049(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "2201650033") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  ScriptLib.RemoveExtraGroupSuite(context, 220165003, 6)
  ScriptLib.RemoveExtraGroupSuite(context, 220165003, 7)
  ScriptLib.RemoveExtraGroupSuite(context, 220165003, 8)
  return 0
end
function condition_EVENT_ENTER_REGION_3050(context, evt)
  if evt.param1 ~= 3050 then
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
function action_EVENT_ENTER_REGION_3050(context, evt)
  ScriptLib.InitTimeAxis(context, "quest3", {3}, false)
  return 0
end
function condition_EVENT_ENTER_REGION_3051(context, evt)
  if evt.param1 ~= 3051 then
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
function action_EVENT_ENTER_REGION_3051(context, evt)
  ScriptLib.InitTimeAxis(context, "quest5", {3}, false)
  return 0
end
function condition_EVENT_ENTER_REGION_3052(context, evt)
  if evt.param1 ~= 3052 then
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
function action_EVENT_ENTER_REGION_3052(context, evt)
  ScriptLib.InitTimeAxis(context, "quest4", {3}, false)
  return 0
end
function condition_EVENT_GADGET_LUA_NOTIFY_3053(context, evt)
  local configId = ScriptLib.GetGadgetConfigId(context, {
    gadget_eid = context.target_entity_id
  })
  if 3004 ~= configId then
    return false
  end
  return true
end
function action_EVENT_GADGET_LUA_NOTIFY_3053(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220165004, 6)
  return 0
end
function action_EVENT_GROUP_LOAD_3054(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220165003, 17)
  return 0
end
function condition_EVENT_ENTER_REGION_3055(context, evt)
  if evt.param1 ~= 3055 then
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
function action_EVENT_ENTER_REGION_3055(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220165010, 4)
  return 0
end
function condition_EVENT_ENTER_REGION_3056(context, evt)
  if evt.param1 ~= 3056 then
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
function action_EVENT_ENTER_REGION_3056(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220165010, 6)
  return 0
end
function condition_EVENT_ENTER_REGION_3057(context, evt)
  if evt.param1 ~= 3057 then
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
function action_EVENT_ENTER_REGION_3057(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220165010, 12)
  return 0
end
function condition_EVENT_ENTER_REGION_3058(context, evt)
  if evt.param1 ~= 3058 then
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
function action_EVENT_ENTER_REGION_3058(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220165010, 14)
  return 0
end
function condition_EVENT_ENTER_REGION_3059(context, evt)
  if evt.param1 ~= 3059 then
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
function action_EVENT_ENTER_REGION_3059(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220165010, 19)
  return 0
end
function action_EVENT_QUEST_FINISH_3061(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220165003, 1)
  return 0
end
function action_EVENT_QUEST_FINISH_3062(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220165003, 2)
  ScriptLib.RemoveExtraGroupSuite(context, 220165003, 10)
  return 0
end
function action_EVENT_QUEST_FINISH_3063(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220165003, 5)
  ScriptLib.RemoveExtraGroupSuite(context, 220165003, 11)
  return 0
end
require("V3_2/TeleportHotSpot")
