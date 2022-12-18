local base_info = {group_id = 250080002}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 2001,
    gadget_id = 70590060,
    pos = {
      x = 100.056,
      y = 102.578,
      z = 40.0
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
    config_id = 2004,
    gadget_id = 70290375,
    pos = {
      x = 92.941,
      y = 100.002,
      z = 34.3
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  {
    config_id = 2005,
    gadget_id = 70360002,
    pos = {
      x = 103.172,
      y = 99.419,
      z = 26.63
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
    config_id = 1002006,
    name = "SELECT_OPTION_2006",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_2006",
    action = "action_EVENT_SELECT_OPTION_2006",
    trigger_count = 0
  },
  {
    config_id = 1002007,
    name = "SELECT_OPTION_2007",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_2007",
    action = "action_EVENT_SELECT_OPTION_2007",
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
    gadgets = {
      2001,
      2004,
      2005
    },
    regions = {},
    triggers = {
      "SELECT_OPTION_2006",
      "SELECT_OPTION_2007"
    },
    rand_weight = 100
  }
}
function condition_EVENT_SELECT_OPTION_2006(context, evt)
  if 2005 ~= evt.param1 then
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
function action_EVENT_SELECT_OPTION_2006(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "turn", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  local tempParam = {route_type = 0, turn_mode = true}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 2001, 1, {1}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_2007(context, evt)
  if 2005 ~= evt.param1 then
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
function action_EVENT_SELECT_OPTION_2007(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "turn", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  local tempParam = {route_type = 0, turn_mode = true}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 2001, 1, {2}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  return 0
end
