local base_info = {group_id = 220134091}
local defs = {
  is_movable = 1,
  patterns = {
    [1] = {
      [91001] = {
        connect = 0,
        point_array = 0,
        point_id = {0}
      },
      [91004] = {
        connect = 0,
        point_array = 0,
        point_id = {0}
      }
    },
    [2] = {
      [91001] = {
        connect = 0,
        point_array = 68,
        point_id = {
          1,
          2,
          3,
          4,
          5,
          6,
          7,
          8
        }
      }
    },
    [3] = {
      [91001] = {
        connect = 91004,
        point_array = 68,
        point_id = {8}
      },
      [91004] = {
        connect = 91001,
        point_array = 67,
        point_id = {25}
      }
    }
  }
}
monsters = {}
npcs = {}
gadgets = {
  [91001] = {
    config_id = 91001,
    gadget_id = 70310231,
    pos = {
      x = 715.407,
      y = 616.951,
      z = -1771.728
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
  [91002] = {
    config_id = 91002,
    gadget_id = 70360001,
    pos = {
      x = 715.407,
      y = 616.951,
      z = -1771.728
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
  [91004] = {
    config_id = 91004,
    gadget_id = 70310231,
    pos = {
      x = 734.206,
      y = 655.766,
      z = -1787.659
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearAction1,
    is_use_point_array = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1091003,
    name = "SELECT_OPTION_91003",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_91003",
    action = "action_EVENT_SELECT_OPTION_91003",
    trigger_count = 0
  },
  {
    config_id = 1091005,
    name = "PLATFORM_REACH_POINT_91005",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_91005",
    action = "action_EVENT_PLATFORM_REACH_POINT_91005",
    trigger_count = 0
  },
  {
    config_id = 1091006,
    name = "GROUP_LOAD_91006",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_91006",
    action = "action_EVENT_GROUP_LOAD_91006",
    trigger_count = 0
  },
  {
    config_id = 1091008,
    name = "VARIABLE_CHANGE_91008",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "star1",
    condition = "condition_EVENT_VARIABLE_CHANGE_91008",
    action = "action_EVENT_VARIABLE_CHANGE_91008",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "star1",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 2,
    name = "star2",
    value = 0,
    no_refresh = true
  }
}
garbages = {
  triggers = {
    {
      config_id = 1091007,
      name = "VARIABLE_CHANGE_91007",
      event = EventType.EVENT_VARIABLE_CHANGE,
      source = "",
      condition = "condition_EVENT_VARIABLE_CHANGE_91007",
      action = "action_EVENT_VARIABLE_CHANGE_91007",
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
      91001,
      91002,
      91004
    },
    regions = {},
    triggers = {
      "SELECT_OPTION_91003",
      "PLATFORM_REACH_POINT_91005",
      "GROUP_LOAD_91006",
      "VARIABLE_CHANGE_91008"
    },
    rand_weight = 100
  }
}
function condition_EVENT_SELECT_OPTION_91003(context, evt)
  if 91002 ~= evt.param1 then
    return false
  end
  if 411 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_91003(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "pattern", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "star2", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220134091, 91002, 411) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_91005(context, evt)
  if 91001 ~= evt.param1 then
    return false
  end
  if 68 ~= evt.param2 then
    return false
  end
  if 8 ~= evt.param3 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "star1") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_91005(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "pattern", 3) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_91006(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "star2") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_91006(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "pattern", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_91008(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "star1") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_91008(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "star2") == 1 and 0 ~= ScriptLib.SetGroupVariableValue(context, "pattern", 3) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
require("V2_8/ConstellationPattern")
