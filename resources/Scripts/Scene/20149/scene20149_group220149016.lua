local base_info = {group_id = 220149016}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 16001,
    gadget_id = 71700408,
    pos = {
      x = 523.066,
      y = 116.644,
      z = 329.169
    },
    rot = {
      x = 37.1,
      y = 288.8,
      z = 290.3
    },
    level = 1
  },
  {
    config_id = 16002,
    gadget_id = 71700409,
    pos = {
      x = 522.378,
      y = 116.605,
      z = 329.197
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 300.38
    },
    level = 1
  },
  {
    config_id = 16003,
    gadget_id = 71700409,
    pos = {
      x = 523.578,
      y = 116.657,
      z = 329.17
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 181.37
    },
    level = 1
  },
  {
    config_id = 16004,
    gadget_id = 71700409,
    pos = {
      x = 519.677,
      y = 116.629,
      z = 329.173
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 181.37
    },
    level = 1
  },
  {
    config_id = 16005,
    gadget_id = 71700409,
    pos = {
      x = 520.101,
      y = 116.696,
      z = 329.338
    },
    rot = {
      x = 325.5,
      y = 193.6,
      z = 238.1
    },
    level = 1
  },
  {
    config_id = 16007,
    gadget_id = 71700410,
    pos = {
      x = 519.736,
      y = 116.61,
      z = 329.154
    },
    rot = {
      x = 0.0,
      y = 67.8,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 16008,
    gadget_id = 71700410,
    pos = {
      x = 519.65,
      y = 116.568,
      z = 328.66
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 16009,
    gadget_id = 71700410,
    pos = {
      x = 520.645,
      y = 116.568,
      z = 329.872
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 16010,
    gadget_id = 71700410,
    pos = {
      x = 523.167,
      y = 116.571,
      z = 330.283
    },
    rot = {
      x = 0.0,
      y = 168.1,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 16011,
    gadget_id = 71700410,
    pos = {
      x = 521.988,
      y = 116.571,
      z = 328.605
    },
    rot = {
      x = 0.0,
      y = 17.35,
      z = 1.81
    },
    level = 1
  }
}
regions = {}
triggers = {}
variables = {}
init_config = {
  suite = 1,
  end_suite = 2,
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
      16001,
      16002,
      16003,
      16004,
      16005,
      16007,
      16008,
      16009,
      16010,
      16011
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      16003,
      16004,
      16007,
      16009,
      16010
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
