local base_info = {group_id = 251006002}
monsters = {
  {
    config_id = 2001,
    monster_id = 21010501,
    pos = {
      x = 30.273,
      y = 6.065,
      z = 54.581
    },
    rot = {
      x = 0.0,
      y = 89.083,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 2002,
    monster_id = 21010501,
    pos = {
      x = 18.293,
      y = 8.287,
      z = 43.182
    },
    rot = {
      x = 0.0,
      y = 53.342,
      z = 0.0
    },
    level = 1,
    disableWander = true
  }
}
npcs = {}
gadgets = {
  {
    config_id = 2003,
    gadget_id = 70211001,
    pos = {
      x = 12.583,
      y = 0.5,
      z = 57.294
    },
    rot = {
      x = 0.0,
      y = 180.272,
      z = 0.0
    },
    level = 1,
    drop_tag = "\230\136\152\230\150\151\228\189\142\231\186\167\231\168\187\229\166\187",
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
    monsters = {2001, 2002},
    gadgets = {2003},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
