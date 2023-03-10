local base_info = {group_id = 220134010}
local defs = {
  gear_info = {
    [1] = {
      config_id = 10001,
      connect = {
        10002,
        10004,
        10005,
        10003
      },
      point_array_id = 7
    },
    [2] = {
      config_id = 10002,
      connect = {
        10001,
        10005,
        10003,
        10004
      },
      point_array_id = 8
    },
    [3] = {
      config_id = 10003,
      connect = {
        10001,
        10002,
        10007
      },
      point_array_id = 9
    },
    [4] = {
      config_id = 10004,
      connect = {
        10002,
        10005,
        10003
      },
      point_array_id = 10
    },
    [5] = {
      config_id = 10005,
      connect = {
        10002,
        10001,
        10003
      },
      point_array_id = 11
    },
    [6] = {
      config_id = 10006,
      connect = {
        10001,
        10004,
        10007
      },
      point_array_id = 12
    },
    [7] = {
      config_id = 10007,
      connect = {
        10003,
        10004,
        10006
      },
      point_array_id = 13
    }
  },
  solutions = {
    [1] = {
      connection = {
        4,
        4,
        3,
        2,
        3,
        1,
        3
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
    config_id = 10001,
    gadget_id = 70310178,
    pos = {
      x = 601.984,
      y = 619.96,
      z = -1650.954
    },
    rot = {
      x = 0.0,
      y = 326.573,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 10002,
    gadget_id = 70310178,
    pos = {
      x = 598.334,
      y = 619.955,
      z = -1643.532
    },
    rot = {
      x = 0.0,
      y = 240.415,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 10003,
    gadget_id = 70310178,
    pos = {
      x = 593.349,
      y = 619.955,
      z = -1651.093
    },
    rot = {
      x = 0.0,
      y = 265.957,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 10004,
    gadget_id = 70310178,
    pos = {
      x = 594.717,
      y = 619.95,
      z = -1645.159
    },
    rot = {
      x = 0.0,
      y = 187.522,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 10005,
    gadget_id = 70310178,
    pos = {
      x = 596.122,
      y = 619.953,
      z = -1649.41
    },
    rot = {
      x = 0.0,
      y = 232.855,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 10006,
    gadget_id = 70310178,
    pos = {
      x = 593.322,
      y = 619.965,
      z = -1633.698
    },
    rot = {
      x = 1.238,
      y = 211.25,
      z = 356.186
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 10007,
    gadget_id = 70310178,
    pos = {
      x = 582.822,
      y = 619.965,
      z = -1651.545
    },
    rot = {
      x = 2.082,
      y = 26.142,
      z = 1.135
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 10009,
    gadget_id = 70290428,
    pos = {
      x = 611.361,
      y = 621.394,
      z = -1656.906
    },
    rot = {
      x = 0.0,
      y = 301.23,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 10010,
    gadget_id = 70290428,
    pos = {
      x = 611.361,
      y = 630.967,
      z = -1656.906
    },
    rot = {
      x = 0.0,
      y = 301.23,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 10011,
    gadget_id = 70211111,
    pos = {
      x = 582.266,
      y = 620.056,
      z = -1639.298
    },
    rot = {
      x = 0.0,
      y = 121.077,
      z = 0.0
    },
    level = 16,
    chest_drop_id = 1050206,
    drop_count = 1,
    isOneoff = true,
    persistent = true,
    autopick = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1010008,
    name = "GADGET_STATE_CHANGE_10008",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_10008",
    action = "action_EVENT_GADGET_STATE_CHANGE_10008",
    trigger_count = 0
  },
  {
    config_id = 1010012,
    name = "VARIABLE_CHANGE_10012",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_10012",
    action = "action_EVENT_VARIABLE_CHANGE_10012",
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
      10001,
      10002,
      10003,
      10004,
      10005,
      10006,
      10007,
      10009,
      10010
    },
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_10008",
      "VARIABLE_CHANGE_10012"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {10011},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_10008(context, evt)
  if 10011 ~= evt.param2 or GadgetState.ChestOpened ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_10008(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "monaroom2complete") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220134016, 2)
  if 0 ~= ScriptLib.GoToGroupSuite(context, 220134010, 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : goto_groupSuite")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 10009}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 10010}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_10012(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "solution") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_10012(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220134010, 2)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finish", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
require("V2_8/ConstellationMachine")
