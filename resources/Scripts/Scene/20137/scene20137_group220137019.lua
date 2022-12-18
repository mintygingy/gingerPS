local base_info = {group_id = 220137019}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 19001,
    gadget_id = 70380319,
    pos = {
      x = 724.095,
      y = 72.415,
      z = -155.337
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 19002,
    gadget_id = 70310380,
    pos = {
      x = 720.772,
      y = 72.318,
      z = -153.05
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  }
}
regions = {}
triggers = {
  {
    config_id = 1019003,
    name = "GADGET_STATE_CHANGE_19003",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_19003",
    action = "action_EVENT_GADGET_STATE_CHANGE_19003",
    trigger_count = 0
  },
  {
    config_id = 1019004,
    name = "GADGET_STATE_CHANGE_19004",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_19004",
    action = "action_EVENT_GADGET_STATE_CHANGE_19004",
    trigger_count = 0
  },
  {
    config_id = 1019005,
    name = "PLATFORM_ARRIVAL_19005",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_19005",
    action = "action_EVENT_PLATFORM_ARRIVAL_19005",
    trigger_count = 0
  },
  {
    config_id = 1019006,
    name = "PLATFORM_ARRIVAL_19006",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_19006",
    action = "action_EVENT_PLATFORM_ARRIVAL_19006",
    trigger_count = 0
  },
  {
    config_id = 1019007,
    name = "GADGET_STATE_CHANGE_19007",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_19007",
    action = "action_EVENT_GADGET_STATE_CHANGE_19007",
    trigger_count = 0
  },
  {
    config_id = 1019008,
    name = "PLATFORM_ARRIVAL_19008",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_19008",
    action = "action_EVENT_PLATFORM_ARRIVAL_19008",
    trigger_count = 0
  },
  {
    config_id = 1019009,
    name = "GADGET_CREATE_19009",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_19009",
    action = "action_EVENT_GADGET_CREATE_19009",
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
    gadgets = {19001, 19002},
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_19003",
      "GADGET_STATE_CHANGE_19004",
      "PLATFORM_ARRIVAL_19005",
      "PLATFORM_ARRIVAL_19006",
      "GADGET_STATE_CHANGE_19007",
      "PLATFORM_ARRIVAL_19008",
      "GADGET_CREATE_19009"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_19003(context, evt)
  if 19001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.Default ~= evt.param3 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "lifter_pos_mark") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_19003(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 19001, 10, {2}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_19004(context, evt)
  if 19001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.Default ~= evt.param3 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "lifter_pos_mark") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_19004(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 19001, 10, {1}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_19005(context, evt)
  if 19001 ~= evt.param1 then
    return false
  end
  if 10 ~= evt.param2 then
    return false
  end
  if 2 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_19005(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "lifter_pos_mark", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_19006(context, evt)
  if 19001 ~= evt.param1 then
    return false
  end
  if 10 ~= evt.param2 then
    return false
  end
  if 1 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_19006(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "lifter_pos_mark", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 19002, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_19007(context, evt)
  if 19002 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.Default ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_19007(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 19001, 10, {1}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_19008(context, evt)
  if 19001 ~= evt.param1 then
    return false
  end
  if 10 ~= evt.param2 then
    return false
  end
  if 2 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_19008(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 19002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_19009(context, evt)
  if 19001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_19009(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "lifter_pos_mark", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
