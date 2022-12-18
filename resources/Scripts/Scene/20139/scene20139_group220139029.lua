local base_info = {group_id = 220139029}
monsters = {
  {
    config_id = 29001,
    monster_id = 21010901,
    pos = {
      x = -30.521,
      y = 40.469,
      z = 10.505
    },
    rot = {
      x = 0.0,
      y = 100.023,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 32
  },
  {
    config_id = 29002,
    monster_id = 21010901,
    pos = {
      x = -11.465,
      y = 45.916,
      z = 27.89
    },
    rot = {
      x = 0.0,
      y = 221.432,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 32
  },
  {
    config_id = 29003,
    monster_id = 21010501,
    pos = {
      x = -30.705,
      y = 47.044,
      z = 35.875
    },
    rot = {
      x = 0.0,
      y = 140.899,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 32
  },
  {
    config_id = 29004,
    monster_id = 21010501,
    pos = {
      x = -17.348,
      y = 43.494,
      z = 7.509
    },
    rot = {
      x = 0.0,
      y = 278.06,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 32
  },
  {
    config_id = 29005,
    monster_id = 21010301,
    pos = {
      x = -32.38,
      y = 40.546,
      z = 3.763
    },
    rot = {
      x = 0.0,
      y = 180.464,
      z = 0.0
    },
    level = 1,
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
      29001,
      29002,
      29003,
      29004,
      29005
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
