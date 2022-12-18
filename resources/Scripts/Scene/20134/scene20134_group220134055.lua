local base_info = {group_id = 220134055}
local defs = {
  patterns = {
    [1] = {
      [55001] = 55002,
      [55002] = 55003,
      [55003] = 55004,
      [55004] = 55005,
      [55005] = 0
    }
  }
}
monsters = {}
npcs = {}
gadgets = {
  [55001] = {
    config_id = 55001,
    gadget_id = 70310179,
    pos = {
      x = 732.761,
      y = 653.542,
      z = -1779.07
    },
    rot = {
      x = 318.956,
      y = 206.11,
      z = 6.123
    },
    level = 1,
    persistent = true,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  [55002] = {
    config_id = 55002,
    gadget_id = 70310179,
    pos = {
      x = 733.657,
      y = 661.899,
      z = -1771.407
    },
    rot = {
      x = 318.956,
      y = 206.11,
      z = 6.123
    },
    level = 1,
    persistent = true,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  [55003] = {
    config_id = 55003,
    gadget_id = 70310179,
    pos = {
      x = 724.947,
      y = 650.48,
      z = -1778.21
    },
    rot = {
      x = 318.956,
      y = 206.11,
      z = 6.123
    },
    level = 1,
    persistent = true,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  [55004] = {
    config_id = 55004,
    gadget_id = 70310179,
    pos = {
      x = 725.633,
      y = 656.94,
      z = -1769.828
    },
    rot = {
      x = 318.956,
      y = 206.11,
      z = 6.123
    },
    level = 1,
    persistent = true,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  [55005] = {
    config_id = 55005,
    gadget_id = 70310179,
    pos = {
      x = 721.961,
      y = 655.507,
      z = -1770.297
    },
    rot = {
      x = 318.956,
      y = 206.11,
      z = 6.123
    },
    level = 1,
    persistent = true,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  }
}
regions = {}
triggers = {}
variables = {}
init_config = {
  suite = 2,
  end_suite = 1,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {
      55001,
      55002,
      55003,
      55004,
      55005
    },
    regions = {},
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
require("V2_8/ConstellationPattern")
