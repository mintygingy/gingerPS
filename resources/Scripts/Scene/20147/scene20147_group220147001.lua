local base_info = {group_id = 220147001}
monsters = {
  {
    config_id = 1002,
    monster_id = 26090801,
    pos = {
      x = 707.381,
      y = 57.868,
      z = 335.705
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    pose_id = 102
  },
  {
    config_id = 1003,
    monster_id = 26090801,
    pos = {
      x = 712.573,
      y = 58.179,
      z = 348.757
    },
    rot = {
      x = 0.0,
      y = 181.186,
      z = 0.0
    },
    level = 1,
    pose_id = 102
  },
  {
    config_id = 1004,
    monster_id = 26090901,
    pos = {
      x = 699.653,
      y = 57.974,
      z = 343.689
    },
    rot = {
      x = 0.0,
      y = 91.647,
      z = 0.0
    },
    level = 1,
    pose_id = 102
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
      1002,
      1003,
      1004
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
