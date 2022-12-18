local base_info = {group_id = 250080001}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 1002,
    gadget_id = 70360002,
    pos = {
      x = 15.091,
      y = 0.905,
      z = 16.375
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1005,
    gadget_id = 70900064,
    pos = {
      x = 22.692,
      y = -3.108,
      z = 22.576
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1006,
    gadget_id = 70900064,
    pos = {
      x = 12.33,
      y = -2.952,
      z = 22.929
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1007,
    gadget_id = 70900064,
    pos = {
      x = 17.145,
      y = -3.108,
      z = 35.807
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
triggers = {}
variables = {}
garbages = {
  triggers = {
    {
      config_id = 1001003,
      name = "GADGET_CREATE_1003",
      event = EventType.EVENT_GADGET_CREATE,
      source = "",
      condition = "condition_EVENT_GADGET_CREATE_1003",
      action = "action_EVENT_GADGET_CREATE_1003"
    },
    {
      config_id = 1001004,
      name = "SELECT_OPTION_1004",
      event = EventType.EVENT_SELECT_OPTION,
      source = "",
      condition = "condition_EVENT_SELECT_OPTION_1004",
      action = "action_EVENT_SELECT_OPTION_1004"
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
    gadgets = {
      1002,
      1005,
      1006,
      1007
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
