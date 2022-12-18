local base_info = {group_id = 220146004}
monsters = {
  {
    config_id = 4001,
    monster_id = 26090101,
    pos = {
      x = 350.497,
      y = 77.635,
      z = 686.336
    },
    rot = {
      x = 0.0,
      y = 357.229,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 102
  },
  {
    config_id = 4002,
    monster_id = 26090101,
    pos = {
      x = 340.24,
      y = 77.914,
      z = 681.817
    },
    rot = {
      x = 0.0,
      y = 276.024,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 102
  }
}
npcs = {}
gadgets = {
  {
    config_id = 4003,
    gadget_id = 70210101,
    pos = {
      x = 339.206,
      y = 78.312,
      z = 681.928
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    drop_tag = "\230\144\156\229\136\174\231\130\185\232\167\163\232\176\156\233\128\154\231\148\168\233\161\187\229\188\165",
    isOneoff = true,
    persistent = true
  },
  {
    config_id = 4004,
    gadget_id = 70210101,
    pos = {
      x = 348.673,
      y = 77.472,
      z = 686.349
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    drop_tag = "\230\144\156\229\136\174\231\130\185\232\167\163\232\176\156\233\128\154\231\148\168\233\161\187\229\188\165",
    isOneoff = true,
    persistent = true
  }
}
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
    monsters = {},
    gadgets = {4003, 4004},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {4001, 4002},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
