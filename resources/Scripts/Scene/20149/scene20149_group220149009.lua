local base_info = {group_id = 220149009}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 9001,
    gadget_id = 71700443,
    pos = {
      x = 486.826,
      y = 130.449,
      z = 391.754
    },
    rot = {
      x = 0.0,
      y = 97.41,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 9002,
    gadget_id = 71700444,
    pos = {
      x = 486.826,
      y = 130.449,
      z = 391.754
    },
    rot = {
      x = 0.0,
      y = 97.41,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 9003,
    gadget_id = 71700446,
    pos = {
      x = 487.87,
      y = 129.65,
      z = 391.797
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
    gadgets = {9001, 9003},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {9002, 9003},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
