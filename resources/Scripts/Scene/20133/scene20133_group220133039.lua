local base_info = {group_id = 220133039}
monsters = {
  {
    config_id = 39001,
    monster_id = 21010401,
    pos = {
      x = -29.875,
      y = 154.397,
      z = 667.308
    },
    rot = {
      x = 0.0,
      y = 131.501,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    pose_id = 9012
  },
  {
    config_id = 39003,
    monster_id = 21010401,
    pos = {
      x = -30.573,
      y = 153.862,
      z = 664.737
    },
    rot = {
      x = 0.0,
      y = 61.739,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    pose_id = 9012
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
    monsters = {39001, 39003},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
