local base_info = {group_id = 220134004}
local defs = {
  patterns = {
    [1] = {
      [4001] = 4002,
      [4002] = 4003,
      [4003] = 4001,
      [4004] = 4002,
      [4005] = 4004,
      [4006] = 4005
    },
    [2] = {
      [4001] = 4003,
      [4002] = 4004,
      [4003] = 4004,
      [4004] = 4006,
      [4005] = 4001,
      [4006] = 4001
    }
  }
}
monsters = {}
npcs = {}
gadgets = {
  [4007] = {
    config_id = 4007,
    gadget_id = 70310279,
    pos = {
      x = 469.542,
      y = 637.78,
      z = -1607.385
    },
    rot = {
      x = 0.0,
      y = 309.993,
      z = 0.0
    },
    level = 1
  },
  [4008] = {
    config_id = 4008,
    gadget_id = 70310274,
    pos = {
      x = 469.811,
      y = 640.479,
      z = -1607.818
    },
    rot = {
      x = 0.0,
      y = 358.101,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  [4009] = {
    config_id = 4009,
    gadget_id = 70310275,
    pos = {
      x = 469.592,
      y = 639.009,
      z = -1607.392
    },
    rot = {
      x = 0.0,
      y = 117.128,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  [4010] = {
    config_id = 4010,
    gadget_id = 70310276,
    pos = {
      x = 469.144,
      y = 642.548,
      z = -1607.029
    },
    rot = {
      x = 0.0,
      y = 115.421,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  [4011] = {
    config_id = 4011,
    gadget_id = 70310277,
    pos = {
      x = 469.86,
      y = 642.28,
      z = -1607.444
    },
    rot = {
      x = 0.0,
      y = 140.145,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  [4012] = {
    config_id = 4012,
    gadget_id = 70310278,
    pos = {
      x = 469.442,
      y = 639.584,
      z = -1607.322
    },
    rot = {
      x = 0.0,
      y = 172.265,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  [4013] = {
    config_id = 4013,
    gadget_id = 70310276,
    pos = {
      x = 469.144,
      y = 642.548,
      z = -1607.029
    },
    rot = {
      x = 0.0,
      y = 115.421,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  [4014] = {
    config_id = 4014,
    gadget_id = 70310273,
    pos = {
      x = 469.523,
      y = 638.792,
      z = -1607.4
    },
    rot = {
      x = 0.0,
      y = 358.176,
      z = 0.0
    },
    level = 1
  },
  [4015] = {
    config_id = 4015,
    gadget_id = 70310280,
    pos = {
      x = 469.475,
      y = 639.256,
      z = -1607.417
    },
    rot = {
      x = 0.0,
      y = 313.275,
      z = 0.0
    },
    level = 1
  }
}
regions = {}
triggers = {}
variables = {}
init_config = {
  suite = 10,
  end_suite = 0,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {4014},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {4008},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {4009},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {4010},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {4011},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {4012},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {4013},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {4007},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {4015},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
require("V2_8/ConstellationPattern")
