local base_info = {group_id = 220134041}
local defs = {groupid = 220134041}
local defs = {
  gear_info = {
    [1] = {
      config_id = 41001,
      connect = {
        41008,
        41005,
        41006
      },
      point_array_id = 34
    },
    [2] = {
      config_id = 41002,
      connect = {41004, 41006},
      point_array_id = 35
    },
    [3] = {
      config_id = 41003,
      connect = {
        41004,
        41005,
        41008
      },
      point_array_id = 36
    },
    [4] = {
      config_id = 41004,
      connect = {
        41008,
        41009,
        41005
      },
      point_array_id = 37
    },
    [5] = {
      config_id = 41005,
      connect = {41007, 41009},
      point_array_id = 38
    },
    [6] = {
      config_id = 41006,
      connect = {
        41005,
        41007,
        41008
      },
      point_array_id = 39
    },
    [7] = {
      config_id = 41007,
      connect = {41008, 41008},
      point_array_id = 103
    },
    [8] = {
      config_id = 41008,
      connect = {41009, 41007},
      point_array_id = 104
    },
    [9] = {
      config_id = 41009,
      connect = {41008, 41008},
      point_array_id = 105
    }
  },
  solutions = {
    [1] = {
      connection = {
        1,
        4,
        4,
        4,
        4,
        4
      },
      ends = {}
    }
  },
  turn_option = 31
}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 41001,
    gadget_id = 70310178,
    pos = {
      x = 338.534,
      y = 631.935,
      z = -1504.787
    },
    rot = {
      x = 0.0,
      y = 30.509,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 41002,
    gadget_id = 70310178,
    pos = {
      x = 340.628,
      y = 631.926,
      z = -1500.037
    },
    rot = {
      x = 358.381,
      y = 28.014,
      z = 358.581
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 41003,
    gadget_id = 70310178,
    pos = {
      x = 342.718,
      y = 631.917,
      z = -1495.216
    },
    rot = {
      x = 0.0,
      y = 297.154,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 41004,
    gadget_id = 70310178,
    pos = {
      x = 333.911,
      y = 631.935,
      z = -1502.692
    },
    rot = {
      x = 0.0,
      y = 27.498,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 41005,
    gadget_id = 70310178,
    pos = {
      x = 335.939,
      y = 631.926,
      z = -1497.847
    },
    rot = {
      x = 0.0,
      y = 334.997,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 41006,
    gadget_id = 70310178,
    pos = {
      x = 338.155,
      y = 631.917,
      z = -1493.148
    },
    rot = {
      x = 0.0,
      y = 203.786,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 41007,
    gadget_id = 70310178,
    pos = {
      x = 329.076,
      y = 631.934,
      z = -1500.465
    },
    rot = {
      x = 0.0,
      y = 26.822,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 41008,
    gadget_id = 70310178,
    pos = {
      x = 331.275,
      y = 631.925,
      z = -1495.666
    },
    rot = {
      x = 0.0,
      y = 22.794,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 41009,
    gadget_id = 70310178,
    pos = {
      x = 333.428,
      y = 631.917,
      z = -1491.045
    },
    rot = {
      x = 0.0,
      y = 209.695,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 41011,
    gadget_id = 70211112,
    pos = {
      x = 325.584,
      y = 631.923,
      z = -1491.918
    },
    rot = {
      x = 0.0,
      y = 116.494,
      z = 0.0
    },
    level = 16,
    drop_tag = "\232\167\163\232\176\156\228\184\173\231\186\167\231\190\164\229\178\155",
    state = GadgetState.ChestLocked,
    isOneoff = true,
    persistent = true
  },
  {
    config_id = 41013,
    gadget_id = 70310447,
    pos = {
      x = 310.648,
      y = 636.56,
      z = -1489.794
    },
    rot = {
      x = 40.79,
      y = 215.602,
      z = 6.816
    },
    level = 1
  },
  {
    config_id = 41014,
    gadget_id = 70310447,
    pos = {
      x = 311.392,
      y = 640.474,
      z = -1489.244
    },
    rot = {
      x = 61.253,
      y = 220.603,
      z = 10.768
    },
    level = 1
  },
  {
    config_id = 41015,
    gadget_id = 70310447,
    pos = {
      x = 314.702,
      y = 638.907,
      z = -1483.492
    },
    rot = {
      x = 25.451,
      y = 213.598,
      z = 5.711
    },
    level = 1
  },
  {
    config_id = 41020,
    gadget_id = 70310447,
    pos = {
      x = 315.588,
      y = 648.92,
      z = -1493.014
    },
    rot = {
      x = 0.0,
      y = 23.045,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 41021,
    gadget_id = 70310447,
    pos = {
      x = 311.337,
      y = 637.912,
      z = -1488.587
    },
    rot = {
      x = 45.333,
      y = 19.507,
      z = 352.672
    },
    level = 1
  },
  {
    config_id = 41022,
    gadget_id = 70310447,
    pos = {
      x = 314.462,
      y = 636.673,
      z = -1483.499
    },
    rot = {
      x = 40.79,
      y = 215.602,
      z = 6.816
    },
    level = 1
  },
  {
    config_id = 41027,
    gadget_id = 70310447,
    pos = {
      x = 313.249,
      y = 637.687,
      z = -1484.388
    },
    rot = {
      x = 24.72,
      y = 22.357,
      z = 354.335
    },
    level = 1
  },
  {
    config_id = 41028,
    gadget_id = 70310447,
    pos = {
      x = 315.018,
      y = 636.535,
      z = -1480.3
    },
    rot = {
      x = 45.333,
      y = 19.507,
      z = 352.672
    },
    level = 1
  },
  {
    config_id = 41029,
    gadget_id = 70310447,
    pos = {
      x = 314.762,
      y = 641.101,
      z = -1481.838
    },
    rot = {
      x = 64.265,
      y = 13.968,
      z = 348.083
    },
    level = 1
  },
  {
    config_id = 41035,
    gadget_id = 70310447,
    pos = {
      x = 317.846,
      y = 644.65,
      z = -1493.551
    },
    rot = {
      x = 315.472,
      y = 23.045,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 41036,
    gadget_id = 70310447,
    pos = {
      x = 319.258,
      y = 645.013,
      z = -1490.232
    },
    rot = {
      x = 335.786,
      y = 23.045,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 41037,
    gadget_id = 70310447,
    pos = {
      x = 315.588,
      y = 640.924,
      z = -1493.014
    },
    rot = {
      x = 0.0,
      y = 23.045,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 41043,
    gadget_id = 70310447,
    pos = {
      x = 315.236,
      y = 645.574,
      z = -1483.771
    },
    rot = {
      x = 40.79,
      y = 215.602,
      z = 6.816
    },
    level = 1
  },
  {
    config_id = 41044,
    gadget_id = 70310447,
    pos = {
      x = 311.541,
      y = 645.082,
      z = -1489.687
    },
    rot = {
      x = 45.333,
      y = 19.507,
      z = 352.672
    },
    level = 1
  },
  {
    config_id = 41049,
    gadget_id = 70310447,
    pos = {
      x = 318.951,
      y = 641.205,
      z = -1485.726
    },
    rot = {
      x = 0.0,
      y = 23.045,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 41050,
    gadget_id = 70310447,
    pos = {
      x = 321.078,
      y = 646.109,
      z = -1486.508
    },
    rot = {
      x = 25.821,
      y = 22.236,
      z = 354.283
    },
    level = 1
  },
  {
    config_id = 41051,
    gadget_id = 70310447,
    pos = {
      x = 322.352,
      y = 646.046,
      z = -1482.958
    },
    rot = {
      x = 45.097,
      y = 23.045,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 41057,
    gadget_id = 70310447,
    pos = {
      x = 319.688,
      y = 648.92,
      z = -1483.376
    },
    rot = {
      x = 0.0,
      y = 23.045,
      z = 0.0
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1041010,
    name = "PLATFORM_REACH_POINT_41010",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_41010",
    action = "action_EVENT_PLATFORM_REACH_POINT_41010",
    trigger_count = 0
  },
  {
    config_id = 1041012,
    name = "GADGET_STATE_CHANGE_41012",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_41012",
    action = "action_EVENT_GADGET_STATE_CHANGE_41012",
    trigger_count = 0
  },
  {
    config_id = 1041016,
    name = "PLATFORM_REACH_POINT_41016",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_41016",
    action = "action_EVENT_PLATFORM_REACH_POINT_41016",
    trigger_count = 0
  },
  {
    config_id = 1041017,
    name = "PLATFORM_REACH_POINT_41017",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_41017",
    action = "action_EVENT_PLATFORM_REACH_POINT_41017",
    trigger_count = 0
  },
  {
    config_id = 1041018,
    name = "GADGET_STATE_CHANGE_41018",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_41018",
    action = "action_EVENT_GADGET_STATE_CHANGE_41018",
    trigger_count = 0
  },
  {
    config_id = 1041019,
    name = "GADGET_STATE_CHANGE_41019",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_41019",
    action = "action_EVENT_GADGET_STATE_CHANGE_41019",
    trigger_count = 0
  },
  {
    config_id = 1041023,
    name = "PLATFORM_REACH_POINT_41023",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_41023",
    action = "action_EVENT_PLATFORM_REACH_POINT_41023",
    trigger_count = 0
  },
  {
    config_id = 1041024,
    name = "PLATFORM_REACH_POINT_41024",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_41024",
    action = "action_EVENT_PLATFORM_REACH_POINT_41024",
    trigger_count = 0
  },
  {
    config_id = 1041025,
    name = "GADGET_STATE_CHANGE_41025",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_41025",
    action = "action_EVENT_GADGET_STATE_CHANGE_41025",
    trigger_count = 0
  },
  {
    config_id = 1041026,
    name = "GADGET_STATE_CHANGE_41026",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_41026",
    action = "action_EVENT_GADGET_STATE_CHANGE_41026",
    trigger_count = 0
  },
  {
    config_id = 1041030,
    name = "PLATFORM_REACH_POINT_41030",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_41030",
    action = "action_EVENT_PLATFORM_REACH_POINT_41030",
    trigger_count = 0
  },
  {
    config_id = 1041031,
    name = "PLATFORM_REACH_POINT_41031",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_41031",
    action = "action_EVENT_PLATFORM_REACH_POINT_41031",
    trigger_count = 0
  },
  {
    config_id = 1041032,
    name = "PLATFORM_REACH_POINT_41032",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_41032",
    action = "action_EVENT_PLATFORM_REACH_POINT_41032",
    trigger_count = 0
  },
  {
    config_id = 1041033,
    name = "GADGET_STATE_CHANGE_41033",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_41033",
    action = "action_EVENT_GADGET_STATE_CHANGE_41033",
    trigger_count = 0
  },
  {
    config_id = 1041034,
    name = "GADGET_STATE_CHANGE_41034",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_41034",
    action = "action_EVENT_GADGET_STATE_CHANGE_41034",
    trigger_count = 0
  },
  {
    config_id = 1041038,
    name = "PLATFORM_REACH_POINT_41038",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_41038",
    action = "action_EVENT_PLATFORM_REACH_POINT_41038",
    trigger_count = 0
  },
  {
    config_id = 1041039,
    name = "PLATFORM_REACH_POINT_41039",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_41039",
    action = "action_EVENT_PLATFORM_REACH_POINT_41039",
    trigger_count = 0
  },
  {
    config_id = 1041040,
    name = "PLATFORM_REACH_POINT_41040",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_41040",
    action = "action_EVENT_PLATFORM_REACH_POINT_41040",
    trigger_count = 0
  },
  {
    config_id = 1041041,
    name = "GADGET_STATE_CHANGE_41041",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_41041",
    action = "action_EVENT_GADGET_STATE_CHANGE_41041",
    trigger_count = 0
  },
  {
    config_id = 1041042,
    name = "GADGET_STATE_CHANGE_41042",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_41042",
    action = "action_EVENT_GADGET_STATE_CHANGE_41042",
    trigger_count = 0
  },
  {
    config_id = 1041045,
    name = "PLATFORM_REACH_POINT_41045",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_41045",
    action = "action_EVENT_PLATFORM_REACH_POINT_41045",
    trigger_count = 0
  },
  {
    config_id = 1041046,
    name = "PLATFORM_REACH_POINT_41046",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_41046",
    action = "action_EVENT_PLATFORM_REACH_POINT_41046",
    trigger_count = 0
  },
  {
    config_id = 1041047,
    name = "GADGET_STATE_CHANGE_41047",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_41047",
    action = "action_EVENT_GADGET_STATE_CHANGE_41047",
    trigger_count = 0
  },
  {
    config_id = 1041048,
    name = "GADGET_STATE_CHANGE_41048",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_41048",
    action = "action_EVENT_GADGET_STATE_CHANGE_41048",
    trigger_count = 0
  },
  {
    config_id = 1041052,
    name = "PLATFORM_REACH_POINT_41052",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_41052",
    action = "action_EVENT_PLATFORM_REACH_POINT_41052",
    trigger_count = 0
  },
  {
    config_id = 1041053,
    name = "PLATFORM_REACH_POINT_41053",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_41053",
    action = "action_EVENT_PLATFORM_REACH_POINT_41053",
    trigger_count = 0
  },
  {
    config_id = 1041054,
    name = "PLATFORM_REACH_POINT_41054",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_41054",
    action = "action_EVENT_PLATFORM_REACH_POINT_41054",
    trigger_count = 0
  },
  {
    config_id = 1041055,
    name = "GADGET_STATE_CHANGE_41055",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_41055",
    action = "action_EVENT_GADGET_STATE_CHANGE_41055",
    trigger_count = 0
  },
  {
    config_id = 1041056,
    name = "GADGET_STATE_CHANGE_41056",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_41056",
    action = "action_EVENT_GADGET_STATE_CHANGE_41056",
    trigger_count = 0
  },
  {
    config_id = 1041058,
    name = "GADGET_STATE_CHANGE_41058",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_41058",
    action = "action_EVENT_GADGET_STATE_CHANGE_41058",
    trigger_count = 0
  },
  {
    config_id = 1041059,
    name = "GADGET_STATE_CHANGE_41059",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_41059",
    action = "action_EVENT_GADGET_STATE_CHANGE_41059",
    trigger_count = 0
  },
  {
    config_id = 1041060,
    name = "PLATFORM_REACH_POINT_41060",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_41060",
    action = "action_EVENT_PLATFORM_REACH_POINT_41060",
    trigger_count = 0
  },
  {
    config_id = 1041061,
    name = "PLATFORM_REACH_POINT_41061",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_41061",
    action = "action_EVENT_PLATFORM_REACH_POINT_41061",
    trigger_count = 0
  },
  {
    config_id = 1041062,
    name = "GADGET_STATE_CHANGE_41062",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_41062",
    action = "action_EVENT_GADGET_STATE_CHANGE_41062",
    trigger_count = 0
  },
  {
    config_id = 1041063,
    name = "GADGET_STATE_CHANGE_41063",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_41063",
    action = "action_EVENT_GADGET_STATE_CHANGE_41063",
    trigger_count = 0
  },
  {
    config_id = 1041064,
    name = "GADGET_STATE_CHANGE_41064",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_41064",
    action = "action_EVENT_GADGET_STATE_CHANGE_41064",
    trigger_count = 0
  },
  {
    config_id = 1041065,
    name = "GADGET_STATE_CHANGE_41065",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_41065",
    action = "action_EVENT_GADGET_STATE_CHANGE_41065",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "botleft",
    value = 1,
    no_refresh = true
  },
  {
    config_id = 2,
    name = "botmid",
    value = 1,
    no_refresh = true
  },
  {
    config_id = 3,
    name = "botright",
    value = 1,
    no_refresh = true
  },
  {
    config_id = 4,
    name = "midleft",
    value = 1,
    no_refresh = true
  },
  {
    config_id = 5,
    name = "midmid",
    value = 1,
    no_refresh = true
  },
  {
    config_id = 6,
    name = "midright",
    value = 1,
    no_refresh = true
  },
  {
    config_id = 7,
    name = "camera",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 8,
    name = "topleft",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 9,
    name = "topright",
    value = 1,
    no_refresh = true
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
    gadgets = {
      41001,
      41002,
      41003,
      41004,
      41005,
      41006,
      41007,
      41008,
      41009,
      41011
    },
    regions = {},
    triggers = {
      "PLATFORM_REACH_POINT_41010",
      "GADGET_STATE_CHANGE_41012",
      "PLATFORM_REACH_POINT_41016",
      "PLATFORM_REACH_POINT_41017",
      "GADGET_STATE_CHANGE_41018",
      "GADGET_STATE_CHANGE_41019",
      "PLATFORM_REACH_POINT_41023",
      "PLATFORM_REACH_POINT_41024",
      "GADGET_STATE_CHANGE_41025",
      "GADGET_STATE_CHANGE_41026",
      "PLATFORM_REACH_POINT_41030",
      "PLATFORM_REACH_POINT_41031",
      "PLATFORM_REACH_POINT_41032",
      "GADGET_STATE_CHANGE_41033",
      "GADGET_STATE_CHANGE_41034",
      "PLATFORM_REACH_POINT_41038",
      "PLATFORM_REACH_POINT_41039",
      "PLATFORM_REACH_POINT_41040",
      "GADGET_STATE_CHANGE_41041",
      "GADGET_STATE_CHANGE_41042",
      "PLATFORM_REACH_POINT_41045",
      "PLATFORM_REACH_POINT_41046",
      "GADGET_STATE_CHANGE_41047",
      "GADGET_STATE_CHANGE_41048",
      "PLATFORM_REACH_POINT_41052",
      "PLATFORM_REACH_POINT_41053",
      "PLATFORM_REACH_POINT_41054",
      "GADGET_STATE_CHANGE_41055",
      "GADGET_STATE_CHANGE_41056",
      "GADGET_STATE_CHANGE_41058",
      "GADGET_STATE_CHANGE_41059",
      "PLATFORM_REACH_POINT_41060",
      "PLATFORM_REACH_POINT_41061",
      "GADGET_STATE_CHANGE_41062",
      "GADGET_STATE_CHANGE_41063",
      "GADGET_STATE_CHANGE_41064",
      "GADGET_STATE_CHANGE_41065"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      41013,
      41014,
      41015,
      41020,
      41021,
      41022,
      41027,
      41028,
      41029,
      41035,
      41036,
      41037,
      41043,
      41044,
      41049,
      41050,
      41051,
      41057
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_PLATFORM_REACH_POINT_41010(context, evt)
  if 41001 ~= evt.param1 then
    return false
  end
  if 34 ~= evt.param2 then
    return false
  end
  if 2 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_41010(context, evt)
  ScriptLib.SetGroupVariableValue(context, "botleft", 2)
  if ScriptLib.GetGadgetStateByConfigId(context, 0, 41001) == 201 then
    ScriptLib.CreateGadget(context, {config_id = 41013})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41014})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41015})
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_41012(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "camera") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_41012(context, evt)
  local pos = {
    x = 316,
    y = 642,
    z = -1487
  }
  local pos_follow = {
    x = 0,
    y = 0,
    z = 0
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = true,
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
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "camera", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_41016(context, evt)
  if 41001 ~= evt.param1 then
    return false
  end
  if 34 ~= evt.param2 then
    return false
  end
  if 1 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_41016(context, evt)
  ScriptLib.SetGroupVariableValue(context, "botleft", 1)
  if ScriptLib.GetGadgetStateByConfigId(context, 0, 41001) == 201 then
    ScriptLib.CreateGadget(context, {config_id = 41014})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41013})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41015})
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_41017(context, evt)
  if 41001 ~= evt.param1 then
    return false
  end
  if 34 ~= evt.param2 then
    return false
  end
  if 3 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_41017(context, evt)
  ScriptLib.SetGroupVariableValue(context, "botleft", 3)
  if ScriptLib.GetGadgetStateByConfigId(context, 0, 41001) == 201 then
    ScriptLib.CreateGadget(context, {config_id = 41015})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41014})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41013})
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_41018(context, evt)
  if 41001 ~= evt.param2 or GadgetState.Default ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_41018(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 41013}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 41014}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 41015}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_41019(context, evt)
  if 41001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_41019(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "botleft") == 1 then
    ScriptLib.CreateGadget(context, {config_id = 41014})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41013})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41015})
  elseif ScriptLib.GetGroupVariableValue(context, "botleft") == 2 then
    ScriptLib.CreateGadget(context, {config_id = 41013})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41014})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41015})
  elseif ScriptLib.GetGroupVariableValue(context, "botleft") == 3 then
    ScriptLib.CreateGadget(context, {config_id = 41015})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41014})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41013})
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_41023(context, evt)
  if 41002 ~= evt.param1 then
    return false
  end
  if 35 ~= evt.param2 then
    return false
  end
  if 1 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_41023(context, evt)
  ScriptLib.SetGroupVariableValue(context, "botmid", 1)
  if ScriptLib.GetGadgetStateByConfigId(context, 0, 41002) == 201 then
    ScriptLib.CreateGadget(context, {config_id = 41021})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41022})
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_41024(context, evt)
  if 41002 ~= evt.param1 then
    return false
  end
  if 35 ~= evt.param2 then
    return false
  end
  if 2 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_41024(context, evt)
  ScriptLib.SetGroupVariableValue(context, "botmid", 2)
  if ScriptLib.GetGadgetStateByConfigId(context, 0, 41002) == 201 then
    ScriptLib.CreateGadget(context, {config_id = 41022})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41021})
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_41025(context, evt)
  if 41002 ~= evt.param2 or GadgetState.Default ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_41025(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 41021}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 41022}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_41026(context, evt)
  if 41002 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_41026(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "botmid") == 1 then
    ScriptLib.CreateGadget(context, {config_id = 41021})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41022})
  elseif ScriptLib.GetGroupVariableValue(context, "botmid") == 2 then
    ScriptLib.CreateGadget(context, {config_id = 41022})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41021})
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_41030(context, evt)
  if 41003 ~= evt.param1 then
    return false
  end
  if 36 ~= evt.param2 then
    return false
  end
  if 1 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_41030(context, evt)
  ScriptLib.SetGroupVariableValue(context, "botright", 1)
  if ScriptLib.GetGadgetStateByConfigId(context, 0, 41003) == 201 then
    ScriptLib.CreateGadget(context, {config_id = 41027})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41028})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41029})
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_41031(context, evt)
  if 41003 ~= evt.param1 then
    return false
  end
  if 36 ~= evt.param2 then
    return false
  end
  if 3 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_41031(context, evt)
  ScriptLib.SetGroupVariableValue(context, "botright", 3)
  if ScriptLib.GetGadgetStateByConfigId(context, 0, 41003) == 201 then
    ScriptLib.CreateGadget(context, {config_id = 41029})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41027})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41028})
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_41032(context, evt)
  if 41003 ~= evt.param1 then
    return false
  end
  if 36 ~= evt.param2 then
    return false
  end
  if 2 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_41032(context, evt)
  ScriptLib.SetGroupVariableValue(context, "botright", 2)
  if ScriptLib.GetGadgetStateByConfigId(context, 0, 41003) == 201 then
    ScriptLib.CreateGadget(context, {config_id = 41028})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41027})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41029})
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_41033(context, evt)
  if 41003 ~= evt.param2 or GadgetState.Default ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_41033(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 41027}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 41028}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 41029}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_41034(context, evt)
  if 41003 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_41034(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "botright") == 1 then
    ScriptLib.CreateGadget(context, {config_id = 41027})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41028})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41029})
  elseif ScriptLib.GetGroupVariableValue(context, "botright") == 2 then
    ScriptLib.CreateGadget(context, {config_id = 41028})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41027})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41029})
  elseif ScriptLib.GetGroupVariableValue(context, "botright") == 3 then
    ScriptLib.CreateGadget(context, {config_id = 41029})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41027})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41028})
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_41038(context, evt)
  if 41004 ~= evt.param1 then
    return false
  end
  if 37 ~= evt.param2 then
    return false
  end
  if 1 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_41038(context, evt)
  ScriptLib.SetGroupVariableValue(context, "midleft", 1)
  if ScriptLib.GetGadgetStateByConfigId(context, 0, 41004) == 201 then
    ScriptLib.CreateGadget(context, {config_id = 41035})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41036})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41037})
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_41039(context, evt)
  if 41004 ~= evt.param1 then
    return false
  end
  if 37 ~= evt.param2 then
    return false
  end
  if 2 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_41039(context, evt)
  ScriptLib.SetGroupVariableValue(context, "midleft", 2)
  if ScriptLib.GetGadgetStateByConfigId(context, 0, 41004) == 201 then
    ScriptLib.CreateGadget(context, {config_id = 41036})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41037})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41035})
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_41040(context, evt)
  if 41004 ~= evt.param1 then
    return false
  end
  if 37 ~= evt.param2 then
    return false
  end
  if 3 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_41040(context, evt)
  ScriptLib.SetGroupVariableValue(context, "midleft", 3)
  if ScriptLib.GetGadgetStateByConfigId(context, 0, 41004) == 201 then
    ScriptLib.CreateGadget(context, {config_id = 41035})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41036})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41037})
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_41041(context, evt)
  if 41004 ~= evt.param2 or GadgetState.Default ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_41041(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 41035}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 41036}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 41037}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_41042(context, evt)
  if 41004 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_41042(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "midleft") == 1 then
    ScriptLib.CreateGadget(context, {config_id = 41035})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41036})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41037})
  elseif ScriptLib.GetGroupVariableValue(context, "midleft") == 2 then
    ScriptLib.CreateGadget(context, {config_id = 41036})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41035})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41037})
  elseif ScriptLib.GetGroupVariableValue(context, "midleft") == 3 then
    ScriptLib.CreateGadget(context, {config_id = 41037})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41036})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41035})
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_41045(context, evt)
  if 41005 ~= evt.param1 then
    return false
  end
  if 38 ~= evt.param2 then
    return false
  end
  if 1 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_41045(context, evt)
  ScriptLib.SetGroupVariableValue(context, "midmid", 1)
  if ScriptLib.GetGadgetStateByConfigId(context, 0, 41005) == 201 then
    ScriptLib.CreateGadget(context, {config_id = 41044})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41043})
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_41046(context, evt)
  if 41005 ~= evt.param1 then
    return false
  end
  if 38 ~= evt.param2 then
    return false
  end
  if 2 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_41046(context, evt)
  ScriptLib.SetGroupVariableValue(context, "midmid", 2)
  if ScriptLib.GetGadgetStateByConfigId(context, 0, 41005) == 201 then
    ScriptLib.CreateGadget(context, {config_id = 41043})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41044})
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_41047(context, evt)
  if 41005 ~= evt.param2 or GadgetState.Default ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_41047(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 41043}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 41044}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_41048(context, evt)
  if 41005 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_41048(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "midmid") == 1 then
    ScriptLib.CreateGadget(context, {config_id = 41044})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41043})
  elseif ScriptLib.GetGroupVariableValue(context, "midmid") == 2 then
    ScriptLib.CreateGadget(context, {config_id = 41043})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41044})
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_41052(context, evt)
  if 41006 ~= evt.param1 then
    return false
  end
  if 39 ~= evt.param2 then
    return false
  end
  if 1 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_41052(context, evt)
  ScriptLib.SetGroupVariableValue(context, "midright", 1)
  if ScriptLib.GetGadgetStateByConfigId(context, 0, 41006) == 201 then
    ScriptLib.CreateGadget(context, {config_id = 41049})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41050})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41051})
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_41053(context, evt)
  if 41006 ~= evt.param1 then
    return false
  end
  if 39 ~= evt.param2 then
    return false
  end
  if 2 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_41053(context, evt)
  ScriptLib.SetGroupVariableValue(context, "midright", 2)
  if ScriptLib.GetGadgetStateByConfigId(context, 0, 41006) == 201 then
    ScriptLib.CreateGadget(context, {config_id = 41050})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41049})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41051})
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_41054(context, evt)
  if 41006 ~= evt.param1 then
    return false
  end
  if 39 ~= evt.param2 then
    return false
  end
  if 3 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_41054(context, evt)
  ScriptLib.SetGroupVariableValue(context, "midright", 3)
  if ScriptLib.GetGadgetStateByConfigId(context, 0, 41006) == 201 then
    ScriptLib.CreateGadget(context, {config_id = 41051})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41049})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41050})
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_41055(context, evt)
  if 41006 ~= evt.param2 or GadgetState.Default ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_41055(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 41049}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 41050}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 41051}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_41056(context, evt)
  if 41006 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_41056(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "midright") == 1 then
    ScriptLib.CreateGadget(context, {config_id = 41049})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41050})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41051})
  elseif ScriptLib.GetGroupVariableValue(context, "midright") == 2 then
    ScriptLib.CreateGadget(context, {config_id = 41050})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41049})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41051})
  elseif ScriptLib.GetGroupVariableValue(context, "midright") == 3 then
    ScriptLib.CreateGadget(context, {config_id = 41051})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41049})
    ScriptLib.KillEntityByConfigId(context, {config_id = 41050})
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_41058(context, evt)
  if 41008 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_41058(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "topright") == 1 then
    ScriptLib.CreateGadget(context, {config_id = 41057})
  elseif ScriptLib.GetGroupVariableValue(context, "topleft") == 1 then
    ScriptLib.CreateGadget(context, {config_id = 41020})
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_41059(context, evt)
  if 41008 ~= evt.param2 or GadgetState.Default ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_41059(context, evt)
  if ScriptLib.GetGadgetStateByConfigId(context, 0, 41007) == 0 then
    ScriptLib.KillEntityByConfigId(context, {config_id = 41020})
  end
  if ScriptLib.GetGadgetStateByConfigId(context, 0, 41009) == 0 then
    ScriptLib.KillEntityByConfigId(context, {config_id = 41057})
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_41060(context, evt)
  if 41008 ~= evt.param1 then
    return false
  end
  if 104 ~= evt.param2 then
    return false
  end
  if 2 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_41060(context, evt)
  ScriptLib.SetGroupVariableValue(context, "topleft", 1)
  ScriptLib.SetGroupVariableValue(context, "topright", 0)
  if ScriptLib.GetGadgetStateByConfigId(context, 0, 41008) == 201 then
    ScriptLib.CreateGadget(context, {config_id = 41020})
  end
  if ScriptLib.GetGadgetStateByConfigId(context, 0, 41009) == 0 then
    ScriptLib.KillEntityByConfigId(context, {config_id = 41057})
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_41061(context, evt)
  if 41008 ~= evt.param1 then
    return false
  end
  if 104 ~= evt.param2 then
    return false
  end
  if 1 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_41061(context, evt)
  ScriptLib.SetGroupVariableValue(context, "topleft", 0)
  ScriptLib.SetGroupVariableValue(context, "topright", 1)
  if ScriptLib.GetGadgetStateByConfigId(context, 0, 41008) == 201 then
    ScriptLib.CreateGadget(context, {config_id = 41057})
  end
  if ScriptLib.GetGadgetStateByConfigId(context, 0, 41007) == 0 then
    ScriptLib.KillEntityByConfigId(context, {config_id = 41020})
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_41062(context, evt)
  if 41007 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_41062(context, evt)
  ScriptLib.CreateGadget(context, {config_id = 41020})
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_41063(context, evt)
  if 41007 ~= evt.param2 or GadgetState.Default ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_41063(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "topleft") == 0 or ScriptLib.GetGadgetStateByConfigId(context, 0, 41008) == 0 then
    ScriptLib.KillEntityByConfigId(context, {config_id = 41020})
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_41064(context, evt)
  if 41009 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_41064(context, evt)
  ScriptLib.CreateGadget(context, {config_id = 41057})
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_41065(context, evt)
  if 41009 ~= evt.param2 or GadgetState.Default ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_41065(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "topright") == 0 or ScriptLib.GetGadgetStateByConfigId(context, 0, 41008) == 0 then
    ScriptLib.KillEntityByConfigId(context, {config_id = 41057})
  end
  return 0
end
require("V2_8/ConstellationMachine")
