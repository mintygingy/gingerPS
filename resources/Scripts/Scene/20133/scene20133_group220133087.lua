local base_info = {group_id = 220133087}
local defs = {
  lines = {
    [87014] = 87013,
    [87007] = 87020
  },
  finish_gadget = 87008,
  starter = 87005,
  ender = 87017,
  matrix = {
    {
      0,
      0,
      0,
      0,
      87031,
      87030,
      87029,
      87028,
      87027
    },
    {
      87009,
      87004,
      87002,
      87017,
      87021,
      87007,
      0,
      0,
      87026
    },
    {
      87003,
      87010,
      0,
      87018,
      87015,
      87016,
      0,
      87024,
      87025
    },
    {
      0,
      0,
      0,
      87014,
      87001,
      87022,
      0,
      0,
      0
    },
    {
      0,
      0,
      0,
      0,
      87005,
      0,
      0,
      0,
      0
    }
  },
  reveal_tiles = {
    [87004] = {87006},
    [87027] = {
      87019,
      87032,
      87033,
      87034
    }
  },
  reveal_match = {
    [87006] = 87002,
    [87019] = 87028,
    [87032] = 87029,
    [87033] = 87030,
    [87034] = 87031
  },
  movable_pos = {
    [87014] = {new_pos = 42},
    [87007] = {new_pos = 28}
  }
}
monsters = {}
npcs = {}
gadgets = {
  [87001] = {
    config_id = 87001,
    gadget_id = 70360350,
    pos = {
      x = 5048.784,
      y = 536.237,
      z = -1728.651
    },
    rot = {
      x = 358.89,
      y = 94.027,
      z = 347.338
    },
    level = 1
  },
  [87002] = {
    config_id = 87002,
    gadget_id = 70360356,
    pos = {
      x = 5043.258,
      y = 537.463,
      z = -1722.461
    },
    rot = {
      x = 9.734,
      y = 88.659,
      z = 346.42
    },
    level = 1,
    state = GadgetState.Action03
  },
  [87003] = {
    config_id = 87003,
    gadget_id = 70360350,
    pos = {
      x = 5037.186,
      y = 537.028,
      z = -1725.281
    },
    rot = {
      x = 358.89,
      y = 94.027,
      z = 343.835
    },
    level = 1
  },
  [87004] = {
    config_id = 87004,
    gadget_id = 70360352,
    pos = {
      x = 5040.358,
      y = 537.803,
      z = -1722.596
    },
    rot = {
      x = 358.89,
      y = 94.027,
      z = 347.739
    },
    level = 1
  },
  [87005] = {
    config_id = 87005,
    gadget_id = 70360354,
    pos = {
      x = 5048.602,
      y = 536.12,
      z = -1731.719
    },
    rot = {
      x = 359.27,
      y = 91.246,
      z = 7.791
    },
    level = 1
  },
  [87006] = {
    config_id = 87006,
    gadget_id = 70360353,
    pos = {
      x = 5044.855,
      y = 539.339,
      z = -1719.932
    },
    rot = {
      x = 337.267,
      y = 100.866,
      z = 275.182
    },
    level = 1
  },
  [87007] = {
    config_id = 87007,
    gadget_id = 70360351,
    pos = {
      x = 5052.212,
      y = 537.307,
      z = -1723.005
    },
    rot = {
      x = 358.89,
      y = 94.027,
      z = 345.12
    },
    level = 1,
    route_id = 14,
    start_route = false
  },
  [87008] = {
    config_id = 87008,
    gadget_id = 70310171,
    pos = {
      x = 5048.825,
      y = 532.303,
      z = -1716.088
    },
    rot = {
      x = 349.319,
      y = 186.799,
      z = 356.418
    },
    level = 1,
    state = GadgetState.GearStop,
    persistent = true,
    interact_id = 64
  },
  [87009] = {
    config_id = 87009,
    gadget_id = 70360350,
    pos = {
      x = 5037.373,
      y = 537.773,
      z = -1722.447
    },
    rot = {
      x = 358.89,
      y = 94.027,
      z = 344.877
    },
    level = 1
  },
  [87010] = {
    config_id = 87010,
    gadget_id = 70360350,
    pos = {
      x = 5040.177,
      y = 537.086,
      z = -1725.49
    },
    rot = {
      x = 358.89,
      y = 94.027,
      z = 343.835
    },
    level = 1
  },
  [87013] = {
    config_id = 87013,
    gadget_id = 70310349,
    pos = {
      x = 5045.353,
      y = 536.312,
      z = -1728.544
    },
    rot = {
      x = 1.091,
      y = 275.129,
      z = 0.974
    },
    level = 1
  },
  [87014] = {
    config_id = 87014,
    gadget_id = 70360351,
    pos = {
      x = 5045.793,
      y = 536.179,
      z = -1728.439
    },
    rot = {
      x = 358.89,
      y = 94.027,
      z = 347.338
    },
    level = 1,
    route_id = 13,
    start_route = false
  },
  [87015] = {
    config_id = 87015,
    gadget_id = 70360350,
    pos = {
      x = 5049.047,
      y = 536.663,
      z = -1725.71
    },
    rot = {
      x = 358.89,
      y = 94.027,
      z = 350.689
    },
    level = 1
  },
  [87016] = {
    config_id = 87016,
    gadget_id = 70360350,
    pos = {
      x = 5052.01,
      y = 536.72,
      z = -1725.918
    },
    rot = {
      x = 358.89,
      y = 94.027,
      z = 350.689
    },
    level = 1
  },
  [87017] = {
    config_id = 87017,
    gadget_id = 70360355,
    pos = {
      x = 5046.257,
      y = 537.169,
      z = -1722.667
    },
    rot = {
      x = 358.89,
      y = 94.027,
      z = 345.12
    },
    level = 1
  },
  [87018] = {
    config_id = 87018,
    gadget_id = 70360350,
    pos = {
      x = 5046.077,
      y = 536.604,
      z = -1725.5
    },
    rot = {
      x = 358.89,
      y = 94.027,
      z = 350.689
    },
    level = 1
  },
  [87019] = {
    config_id = 87019,
    gadget_id = 70360353,
    pos = {
      x = 5049.822,
      y = 540.969,
      z = -1718.962
    },
    rot = {
      x = 349.309,
      y = 117.598,
      z = 336.539
    },
    level = 1
  },
  [87020] = {
    config_id = 87020,
    gadget_id = 70310349,
    pos = {
      x = 5052.286,
      y = 537.611,
      z = -1723.256
    },
    rot = {
      x = 358.89,
      y = 94.027,
      z = 359.046
    },
    level = 1
  },
  [87021] = {
    config_id = 87021,
    gadget_id = 70360350,
    pos = {
      x = 5049.223,
      y = 537.249,
      z = -1722.795
    },
    rot = {
      x = 358.89,
      y = 94.027,
      z = 345.12
    },
    level = 1
  },
  [87022] = {
    config_id = 87022,
    gadget_id = 70360350,
    pos = {
      x = 5051.782,
      y = 536.295,
      z = -1728.86
    },
    rot = {
      x = 358.89,
      y = 94.027,
      z = 347.338
    },
    level = 1
  },
  [87024] = {
    config_id = 87024,
    gadget_id = 70360350,
    pos = {
      x = 5058.627,
      y = 536.671,
      z = -1726.34
    },
    rot = {
      x = 358.89,
      y = 94.027,
      z = 345.12
    },
    level = 1
  },
  [87025] = {
    config_id = 87025,
    gadget_id = 70360350,
    pos = {
      x = 5061.671,
      y = 536.73,
      z = -1726.554
    },
    rot = {
      x = 358.89,
      y = 94.027,
      z = 345.12
    },
    level = 1
  },
  [87026] = {
    config_id = 87026,
    gadget_id = 70360350,
    pos = {
      x = 5061.86,
      y = 537.5,
      z = -1723.659
    },
    rot = {
      x = 358.89,
      y = 94.027,
      z = 345.12
    },
    level = 1
  },
  [87027] = {
    config_id = 87027,
    gadget_id = 70360352,
    pos = {
      x = 5062.046,
      y = 538.262,
      z = -1720.799
    },
    rot = {
      x = 358.89,
      y = 94.027,
      z = 345.12
    },
    level = 1
  },
  [87028] = {
    config_id = 87028,
    gadget_id = 70360356,
    pos = {
      x = 5059.09,
      y = 538.2,
      z = -1720.606
    },
    rot = {
      x = 358.89,
      y = 94.027,
      z = 345.12
    },
    level = 1,
    state = GadgetState.Action03
  },
  [87029] = {
    config_id = 87029,
    gadget_id = 70360356,
    pos = {
      x = 5055.986,
      y = 538.147,
      z = -1720.36
    },
    rot = {
      x = 358.89,
      y = 94.027,
      z = 345.12
    },
    level = 1,
    state = GadgetState.Action03
  },
  [87030] = {
    config_id = 87030,
    gadget_id = 70360356,
    pos = {
      x = 5052.962,
      y = 538.096,
      z = -1720.118
    },
    rot = {
      x = 358.89,
      y = 94.027,
      z = 345.12
    },
    level = 1,
    state = GadgetState.Action03
  },
  [87031] = {
    config_id = 87031,
    gadget_id = 70360356,
    pos = {
      x = 5049.896,
      y = 538.052,
      z = -1719.845
    },
    rot = {
      x = 358.89,
      y = 94.027,
      z = 345.12
    },
    level = 1,
    state = GadgetState.Action03
  },
  [87032] = {
    config_id = 87032,
    gadget_id = 70360353,
    pos = {
      x = 5052.202,
      y = 542.905,
      z = -1720.252
    },
    rot = {
      x = 349.309,
      y = 117.598,
      z = 336.539
    },
    level = 1
  },
  [87033] = {
    config_id = 87033,
    gadget_id = 70360353,
    pos = {
      x = 5054.632,
      y = 540.69,
      z = -1720.26
    },
    rot = {
      x = 349.309,
      y = 117.598,
      z = 336.539
    },
    level = 1
  },
  [87034] = {
    config_id = 87034,
    gadget_id = 70360353,
    pos = {
      x = 5057.436,
      y = 542.16,
      z = -1718.852
    },
    rot = {
      x = 349.309,
      y = 117.598,
      z = 336.539
    },
    level = 1
  }
}
regions = {
  [87023] = {
    config_id = 87023,
    shape = RegionShape.SPHERE,
    radius = 18,
    pos = {
      x = 5047.948,
      y = 536.729,
      z = -1725.914
    }
  }
}
triggers = {}
variables = {}
garbages = {
  gadgets = {
    {
      config_id = 87011,
      gadget_id = 70360351,
      pos = {
        x = 5039.962,
        y = 536.401,
        z = -1728.391
      },
      rot = {
        x = 358.89,
        y = 94.027,
        z = 347.338
      },
      level = 1
    },
    {
      config_id = 87012,
      gadget_id = 70360351,
      pos = {
        x = 5058.815,
        y = 537.435,
        z = -1723.469
      },
      rot = {
        x = 358.89,
        y = 94.027,
        z = 345.12
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
    gadgets = {87008},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      87001,
      87002,
      87003,
      87004,
      87005,
      87006,
      87007,
      87009,
      87010,
      87013,
      87014,
      87015,
      87016,
      87017,
      87018,
      87019,
      87020,
      87021,
      87022,
      87024,
      87025,
      87026,
      87027,
      87028,
      87029,
      87030,
      87031,
      87032,
      87033,
      87034
    },
    regions = {87023},
    triggers = {},
    rand_weight = 100
  }
}
require("V2_8/DrawOneLine_Dreamland")
