local base_info = {group_id = 233737004}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 4006,
    gadget_id = 70900205,
    pos = {
      x = 6.22,
      y = -1.157,
      z = 3.111
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
variables = {
  {
    config_id = 1,
    name = "monster_wave",
    value = 0,
    no_refresh = false
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
    gadgets = {4006},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {4006},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {4006},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {4006},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
