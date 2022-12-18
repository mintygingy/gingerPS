local base_info = {group_id = 220139021}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 21001,
    gadget_id = 70211123,
    pos = {
      x = 73.499,
      y = 38.631,
      z = -64.717
    },
    rot = {
      x = 0.0,
      y = 0.0,
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
    gadgets = {21001},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
