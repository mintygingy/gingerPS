local base_info = {group_id = 220149011}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 11001,
    gadget_id = 71700482,
    pos = {
      x = 503.134,
      y = 101.809,
      z = 262.665
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 11002,
    gadget_id = 71700483,
    pos = {
      x = 503.134,
      y = 101.809,
      z = 262.665
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
    gadgets = {11001, 11002},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {11002},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
