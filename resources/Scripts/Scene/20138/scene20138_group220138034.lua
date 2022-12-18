local base_info = {group_id = 220138034}
monsters = {
  {
    config_id = 34001,
    monster_id = 21010101,
    pos = {
      x = 15.6,
      y = 25.36,
      z = 0.577
    },
    rot = {
      x = 0.0,
      y = 298.877,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 9003
  },
  {
    config_id = 34002,
    monster_id = 21010601,
    pos = {
      x = 15.612,
      y = 25.36,
      z = 4.111
    },
    rot = {
      x = 0.0,
      y = 255.435,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 9011
  },
  {
    config_id = 34003,
    monster_id = 21010301,
    pos = {
      x = 25.269,
      y = 25.36,
      z = -2.492
    },
    rot = {
      x = 0.0,
      y = 7.352,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 9002
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
      34001,
      34002,
      34003
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
