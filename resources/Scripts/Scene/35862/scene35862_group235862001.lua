local base_info = {group_id = 235862001}
local defs = {
  isStartLevel = true,
  nextGroupId = 235862002,
  levelId = 1,
  galleryId = 23007,
  startId = 1001,
  maxRegion = 1002,
  monsterPoolTable = {
    {
      pool_list = {35013},
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
    },
    {
      pool_list = {35014},
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
  [1001] = {
    config_id = 1001,
    gadget_id = 70360010,
    pos = {
      x = 520.451,
      y = 103.543,
      z = 372.468
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  [1027] = {
    config_id = 1027,
    gadget_id = 70950156,
    pos = {
      x = 520.239,
      y = 104.183,
      z = 372.681
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {
  [1002] = {
    config_id = 1002,
    shape = RegionShape.SPHERE,
    radius = 20,
    pos = {
      x = 520.456,
      y = 103.6,
      z = 372.108
    }
  }
}
triggers = {}
points = {
  {
    config_id = 1003,
    pos = {
      x = 525.464,
      y = 103.775,
      z = 366.227
    },
    rot = {
      x = 0.0,
      y = 319.839,
      z = 0.0
    },
    tag = 1
  },
  {
    config_id = 1004,
    pos = {
      x = 527.156,
      y = 103.839,
      z = 367.986
    },
    rot = {
      x = 0.0,
      y = 319.839,
      z = 0.0
    },
    tag = 1
  },
  {
    config_id = 1005,
    pos = {
      x = 523.288,
      y = 104.084,
      z = 364.684
    },
    rot = {
      x = 0.0,
      y = 319.839,
      z = 0.0
    },
    tag = 1
  },
  {
    config_id = 1006,
    pos = {
      x = 528.645,
      y = 103.963,
      z = 369.538
    },
    rot = {
      x = 0.0,
      y = 314.612,
      z = 0.0
    },
    tag = 1
  },
  {
    config_id = 1007,
    pos = {
      x = 521.609,
      y = 103.957,
      z = 363.117
    },
    rot = {
      x = 0.0,
      y = 314.612,
      z = 0.0
    },
    tag = 1
  },
  {
    config_id = 1008,
    pos = {
      x = 525.807,
      y = 103.54,
      z = 361.655
    },
    rot = {
      x = 0.0,
      y = 314.612,
      z = 0.0
    },
    tag = 2
  },
  {
    config_id = 1009,
    pos = {
      x = 528.041,
      y = 103.577,
      z = 363.155
    },
    rot = {
      x = 0.0,
      y = 319.839,
      z = 0.0
    },
    tag = 2
  },
  {
    config_id = 1010,
    pos = {
      x = 530.473,
      y = 103.613,
      z = 365.23
    },
    rot = {
      x = 0.0,
      y = 319.839,
      z = 0.0
    },
    tag = 2
  },
  {
    config_id = 1011,
    pos = {
      x = 512.591,
      y = 103.832,
      z = 370.027
    },
    rot = {
      x = 0.0,
      y = 48.975,
      z = 0.0
    },
    tag = 4
  },
  {
    config_id = 1012,
    pos = {
      x = 518.357,
      y = 104.079,
      z = 363.898
    },
    rot = {
      x = 0.0,
      y = 48.975,
      z = 0.0
    },
    tag = 4
  },
  {
    config_id = 1013,
    pos = {
      x = 513.986,
      y = 104.064,
      z = 368.594
    },
    rot = {
      x = 0.0,
      y = 48.975,
      z = 0.0
    },
    tag = 4
  },
  {
    config_id = 1014,
    pos = {
      x = 516.839,
      y = 104.259,
      z = 365.642
    },
    rot = {
      x = 0.0,
      y = 43.748,
      z = 0.0
    },
    tag = 4
  },
  {
    config_id = 1015,
    pos = {
      x = 515.478,
      y = 104.112,
      z = 367.189
    },
    rot = {
      x = 0.0,
      y = 43.748,
      z = 0.0
    },
    tag = 4
  },
  {
    config_id = 1016,
    pos = {
      x = 512.737,
      y = 103.7,
      z = 364.2
    },
    rot = {
      x = 0.0,
      y = 43.748,
      z = 0.0
    },
    tag = 8
  },
  {
    config_id = 1017,
    pos = {
      x = 514.889,
      y = 103.973,
      z = 362.149
    },
    rot = {
      x = 0.0,
      y = 48.975,
      z = 0.0
    },
    tag = 8
  },
  {
    config_id = 1018,
    pos = {
      x = 511.046,
      y = 103.534,
      z = 366.175
    },
    rot = {
      x = 0.0,
      y = 48.975,
      z = 0.0
    },
    tag = 8
  },
  {
    config_id = 1019,
    pos = {
      x = 525.582,
      y = 104.049,
      z = 377.294
    },
    rot = {
      x = 0.0,
      y = 226.463,
      z = 0.0
    },
    tag = 16
  },
  {
    config_id = 1020,
    pos = {
      x = 526.943,
      y = 103.946,
      z = 375.744
    },
    rot = {
      x = 0.0,
      y = 226.463,
      z = 0.0
    },
    tag = 16
  },
  {
    config_id = 1021,
    pos = {
      x = 524.086,
      y = 104.077,
      z = 378.697
    },
    rot = {
      x = 0.0,
      y = 231.69,
      z = 0.0
    },
    tag = 16
  },
  {
    config_id = 1022,
    pos = {
      x = 528.46,
      y = 104.128,
      z = 373.998
    },
    rot = {
      x = 0.0,
      y = 231.69,
      z = 0.0
    },
    tag = 16
  },
  {
    config_id = 1023,
    pos = {
      x = 522.691,
      y = 104.05,
      z = 380.12
    },
    rot = {
      x = 0.0,
      y = 231.69,
      z = 0.0
    },
    tag = 16
  },
  {
    config_id = 1024,
    pos = {
      x = 527.303,
      y = 103.894,
      z = 378.771
    },
    rot = {
      x = 0.0,
      y = 226.463,
      z = 0.0
    },
    tag = 32
  },
  {
    config_id = 1025,
    pos = {
      x = 529.458,
      y = 103.971,
      z = 376.72
    },
    rot = {
      x = 0.0,
      y = 231.69,
      z = 0.0
    },
    tag = 32
  },
  {
    config_id = 1026,
    pos = {
      x = 525.606,
      y = 103.919,
      z = 380.728
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
    gadgets = {1001, 1027},
    regions = {1002},
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
