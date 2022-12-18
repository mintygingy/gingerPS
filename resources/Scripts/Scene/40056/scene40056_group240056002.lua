local base_info = {group_id = 240056002}
local defs = {
  worktop_id = 2007,
  gallery_id = 29020,
  recovergadget_id = 2009,
  battle_region_id = 2028,
  cleaner_id = 2005,
  trans_p1 = 2017,
  trans_p2 = 2018,
  trans_p3 = 2019,
  trans_p4 = 2020,
  monster_num = 5,
  is_first_group = false,
  next_group_id = 240056003
}
monsters = {
  [2001] = {
    config_id = 2001,
    monster_id = 23010601,
    pos = {
      x = 3.063,
      y = 0.08,
      z = -8.683
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
  [2002] = {
    config_id = 2002,
    monster_id = 25010601,
    pos = {
      x = 8.818,
      y = 0.146,
      z = 0.256
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  [2003] = {
    config_id = 2003,
    monster_id = 25100201,
    pos = {
      x = -2.694,
      y = 0.079,
      z = 8.667
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 1
  },
  [2004] = {
    config_id = 2004,
    monster_id = 25010601,
    pos = {
      x = -8.651,
      y = 0.146,
      z = 0.291
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  [2022] = {
    config_id = 2022,
    monster_id = 25310101,
    pos = {
      x = -2.757,
      y = 0.08,
      z = -8.748
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {6106},
    isElite = true,
    pose_id = 1
  },
  [2023] = {
    config_id = 2023,
    monster_id = 25210201,
    pos = {
      x = -8.651,
      y = 0.146,
      z = 0.291
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  [2024] = {
    config_id = 2024,
    monster_id = 25210201,
    pos = {
      x = 8.818,
      y = 0.146,
      z = 0.256
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  [2025] = {
    config_id = 2025,
    monster_id = 25100201,
    pos = {
      x = 3.111,
      y = 0.08,
      z = 8.718
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 1
  },
  [2026] = {
    config_id = 2026,
    monster_id = 25310101,
    pos = {
      x = 0.178,
      y = 0.079,
      z = -8.706
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 1
  },
  [2027] = {
    config_id = 2027,
    monster_id = 25210201,
    pos = {
      x = 0.132,
      y = 0.084,
      z = 14.547
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  }
}
npcs = {}
gadgets = {
  [2005] = {
    config_id = 2005,
    gadget_id = 44000456,
    pos = {
      x = -0.131,
      y = 0.074,
      z = 0.29
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2006] = {
    config_id = 2006,
    gadget_id = 70900205,
    pos = {
      x = 1.941,
      y = -0.461,
      z = -1.168
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2007] = {
    config_id = 2007,
    gadget_id = 70360367,
    pos = {
      x = 0.116,
      y = 0.0,
      z = 8.749
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
  [2008] = {
    config_id = 2008,
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
  [2009] = {
    config_id = 2009,
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
  },
  [2021] = {
    config_id = 2021,
    gadget_id = 70350033,
    pos = {
      x = 0.195,
      y = 0.093,
      z = 0.022
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
  [2028] = {
    config_id = 2028,
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
    config_id = 1002010,
    name = "ANY_MONSTER_LIVE_2010",
    event = EventType.EVENT_ANY_MONSTER_LIVE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_LIVE_2010",
    action = "action_EVENT_ANY_MONSTER_LIVE_2010"
  },
  {
    config_id = 1002011,
    name = "SELECT_OPTION_2011",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_2011",
    action = "action_EVENT_SELECT_OPTION_2011"
  },
  {
    config_id = 1002012,
    name = "ANY_MONSTER_DIE_2012",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_2012",
    action = "action_EVENT_ANY_MONSTER_DIE_2012"
  },
  {
    config_id = 1002013,
    name = "ANY_MONSTER_DIE_2013",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_2013",
    action = "action_EVENT_ANY_MONSTER_DIE_2013"
  },
  {
    config_id = 1002014,
    name = "ANY_MONSTER_DIE_2014",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_2014",
    action = "action_EVENT_ANY_MONSTER_DIE_2014"
  },
  {
    config_id = 1002015,
    name = "VARIABLE_CHANGE_2015",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "monster_count",
    condition = "condition_EVENT_VARIABLE_CHANGE_2015",
    action = "action_EVENT_VARIABLE_CHANGE_2015",
    trigger_count = 0
  },
  {
    config_id = 1002016,
    name = "ANY_MONSTER_DIE_2016",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "",
    action = "action_EVENT_ANY_MONSTER_DIE_2016",
    trigger_count = 0
  }
}
points = {
  {
    config_id = 2017,
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
    config_id = 2018,
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
    config_id = 2019,
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
    config_id = 2020,
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
    gadgets = {2006},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      2005,
      2006,
      2007,
      2008,
      2009,
      2021
    },
    regions = {2028},
    triggers = {
      "SELECT_OPTION_2011",
      "VARIABLE_CHANGE_2015",
      "ANY_MONSTER_DIE_2016"
    },
    rand_weight = 100
  },
  {
    monsters = {
      2001,
      2022,
      2023,
      2024,
      2027
    },
    gadgets = {2006},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_2012"
    },
    rand_weight = 100
  },
  {
    monsters = {
      2002,
      2003,
      2004,
      2025,
      2026
    },
    gadgets = {2006},
    regions = {},
    triggers = {
      "ANY_MONSTER_LIVE_2010",
      "ANY_MONSTER_DIE_2013"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {2006},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_2014"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {2006},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_LIVE_2010(context, evt)
  if 2002 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_LIVE_2010(context, evt)
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
function condition_EVENT_SELECT_OPTION_2011(context, evt)
  if 2007 ~= evt.param1 then
    return false
  end
  if 175 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_2011(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 2007, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 2021, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 240056002, 2007, 175) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 240056002, 4)
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_2012(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "monster_wave") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_2012(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 240056002, 4)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "monster_wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_2013(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "monster_wave") ~= 2 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_2013(context, evt)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "monster_wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_2014(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "monster_wave") ~= 3 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_2014(context, evt)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "monster_wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_2015(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "monster_count") ~= 5 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_2015(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 2021, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "GALLERY_STATE", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function action_EVENT_ANY_MONSTER_DIE_2016(context, evt)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "monster_count", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
require("V3_2/HypostasisChallenge")
