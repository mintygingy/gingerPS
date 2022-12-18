local base_info = {group_id = 247204016}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 16001,
    gadget_id = 70220103,
    pos = {
      x = 243.382,
      y = 164.428,
      z = 339.594
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
      x = 243.326,
      y = 164.417,
      z = 390.003
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
      x = 275.383,
      y = 162.263,
      z = 365.062
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
