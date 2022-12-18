local base_info = {group_id = 220138033}
monsters = {
  {
    config_id = 33002,
    monster_id = 21010101,
    pos = {
      x = -82.217,
      y = -31.965,
      z = 34.942
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
    config_id = 33005,
    monster_id = 21010101,
    pos = {
      x = -90.534,
      y = -32.066,
      z = 29.89
    },
    rot = {
      x = 0.0,
      y = 334.304,
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
    monsters = {33002, 33005},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
