local base_info = {group_id = 220154001}
local defs = {
  transTarget = 1004,
  phaseOneBoss = 1001,
  phaseTwoBoss = 1002,
  bossBattleTransPoint = 1007,
  phaseOneRegion = 1008,
  gadget_music_change = 1014
}
monsters = {
  {
    config_id = 1001,
    monster_id = 29070103,
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
    title_id = 161
  },
  {
    config_id = 1002,
    monster_id = 29070104,
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
    level = 1,
    title_id = 161
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
    config_id = 1006,
    gadget_id = 70290834,
    pos = {
      x = 1.5,
      y = 5.53,
      z = 66.9
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1009,
    gadget_id = 70360001,
    pos = {
      x = -0.941,
      y = -58.149,
      z = -1.813
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1012,
    gadget_id = 70210106,
    pos = {
      x = 0.0,
      y = -58.149,
      z = 0.063
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    drop_tag = "\227\128\140\230\173\163\230\156\186\228\185\139\231\165\158\227\128\141",
    persistent = true,
    boss_chest = {
      monster_config_id = 1002,
      resin = 60,
      life_time = 1800,
      take_num = 1
    }
  },
  {
    config_id = 1014,
    gadget_id = 70290868,
    pos = {
      x = 13.671,
      y = -58.149,
      z = -25.748
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1015,
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
regions = {
  {
    config_id = 1008,
    shape = RegionShape.CYLINDER,
    radius = 28,
    pos = {
      x = 0.0,
      y = 2.7,
      z = -1.5
    },
    height = 100.0
  }
}
triggers = {
  {
    config_id = 1001003,
    name = "ANY_MONSTER_DIE_1003",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_1003",
    action = "action_EVENT_ANY_MONSTER_DIE_1003"
  },
  {
    config_id = 1001010,
    name = "ANY_MONSTER_DIE_1010",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_1010",
    action = "action_EVENT_ANY_MONSTER_DIE_1010"
  },
  {
    config_id = 1001011,
    name = "GADGET_STATE_CHANGE_1011",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_1011",
    action = "action_EVENT_GADGET_STATE_CHANGE_1011"
  }
}
points = {
  {
    config_id = 1004,
    pos = {
      x = 0.0,
      y = -58.149,
      z = 37.354
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    }
  },
  {
    config_id = 1007,
    pos = {
      x = 0.0,
      y = 5.8,
      z = 23.125
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
      config_id = 1013,
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
    monsters = {1001},
    gadgets = {
      1005,
      1006,
      1015
    },
    regions = {1008},
    triggers = {
      "ANY_MONSTER_DIE_1003"
    },
    rand_weight = 100
  },
  {
    monsters = {1002},
    gadgets = {1009, 1015},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_1010",
      "GADGET_STATE_CHANGE_1011"
    },
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
  ScriptLib.SetWeatherAreaState(context, 10142, 1)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220154001, suite = 2}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_1010(context, evt)
  if evt.param1 ~= 1002 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_1010(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1009, GadgetState.Action01) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_1011(context, evt)
  if 1009 ~= evt.param2 or GadgetState.Action01 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_1011(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 1012}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  return 0
end
require("V3_2/Boss_Battle_Process_Scaramouche")
