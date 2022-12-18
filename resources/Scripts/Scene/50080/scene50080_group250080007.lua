local base_info = {group_id = 250080007}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 7001,
    gadget_id = 70590060,
    pos = {
      x = 121.43,
      y = 72.28,
      z = 74.54
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    start_route = false,
    is_use_point_array = true,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE
  },
  {
    config_id = 7002,
    gadget_id = 70360002,
    pos = {
      x = 108.006,
      y = 69.713,
      z = 71.903
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {7}
    }
  }
}
regions = {}
triggers = {
  {
    config_id = 1007003,
    name = "SELECT_OPTION_7003",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_7003",
    action = "action_EVENT_SELECT_OPTION_7003",
    trigger_count = 0
  },
  {
    config_id = 1007004,
    name = "SELECT_OPTION_7004",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_7004",
    action = "action_EVENT_SELECT_OPTION_7004",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "turn",
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
    gadgets = {7001, 7002},
    regions = {},
    triggers = {
      "SELECT_OPTION_7003",
      "SELECT_OPTION_7004"
    },
    rand_weight = 100
  }
}
function condition_EVENT_SELECT_OPTION_7003(context, evt)
  if 7002 ~= evt.param1 then
    return false
  end
  if 7 ~= evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "turn") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_7003(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "turn", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  local tempParam = {route_type = 0, turn_mode = true}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 7001, 4, {1}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_7004(context, evt)
  if 7002 ~= evt.param1 then
    return false
  end
  if 7 ~= evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "turn") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_7004(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "turn", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  local tempParam = {route_type = 0, turn_mode = true}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 7001, 4, {2}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  return 0
end
