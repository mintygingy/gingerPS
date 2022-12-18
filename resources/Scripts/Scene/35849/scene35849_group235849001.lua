local base_info = {group_id = 235849001}
local defs = {
  starter = 1040,
  option_id = 94,
  delay = 3,
  time_limit = 300,
  challenge_id = 2010037,
  tide_cfg = {
    [1] = {
      monsters = {
        1001,
        1002,
        1003,
        1004,
        1005,
        1006,
        1007
      },
      min = 7,
      max = 7
    },
    [2] = {
      monsters = {
        1008,
        1009,
        1010,
        1011
      },
      min = 4,
      max = 4
    },
    [3] = {
      monsters = {1013, 1014},
      min = 2,
      max = 2
    },
    [4] = {
      monsters = {1012},
      min = 1,
      max = 1
    },
    [5] = {
      monsters = {1015},
      min = 1,
      max = 1
    },
    [6] = {
      monsters = {1045},
      min = 1,
      max = 1
    },
    [7] = {
      monsters = {1046},
      min = 1,
      max = 1
    }
  },
  rand_table = {
    [1] = {
      {1},
      {3},
      {4}
    },
    [2] = {
      {2},
      {3},
      {4}
    },
    [3] = {
      {1},
      {3},
      {5}
    },
    [4] = {
      {2},
      {3},
      {5}
    },
    [5] = {
      {1},
      {3},
      {6}
    },
    [6] = {
      {2},
      {3},
      {6}
    },
    [7] = {
      {1},
      {3},
      {7}
    },
    [8] = {
      {2},
      {3},
      {7}
    }
  },
  type = 1,
  rand_suites = {},
  point_list = {
    1029,
    1030,
    1031,
    1032,
    1033,
    1034,
    1035,
    1036
  },
  buff_pool = {1039},
  buff_count = 2,
  buff_pool_spec = {1037, 1038}
}
monsters = {
  [1001] = {
    config_id = 1001,
    monster_id = 25080101,
    pos = {
      x = 72.933,
      y = 106.97,
      z = 907.936
    },
    rot = {
      x = 0.0,
      y = 166.136,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 1
  },
  [1002] = {
    config_id = 1002,
    monster_id = 25080101,
    pos = {
      x = 68.951,
      y = 106.97,
      z = 908.231
    },
    rot = {
      x = 0.0,
      y = 166.136,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 1
  },
  [1003] = {
    config_id = 1003,
    monster_id = 25080201,
    pos = {
      x = 66.216,
      y = 106.97,
      z = 904.203
    },
    rot = {
      x = 0.0,
      y = 166.136,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 1
  },
  [1004] = {
    config_id = 1004,
    monster_id = 25080201,
    pos = {
      x = 74.837,
      y = 106.97,
      z = 903.481
    },
    rot = {
      x = 0.0,
      y = 166.136,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 1
  },
  [1005] = {
    config_id = 1005,
    monster_id = 25080301,
    pos = {
      x = 63.662,
      y = 106.97,
      z = 875.553
    },
    rot = {
      x = 0.0,
      y = 349.987,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 1
  },
  [1006] = {
    config_id = 1006,
    monster_id = 25080301,
    pos = {
      x = 76.952,
      y = 106.97,
      z = 874.387
    },
    rot = {
      x = 0.0,
      y = 349.987,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 1
  },
  [1007] = {
    config_id = 1007,
    monster_id = 25100101,
    pos = {
      x = 71.833,
      y = 106.97,
      z = 901.918
    },
    rot = {
      x = 0.0,
      y = 166.136,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 1
  },
  [1008] = {
    config_id = 1008,
    monster_id = 23010101,
    pos = {
      x = 82.598,
      y = 106.97,
      z = 907.336
    },
    rot = {
      x = 0.0,
      y = 185.172,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  [1009] = {
    config_id = 1009,
    monster_id = 23010201,
    pos = {
      x = 72.724,
      y = 106.97,
      z = 908.06
    },
    rot = {
      x = 0.0,
      y = 185.172,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  [1010] = {
    config_id = 1010,
    monster_id = 23010301,
    pos = {
      x = 75.177,
      y = 106.97,
      z = 903.809
    },
    rot = {
      x = 0.0,
      y = 185.172,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  [1011] = {
    config_id = 1011,
    monster_id = 23010501,
    pos = {
      x = 80.822,
      y = 106.97,
      z = 903.217
    },
    rot = {
      x = 0.0,
      y = 185.172,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  [1012] = {
    config_id = 1012,
    monster_id = 26050101,
    pos = {
      x = 73.866,
      y = 106.97,
      z = 878.25
    },
    rot = {
      x = 0.0,
      y = 357.66,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {1021},
    pose_id = 101
  },
  [1013] = {
    config_id = 1013,
    monster_id = 24010301,
    pos = {
      x = 75.781,
      y = 106.97,
      z = 875.701
    },
    rot = {
      x = 0.0,
      y = 357.406,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 100
  },
  [1014] = {
    config_id = 1014,
    monster_id = 24010301,
    pos = {
      x = 74.322,
      y = 106.97,
      z = 904.828
    },
    rot = {
      x = 0.0,
      y = 173.729,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 100
  },
  [1015] = {
    config_id = 1015,
    monster_id = 26050201,
    pos = {
      x = 73.866,
      y = 106.97,
      z = 878.25
    },
    rot = {
      x = 0.0,
      y = 357.66,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {1021},
    pose_id = 101
  },
  [1045] = {
    config_id = 1045,
    monster_id = 26050301,
    pos = {
      x = 73.866,
      y = 106.97,
      z = 878.25
    },
    rot = {
      x = 0.0,
      y = 357.66,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {1021},
    pose_id = 101
  },
  [1046] = {
    config_id = 1046,
    monster_id = 26050401,
    pos = {
      x = 73.866,
      y = 106.97,
      z = 878.25
    },
    rot = {
      x = 0.0,
      y = 357.66,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {1021},
    pose_id = 101
  }
}
npcs = {}
gadgets = {
  [1016] = {
    config_id = 1016,
    gadget_id = 70360010,
    pos = {
      x = 72.417,
      y = 106.777,
      z = 891.412
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1017] = {
    config_id = 1017,
    gadget_id = 70950011,
    pos = {
      x = 95.352,
      y = 106.619,
      z = 873.203
    },
    rot = {
      x = 0.0,
      y = 358.664,
      z = 0.0
    },
    level = 1
  },
  [1018] = {
    config_id = 1018,
    gadget_id = 70950011,
    pos = {
      x = 69.333,
      y = 106.619,
      z = 872.596
    },
    rot = {
      x = 0.0,
      y = 358.664,
      z = 0.0
    },
    level = 1
  },
  [1019] = {
    config_id = 1019,
    gadget_id = 70950011,
    pos = {
      x = 50.154,
      y = 106.619,
      z = 872.149
    },
    rot = {
      x = 0.0,
      y = 358.664,
      z = 0.0
    },
    level = 1
  },
  [1020] = {
    config_id = 1020,
    gadget_id = 70950011,
    pos = {
      x = 45.557,
      y = 107.145,
      z = 875.124
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  [1021] = {
    config_id = 1021,
    gadget_id = 70950011,
    pos = {
      x = 45.557,
      y = 107.145,
      z = 892.635
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  [1022] = {
    config_id = 1022,
    gadget_id = 70950011,
    pos = {
      x = 45.557,
      y = 107.145,
      z = 912.672
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  [1023] = {
    config_id = 1023,
    gadget_id = 70950011,
    pos = {
      x = 54.397,
      y = 106.892,
      z = 912.208
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1024] = {
    config_id = 1024,
    gadget_id = 70950011,
    pos = {
      x = 81.004,
      y = 105.969,
      z = 912.208
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1025] = {
    config_id = 1025,
    gadget_id = 70950011,
    pos = {
      x = 97.695,
      y = 105.969,
      z = 912.208
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1026] = {
    config_id = 1026,
    gadget_id = 70950011,
    pos = {
      x = 102.57,
      y = 107.145,
      z = 912.3
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  [1027] = {
    config_id = 1027,
    gadget_id = 70950011,
    pos = {
      x = 102.276,
      y = 107.145,
      z = 891.955
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  [1028] = {
    config_id = 1028,
    gadget_id = 70950011,
    pos = {
      x = 102.046,
      y = 107.145,
      z = 872.375
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  [1029] = {
    config_id = 1029,
    gadget_id = 70350085,
    pos = {
      x = 66.717,
      y = 107.648,
      z = 897.01
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1030] = {
    config_id = 1030,
    gadget_id = 70350085,
    pos = {
      x = 64.798,
      y = 107.636,
      z = 891.39
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1031] = {
    config_id = 1031,
    gadget_id = 70350085,
    pos = {
      x = 66.819,
      y = 107.652,
      z = 885.767
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1032] = {
    config_id = 1032,
    gadget_id = 70350085,
    pos = {
      x = 72.528,
      y = 107.611,
      z = 884.119
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1033] = {
    config_id = 1033,
    gadget_id = 70350085,
    pos = {
      x = 77.88,
      y = 107.625,
      z = 885.809
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1034] = {
    config_id = 1034,
    gadget_id = 70350085,
    pos = {
      x = 80.137,
      y = 107.624,
      z = 891.654
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1035] = {
    config_id = 1035,
    gadget_id = 70350085,
    pos = {
      x = 77.78,
      y = 107.602,
      z = 897.234
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1036] = {
    config_id = 1036,
    gadget_id = 70350085,
    pos = {
      x = 72.504,
      y = 107.624,
      z = 899.836
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1037] = {
    config_id = 1037,
    gadget_id = 70310318,
    pos = {
      x = 69.529,
      y = 107.193,
      z = 907.102
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1038] = {
    config_id = 1038,
    gadget_id = 70310319,
    pos = {
      x = 66.567,
      y = 107.301,
      z = 906.882
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1039] = {
    config_id = 1039,
    gadget_id = 70310320,
    pos = {
      x = 62.84,
      y = 107.264,
      z = 906.714
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1040] = {
    config_id = 1040,
    gadget_id = 70360001,
    pos = {
      x = 72.417,
      y = 106.87,
      z = 891.412
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {94}
    }
  },
  [1041] = {
    config_id = 1041,
    gadget_id = 70900201,
    pos = {
      x = 72.417,
      y = 106.777,
      z = 891.412
    },
    rot = {
      x = 0.0,
      y = 204.137,
      z = 0.0
    },
    level = 1
  },
  [1043] = {
    config_id = 1043,
    gadget_id = 70950011,
    pos = {
      x = 81.367,
      y = 106.619,
      z = 872.877
    },
    rot = {
      x = 0.0,
      y = 358.664,
      z = 0.0
    },
    level = 1
  },
  [1044] = {
    config_id = 1044,
    gadget_id = 70950011,
    pos = {
      x = 67.363,
      y = 106.973,
      z = 912.208
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1001042,
    name = "SELECT_OPTION_1042",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_1042",
    action = "action_EVENT_SELECT_OPTION_1042",
    trigger_count = 0
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
    gadgets = {1016, 1040},
    regions = {},
    triggers = {
      "SELECT_OPTION_1042"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      1017,
      1018,
      1019,
      1020,
      1021,
      1022,
      1023,
      1024,
      1025,
      1026,
      1027,
      1028,
      1043,
      1044
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {1041},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_SELECT_OPTION_1042(context, evt)
  if 1040 ~= evt.param1 then
    return false
  end
  if 94 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_1042(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1016, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 235849001, 1040, 94) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 235849001, 2)
  ScriptLib.RemoveExtraGroupSuite(context, 235849001, 3)
  return 0
end
require("V2_8/DLActivityDungeon")
