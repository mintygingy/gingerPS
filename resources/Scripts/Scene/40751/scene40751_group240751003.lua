local base_info = {group_id = 240751003}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 3001,
    gadget_id = 70950009,
    pos = {
      x = 0.12,
      y = 9.141,
      z = -0.594
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3002,
    gadget_id = 70900205,
    pos = {
      x = -3.927,
      y = 7.214,
      z = 6.949
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
    gadgets = {3002},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {3001, 3002},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
