local base_info = {group_id = 220134069}
local defs = {
  is_movable = 1,
  patterns = {
    [1] = {
      [69001] = {
        connect = 0,
        point_array = 0,
        point_id = {0}
      },
      [69003] = {
        connect = 0,
        point_array = 0,
        point_id = {0}
      }
    },
    [2] = {
      [69003] = {
        connect = 0,
        point_array = 67,
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
      [69001] = {
        connect = 69003,
        point_array = 86,
        point_id = {2}
      },
      [69003] = {
        connect = 69001,
        point_array = 67,
        point_id = {25}
      }
    }
  }
}
monsters = {}
npcs = {}
gadgets = {
  [69001] = {
    config_id = 69001,
    gadget_id = 70310231,
    pos = {
      x = 731.683,
      y = 655.675,
      z = -1781.27
    },
    rot = {
      x = 318.956,
      y = 206.11,
      z = 6.123
    },
    level = 1,
    state = GadgetState.GearAction1,
    is_use_point_array = true
  },
  [69003] = {
    config_id = 69003,
    gadget_id = 70310231,
    pos = {
      x = 779.772,
      y = 624.589,
      z = -1779.734
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
  [69006] = {
    config_id = 69006,
    gadget_id = 70360001,
    pos = {
      x = 779.772,
      y = 624.589,
      z = -1779.734
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
  }
}
regions = {}
triggers = {
  {
    config_id = 1069008,
    name = "SELECT_OPTION_69008",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_69008",
    action = "action_EVENT_SELECT_OPTION_69008",
    trigger_count = 0
  },
  {
    config_id = 1069012,
    name = "VARIABLE_CHANGE_69012",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "star4",
    condition = "condition_EVENT_VARIABLE_CHANGE_69012",
    action = "action_EVENT_VARIABLE_CHANGE_69012",
    trigger_count = 0
  },
  {
    config_id = 1069013,
    name = "GROUP_LOAD_69013",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_69013",
    action = "action_EVENT_GROUP_LOAD_69013",
    trigger_count = 0
  },
  {
    config_id = 1069017,
    name = "PLATFORM_REACH_POINT_69017",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_69017",
    action = "action_EVENT_PLATFORM_REACH_POINT_69017",
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
  },
  {
    config_id = 3,
    name = "star3",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 4,
    name = "star4",
    value = 0,
    no_refresh = true
  }
}
garbages = {
  triggers = {
    {
      config_id = 1069002,
      name = "VARIABLE_CHANGE_69002",
      event = EventType.EVENT_VARIABLE_CHANGE,
      source = "",
      condition = "condition_EVENT_VARIABLE_CHANGE_69002",
      action = "action_EVENT_VARIABLE_CHANGE_69002",
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
      69001,
      69003,
      69006
    },
    regions = {},
    triggers = {
      "SELECT_OPTION_69008",
      "VARIABLE_CHANGE_69012",
      "GROUP_LOAD_69013",
      "PLATFORM_REACH_POINT_69017"
    },
    rand_weight = 100
  }
}
function condition_EVENT_SELECT_OPTION_69008(context, evt)
  if 69006 ~= evt.param1 then
    return false
  end
  if 411 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_69008(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "pattern", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "star1", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "star1", 1, 220134091) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220134069, 69006, 411) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_69012(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "star4") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_69012(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "star1") == 1 and 0 ~= ScriptLib.SetGroupVariableValue(context, "pattern", 3) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_69013(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "star1") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_69013(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "pattern", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_69017(context, evt)
  if 69003 ~= evt.param1 then
    return false
  end
  if 67 ~= evt.param2 then
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
function action_EVENT_PLATFORM_REACH_POINT_69017(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "pattern", 3) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
require("V2_8/ConstellationPattern")
