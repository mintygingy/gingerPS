local base_info = {group_id = 220139033}
monsters = {
  {
    config_id = 33004,
    monster_id = 22010201,
    pos = {
      x = -23.011,
      y = 84.976,
      z = 63.092
    },
    rot = {
      x = 0.0,
      y = 157.277,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  },
  {
    config_id = 33005,
    monster_id = 21010301,
    pos = {
      x = -20.82,
      y = 84.908,
      z = 62.217
    },
    rot = {
      x = 0.0,
      y = 212.135,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 9003
  },
  {
    config_id = 33007,
    monster_id = 21010201,
    pos = {
      x = -24.875,
      y = 84.908,
      z = 63.11
    },
    rot = {
      x = 0.0,
      y = 155.922,
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
      33004,
      33005,
      33007
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
