local base_info = {group_id = 220138024}
monsters = {
  {
    config_id = 24001,
    monster_id = 21010901,
    pos = {
      x = -1.413,
      y = -6.238,
      z = -9.21
    },
    rot = {
      x = 0.0,
      y = 100.979,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 32
  },
  {
    config_id = 24004,
    monster_id = 21010901,
    pos = {
      x = 19.144,
      y = -16.845,
      z = -13.841
    },
    rot = {
      x = 0.0,
      y = 239.683,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 32
  },
  {
    config_id = 24006,
    monster_id = 21010401,
    pos = {
      x = -14.432,
      y = -0.48,
      z = -0.038
    },
    rot = {
      x = 0.0,
      y = 143.514,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 402
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
      24001,
      24004,
      24006
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
