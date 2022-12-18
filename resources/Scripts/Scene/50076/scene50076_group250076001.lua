local base_info = {group_id = 250076001}
monsters = {
  {
    config_id = 1001,
    monster_id = 21010101,
    pos = {
      x = 39.226,
      y = -23.13,
      z = -13.907
    },
    rot = {
      x = 0.0,
      y = 189.442,
      z = 0.0
    },
    level = 1,
    pose_id = 9012
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
