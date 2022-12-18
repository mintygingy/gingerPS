local base_info = {group_id = 235860002}
local defs = {
  isStartLevel = false,
  nextGroupId = 235860003,
  levelId = 1,
  galleryId = 23002,
  startId = 2001,
  maxRegion = 2002,
  monsterPoolTable = {
    {
      pool_list = {35003},
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
      pool_list = {35004},
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
  [2001] = {
    config_id = 2001,
    gadget_id = 70360010,
    pos = {
      x = 520.688,
      y = 103.542,
      z = 372.183
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
  [2002] = {
    config_id = 2002,
    shape = RegionShape.SPHERE,
    radius = 20,
    pos = {
      x = 520.456,
      y = 103.596,
      z = 372.108
    }
  }
}
triggers = {}
points = {
  {
    config_id = 2003,
    pos = {
      x = 525.616,
      y = 103.706,
      z = 366.17
    },
    rot = {
      x = 0.0,
      y = 319.839,
      z = 0.0
    },
    tag = 1
  },
  {
    config_id = 2004,
    pos = {
      x = 527.308,
      y = 103.793,
      z = 367.929
    },
    rot = {
      x = 0.0,
      y = 319.839,
      z = 0.0
    },
    tag = 1
  },
  {
    config_id = 2005,
    pos = {
      x = 523.441,
      y = 104.062,
      z = 364.627
    },
    rot = {
      x = 0.0,
      y = 319.839,
      z = 0.0
    },
    tag = 1
  },
  {
    config_id = 2006,
    pos = {
      x = 528.798,
      y = 103.92,
      z = 369.481
    },
    rot = {
      x = 0.0,
      y = 314.612,
      z = 0.0
    },
    tag = 1
  },
  {
    config_id = 2007,
    pos = {
      x = 521.761,
      y = 103.921,
      z = 363.06
    },
    rot = {
      x = 0.0,
      y = 314.612,
      z = 0.0
    },
    tag = 1
  },
  {
    config_id = 2008,
    pos = {
      x = 525.96,
      y = 103.501,
      z = 361.598
    },
    rot = {
      x = 0.0,
      y = 314.612,
      z = 0.0
    },
    tag = 2
  },
  {
    config_id = 2009,
    pos = {
      x = 528.194,
      y = 103.538,
      z = 363.097
    },
    rot = {
      x = 0.0,
      y = 319.839,
      z = 0.0
    },
    tag = 2
  },
  {
    config_id = 2010,
    pos = {
      x = 530.626,
      y = 103.558,
      z = 365.173
    },
    rot = {
      x = 0.0,
      y = 319.839,
      z = 0.0
    },
    tag = 2
  },
  {
    config_id = 2011,
    pos = {
      x = 512.743,
      y = 103.787,
      z = 369.97
    },
    rot = {
      x = 0.0,
      y = 48.975,
      z = 0.0
    },
    tag = 4
  },
  {
    config_id = 2012,
    pos = {
      x = 518.509,
      y = 103.989,
      z = 363.841
    },
    rot = {
      x = 0.0,
      y = 48.975,
      z = 0.0
    },
    tag = 4
  },
  {
    config_id = 2013,
    pos = {
      x = 514.139,
      y = 104.046,
      z = 368.536
    },
    rot = {
      x = 0.0,
      y = 48.975,
      z = 0.0
    },
    tag = 4
  },
  {
    config_id = 2014,
    pos = {
      x = 516.992,
      y = 104.198,
      z = 365.585
    },
    rot = {
      x = 0.0,
      y = 43.748,
      z = 0.0
    },
    tag = 4
  },
  {
    config_id = 2015,
    pos = {
      x = 515.63,
      y = 104.075,
      z = 367.131
    },
    rot = {
      x = 0.0,
      y = 43.748,
      z = 0.0
    },
    tag = 4
  },
  {
    config_id = 2016,
    pos = {
      x = 512.889,
      y = 103.691,
      z = 364.143
    },
    rot = {
      x = 0.0,
      y = 43.748,
      z = 0.0
    },
    tag = 8
  },
  {
    config_id = 2017,
    pos = {
      x = 515.042,
      y = 103.933,
      z = 362.091
    },
    rot = {
      x = 0.0,
      y = 48.975,
      z = 0.0
    },
    tag = 8
  },
  {
    config_id = 2018,
    pos = {
      x = 511.198,
      y = 103.505,
      z = 366.118
    },
    rot = {
      x = 0.0,
      y = 48.975,
      z = 0.0
    },
    tag = 8
  },
  {
    config_id = 2019,
    pos = {
      x = 525.734,
      y = 103.983,
      z = 377.237
    },
    rot = {
      x = 0.0,
      y = 226.463,
      z = 0.0
    },
    tag = 16
  },
  {
    config_id = 2020,
    pos = {
      x = 527.096,
      y = 103.911,
      z = 375.687
    },
    rot = {
      x = 0.0,
      y = 226.463,
      z = 0.0
    },
    tag = 16
  },
  {
    config_id = 2021,
    pos = {
      x = 524.238,
      y = 104.035,
      z = 378.64
    },
    rot = {
      x = 0.0,
      y = 231.69,
      z = 0.0
    },
    tag = 16
  },
  {
    config_id = 2022,
    pos = {
      x = 528.612,
      y = 104.081,
      z = 373.941
    },
    rot = {
      x = 0.0,
      y = 231.69,
      z = 0.0
    },
    tag = 16
  },
  {
    config_id = 2023,
    pos = {
      x = 522.843,
      y = 103.996,
      z = 380.063
    },
    rot = {
      x = 0.0,
      y = 231.69,
      z = 0.0
    },
    tag = 16
  },
  {
    config_id = 2024,
    pos = {
      x = 527.455,
      y = 103.822,
      z = 378.714
    },
    rot = {
      x = 0.0,
      y = 226.463,
      z = 0.0
    },
    tag = 32
  },
  {
    config_id = 2025,
    pos = {
      x = 529.61,
      y = 103.938,
      z = 376.663
    },
    rot = {
      x = 0.0,
      y = 231.69,
      z = 0.0
    },
    tag = 32
  },
  {
    config_id = 2026,
    pos = {
      x = 525.758,
      y = 103.902,
      z = 380.67
    },
    rot = {
      x = 0.0,
      y = 231.69,
      z = 0.0
    },
    tag = 32
  },
  {
    config_id = 2028,
    pos = {
      x = 529.196,
      y = 103.558,
      z = 364.205
    },
    rot = {
      x = 0.0,
      y = 319.839,
      z = 0.0
    },
    tag = 2
  },
  {
    config_id = 2029,
    pos = {
      x = 526.764,
      y = 103.538,
      z = 362.129
    },
    rot = {
      x = 0.0,
      y = 319.839,
      z = 0.0
    },
    tag = 2
  },
  {
    config_id = 2030,
    pos = {
      x = 524.531,
      y = 103.501,
      z = 360.63
    },
    rot = {
      x = 0.0,
      y = 314.612,
      z = 0.0
    },
    tag = 2
  },
  {
    config_id = 2031,
    pos = {
      x = 524.858,
      y = 103.706,
      z = 365.592
    },
    rot = {
      x = 0.0,
      y = 319.839,
      z = 0.0
    },
    tag = 1
  },
  {
    config_id = 2032,
    pos = {
      x = 526.55,
      y = 103.793,
      z = 367.351
    },
    rot = {
      x = 0.0,
      y = 319.839,
      z = 0.0
    },
    tag = 1
  },
  {
    config_id = 2033,
    pos = {
      x = 522.683,
      y = 104.062,
      z = 364.049
    },
    rot = {
      x = 0.0,
      y = 319.839,
      z = 0.0
    },
    tag = 1
  },
  {
    config_id = 2034,
    pos = {
      x = 528.04,
      y = 103.92,
      z = 368.903
    },
    rot = {
      x = 0.0,
      y = 314.612,
      z = 0.0
    },
    tag = 1
  },
  {
    config_id = 2035,
    pos = {
      x = 521.004,
      y = 103.921,
      z = 362.481
    },
    rot = {
      x = 0.0,
      y = 314.612,
      z = 0.0
    },
    tag = 1
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
    gadgets = {2001},
    regions = {2002},
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
