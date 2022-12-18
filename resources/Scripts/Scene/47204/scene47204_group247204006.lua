local base_info = {group_id = 247204006}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 6001,
    gadget_id = 70220103,
    pos = {
      x = 286.588,
      y = 166.643,
      z = 287.771
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
      x = 322.925,
      y = 166.86,
      z = 308.084
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
      x = 302.924,
      y = 172.064,
      z = 283.546
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
      x = 317.404,
      y = 174.301,
      z = 291.178
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6005,
    gadget_id = 70220103,
    pos = {
      x = 310.464,
      y = 174.179,
      z = 285.356
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
