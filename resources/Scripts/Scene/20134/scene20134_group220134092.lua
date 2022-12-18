local base_info = {group_id = 220134092}
local defs = {
  is_movable = 1,
  patterns = {
    [1] = {
      [92001] = {
        connect = 0,
        point_array = 0,
        point_id = {0}
      },
      [92004] = {
        connect = 0,
        point_array = 0,
        point_id = {0}
      }
    },
    [2] = {
      [92001] = {
        connect = 0,
        point_array = 69,
        point_id = {
          1,
          2,
          3,
          4,
          5,
          6,
          7,
          8,
          9,
          10,
          11,
          12,
          13,
          14,
          15,
          16,
          17,
          18,
          19,
          20,
          21,
          22,
          23,
          24,
          25
        }
      }
    },
    [3] = {
      [92001] = {
        connect = 92004,
        point_array = 69,
        point_id = {25}
      },
      [92004] = {
        connect = 92001,
        point_array = 87,
        point_id = {2}
      }
    }
  }
}
monsters = {}
npcs = {}
gadgets = {
  [92001] = {
    config_id = 92001,
    gadget_id = 70310231,
    pos = {
      x = 713.299,
      y = 623.845,
      z = -1717.99
    },
    rot = {
      x = 318.956,
      y = 206.11,
      z = 6.123
    },
    level = 1,
    persistent = true,
    is_use_point_array = true
  },
  [92002] = {
    config_id = 92002,
    gadget_id = 70360001,
    pos = {
      x = 713.299,
      y = 623.845,
      z = -1717.99
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {411}
    }
  },
  [92004] = {
    config_id = 92004,
    gadget_id = 70310231,
    pos = {
      x = 718.437,
      y = 662.479,
      z = -1777.488
    },
    rot = {
      x = 318.956,
      y = 206.11,
      z = 6.123
    },
    level = 1,
    state = GadgetState.GearAction1,
    is_use_point_array = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1092003,
    name = "SELECT_OPTION_92003",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_92003",
    action = "action_EVENT_SELECT_OPTION_92003",
    trigger_count = 0
  },
  {
    config_id = 1092005,
    name = "PLATFORM_REACH_POINT_92005",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_92005",
    action = "action_EVENT_PLATFORM_REACH_POINT_92005",
    trigger_count = 0
  },
  {
    config_id = 1092006,
    name = "GROUP_LOAD_92006",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_92006",
    action = "action_EVENT_GROUP_LOAD_92006",
    trigger_count = 0
  },
  {
    config_id = 1092008,
    name = "VARIABLE_CHANGE_92008",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "star4",
    condition = "condition_EVENT_VARIABLE_CHANGE_92008",
    action = "action_EVENT_VARIABLE_CHANGE_92008",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "star3",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 2,
    name = "star4",
    value = 0,
    no_refresh = true
  }
}
garbages = {
  triggers = {
    {
      config_id = 1092007,
      name = "VARIABLE_CHANGE_92007",
      event = EventType.EVENT_VARIABLE_CHANGE,
      source = "",
      condition = "condition_EVENT_VARIABLE_CHANGE_92007",
      action = "action_EVENT_VARIABLE_CHANGE_92007",
      trigger_count = 0
    }
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
      92001,
      92002,
      92004
    },
    regions = {},
    triggers = {
      "SELECT_OPTION_92003",
      "PLATFORM_REACH_POINT_92005",
      "GROUP_LOAD_92006",
      "VARIABLE_CHANGE_92008"
    },
    rand_weight = 100
  }
}
function condition_EVENT_SELECT_OPTION_92003(context, evt)
  if 92002 ~= evt.param1 then
    return false
  end
  if 411 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_92003(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "pattern", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "star3", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220134092, 92002, 411) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_92005(context, evt)
  if 92001 ~= evt.param1 then
    return false
  end
  if 69 ~= evt.param2 then
    return false
  end
  if 25 ~= evt.param3 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "star4") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_92005(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "pattern", 3) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_92006(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "star3") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_92006(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "pattern", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_92008(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "star4") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_92008(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "star3") == 1 and 0 ~= ScriptLib.SetGroupVariableValue(context, "pattern", 3) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
require("V2_8/ConstellationPattern")
