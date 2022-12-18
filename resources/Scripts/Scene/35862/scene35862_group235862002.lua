local base_info = {group_id = 235862002}
local defs = {
  isStartLevel = false,
  nextGroupId = 235862003,
  levelId = 1,
  galleryId = 23008,
  startId = 2001,
  maxRegion = 2002,
  monsterPoolTable = {
    {
      pool_list = {35015},
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
      pool_list = {35016},
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
  [2001] = {
    config_id = 2001,
    gadget_id = 70360010,
    pos = {
      x = 520.576,
      y = 103.544,
      z = 372.373
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
      y = 103.553,
      z = 372.108
    }
  }
}
triggers = {}
points = {
  {
    config_id = 2003,
    pos = {
      x = 525.463,
      y = 103.722,
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
    config_id = 2004,
    pos = {
      x = 527.155,
      y = 103.792,
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
    config_id = 2005,
    pos = {
      x = 523.288,
      y = 104.045,
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
    config_id = 2006,
    pos = {
      x = 528.645,
      y = 103.922,
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
    config_id = 2007,
    pos = {
      x = 521.609,
      y = 103.915,
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
    config_id = 2008,
    pos = {
      x = 525.807,
      y = 103.502,
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
    config_id = 2009,
    pos = {
      x = 528.041,
      y = 103.535,
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
    config_id = 2010,
    pos = {
      x = 530.473,
      y = 103.563,
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
    config_id = 2011,
    pos = {
      x = 512.591,
      y = 103.783,
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
    config_id = 2012,
    pos = {
      x = 518.357,
      y = 104.036,
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
    config_id = 2013,
    pos = {
      x = 513.986,
      y = 104.014,
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
    config_id = 2014,
    pos = {
      x = 516.839,
      y = 104.218,
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
    config_id = 2015,
    pos = {
      x = 515.478,
      y = 104.073,
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
    config_id = 2016,
    pos = {
      x = 512.737,
      y = 103.657,
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
    config_id = 2017,
    pos = {
      x = 514.89,
      y = 103.93,
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
    config_id = 2018,
    pos = {
      x = 511.046,
      y = 103.491,
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
    config_id = 2019,
    pos = {
      x = 525.582,
      y = 104.007,
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
    config_id = 2020,
    pos = {
      x = 526.943,
      y = 103.892,
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
    config_id = 2021,
    pos = {
      x = 524.085,
      y = 104.035,
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
    config_id = 2022,
    pos = {
      x = 528.459,
      y = 104.076,
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
    config_id = 2023,
    pos = {
      x = 522.69,
      y = 104.005,
      z = 380.121
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
      x = 527.303,
      y = 103.848,
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
    config_id = 2025,
    pos = {
      x = 529.457,
      y = 103.923,
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
    config_id = 2026,
    pos = {
      x = 525.606,
      y = 103.864,
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
