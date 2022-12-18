local base_info = {group_id = 235872001}
local defs = {
  gadget_teleport = 1003,
  gadget_bricks = 1002,
  gadget_airWall = 1004,
  isDungeon = 1,
  gadget_envLamp = 1006
}
defs.envWeather = {
  [1] = 10172,
  [2] = 10173,
  [3] = 10174
}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 1001,
    gadget_id = 70290721,
    pos = {
      x = 28.838,
      y = 3.027,
      z = 89.083
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  {
    config_id = 1002,
    gadget_id = 70290705,
    pos = {
      x = 32.39,
      y = 3.938,
      z = 102.552
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
    gadget_id = 70290726,
    pos = {
      x = 29.406,
      y = 2.999,
      z = 89.003
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1004,
    gadget_id = 70290722,
    pos = {
      x = 32.309,
      y = 3.938,
      z = 102.621
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1006,
    gadget_id = 70290666,
    pos = {
      x = 32.0,
      y = 4.0,
      z = 102.0
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
points = {
  {
    config_id = 1005,
    pos = {
      x = 32.173,
      y = 4.0,
      z = 95.0
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    }
  }
}
variables = {}
init_config = {
  suite = 1,
  end_suite = 0,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {1001, 1006},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
require("V3_3/BrickBreaker")
