local base_info = {group_id = 235863001}
local defs = {
  isStartLevel = true,
  nextGroupId = 235863002,
  levelId = 1,
  galleryId = 23010,
  startId = 1001,
  maxRegion = 1002,
  monsterPoolTable = {
    {
      pool_list = {35019},
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
      pool_list = {35020},
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
      x = 520.55,
      y = 103.521,
      z = 372.625
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
      x = 520.209,
      y = 104.077,
      z = 372.806
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
      y = 103.651,
      z = 372.108
    }
  }
}
triggers = {}
points = {
  {
    config_id = 1003,
    pos = {
      x = 525.549,
      y = 103.662,
      z = 366.301
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
      x = 527.241,
      y = 103.736,
      z = 368.06
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
      x = 523.374,
      y = 103.992,
      z = 364.758
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
      x = 528.731,
      y = 103.864,
      z = 369.612
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
      x = 521.695,
      y = 103.859,
      z = 363.191
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
      x = 525.893,
      y = 103.444,
      z = 361.729
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
      x = 528.127,
      y = 103.478,
      z = 363.228
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
      x = 530.559,
      y = 103.505,
      z = 365.304
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
      x = 512.676,
      y = 103.727,
      z = 370.101
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
      x = 518.442,
      y = 103.967,
      z = 363.972
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
      x = 514.072,
      y = 103.965,
      z = 368.667
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
      x = 516.925,
      y = 104.156,
      z = 365.716
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
      x = 515.564,
      y = 104.007,
      z = 367.263
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
      x = 512.822,
      y = 103.607,
      z = 364.274
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
      x = 514.975,
      y = 103.873,
      z = 362.222
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
      x = 511.131,
      y = 103.437,
      z = 366.249
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
      x = 525.668,
      y = 103.944,
      z = 377.368
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
      x = 527.029,
      y = 103.84,
      z = 375.818
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
      x = 524.171,
      y = 103.977,
      z = 378.771
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
      x = 528.545,
      y = 104.02,
      z = 374.072
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
      x = 522.776,
      y = 103.945,
      z = 380.194
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
      x = 527.389,
      y = 103.785,
      z = 378.845
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
      x = 529.543,
      y = 103.869,
      z = 376.794
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
      x = 525.692,
      y = 103.82,
      z = 380.802
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
