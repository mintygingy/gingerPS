local base_info = {group_id = 240051002}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 2001,
    gadget_id = 70220103,
    pos = {
      x = 470.091,
      y = 101.962,
      z = 526.121
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 30
  },
  {
    config_id = 2002,
    gadget_id = 70220103,
    pos = {
      x = 444.498,
      y = 125.535,
      z = 525.223
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 30
  },
  {
    config_id = 2003,
    gadget_id = 70220103,
    pos = {
      x = 482.23,
      y = 121.417,
      z = 496.301
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 30
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
    gadgets = {
      2001,
      2002,
      2003
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
