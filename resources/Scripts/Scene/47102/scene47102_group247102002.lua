local base_info = {group_id = 247102002}
local defs = {battle_group = 247102001, reborn_gear = 2005}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 2005,
    gadget_id = 70290662,
    pos = {
      x = 723.342,
      y = 90.714,
      z = 775.33
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
      x = 724.303,
      y = 90.183,
      z = 782.096
    },
    rot = {
      x = 0.0,
      y = 334.5,
      z = 0.0
    }
  },
  {
    config_id = 2002,
    pos = {
      x = 723.856,
      y = 90.184,
      z = 779.151
    },
    rot = {
      x = 0.0,
      y = 334.5,
      z = 0.0
    }
  },
  {
    config_id = 2003,
    pos = {
      x = 720.654,
      y = 90.183,
      z = 777.319
    },
    rot = {
      x = 0.0,
      y = 334.5,
      z = 0.0
    }
  },
  {
    config_id = 2004,
    pos = {
      x = 717.744,
      y = 90.184,
      z = 778.228
    },
    rot = {
      x = 0.0,
      y = 334.5,
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
