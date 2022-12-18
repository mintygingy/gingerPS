local base_info = {group_id = 220138042}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 42001,
    gadget_id = 70360288,
    pos = {
      x = 3.103,
      y = 48.99,
      z = 80.732
    },
    rot = {
      x = 0.0,
      y = 181.741,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearAction1
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
    gadgets = {42001},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
