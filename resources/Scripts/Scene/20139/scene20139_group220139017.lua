local base_info = {group_id = 220139017}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 17001,
    gadget_id = 70310251,
    pos = {
      x = 116.477,
      y = 87.68,
      z = 7.613
    },
    rot = {
      x = 0.0,
      y = 177.099,
      z = 0.0
    },
    level = 1,
    state = GadgetState.ChestLocked,
    arguments = {24}
  },
  {
    config_id = 17002,
    gadget_id = 70310412,
    pos = {
      x = 116.448,
      y = 88.451,
      z = 15.953
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 17003,
    gadget_id = 70310283,
    pos = {
      x = 116.564,
      y = 88.274,
      z = 15.863
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1017004,
    name = "OBSERVATION_POINT_NOTIFY_17004",
    event = EventType.EVENT_OBSERVATION_POINT_NOTIFY,
    source = "",
    condition = "",
    action = "action_EVENT_OBSERVATION_POINT_NOTIFY_17004",
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
      17001,
      17002,
      17003
    },
    regions = {},
    triggers = {
      "OBSERVATION_POINT_NOTIFY_17004"
    },
    rand_weight = 100
  }
}
function action_EVENT_OBSERVATION_POINT_NOTIFY_17004(context, evt)
  if 17001 == evt.param1 and 405 == evt.param2 then
    ScriptLib.SetGadgetStateByConfigId(context, 17002, GadgetState.GearStart)
    ScriptLib.SetGroupVariableValueByGroup(context, "eyefinish2", 1, 220139022)
    ScriptLib.SetGadgetStateByConfigId(context, 17001, GadgetState.ChestOpened)
    ScriptLib.SetGadgetStateByConfigId(context, 17003, GadgetState.GearStart)
  end
  return 0
end
