local base_info = {group_id = 220138026}
monsters = {
  {
    config_id = 26001,
    monster_id = 21020101,
    pos = {
      x = 78.234,
      y = 25.33,
      z = -34.324
    },
    rot = {
      x = 0.0,
      y = 37.492,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 401
  },
  {
    config_id = 26003,
    monster_id = 21010101,
    pos = {
      x = 67.098,
      y = 25.416,
      z = -47.019
    },
    rot = {
      x = 0.0,
      y = 73.229,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 9003
  },
  {
    config_id = 26004,
    monster_id = 21010401,
    pos = {
      x = 83.73,
      y = 25.33,
      z = -54.217
    },
    rot = {
      x = 0.0,
      y = 11.884,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 9003
  },
  {
    config_id = 26005,
    monster_id = 21010401,
    pos = {
      x = 85.461,
      y = 25.33,
      z = -50.224
    },
    rot = {
      x = 0.0,
      y = 172.5,
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
      26001,
      26003,
      26004,
      26005
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
