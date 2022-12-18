local base_info = {group_id = 220137013}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 13001,
    gadget_id = 70310251,
    pos = {
      x = 669.019,
      y = 58.42,
      z = -45.045
    },
    rot = {
      x = 0.0,
      y = 243.699,
      z = 0.0
    },
    level = 1,
    persistent = true,
    arguments = {10}
  },
  {
    config_id = 13002,
    gadget_id = 70310361,
    pos = {
      x = 739.638,
      y = 78.834,
      z = 18.43
    },
    rot = {
      x = 0.0,
      y = 359.899,
      z = 0.0
    },
    level = 1,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1013003,
    name = "OBSERVATION_POINT_NOTIFY_13003",
    event = EventType.EVENT_OBSERVATION_POINT_NOTIFY,
    source = "",
    condition = "",
    action = "action_EVENT_OBSERVATION_POINT_NOTIFY_13003",
    trigger_count = 0
  },
  {
    config_id = 1013005,
    name = "GADGET_STATE_CHANGE_13005",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_13005",
    action = "action_EVENT_GADGET_STATE_CHANGE_13005",
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
    gadgets = {13001, 13002},
    regions = {},
    triggers = {
      "OBSERVATION_POINT_NOTIFY_13003",
      "GADGET_STATE_CHANGE_13005"
    },
    rand_weight = 100
  }
}
function action_EVENT_OBSERVATION_POINT_NOTIFY_13003(context, evt)
  if 13001 == evt.param1 and 205 == evt.param2 then
    ScriptLib.SetGadgetStateByConfigId(context, 13002, GadgetState.GearStart)
    ScriptLib.AddQuestProgress(context, "4007116")
    ScriptLib.SetGadgetStateByConfigId(context, 13001, GadgetState.ChestOpened)
    ScriptLib.SetGroupVariableValueByGroup(context, "towerPosition", 1, 220137005)
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_13005(context, evt)
  if 13002 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_13005(context, evt)
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2802, 1, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  return 0
end
