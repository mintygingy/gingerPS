local base_info = {group_id = 220133048}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 48001,
    gadget_id = 70211001,
    pos = {
      x = 2173.504,
      y = 560.321,
      z = 577.735
    },
    rot = {
      x = 0.0,
      y = 66.355,
      z = 0.0
    },
    level = 16,
    drop_tag = "\230\136\152\230\150\151\228\189\142\231\186\167\231\190\164\229\178\155",
    isOneoff = true,
    persistent = true
  },
  {
    config_id = 48002,
    gadget_id = 70690029,
    pos = {
      x = 2158.145,
      y = 532.886,
      z = 545.386
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
    gadgets = {48001, 48002},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
