local base_info = {group_id = 220137011}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 11001,
    gadget_id = 70310251,
    pos = {
      x = 687.056,
      y = 73.752,
      z = -102.519
    },
    rot = {
      x = 0.0,
      y = 265.868,
      z = 0.0
    },
    level = 1,
    persistent = true,
    arguments = {8}
  },
  {
    config_id = 11002,
    gadget_id = 70310356,
    pos = {
      x = 698.735,
      y = 59.86,
      z = -92.032
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
    config_id = 1011003,
    name = "OBSERVATION_POINT_NOTIFY_11003",
    event = EventType.EVENT_OBSERVATION_POINT_NOTIFY,
    source = "",
    condition = "",
    action = "action_EVENT_OBSERVATION_POINT_NOTIFY_11003",
    trigger_count = 0
  },
  {
    config_id = 1011005,
    name = "GADGET_STATE_CHANGE_11005",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_11005",
    action = "action_EVENT_GADGET_STATE_CHANGE_11005",
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
    gadgets = {11001, 11002},
    regions = {},
    triggers = {
      "OBSERVATION_POINT_NOTIFY_11003",
      "GADGET_STATE_CHANGE_11005"
    },
    rand_weight = 100
  }
}
function action_EVENT_OBSERVATION_POINT_NOTIFY_11003(context, evt)
  if 11001 == evt.param1 and 605 == evt.param2 then
    ScriptLib.SetGadgetStateByConfigId(context, 11002, GadgetState.GearStart)
    ScriptLib.SetGroupVariableValueByGroup(context, "eyefinish2", 1, 220137021)
    ScriptLib.SetGadgetStateByConfigId(context, 11001, GadgetState.ChestOpened)
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_11005(context, evt)
  if 11002 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_11005(context, evt)
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2802, 1, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  return 0
end
