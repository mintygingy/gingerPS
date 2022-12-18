local base_info = {group_id = 220138032}
monsters = {
  {
    config_id = 32004,
    monster_id = 21010901,
    pos = {
      x = 30.542,
      y = 4.295,
      z = -56.193
    },
    rot = {
      x = 0.0,
      y = 165.835,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 32
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
    monsters = {32004},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
