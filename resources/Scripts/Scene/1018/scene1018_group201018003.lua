local base_info = {group_id = 201018003}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 3001,
    gadget_id = 70300110,
    pos = {
      x = -11.924,
      y = 0.863,
      z = -17.777
    },
    rot = {
      x = 25.0,
      y = 318.494,
      z = 0.0
    },
    level = 1,
    room = 1
  },
  {
    config_id = 3002,
    gadget_id = 70300110,
    pos = {
      x = -12.215,
      y = 0.863,
      z = -18.173
    },
    rot = {
      x = 25.0,
      y = 36.495,
      z = 0.0
    },
    level = 1,
    room = 1
  },
  {
    config_id = 3003,
    gadget_id = 70300110,
    pos = {
      x = -11.922,
      y = 0.865,
      z = -18.993
    },
    rot = {
      x = 25.0,
      y = 286.231,
      z = 356.749
    },
    level = 1,
    room = 1
  },
  {
    config_id = 3004,
    gadget_id = 70300110,
    pos = {
      x = -12.338,
      y = 0.863,
      z = -17.291
    },
    rot = {
      x = 25.0,
      y = 251.963,
      z = 0.0
    },
    level = 1,
    room = 1
  },
  {
    config_id = 3005,
    gadget_id = 70300110,
    pos = {
      x = -12.311,
      y = 0.863,
      z = -18.67
    },
    rot = {
      x = 25.0,
      y = 268.147,
      z = 0.0
    },
    level = 1,
    room = 1
  },
  {
    config_id = 3006,
    gadget_id = 70300110,
    pos = {
      x = -12.15,
      y = 0.863,
      z = -19.059
    },
    rot = {
      x = 25.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    room = 1
  },
  {
    config_id = 3007,
    gadget_id = 70300110,
    pos = {
      x = -12.15,
      y = 0.863,
      z = -18.709
    },
    rot = {
      x = 25.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    room = 1
  },
  {
    config_id = 3008,
    gadget_id = 70300110,
    pos = {
      x = -12.15,
      y = 0.863,
      z = -18.359
    },
    rot = {
      x = 25.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    room = 1
  },
  {
    config_id = 3009,
    gadget_id = 70300110,
    pos = {
      x = -12.15,
      y = 0.863,
      z = -18.009
    },
    rot = {
      x = 25.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    room = 1
  },
  {
    config_id = 3010,
    gadget_id = 70300110,
    pos = {
      x = -12.15,
      y = 0.863,
      z = -17.659
    },
    rot = {
      x = 25.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    room = 1
  },
  {
    config_id = 3012,
    gadget_id = 70300110,
    pos = {
      x = 12.83,
      y = 1.578,
      z = -3.454
    },
    rot = {
      x = 25.0,
      y = 253.617,
      z = 0.0
    },
    level = 1,
    room = 1
  },
  {
    config_id = 3014,
    gadget_id = 70300110,
    pos = {
      x = -12.15,
      y = 0.863,
      z = -17.309
    },
    rot = {
      x = 25.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    room = 1
  },
  {
    config_id = 3015,
    gadget_id = 70300110,
    pos = {
      x = 7.04,
      y = 0.861,
      z = 3.955
    },
    rot = {
      x = 25.0,
      y = 290.508,
      z = 0.0
    },
    level = 1,
    room = 1
  },
  {
    config_id = 3016,
    gadget_id = 70300110,
    pos = {
      x = 11.705,
      y = 1.553,
      z = -10.103
    },
    rot = {
      x = 25.0,
      y = 315.521,
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
      3001,
      3002,
      3003,
      3004,
      3005
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      3006,
      3007,
      3008,
      3009,
      3010,
      3012,
      3014,
      3015,
      3016
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
