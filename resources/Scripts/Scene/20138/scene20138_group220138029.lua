local base_info = {group_id = 220138029}
monsters = {
  {
    config_id = 29001,
    monster_id = 21010301,
    pos = {
      x = 5.825,
      y = 49.096,
      z = 24.802
    },
    rot = {
      x = 0.0,
      y = 208.052,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  },
  {
    config_id = 29002,
    monster_id = 21010301,
    pos = {
      x = 1.044,
      y = 49.096,
      z = 28.833
    },
    rot = {
      x = 0.0,
      y = 169.064,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  },
  {
    config_id = 29003,
    monster_id = 21010501,
    pos = {
      x = 5.765,
      y = 49.096,
      z = 33.973
    },
    rot = {
      x = 0.0,
      y = 220.702,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 9003
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
      29003
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
