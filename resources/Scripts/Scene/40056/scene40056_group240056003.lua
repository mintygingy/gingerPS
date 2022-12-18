local base_info = {group_id = 240056003}
local defs = {
  worktop_id = 3007,
  gallery_id = 29021,
  recovergadget_id = 3009,
  battle_region_id = 3002,
  cleaner_id = 3005,
  trans_p1 = 3017,
  trans_p2 = 3018,
  trans_p3 = 3019,
  trans_p4 = 3020,
  monster_num = 2,
  is_first_group = false,
  next_group_id = 240056004
}
monsters = {
  [3001] = {
    config_id = 3001,
    monster_id = 22010102,
    pos = {
      x = 0.167,
      y = 0.223,
      z = -8.638
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {1028},
    isElite = true
  },
  [3022] = {
    config_id = 3022,
    monster_id = 21010502,
    pos = {
      x = 3.071,
      y = 0.223,
      z = -5.836
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  [3023] = {
    config_id = 3023,
    monster_id = 21010502,
    pos = {
      x = -2.704,
      y = 0.223,
      z = -5.778
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  [3024] = {
    config_id = 3024,
    monster_id = 21030203,
    pos = {
      x = 0.167,
      y = 0.223,
      z = -11.519
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  [3026] = {
    config_id = 3026,
    monster_id = 22030202,
    pos = {
      x = 3.115,
      y = 0.078,
      z = -5.785
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101
  },
  [3027] = {
    config_id = 3027,
    monster_id = 22030202,
    pos = {
      x = -2.738,
      y = 0.077,
      z = -5.651
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101
  }
}
npcs = {}
gadgets = {
  [3005] = {
    config_id = 3005,
    gadget_id = 44000456,
    pos = {
      x = -0.171,
      y = 0.15,
      z = 0.119
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [3006] = {
    config_id = 3006,
    gadget_id = 70900205,
    pos = {
      x = 1.901,
      y = -0.385,
      z = -1.339
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [3007] = {
    config_id = 3007,
    gadget_id = 70360367,
    pos = {
      x = 0.122,
      y = 0.0,
      z = 8.731
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
  [3008] = {
    config_id = 3008,
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
  [3009] = {
    config_id = 3009,
    gadget_id = 44000006,
    pos = {
      x = 0.12,
      y = 0.0,
      z = 20.107
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
  [3002] = {
    config_id = 3002,
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
    config_id = 1003010,
    name = "ANY_MONSTER_LIVE_3010",
    event = EventType.EVENT_ANY_MONSTER_LIVE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_LIVE_3010",
    action = "action_EVENT_ANY_MONSTER_LIVE_3010"
  },
  {
    config_id = 1003011,
    name = "SELECT_OPTION_3011",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_3011",
    action = "action_EVENT_SELECT_OPTION_3011"
  },
  {
    config_id = 1003012,
    name = "ANY_MONSTER_DIE_3012",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_3012",
    action = "action_EVENT_ANY_MONSTER_DIE_3012"
  },
  {
    config_id = 1003013,
    name = "ANY_MONSTER_DIE_3013",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_3013",
    action = "action_EVENT_ANY_MONSTER_DIE_3013"
  },
  {
    config_id = 1003014,
    name = "ANY_MONSTER_DIE_3014",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_3014",
    action = "action_EVENT_ANY_MONSTER_DIE_3014"
  },
  {
    config_id = 1003015,
    name = "VARIABLE_CHANGE_3015",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "monster_count",
    condition = "condition_EVENT_VARIABLE_CHANGE_3015",
    action = "action_EVENT_VARIABLE_CHANGE_3015",
    trigger_count = 0
  },
  {
    config_id = 1003016,
    name = "ANY_MONSTER_DIE_3016",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "",
    action = "action_EVENT_ANY_MONSTER_DIE_3016",
    trigger_count = 0
  }
}
points = {
  {
    config_id = 3017,
    pos = {
      x = 0.191,
      y = 0.0,
      z = 17.427
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    }
  },
  {
    config_id = 3018,
    pos = {
      x = 0.191,
      y = 0.0,
      z = 23.304
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    }
  },
  {
    config_id = 3019,
    pos = {
      x = 3.104,
      y = 0.0,
      z = 20.332
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    }
  },
  {
    config_id = 3020,
    pos = {
      x = -2.72,
      y = 0.0,
      z = 20.332
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    }
  }
}
variables = {
  {
    config_id = 1,
    name = "GALLERY_STATE",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 2,
    name = "monster_wave",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 3,
    name = "monster_count",
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
    gadgets = {3006},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      3005,
      3006,
      3007,
      3008,
      3009
    },
    regions = {3002},
    triggers = {
      "SELECT_OPTION_3011",
      "VARIABLE_CHANGE_3015",
      "ANY_MONSTER_DIE_3016"
    },
    rand_weight = 100
  },
  {
    monsters = {
      3001,
      3022,
      3023,
      3024
    },
    gadgets = {3006},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_3012"
    },
    rand_weight = 100
  },
  {
    monsters = {3026, 3027},
    gadgets = {3006},
    regions = {},
    triggers = {
      "ANY_MONSTER_LIVE_3010",
      "ANY_MONSTER_DIE_3013"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {3006},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_3014"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {3006},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_LIVE_3010(context, evt)
  if 3026 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_LIVE_3010(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "GALLERY_STATE", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "monster_wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_3011(context, evt)
  if 3007 ~= evt.param1 then
    return false
  end
  if 175 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_3011(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 3007, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 240056003, 3007, 175) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 240056003, 4)
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_3012(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "monster_wave") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_3012(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 240056003, 4)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "monster_wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_3013(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "monster_wave") ~= 2 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_3013(context, evt)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "monster_wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_3014(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "monster_wave") ~= 3 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_3014(context, evt)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "monster_wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_3015(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "monster_count") ~= 2 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_3015(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "GALLERY_STATE", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function action_EVENT_ANY_MONSTER_DIE_3016(context, evt)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "monster_count", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
require("V3_2/HypostasisChallenge")
