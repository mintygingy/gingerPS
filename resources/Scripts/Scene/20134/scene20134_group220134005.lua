local base_info = {group_id = 220134005}
local defs = {
  patterns = {
    [1] = {
      [5001] = 5002,
      [5002] = 5004,
      [5003] = 5002,
      [5004] = 5005,
      [5005] = 5002,
      [5006] = 5005,
      [5008] = 5004,
      [5009] = 5004,
      [5010] = 5009,
      [5011] = 5009,
      [5012] = 5011,
      [5013] = 5005
    },
    [2] = {
      [5001] = 5003,
      [5002] = 5004,
      [5003] = 5004,
      [5004] = 5006,
      [5005] = 5001,
      [5006] = 5001
    }
  }
}
monsters = {}
npcs = {}
gadgets = {
  [5001] = {
    config_id = 5001,
    gadget_id = 70310401,
    pos = {
      x = 439.8,
      y = 605.225,
      z = -1613.387
    },
    rot = {
      x = 359.989,
      y = 4.565,
      z = 0.08
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE
  },
  [5007] = {
    config_id = 5007,
    gadget_id = 70290428,
    pos = {
      x = 469.139,
      y = 612.298,
      z = -1607.015
    },
    rot = {
      x = 0.0,
      y = 60.102,
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
    gadgets = {5001, 5007},
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
