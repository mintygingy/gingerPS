local base_info = {group_id = 220134019}
local defs = {
  patterns = {
    [1] = {
      [19001] = 19003,
      [19002] = 19001,
      [19003] = 19001,
      [19004] = 19003,
      [19005] = 19003,
      [19006] = 19001,
      [19007] = 19006,
      [19008] = 19007,
      [19009] = 19007,
      [19010] = 19006,
      [19011] = 19010,
      [19012] = 19010,
      [19013] = 19001,
      [19014] = 19013,
      [19015] = 19014,
      [19016] = 19001,
      [19017] = 19016
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
  [19001] = {
    config_id = 19001,
    gadget_id = 70310402,
    pos = {
      x = 560.276,
      y = 614.293,
      z = -1618.583
    },
    rot = {
      x = 358.933,
      y = 351.432,
      z = 1.02
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE
  },
  [19018] = {
    config_id = 19018,
    gadget_id = 70290428,
    pos = {
      x = 530.476,
      y = 612.582,
      z = -1607.697
    },
    rot = {
      x = 0.0,
      y = 300.662,
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
    gadgets = {19001, 19018},
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
