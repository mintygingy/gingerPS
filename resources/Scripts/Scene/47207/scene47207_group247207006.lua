local base_info = {group_id = 247207006}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 6001,
    gadget_id = 70220103,
    pos = {
      x = 286.926,
      y = 166.798,
      z = 287.578
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
    gadget_id = 70220103,
    pos = {
      x = 323.033,
      y = 166.886,
      z = 308.161
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
      x = 311.495,
      y = 174.518,
      z = 285.56
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
      x = 304.019,
      y = 167.0,
      z = 299.863
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
      6003,
      6004
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
