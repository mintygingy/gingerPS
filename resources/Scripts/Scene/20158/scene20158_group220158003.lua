local base_info = {group_id = 220158003}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 3001,
    gadget_id = 70380334,
    pos = {
      x = 247.18,
      y = 214.53,
      z = 630.95
    },
    rot = {
      x = 0.0,
      y = 34.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  {
    config_id = 3002,
    gadget_id = 70380334,
    pos = {
      x = 247.18,
      y = 214.53,
      z = 630.95
    },
    rot = {
      x = 0.0,
      y = 34.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
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
    gadgets = {3001, 3002},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
