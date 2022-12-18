local base_info = {group_id = 220127012}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 12001,
    gadget_id = 70310004,
    pos = {
      x = 61.008,
      y = 42.01,
      z = 31.159
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
    config_id = 12002,
    gadget_id = 70220065,
    pos = {
      x = 55.552,
      y = 41.961,
      z = 21.611
    },
    rot = {
      x = 0.0,
      y = 354.788,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 12003,
    gadget_id = 70220065,
    pos = {
      x = 53.515,
      y = 42.012,
      z = 22.578
    },
    rot = {
      x = 0.0,
      y = 18.29,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 12004,
    gadget_id = 70220066,
    pos = {
      x = 69.484,
      y = 41.925,
      z = 30.556
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 12005,
    gadget_id = 70310001,
    pos = {
      x = 48.942,
      y = 42.067,
      z = 28.615
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
    config_id = 12006,
    gadget_id = 70310001,
    pos = {
      x = 69.118,
      y = 42.047,
      z = 28.353
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
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
    gadgets = {
      12001,
      12002,
      12003,
      12004,
      12005,
      12006
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
