local base_info = {group_id = 220168001}
local defs = {
  phaseOneBoss = 1001,
  phaseTwoBoss = 1002,
  questBossAppear = 302808,
  questAllAvatarDie = 302809,
  questAvatarRevive = 302810,
  transTarget = 1004,
  phaseThreeBoss = 1007,
  gadget_music_change = 1009
}
monsters = {
  {
    config_id = 1001,
    monster_id = 29070101,
    pos = {
      x = 0.0,
      y = 5.8,
      z = 1.0
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    pose_id = 11
  },
  {
    config_id = 1002,
    monster_id = 29070102,
    pos = {
      x = 0.0,
      y = -58.14,
      z = -30.0
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1007,
    monster_id = 29070105,
    pos = {
      x = 0.0,
      y = -58.14,
      z = -30.0
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
    config_id = 1005,
    gadget_id = 70290651,
    pos = {
      x = 0.0,
      y = 2.7,
      z = -1.5
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1008,
    gadget_id = 70290834,
    pos = {
      x = -1.5,
      y = 5.53,
      z = 68.0
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1009,
    gadget_id = 70290868,
    pos = {
      x = 36.042,
      y = -58.149,
      z = 1.936
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1010,
    gadget_id = 70290869,
    pos = {
      x = 0.0,
      y = 0.0,
      z = 0.0
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
triggers = {
  {
    config_id = 1001003,
    name = "ANY_MONSTER_DIE_1003",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_1003",
    action = "action_EVENT_ANY_MONSTER_DIE_1003"
  }
}
points = {
  {
    config_id = 1004,
    pos = {
      x = 0.0,
      y = -58.149,
      z = 37.35
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    }
  }
}
variables = {}
garbages = {
  gadgets = {
    {
      config_id = 1006,
      gadget_id = 70290652,
      pos = {
        x = 0.0,
        y = -58.9,
        z = 0.0
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1
    }
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
    gadgets = {
      1005,
      1008,
      1010
    },
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_1003"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {1010},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_DIE_1003(context, evt)
  if 1001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_1003(context, evt)
  ScriptLib.SetWeatherAreaState(context, 10143, 1)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220168001, suite = 2}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
require("V3_2/Boss_Battle_Process_Scaramouche_Quset")
