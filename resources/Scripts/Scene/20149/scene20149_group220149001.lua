local base_info = {group_id = 220149001}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 1001,
    gadget_id = 71700448,
    pos = {
      x = 503.045,
      y = 101.866,
      z = 262.781
    },
    rot = {
      x = 0.0,
      y = 15.3,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1004,
    gadget_id = 71700449,
    pos = {
      x = 503.045,
      y = 101.866,
      z = 262.781
    },
    rot = {
      x = 0.0,
      y = 15.3,
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
    gadgets = {1001},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {1004},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
