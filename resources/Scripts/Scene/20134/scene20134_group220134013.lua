local base_info = {group_id = 220134013}
local defs = {
  gear_info = {
    [1] = {
      config_id = 13001,
      connect = {
        13002,
        13006,
        13004
      },
      point_array_id = 24
    },
    [2] = {
      config_id = 13002,
      connect = {
        13003,
        13006,
        13004,
        13001
      },
      point_array_id = 25
    },
    [3] = {
      config_id = 13003,
      connect = {
        13009,
        13007,
        13006,
        13002
      },
      point_array_id = 26
    },
    [4] = {
      config_id = 13004,
      connect = {
        13001,
        13002,
        13006,
        13005
      },
      point_array_id = 27
    },
    [5] = {
      config_id = 13005,
      connect = {
        13006,
        13008,
        13010,
        13004
      },
      point_array_id = 28
    },
    [6] = {
      config_id = 13006,
      connect = {
        13002,
        13004,
        13008,
        13007
      },
      point_array_id = 29
    },
    [7] = {
      config_id = 13007,
      connect = {
        13003,
        13009,
        13008,
        13006
      },
      point_array_id = 30
    },
    [8] = {
      config_id = 13008,
      connect = {
        13006,
        13007,
        13010,
        13005
      },
      point_array_id = 31
    },
    [9] = {
      config_id = 13009,
      connect = {
        13010,
        13008,
        13007
      },
      point_array_id = 32
    },
    [10] = {
      config_id = 13010,
      connect = {
        13009,
        13007,
        13008
      },
      point_array_id = 33
    }
  },
  solutions = {
    [1] = {
      connection = {
        2,
        2,
        3,
        3,
        1,
        4,
        2,
        1,
        1,
        3
      },
      ends = {}
    },
    [2] = {
      connection = {
        2,
        2,
        3,
        3,
        1,
        3,
        4,
        3,
        3,
        1
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
    config_id = 13001,
    gadget_id = 70310178,
    pos = {
      x = 388.172,
      y = 612.565,
      z = -1523.242
    },
    rot = {
      x = 0.0,
      y = 71.446,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 13002,
    gadget_id = 70310178,
    pos = {
      x = 390.381,
      y = 612.567,
      z = -1527.98
    },
    rot = {
      x = 0.0,
      y = 330.057,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 13003,
    gadget_id = 70310178,
    pos = {
      x = 391.497,
      y = 612.569,
      z = -1534.406
    },
    rot = {
      x = 0.0,
      y = 344.479,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 13004,
    gadget_id = 70310178,
    pos = {
      x = 393.064,
      y = 612.567,
      z = -1521.38
    },
    rot = {
      x = 0.0,
      y = 53.901,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 13005,
    gadget_id = 70310178,
    pos = {
      x = 398.285,
      y = 612.567,
      z = -1517.433
    },
    rot = {
      x = 0.0,
      y = 235.407,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 13006,
    gadget_id = 70310178,
    pos = {
      x = 395.109,
      y = 612.563,
      z = -1526.12
    },
    rot = {
      x = 0.0,
      y = 250.364,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 13007,
    gadget_id = 70310178,
    pos = {
      x = 396.998,
      y = 612.563,
      z = -1530.675
    },
    rot = {
      x = 0.0,
      y = 340.25,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 13008,
    gadget_id = 70310178,
    pos = {
      x = 399.484,
      y = 612.313,
      z = -1523.844
    },
    rot = {
      x = 0.0,
      y = 339.37,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 13009,
    gadget_id = 70310178,
    pos = {
      x = 402.528,
      y = 612.491,
      z = -1535.258
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 13010,
    gadget_id = 70310178,
    pos = {
      x = 407.115,
      y = 612.569,
      z = -1525.067
    },
    rot = {
      x = 0.0,
      y = 278.924,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 13011,
    gadget_id = 70211111,
    pos = {
      x = 410.257,
      y = 612.57,
      z = -1531.505
    },
    rot = {
      x = 0.0,
      y = 292.238,
      z = 0.0
    },
    level = 16,
    chest_drop_id = 1050204,
    drop_count = 1,
    isOneoff = true,
    persistent = true,
    autopick = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1013012,
    name = "VARIABLE_CHANGE_13012",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_13012",
    action = "action_EVENT_VARIABLE_CHANGE_13012",
    trigger_count = 0
  },
  {
    config_id = 1013013,
    name = "GADGET_STATE_CHANGE_13013",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_13013",
    action = "action_EVENT_GADGET_STATE_CHANGE_13013",
    trigger_count = 0
  },
  {
    config_id = 1013014,
    name = "QUEST_START_13014",
    event = EventType.EVENT_QUEST_START,
    source = "4007606",
    condition = "condition_EVENT_QUEST_START_13014",
    action = "action_EVENT_QUEST_START_13014",
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
      13001,
      13002,
      13003,
      13004,
      13005,
      13006,
      13007,
      13008,
      13009,
      13010
    },
    regions = {},
    triggers = {
      "VARIABLE_CHANGE_13012",
      "GADGET_STATE_CHANGE_13013",
      "QUEST_START_13014"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {13011},
    regions = {},
    triggers = {
      "QUEST_START_13014"
    },
    rand_weight = 100
  }
}
function condition_EVENT_VARIABLE_CHANGE_13012(context, evt)
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
function action_EVENT_VARIABLE_CHANGE_13012(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220134013, 2)
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_13013(context, evt)
  if 13011 ~= evt.param2 or GadgetState.ChestOpened ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_13013(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "finish", 1, 220134014) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finish", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.AddQuestProgress(context, "monaroom4complete") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220134018, 2)
  if 0 ~= ScriptLib.GoToGroupSuite(context, 220134013, 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : goto_groupSuite")
    return -1
  end
  if 0 ~= ScriptLib.GoToGroupSuite(context, 220134018, 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : goto_groupSuite")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_START_13014(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "finish") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_QUEST_START_13014(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "monaroom4complete") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
require("V2_8/ConstellationMachine")
