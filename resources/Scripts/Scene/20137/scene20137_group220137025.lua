local base_info = {group_id = 220137025}
monsters = {
  {
    config_id = 25002,
    monster_id = 21010401,
    pos = {
      x = 579.946,
      y = 74.089,
      z = -149.904
    },
    rot = {
      x = 0.0,
      y = 328.899,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 402
  },
  {
    config_id = 25004,
    monster_id = 21010201,
    pos = {
      x = 574.191,
      y = 74.09,
      z = -160.341
    },
    rot = {
      x = 0.0,
      y = 285.317,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 9013
  },
  {
    config_id = 25005,
    monster_id = 21010201,
    pos = {
      x = 571.676,
      y = 74.092,
      z = -159.562
    },
    rot = {
      x = 0.0,
      y = 92.671,
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
    monsters = {
      25002,
      25004,
      25005
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
