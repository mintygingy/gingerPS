local base_info = {group_id = 201072001}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 1001,
    gadget_id = 71700425,
    pos = {
      x = -6.718,
      y = 1.532,
      z = 2.671
    },
    rot = {
      x = 0.0,
      y = 347.413,
      z = 0.0
    },
    level = 1,
    room = 1
  },
  {
    config_id = 1002,
    gadget_id = 71700424,
    pos = {
      x = -7.195,
      y = 1.532,
      z = 2.841
    },
    rot = {
      x = 0.0,
      y = 100.336,
      z = 0.0
    },
    level = 1,
    room = 1
  },
  {
    config_id = 1003,
    gadget_id = 71700423,
    pos = {
      x = -7.159,
      y = 1.532,
      z = 2.374
    },
    rot = {
      x = 0.0,
      y = 347.413,
      z = 0.0
    },
    level = 1,
    room = 1
  },
  {
    config_id = 1005,
    gadget_id = 71700427,
    pos = {
      x = -6.715,
      y = 1.532,
      z = 2.182
    },
    rot = {
      x = 0.0,
      y = 332.32,
      z = 0.0
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
    gadgets = {
      1001,
      1002,
      1003,
      1005
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
