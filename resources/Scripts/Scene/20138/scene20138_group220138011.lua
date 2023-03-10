local base_info = {group_id = 220138011}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 11001,
    gadget_id = 70310251,
    pos = {
      x = 87.525,
      y = 30.355,
      z = -20.16
    },
    rot = {
      x = 0.0,
      y = 91.028,
      z = 0.0
    },
    level = 1,
    state = GadgetState.ChestLocked,
    persistent = true,
    arguments = {22}
  },
  {
    config_id = 11002,
    gadget_id = 70310378,
    pos = {
      x = 9.28,
      y = 35.149,
      z = 4.02
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 11006,
    gadget_id = 70310429,
    pos = {
      x = 12.171,
      y = 34.272,
      z = 4.211
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 90.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 11007,
    gadget_id = 70310429,
    pos = {
      x = 12.508,
      y = 43.208,
      z = 4.004
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 270.0
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
    config_id = 1011004,
    name = "OBSERVATION_POINT_NOTIFY_11004",
    event = EventType.EVENT_OBSERVATION_POINT_NOTIFY,
    source = "",
    condition = "",
    action = "action_EVENT_OBSERVATION_POINT_NOTIFY_11004",
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
    gadgets = {
      11001,
      11002,
      11006,
      11007
    },
    regions = {},
    triggers = {
      "OBSERVATION_POINT_NOTIFY_11003",
      "OBSERVATION_POINT_NOTIFY_11004",
      "GADGET_STATE_CHANGE_11005"
    },
    rand_weight = 100
  }
}
function action_EVENT_OBSERVATION_POINT_NOTIFY_11003(context, evt)
  if 11001 == evt.param1 and 206 == evt.param2 then
    ScriptLib.SetGadgetStateByConfigId(context, 11002, GadgetState.GearStart)
    ScriptLib.AddQuestProgress(context, "4007216")
    ScriptLib.SetGadgetStateByConfigId(context, 11001, 206)
    ScriptLib.KillEntityByConfigId(context, {
      group_id = 220138011,
      config_id = 11006,
      entity_type = EntityType.GADGET
    })
    ScriptLib.KillEntityByConfigId(context, {
      group_id = 220138011,
      config_id = 11007,
      entity_type = EntityType.GADGET
    })
  end
  return 0
end
function action_EVENT_OBSERVATION_POINT_NOTIFY_11004(context, evt)
  if 11001 == evt.param1 and 0 == evt.param2 then
    ScriptLib.SetGadgetStateByConfigId(context, 11002, GadgetState.Default)
    ScriptLib.SetGadgetStateByConfigId(context, 11001, GadgetState.Default)
    ScriptLib.CreateGadget(context, {config_id = 11006})
    ScriptLib.CreateGadget(context, {config_id = 11007})
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
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2802, 2, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  return 0
end
