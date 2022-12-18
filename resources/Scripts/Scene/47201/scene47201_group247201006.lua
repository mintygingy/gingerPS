local base_info = {group_id = 247201006}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 6001,
    gadget_id = 70310488,
    pos = {
      x = 280.811,
      y = 160.247,
      z = 289.695
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6002,
    gadget_id = 70310488,
    pos = {
      x = 324.971,
      y = 158.484,
      z = 312.794
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6003,
    gadget_id = 70220103,
    pos = {
      x = 310.276,
      y = 173.161,
      z = 286.902
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6004,
    gadget_id = 70220103,
    pos = {
      x = 318.247,
      y = 174.301,
      z = 292.529
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
    gadgets = {
      6001,
      6002,
      6003
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
