local base_info = {group_id = 220138023}
monsters = {
  {
    config_id = 23001,
    monster_id = 21020201,
    pos = {
      x = -48.817,
      y = -21.762,
      z = 8.602
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
    config_id = 23002,
    monster_id = 21010301,
    pos = {
      x = -47.675,
      y = -21.76,
      z = 11.344
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
    config_id = 23003,
    monster_id = 21010301,
    pos = {
      x = -50.515,
      y = -21.759,
      z = 11.093
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
    config_id = 23005,
    monster_id = 21010401,
    pos = {
      x = -48.33,
      y = -21.765,
      z = -45.938
    },
    rot = {
      x = 0.0,
      y = 357.436,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 402
  },
  {
    config_id = 23006,
    monster_id = 21010401,
    pos = {
      x = -61.766,
      y = -21.734,
      z = -34.379
    },
    rot = {
      x = 0.0,
      y = 207.194,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 402
  },
  {
    config_id = 23007,
    monster_id = 21010501,
    pos = {
      x = -61.173,
      y = -21.734,
      z = -37.976
    },
    rot = {
      x = 0.0,
      y = 269.107,
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
      23001,
      23002,
      23003,
      23005,
      23006,
      23007
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
