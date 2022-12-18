local base_info = {group_id = 220133029}
monsters = {}
npcs = {}
gadgets = {}
regions = {}
triggers = {}
variables = {}
garbages = {
  gadgets = {
    {
      config_id = 29001,
      gadget_id = 70360346,
      pos = {
        x = 2172.13,
        y = 564.117,
        z = 596.877
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1,
      interact_id = 119
    },
    {
      config_id = 29003,
      gadget_id = 70310148,
      pos = {
        x = 2172.13,
        y = 564.117,
        z = 596.877
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1
    }
  },
  triggers = {
    {
      config_id = 1029002,
      name = "GADGET_STATE_CHANGE_29002",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_29002",
      action = "action_EVENT_GADGET_STATE_CHANGE_29002"
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
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
