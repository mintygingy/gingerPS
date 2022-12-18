local base_info = {group_id = 220133049}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 49001,
    gadget_id = 71700380,
    pos = {
      x = 401.81,
      y = 145.101,
      z = 1976.727
    },
    rot = {
      x = 300.0,
      y = 149.157,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 49002,
    gadget_id = 71700381,
    pos = {
      x = 401.722,
      y = 145.076,
      z = 1976.729
    },
    rot = {
      x = 270.0,
      y = 149.157,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 49003,
    gadget_id = 71700381,
    pos = {
      x = 401.568,
      y = 145.073,
      z = 1976.696
    },
    rot = {
      x = 270.0,
      y = 135.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 49004,
    gadget_id = 71700382,
    pos = {
      x = 401.189,
      y = 145.078,
      z = 1976.814
    },
    rot = {
      x = 0.0,
      y = 149.157,
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
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      49001,
      49002,
      49003,
      49004
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
