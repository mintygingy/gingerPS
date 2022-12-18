local base_info = {group_id = 220132010}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 10001,
    gadget_id = 70900201,
    pos = {
      x = 429.08,
      y = 52.205,
      z = 473.674
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 10002,
    gadget_id = 70360001,
    pos = {
      x = 428.755,
      y = 50.313,
      z = 474.07
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
    gadgets = {10002},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {10001},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
