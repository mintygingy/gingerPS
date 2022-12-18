local base_info = {group_id = 240062001}
local defs = {
  worktop_id = 1003,
  gallery_id = 29034,
  battle_region_id = 1012,
  recovergadget_id = 1010,
  cleaner_id = 1009,
  monster_num = 1,
  is_first_group = true
}
monsters = {
  [1001] = {
    config_id = 1001,
    monster_id = 20040702,
    pos = {
      x = 0.178,
      y = 0.073,
      z = -0.034
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5232}
  },
  [1006] = {
    config_id = 1006,
    monster_id = 20040702,
    pos = {
      x = 0.178,
      y = 0.073,
      z = -0.034
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5233}
  },
  [1007] = {
    config_id = 1007,
    monster_id = 20040702,
    pos = {
      x = 0.178,
      y = 0.073,
      z = -0.034
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5220, 5234}
  },
  [1008] = {
    config_id = 1008,
    monster_id = 20040702,
    pos = {
      x = 0.178,
      y = 0.073,
      z = -0.034
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {
      5214,
      5235,
      5236
    },
    isElite = true
  }
}
npcs = {}
gadgets = {
  [1002] = {
    config_id = 1002,
    gadget_id = 70900205,
    pos = {
      x = 2.072,
      y = -0.535,
      z = -1.458
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1003] = {
    config_id = 1003,
    gadget_id = 70360367,
    pos = {
      x = 0.19,
      y = 0.082,
      z = 8.736
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {175}
    }
  },
  [1004] = {
    config_id = 1004,
    gadget_id = 70950042,
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
  },
  [1009] = {
    config_id = 1009,
    gadget_id = 44000456,
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
  },
  [1010] = {
    config_id = 1010,
    gadget_id = 44000006,
    pos = {
      x = 0.104,
      y = 0.086,
      z = 17.484
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
  [1012] = {
    config_id = 1012,
    shape = RegionShape.SPHERE,
    radius = 35,
    pos = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    }
  }
}
triggers = {
  {
    config_id = 1001005,
    name = "SELECT_OPTION_1005",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_1005",
    action = "action_EVENT_SELECT_OPTION_1005",
    trigger_count = 0
  },
  {
    config_id = 1001011,
    name = "ANY_MONSTER_DIE_1011",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_1011",
    action = "action_EVENT_ANY_MONSTER_DIE_1011",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "GALLERY_STATE",
    value = 0,
    no_refresh = false
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
      1002,
      1003,
      1004,
      1009,
      1010
    },
    regions = {1012},
    triggers = {
      "SELECT_OPTION_1005",
      "ANY_MONSTER_DIE_1011"
    },
    rand_weight = 100
  },
  {
    monsters = {1001},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {1006},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {1007},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {1008},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_SELECT_OPTION_1005(context, evt)
  if 1003 ~= evt.param1 then
    return false
  end
  if 175 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_1005(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 240062001, 1003, 175) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1003, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "GALLERY_STATE", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if ScriptLib.GetEffigyChallengeV2DungeonDifficulty(context) == 1 then
    ScriptLib.AddExtraGroupSuite(context, 240062001, 2)
  elseif ScriptLib.GetEffigyChallengeV2DungeonDifficulty(context) == 2 then
    ScriptLib.AddExtraGroupSuite(context, 240062001, 3)
  elseif ScriptLib.GetEffigyChallengeV2DungeonDifficulty(context) == 3 then
    ScriptLib.AddExtraGroupSuite(context, 240062001, 4)
  elseif ScriptLib.GetEffigyChallengeV2DungeonDifficulty(context) == 4 then
    ScriptLib.AddExtraGroupSuite(context, 240062001, 5)
  else
    ScriptLib.AddExtraGroupSuite(context, 240062001, 5)
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_1011(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_1011(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "GALLERY_STATE", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
require("V3_2/HypostasisChallenge")
