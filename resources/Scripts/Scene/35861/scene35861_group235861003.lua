local base_info = {group_id = 235861003}
local defs = {
  isStartLevel = false,
  nextGroupId = -1,
  levelId = 1,
  galleryId = 23006,
  startId = 3001,
  maxRegion = 3002,
  monsterPoolTable = {
    {
      pool_list = {35011},
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
      pool_list = {35012},
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
  [3001] = {
    config_id = 3001,
    gadget_id = 70360010,
    pos = {
      x = 520.984,
      y = 103.55,
      z = 372.267
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
      y = 103.47,
      z = 372.108
    }
  }
}
triggers = {}
points = {
  {
    config_id = 3003,
    pos = {
      x = 525.574,
      y = 103.622,
      z = 366.331
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
      x = 527.266,
      y = 103.713,
      z = 368.091
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
      x = 523.398,
      y = 103.984,
      z = 364.789
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
      x = 528.756,
      y = 103.845,
      z = 369.642
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
      x = 521.719,
      y = 103.842,
      z = 363.221
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
      x = 525.918,
      y = 103.43,
      z = 361.759
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
      x = 528.151,
      y = 103.459,
      z = 363.259
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
      x = 530.584,
      y = 103.473,
      z = 365.335
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
      x = 512.701,
      y = 103.7,
      z = 370.131
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
      x = 518.467,
      y = 103.927,
      z = 364.002
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
      x = 514.096,
      y = 103.946,
      z = 368.698
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
      x = 516.949,
      y = 104.13,
      z = 365.746
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
      x = 515.588,
      y = 103.984,
      z = 367.293
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
      x = 512.847,
      y = 103.602,
      z = 364.304
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
      x = 515.0,
      y = 103.854,
      z = 362.253
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
      x = 511.156,
      y = 103.421,
      z = 366.28
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
      x = 525.692,
      y = 103.915,
      z = 377.399
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
      x = 527.053,
      y = 103.812,
      z = 375.848
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
      x = 524.196,
      y = 103.957,
      z = 378.802
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
      x = 528.57,
      y = 103.99,
      z = 374.103
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
      x = 522.801,
      y = 103.915,
      z = 380.225
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
      x = 527.413,
      y = 103.75,
      z = 378.876
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
      x = 529.568,
      y = 103.848,
      z = 376.824
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
      x = 525.716,
      y = 103.804,
      z = 380.832
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
