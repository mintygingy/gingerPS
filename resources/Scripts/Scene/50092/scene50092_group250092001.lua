local base_info = {group_id = 250092001}
local defs = {gallery_id = 27004, finish_region = 1013}
local windball_list = {
  [1005] = 2,
  [1006] = 3
}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 1001,
    gadget_id = 70800246,
    pos = {
      x = 77.291,
      y = -245.248,
      z = 58.954
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  {
    config_id = 1002,
    gadget_id = 70360094,
    pos = {
      x = 81.113,
      y = -245.91,
      z = 60.979
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1003,
    gadget_id = 70360094,
    pos = {
      x = 81.198,
      y = -245.91,
      z = 63.58
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1004,
    gadget_id = 70360094,
    pos = {
      x = 81.26,
      y = -245.91,
      z = 65.594
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1005,
    gadget_id = 70800281,
    pos = {
      x = 74.069,
      y = -245.91,
      z = 65.897
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1006,
    gadget_id = 70800281,
    pos = {
      x = 84.342,
      y = -245.95,
      z = 74.69
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1007,
    gadget_id = 70360094,
    pos = {
      x = 87.282,
      y = -245.95,
      z = 74.285
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1008,
    gadget_id = 70360094,
    pos = {
      x = 87.376,
      y = -245.95,
      z = 71.824
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1009,
    gadget_id = 70360094,
    pos = {
      x = 85.099,
      y = -245.95,
      z = 71.243
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1010,
    gadget_id = 70350256,
    pos = {
      x = 99.349,
      y = -244.385,
      z = 64.441
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1011,
    gadget_id = 70350256,
    pos = {
      x = 99.967,
      y = -244.376,
      z = 68.671
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1012,
    gadget_id = 70350256,
    pos = {
      x = 100.877,
      y = -244.454,
      z = 72.984
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1014,
    gadget_id = 70800276,
    pos = {
      x = 77.104,
      y = -246.6,
      z = 71.865
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1015,
    gadget_id = 70800277,
    pos = {
      x = 86.398,
      y = -251.924,
      z = 60.756
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  }
}
regions = {
  {
    config_id = 1013,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 99.221,
      y = -245.91,
      z = 83.015
    }
  }
}
triggers = {}
variables = {}
init_config = {
  suite = 1,
  end_suite = 0,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {
      1001,
      1005,
      1006,
      1010,
      1011,
      1012,
      1014,
      1015
    },
    regions = {1013},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      1002,
      1003,
      1004
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      1007,
      1008,
      1009
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
require("V3_1/Activity_WindMaze")
