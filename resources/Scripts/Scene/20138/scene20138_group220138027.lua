local base_info = {group_id = 220138027}
monsters = {
  {
    config_id = 27001,
    monster_id = 21010701,
    pos = {
      x = 75.111,
      y = 51.439,
      z = -19.976
    },
    rot = {
      x = 0.0,
      y = 7.577,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 9013
  },
  {
    config_id = 27002,
    monster_id = 21010701,
    pos = {
      x = 71.217,
      y = 51.439,
      z = -21.43
    },
    rot = {
      x = 0.0,
      y = 51.276,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 9013
  },
  {
    config_id = 27003,
    monster_id = 21010201,
    pos = {
      x = 74.364,
      y = 51.436,
      z = -24.078
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  },
  {
    config_id = 27004,
    monster_id = 21010201,
    pos = {
      x = 72.061,
      y = 51.436,
      z = -23.941
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  },
  {
    config_id = 27005,
    monster_id = 21010101,
    pos = {
      x = 74.024,
      y = 49.055,
      z = -41.503
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
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
    monsters = {
      27001,
      27002,
      27003,
      27004,
      27005
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
