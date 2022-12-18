local base_info = {group_id = 220148005}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 5001,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 527.459,
      y = 81.448,
      z = 491.053
    }
  }
}
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
    regions = {5001},
    triggers = {},
    rand_weight = 100
  }
}
