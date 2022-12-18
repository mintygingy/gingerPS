local base_info = {group_id = 235861002}
local defs = {
  isStartLevel = false,
  nextGroupId = 235861003,
  levelId = 1,
  galleryId = 23005,
  startId = 2001,
  maxRegion = 2002,
  monsterPoolTable = {
    {
      pool_list = {35009},
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
      pool_list = {35010},
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
  [2001] = {
    config_id = 2001,
    gadget_id = 70360010,
    pos = {
      x = 520.836,
      y = 103.514,
      z = 372.297
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
      y = 103.446,
      z = 372.108
    }
  }
}
triggers = {}
points = {
  {
    config_id = 2003,
    pos = {
      x = 525.575,
      y = 103.619,
      z = 366.256
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
      x = 527.267,
      y = 103.709,
      z = 368.016
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
      x = 523.4,
      y = 103.978,
      z = 364.714
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
      x = 528.757,
      y = 103.839,
      z = 369.567
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
      x = 521.721,
      y = 103.837,
      z = 363.146
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
      x = 525.918,
      y = 103.423,
      z = 361.684
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
      x = 528.153,
      y = 103.454,
      z = 363.184
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
      x = 530.585,
      y = 103.47,
      z = 365.26
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
      x = 512.703,
      y = 103.696,
      z = 370.056
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
      x = 518.468,
      y = 103.921,
      z = 363.927
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
      x = 514.098,
      y = 103.944,
      z = 368.623
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
      x = 516.951,
      y = 104.124,
      z = 365.671
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
      x = 515.59,
      y = 103.982,
      z = 367.218
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
      x = 512.849,
      y = 103.598,
      z = 364.229
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
      x = 515.002,
      y = 103.849,
      z = 362.178
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
      x = 511.158,
      y = 103.417,
      z = 366.205
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
      x = 525.694,
      y = 103.909,
      z = 377.324
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
      x = 527.055,
      y = 103.81,
      z = 375.773
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
      x = 524.197,
      y = 103.952,
      z = 378.727
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
      x = 528.571,
      y = 103.988,
      z = 374.027
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
      x = 522.802,
      y = 103.911,
      z = 380.15
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
      x = 527.414,
      y = 103.745,
      z = 378.8
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
      x = 529.569,
      y = 103.844,
      z = 376.749
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
      x = 525.718,
      y = 103.803,
      z = 380.757
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
