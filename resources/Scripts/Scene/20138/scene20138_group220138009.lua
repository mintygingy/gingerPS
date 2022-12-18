local base_info = {group_id = 220138009}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 9001,
    gadget_id = 70310251,
    pos = {
      x = -26.943,
      y = -27.303,
      z = -35.413
    },
    rot = {
      x = 0.0,
      y = 273.446,
      z = 0.0
    },
    level = 1,
    persistent = true,
    arguments = {20}
  },
  {
    config_id = 9002,
    gadget_id = 70310385,
    pos = {
      x = -19.793,
      y = 1.625,
      z = -38.369
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 9006,
    gadget_id = 70310429,
    pos = {
      x = -19.84,
      y = 4.17,
      z = -27.878
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 9007,
    gadget_id = 70310429,
    pos = {
      x = -19.84,
      y = 4.17,
      z = -48.901
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1009003,
    name = "OBSERVATION_POINT_NOTIFY_9003",
    event = EventType.EVENT_OBSERVATION_POINT_NOTIFY,
    source = "",
    condition = "",
    action = "action_EVENT_OBSERVATION_POINT_NOTIFY_9003",
    trigger_count = 0
  },
  {
    config_id = 1009004,
    name = "OBSERVATION_POINT_NOTIFY_9004",
    event = EventType.EVENT_OBSERVATION_POINT_NOTIFY,
    source = "",
    condition = "",
    action = "action_EVENT_OBSERVATION_POINT_NOTIFY_9004",
    trigger_count = 0
  },
  {
    config_id = 1009005,
    name = "GADGET_STATE_CHANGE_9005",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_9005",
    action = "action_EVENT_GADGET_STATE_CHANGE_9005",
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
      9001,
      9002,
      9006,
      9007
    },
    regions = {},
    triggers = {
      "OBSERVATION_POINT_NOTIFY_9003",
      "OBSERVATION_POINT_NOTIFY_9004",
      "GADGET_STATE_CHANGE_9005"
    },
    rand_weight = 100
  }
}
function action_EVENT_OBSERVATION_POINT_NOTIFY_9003(context, evt)
  if 9001 == evt.param1 and 105 == evt.param2 then
    ScriptLib.SetGadgetStateByConfigId(context, 9002, GadgetState.GearStart)
    ScriptLib.AddQuestProgress(context, "4007207")
    ScriptLib.SetGadgetStateByConfigId(context, 9001, GadgetState.ChestFrozen)
    ScriptLib.KillEntityByConfigId(context, {
      group_id = 220138009,
      config_id = 9006,
      entity_type = EntityType.GADGET
    })
    ScriptLib.KillEntityByConfigId(context, {
      group_id = 220138009,
      config_id = 9007,
      entity_type = EntityType.GADGET
    })
  end
  return 0
end
function action_EVENT_OBSERVATION_POINT_NOTIFY_9004(context, evt)
  if 9001 == evt.param1 and 0 == evt.param2 then
    ScriptLib.SetGadgetStateByConfigId(context, 9002, GadgetState.Default)
    ScriptLib.SetGadgetStateByConfigId(context, 9001, GadgetState.Default)
    ScriptLib.CreateGadget(context, {config_id = 9006})
    ScriptLib.CreateGadget(context, {config_id = 9007})
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_9005(context, evt)
  if 9002 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_9005(context, evt)
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2802, 2, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  return 0
end
