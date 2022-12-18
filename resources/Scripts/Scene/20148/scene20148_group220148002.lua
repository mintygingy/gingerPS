local base_info = {group_id = 220148002}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 2001,
    gadget_id = 70310148,
    pos = {
      x = 513.448,
      y = 75.484,
      z = 505.108
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2002,
    gadget_id = 70900201,
    pos = {
      x = 513.449,
      y = 76.985,
      z = 505.108
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
    gadgets = {2001, 2002},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
