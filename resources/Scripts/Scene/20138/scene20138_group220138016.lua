local base_info = {group_id = 220138016}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 16001,
    gadget_id = 70211123,
    pos = {
      x = 90.259,
      y = 51.745,
      z = -55.458
    },
    rot = {
      x = 0.0,
      y = 270.404,
      z = 0.0
    },
    level = 16,
    chest_drop_id = 1050208,
    drop_count = 1,
    isOneoff = true,
    persistent = true,
    autopick = true
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
    gadgets = {16001},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
