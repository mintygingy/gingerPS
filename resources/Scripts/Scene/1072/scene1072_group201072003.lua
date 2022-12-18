local base_info = {group_id = 201072003}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 3001,
    gadget_id = 71700429,
    pos = {
      x = -2.958,
      y = 1.537,
      z = -2.702
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
    config_id = 3002,
    gadget_id = 71700427,
    pos = {
      x = -2.323,
      y = 1.537,
      z = -2.205
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
    config_id = 3003,
    gadget_id = 71700426,
    pos = {
      x = -2.296,
      y = 1.537,
      z = -2.731
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
    config_id = 3004,
    gadget_id = 71700423,
    pos = {
      x = -2.942,
      y = 1.537,
      z = -2.178
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
    config_id = 3005,
    gadget_id = 70710851,
    pos = {
      x = -2.698,
      y = 1.528,
      z = -2.492
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
    gadgets = {3005},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      3001,
      3002,
      3003,
      3004
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
