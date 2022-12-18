local base_info = {group_id = 220149006}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 6001,
    gadget_id = 71700446,
    pos = {
      x = 493.902,
      y = 131.543,
      z = 406.696
    },
    rot = {
      x = 0.0,
      y = 327.74,
      z = 312.34
    },
    level = 1
  },
  {
    config_id = 6002,
    gadget_id = 70310148,
    pos = {
      x = 492.492,
      y = 130.752,
      z = 408.802
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
    gadgets = {6001},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {6001, 6002},
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
