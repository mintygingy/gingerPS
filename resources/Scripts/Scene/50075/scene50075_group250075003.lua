local base_info = {group_id = 250075003}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 3001,
    gadget_id = 70290519,
    pos = {
      x = 445.532,
      y = 27.612,
      z = 489.184
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
    config_id = 3002,
    gadget_id = 70290520,
    pos = {
      x = 455.056,
      y = 26.188,
      z = 488.488
    },
    rot = {
      x = 0.0,
      y = 30.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3003,
    gadget_id = 70290520,
    pos = {
      x = 458.146,
      y = 26.126,
      z = 484.536
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3004,
    gadget_id = 70290520,
    pos = {
      x = 462.686,
      y = 25.93,
      z = 481.739
    },
    rot = {
      x = 0.0,
      y = 150.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3007,
    gadget_id = 70290482,
    pos = {
      x = 476.402,
      y = 37.535,
      z = 469.727
    },
    rot = {
      x = 0.0,
      y = 320.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1003005,
    name = "GADGET_STATE_CHANGE_3005",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_3005",
    action = "action_EVENT_GADGET_STATE_CHANGE_3005",
    trigger_count = 0
  },
  {
    config_id = 1003006,
    name = "TIMER_EVENT_3006",
    event = EventType.EVENT_TIMER_EVENT,
    source = "1",
    condition = "",
    action = "action_EVENT_TIMER_EVENT_3006"
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
    gadgets = {3001, 3007},
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_3005",
      "TIMER_EVENT_3006"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_3005(context, evt)
  if 3001 ~= evt.param2 or GadgetState.Default ~= evt.param1 or GadgetState.GearStart ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_3005(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 3002}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 3003}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 3004}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  if 0 ~= ScriptLib.CreateGroupTimerEvent(context, 250075003, "1", 30) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_timerevent_by_group")
    return -1
  end
  return 0
end
function action_EVENT_TIMER_EVENT_3006(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 3001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 250075003, EntityType.GADGET, 3002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 250075003, EntityType.GADGET, 3003) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 250075003, EntityType.GADGET, 3004) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
