local base_info = {group_id = 220137016}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 16001,
    gadget_id = 70310251,
    pos = {
      x = 700.984,
      y = 73.81,
      z = -134.529
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    arguments = {29}
  },
  {
    config_id = 16002,
    gadget_id = 70310251,
    pos = {
      x = 701.147,
      y = 73.81,
      z = -150.323
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    arguments = {30}
  },
  {
    config_id = 16003,
    gadget_id = 70310435,
    pos = {
      x = 698.916,
      y = 82.201,
      z = -142.631
    },
    rot = {
      x = 0.0,
      y = 270.839,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 16004,
    gadget_id = 70211101,
    pos = {
      x = 706.149,
      y = 95.503,
      z = -134.04
    },
    rot = {
      x = 0.0,
      y = 269.713,
      z = 0.0
    },
    level = 16,
    drop_tag = "\232\167\163\232\176\156\228\189\142\231\186\167\231\190\164\229\178\155",
    isOneoff = true,
    persistent = true
  },
  {
    config_id = 16005,
    gadget_id = 70211101,
    pos = {
      x = 706.205,
      y = 95.628,
      z = -150.841
    },
    rot = {
      x = 0.0,
      y = 270.25,
      z = 0.0
    },
    level = 16,
    drop_tag = "\232\167\163\232\176\156\228\189\142\231\186\167\231\190\164\229\178\155",
    isOneoff = true,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1016006,
    name = "OBSERVATION_POINT_NOTIFY_16006",
    event = EventType.EVENT_OBSERVATION_POINT_NOTIFY,
    source = "",
    condition = "",
    action = "action_EVENT_OBSERVATION_POINT_NOTIFY_16006",
    trigger_count = 0
  },
  {
    config_id = 1016007,
    name = "OBSERVATION_POINT_NOTIFY_16007",
    event = EventType.EVENT_OBSERVATION_POINT_NOTIFY,
    source = "",
    condition = "",
    action = "action_EVENT_OBSERVATION_POINT_NOTIFY_16007",
    trigger_count = 0
  },
  {
    config_id = 1016008,
    name = "OBSERVATION_POINT_NOTIFY_16008",
    event = EventType.EVENT_OBSERVATION_POINT_NOTIFY,
    source = "",
    condition = "",
    action = "action_EVENT_OBSERVATION_POINT_NOTIFY_16008",
    trigger_count = 0
  },
  {
    config_id = 1016009,
    name = "OBSERVATION_POINT_NOTIFY_16009",
    event = EventType.EVENT_OBSERVATION_POINT_NOTIFY,
    source = "",
    condition = "",
    action = "action_EVENT_OBSERVATION_POINT_NOTIFY_16009",
    trigger_count = 0
  },
  {
    config_id = 1016010,
    name = "GADGET_STATE_CHANGE_16010",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_16010",
    action = "action_EVENT_GADGET_STATE_CHANGE_16010",
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
    gadgets = {
      16001,
      16002,
      16003,
      16004,
      16005
    },
    regions = {},
    triggers = {
      "OBSERVATION_POINT_NOTIFY_16006",
      "OBSERVATION_POINT_NOTIFY_16007",
      "OBSERVATION_POINT_NOTIFY_16008",
      "OBSERVATION_POINT_NOTIFY_16009",
      "GADGET_STATE_CHANGE_16010"
    },
    rand_weight = 100
  }
}
function action_EVENT_OBSERVATION_POINT_NOTIFY_16006(context, evt)
  if 16001 == evt.param1 or 205 == evt.param2 then
    ScriptLib.SetGadgetStateByConfigId(context, 16003, GadgetState.GearStop)
    ScriptLib.SetGadgetStateByConfigId(context, 16002, GadgetState.ChestLocked)
    ScriptLib.SetGadgetStateByConfigId(context, 16001, 205)
  end
  return 0
end
function action_EVENT_OBSERVATION_POINT_NOTIFY_16007(context, evt)
  if 16002 == evt.param1 and 205 == evt.param2 then
    ScriptLib.SetGadgetStateByConfigId(context, 16003, GadgetState.GearStart)
    ScriptLib.SetGadgetStateByConfigId(context, 16001, GadgetState.ChestLocked)
    ScriptLib.SetGadgetStateByConfigId(context, 16002, 205)
  end
  return 0
end
function action_EVENT_OBSERVATION_POINT_NOTIFY_16008(context, evt)
  if 16001 == evt.param1 and 0 == evt.param2 then
    ScriptLib.SetGadgetStateByConfigId(context, 16002, GadgetState.Default)
    ScriptLib.SetGadgetStateByConfigId(context, 16003, GadgetState.Default)
    ScriptLib.SetGadgetStateByConfigId(context, 16001, GadgetState.Default)
  end
  return 0
end
function action_EVENT_OBSERVATION_POINT_NOTIFY_16009(context, evt)
  if 16002 == evt.param1 and 0 == evt.param2 then
    ScriptLib.SetGadgetStateByConfigId(context, 16001, GadgetState.Default)
    ScriptLib.SetGadgetStateByConfigId(context, 16003, GadgetState.Default)
    ScriptLib.SetGadgetStateByConfigId(context, 16002, GadgetState.Default)
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_16010(context, evt)
  if 16003 ~= evt.param2 or GadgetState.GearStop ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_16010(context, evt)
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2802, 1, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  return 0
end
