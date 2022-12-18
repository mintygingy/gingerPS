local base_info = {group_id = 220138025}
monsters = {
  {
    config_id = 25001,
    monster_id = 22010301,
    pos = {
      x = -19.738,
      y = 9.186,
      z = -77.997
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
    config_id = 25003,
    monster_id = 21010901,
    pos = {
      x = -28.625,
      y = 9.171,
      z = -78.593
    },
    rot = {
      x = 0.0,
      y = 265.57,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 32
  },
  {
    config_id = 25004,
    monster_id = 21010301,
    pos = {
      x = -17.702,
      y = 9.171,
      z = -76.055
    },
    rot = {
      x = 0.0,
      y = 325.28,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 9003
  },
  {
    config_id = 25005,
    monster_id = 21010301,
    pos = {
      x = -22.348,
      y = 9.171,
      z = -75.988
    },
    rot = {
      x = 0.0,
      y = 25.631,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 9003
  },
  {
    config_id = 25006,
    monster_id = 21010501,
    pos = {
      x = -13.972,
      y = 9.171,
      z = -83.488
    },
    rot = {
      x = 0.0,
      y = 129.514,
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
      25001,
      25003,
      25004,
      25005,
      25006
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
