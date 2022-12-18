local base_info = {group_id = 220139024}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 24001,
    gadget_id = 70380319,
    pos = {
      x = 36.477,
      y = 61.462,
      z = 163.658
    },
    rot = {
      x = 0.0,
      y = 179.684,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 24002,
    gadget_id = 70310380,
    pos = {
      x = 36.587,
      y = 61.183,
      z = 159.429
    },
    rot = {
      x = 0.0,
      y = 358.519,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  }
}
regions = {}
triggers = {
  {
    config_id = 1024003,
    name = "GADGET_STATE_CHANGE_24003",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_24003",
    action = "action_EVENT_GADGET_STATE_CHANGE_24003",
    trigger_count = 0
  },
  {
    config_id = 1024004,
    name = "GADGET_STATE_CHANGE_24004",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_24004",
    action = "action_EVENT_GADGET_STATE_CHANGE_24004",
    trigger_count = 0
  },
  {
    config_id = 1024005,
    name = "PLATFORM_ARRIVAL_24005",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_24005",
    action = "action_EVENT_PLATFORM_ARRIVAL_24005",
    trigger_count = 0
  },
  {
    config_id = 1024006,
    name = "PLATFORM_ARRIVAL_24006",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_24006",
    action = "action_EVENT_PLATFORM_ARRIVAL_24006",
    trigger_count = 0
  },
  {
    config_id = 1024007,
    name = "GADGET_STATE_CHANGE_24007",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_24007",
    action = "action_EVENT_GADGET_STATE_CHANGE_24007",
    trigger_count = 0
  },
  {
    config_id = 1024008,
    name = "PLATFORM_ARRIVAL_24008",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_24008",
    action = "action_EVENT_PLATFORM_ARRIVAL_24008",
    trigger_count = 0
  },
  {
    config_id = 1024009,
    name = "GADGET_CREATE_24009",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_24009",
    action = "action_EVENT_GADGET_CREATE_24009",
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
    gadgets = {24001, 24002},
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_24003",
      "GADGET_STATE_CHANGE_24004",
      "PLATFORM_ARRIVAL_24005",
      "PLATFORM_ARRIVAL_24006",
      "GADGET_STATE_CHANGE_24007",
      "PLATFORM_ARRIVAL_24008",
      "GADGET_CREATE_24009"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_24003(context, evt)
  if 24001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.Default ~= evt.param3 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "lifter_pos_mark") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_24003(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 24001, 4, {2}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_24004(context, evt)
  if 24001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.Default ~= evt.param3 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "lifter_pos_mark") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_24004(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 24001, 4, {1}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_24005(context, evt)
  if 24001 ~= evt.param1 then
    return false
  end
  if 4 ~= evt.param2 then
    return false
  end
  if 2 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_24005(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "lifter_pos_mark", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_24006(context, evt)
  if 24001 ~= evt.param1 then
    return false
  end
  if 4 ~= evt.param2 then
    return false
  end
  if 1 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_24006(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "lifter_pos_mark", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 24002, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_24007(context, evt)
  if 24002 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.Default ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_24007(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 24001, 4, {1}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "lifter_pos_mark", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_24008(context, evt)
  if 24001 ~= evt.param1 then
    return false
  end
  if 4 ~= evt.param2 then
    return false
  end
  if 2 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_24008(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 24002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_24009(context, evt)
  if 24001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_24009(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "lifter_pos_mark", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
