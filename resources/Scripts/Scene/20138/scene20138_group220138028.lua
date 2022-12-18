local base_info = {group_id = 220138028}
monsters = {
  {
    config_id = 28004,
    monster_id = 21010301,
    pos = {
      x = 60.736,
      y = 51.555,
      z = 12.982
    },
    rot = {
      x = 0.0,
      y = 261.55,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  },
  {
    config_id = 28005,
    monster_id = 21020101,
    pos = {
      x = 69.274,
      y = 49.077,
      z = 2.608
    },
    rot = {
      x = 0.0,
      y = 32.126,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 401
  },
  {
    config_id = 28006,
    monster_id = 22010101,
    pos = {
      x = 72.481,
      y = 49.077,
      z = 4.966
    },
    rot = {
      x = 0.0,
      y = 251.917,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
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
      28004,
      28005,
      28006
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
