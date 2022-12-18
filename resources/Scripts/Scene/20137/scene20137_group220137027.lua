local base_info = {group_id = 220137027}
monsters = {
  {
    config_id = 27002,
    monster_id = 21010501,
    pos = {
      x = 697.046,
      y = 78.526,
      z = -128.531
    },
    rot = {
      x = 0.0,
      y = 191.331,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 9013
  },
  {
    config_id = 27004,
    monster_id = 21010701,
    pos = {
      x = 695.429,
      y = 78.505,
      z = -126.675
    },
    rot = {
      x = 0.0,
      y = 172.72,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 9013
  }
}
npcs = {}
gadgets = {}
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
    monsters = {27002, 27004},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
