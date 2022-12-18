local base_info = {group_id = 220165008}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 8001,
    gadget_id = 71700554,
    pos = {
      x = -562.73,
      y = 22.6,
      z = 190.988
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
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {8001},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
