local base_info = {group_id = 220137018}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 18001,
    gadget_id = 70211121,
    pos = {
      x = 728.195,
      y = 72.369,
      z = -141.011
    },
    rot = {
      x = 0.0,
      y = 89.223,
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
    gadgets = {18001},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
