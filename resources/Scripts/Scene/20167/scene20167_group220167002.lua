local base_info = {group_id = 220167002}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 2001,
    gadget_id = 70290872,
    pos = {
      x = -0.39,
      y = -1.22,
      z = -0.19
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2002,
    gadget_id = 70290873,
    pos = {
      x = -0.39,
      y = -0.27,
      z = -4.69
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
    gadgets = {2001},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {2002},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
