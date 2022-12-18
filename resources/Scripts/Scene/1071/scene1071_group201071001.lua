local base_info = {group_id = 201071001}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 1001,
    gadget_id = 70290137,
    pos = {
      x = -34.18,
      y = -14.495,
      z = -14.472
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1002,
    gadget_id = 70290137,
    pos = {
      x = 166.154,
      y = -9.891,
      z = -19.915
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1003,
    gadget_id = 70290137,
    pos = {
      x = 19.999,
      y = -14.857,
      z = -19.827
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1004,
    gadget_id = 70290137,
    pos = {
      x = 94.83,
      y = -13.817,
      z = -19.997
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1005,
    gadget_id = 70290137,
    pos = {
      x = 136.638,
      y = -9.025,
      z = -19.903
    },
    rot = {
      x = 0.0,
      y = 90.0,
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
      1001,
      1002,
      1003,
      1004,
      1005
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
