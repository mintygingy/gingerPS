local base_info = {group_id = 220134020}
local defs = {
  patterns = {
    [1] = {
      [20001] = 20002,
      [20002] = 20005,
      [20003] = 20005,
      [20004] = 20002,
      [20005] = 20011,
      [20006] = 20004,
      [20007] = 20006,
      [20008] = 20012,
      [20009] = 20008,
      [20010] = 20005,
      [20011] = 20012,
      [20012] = 20011,
      [20013] = 20011
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
  [20001] = {
    config_id = 20001,
    gadget_id = 70310403,
    pos = {
      x = 560.712,
      y = 614.023,
      z = -1618.558
    },
    rot = {
      x = 0.0,
      y = 353.785,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE
  },
  [20014] = {
    config_id = 20014,
    gadget_id = 70290428,
    pos = {
      x = 532.862,
      y = 612.612,
      z = -1575.209
    },
    rot = {
      x = 0.0,
      y = 66.996,
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
    gadgets = {20001, 20014},
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
