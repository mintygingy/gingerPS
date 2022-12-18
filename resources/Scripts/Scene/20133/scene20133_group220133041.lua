local base_info = {group_id = 220133041}
local defs = {
  selectID_horizon = 54,
  selectID_vertical = 55,
  horizon_steps = {},
  vertical_steps = {}
}
monsters = {}
npcs = {}
gadgets = {
  [41001] = {
    config_id = 41001,
    gadget_id = 70310170,
    pos = {
      x = -52.081,
      y = 207.859,
      z = 600.555
    },
    rot = {
      x = 338.669,
      y = 228.229,
      z = 7.809
    },
    level = 1,
    persistent = true
  },
  [41002] = {
    config_id = 41002,
    gadget_id = 70310170,
    pos = {
      x = -44.175,
      y = 206.818,
      z = 599.224
    },
    rot = {
      x = 353.571,
      y = 280.604,
      z = 352.971
    },
    level = 1,
    persistent = true
  },
  [41003] = {
    config_id = 41003,
    gadget_id = 70310170,
    pos = {
      x = -60.564,
      y = 212.341,
      z = 592.218
    },
    rot = {
      x = 7.15,
      y = 279.641,
      z = 357.486
    },
    level = 1,
    persistent = true
  },
  [41004] = {
    config_id = 41004,
    gadget_id = 70310170,
    pos = {
      x = -84.059,
      y = 211.458,
      z = 574.378
    },
    rot = {
      x = 342.441,
      y = 189.219,
      z = 338.731
    },
    level = 1,
    persistent = true
  },
  [41005] = {
    config_id = 41005,
    gadget_id = 70310171,
    pos = {
      x = -42.32,
      y = 206.075,
      z = 596.641
    },
    rot = {
      x = 359.45,
      y = 359.017,
      z = 348.996
    },
    level = 1,
    persistent = true,
    interact_id = 64
  },
  [41006] = {
    config_id = 41006,
    gadget_id = 70310170,
    pos = {
      x = -72.203,
      y = 211.044,
      z = 594.554
    },
    rot = {
      x = 352.596,
      y = 182.129,
      z = 359.828
    },
    level = 1,
    persistent = true
  },
  [41007] = {
    config_id = 41007,
    gadget_id = 70310186,
    pos = {
      x = -121.926,
      y = 227.302,
      z = 537.892
    },
    rot = {
      x = 4.229,
      y = 56.534,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  [41008] = {
    config_id = 41008,
    gadget_id = 70211111,
    pos = {
      x = -125.425,
      y = 228.86,
      z = 533.226
    },
    rot = {
      x = 26.496,
      y = 5.431,
      z = 15.516
    },
    level = 16,
    drop_tag = "\232\167\163\232\176\156\228\184\173\231\186\167\231\190\164\229\178\155",
    isOneoff = true,
    persistent = true
  },
  [41009] = {
    config_id = 41009,
    gadget_id = 70211131,
    pos = {
      x = -126.219,
      y = 228.506,
      z = 534.693
    },
    rot = {
      x = 1.149,
      y = 55.404,
      z = 0.0
    },
    level = 16,
    chest_drop_id = 2004500,
    drop_count = 1,
    isOneoff = true,
    persistent = true
  },
  [41010] = {
    config_id = 41010,
    gadget_id = 70211011,
    pos = {
      x = -127.242,
      y = 228.48,
      z = 535.833
    },
    rot = {
      x = 353.219,
      y = 97.849,
      z = 346.498
    },
    level = 16,
    drop_tag = "\230\136\152\230\150\151\228\184\173\231\186\167\231\190\164\229\178\155",
    isOneoff = true,
    persistent = true
  },
  [41011] = {
    config_id = 41011,
    gadget_id = 70310170,
    pos = {
      x = -86.089,
      y = 215.15,
      z = 562.336
    },
    rot = {
      x = 328.87,
      y = 173.759,
      z = 356.856
    },
    level = 1,
    persistent = true
  },
  [41012] = {
    config_id = 41012,
    gadget_id = 70310170,
    pos = {
      x = -94.111,
      y = 221.53,
      z = 548.202
    },
    rot = {
      x = 7.026,
      y = 289.164,
      z = 334.143
    },
    level = 1,
    persistent = true
  },
  [41013] = {
    config_id = 41013,
    gadget_id = 70310170,
    pos = {
      x = -72.127,
      y = 212.533,
      z = 583.137
    },
    rot = {
      x = 4.272,
      y = 233.319,
      z = 345.862
    },
    level = 1,
    persistent = true
  },
  [41014] = {
    config_id = 41014,
    gadget_id = 70310170,
    pos = {
      x = -92.396,
      y = 219.335,
      z = 552.542
    },
    rot = {
      x = 336.347,
      y = 196.297,
      z = 337.398
    },
    level = 1,
    persistent = true
  },
  [41015] = {
    config_id = 41015,
    gadget_id = 70310170,
    pos = {
      x = -113.725,
      y = 223.2,
      z = 547.799
    },
    rot = {
      x = 332.658,
      y = 217.488,
      z = 350.735
    },
    level = 1,
    persistent = true
  },
  [41016] = {
    config_id = 41016,
    gadget_id = 70310170,
    pos = {
      x = -102.236,
      y = 220.537,
      z = 551.378
    },
    rot = {
      x = 346.215,
      y = 252.238,
      z = 329.459
    },
    level = 1,
    persistent = true
  },
  [41017] = {
    config_id = 41017,
    gadget_id = 70310170,
    pos = {
      x = -84.907,
      y = 219.659,
      z = 554.863
    },
    rot = {
      x = 4.486,
      y = 249.847,
      z = 338.032
    },
    level = 1,
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
    gadgets = {
      41001,
      41002,
      41003,
      41004,
      41005,
      41006,
      41007,
      41008,
      41009,
      41010,
      41011,
      41012,
      41013,
      41014,
      41015,
      41016,
      41017
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
require("V2_8/TransferFlower")
