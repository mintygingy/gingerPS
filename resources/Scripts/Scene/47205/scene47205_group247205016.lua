local base_info = {group_id = 247205016}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 16001,
    gadget_id = 70220103,
    pos = {
      x = 243.303,
      y = 164.419,
      z = 390.195
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
      x = 243.359,
      y = 164.435,
      z = 339.495
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
      x = 275.446,
      y = 162.263,
      z = 365.0
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
