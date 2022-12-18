local base_info = {group_id = 250080008}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 8001,
    gadget_id = 70590060,
    pos = {
      x = 149.1,
      y = 79.72,
      z = 21.6
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
    config_id = 8002,
    gadget_id = 70360002,
    pos = {
      x = 146.844,
      y = 76.866,
      z = 34.13
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
    config_id = 1008003,
    name = "SELECT_OPTION_8003",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_8003",
    action = "action_EVENT_SELECT_OPTION_8003",
    trigger_count = 0
  },
  {
    config_id = 1008004,
    name = "SELECT_OPTION_8004",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_8004",
    action = "action_EVENT_SELECT_OPTION_8004",
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
    gadgets = {8001, 8002},
    regions = {},
    triggers = {
      "SELECT_OPTION_8003",
      "SELECT_OPTION_8004"
    },
    rand_weight = 100
  }
}
function condition_EVENT_SELECT_OPTION_8003(context, evt)
  if 8002 ~= evt.param1 then
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
function action_EVENT_SELECT_OPTION_8003(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "turn", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  local tempParam = {route_type = 0, turn_mode = true}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 8001, 1, {1}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_8004(context, evt)
  if 8002 ~= evt.param1 then
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
function action_EVENT_SELECT_OPTION_8004(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "turn", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  local tempParam = {route_type = 0, turn_mode = true}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 8001, 1, {2}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  return 0
end
