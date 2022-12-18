local base_info = {group_id = 220137014}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 14001,
    gadget_id = 70380319,
    pos = {
      x = 536.601,
      y = 73.892,
      z = -203.276
    },
    rot = {
      x = 0.0,
      y = 316.027,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1014002,
    name = "GADGET_STATE_CHANGE_14002",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_14002",
    action = "action_EVENT_GADGET_STATE_CHANGE_14002",
    trigger_count = 0
  },
  {
    config_id = 1014003,
    name = "GADGET_STATE_CHANGE_14003",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_14003",
    action = "action_EVENT_GADGET_STATE_CHANGE_14003",
    trigger_count = 0
  },
  {
    config_id = 1014004,
    name = "PLATFORM_ARRIVAL_14004",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_14004",
    action = "action_EVENT_PLATFORM_ARRIVAL_14004",
    trigger_count = 0
  },
  {
    config_id = 1014005,
    name = "PLATFORM_ARRIVAL_14005",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_14005",
    action = "action_EVENT_PLATFORM_ARRIVAL_14005",
    trigger_count = 0
  },
  {
    config_id = 1014006,
    name = "GADGET_CREATE_14006",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_14006",
    action = "action_EVENT_GADGET_CREATE_14006",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "lifter_pos_mark",
    value = 1,
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
    gadgets = {14001},
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_14002",
      "GADGET_STATE_CHANGE_14003",
      "PLATFORM_ARRIVAL_14004",
      "PLATFORM_ARRIVAL_14005",
      "GADGET_CREATE_14006"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_14002(context, evt)
  if 14001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.Default ~= evt.param3 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "lifter_pos_mark") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_14002(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 14001, 8, {1}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_14003(context, evt)
  if 14001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.Default ~= evt.param3 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "lifter_pos_mark") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_14003(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 14001, 8, {2}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_14004(context, evt)
  if 14001 ~= evt.param1 then
    return false
  end
  if 8 ~= evt.param2 then
    return false
  end
  if 1 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_14004(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "lifter_pos_mark", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_14005(context, evt)
  if 14001 ~= evt.param1 then
    return false
  end
  if 8 ~= evt.param2 then
    return false
  end
  if 2 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_14005(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "lifter_pos_mark", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_14006(context, evt)
  if 14001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_14006(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "lifter_pos_mark", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
