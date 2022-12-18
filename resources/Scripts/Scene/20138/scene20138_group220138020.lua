local base_info = {group_id = 220138020}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 20001,
    gadget_id = 70211123,
    pos = {
      x = -49.014,
      y = -33.232,
      z = -27.966
    },
    rot = {
      x = 0.0,
      y = 271.409,
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
    gadgets = {20001},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
