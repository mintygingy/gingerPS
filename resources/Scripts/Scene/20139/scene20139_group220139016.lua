local base_info = {group_id = 220139016}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 16001,
    gadget_id = 70310251,
    pos = {
      x = 136.31,
      y = 101.359,
      z = 13.39
    },
    rot = {
      x = 0.0,
      y = 181.597,
      z = 0.0
    },
    level = 1,
    arguments = {23}
  },
  {
    config_id = 16002,
    gadget_id = 70310411,
    pos = {
      x = 135.882,
      y = 97.169,
      z = 36.277
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 16003,
    gadget_id = 70310282,
    pos = {
      x = 138.338,
      y = 99.314,
      z = 36.319
    },
    rot = {
      x = 89.972,
      y = 270.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1016004,
    name = "OBSERVATION_POINT_NOTIFY_16004",
    event = EventType.EVENT_OBSERVATION_POINT_NOTIFY,
    source = "",
    condition = "",
    action = "action_EVENT_OBSERVATION_POINT_NOTIFY_16004",
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
      16003
    },
    regions = {},
    triggers = {
      "OBSERVATION_POINT_NOTIFY_16004"
    },
    rand_weight = 100
  }
}
function action_EVENT_OBSERVATION_POINT_NOTIFY_16004(context, evt)
  if 16001 == evt.param1 and 405 == evt.param2 then
    ScriptLib.SetGadgetStateByConfigId(context, 16002, GadgetState.GearStart)
    ScriptLib.SetGroupVariableValueByGroup(context, "eyefinish1", 1, 220139022)
    ScriptLib.SetGadgetStateByConfigId(context, 16001, GadgetState.ChestOpened)
    ScriptLib.SetGadgetStateByConfigId(context, 16003, GadgetState.GearStart)
  end
  return 0
end
