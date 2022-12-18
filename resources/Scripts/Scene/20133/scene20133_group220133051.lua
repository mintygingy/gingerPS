local base_info = {group_id = 220133051}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 51001,
    gadget_id = 70290356,
    pos = {
      x = 1066.916,
      y = -388.466,
      z = 2106.01
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 51002,
    gadget_id = 70290356,
    pos = {
      x = 1072.13,
      y = -388.474,
      z = 2111.352
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 51004,
    gadget_id = 70290439,
    pos = {
      x = 1061.845,
      y = -388.466,
      z = 2116.708
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {
  {
    config_id = 51003,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 1067.238,
      y = -388.461,
      z = 2106.022
    }
  }
}
triggers = {
  {
    config_id = 1051003,
    name = "ENTER_REGION_51003",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "",
    action = ""
  }
}
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
      51001,
      51002,
      51004
    },
    regions = {51003},
    triggers = {
      "ENTER_REGION_51003"
    },
    rand_weight = 100
  }
}
