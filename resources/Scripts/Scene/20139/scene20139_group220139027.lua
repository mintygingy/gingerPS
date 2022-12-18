local base_info = {group_id = 220139027}
monsters = {
  {
    config_id = 27002,
    monster_id = 21020201,
    pos = {
      x = 64.131,
      y = 100.56,
      z = 124.078
    },
    rot = {
      x = 0.0,
      y = 338.671,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  },
  {
    config_id = 27003,
    monster_id = 21010201,
    pos = {
      x = 60.046,
      y = 100.56,
      z = 129.002
    },
    rot = {
      x = 0.0,
      y = 22.874,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 9003
  },
  {
    config_id = 27004,
    monster_id = 21010201,
    pos = {
      x = 64.388,
      y = 100.56,
      z = 128.817
    },
    rot = {
      x = 0.0,
      y = 338.596,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 9003
  },
  {
    config_id = 27005,
    monster_id = 21010401,
    pos = {
      x = 53.33,
      y = 101.76,
      z = 129.147
    },
    rot = {
      x = 0.0,
      y = 26.314,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 402
  },
  {
    config_id = 27006,
    monster_id = 22010201,
    pos = {
      x = 61.902,
      y = 100.56,
      z = 126.454
    },
    rot = {
      x = 0.0,
      y = 0.0,
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
      27002,
      27003,
      27004,
      27005,
      27006
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
