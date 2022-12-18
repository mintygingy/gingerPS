local base_info = {group_id = 250074002}
monsters = {
  {
    config_id = 2001,
    monster_id = 21020201,
    pos = {
      x = -540.404,
      y = 7.038,
      z = 354.702
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2002,
    monster_id = 21010201,
    pos = {
      x = -534.726,
      y = 7.038,
      z = 356.439
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2004,
    monster_id = 21010201,
    pos = {
      x = -545.385,
      y = 7.038,
      z = 356.681
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2005,
    monster_id = 21030301,
    pos = {
      x = -543.622,
      y = 7.038,
      z = 355.506
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2006,
    monster_id = 21010502,
    pos = {
      x = -537.25,
      y = 7.038,
      z = 355.458
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  }
}
npcs = {}
gadgets = {
  {
    config_id = 2003,
    gadget_id = 70900380,
    pos = {
      x = -540.631,
      y = -29.302,
      z = 362.434
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2007,
    gadget_id = 70900380,
    pos = {
      x = -546.133,
      y = -10.872,
      z = 361.9
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
    monsters = {
      2001,
      2002,
      2004,
      2005,
      2006
    },
    gadgets = {2003, 2007},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
