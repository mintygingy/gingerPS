local base_info = {group_id = 220133071}
local defs = {
  lines = {
    [71020] = 71019,
    [71009] = 71027
  },
  finish_gadget = 71010,
  starter = 71006,
  ender = 71023,
  matrix = {
    {
      71014,
      71005,
      71002,
      71025,
      71028,
      71009,
      0,
      0
    },
    {
      71003,
      71015,
      0,
      71024,
      71021,
      71022,
      0,
      71023
    },
    {
      0,
      0,
      0,
      71020,
      71001,
      71029,
      0,
      0
    },
    {
      0,
      0,
      0,
      0,
      71006,
      0,
      0,
      0
    }
  },
  reveal_tiles = {
    [71005] = {71007}
  },
  reveal_match = {
    [71007] = 71002
  },
  movable_pos = {
    [71020] = {new_pos = 32},
    [71009] = {new_pos = 18}
  }
}
monsters = {}
npcs = {}
gadgets = {
  [71001] = {
    config_id = 71001,
    gadget_id = 70360350,
    pos = {
      x = 5025.541,
      y = 524.7,
      z = -1661.39
    },
    rot = {
      x = 352.678,
      y = 209.95,
      z = 336.851
    },
    level = 1
  },
  [71002] = {
    config_id = 71002,
    gadget_id = 70360356,
    pos = {
      x = 5033.311,
      y = 526.328,
      z = -1658.732
    },
    rot = {
      x = 2.359,
      y = 202.695,
      z = 336.212
    },
    level = 1,
    state = GadgetState.Action03
  },
  [71003] = {
    config_id = 71003,
    gadget_id = 70360350,
    pos = {
      x = 5033.454,
      y = 524.659,
      z = -1652.237
    },
    rot = {
      x = 352.678,
      y = 209.95,
      z = 332.906
    },
    level = 1
  },
  [71005] = {
    config_id = 71005,
    gadget_id = 70360352,
    pos = {
      x = 5034.402,
      y = 526.283,
      z = -1656.022
    },
    rot = {
      x = 352.678,
      y = 209.95,
      z = 336.81
    },
    level = 1
  },
  [71006] = {
    config_id = 71006,
    gadget_id = 70360354,
    pos = {
      x = 5022.96,
      y = 524.062,
      z = -1659.997
    },
    rot = {
      x = 352.678,
      y = 209.95,
      z = 356.817
    },
    level = 1
  },
  [71007] = {
    config_id = 71007,
    gadget_id = 70360353,
    pos = {
      x = 5035.138,
      y = 529.654,
      z = -1660.081
    },
    rot = {
      x = 332.872,
      y = 221.47,
      z = 262.22
    },
    level = 1
  },
  [71009] = {
    config_id = 71009,
    gadget_id = 70360351,
    pos = {
      x = 5028.979,
      y = 527.166,
      z = -1666.545
    },
    rot = {
      x = 352.678,
      y = 209.95,
      z = 334.191
    },
    level = 1,
    route_id = 12,
    start_route = false
  },
  [71010] = {
    config_id = 71010,
    gadget_id = 70310171,
    pos = {
      x = 5018.608,
      y = 522.972,
      z = -1655.766
    },
    rot = {
      x = 355.299,
      y = 122.839,
      z = 9.29
    },
    level = 1,
    state = GadgetState.GearStop,
    persistent = true,
    interact_id = 64
  },
  [71014] = {
    config_id = 71014,
    gadget_id = 70360350,
    pos = {
      x = 5035.828,
      y = 525.919,
      z = -1653.419
    },
    rot = {
      x = 352.678,
      y = 209.95,
      z = 333.948
    },
    level = 1
  },
  [71015] = {
    config_id = 71015,
    gadget_id = 70360350,
    pos = {
      x = 5031.97,
      y = 525.041,
      z = -1654.813
    },
    rot = {
      x = 352.678,
      y = 209.95,
      z = 332.906
    },
    level = 1
  },
  [71019] = {
    config_id = 71019,
    gadget_id = 70310349,
    pos = {
      x = 5027.09,
      y = 524.365,
      z = -1658.342
    },
    rot = {
      x = 7.094,
      y = 31.037,
      z = 12.019
    },
    level = 1
  },
  [71020] = {
    config_id = 71020,
    gadget_id = 70360351,
    pos = {
      x = 5026.969,
      y = 524.444,
      z = -1658.758
    },
    rot = {
      x = 352.678,
      y = 209.95,
      z = 338.246
    },
    level = 1,
    route_id = 11,
    start_route = false
  },
  [71021] = {
    config_id = 71021,
    gadget_id = 70360350,
    pos = {
      x = 5027.993,
      y = 525.666,
      z = -1662.735
    },
    rot = {
      x = 352.678,
      y = 209.95,
      z = 339.76
    },
    level = 1
  },
  [71022] = {
    config_id = 71022,
    gadget_id = 70360350,
    pos = {
      x = 5026.523,
      y = 526.044,
      z = -1665.286
    },
    rot = {
      x = 352.678,
      y = 209.95,
      z = 339.76
    },
    level = 1
  },
  [71023] = {
    config_id = 71023,
    gadget_id = 70360355,
    pos = {
      x = 5023.246,
      y = 526.89,
      z = -1670.985
    },
    rot = {
      x = 352.678,
      y = 209.95,
      z = 338.721
    },
    level = 1
  },
  [71024] = {
    config_id = 71024,
    gadget_id = 70360350,
    pos = {
      x = 5029.469,
      y = 525.286,
      z = -1660.173
    },
    rot = {
      x = 352.678,
      y = 209.95,
      z = 339.76
    },
    level = 1
  },
  [71025] = {
    config_id = 71025,
    gadget_id = 70360350,
    pos = {
      x = 5031.934,
      y = 526.406,
      z = -1661.417
    },
    rot = {
      x = 352.678,
      y = 209.95,
      z = 334.191
    },
    level = 1
  },
  [71027] = {
    config_id = 71027,
    gadget_id = 70310349,
    pos = {
      x = 5028.689,
      y = 527.427,
      z = -1666.451
    },
    rot = {
      x = 352.678,
      y = 209.95,
      z = 348.117
    },
    level = 1
  },
  [71028] = {
    config_id = 71028,
    gadget_id = 70360350,
    pos = {
      x = 5030.463,
      y = 526.784,
      z = -1663.97
    },
    rot = {
      x = 352.678,
      y = 209.95,
      z = 334.191
    },
    level = 1
  },
  [71029] = {
    config_id = 71029,
    gadget_id = 70360350,
    pos = {
      x = 5024.052,
      y = 525.003,
      z = -1663.981
    },
    rot = {
      x = 352.678,
      y = 209.95,
      z = 339.969
    },
    level = 1
  }
}
regions = {
  [71026] = {
    config_id = 71026,
    shape = RegionShape.SPHERE,
    radius = 18,
    pos = {
      x = 5028.278,
      y = 525.561,
      z = -1661.656
    }
  }
}
triggers = {}
variables = {}
garbages = {
  gadgets = {
    {
      config_id = 71017,
      gadget_id = 70360351,
      pos = {
        x = 5029.541,
        y = 523.824,
        z = -1653.569
      },
      rot = {
        x = 352.678,
        y = 209.95,
        z = 336.409
      },
      level = 1
    },
    {
      config_id = 71018,
      gadget_id = 70360351,
      pos = {
        x = 5025.701,
        y = 528.01,
        z = -1672.234
      },
      rot = {
        x = 352.678,
        y = 209.95,
        z = 334.191
      },
      level = 1
    }
  }
}
init_config = {
  suite = 1,
  end_suite = 0,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {71010},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      71001,
      71002,
      71003,
      71005,
      71006,
      71007,
      71009,
      71014,
      71015,
      71019,
      71020,
      71021,
      71022,
      71023,
      71024,
      71025,
      71027,
      71028,
      71029
    },
    regions = {71026},
    triggers = {},
    rand_weight = 100
  }
}
require("V2_8/DrawOneLine_Dreamland")
