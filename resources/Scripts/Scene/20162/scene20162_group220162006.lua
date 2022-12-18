local base_info = {group_id = 220162006}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 6001,
    gadget_id = 70710888,
    pos = {
      x = -25.346,
      y = -33.39,
      z = -84.094
    },
    rot = {
      x = 0.0,
      y = 20.471,
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
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {6001},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
