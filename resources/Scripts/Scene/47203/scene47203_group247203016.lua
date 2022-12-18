local base_info = {group_id = 247203016}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 16001,
    gadget_id = 70220103,
    pos = {
      x = 243.413,
      y = 164.402,
      z = 390.268
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 16002,
    gadget_id = 70220103,
    pos = {
      x = 243.331,
      y = 164.404,
      z = 339.366
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 16003,
    gadget_id = 70220103,
    pos = {
      x = 275.51,
      y = 162.215,
      z = 364.939
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
      16001,
      16002,
      16003
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
