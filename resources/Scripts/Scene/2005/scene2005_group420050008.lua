local base_info = {group_id = 420050008}
local defs = {
  Game_Time = 150,
  Stage_Time = 30,
  Stage_Tubby_Count = 4,
  Tubby_Count = 12
}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 8001,
    gadget_id = 77307018,
    pos = {
      x = 554.4,
      y = 383.6,
      z = 215.9
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 8002,
    gadget_id = 77307019,
    pos = {
      x = 556.4,
      y = 383.843,
      z = 215.9
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_guest_can_operate = true
  },
  {
    config_id = 8003,
    gadget_id = 77307019,
    pos = {
      x = 558.4,
      y = 383.843,
      z = 215.9
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_guest_can_operate = true
  },
  {
    config_id = 8004,
    gadget_id = 77307019,
    pos = {
      x = 552.4,
      y = 383.843,
      z = 215.9
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_guest_can_operate = true
  },
  {
    config_id = 8005,
    gadget_id = 77307019,
    pos = {
      x = 550.4,
      y = 383.843,
      z = 215.9
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_guest_can_operate = true
  },
  {
    config_id = 8006,
    gadget_id = 77307019,
    pos = {
      x = 552.4,
      y = 383.843,
      z = 213.9
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_guest_can_operate = true
  },
  {
    config_id = 8007,
    gadget_id = 77307019,
    pos = {
      x = 554.4,
      y = 383.843,
      z = 213.9
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_guest_can_operate = true
  },
  {
    config_id = 8008,
    gadget_id = 77307019,
    pos = {
      x = 556.4,
      y = 383.843,
      z = 213.9
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_guest_can_operate = true
  },
  {
    config_id = 8009,
    gadget_id = 77307019,
    pos = {
      x = 554.4,
      y = 383.843,
      z = 211.9
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_guest_can_operate = true
  },
  {
    config_id = 8010,
    gadget_id = 77307019,
    pos = {
      x = 556.4,
      y = 383.843,
      z = 217.9
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_guest_can_operate = true
  },
  {
    config_id = 8011,
    gadget_id = 77307019,
    pos = {
      x = 554.4,
      y = 383.843,
      z = 217.9
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_guest_can_operate = true
  },
  {
    config_id = 8012,
    gadget_id = 77307019,
    pos = {
      x = 552.4,
      y = 383.843,
      z = 217.9
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_guest_can_operate = true
  },
  {
    config_id = 8013,
    gadget_id = 77307019,
    pos = {
      x = 554.4,
      y = 383.843,
      z = 219.9
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_guest_can_operate = true
  }
}
regions = {
  {
    config_id = 8014,
    shape = RegionShape.SPHERE,
    radius = 1000,
    pos = {
      x = 554.4,
      y = 383.6,
      z = 215.9
    },
    follow_entity = 8001,
    team_ability_group_list = {
      "HomeWorld_Find_Tubby_Reminder"
    }
  }
}
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
    gadgets = {8001},
    regions = {8014},
    triggers = {},
    rand_weight = 100
  }
}
require("V2_7/HM_FindTubby")
