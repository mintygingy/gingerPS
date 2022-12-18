local base_info = {group_id = 235862003}
local defs = {
  isStartLevel = false,
  nextGroupId = -1,
  levelId = 1,
  galleryId = 23009,
  startId = 3001,
  maxRegion = 3002,
  monsterPoolTable = {
    {
      pool_list = {35017},
      point_array_id = 0,
      point_id_list = {},
      affix_list = {},
      param = {
        total_count = 999,
        min_count = 1,
        max_count = 3,
        tag = 0,
        fill_time = 0,
        fill_count = 0,
        is_ordered = true,
        is_tag_bit_match = true
      }
    },
    {
      pool_list = {35018},
      point_array_id = 0,
      point_id_list = {},
      affix_list = {},
      param = {
        total_count = 999,
        min_count = 1,
        max_count = 2,
        tag = 0,
        fill_time = 0,
        fill_count = 0,
        is_ordered = true,
        is_tag_bit_match = true
      }
    }
  },
  switchTime = 50,
  sgvIdxTable = {
    1,
    2,
    3,
    4
  },
  buffDuration = 15,
  stageMaxDuration = 40
}
monsters = {}
npcs = {}
gadgets = {
  [3001] = {
    config_id = 3001,
    gadget_id = 70360010,
    pos = {
      x = 520.599,
      y = 103.551,
      z = 372.395
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  }
}
regions = {
  [3002] = {
    config_id = 3002,
    shape = RegionShape.SPHERE,
    radius = 20,
    pos = {
      x = 520.456,
      y = 103.513,
      z = 372.108
    }
  }
}
triggers = {}
points = {
  {
    config_id = 3003,
    pos = {
      x = 524.249,
      y = 103.674,
      z = 364.887
    },
    rot = {
      x = 0.0,
      y = 319.839,
      z = 0.0
    },
    tag = 1
  },
  {
    config_id = 3004,
    pos = {
      x = 527.393,
      y = 103.733,
      z = 367.872
    },
    rot = {
      x = 0.0,
      y = 319.839,
      z = 0.0
    },
    tag = 1
  },
  {
    config_id = 3005,
    pos = {
      x = 525.881,
      y = 103.976,
      z = 366.874
    },
    rot = {
      x = 0.0,
      y = 319.839,
      z = 0.0
    },
    tag = 1
  },
  {
    config_id = 3006,
    pos = {
      x = 529.62,
      y = 103.86,
      z = 370.531
    },
    rot = {
      x = 0.0,
      y = 314.612,
      z = 0.0
    },
    tag = 1
  },
  {
    config_id = 3008,
    pos = {
      x = 525.789,
      y = 103.437,
      z = 361.641
    },
    rot = {
      x = 0.0,
      y = 314.612,
      z = 0.0
    },
    tag = 2
  },
  {
    config_id = 3009,
    pos = {
      x = 528.022,
      y = 103.473,
      z = 363.141
    },
    rot = {
      x = 0.0,
      y = 319.839,
      z = 0.0
    },
    tag = 2
  },
  {
    config_id = 3010,
    pos = {
      x = 530.455,
      y = 103.509,
      z = 365.217
    },
    rot = {
      x = 0.0,
      y = 319.839,
      z = 0.0
    },
    tag = 2
  },
  {
    config_id = 3011,
    pos = {
      x = 512.572,
      y = 103.726,
      z = 370.013
    },
    rot = {
      x = 0.0,
      y = 48.975,
      z = 0.0
    },
    tag = 4
  },
  {
    config_id = 3012,
    pos = {
      x = 518.338,
      y = 103.987,
      z = 363.884
    },
    rot = {
      x = 0.0,
      y = 48.975,
      z = 0.0
    },
    tag = 4
  },
  {
    config_id = 3013,
    pos = {
      x = 513.968,
      y = 103.951,
      z = 368.58
    },
    rot = {
      x = 0.0,
      y = 48.975,
      z = 0.0
    },
    tag = 4
  },
  {
    config_id = 3014,
    pos = {
      x = 516.821,
      y = 104.16,
      z = 365.628
    },
    rot = {
      x = 0.0,
      y = 43.748,
      z = 0.0
    },
    tag = 4
  },
  {
    config_id = 3015,
    pos = {
      x = 515.459,
      y = 104.017,
      z = 367.175
    },
    rot = {
      x = 0.0,
      y = 43.748,
      z = 0.0
    },
    tag = 4
  },
  {
    config_id = 3016,
    pos = {
      x = 512.718,
      y = 103.59,
      z = 364.186
    },
    rot = {
      x = 0.0,
      y = 43.748,
      z = 0.0
    },
    tag = 8
  },
  {
    config_id = 3017,
    pos = {
      x = 514.871,
      y = 103.868,
      z = 362.135
    },
    rot = {
      x = 0.0,
      y = 48.975,
      z = 0.0
    },
    tag = 8
  },
  {
    config_id = 3018,
    pos = {
      x = 511.027,
      y = 103.427,
      z = 366.162
    },
    rot = {
      x = 0.0,
      y = 48.975,
      z = 0.0
    },
    tag = 8
  },
  {
    config_id = 3019,
    pos = {
      x = 524.15,
      y = 103.952,
      z = 378.969
    },
    rot = {
      x = 0.0,
      y = 226.463,
      z = 0.0
    },
    tag = 16
  },
  {
    config_id = 3020,
    pos = {
      x = 527.65,
      y = 103.836,
      z = 375.167
    },
    rot = {
      x = 0.0,
      y = 226.463,
      z = 0.0
    },
    tag = 16
  },
  {
    config_id = 3024,
    pos = {
      x = 527.285,
      y = 103.796,
      z = 378.757
    },
    rot = {
      x = 0.0,
      y = 226.463,
      z = 0.0
    },
    tag = 32
  },
  {
    config_id = 3025,
    pos = {
      x = 529.439,
      y = 103.862,
      z = 376.706
    },
    rot = {
      x = 0.0,
      y = 231.69,
      z = 0.0
    },
    tag = 32
  },
  {
    config_id = 3026,
    pos = {
      x = 525.587,
      y = 103.807,
      z = 380.714
    },
    rot = {
      x = 0.0,
      y = 231.69,
      z = 0.0
    },
    tag = 32
  }
}
variables = {}
garbages = {}
init_config = {
  suite = 1,
  end_suite = 0,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {3001},
    regions = {3002},
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
require("V3_0/UnstableSpray")
