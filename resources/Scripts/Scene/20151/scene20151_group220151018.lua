local base_info = {group_id = 220151018}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 18001,
    gadget_id = 70900201,
    pos = {
      x = 623.033,
      y = 74.944,
      z = 498.125
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
    gadgets = {18001},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
