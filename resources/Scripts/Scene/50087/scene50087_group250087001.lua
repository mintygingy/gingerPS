local base_info = {group_id = 250087001}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 1001,
    gadget_id = 70360002,
    pos = {
      x = 63.88,
      y = 0.723,
      z = 96.665
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {7}
    }
  },
  {
    config_id = 1003,
    gadget_id = 70290137,
    pos = {
      x = 70.192,
      y = 0.85,
      z = 100.009
    },
    rot = {
      x = 0.0,
      y = 90.183,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
  }
}
regions = {}
triggers = {}
variables = {
  {
    config_id = 1,
    name = "change1",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 2,
    name = "change2",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 3,
    name = "change3",
    value = 0,
    no_refresh = false
  }
}
garbages = {
  triggers = {
    {
      config_id = 1001002,
      name = "SELECT_OPTION_1002",
      event = EventType.EVENT_SELECT_OPTION,
      source = "",
      condition = "",
      action = "action_EVENT_SELECT_OPTION_1002",
      trigger_count = 0
    },
    {
      config_id = 1001004,
      name = "TIME_AXIS_PASS_1004",
      event = EventType.EVENT_TIME_AXIS_PASS,
      source = "",
      condition = "",
      action = "action_EVENT_TIME_AXIS_PASS_1004",
      trigger_count = 0
    },
    {
      config_id = 1001005,
      name = "TIME_AXIS_PASS_1005",
      event = EventType.EVENT_TIME_AXIS_PASS,
      source = "",
      condition = "",
      action = "action_EVENT_TIME_AXIS_PASS_1005",
      trigger_count = 0
    }
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
    gadgets = {1001, 1003},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
