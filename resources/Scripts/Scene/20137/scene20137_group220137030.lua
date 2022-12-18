local base_info = {group_id = 220137030}
monsters = {
  {
    config_id = 30001,
    monster_id = 21020101,
    pos = {
      x = 741.089,
      y = 86.249,
      z = -143.02
    },
    rot = {
      x = 0.0,
      y = 70.995,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 401
  },
  {
    config_id = 30002,
    monster_id = 21010201,
    pos = {
      x = 741.545,
      y = 86.249,
      z = -140.754
    },
    rot = {
      x = 0.0,
      y = 93.913,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 9003
  },
  {
    config_id = 30003,
    monster_id = 21010201,
    pos = {
      x = 742.285,
      y = 86.249,
      z = -151.239
    },
    rot = {
      x = 0.0,
      y = 134.16,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 9011
  },
  {
    config_id = 30005,
    monster_id = 21010601,
    pos = {
      x = 738.21,
      y = 86.249,
      z = -138.356
    },
    rot = {
      x = 0.0,
      y = 107.737,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
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
    monsters = {
      30001,
      30002,
      30003,
      30005
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
