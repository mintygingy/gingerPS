local base_info = {group_id = 220152001}
monsters = {
  {
    config_id = 1001,
    monster_id = 29070101,
    pos = {
      x = 0.046,
      y = 5.8,
      z = 1.0
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    title_id = 161
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
