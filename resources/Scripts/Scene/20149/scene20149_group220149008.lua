local base_info = {group_id = 220149008}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 8001,
    gadget_id = 70310148,
    pos = {
      x = 476.343,
      y = 133.333,
      z = 376.743
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 8002,
    gadget_id = 71700446,
    pos = {
      x = 479.993,
      y = 133.343,
      z = 377.475
    },
    rot = {
      x = 355.26,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 8003,
    gadget_id = 71700446,
    pos = {
      x = 479.854,
      y = 133.417,
      z = 377.57
    },
    rot = {
      x = 343.3,
      y = 61.9,
      z = 338.7
    },
    level = 1
  }
}
regions = {}
triggers = {}
variables = {}
init_config = {
  suite = 1,
  end_suite = 0,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {8002, 8003},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      8001,
      8002,
      8003
    },
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
