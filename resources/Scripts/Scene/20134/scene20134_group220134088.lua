local base_info = {group_id = 220134088}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 88001,
    shape = RegionShape.CUBIC,
    size = {
      x = 100.0,
      y = 100.0,
      z = 100.0
    },
    pos = {
      x = 378.991,
      y = 616.472,
      z = -1526.747
    },
    vision_type_list = {201340001}
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
    regions = {88001},
    triggers = {},
    rand_weight = 100
  }
}
