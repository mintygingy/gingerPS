local base_info = {group_id = 240055001}
local defs = {
  worktop_id = 1003,
  battle_region_id = 1040,
  gallery_id = 29015,
  recovergadget_id = 1009,
  cleaner_id = 1001,
  trans_p1 = 1017,
  trans_p2 = 1018,
  trans_p3 = 1019,
  trans_p4 = 1020,
  monster_num = 9,
  is_first_group = true,
  next_group_id = 240055002
}
monsters = {
  [1006] = {
    config_id = 1006,
    monster_id = 20010904,
    pos = {
      x = -4.863,
      y = 0.075,
      z = -4.894
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  [1007] = {
    config_id = 1007,
    monster_id = 20060401,
    pos = {
      x = 9.866,
      y = 0.075,
      z = 0.897
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101
  },
  [1008] = {
    config_id = 1008,
    monster_id = 26120301,
    pos = {
      x = 1.095,
      y = 0.075,
      z = -4.938
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    isElite = true,
    pose_id = 101
  },
  [1012] = {
    config_id = 1012,
    monster_id = 26010101,
    pos = {
      x = -7.603,
      y = 0.075,
      z = 3.865
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  [1021] = {
    config_id = 1021,
    monster_id = 20010904,
    pos = {
      x = 6.79,
      y = 0.075,
      z = -4.894
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  [1022] = {
    config_id = 1022,
    monster_id = 20010801,
    pos = {
      x = -7.925,
      y = 0.075,
      z = -7.89
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  [1023] = {
    config_id = 1023,
    monster_id = 20010801,
    pos = {
      x = 9.734,
      y = 0.075,
      z = -7.89
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  [1024] = {
    config_id = 1024,
    monster_id = 20010801,
    pos = {
      x = -2.017,
      y = 0.075,
      z = -7.89
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  [1025] = {
    config_id = 1025,
    monster_id = 20010801,
    pos = {
      x = 3.902,
      y = 0.075,
      z = -7.89
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  [1026] = {
    config_id = 1026,
    monster_id = 26010101,
    pos = {
      x = 9.866,
      y = 0.075,
      z = 3.83
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  [1027] = {
    config_id = 1027,
    monster_id = 26010101,
    pos = {
      x = 0.955,
      y = 0.075,
      z = 12.65
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  [1028] = {
    config_id = 1028,
    monster_id = 20060401,
    pos = {
      x = 9.866,
      y = 0.075,
      z = 6.815
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101
  },
  [1029] = {
    config_id = 1029,
    monster_id = 20060401,
    pos = {
      x = -7.853,
      y = 0.075,
      z = 0.897
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101
  },
  [1030] = {
    config_id = 1030,
    monster_id = 20060401,
    pos = {
      x = -7.853,
      y = 0.075,
      z = 6.815
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101
  },
  [1031] = {
    config_id = 1031,
    monster_id = 20060101,
    pos = {
      x = 0.948,
      y = 0.075,
      z = -4.89
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
  [1032] = {
    config_id = 1032,
    monster_id = 26120201,
    pos = {
      x = 9.866,
      y = 0.075,
      z = 3.83
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {1029},
    pose_id = 201
  },
  [1033] = {
    config_id = 1033,
    monster_id = 26120201,
    pos = {
      x = -7.603,
      y = 0.075,
      z = 3.865
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {6101},
    pose_id = 201
  }
}
npcs = {}
gadgets = {
  [1001] = {
    config_id = 1001,
    gadget_id = 44000456,
    pos = {
      x = 0.172,
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
  [1002] = {
    config_id = 1002,
    gadget_id = 70900205,
    pos = {
      x = 2.243,
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
      x = 0.192,
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
    gadget_id = 44000006,
    pos = {
      x = 0.172,
      y = 0.0,
      z = 20.195
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1034] = {
    config_id = 1034,
    gadget_id = 70350463,
    pos = {
      x = 0.0,
      y = 0.239,
      z = 0.0
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  [1035] = {
    config_id = 1035,
    gadget_id = 70310029,
    pos = {
      x = 0.0,
      y = 0.239,
      z = 0.0
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  [1036] = {
    config_id = 1036,
    gadget_id = 70310017,
    pos = {
      x = -14.307,
      y = 0.085,
      z = 14.539
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1037] = {
    config_id = 1037,
    gadget_id = 70310017,
    pos = {
      x = 14.743,
      y = 0.085,
      z = 14.549
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1038] = {
    config_id = 1038,
    gadget_id = 70310017,
    pos = {
      x = 14.787,
      y = 0.085,
      z = -14.55
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [1039] = {
    config_id = 1039,
    gadget_id = 70310017,
    pos = {
      x = -14.353,
      y = 0.085,
      z = -14.574
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
  [1040] = {
    config_id = 1040,
    shape = RegionShape.SPHERE,
    radius = 35,
    pos = {
      x = 0.19,
      y = 0.073,
      z = -0.124
    }
  }
}
triggers = {
  {
    config_id = 1001005,
    name = "ANY_MONSTER_LIVE_1005",
    event = EventType.EVENT_ANY_MONSTER_LIVE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_LIVE_1005",
    action = "action_EVENT_ANY_MONSTER_LIVE_1005"
  },
  {
    config_id = 1001010,
    name = "SELECT_OPTION_1010",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_1010",
    action = "action_EVENT_SELECT_OPTION_1010"
  },
  {
    config_id = 1001011,
    name = "ANY_MONSTER_DIE_1011",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_1011",
    action = "action_EVENT_ANY_MONSTER_DIE_1011"
  },
  {
    config_id = 1001013,
    name = "ANY_MONSTER_DIE_1013",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_1013",
    action = "action_EVENT_ANY_MONSTER_DIE_1013"
  },
  {
    config_id = 1001014,
    name = "ANY_MONSTER_DIE_1014",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_1014",
    action = "action_EVENT_ANY_MONSTER_DIE_1014"
  },
  {
    config_id = 1001015,
    name = "ANY_MONSTER_DIE_1015",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "",
    action = "action_EVENT_ANY_MONSTER_DIE_1015",
    trigger_count = 0
  },
  {
    config_id = 1001016,
    name = "VARIABLE_CHANGE_1016",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "monster_count",
    condition = "condition_EVENT_VARIABLE_CHANGE_1016",
    action = "action_EVENT_VARIABLE_CHANGE_1016",
    trigger_count = 0
  }
}
points = {
  {
    config_id = 1017,
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
    config_id = 1018,
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
    config_id = 1019,
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
    config_id = 1020,
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
    gadgets = {
      1001,
      1002,
      1003,
      1004,
      1009,
      1034,
      1035,
      1036,
      1037,
      1038,
      1039
    },
    regions = {1040},
    triggers = {
      "SELECT_OPTION_1010",
      "ANY_MONSTER_DIE_1015",
      "VARIABLE_CHANGE_1016"
    },
    rand_weight = 100
  },
  {
    monsters = {
      1006,
      1021,
      1022,
      1023,
      1024,
      1025
    },
    gadgets = {1002},
    regions = {},
    triggers = {
      "ANY_MONSTER_LIVE_1005",
      "ANY_MONSTER_DIE_1011"
    },
    rand_weight = 100
  },
  {
    monsters = {
      1012,
      1026,
      1027
    },
    gadgets = {1002},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_1013"
    },
    rand_weight = 100
  },
  {
    monsters = {
      1007,
      1028,
      1029,
      1030,
      1031
    },
    gadgets = {1002},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_1014"
    },
    rand_weight = 100
  },
  {
    monsters = {
      1008,
      1032,
      1033
    },
    gadgets = {1002},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_LIVE_1005(context, evt)
  if 1006 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_LIVE_1005(context, evt)
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
function condition_EVENT_SELECT_OPTION_1010(context, evt)
  if 1003 ~= evt.param1 then
    return false
  end
  if 175 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_1010(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1003, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1034, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 240055001, EntityType.GADGET, 1035) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 240055001, 1003, 175) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 240055001, 2)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1036, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1037, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1038, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1039, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_1011(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "monster_wave") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_1011(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 240055001, 5)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "monster_wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_1013(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "monster_wave") ~= 2 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_1013(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 240055001, 4)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "monster_wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_1014(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "monster_wave") ~= 3 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_1014(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 240055001, 5)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "monster_wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function action_EVENT_ANY_MONSTER_DIE_1015(context, evt)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "monster_count", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_1016(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "monster_count") ~= 9 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_1016(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1034, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "GALLERY_STATE", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
require("V3_2/HypostasisChallenge")
