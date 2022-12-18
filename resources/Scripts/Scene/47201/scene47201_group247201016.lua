local base_info = {group_id = 247201016}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 16001,
    gadget_id = 70220103,
    pos = {
      x = 243.705,
      y = 164.433,
      z = 339.343
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
      x = 243.364,
      y = 164.42,
      z = 390.102
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
      x = 275.675,
      y = 162.252,
      z = 365.041
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
