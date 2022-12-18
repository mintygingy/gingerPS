local base_info = {group_id = 251006005}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 5001,
    gadget_id = 70290519,
    pos = {
      x = -11.915,
      y = 0.5,
      z = -3.562
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  {
    config_id = 5002,
    gadget_id = 70290520,
    pos = {
      x = -13.964,
      y = 0.5,
      z = 6.173
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5004,
    gadget_id = 70290520,
    pos = {
      x = -13.011,
      y = 0.5,
      z = 0.5
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5005,
    gadget_id = 70290520,
    pos = {
      x = -13.686,
      y = 0.5,
      z = 16.289
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
    config_id = 1005003,
    name = "GADGET_STATE_CHANGE_5003",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_5003",
    action = "action_EVENT_GADGET_STATE_CHANGE_5003"
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
    gadgets = {5001},
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_5003"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      5002,
      5004,
      5005
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_5003(context, evt)
  if 5001 ~= evt.param2 or GadgetState.Default ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_5003(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 251006005, 2)
  return 0
end
