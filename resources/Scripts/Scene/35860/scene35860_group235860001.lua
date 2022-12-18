local base_info = {group_id = 235860001}
local defs = {
  isStartLevel = true,
  nextGroupId = 235860002,
  levelId = 1,
  galleryId = 23001,
  startId = 1001,
  maxRegion = 1002,
  monsterPoolTable = {
    {
      pool_list = {35001},
      point_array_id = 0,
      point_id_list = {},
      affix_list = {},
      param = {
        total_count = 999,
        min_count = 1,
        max_count = 5,
        tag = 0,
        fill_time = 0,
        fill_count = 0,
        is_ordered = true,
        is_tag_bit_match = true
      }
    },
    {
      pool_list = {35002},
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
      x = 520.444,
      y = 103.479,
      z = 372.337
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
      x = 520.152,
      y = 104.069,
      z = 372.73
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
      y = 103.526,
      z = 372.108
    }
  }
}
triggers = {}
points = {
  {
    config_id = 1003,
    pos = {
      x = 525.545,
      y = 103.643,
      z = 366.202
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
      x = 527.237,
      y = 103.718,
      z = 367.961
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
      x = 523.37,
      y = 103.984,
      z = 364.659
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
      x = 528.727,
      y = 103.844,
      z = 369.513
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
      x = 521.691,
      y = 103.847,
      z = 363.092
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
      x = 525.89,
      y = 103.419,
      z = 361.63
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
      x = 528.122,
      y = 103.464,
      z = 363.129
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
      x = 530.555,
      y = 103.492,
      z = 365.205
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
      x = 512.672,
      y = 103.721,
      z = 370.002
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
      x = 518.438,
      y = 103.912,
      z = 363.873
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
      x = 514.068,
      y = 103.984,
      z = 368.569
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
      x = 516.921,
      y = 104.119,
      z = 365.617
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
      x = 515.56,
      y = 104.008,
      z = 367.164
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
      x = 512.818,
      y = 103.618,
      z = 364.175
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
      x = 514.971,
      y = 103.859,
      z = 362.123
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
      x = 511.128,
      y = 103.432,
      z = 366.15
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
      x = 525.664,
      y = 103.905,
      z = 377.269
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
      x = 527.025,
      y = 103.852,
      z = 375.719
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
      x = 524.168,
      y = 103.96,
      z = 378.672
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
      x = 528.542,
      y = 104.018,
      z = 373.973
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
      x = 522.772,
      y = 103.929,
      z = 380.095
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
      x = 527.385,
      y = 103.749,
      z = 378.746
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
      x = 529.54,
      y = 103.872,
      z = 376.695
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
      x = 525.688,
      y = 103.842,
      z = 380.702
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
