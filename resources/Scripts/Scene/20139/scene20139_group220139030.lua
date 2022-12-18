local base_info = {group_id = 220139030}
monsters = {
  {
    config_id = 30001,
    monster_id = 21010401,
    pos = {
      x = -61.11,
      y = 89.605,
      z = -119.55
    },
    rot = {
      x = 0.0,
      y = 236.297,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 402
  },
  {
    config_id = 30003,
    monster_id = 21010601,
    pos = {
      x = -75.0,
      y = 87.596,
      z = -80.636
    },
    rot = {
      x = 0.0,
      y = 94.508,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  },
  {
    config_id = 30004,
    monster_id = 21010901,
    pos = {
      x = -97.783,
      y = 89.89,
      z = -78.389
    },
    rot = {
      x = 0.0,
      y = 118.415,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 32
  },
  {
    config_id = 30005,
    monster_id = 21010901,
    pos = {
      x = -27.611,
      y = 88.37,
      z = -120.707
    },
    rot = {
      x = 0.0,
      y = 30.076,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 32
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
      30001,
      30003,
      30004,
      30005
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
