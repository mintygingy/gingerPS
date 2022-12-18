local base_info = {group_id = 220134066}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 66001,
    gadget_id = 70211001,
    pos = {
      x = 345.778,
      y = 666.096,
      z = -1475.83
    },
    rot = {
      x = 0.0,
      y = 206.794,
      z = 0.0
    },
    level = 16,
    drop_tag = "\230\136\152\230\150\151\228\189\142\231\186\167\231\190\164\229\178\155",
    isOneoff = true,
    persistent = true
  },
  {
    config_id = 66002,
    gadget_id = 70211001,
    pos = {
      x = 356.994,
      y = 651.141,
      z = -1507.864
    },
    rot = {
      x = 0.0,
      y = 294.805,
      z = 0.0
    },
    level = 16,
    drop_tag = "\230\136\152\230\150\151\228\189\142\231\186\167\231\190\164\229\178\155",
    isOneoff = true,
    persistent = true
  },
  {
    config_id = 66003,
    gadget_id = 70211001,
    pos = {
      x = 418.023,
      y = 637.449,
      z = -1534.072
    },
    rot = {
      x = 0.0,
      y = 294.805,
      z = 0.0
    },
    level = 16,
    drop_tag = "\230\136\152\230\150\151\228\189\142\231\186\167\231\190\164\229\178\155",
    isOneoff = true,
    persistent = true
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
      66001,
      66002,
      66003
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
