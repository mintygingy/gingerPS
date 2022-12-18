local base_info = {group_id = 234736002}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 2001,
    gadget_id = 70900205,
    pos = {
      x = 0.0,
      y = -1.333,
      z = 0.0
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
    config_id = 2002,
    gadget_id = 70900205,
    pos = {
      x = 0.0,
      y = -1.333,
      z = 0.0
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
    gadgets = {2001, 2002},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
