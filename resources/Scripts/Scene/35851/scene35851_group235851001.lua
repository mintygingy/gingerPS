local base_info = {group_id = 235851001}
local defs = {
  starter = 1001,
  option_id = 94,
  delay = 3,
  time_limit = 300,
  tide_cfg = {
    [1] = {
      monsters = {
        1010,
        1011,
        1012,
        1013,
        1014,
        1015,
        1016,
        1017
      },
      min = 8,
      max = 8
    },
    [2] = {
      monsters = {
        1018,
        1019,
        1020,
        1021,
        1022,
        1023
      },
      min = 6,
      max = 6
    },
    [3] = {
      monsters = {
        1024,
        1025,
        1026
      },
      min = 3,
      max = 3
    },
    [4] = {
      monsters = {
        1027,
        1028,
        1029
      },
      min = 3,
      max = 3
    }
  },
  rand_table = {
    [1] = {
      {1},
      {2},
      {3}
    },
    [2] = {
      {1},
      {2},
      {4}
    }
  },
  type = 3,
  rand_suites = {},
  point_list = {
    1033,
    1034,
    1035,
    1036,
    1037,
    1038,
    1039,
    1040
  },
  buff_pool = {
    1030,
    1031,
    1032
  },
  buff_count = 3,
  challenge_id = 2010048,
  crow_id = {
    1041,
    1042,
    1043,
    1044,
    1045
  },
  buff_pool_spec = {}
}
monsters = {
  [1010] = {
    config_id = 1010,
    monster_id = 21010701,
    pos = {
      x = -16.873,
      y = 84.829,
      z = 16.44
    },
    rot = {
      x = 0.0,
      y = 331.212,
      z = 0.0
    },
    level = 1
  },
  [1011] = {
    config_id = 1011,
    monster_id = 21010701,
    pos = {
      x = -27.289,
      y = 84.838,
      z = 18.338
    },
    rot = {
      x = 0.0,
      y = 57.928,
      z = 0.0
    },
    level = 1
  },
  [1012] = {
    config_id = 1012,
    monster_id = 21010701,
    pos = {
      x = -26.92,
      y = 84.829,
      z = 29.826
    },
    rot = {
      x = 0.0,
      y = 160.605,
      z = 0.0
    },
    level = 1
  },
  [1013] = {
    config_id = 1013,
    monster_id = 21010701,
    pos = {
      x = -16.204,
      y = 84.829,
      z = 27.969
    },
    rot = {
      x = 0.0,
      y = 196.132,
      z = 0.0
    },
    level = 1
  },
  [1014] = {
    config_id = 1014,
    monster_id = 21010301,
    pos = {
      x = -21.876,
      y = 84.829,
      z = 30.2
    },
    rot = {
      x = 0.0,
      y = 169.453,
      z = 0.0
    },
    level = 1
  },
  [1015] = {
    config_id = 1015,
    monster_id = 21010301,
    pos = {
      x = -21.617,
      y = 84.829,
      z = 14.317
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1016] = {
    config_id = 1016,
    monster_id = 21010201,
    pos = {
      x = -25.23,
      y = 84.829,
      z = 16.257
    },
    rot = {
      x = 0.0,
      y = 46.93,
      z = 0.0
    },
    level = 1
  },
  [1017] = {
    config_id = 1017,
    monster_id = 21010201,
    pos = {
      x = -14.832,
      y = 84.829,
      z = 23.964
    },
    rot = {
      x = 0.0,
      y = 274.082,
      z = 0.0
    },
    level = 1
  },
  [1018] = {
    config_id = 1018,
    monster_id = 21020101,
    pos = {
      x = -14.747,
      y = 84.865,
      z = 19.391
    },
    rot = {
      x = 0.0,
      y = 302.458,
      z = 0.0
    },
    level = 1
  },
  [1019] = {
    config_id = 1019,
    monster_id = 21020101,
    pos = {
      x = -19.081,
      y = 84.829,
      z = 29.323
    },
    rot = {
      x = 0.0,
      y = 217.015,
      z = 0.0
    },
    level = 1
  },
  [1020] = {
    config_id = 1020,
    monster_id = 20011301,
    pos = {
      x = -24.655,
      y = 84.829,
      z = 30.034
    },
    rot = {
      x = 0.0,
      y = 152.431,
      z = 0.0
    },
    level = 1
  },
  [1021] = {
    config_id = 1021,
    monster_id = 20011301,
    pos = {
      x = -20.059,
      y = 84.863,
      z = 15.599
    },
    rot = {
      x = 0.0,
      y = 343.884,
      z = 0.0
    },
    level = 1
  },
  [1022] = {
    config_id = 1022,
    monster_id = 20011201,
    pos = {
      x = -23.764,
      y = 84.829,
      z = 17.776
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1023] = {
    config_id = 1023,
    monster_id = 20011201,
    pos = {
      x = -20.639,
      y = 84.864,
      z = 28.978
    },
    rot = {
      x = 0.0,
      y = 204.888,
      z = 0.0
    },
    level = 1
  },
  [1024] = {
    config_id = 1024,
    monster_id = 22010101,
    pos = {
      x = -15.078,
      y = 84.829,
      z = 21.942
    },
    rot = {
      x = 0.0,
      y = 278.926,
      z = 0.0
    },
    level = 1
  },
  [1025] = {
    config_id = 1025,
    monster_id = 22010101,
    pos = {
      x = -23.174,
      y = 84.829,
      z = 18.404
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
    monster_id = 22010101,
    pos = {
      x = -23.796,
      y = 84.829,
      z = 26.944
    },
    rot = {
      x = 0.0,
      y = 132.462,
      z = 0.0
    },
    level = 1
  },
  [1027] = {
    config_id = 1027,
    monster_id = 22010201,
    pos = {
      x = -26.052,
      y = 84.829,
      z = 22.559
    },
    rot = {
      x = 0.0,
      y = 94.954,
      z = 0.0
    },
    level = 1
  },
  [1028] = {
    config_id = 1028,
    monster_id = 22010201,
    pos = {
      x = -18.879,
      y = 84.851,
      z = 26.357
    },
    rot = {
      x = 0.0,
      y = 211.444,
      z = 0.0
    },
    level = 1
  },
  [1029] = {
    config_id = 1029,
    monster_id = 22010201,
    pos = {
      x = -18.285,
      y = 84.829,
      z = 18.08
    },
    rot = {
      x = 0.0,
      y = 292.796,
      z = 0.0
    },
    level = 1
  }
}
npcs = {}
gadgets = {
  [1001] = {
    config_id = 1001,
    gadget_id = 70360010,
    pos = {
      x = -20.526,
      y = 84.486,
      z = 22.281
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    interact_id = 67,
    worktop_config = {
      init_options = {94}
    }
  },
  [1003] = {
    config_id = 1003,
    gadget_id = 70950010,
    pos = {
      x = -22.255,
      y = 84.986,
      z = -14.355
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1004] = {
    config_id = 1004,
    gadget_id = 70950010,
    pos = {
      x = -22.775,
      y = 84.999,
      z = 46.301
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1005] = {
    config_id = 1005,
    gadget_id = 70950010,
    pos = {
      x = -5.863,
      y = 84.77,
      z = -0.456
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  [1006] = {
    config_id = 1006,
    gadget_id = 70950010,
    pos = {
      x = -5.863,
      y = 84.77,
      z = 12.312
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  [1007] = {
    config_id = 1007,
    gadget_id = 70950010,
    pos = {
      x = -5.863,
      y = 84.77,
      z = 25.569
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  [1008] = {
    config_id = 1008,
    gadget_id = 70950010,
    pos = {
      x = -5.863,
      y = 84.77,
      z = 39.15
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  [1009] = {
    config_id = 1009,
    gadget_id = 70950010,
    pos = {
      x = -38.62,
      y = 84.77,
      z = 22.163
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
    gadget_id = 70310324,
    pos = {
      x = -15.568,
      y = 84.829,
      z = 21.795
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
    gadget_id = 70310325,
    pos = {
      x = -24.323,
      y = 84.829,
      z = 28.098
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
    gadget_id = 70310326,
    pos = {
      x = -24.697,
      y = 84.829,
      z = 17.998
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
      x = -14.609,
      y = 84.829,
      z = 14.671
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
      x = -10.601,
      y = 84.795,
      z = 32.201
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
      x = -20.868,
      y = 84.829,
      z = 30.406
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
      x = -20.864,
      y = 84.829,
      z = 24.131
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
      x = -26.823,
      y = 84.829,
      z = 17.149
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
    gadget_id = 70350085,
    pos = {
      x = -28.613,
      y = 84.795,
      z = 29.077
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
    gadget_id = 70350085,
    pos = {
      x = -10.403,
      y = 84.795,
      z = 25.524
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
    gadget_id = 70350085,
    pos = {
      x = -22.649,
      y = 84.829,
      z = 23.538
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
    gadget_id = 44000431,
    pos = {
      x = -15.969,
      y = 84.829,
      z = 25.115
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1042] = {
    config_id = 1042,
    gadget_id = 44000431,
    pos = {
      x = -15.969,
      y = 84.829,
      z = 25.115
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1043] = {
    config_id = 1043,
    gadget_id = 44000431,
    pos = {
      x = -15.969,
      y = 84.829,
      z = 25.115
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1044] = {
    config_id = 1044,
    gadget_id = 44000431,
    pos = {
      x = -15.969,
      y = 84.829,
      z = 25.115
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1045] = {
    config_id = 1045,
    gadget_id = 44000431,
    pos = {
      x = -15.969,
      y = 84.829,
      z = 25.115
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
    config_id = 1001002,
    name = "SELECT_OPTION_1002",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_1002",
    action = "action_EVENT_SELECT_OPTION_1002",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "start",
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
    gadgets = {
      1001,
      1003,
      1004,
      1005,
      1006,
      1007,
      1008
    },
    regions = {},
    triggers = {
      "SELECT_OPTION_1002"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {1009},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_SELECT_OPTION_1002(context, evt)
  if 1001 ~= evt.param1 then
    return false
  end
  if 94 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_1002(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1001, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 235851001, 1001, 94) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 235851001, 2)
  return 0
end
require("V2_8/DLActivityDungeon")
