local base_info = {group_id = 220139020}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 20001,
    gadget_id = 70211123,
    pos = {
      x = 94.915,
      y = 80.558,
      z = 86.469
    },
    rot = {
      x = 352.98,
      y = 265.953,
      z = 359.346
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
    gadgets = {20001},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
