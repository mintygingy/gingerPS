local base_info = {group_id = 201076003}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 3001,
    gadget_id = 70710896,
    pos = {
      x = 20.652,
      y = 0.79,
      z = 11.979
    },
    rot = {
      x = 0.0,
      y = 90.001,
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
    gadgets = {3001},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
