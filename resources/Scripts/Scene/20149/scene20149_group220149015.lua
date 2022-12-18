local base_info = {group_id = 220149015}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 15001,
    gadget_id = 70290580,
    pos = {
      x = 466.395,
      y = 152.347,
      z = 335.163
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    route_id = 2
  },
  {
    config_id = 15002,
    gadget_id = 70290580,
    pos = {
      x = 466.395,
      y = 152.347,
      z = 335.163
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    route_id = 2
  },
  {
    config_id = 15007,
    gadget_id = 70360001,
    pos = {
      x = 427.24,
      y = 145.133,
      z = 308.068
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 15008,
    gadget_id = 70290580,
    pos = {
      x = 466.395,
      y = 152.347,
      z = 335.163
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    route_id = 2
  }
}
regions = {}
triggers = {
  {
    config_id = 1015003,
    name = "GADGET_CREATE_15003",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_15003",
    action = "action_EVENT_GADGET_CREATE_15003",
    trigger_count = 0
  },
  {
    config_id = 1015004,
    name = "TIMER_EVENT_15004",
    event = EventType.EVENT_TIMER_EVENT,
    source = "1",
    condition = "",
    action = "action_EVENT_TIMER_EVENT_15004",
    trigger_count = 0
  },
  {
    config_id = 1015005,
    name = "GADGET_CREATE_15005",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_15005",
    action = "action_EVENT_GADGET_CREATE_15005",
    trigger_count = 0
  },
  {
    config_id = 1015006,
    name = "TIMER_EVENT_15006",
    event = EventType.EVENT_TIMER_EVENT,
    source = "2",
    condition = "",
    action = "action_EVENT_TIMER_EVENT_15006",
    trigger_count = 0
  },
  {
    config_id = 1015009,
    name = "GADGET_CREATE_15009",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_15009",
    action = "action_EVENT_GADGET_CREATE_15009",
    trigger_count = 0
  },
  {
    config_id = 1015010,
    name = "TIMER_EVENT_15010",
    event = EventType.EVENT_TIMER_EVENT,
    source = "3",
    condition = "",
    action = "action_EVENT_TIMER_EVENT_15010",
    trigger_count = 0
  }
}
variables = {}
init_config = {
  suite = 1,
  end_suite = 0,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {15007},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {15001},
    regions = {},
    triggers = {
      "GADGET_CREATE_15003",
      "TIMER_EVENT_15004",
      "GADGET_CREATE_15005",
      "TIMER_EVENT_15006",
      "GADGET_CREATE_15009",
      "TIMER_EVENT_15010"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_15003(context, evt)
  if 15001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_15003(context, evt)
  if 0 ~= ScriptLib.CreateGroupTimerEvent(context, 220149015, "1", 8) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_timerevent_by_group")
    return -1
  end
  return 0
end
function action_EVENT_TIMER_EVENT_15004(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 15002}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 15001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_15005(context, evt)
  if 15002 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_15005(context, evt)
  if 0 ~= ScriptLib.CreateGroupTimerEvent(context, 220149015, "2", 8) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_timerevent_by_group")
    return -1
  end
  return 0
end
function action_EVENT_TIMER_EVENT_15006(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 15008}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 15002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_15009(context, evt)
  if 15008 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_15009(context, evt)
  if 0 ~= ScriptLib.CreateGroupTimerEvent(context, 220149015, "3", 8) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_timerevent_by_group")
    return -1
  end
  return 0
end
function action_EVENT_TIMER_EVENT_15010(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 15001}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 15008, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
