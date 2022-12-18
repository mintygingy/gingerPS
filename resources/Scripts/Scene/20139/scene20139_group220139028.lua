local base_info = {group_id = 220139028}
monsters = {
  {
    config_id = 28001,
    monster_id = 22010201,
    pos = {
      x = 45.4,
      y = 97.83,
      z = -91.957
    },
    rot = {
      x = 0.0,
      y = 158.132,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  },
  {
    config_id = 28002,
    monster_id = 21020101,
    pos = {
      x = 42.602,
      y = 97.83,
      z = -93.859
    },
    rot = {
      x = 0.0,
      y = 104.333,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 401
  },
  {
    config_id = 28003,
    monster_id = 21010701,
    pos = {
      x = 50.334,
      y = 97.83,
      z = -106.436
    },
    rot = {
      x = 0.0,
      y = 186.82,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  },
  {
    config_id = 28004,
    monster_id = 21010701,
    pos = {
      x = 42.524,
      y = 99.578,
      z = -105.046
    },
    rot = {
      x = 0.0,
      y = 91.839,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  },
  {
    config_id = 28006,
    monster_id = 21010501,
    pos = {
      x = 40.984,
      y = 104.834,
      z = -93.056
    },
    rot = {
      x = 0.0,
      y = 99.619,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 32
  },
  {
    config_id = 28007,
    monster_id = 21010901,
    pos = {
      x = 59.49,
      y = 104.834,
      z = -97.154
    },
    rot = {
      x = 0.0,
      y = 256.711,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 32
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
      28001,
      28002,
      28003,
      28004,
      28006,
      28007
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
