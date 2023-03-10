local base_info = {group_id = 235852003}
local defs = {
  patterns = {
    [1] = {
      [3001] = 3002,
      [3002] = 3003,
      [3003] = 3004,
      [3004] = 3005,
      [3005] = 3006,
      [3006] = 3007,
      [3007] = 0
    },
    [2] = {
      [35001] = 35003,
      [35002] = 35004,
      [35003] = 35004,
      [35004] = 35006,
      [35005] = 35001,
      [35006] = 35001
    }
  }
}
monsters = {}
npcs = {}
gadgets = {
  [3001] = {
    config_id = 3001,
    gadget_id = 70310179,
    pos = {
      x = 400.273,
      y = 654.578,
      z = -1650.073
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [3002] = {
    config_id = 3002,
    gadget_id = 70310179,
    pos = {
      x = 393.353,
      y = 654.578,
      z = -1646.118
    },
    rot = {
      x = 0.0,
      y = 62.587,
      z = 0.0
    },
    level = 1
  },
  [3003] = {
    config_id = 3003,
    gadget_id = 70310179,
    pos = {
      x = 390.775,
      y = 651.818,
      z = -1636.949
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [3004] = {
    config_id = 3004,
    gadget_id = 70310179,
    pos = {
      x = 401.728,
      y = 653.236,
      z = -1640.526
    },
    rot = {
      x = 0.0,
      y = 336.491,
      z = 0.0
    },
    level = 1
  },
  [3005] = {
    config_id = 3005,
    gadget_id = 70310179,
    pos = {
      x = 405.367,
      y = 654.578,
      z = -1635.178
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearAction2
  },
  [3006] = {
    config_id = 3006,
    gadget_id = 70310179,
    pos = {
      x = 410.304,
      y = 654.578,
      z = -1636.323
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [3007] = {
    config_id = 3007,
    gadget_id = 70310179,
    pos = {
      x = 409.377,
      y = 654.578,
      z = -1644.079
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [3008] = {
    config_id = 3008,
    gadget_id = 70310389,
    pos = {
      x = 401.48,
      y = 654.578,
      z = -1641.332
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [3009] = {
    config_id = 3009,
    gadget_id = 70310179,
    pos = {
      x = 405.367,
      y = 654.578,
      z = -1635.178
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
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
      3001,
      3002,
      3003,
      3004,
      3005,
      3006,
      3007,
      3008,
      3009
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
require("V2_8/ConstellationPattern")
