local base_info = {group_id = 220151017}
monsters = {}
npcs = {
  {
    config_id = 17005,
    npc_id = 12986,
    pos = {
      x = -146.167,
      y = -9.868,
      z = 85.013
    },
    rot = {
      x = 0.0,
      y = 171.257,
      z = 0.0
    }
  },
  {
    config_id = 17006,
    npc_id = 12985,
    pos = {
      x = -26.443,
      y = 1.0,
      z = 51.775
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    }
  }
}
gadgets = {
  {
    config_id = 17001,
    gadget_id = 70710470,
    pos = {
      x = -26.373,
      y = 1.122,
      z = 51.583
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 17002,
    gadget_id = 70710882,
    pos = {
      x = -26.466,
      y = 1.054,
      z = 51.709
    },
    rot = {
      x = 307.631,
      y = 18.937,
      z = 344.799
    },
    level = 1,
    is_enable_interact = false
  },
  {
    config_id = 17003,
    gadget_id = 70710882,
    pos = {
      x = -146.054,
      y = -9.846,
      z = 85.033
    },
    rot = {
      x = 270.0,
      y = 36.624,
      z = 0.0
    },
    level = 1,
    is_enable_interact = false
  },
  {
    config_id = 17004,
    gadget_id = 70710470,
    pos = {
      x = -146.269,
      y = -9.868,
      z = 85.121
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
    gadgets = {
      17001,
      17002,
      17003,
      17004
    },
    regions = {},
    triggers = {},
    npcs = {17005, 17006},
    rand_weight = 100
  }
}
