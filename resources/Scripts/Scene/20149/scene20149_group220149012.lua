local base_info = {group_id = 220149012}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 12001,
    gadget_id = 71700455,
    pos = {
      x = 497.002,
      y = 102.135,
      z = 262.846
    },
    rot = {
      x = 0.0,
      y = 46.45,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 12002,
    gadget_id = 71700455,
    pos = {
      x = 508.276,
      y = 102.008,
      z = 256.335
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
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
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {12001, 12002},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
