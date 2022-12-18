local base_info = {group_id = 201072002}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 2001,
    gadget_id = 71700428,
    pos = {
      x = -2.341,
      y = 1.537,
      z = -7.06
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    room = 1
  },
  {
    config_id = 2002,
    gadget_id = 71700423,
    pos = {
      x = -2.356,
      y = 1.537,
      z = -7.694
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    room = 1
  },
  {
    config_id = 2003,
    gadget_id = 71700424,
    pos = {
      x = -2.875,
      y = 1.537,
      z = -7.277
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    room = 1
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
      2001,
      2002,
      2003
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
