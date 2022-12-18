local base_info = {group_id = 220162005}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 5001,
    gadget_id = 70710866,
    pos = {
      x = -76.517,
      y = -33.39,
      z = 26.693
    },
    rot = {
      x = 0.0,
      y = 198.088,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5002,
    gadget_id = 70300048,
    pos = {
      x = -67.231,
      y = -33.477,
      z = 31.48
    },
    rot = {
      x = 0.0,
      y = 289.175,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5003,
    gadget_id = 70300048,
    pos = {
      x = -66.942,
      y = -33.477,
      z = 32.544
    },
    rot = {
      x = 0.0,
      y = 289.175,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5004,
    gadget_id = 70300048,
    pos = {
      x = -68.878,
      y = -33.477,
      z = 31.998
    },
    rot = {
      x = 0.0,
      y = 110.934,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5005,
    gadget_id = 70300048,
    pos = {
      x = -68.515,
      y = -33.477,
      z = 33.106
    },
    rot = {
      x = 0.0,
      y = 110.934,
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
    gadgets = {
      5001,
      5002,
      5003,
      5004,
      5005
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
