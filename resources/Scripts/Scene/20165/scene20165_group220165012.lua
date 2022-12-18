local base_info = {group_id = 220165012}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 12001,
    gadget_id = 70310016,
    pos = {
      x = -565.904,
      y = 46.137,
      z = 791.213
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 12002,
    gadget_id = 70310016,
    pos = {
      x = -564.535,
      y = 48.498,
      z = 799.012
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
    gadgets = {12001, 12002},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
