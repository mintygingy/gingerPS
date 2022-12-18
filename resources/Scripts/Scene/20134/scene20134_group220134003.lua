local base_info = {group_id = 220134003}
local defs = {
  patterns = {
    [1] = {
      [3001] = 3006,
      [3002] = 3006,
      [3003] = 3002,
      [3004] = 3002,
      [3005] = 3004,
      [3006] = 3004
    },
    [2] = {
      [35001] = 35003,
      [35002] = 35004,
      [35003] = 35004,
      [35004] = 35006,
      [35005] = 35001,
      [35006] = 35001
    }
  }
}
monsters = {}
npcs = {}
gadgets = {
  [3001] = {
    config_id = 3001,
    gadget_id = 70310179,
    pos = {
      x = 379.87,
      y = 672.5,
      z = -1653.564
    },
    rot = {
      x = 0.0,
      y = 15.407,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  [3002] = {
    config_id = 3002,
    gadget_id = 70310179,
    pos = {
      x = 386.036,
      y = 672.5,
      z = -1654.554
    },
    rot = {
      x = 0.0,
      y = 15.407,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  [3003] = {
    config_id = 3003,
    gadget_id = 70310179,
    pos = {
      x = 391.509,
      y = 672.5,
      z = -1657.192
    },
    rot = {
      x = 0.0,
      y = 15.407,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  [3004] = {
    config_id = 3004,
    gadget_id = 70310179,
    pos = {
      x = 382.679,
      y = 672.5,
      z = -1648.391
    },
    rot = {
      x = 0.0,
      y = 15.407,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  [3005] = {
    config_id = 3005,
    gadget_id = 70310454,
    pos = {
      x = 383.058,
      y = 672.5,
      z = -1643.721
    },
    rot = {
      x = 0.0,
      y = 15.407,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearAction2,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  [3006] = {
    config_id = 3006,
    gadget_id = 70310179,
    pos = {
      x = 397.561,
      y = 672.5,
      z = -1643.844
    },
    rot = {
      x = 0.0,
      y = 15.407,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  [3007] = {
    config_id = 3007,
    gadget_id = 70310389,
    pos = {
      x = 387.0,
      y = 672.5,
      z = -1648.8
    },
    rot = {
      x = 0.0,
      y = 15.407,
      z = 0.0
    },
    level = 1
  }
}
regions = {}
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
      3001,
      3002,
      3003,
      3004,
      3005,
      3006,
      3007
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
require("V2_8/ConstellationPattern")
