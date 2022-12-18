local base_info = {group_id = 235848001}
local defs = {
  starter = 1041,
  option_id = 94,
  delay = 3,
  time_limit = 300,
  challenge_id = 2010037,
  tide_cfg = {
    [1] = {
      monsters = {
        1002,
        1003,
        1004,
        1005,
        1006,
        1007,
        1008
      },
      min = 7,
      max = 7
    },
    [2] = {
      monsters = {
        1009,
        1010,
        1011,
        1012
      },
      min = 4,
      max = 4
    },
    [3] = {
      monsters = {1014, 1016},
      min = 2,
      max = 2
    },
    [4] = {
      monsters = {1013},
      min = 1,
      max = 1
    },
    [5] = {
      monsters = {1047},
      min = 1,
      max = 1
    },
    [6] = {
      monsters = {1048},
      min = 1,
      max = 1
    },
    [7] = {
      monsters = {1049},
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
    1030,
    1031,
    1032,
    1033,
    1034,
    1035,
    1036,
    1037
  },
  buff_pool = {1040},
  buff_count = 2,
  buff_pool_spec = {1038, 1039}
}
monsters = {
  [1002] = {
    config_id = 1002,
    monster_id = 25080101,
    pos = {
      x = 76.009,
      y = 106.97,
      z = 907.768
    },
    rot = {
      x = 0.0,
      y = 164.329,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 1
  },
  [1003] = {
    config_id = 1003,
    monster_id = 25080101,
    pos = {
      x = 72.027,
      y = 106.97,
      z = 908.062
    },
    rot = {
      x = 0.0,
      y = 164.329,
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
      x = 69.292,
      y = 106.97,
      z = 904.034
    },
    rot = {
      x = 0.0,
      y = 164.329,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 1
  },
  [1005] = {
    config_id = 1005,
    monster_id = 25080201,
    pos = {
      x = 77.913,
      y = 106.97,
      z = 903.312
    },
    rot = {
      x = 0.0,
      y = 164.329,
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
      x = 66.738,
      y = 106.97,
      z = 874.266
    },
    rot = {
      x = 0.0,
      y = 337.374,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 1
  },
  [1007] = {
    config_id = 1007,
    monster_id = 25080301,
    pos = {
      x = 80.028,
      y = 106.97,
      z = 873.1
    },
    rot = {
      x = 0.0,
      y = 337.374,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 1
  },
  [1008] = {
    config_id = 1008,
    monster_id = 25100101,
    pos = {
      x = 73.51,
      y = 106.97,
      z = 902.441
    },
    rot = {
      x = 0.0,
      y = 166.547,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 1
  },
  [1009] = {
    config_id = 1009,
    monster_id = 23010101,
    pos = {
      x = 79.22,
      y = 106.97,
      z = 907.314
    },
    rot = {
      x = 0.0,
      y = 163.78,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  [1010] = {
    config_id = 1010,
    monster_id = 23010201,
    pos = {
      x = 69.346,
      y = 106.97,
      z = 908.038
    },
    rot = {
      x = 0.0,
      y = 163.78,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  [1011] = {
    config_id = 1011,
    monster_id = 23010301,
    pos = {
      x = 71.799,
      y = 106.97,
      z = 903.788
    },
    rot = {
      x = 0.0,
      y = 163.78,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  [1012] = {
    config_id = 1012,
    monster_id = 23010501,
    pos = {
      x = 77.444,
      y = 106.97,
      z = 903.196
    },
    rot = {
      x = 0.0,
      y = 163.78,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  [1013] = {
    config_id = 1013,
    monster_id = 26050401,
    pos = {
      x = 73.893,
      y = 106.97,
      z = 875.301
    },
    rot = {
      x = 0.0,
      y = 10.782,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {1021},
    pose_id = 101
  },
  [1014] = {
    config_id = 1014,
    monster_id = 24010301,
    pos = {
      x = 74.932,
      y = 106.97,
      z = 875.949
    },
    rot = {
      x = 0.0,
      y = 351.824,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 100
  },
  [1016] = {
    config_id = 1016,
    monster_id = 24010301,
    pos = {
      x = 72.391,
      y = 107.01,
      z = 908.115
    },
    rot = {
      x = 0.0,
      y = 162.311,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 100
  },
  [1047] = {
    config_id = 1047,
    monster_id = 26050101,
    pos = {
      x = 73.893,
      y = 106.97,
      z = 875.301
    },
    rot = {
      x = 0.0,
      y = 10.782,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {1021},
    pose_id = 101
  },
  [1048] = {
    config_id = 1048,
    monster_id = 26050301,
    pos = {
      x = 73.893,
      y = 106.97,
      z = 875.301
    },
    rot = {
      x = 0.0,
      y = 10.782,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {1021},
    pose_id = 101
  },
  [1049] = {
    config_id = 1049,
    monster_id = 26050201,
    pos = {
      x = 73.893,
      y = 106.97,
      z = 875.301
    },
    rot = {
      x = 0.0,
      y = 10.782,
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
  [1001] = {
    config_id = 1001,
    gadget_id = 70360010,
    pos = {
      x = 72.461,
      y = 106.87,
      z = 891.608
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1015] = {
    config_id = 1015,
    gadget_id = 70360001,
    pos = {
      x = 74.193,
      y = 106.97,
      z = 888.722
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
      x = 94.046,
      y = 104.984,
      z = 869.714
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
      x = 63.306,
      y = 104.984,
      z = 868.997
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
      x = 47.615,
      y = 104.984,
      z = 868.63
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
      x = 42.178,
      y = 105.801,
      z = 871.109
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
      x = 42.831,
      y = 105.156,
      z = 891.205
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
      x = 42.921,
      y = 106.285,
      z = 911.078
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
      x = 51.199,
      y = 106.843,
      z = 912.289
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
      x = 74.519,
      y = 106.851,
      z = 912.289
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
      x = 91.966,
      y = 105.918,
      z = 912.289
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
      x = 102.964,
      y = 107.145,
      z = 911.88
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
      x = 102.964,
      y = 107.145,
      z = 891.535
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
      x = 102.964,
      y = 107.145,
      z = 871.955
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  [1030] = {
    config_id = 1030,
    gadget_id = 70350085,
    pos = {
      x = 66.96,
      y = 107.648,
      z = 897.301
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
      x = 65.002,
      y = 107.636,
      z = 891.842
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
      x = 67.332,
      y = 107.652,
      z = 885.546
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
      x = 72.642,
      y = 107.611,
      z = 883.863
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
      x = 78.324,
      y = 107.625,
      z = 885.814
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
      x = 79.88,
      y = 107.624,
      z = 891.612
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
      x = 78.438,
      y = 107.602,
      z = 896.729
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
    gadget_id = 70350085,
    pos = {
      x = 73.008,
      y = 107.598,
      z = 899.507
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
    gadget_id = 70310318,
    pos = {
      x = 66.151,
      y = 107.193,
      z = 906.681
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
    gadget_id = 70310319,
    pos = {
      x = 63.189,
      y = 107.301,
      z = 906.462
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
    gadget_id = 70310320,
    pos = {
      x = 59.462,
      y = 107.264,
      z = 906.293
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1041] = {
    config_id = 1041,
    gadget_id = 70360001,
    pos = {
      x = 72.461,
      y = 106.87,
      z = 891.608
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
  [1042] = {
    config_id = 1042,
    gadget_id = 70900201,
    pos = {
      x = 72.461,
      y = 107.483,
      z = 891.608
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
      x = 76.729,
      y = 104.984,
      z = 869.31
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
      x = 67.567,
      y = 105.918,
      z = 912.289
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
    config_id = 1001029,
    name = "SELECT_OPTION_1029",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_1029",
    action = "action_EVENT_SELECT_OPTION_1029",
    trigger_count = 0
  },
  {
    config_id = 1001045,
    name = "GADGET_CREATE_1045",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_1045",
    action = "action_EVENT_GADGET_CREATE_1045"
  },
  {
    config_id = 1001046,
    name = "GADGET_CREATE_1046",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_1046",
    action = "action_EVENT_GADGET_CREATE_1046"
  }
}
variables = {
  {
    config_id = 1,
    name = "suite",
    value = 0,
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
    gadgets = {1015},
    regions = {},
    triggers = {
      "GADGET_CREATE_1046"
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
    gadgets = {1042},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {1001, 1041},
    regions = {},
    triggers = {
      "SELECT_OPTION_1029",
      "GADGET_CREATE_1045"
    },
    rand_weight = 100
  }
}
function condition_EVENT_SELECT_OPTION_1029(context, evt)
  if 1041 ~= evt.param1 then
    return false
  end
  if 94 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_1029(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 235848001, 2)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 235848001, 1041, 94) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1001, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.RemoveExtraGroupSuite(context, 235848001, 3)
  return 0
end
function condition_EVENT_GADGET_CREATE_1045(context, evt)
  if 1001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_1045(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "suite", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_1046(context, evt)
  if 1015 ~= evt.param1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "suite") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_1046(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 235848001, 4)
  return 0
end
require("V2_8/DLActivityDungeon")
