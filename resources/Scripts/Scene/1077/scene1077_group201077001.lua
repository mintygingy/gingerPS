local base_info = {group_id = 201077001}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 1001,
    gadget_id = 70710836,
    pos = {
      x = -1.284,
      y = -0.04,
      z = -5.519
    },
    rot = {
      x = 0.0,
      y = 180.153,
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
    gadgets = {1001},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
