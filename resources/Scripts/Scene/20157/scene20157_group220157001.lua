local base_info = {group_id = 220157001}
local Option_to_Rotation = {
  [1001] = {
    [1] = {levelTag = 48, arrayPoint = 1},
    [7] = {levelTag = 49, arrayPoint = 2}
  },
  [1002] = {
    [1] = {levelTag = 50, arrayPoint = 1},
    [7] = {levelTag = 51, arrayPoint = 2}
  },
  [1003] = {
    [1] = {levelTag = 52, arrayPoint = 1},
    [31] = {levelTag = 53, arrayPoint = 2},
    [613] = {levelTag = 54, arrayPoint = 3}
  }
}
local AxisList = {
  [1001] = 1011,
  [1002] = 1012,
  [1003] = 1013
}
local ArrayID = {
  [1001] = 1,
  [1002] = 2,
  [1003] = 3
}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 1001,
    gadget_id = 70330333,
    pos = {
      x = 221.625,
      y = 184.403,
      z = 250.477
    },
    rot = {
      x = 0.0,
      y = 45.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 1002,
    gadget_id = 70330459,
    pos = {
      x = 247.993,
      y = 180.281,
      z = 282.624
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1003,
    gadget_id = 70330459,
    pos = {
      x = 194.283,
      y = 179.964,
      z = 282.63
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1011,
    gadget_id = 70590072,
    pos = {
      x = 243.575,
      y = 187.83,
      z = 250.41
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE
  },
  {
    config_id = 1012,
    gadget_id = 70590072,
    pos = {
      x = 237.764,
      y = 184.13,
      z = 282.625
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    persistent = true,
    is_use_point_array = true,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE
  },
  {
    config_id = 1013,
    gadget_id = 70590072,
    pos = {
      x = 171.2,
      y = 186.84,
      z = 282.625
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE
  },
  {
    config_id = 1014,
    gadget_id = 70330425,
    pos = {
      x = 255.22,
      y = 177.2,
      z = 282.625
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1015,
    gadget_id = 70330425,
    pos = {
      x = 201.344,
      y = 176.8,
      z = 282.625
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1016,
    gadget_id = 70330399,
    pos = {
      x = 187.231,
      y = 196.936,
      z = 282.636
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 180.0
    },
    level = 1
  },
  {
    config_id = 1019,
    gadget_id = 70330412,
    pos = {
      x = 173.94,
      y = 186.84,
      z = 282.619
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    start_route = false,
    is_use_point_array = true
  },
  {
    config_id = 1025,
    gadget_id = 70330455,
    pos = {
      x = 176.223,
      y = 182.76,
      z = 282.608
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1027,
    gadget_id = 70950164,
    pos = {
      x = 258.06,
      y = 184.45,
      z = 282.57
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 90.0
    },
    level = 1
  },
  {
    config_id = 1028,
    gadget_id = 70950164,
    pos = {
      x = 212.74,
      y = 184.45,
      z = 282.57
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 90.0
    },
    level = 1
  }
}
regions = {
  {
    config_id = 1020,
    shape = RegionShape.CUBIC,
    size = {
      x = 10.0,
      y = 10.0,
      z = 10.0
    },
    pos = {
      x = 212.331,
      y = 183.945,
      z = 282.63
    }
  }
}
triggers = {
  {
    config_id = 1001005,
    name = "GADGET_CREATE_1005",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_1005",
    action = "action_EVENT_GADGET_CREATE_1005"
  },
  {
    config_id = 1001006,
    name = "GADGET_CREATE_1006",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_1006",
    action = "action_EVENT_GADGET_CREATE_1006"
  },
  {
    config_id = 1001007,
    name = "SELECT_OPTION_1007",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_1007",
    action = "action_EVENT_SELECT_OPTION_1007"
  },
  {
    config_id = 1001008,
    name = "SELECT_OPTION_1008",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_1008",
    action = "action_EVENT_SELECT_OPTION_1008"
  },
  {
    config_id = 1001009,
    name = "SELECT_OPTION_1009",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_1009",
    action = "action_EVENT_SELECT_OPTION_1009",
    trigger_count = 0
  },
  {
    config_id = 1001010,
    name = "SELECT_OPTION_1010",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_1010",
    action = "action_EVENT_SELECT_OPTION_1010",
    trigger_count = 0
  },
  {
    config_id = 1001017,
    name = "TIME_AXIS_PASS_1017",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_1017",
    action = "action_EVENT_TIME_AXIS_PASS_1017"
  },
  {
    config_id = 1001018,
    name = "GADGET_CREATE_1018",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_1018",
    action = "action_EVENT_GADGET_CREATE_1018",
    trigger_count = 0
  },
  {
    config_id = 1001020,
    name = "ENTER_REGION_1020",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_1020",
    action = "action_EVENT_ENTER_REGION_1020"
  },
  {
    config_id = 1001021,
    name = "TIME_AXIS_PASS_1021",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_1021",
    action = "action_EVENT_TIME_AXIS_PASS_1021"
  },
  {
    config_id = 1001022,
    name = "SELECT_OPTION_1022",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_1022",
    action = "action_EVENT_SELECT_OPTION_1022",
    trigger_count = 0
  },
  {
    config_id = 1001023,
    name = "TIME_AXIS_PASS_1023",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_1023",
    action = "action_EVENT_TIME_AXIS_PASS_1023",
    trigger_count = 0
  },
  {
    config_id = 1001024,
    name = "TIME_AXIS_PASS_1024",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_1024",
    action = "action_EVENT_TIME_AXIS_PASS_1024",
    trigger_count = 0
  },
  {
    config_id = 1001026,
    name = "TIME_AXIS_PASS_1026",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_1026",
    action = "action_EVENT_TIME_AXIS_PASS_1026"
  }
}
variables = {
  {
    config_id = 1,
    name = "EyeCount",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 2,
    name = "StairCount",
    value = 0,
    no_refresh = false
  }
}
garbages = {
  triggers = {
    {
      config_id = 1001004,
      name = "GADGET_CREATE_1004",
      event = EventType.EVENT_GADGET_CREATE,
      source = "",
      condition = "condition_EVENT_GADGET_CREATE_1004",
      action = "action_EVENT_GADGET_CREATE_1004"
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
    gadgets = {1001, 1011},
    regions = {},
    triggers = {
      "SELECT_OPTION_1007",
      "TIME_AXIS_PASS_1021"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      1002,
      1012,
      1014
    },
    regions = {},
    triggers = {
      "GADGET_CREATE_1005",
      "SELECT_OPTION_1008",
      "TIME_AXIS_PASS_1017"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      1003,
      1013,
      1015
    },
    regions = {1020},
    triggers = {
      "GADGET_CREATE_1006",
      "SELECT_OPTION_1009",
      "SELECT_OPTION_1010",
      "ENTER_REGION_1020",
      "TIME_AXIS_PASS_1023",
      "TIME_AXIS_PASS_1024",
      "TIME_AXIS_PASS_1026"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      1016,
      1019,
      1025
    },
    regions = {},
    triggers = {
      "GADGET_CREATE_1018",
      "SELECT_OPTION_1022"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {1027},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {1028},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_1005(context, evt)
  if 1002 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_1005(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220157001, 1002, {7}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_1006(context, evt)
  if 1003 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_1006(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220157001, 1003, {31}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_1007(context, evt)
  if 1001 ~= evt.param1 then
    return false
  end
  if 7 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_1007(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220157001, 1001, 7) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220157001, 2)
  local pos = {
    x = 243.575,
    y = 187.83,
    z = 250.41
  }
  local pos_follow = {
    x = 224.658,
    y = 187.252,
    z = 250.407
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = false,
    duration = 8,
    is_force = true,
    is_broadcast = false,
    is_recover_keep_current = true,
    delay = 0,
    is_set_follow_pos = true,
    is_abs_follow_pos = true,
    follow_pos = pos_follow,
    is_force_walk = false,
    is_change_play_mode = false,
    screen_x = 0,
    screen_y = 0,
    is_set_screenXY = false
  }) then
    ScriptLib.PrintContextLog(context, "@@Lua_warning : active_cameralook_begin")
    return -1
  end
  ScriptLib.InitTimeAxis(context, "timer4", {8}, false)
  return 0
end
function condition_EVENT_SELECT_OPTION_1008(context, evt)
  if 1002 ~= evt.param1 then
    return false
  end
  if 7 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_1008(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220157001, 1002, 7) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220157001, 3)
  ScriptLib.AddExtraGroupSuite(context, 220157001, 4)
  ScriptLib.AddExtraGroupSuite(context, 220157001, 5)
  local pos = {
    x = 237.764,
    y = 184.13,
    z = 282.625
  }
  local pos_follow = {
    x = 255.729,
    y = 180.95,
    z = 282.625
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = false,
    duration = 8,
    is_force = true,
    is_broadcast = false,
    is_recover_keep_current = true,
    delay = 0,
    is_set_follow_pos = true,
    is_abs_follow_pos = true,
    follow_pos = pos_follow,
    is_force_walk = false,
    is_change_play_mode = false,
    screen_x = 0,
    screen_y = 0,
    is_set_screenXY = false
  }) then
    ScriptLib.PrintContextLog(context, "@@Lua_warning : active_cameralook_begin")
    return -1
  end
  ScriptLib.InitTimeAxis(context, "timer1", {8}, false)
  ScriptLib.RefreshGroup(context, {group_id = 220157006, suite = 7})
  return 0
end
function condition_EVENT_SELECT_OPTION_1009(context, evt)
  if 1003 ~= evt.param1 then
    return false
  end
  if 31 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_1009(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220157001, 1003, 31) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  ScriptLib.InitTimeAxis(context, "timer2", {8}, false)
  ScriptLib.AddExtraGroupSuite(context, 220157001, 6)
  local pos = {
    x = 171.2,
    y = 186.84,
    z = 282.625
  }
  local pos_follow = {
    x = 202.128,
    y = 180.312,
    z = 282.625
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = false,
    duration = 8,
    is_force = true,
    is_broadcast = false,
    is_recover_keep_current = true,
    delay = 0,
    is_set_follow_pos = true,
    is_abs_follow_pos = true,
    follow_pos = pos_follow,
    is_force_walk = false,
    is_change_play_mode = false,
    screen_x = 0,
    screen_y = 0,
    is_set_screenXY = false
  }) then
    ScriptLib.PrintContextLog(context, "@@Lua_warning : active_cameralook_begin")
    return -1
  end
  local tempParam = {route_type = 0, turn_mode = false}
  if ScriptLib.GetGroupVariableValueByGroup(context, "EyeCount", 220157001) ~= 1 and 0 ~= ScriptLib.SetPlatformPointArray(context, 1019, 4, {2}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  ScriptLib.RefreshGroup(context, {group_id = 220157006, suite = 8})
  return 0
end
function condition_EVENT_SELECT_OPTION_1010(context, evt)
  if 1003 ~= evt.param1 then
    return false
  end
  if 613 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_1010(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220157001, 1003, 613) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if ScriptLib.GetGroupVariableValueByGroup(context, "StairCount", 220157001) ~= 1 then
    ScriptLib.InitTimeAxis(context, "timer3", {8}, false)
  end
  ScriptLib.AddExtraGroupSuite(context, 220157001, 6)
  if ScriptLib.GetGroupVariableValueByGroup(context, "EyeCount", 220157001) ~= 0 then
    ScriptLib.InitTimeAxis(context, "timer4", {7}, false)
  end
  local pos = {
    x = 171.2,
    y = 186.84,
    z = 282.625
  }
  local pos_follow = {
    x = 202.128,
    y = 180.312,
    z = 282.625
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = false,
    duration = 8,
    is_force = true,
    is_broadcast = false,
    is_recover_keep_current = true,
    delay = 0,
    is_set_follow_pos = true,
    is_abs_follow_pos = true,
    follow_pos = pos_follow,
    is_force_walk = false,
    is_change_play_mode = false,
    screen_x = 0,
    screen_y = 0,
    is_set_screenXY = false
  }) then
    ScriptLib.PrintContextLog(context, "@@Lua_warning : active_cameralook_begin")
    return -1
  end
  local tempParam = {route_type = 0, turn_mode = false}
  if ScriptLib.GetGroupVariableValueByGroup(context, "EyeCount", 220157001) ~= 1 and 0 ~= ScriptLib.SetPlatformPointArray(context, 1019, 4, {1}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_1017(context, evt)
  if "timer1" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_1017(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 201570401) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  ScriptLib.RemoveExtraGroupSuite(context, 220157001, 5)
  ScriptLib.AddExtraGroupSuite(context, 220157008, 2)
  return 0
end
function condition_EVENT_GADGET_CREATE_1018(context, evt)
  if 1016 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_1018(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220157001, 1016, {7}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_1020(context, evt)
  if evt.param1 ~= 1020 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_1020(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 201570501) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_1021(context, evt)
  if "timer4" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_1021(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 201570301) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220157004, 2)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220157006, suite = 4}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_1022(context, evt)
  if 1016 ~= evt.param1 then
    return false
  end
  if 7 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_1022(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1016, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220157001, 1016, 7) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1019, GadgetState.GearAction2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "EyeCount", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  local pos = {
    x = 173.94,
    y = 186.84,
    z = 282.625
  }
  local pos_follow = {
    x = 190,
    y = 180,
    z = 282.625
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = false,
    duration = 3,
    is_force = true,
    is_broadcast = false,
    is_recover_keep_current = true,
    delay = 0,
    is_set_follow_pos = true,
    is_abs_follow_pos = true,
    follow_pos = pos_follow,
    is_force_walk = false,
    is_change_play_mode = false,
    screen_x = 0,
    screen_y = 0,
    is_set_screenXY = false
  }) then
    ScriptLib.PrintContextLog(context, "@@Lua_warning : active_cameralook_begin")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "StairCount", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_1023(context, evt)
  if "timer2" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_1023(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220157001, 1003, {613}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  ScriptLib.RemoveExtraGroupSuite(context, 220157001, 6)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_1024(context, evt)
  if "timer3" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_1024(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220157001, 1003, {31}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  ScriptLib.RemoveExtraGroupSuite(context, 220157001, 6)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_1026(context, evt)
  if "timer4" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_1026(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1025, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.RemoveExtraGroupSuite(context, 220157001, 6)
  return 0
end
require("V3_1/RotateDungeon")
