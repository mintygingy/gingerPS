local base_info = {group_id = 220133045}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 45005,
    gadget_id = 70310290,
    pos = {
      x = 384.971,
      y = 140.128,
      z = 2005.129
    },
    rot = {
      x = 0.0,
      y = 330.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {
  {
    config_id = 45001,
    shape = RegionShape.SPHERE,
    radius = 25,
    pos = {
      x = 384.971,
      y = 140.128,
      z = 2005.129
    }
  }
}
triggers = {
  {
    config_id = 1045001,
    name = "ENTER_REGION_45001",
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
    gadgets = {},
    regions = {45001},
    triggers = {
      "ENTER_REGION_45001"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {45005},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
