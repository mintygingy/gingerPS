local base_info = {group_id = 220165009}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 9001,
    gadget_id = 70710884,
    pos = {
      x = -551.501,
      y = 51.396,
      z = 743.308
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
    gadgets = {9001},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
