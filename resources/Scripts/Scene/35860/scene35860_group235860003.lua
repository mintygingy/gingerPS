local base_info = {group_id = 235860003}
local defs = {
  isStartLevel = false,
  nextGroupId = -1,
  levelId = 1,
  galleryId = 23003,
  startId = 3001,
  maxRegion = 3002,
  monsterPoolTable = {
    {
      pool_list = {35005},
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
    },
    {
      pool_list = {35006},
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
      x = 520.677,
      y = 103.522,
      z = 372.187
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
      x = 520.526,
      y = 103.665,
      z = 371.702
    }
  }
}
triggers = {}
points = {
  {
    config_id = 3003,
    pos = {
      x = 525.676,
      y = 103.771,
      z = 365.872
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
      x = 527.368,
      y = 103.835,
      z = 367.632
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
      x = 523.501,
      y = 104.093,
      z = 364.33
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
      x = 528.858,
      y = 103.959,
      z = 369.183
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
      x = 521.821,
      y = 103.961,
      z = 362.762
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
      x = 526.02,
      y = 103.542,
      z = 361.301
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
      x = 528.253,
      y = 103.579,
      z = 362.8
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
      x = 530.686,
      y = 103.616,
      z = 364.876
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
      x = 512.803,
      y = 103.841,
      z = 369.672
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
      x = 518.569,
      y = 104.037,
      z = 363.543
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
      x = 514.199,
      y = 104.102,
      z = 368.239
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
      x = 517.052,
      y = 104.237,
      z = 365.287
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
      x = 515.691,
      y = 104.126,
      z = 366.834
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
      x = 512.95,
      y = 103.727,
      z = 363.846
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
      x = 515.102,
      y = 103.975,
      z = 361.794
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
      x = 511.258,
      y = 103.546,
      z = 365.821
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
      x = 525.795,
      y = 104.025,
      z = 376.94
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
      x = 527.156,
      y = 103.976,
      z = 375.389
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
      x = 524.299,
      y = 104.076,
      z = 378.343
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
      x = 528.672,
      y = 104.142,
      z = 373.644
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
      x = 522.903,
      y = 104.05,
      z = 379.766
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
      x = 527.516,
      y = 103.873,
      z = 378.417
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
      x = 529.67,
      y = 103.991,
      z = 376.366
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
      x = 525.819,
      y = 103.965,
      z = 380.373
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
