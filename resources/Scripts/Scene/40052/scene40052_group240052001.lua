local base_info = {group_id = 240052001}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 1001,
    gadget_id = 70210101,
    pos = {
      x = 701.74,
      y = 74.809,
      z = 354.965
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
    config_id = 1002,
    gadget_id = 70290578,
    pos = {
      x = 711.128,
      y = 57.869,
      z = 343.653
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1003,
    gadget_id = 70210101,
    pos = {
      x = 691.93,
      y = 75.745,
      z = 341.439
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
    config_id = 1004,
    gadget_id = 70290578,
    pos = {
      x = 733.986,
      y = 71.564,
      z = 343.955
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1005,
    gadget_id = 70290542,
    pos = {
      x = 735.887,
      y = 83.29,
      z = 347.693
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
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
    gadgets = {
      1001,
      1002,
      1003,
      1004,
      1005
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
