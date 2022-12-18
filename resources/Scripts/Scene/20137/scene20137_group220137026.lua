local base_info = {group_id = 220137026}
monsters = {
  {
    config_id = 26001,
    monster_id = 21010901,
    pos = {
      x = 669.821,
      y = 74.009,
      z = -144.09
    },
    rot = {
      x = 0.0,
      y = 286.315,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 32
  },
  {
    config_id = 26002,
    monster_id = 21010901,
    pos = {
      x = 669.946,
      y = 74.009,
      z = -140.038
    },
    rot = {
      x = 0.0,
      y = 247.053,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 32
  },
  {
    config_id = 26003,
    monster_id = 21020201,
    pos = {
      x = 686.728,
      y = 74.031,
      z = -141.774
    },
    rot = {
      x = 0.0,
      y = 264.997,
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
      26002,
      26003
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
