local base_info = {group_id = 220134012}
local defs = {
  patterns = {
    [1] = {
      [12001] = 12002,
      [12002] = 12003,
      [12003] = 12006,
      [12004] = 12003,
      [12005] = 12004,
      [12006] = 12007,
      [12007] = 12008,
      [12008] = 12007,
      [12009] = 12006,
      [12010] = 12009
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
  [12001] = {
    config_id = 12001,
    gadget_id = 70310179,
    pos = {
      x = 637.497,
      y = 618.034,
      z = -1590.327
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  [12002] = {
    config_id = 12002,
    gadget_id = 70310454,
    pos = {
      x = 636.546,
      y = 618.034,
      z = -1587.09
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  [12003] = {
    config_id = 12003,
    gadget_id = 70310179,
    pos = {
      x = 633.58,
      y = 618.034,
      z = -1589.614
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  [12004] = {
    config_id = 12004,
    gadget_id = 70310179,
    pos = {
      x = 630.264,
      y = 618.034,
      z = -1591.87
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  [12005] = {
    config_id = 12005,
    gadget_id = 70310454,
    pos = {
      x = 628.902,
      y = 618.034,
      z = -1589.683
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  [12006] = {
    config_id = 12006,
    gadget_id = 70310454,
    pos = {
      x = 630.995,
      y = 618.034,
      z = -1585.917
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  [12007] = {
    config_id = 12007,
    gadget_id = 70310179,
    pos = {
      x = 631.478,
      y = 618.034,
      z = -1582.402
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  [12008] = {
    config_id = 12008,
    gadget_id = 70310454,
    pos = {
      x = 629.831,
      y = 618.034,
      z = -1580.951
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  [12009] = {
    config_id = 12009,
    gadget_id = 70310179,
    pos = {
      x = 627.883,
      y = 618.034,
      z = -1585.563
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  [12010] = {
    config_id = 12010,
    gadget_id = 70310179,
    pos = {
      x = 626.084,
      y = 618.034,
      z = -1587.859
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  }
}
regions = {}
triggers = {}
variables = {}
init_config = {
  suite = 1,
  end_suite = 2,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {
      12001,
      12002,
      12003,
      12004,
      12005,
      12006,
      12007,
      12008,
      12009,
      12010
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
