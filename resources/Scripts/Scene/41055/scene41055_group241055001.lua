local base_info = {group_id = 241055001}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 1001,
    gadget_id = 70950010,
    pos = {
      x = -0.286,
      y = 0.034,
      z = 23.197
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
    config_id = 1002,
    gadget_id = 70950011,
    pos = {
      x = -0.032,
      y = 0.384,
      z = -23.239
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
    config_id = 1003,
    gadget_id = 70900205,
    pos = {
      x = 10.659,
      y = -2.996,
      z = -0.654
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
    gadgets = {
      1001,
      1002,
      1003
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
