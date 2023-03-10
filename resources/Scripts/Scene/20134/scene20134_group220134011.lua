local base_info = {group_id = 220134011}
local defs = {
  gear_info = {
    [1] = {
      config_id = 11001,
      connect = {
        11002,
        11003,
        11004
      },
      point_array_id = 14
    },
    [2] = {
      config_id = 11002,
      connect = {
        11007,
        11006,
        11003,
        11001
      },
      point_array_id = 15
    },
    [3] = {
      config_id = 11003,
      connect = {
        11006,
        11004,
        11001,
        11002
      },
      point_array_id = 16
    },
    [4] = {
      config_id = 11004,
      connect = {
        11003,
        11006,
        11009,
        11005
      },
      point_array_id = 17
    },
    [5] = {
      config_id = 11005,
      connect = {
        11006,
        11009,
        11010,
        11004
      },
      point_array_id = 18
    },
    [6] = {
      config_id = 11006,
      connect = {
        11007,
        11009,
        11003
      },
      point_array_id = 19
    },
    [7] = {
      config_id = 11007,
      connect = {
        11008,
        11006,
        11002
      },
      point_array_id = 20
    },
    [8] = {
      config_id = 11008,
      connect = {
        11007,
        11006,
        11009
      },
      point_array_id = 21
    },
    [9] = {
      config_id = 11009,
      connect = {
        11010,
        11005,
        11006,
        11007
      },
      point_array_id = 22
    },
    [10] = {
      config_id = 11010,
      connect = {11005, 11009},
      point_array_id = 23
    }
  },
  solutions = {
    [1] = {
      connection = {
        1,
        3,
        2,
        4,
        4,
        3,
        2,
        1,
        3,
        2
      },
      ends = {11005}
    },
    [2] = {
      connection = {
        1,
        3,
        2,
        4,
        4,
        3,
        2,
        1,
        3,
        2
      },
      ends = {11004}
    },
    [3] = {
      connection = {
        1,
        4,
        4,
        1,
        4,
        3,
        2,
        1,
        3,
        2
      },
      ends = {11001}
    },
    [4] = {
      connection = {
        1,
        4,
        4,
        1,
        4,
        3,
        2,
        1,
        3,
        2
      },
      ends = {11002}
    },
    [5] = {
      connection = {
        1,
        3,
        0,
        1,
        4,
        3,
        2,
        1,
        3,
        2
      },
      ends = {}
    },
    [6] = {
      connection = {
        1,
        3,
        1,
        1,
        4,
        1,
        2,
        1,
        3,
        2
      },
      ends = {11006}
    },
    [7] = {
      connection = {
        1,
        3,
        1,
        1,
        4,
        2,
        2,
        1,
        1,
        2
      },
      ends = {11010}
    },
    [8] = {
      connection = {
        1,
        3,
        1,
        1,
        4,
        2,
        2,
        1,
        1,
        2
      },
      ends = {11009}
    },
    [9] = {
      connection = {
        1,
        3,
        1,
        1,
        4,
        1,
        1,
        1,
        3,
        2
      },
      ends = {11008}
    },
    [10] = {
      connection = {
        1,
        3,
        1,
        1,
        4,
        1,
        1,
        1,
        3,
        2
      },
      ends = {11007}
    }
  },
  turn_option = 31
}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 11001,
    gadget_id = 70310178,
    pos = {
      x = 614.577,
      y = 618.793,
      z = -1534.032
    },
    rot = {
      x = 0.0,
      y = 179.345,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 11002,
    gadget_id = 70310178,
    pos = {
      x = 609.276,
      y = 618.793,
      z = -1534.309
    },
    rot = {
      x = 0.0,
      y = 87.196,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 11003,
    gadget_id = 70310178,
    pos = {
      x = 612.182,
      y = 618.793,
      z = -1540.792
    },
    rot = {
      x = 0.0,
      y = 334.823,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 11004,
    gadget_id = 70310178,
    pos = {
      x = 614.935,
      y = 618.793,
      z = -1547.068
    },
    rot = {
      x = 0.0,
      y = 242.34,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 11005,
    gadget_id = 70310178,
    pos = {
      x = 611.604,
      y = 618.793,
      z = -1548.746
    },
    rot = {
      x = 359.572,
      y = 71.938,
      z = 0.168
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 11006,
    gadget_id = 70310178,
    pos = {
      x = 605.574,
      y = 618.793,
      z = -1543.525
    },
    rot = {
      x = 0.0,
      y = 77.029,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 11007,
    gadget_id = 70310178,
    pos = {
      x = 602.058,
      y = 618.793,
      z = -1539.591
    },
    rot = {
      x = 0.0,
      y = 50.326,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 11008,
    gadget_id = 70310178,
    pos = {
      x = 599.097,
      y = 618.793,
      z = -1540.663
    },
    rot = {
      x = 0.0,
      y = 147.917,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 11009,
    gadget_id = 70310178,
    pos = {
      x = 604.016,
      y = 618.793,
      z = -1548.048
    },
    rot = {
      x = 0.0,
      y = 341.13,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 11010,
    gadget_id = 70310178,
    pos = {
      x = 607.587,
      y = 618.793,
      z = -1552.154
    },
    rot = {
      x = 0.0,
      y = 321.244,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 11011,
    gadget_id = 70211111,
    pos = {
      x = 620.423,
      y = 618.968,
      z = -1537.197
    },
    rot = {
      x = 0.0,
      y = 248.228,
      z = 0.0
    },
    level = 16,
    chest_drop_id = 1050205,
    drop_count = 1,
    isOneoff = true,
    persistent = true,
    autopick = true
  },
  {
    config_id = 11014,
    gadget_id = 70290428,
    pos = {
      x = 622.758,
      y = 618.869,
      z = -1568.071
    },
    rot = {
      x = 0.0,
      y = 336.364,
      z = 0.0
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1011012,
    name = "VARIABLE_CHANGE_11012",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_11012",
    action = "action_EVENT_VARIABLE_CHANGE_11012",
    trigger_count = 0
  },
  {
    config_id = 1011013,
    name = "GADGET_STATE_CHANGE_11013",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_11013",
    action = "action_EVENT_GADGET_STATE_CHANGE_11013",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "finish",
    value = 0,
    no_refresh = true
  }
}
init_config = {
  suite = 1,
  end_suite = 2,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {
      11001,
      11002,
      11003,
      11004,
      11005,
      11006,
      11007,
      11008,
      11009,
      11010,
      11014
    },
    regions = {},
    triggers = {
      "VARIABLE_CHANGE_11012",
      "GADGET_STATE_CHANGE_11013"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {11011},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_VARIABLE_CHANGE_11012(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "solution") < 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_11012(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220134011, 2)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finish", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_11013(context, evt)
  if 11011 ~= evt.param2 or GadgetState.ChestOpened ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_11013(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "monaroom3complete") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220134017, 2)
  if 0 ~= ScriptLib.GoToGroupSuite(context, 220134011, 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : goto_groupSuite")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 11014}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
require("V2_8/ConstellationMachine")
