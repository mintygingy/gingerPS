local base_info = {group_id = 250079005}
local defs = {
  patterns = {
    [1] = {
      [5001] = 5003,
      [5002] = 5004,
      [5003] = 5004,
      [5004] = 5006,
      [5005] = 5001,
      [5006] = 5001
    },
    [2] = {
      [5001] = 5003,
      [5002] = 5004,
      [5003] = 5004,
      [5004] = 5006,
      [5005] = 5001,
      [5006] = 5001
    }
  }
}
monsters = {}
npcs = {}
gadgets = {
  [5001] = {
    config_id = 5001,
    gadget_id = 70310179,
    pos = {
      x = 470.087,
      y = 620.564,
      z = -1607.486
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [5002] = {
    config_id = 5002,
    gadget_id = 70310179,
    pos = {
      x = 469.92,
      y = 620.552,
      z = -1606.123
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [5003] = {
    config_id = 5003,
    gadget_id = 70310179,
    pos = {
      x = 470.176,
      y = 619.448,
      z = -1606.713
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [5004] = {
    config_id = 5004,
    gadget_id = 70310179,
    pos = {
      x = 471.305,
      y = 617.937,
      z = -1607.522
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [5005] = {
    config_id = 5005,
    gadget_id = 70310179,
    pos = {
      x = 470.312,
      y = 616.77,
      z = -1606.954
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [5006] = {
    config_id = 5006,
    gadget_id = 70310179,
    pos = {
      x = 469.488,
      y = 616.836,
      z = -1605.427
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [5007] = {
    config_id = 5007,
    gadget_id = 70310075,
    pos = {
      x = 470.006,
      y = 612.94,
      z = -1606.616
    },
    rot = {
      x = 0.0,
      y = 60.588,
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
      5001,
      5002,
      5003,
      5004,
      5005,
      5006,
      5007
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
require("V2_8/ConstellationPattern")
