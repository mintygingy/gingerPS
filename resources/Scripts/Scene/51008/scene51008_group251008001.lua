local base_info = {group_id = 251008001}
local defs = {
  play_region = 1003,
  air_wall = {1005},
  enter_suites = {
    2,
    2,
    2,
    2
  },
  play_suites = {},
  limit_time = 3000,
  target = 1000,
  wall = 1002,
  hp = {
    [1] = {
      Normal = 78,
      Stamina = 78,
      Line = 300,
      All = 720
    },
    [2] = {
      Normal = 114,
      Stamina = 114,
      Line = 450,
      All = 1080
    },
    [3] = {
      Normal = 138,
      Stamina = 138,
      Line = 540,
      All = 1296
    },
    [4] = {
      Normal = 156,
      Stamina = 156,
      Line = 600,
      All = 1440
    }
  }
}
monsters = {}
npcs = {}
gadgets = {
  [1002] = {
    config_id = 1002,
    gadget_id = 70320006,
    pos = {
      x = -7.214,
      y = 0.0,
      z = 9.805
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1004] = {
    config_id = 1004,
    gadget_id = 70320023,
    pos = {
      x = 0.0,
      y = 0.0,
      z = 10.0
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1005] = {
    config_id = 1005,
    gadget_id = 70380323,
    pos = {
      x = 0.0,
      y = 0.0,
      z = -7.0
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
  [1003] = {
    config_id = 1003,
    shape = RegionShape.CUBIC,
    size = {
      x = 40.0,
      y = 20.0,
      z = 40.0
    },
    pos = {
      x = 0.274,
      y = 9.327,
      z = -0.179
    }
  }
}
triggers = {}
variables = {}
garbages = {
  gadgets = {
    {
      config_id = 1001,
      gadget_id = 44000006,
      pos = {
        x = 0.674,
        y = 0.5,
        z = 1.82
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1
    }
  }
}
init_config = {
  suite = 1,
  end_suite = 0,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {1004},
    regions = {1003},
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
require("V3_2/CharAmuse_BrickWall")
require("V3_2/CharAmuse_Retrans")
