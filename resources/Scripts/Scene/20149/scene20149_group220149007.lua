local base_info = {group_id = 220149007}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 7001,
    gadget_id = 70310148,
    pos = {
      x = 454.683,
      y = 137.579,
      z = 402.691
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 7002,
    gadget_id = 71700446,
    pos = {
      x = 452.766,
      y = 138.384,
      z = 404.462
    },
    rot = {
      x = 0.0,
      y = 56.0,
      z = 304.05
    },
    level = 1
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
    gadgets = {7002},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {7001, 7002},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
