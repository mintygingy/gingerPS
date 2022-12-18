local base_info = {group_id = 220137010}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 10001,
    gadget_id = 70310251,
    pos = {
      x = 694.707,
      y = 73.785,
      z = -112.14
    },
    rot = {
      x = 0.0,
      y = 180.579,
      z = 0.0
    },
    level = 1,
    persistent = true,
    arguments = {7}
  },
  {
    config_id = 10002,
    gadget_id = 70310355,
    pos = {
      x = 702.13,
      y = 62.935,
      z = -102.153
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
    config_id = 1010003,
    name = "OBSERVATION_POINT_NOTIFY_10003",
    event = EventType.EVENT_OBSERVATION_POINT_NOTIFY,
    source = "",
    condition = "",
    action = "action_EVENT_OBSERVATION_POINT_NOTIFY_10003",
    trigger_count = 0
  },
  {
    config_id = 1010005,
    name = "GADGET_STATE_CHANGE_10005",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_10005",
    action = "action_EVENT_GADGET_STATE_CHANGE_10005",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "duankou1",
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
    gadgets = {10001, 10002},
    regions = {},
    triggers = {
      "OBSERVATION_POINT_NOTIFY_10003",
      "GADGET_STATE_CHANGE_10005"
    },
    rand_weight = 100
  }
}
function action_EVENT_OBSERVATION_POINT_NOTIFY_10003(context, evt)
  if 10001 == evt.param1 and 605 == evt.param2 then
    ScriptLib.SetGadgetStateByConfigId(context, 10002, GadgetState.GearStart)
    ScriptLib.SetGroupVariableValueByGroup(context, "eyefinish1", 1, 220137021)
    ScriptLib.SetGadgetStateByConfigId(context, 10001, GadgetState.ChestOpened)
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_10005(context, evt)
  if 10002 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_10005(context, evt)
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2802, 1, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  return 0
end
