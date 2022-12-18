local base_info = {group_id = 220153001}
monsters = {
  {
    config_id = 1001,
    monster_id = 29070102,
    pos = {
      x = 0.0,
      y = -58.1,
      z = -30.0
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    title_id = 162
  }
}
npcs = {}
gadgets = {}
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
    monsters = {1001},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
