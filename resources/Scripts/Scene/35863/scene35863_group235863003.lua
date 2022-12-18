local base_info = {group_id = 235863003}
local defs = {
  isStartLevel = false,
  nextGroupId = -1,
  levelId = 1,
  galleryId = 23012,
  startId = 3001,
  maxRegion = 3002,
  monsterPoolTable = {
    {
      pool_list = {35023},
      point_array_id = 0,
      point_id_list = {},
      affix_list = {},
      param = {
        total_count = 999,
        min_count = 2,
        max_count = 5,
        tag = 0,
        fill_time = 0,
        fill_count = 0,
        is_ordered = true,
        is_tag_bit_match = true
      }
    },
    {
      pool_list = {35024},
      point_array_id = 0,
      point_id_list = {},
      affix_list = {},
      param = {
        total_count = 999,
        min_count = 1,
        max_count = 4,
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
      x = 520.497,
      y = 103.54,
      z = 372.576
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
      y = 103.644,
      z = 372.108
    }
  }
}
triggers = {}
points = {
  {
    config_id = 3003,
    pos = {
      x = 525.393,
      y = 103.648,
      z = 366.26
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
      x = 527.085,
      y = 103.71,
      z = 368.02
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
      x = 523.218,
      y = 103.955,
      z = 364.718
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
      x = 528.575,
      y = 103.837,
      z = 369.571
    },
    rot = {
      x = 0.0,
      y = 314.612,
      z = 0.0
    },
    tag = 1
  },
  {
    config_id = 3007,
    pos = {
      x = 521.539,
      y = 103.829,
      z = 363.15
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
      x = 525.736,
      y = 103.414,
      z = 361.688
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
      x = 527.97,
      y = 103.45,
      z = 363.188
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
      x = 530.403,
      y = 103.485,
      z = 365.264
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
      x = 512.52,
      y = 103.702,
      z = 370.06
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
      x = 518.286,
      y = 103.96,
      z = 363.932
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
      x = 513.916,
      y = 103.929,
      z = 368.627
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
      x = 516.769,
      y = 104.136,
      z = 365.675
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
      x = 515.408,
      y = 103.992,
      z = 367.222
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
      x = 512.667,
      y = 103.568,
      z = 364.234
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
      x = 514.819,
      y = 103.845,
      z = 362.182
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
      x = 510.976,
      y = 103.405,
      z = 366.209
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
      x = 525.512,
      y = 103.927,
      z = 377.328
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
      x = 526.872,
      y = 103.813,
      z = 375.777
    },
    rot = {
      x = 0.0,
      y = 226.463,
      z = 0.0
    },
    tag = 16
  },
  {
    config_id = 3021,
    pos = {
      x = 524.015,
      y = 103.951,
      z = 378.731
    },
    rot = {
      x = 0.0,
      y = 231.69,
      z = 0.0
    },
    tag = 16
  },
  {
    config_id = 3022,
    pos = {
      x = 528.389,
      y = 103.998,
      z = 374.032
    },
    rot = {
      x = 0.0,
      y = 231.69,
      z = 0.0
    },
    tag = 16
  },
  {
    config_id = 3023,
    pos = {
      x = 522.62,
      y = 103.924,
      z = 380.154
    },
    rot = {
      x = 0.0,
      y = 231.69,
      z = 0.0
    },
    tag = 16
  },
  {
    config_id = 3024,
    pos = {
      x = 527.232,
      y = 103.771,
      z = 378.804
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
      x = 529.387,
      y = 103.84,
      z = 376.753
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
      x = 525.535,
      y = 103.779,
      z = 380.761
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
