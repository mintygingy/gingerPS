local base_info = {group_id = 220134021}
local defs = {
  patterns = {
    [1] = {
      [21001] = 21002,
      [21002] = 21003,
      [21003] = 21004,
      [21004] = 21005,
      [21005] = 21006,
      [21006] = 21007,
      [21007] = 21008,
      [21008] = 21009,
      [21009] = 21010,
      [21010] = 21011,
      [21011] = 21001
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
  [21001] = {
    config_id = 21001,
    gadget_id = 70310404,
    pos = {
      x = 441.613,
      y = 612.131,
      z = -1567.812
    },
    rot = {
      x = 0.0,
      y = 359.759,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE
  },
  [21012] = {
    config_id = 21012,
    gadget_id = 70290428,
    pos = {
      x = 467.069,
      y = 612.916,
      z = -1575.341
    },
    rot = {
      x = 0.0,
      y = 113.099,
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
    gadgets = {21001, 21012},
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
