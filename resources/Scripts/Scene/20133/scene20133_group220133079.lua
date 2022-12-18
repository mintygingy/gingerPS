local base_info = {group_id = 220133079}
local defs = {
  finish_gadget = 79010,
  starter = 79006,
  ender = 79026,
  matrix = {
    {
      0,
      79005,
      79013,
      79002,
      0,
      0
    },
    {
      0,
      79038,
      79036,
      79037,
      79026,
      0
    },
    {
      0,
      0,
      79035,
      0,
      0,
      0
    },
    {
      0,
      0,
      79033,
      79034,
      0,
      0
    },
    {
      0,
      0,
      0,
      79031,
      0,
      0
    },
    {
      79029,
      79030,
      0,
      0,
      0,
      0
    },
    {
      79003,
      0,
      0,
      0,
      0,
      0
    },
    {
      79006,
      0,
      0,
      0,
      0,
      0
    }
  },
  reveal_tiles = {
    [79005] = {79008, 79007}
  },
  reveal_match = {
    [79008] = 79013,
    [79007] = 79002
  },
  movable_pos = {
    [79030] = {new_pos = 53}
  }
}
monsters = {}
npcs = {}
gadgets = {
  [79002] = {
    config_id = 79002,
    gadget_id = 70360356,
    pos = {
      x = 2533.471,
      y = 556.893,
      z = -1714.523
    },
    rot = {
      x = 29.632,
      y = 236.851,
      z = 5.448
    },
    level = 20,
    state = GadgetState.Action03
  },
  [79003] = {
    config_id = 79003,
    gadget_id = 70360350,
    pos = {
      x = 2514.98,
      y = 556.462,
      z = -1703.035
    },
    rot = {
      x = 8.595,
      y = 135.789,
      z = 334.683
    },
    level = 20
  },
  [79005] = {
    config_id = 79005,
    gadget_id = 70360352,
    pos = {
      x = 2537.862,
      y = 559.875,
      z = -1711.657
    },
    rot = {
      x = 29.632,
      y = 236.851,
      z = 5.448
    },
    level = 20
  },
  [79006] = {
    config_id = 79006,
    gadget_id = 70360354,
    pos = {
      x = 2512.895,
      y = 555.257,
      z = -1704.81
    },
    rot = {
      x = 8.595,
      y = 135.789,
      z = 335.833
    },
    level = 20
  },
  [79007] = {
    config_id = 79007,
    gadget_id = 70360353,
    pos = {
      x = 2532.316,
      y = 559.684,
      z = -1720.26
    },
    rot = {
      x = 27.372,
      y = 36.215,
      z = 5.532
    },
    level = 20
  },
  [79008] = {
    config_id = 79008,
    gadget_id = 70360353,
    pos = {
      x = 2536.803,
      y = 559.998,
      z = -1716.868
    },
    rot = {
      x = 64.272,
      y = 306.039,
      z = 330.827
    },
    level = 20
  },
  [79010] = {
    config_id = 79010,
    gadget_id = 70310171,
    pos = {
      x = 2524.47,
      y = 552.789,
      z = -1717.298
    },
    rot = {
      x = 2.062,
      y = 236.823,
      z = 358.408
    },
    level = 20,
    state = GadgetState.GearStop,
    persistent = true,
    interact_id = 64
  },
  [79013] = {
    config_id = 79013,
    gadget_id = 70360356,
    pos = {
      x = 2535.638,
      y = 558.387,
      z = -1713.054
    },
    rot = {
      x = 29.632,
      y = 236.851,
      z = 5.448
    },
    level = 20,
    state = GadgetState.Action03
  },
  [79026] = {
    config_id = 79026,
    gadget_id = 70360355,
    pos = {
      x = 2529.434,
      y = 555.862,
      z = -1713.629
    },
    rot = {
      x = 21.807,
      y = 236.05,
      z = 5.099
    },
    level = 20
  },
  [79029] = {
    config_id = 79029,
    gadget_id = 70360350,
    pos = {
      x = 2517.023,
      y = 557.954,
      z = -1701.427
    },
    rot = {
      x = 10.097,
      y = 137.849,
      z = 323.714
    },
    level = 20
  },
  [79030] = {
    config_id = 79030,
    gadget_id = 70360351,
    pos = {
      x = 2518.942,
      y = 557.586,
      z = -1703.769
    },
    rot = {
      x = 29.632,
      y = 236.851,
      z = 5.448
    },
    level = 20,
    route_id = 20,
    start_route = false
  },
  [79031] = {
    config_id = 79031,
    gadget_id = 70360350,
    pos = {
      x = 2526.624,
      y = 557.814,
      z = -1704.895
    },
    rot = {
      x = 29.632,
      y = 236.851,
      z = 5.448
    },
    level = 20
  },
  [79033] = {
    config_id = 79033,
    gadget_id = 70360350,
    pos = {
      x = 2530.543,
      y = 558.968,
      z = -1705.852
    },
    rot = {
      x = 29.632,
      y = 236.851,
      z = 5.448
    },
    level = 20
  },
  [79034] = {
    config_id = 79034,
    gadget_id = 70360350,
    pos = {
      x = 2528.369,
      y = 557.491,
      z = -1707.273
    },
    rot = {
      x = 29.632,
      y = 236.851,
      z = 5.448
    },
    level = 20
  },
  [79035] = {
    config_id = 79035,
    gadget_id = 70360350,
    pos = {
      x = 2532.226,
      y = 558.794,
      z = -1708.252
    },
    rot = {
      x = 29.632,
      y = 236.851,
      z = 5.448
    },
    level = 20
  },
  [79036] = {
    config_id = 79036,
    gadget_id = 70360350,
    pos = {
      x = 2533.924,
      y = 558.631,
      z = -1710.678
    },
    rot = {
      x = 29.632,
      y = 236.851,
      z = 5.448
    },
    level = 20
  },
  [79037] = {
    config_id = 79037,
    gadget_id = 70360350,
    pos = {
      x = 2531.747,
      y = 557.152,
      z = -1712.099
    },
    rot = {
      x = 29.632,
      y = 236.851,
      z = 5.448
    },
    level = 20
  },
  [79038] = {
    config_id = 79038,
    gadget_id = 70360350,
    pos = {
      x = 2536.118,
      y = 560.121,
      z = -1709.245
    },
    rot = {
      x = 29.632,
      y = 236.851,
      z = 5.448
    },
    level = 20
  }
}
regions = {
  [79028] = {
    config_id = 79028,
    shape = RegionShape.SPHERE,
    radius = 23,
    pos = {
      x = 2533.137,
      y = 556.395,
      z = -1710.588
    }
  }
}
triggers = {}
variables = {}
garbages = {
  gadgets = {
    {
      config_id = 79032,
      gadget_id = 70360350,
      pos = {
        x = 2528.783,
        y = 559.281,
        z = -1703.485
      },
      rot = {
        x = 29.632,
        y = 236.851,
        z = 5.448
      },
      level = 20
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
    gadgets = {79010},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      79002,
      79003,
      79005,
      79006,
      79007,
      79008,
      79013,
      79026,
      79029,
      79030,
      79031,
      79033,
      79034,
      79035,
      79036,
      79037,
      79038
    },
    regions = {79028},
    triggers = {},
    rand_weight = 100
  }
}
require("V2_8/DrawOneLine_Dreamland")
