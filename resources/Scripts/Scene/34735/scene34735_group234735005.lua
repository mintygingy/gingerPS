local base_info = {group_id = 234735005}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 5001,
    gadget_id = 70900205,
    pos = {
      x = 0.08,
      y = -1.197,
      z = 24.15
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  {
    config_id = 5002,
    gadget_id = 70900205,
    pos = {
      x = 0.04,
      y = -1.197,
      z = -23.74
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
variables = {
  {
    config_id = 1,
    name = "stage",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 2,
    name = "TPL_TIME",
    value = 0,
    no_refresh = false
  }
}
init_config = {
  suite = 1,
  end_suite = 0,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {5001, 5002},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
