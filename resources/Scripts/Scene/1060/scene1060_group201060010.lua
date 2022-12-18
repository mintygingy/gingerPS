local base_info = {group_id = 201060010}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 10001,
    gadget_id = 70710766,
    pos = {
      x = 1.952,
      y = 0.286,
      z = -6.746
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    room = 1
  },
  {
    config_id = 10002,
    gadget_id = 70900394,
    pos = {
      x = 2.28,
      y = 0.173,
      z = -7.56
    },
    rot = {
      x = 272.493,
      y = 44.213,
      z = 43.442
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
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {10001, 10002},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
