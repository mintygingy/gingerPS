local base_info = {group_id = 247201017}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 17001,
    gadget_id = 70900201,
    pos = {
      x = 243.351,
      y = 157.85,
      z = 292.208
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 17002,
    gadget_id = 70900201,
    pos = {
      x = 324.518,
      y = 155.581,
      z = 364.991
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 17003,
    gadget_id = 70900201,
    pos = {
      x = 243.289,
      y = 162.661,
      z = 441.907
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
    gadgets = {17001},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {17002},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {17003},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
