local base_info = {group_id = 247206005}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 5001,
    gadget_id = 70220103,
    pos = {
      x = 277.746,
      y = 162.657,
      z = 441.791
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5002,
    gadget_id = 70220103,
    pos = {
      x = 313.395,
      y = 163.301,
      z = 441.752
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5003,
    gadget_id = 70220103,
    pos = {
      x = 324.545,
      y = 160.538,
      z = 419.793
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5004,
    gadget_id = 70220103,
    pos = {
      x = 324.453,
      y = 165.628,
      z = 461.347
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5005,
    gadget_id = 70330319,
    pos = {
      x = 324.518,
      y = 157.019,
      z = 419.805
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5006,
    gadget_id = 70330319,
    pos = {
      x = 313.624,
      y = 159.794,
      z = 441.799
    },
    rot = {
      x = 0.0,
      y = 90.0,
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
    gadgets = {
      5001,
      5002,
      5003,
      5004,
      5005,
      5006
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
