local base_info = {group_id = 220137008}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 8001,
    gadget_id = 70310251,
    pos = {
      x = 597.699,
      y = 59.172,
      z = -163.35
    },
    rot = {
      x = 0.0,
      y = 234.997,
      z = 0.0
    },
    level = 1,
    persistent = true,
    arguments = {5}
  },
  {
    config_id = 8002,
    gadget_id = 70310353,
    pos = {
      x = 632.714,
      y = 59.072,
      z = -142.178
    },
    rot = {
      x = 0.0,
      y = 359.92,
      z = 0.0
    },
    level = 1,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1008003,
    name = "OBSERVATION_POINT_NOTIFY_8003",
    event = EventType.EVENT_OBSERVATION_POINT_NOTIFY,
    source = "",
    condition = "",
    action = "action_EVENT_OBSERVATION_POINT_NOTIFY_8003",
    trigger_count = 0
  },
  {
    config_id = 1008004,
    name = "OBSERVATION_POINT_NOTIFY_8004",
    event = EventType.EVENT_OBSERVATION_POINT_NOTIFY,
    source = "",
    condition = "",
    action = "action_EVENT_OBSERVATION_POINT_NOTIFY_8004",
    trigger_count = 0
  },
  {
    config_id = 1008005,
    name = "GADGET_STATE_CHANGE_8005",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_8005",
    action = "action_EVENT_GADGET_STATE_CHANGE_8005",
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
    gadgets = {8001, 8002},
    regions = {},
    triggers = {
      "OBSERVATION_POINT_NOTIFY_8003",
      "OBSERVATION_POINT_NOTIFY_8004",
      "GADGET_STATE_CHANGE_8005"
    },
    rand_weight = 100
  }
}
function action_EVENT_OBSERVATION_POINT_NOTIFY_8003(context, evt)
  if 8001 == evt.param1 and 205 == evt.param2 then
    ScriptLib.SetGadgetStateByConfigId(context, 8002, GadgetState.GearStart)
    ScriptLib.SetGroupGadgetStateByConfigId(context, 220137009, 9001, GadgetState.Default)
    ScriptLib.SetGadgetStateByConfigId(context, 8001, 205)
  end
  return 0
end
function action_EVENT_OBSERVATION_POINT_NOTIFY_8004(context, evt)
  if 8001 == evt.param1 and 0 == evt.param2 then
    ScriptLib.SetGadgetStateByConfigId(context, 8002, GadgetState.Default)
    ScriptLib.SetGroupGadgetStateByConfigId(context, 220137009, 9001, GadgetState.ChestLocked)
    ScriptLib.SetGadgetStateByConfigId(context, 8001, GadgetState.Default)
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_8005(context, evt)
  if 8002 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_8005(context, evt)
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2802, 1, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  return 0
end
