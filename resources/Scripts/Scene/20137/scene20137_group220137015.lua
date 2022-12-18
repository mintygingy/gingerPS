local base_info = {group_id = 220137015}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 15001,
    gadget_id = 70380319,
    pos = {
      x = 726.922,
      y = 86.707,
      z = -45.491
    },
    rot = {
      x = 0.0,
      y = 270.404,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop,
    start_route = false,
    mark_flag = 2,
    is_use_point_array = true
  },
  {
    config_id = 15003,
    gadget_id = 70310380,
    pos = {
      x = 724.35,
      y = 86.505,
      z = -47.363
    },
    rot = {
      x = 0.0,
      y = 310.977,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop,
    mark_flag = 1
  },
  {
    config_id = 15004,
    gadget_id = 70310380,
    pos = {
      x = 732.417,
      y = 139.365,
      z = -48.786
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    mark_flag = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1015002,
    name = "GADGET_CREATE_15002",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_15002",
    action = "action_EVENT_GADGET_CREATE_15002",
    trigger_count = 0
  },
  {
    config_id = 1015005,
    name = "GADGET_STATE_CHANGE_15005",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_15005",
    action = "action_EVENT_GADGET_STATE_CHANGE_15005",
    trigger_count = 0
  },
  {
    config_id = 1015006,
    name = "PLATFORM_ARRIVAL_15006",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_15006",
    action = "action_EVENT_PLATFORM_ARRIVAL_15006",
    trigger_count = 0
  },
  {
    config_id = 1015007,
    name = "GADGET_STATE_CHANGE_15007",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_15007",
    action = "action_EVENT_GADGET_STATE_CHANGE_15007",
    trigger_count = 0
  },
  {
    config_id = 1015008,
    name = "PLATFORM_ARRIVAL_15008",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_15008",
    action = "action_EVENT_PLATFORM_ARRIVAL_15008",
    trigger_count = 0
  },
  {
    config_id = 1015009,
    name = "GADGET_STATE_CHANGE_15009",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_15009",
    action = "action_EVENT_GADGET_STATE_CHANGE_15009",
    trigger_count = 0
  },
  {
    config_id = 1015010,
    name = "GADGET_STATE_CHANGE_15010",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_15010",
    action = "action_EVENT_GADGET_STATE_CHANGE_15010",
    trigger_count = 0
  },
  {
    config_id = 1015011,
    name = "GADGET_CREATE_15011",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_15011",
    action = "action_EVENT_GADGET_CREATE_15011",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "lifter_pos_mark",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 2,
    name = "DoorOpen",
    value = 0,
    no_refresh = true
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
      15001,
      15003,
      15004
    },
    regions = {},
    triggers = {
      "GADGET_CREATE_15002",
      "GADGET_STATE_CHANGE_15005",
      "PLATFORM_ARRIVAL_15006",
      "GADGET_STATE_CHANGE_15007",
      "PLATFORM_ARRIVAL_15008",
      "GADGET_STATE_CHANGE_15009",
      "GADGET_STATE_CHANGE_15010",
      "GADGET_CREATE_15011"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_15002(context, evt)
  if 15001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_15002(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "lifter_pos_mark", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_15005(context, evt)
  if 15003 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.Default ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_15005(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 15001, 1, {1}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "lifter_pos_mark", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_15006(context, evt)
  if 15001 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  if 2 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_15006(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 15003, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 15004, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_15007(context, evt)
  if 15004 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.Default ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_15007(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 15001, 1, {2}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "lifter_pos_mark", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_15008(context, evt)
  if 15001 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  if 1 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_15008(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 15004, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 15003, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_15009(context, evt)
  if 15001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.Default ~= evt.param3 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "lifter_pos_mark") ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "DoorOpen") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_15009(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 15001, 1, {2}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "lifter_pos_mark", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_15010(context, evt)
  if 15001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.Default ~= evt.param3 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "lifter_pos_mark") ~= 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "DoorOpen") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_15010(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 15001, 1, {1}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "lifter_pos_mark", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_15011(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "DoorOpen") ~= 1 then
    return false
  end
  if 15001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_15011(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 15001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
