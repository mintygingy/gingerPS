local base_info = {group_id = 235863002}
local defs = {
  isStartLevel = false,
  nextGroupId = 235863003,
  levelId = 1,
  galleryId = 23011,
  startId = 2001,
  maxRegion = 2002,
  monsterPoolTable = {
    {
      pool_list = {35021},
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
      pool_list = {35022},
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
      x = 520.415,
      y = 103.553,
      z = 372.521
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
      y = 103.603,
      z = 372.108
    }
  }
}
triggers = {}
points = {
  {
    config_id = 2003,
    pos = {
      x = 525.435,
      y = 103.61,
      z = 366.246
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
      x = 527.127,
      y = 103.688,
      z = 368.006
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
      x = 523.26,
      y = 103.951,
      z = 364.704
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
      x = 528.617,
      y = 103.822,
      z = 369.557
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
      x = 525.781,
      y = 103.406,
      z = 361.674
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
      x = 528.012,
      y = 103.435,
      z = 363.174
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
      x = 530.446,
      y = 103.455,
      z = 365.25
    },
    rot = {
      x = 0.0,
      y = 319.839,
      z = 0.0
    },
    tag = 2
  },
  {
    config_id = 2012,
    pos = {
      x = 518.328,
      y = 103.928,
      z = 363.917
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
      x = 513.958,
      y = 103.909,
      z = 368.613
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
      x = 516.811,
      y = 104.117,
      z = 365.661
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
      x = 515.45,
      y = 103.972,
      z = 367.208
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
      x = 512.708,
      y = 103.562,
      z = 364.219
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
      x = 514.861,
      y = 103.829,
      z = 362.168
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
      x = 511.017,
      y = 103.392,
      z = 366.195
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
      x = 525.554,
      y = 103.904,
      z = 377.313
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
      x = 526.915,
      y = 103.783,
      z = 375.764
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
      x = 524.057,
      y = 103.934,
      z = 378.717
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
      x = 528.431,
      y = 103.967,
      z = 374.018
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
      x = 522.662,
      y = 103.899,
      z = 380.139
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
      x = 527.275,
      y = 103.741,
      z = 378.791
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
      x = 529.429,
      y = 103.818,
      z = 376.74
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
      x = 525.578,
      y = 103.758,
      z = 380.747
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
      x = 524.743,
      y = 103.61,
      z = 365.695
    },
    rot = {
      x = 0.0,
      y = 319.839,
      z = 0.0
    },
    tag = 1
  },
  {
    config_id = 2029,
    pos = {
      x = 526.435,
      y = 103.688,
      z = 367.455
    },
    rot = {
      x = 0.0,
      y = 319.839,
      z = 0.0
    },
    tag = 1
  },
  {
    config_id = 2030,
    pos = {
      x = 522.567,
      y = 103.951,
      z = 364.153
    },
    rot = {
      x = 0.0,
      y = 319.839,
      z = 0.0
    },
    tag = 1
  },
  {
    config_id = 2031,
    pos = {
      x = 527.924,
      y = 103.822,
      z = 369.006
    },
    rot = {
      x = 0.0,
      y = 314.612,
      z = 0.0
    },
    tag = 1
  },
  {
    config_id = 2032,
    pos = {
      x = 520.888,
      y = 103.815,
      z = 362.585
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
garbages = {}
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
