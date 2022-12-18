local base_info = {group_id = 220139035}
monsters = {
  {
    config_id = 35001,
    monster_id = 21020101,
    pos = {
      x = -23.116,
      y = 84.885,
      z = -42.576
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
    config_id = 35002,
    monster_id = 21010301,
    pos = {
      x = -18.994,
      y = 84.795,
      z = -37.545
    },
    rot = {
      x = 0.0,
      y = 320.372,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  },
  {
    config_id = 35003,
    monster_id = 21010301,
    pos = {
      x = -27.095,
      y = 84.795,
      z = -36.947
    },
    rot = {
      x = 0.0,
      y = 44.968,
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
      35001,
      35002,
      35003
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
