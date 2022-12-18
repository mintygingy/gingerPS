local base_info = {group_id = 220134077}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 77001,
    gadget_id = 70710470,
    pos = {
      x = 492.203,
      y = 613.348,
      z = -1598.556
    },
    rot = {
      x = 0.0,
      y = 225.969,
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
    gadgets = {77001},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
