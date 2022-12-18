local base_info = {group_id = 201060009}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 9001,
    gadget_id = 70710787,
    pos = {
      x = -3.836,
      y = -0.102,
      z = -9.912
    },
    rot = {
      x = 0.0,
      y = 49.146,
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
    gadgets = {9001},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
