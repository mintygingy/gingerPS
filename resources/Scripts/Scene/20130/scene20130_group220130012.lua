local base_info = {group_id = 220130012}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 12001,
    gadget_id = 70800184,
    pos = {
      x = 1.829,
      y = 5.532,
      z = -46.709
    },
    rot = {
      x = 0.0,
      y = 251.769,
      z = 0.0
    },
    level = 1,
    room = 1
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
    gadgets = {12001},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
