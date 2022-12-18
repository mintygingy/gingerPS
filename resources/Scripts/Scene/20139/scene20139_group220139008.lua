local base_info = {group_id = 220139008}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 8001,
    gadget_id = 70310251,
    pos = {
      x = -63.432,
      y = 89.9,
      z = -135.788
    },
    rot = {
      x = 0.0,
      y = 181.992,
      z = 0.0
    },
    level = 1,
    persistent = true,
    arguments = {16}
  },
  {
    config_id = 8002,
    gadget_id = 70310282,
    pos = {
      x = -63.737,
      y = 87.609,
      z = -86.912
    },
    rot = {
      x = 0.0,
      y = 0.0,
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
    name = "GADGET_STATE_CHANGE_8004",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_8004",
    action = "action_EVENT_GADGET_STATE_CHANGE_8004",
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
      "GADGET_STATE_CHANGE_8004"
    },
    rand_weight = 100
  }
}
function action_EVENT_OBSERVATION_POINT_NOTIFY_8003(context, evt)
  if 8001 == evt.param1 and 405 == evt.param2 then
    ScriptLib.SetGroupGadgetStateByConfigId(context, 220139010, 10003, GadgetState.GearStart)
    ScriptLib.SetGroupGadgetStateByConfigId(context, 220139010, 10004, GadgetState.GearStart)
    ScriptLib.SetGroupGadgetStateByConfigId(context, 220139010, 10005, GadgetState.GearStart)
    ScriptLib.SetGadgetStateByConfigId(context, 8001, GadgetState.ChestOpened)
    ScriptLib.SetGadgetStateByConfigId(context, 8002, GadgetState.GearStart)
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_8004(context, evt)
  if 8002 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_8004(context, evt)
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2802, 3, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  return 0
end
