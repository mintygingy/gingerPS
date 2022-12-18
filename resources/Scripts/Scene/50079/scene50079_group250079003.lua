local base_info = {group_id = 250079003}
local defs = {
  patterns = {
    [1] = {
      [3001] = 3006,
      [3002] = 3006,
      [3003] = 3002,
      [3004] = 3002,
      [3005] = 3004,
      [3006] = 3004
    },
    [2] = {
      [35001] = 35003,
      [35002] = 35004,
      [35003] = 35004,
      [35004] = 35006,
      [35005] = 35001,
      [35006] = 35001
    }
  }
}
monsters = {}
npcs = {}
gadgets = {
  [3001] = {
    config_id = 3001,
    gadget_id = 70310179,
    pos = {
      x = 386.569,
      y = 665.0,
      z = -1650.253
    },
    rot = {
      x = 0.0,
      y = 15.407,
      z = 0.0
    },
    level = 1
  },
  [3002] = {
    config_id = 3002,
    gadget_id = 70310179,
    pos = {
      x = 392.735,
      y = 665.0,
      z = -1651.243
    },
    rot = {
      x = 0.0,
      y = 15.407,
      z = 0.0
    },
    level = 1
  },
  [3003] = {
    config_id = 3003,
    gadget_id = 70310179,
    pos = {
      x = 398.209,
      y = 665.0,
      z = -1653.881
    },
    rot = {
      x = 0.0,
      y = 15.407,
      z = 0.0
    },
    level = 1
  },
  [3004] = {
    config_id = 3004,
    gadget_id = 70310179,
    pos = {
      x = 389.379,
      y = 665.0,
      z = -1645.08
    },
    rot = {
      x = 0.0,
      y = 15.407,
      z = 0.0
    },
    level = 1
  },
  [3005] = {
    config_id = 3005,
    gadget_id = 70310179,
    pos = {
      x = 389.758,
      y = 665.0,
      z = -1640.41
    },
    rot = {
      x = 0.0,
      y = 15.407,
      z = 0.0
    },
    level = 1
  },
  [3006] = {
    config_id = 3006,
    gadget_id = 70310179,
    pos = {
      x = 404.26,
      y = 665.0,
      z = -1640.533
    },
    rot = {
      x = 0.0,
      y = 15.407,
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
      3001,
      3002,
      3003,
      3004,
      3005,
      3006
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
require("V2_8/ConstellationPattern")
