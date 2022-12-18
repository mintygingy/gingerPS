local base_info = {group_id = 220139023}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 23001,
    gadget_id = 70380319,
    pos = {
      x = -2.539,
      y = 43.608,
      z = 7.138
    },
    rot = {
      x = 0.0,
      y = 269.471,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 23002,
    gadget_id = 70310380,
    pos = {
      x = -5.227,
      y = 43.588,
      z = 9.41
    },
    rot = {
      x = 0.0,
      y = 90.542,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  }
}
regions = {}
triggers = {
  {
    config_id = 1023003,
    name = "GADGET_STATE_CHANGE_23003",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_23003",
    action = "action_EVENT_GADGET_STATE_CHANGE_23003",
    trigger_count = 0
  },
  {
    config_id = 1023004,
    name = "GADGET_STATE_CHANGE_23004",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_23004",
    action = "action_EVENT_GADGET_STATE_CHANGE_23004",
    trigger_count = 0
  },
  {
    config_id = 1023005,
    name = "PLATFORM_ARRIVAL_23005",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_23005",
    action = "action_EVENT_PLATFORM_ARRIVAL_23005",
    trigger_count = 0
  },
  {
    config_id = 1023006,
    name = "PLATFORM_ARRIVAL_23006",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_23006",
    action = "action_EVENT_PLATFORM_ARRIVAL_23006",
    trigger_count = 0
  },
  {
    config_id = 1023007,
    name = "GADGET_STATE_CHANGE_23007",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_23007",
    action = "action_EVENT_GADGET_STATE_CHANGE_23007",
    trigger_count = 0
  },
  {
    config_id = 1023008,
    name = "PLATFORM_ARRIVAL_23008",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_23008",
    action = "action_EVENT_PLATFORM_ARRIVAL_23008",
    trigger_count = 0
  },
  {
    config_id = 1023009,
    name = "GADGET_CREATE_23009",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_23009",
    action = "action_EVENT_GADGET_CREATE_23009",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "lifter_pos_mark",
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
    gadgets = {23001, 23002},
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_23003",
      "GADGET_STATE_CHANGE_23004",
      "PLATFORM_ARRIVAL_23005",
      "PLATFORM_ARRIVAL_23006",
      "GADGET_STATE_CHANGE_23007",
      "PLATFORM_ARRIVAL_23008",
      "GADGET_CREATE_23009"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_23003(context, evt)
  if 23001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.Default ~= evt.param3 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "lifter_pos_mark") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_23003(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 23001, 3, {2}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_23004(context, evt)
  if 23001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.Default ~= evt.param3 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "lifter_pos_mark") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_23004(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 23001, 3, {1}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_23005(context, evt)
  if 23001 ~= evt.param1 then
    return false
  end
  if 3 ~= evt.param2 then
    return false
  end
  if 2 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_23005(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "lifter_pos_mark", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_23006(context, evt)
  if 23001 ~= evt.param1 then
    return false
  end
  if 3 ~= evt.param2 then
    return false
  end
  if 1 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_23006(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "lifter_pos_mark", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 23002, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_23007(context, evt)
  if 23002 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.Default ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_23007(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 23001, 3, {1}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "lifter_pos_mark", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_23008(context, evt)
  if 23001 ~= evt.param1 then
    return false
  end
  if 3 ~= evt.param2 then
    return false
  end
  if 2 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_23008(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 23002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_23009(context, evt)
  if 23001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_23009(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "lifter_pos_mark", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
