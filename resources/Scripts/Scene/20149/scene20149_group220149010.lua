local base_info = {group_id = 220149010}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 10001,
    gadget_id = 71700451,
    pos = {
      x = 525.007,
      y = 117.179,
      z = 340.381
    },
    rot = {
      x = 0.0,
      y = 88.9,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 10002,
    gadget_id = 71700456,
    pos = {
      x = 525.007,
      y = 117.179,
      z = 340.381
    },
    rot = {
      x = 0.0,
      y = 88.9,
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
    gadgets = {10001},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {10002},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
