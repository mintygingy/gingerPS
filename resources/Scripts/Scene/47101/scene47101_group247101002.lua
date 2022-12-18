local base_info = {group_id = 247101002}
local defs = {battle_group = 247101001, reborn_gear = 2005}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 2005,
    gadget_id = 70290662,
    pos = {
      x = 219.083,
      y = 90.755,
      z = 213.524
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
points = {
  {
    config_id = 2001,
    pos = {
      x = 214.655,
      y = 90.197,
      z = 214.44
    },
    rot = {
      x = 0.0,
      y = 320.391,
      z = 0.0
    }
  },
  {
    config_id = 2002,
    pos = {
      x = 216.626,
      y = 90.182,
      z = 214.259
    },
    rot = {
      x = 0.0,
      y = 320.391,
      z = 0.0
    }
  },
  {
    config_id = 2003,
    pos = {
      x = 218.62,
      y = 90.182,
      z = 216.038
    },
    rot = {
      x = 0.0,
      y = 320.391,
      z = 0.0
    }
  },
  {
    config_id = 2004,
    pos = {
      x = 218.719,
      y = 90.183,
      z = 218.021
    },
    rot = {
      x = 0.0,
      y = 320.391,
      z = 0.0
    }
  },
  {
    config_id = 2006,
    pos = {
      x = 222.09,
      y = 90.184,
      z = 208.971
    },
    rot = {
      x = 0.0,
      y = 326.703,
      z = 0.0
    }
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
    gadgets = {2005},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
require("V3_2/Activity_BattleMushroomMonster_FugusInitialize")
require("V3_2/Activity_BattleMushroomMonster_FungusGroup")
