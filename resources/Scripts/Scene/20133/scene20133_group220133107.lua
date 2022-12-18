local base_info = {group_id = 220133107}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 107001,
    gadget_id = 70310492,
    pos = {
      x = 2182.11,
      y = 564.45,
      z = 583.84
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE
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
    gadgets = {107001},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
