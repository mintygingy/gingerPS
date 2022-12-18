local base_info = {group_id = 250080004}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 4001,
    gadget_id = 70590060,
    pos = {
      x = 69.38,
      y = 130.0,
      z = 69.38
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
    config_id = 4003,
    gadget_id = 70360002,
    pos = {
      x = 81.684,
      y = 127.375,
      z = 66.399
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
    config_id = 1004004,
    name = "SELECT_OPTION_4004",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_4004",
    action = "action_EVENT_SELECT_OPTION_4004",
    trigger_count = 0
  },
  {
    config_id = 1004005,
    name = "SELECT_OPTION_4005",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_4005",
    action = "action_EVENT_SELECT_OPTION_4005",
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
    gadgets = {4001, 4003},
    regions = {},
    triggers = {
      "SELECT_OPTION_4004",
      "SELECT_OPTION_4005"
    },
    rand_weight = 100
  }
}
function condition_EVENT_SELECT_OPTION_4004(context, evt)
  if 4003 ~= evt.param1 then
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
function action_EVENT_SELECT_OPTION_4004(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "turn", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  local tempParam = {route_type = 0, turn_mode = true}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 4001, 4, {1}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_4005(context, evt)
  if 4003 ~= evt.param1 then
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
function action_EVENT_SELECT_OPTION_4005(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "turn", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  local tempParam = {route_type = 0, turn_mode = true}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 4001, 4, {2}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  return 0
end
