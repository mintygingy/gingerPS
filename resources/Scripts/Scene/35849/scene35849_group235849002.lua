local base_info = {group_id = 235849002}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 2001,
    gadget_id = 70950011,
    pos = {
      x = 34.973,
      y = 87.223,
      z = 586.558
    },
    rot = {
      x = 0.0,
      y = 7.933,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2002,
    gadget_id = 70950011,
    pos = {
      x = 53.913,
      y = 87.223,
      z = 583.919
    },
    rot = {
      x = 0.0,
      y = 7.933,
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
    gadgets = {2001, 2002},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
