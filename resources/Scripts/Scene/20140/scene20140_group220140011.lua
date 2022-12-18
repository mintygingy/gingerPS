local base_info = {group_id = 220140011}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 11001,
    gadget_id = 71700394,
    pos = {
      x = 74.228,
      y = 135.292,
      z = 1032.497
    },
    rot = {
      x = 0.0,
      y = 349.29,
      z = 0.0
    },
    level = 1
  }
}
regions = {}
triggers = {}
variables = {
  {
    config_id = 1,
    name = "reminder1",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 2,
    name = "reminder2",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 3,
    name = "reminder3",
    value = 0,
    no_refresh = true
  }
}
init_config = {
  suite = 1,
  end_suite = 0,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {11001},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
