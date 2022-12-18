local base_info = {group_id = 201078001}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 1001,
    gadget_id = 70360089,
    pos = {
      x = 7.556,
      y = 1.89,
      z = 0.274
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    room = 1
  },
  {
    config_id = 1002,
    gadget_id = 70360089,
    pos = {
      x = 0.397,
      y = 0.775,
      z = -6.783
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    room = 1
  },
  {
    config_id = 1003,
    gadget_id = 70360089,
    pos = {
      x = -7.641,
      y = 1.767,
      z = -0.821
    },
    rot = {
      x = 0.0,
      y = 0.0,
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
      1003
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
