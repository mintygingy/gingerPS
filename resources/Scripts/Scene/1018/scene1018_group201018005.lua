local base_info = {group_id = 201018005}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 5001,
    gadget_id = 70710100,
    pos = {
      x = -1.954,
      y = 0.766,
      z = -12.646
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
    config_id = 5002,
    gadget_id = 70710102,
    pos = {
      x = -2.682,
      y = 0.766,
      z = -12.473
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
    config_id = 5003,
    gadget_id = 70710103,
    pos = {
      x = -1.653,
      y = 0.766,
      z = -12.22
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
    config_id = 5004,
    gadget_id = 70710105,
    pos = {
      x = -2.329,
      y = 0.766,
      z = -12.166
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
    config_id = 5005,
    gadget_id = 70710106,
    pos = {
      x = -1.19,
      y = 0.766,
      z = -12.043
    },
    rot = {
      x = 0.0,
      y = 122.9,
      z = 0.0
    },
    level = 1,
    room = 1
  },
  {
    config_id = 5006,
    gadget_id = 71700478,
    pos = {
      x = -1.617,
      y = 0.774,
      z = -12.383
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
    config_id = 5007,
    gadget_id = 71700497,
    pos = {
      x = -1.892,
      y = 0.752,
      z = -11.833
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
    config_id = 5008,
    gadget_id = 71700497,
    pos = {
      x = -1.532,
      y = 0.75,
      z = -12.993
    },
    rot = {
      x = 0.0,
      y = 182.913,
      z = 0.0
    },
    level = 1,
    room = 1
  },
  {
    config_id = 5009,
    gadget_id = 71700497,
    pos = {
      x = -0.597,
      y = 0.752,
      z = -12.459
    },
    rot = {
      x = 0.0,
      y = 111.011,
      z = 0.0
    },
    level = 1,
    room = 1
  },
  {
    config_id = 5010,
    gadget_id = 71700498,
    pos = {
      x = -3.111,
      y = 0.766,
      z = -12.106
    },
    rot = {
      x = 0.0,
      y = 70.396,
      z = 0.0
    },
    level = 1,
    room = 1
  },
  {
    config_id = 5011,
    gadget_id = 71700497,
    pos = {
      x = -2.294,
      y = 0.752,
      z = -13.012
    },
    rot = {
      x = 0.0,
      y = 225.641,
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
    gadgets = {5006},
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
  },
  {
    monsters = {},
    gadgets = {
      5007,
      5008,
      5009,
      5010,
      5011
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
