local base_info = {group_id = 220134063}
function SLC_Try_Trans_Player(context)
  ScriptLib.TransPlayerToPos(context, {
    uid_list = {
      ScriptLib.GetSceneOwnerUid(context)
    },
    pos = {
      x = 335,
      y = 666,
      z = -1496
    },
    radius = 1,
    rot = {
      x = 0,
      y = 180,
      z = 0
    },
    is_skip_ui = false
  })
  return 0
end
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 63001,
    gadget_id = 70380328,
    pos = {
      x = 329.721,
      y = 631.281,
      z = -1492.386
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 63002,
    gadget_id = 70310388,
    pos = {
      x = 335.174,
      y = 631.907,
      z = -1496.881
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 63003,
    gadget_id = 70360001,
    pos = {
      x = 335.174,
      y = 633.49,
      z = -1496.881
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {416}
    }
  },
  {
    config_id = 63005,
    gadget_id = 70360001,
    pos = {
      x = 335.174,
      y = 651.027,
      z = -1496.881
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 63006,
    gadget_id = 70360001,
    pos = {
      x = 335.174,
      y = 665.583,
      z = -1496.881
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 63010,
    gadget_id = 70290428,
    pos = {
      x = 359.382,
      y = 633.992,
      z = -1508.369
    },
    rot = {
      x = 0.0,
      y = 294.254,
      z = 0.0
    },
    level = 1
  }
}
regions = {
  {
    config_id = 63013,
    shape = RegionShape.CUBIC,
    size = {
      x = 100.0,
      y = 10.0,
      z = 100.0
    },
    pos = {
      x = 334.181,
      y = 632.052,
      z = -1495.903
    },
    team_ability_group_list = {
      "MonaDreamland_Enter_TransPlayer_Handle_1"
    }
  }
}
triggers = {
  {
    config_id = 1063004,
    name = "SELECT_OPTION_63004",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_63004",
    action = "action_EVENT_SELECT_OPTION_63004",
    trigger_count = 0
  },
  {
    config_id = 1063007,
    name = "SELECT_OPTION_63007",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_63007",
    action = "action_EVENT_SELECT_OPTION_63007",
    trigger_count = 0,
    forbid_guest = false
  },
  {
    config_id = 1063008,
    name = "SELECT_OPTION_63008",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_63008",
    action = "action_EVENT_SELECT_OPTION_63008",
    trigger_count = 0
  },
  {
    config_id = 1063009,
    name = "SELECT_OPTION_63009",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_63009",
    action = "action_EVENT_SELECT_OPTION_63009",
    trigger_count = 0
  },
  {
    config_id = 1063011,
    name = "PLATFORM_REACH_POINT_63011",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_63011",
    action = "action_EVENT_PLATFORM_REACH_POINT_63011",
    trigger_count = 0
  },
  {
    config_id = 1063012,
    name = "SELECT_OPTION_63012",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_63012",
    action = "action_EVENT_SELECT_OPTION_63012",
    trigger_count = 0
  },
  {
    config_id = 1063014,
    name = "PLATFORM_REACH_POINT_63014",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_63014",
    action = "action_EVENT_PLATFORM_REACH_POINT_63014",
    trigger_count = 0
  },
  {
    config_id = 1063015,
    name = "GROUP_LOAD_63015",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_63015",
    trigger_count = 0
  }
}
variables = {}
init_config = {
  suite = 1,
  end_suite = 2,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {63001},
    regions = {},
    triggers = {
      "SELECT_OPTION_63004",
      "SELECT_OPTION_63007",
      "SELECT_OPTION_63008",
      "SELECT_OPTION_63009",
      "PLATFORM_REACH_POINT_63011",
      "SELECT_OPTION_63012",
      "PLATFORM_REACH_POINT_63014",
      "GROUP_LOAD_63015"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      63001,
      63002,
      63003,
      63005,
      63006
    },
    regions = {},
    triggers = {
      "SELECT_OPTION_63004",
      "SELECT_OPTION_63007",
      "SELECT_OPTION_63008",
      "SELECT_OPTION_63009",
      "PLATFORM_REACH_POINT_63011",
      "SELECT_OPTION_63012",
      "PLATFORM_REACH_POINT_63014",
      "GROUP_LOAD_63015"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {63013},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_SELECT_OPTION_63004(context, evt)
  if 63003 ~= evt.param1 then
    return false
  end
  if 416 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_63004(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 63001, 107, {2}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 63002, 63, {2}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220134063, 63003, 416) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220134063, 63005, {416, 410}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 63010}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  local pos = {
    x = 335.174,
    y = 631.9067,
    z = -1496.881
  }
  local pos_follow = {
    x = 2,
    y = -2,
    z = -16
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = false,
    duration = 5,
    is_force = true,
    is_broadcast = false,
    is_recover_keep_current = true,
    delay = 0,
    is_set_follow_pos = true,
    follow_pos = pos_follow,
    is_force_walk = false,
    is_change_play_mode = false,
    is_set_screen_XY = false,
    screen_x = 0,
    screen_y = 0
  }) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_cameraLook_Begin")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_63007(context, evt)
  if 63005 ~= evt.param1 then
    return false
  end
  if 416 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_63007(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 63001, 107, {3}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 63002, 63, {3}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220134063, 63005, 416) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220134063, 63005, 410) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220134063, 63006, {410}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  local pos = {
    x = 329.7214,
    y = 631.2805,
    z = -1492.386
  }
  local pos_follow = {
    x = 2,
    y = -2,
    z = -16
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = false,
    duration = 5,
    is_force = true,
    is_broadcast = false,
    is_recover_keep_current = true,
    delay = 0,
    is_set_follow_pos = true,
    follow_pos = pos_follow,
    is_force_walk = false,
    is_change_play_mode = false,
    is_set_screen_XY = false,
    screen_x = 0,
    screen_y = 0
  }) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_cameraLook_Begin")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_63008(context, evt)
  if 63005 ~= evt.param1 then
    return false
  end
  if 410 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_63008(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 63001, 107, {1}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 63002, 63, {4}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  ScriptLib.RemoveExtraGroupSuite(context, 220134063, 3)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220134063, 63005, 416) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220134063, 63005, 410) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220134063, 63003, {416}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  local pos = {
    x = 329.7214,
    y = 631.2805,
    z = -1492.386
  }
  local pos_follow = {
    x = 2,
    y = -2,
    z = -16
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = false,
    duration = 5,
    is_force = true,
    is_broadcast = false,
    is_recover_keep_current = true,
    delay = 0,
    is_set_follow_pos = true,
    follow_pos = pos_follow,
    is_force_walk = false,
    is_change_play_mode = false,
    is_set_screen_XY = false,
    screen_x = 0,
    screen_y = 0
  }) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_cameraLook_Begin")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_63009(context, evt)
  if 63006 ~= evt.param1 then
    return false
  end
  if 410 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_63009(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 63001, 107, {2}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 63002, 63, {2}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220134063, 63006, 410) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220134063, 63005, {416, 410}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  local pos = {
    x = 329.7214,
    y = 631.2805,
    z = -1492.386
  }
  local pos_follow = {
    x = 2,
    y = -2,
    z = -16
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = false,
    duration = 5,
    is_force = true,
    is_broadcast = false,
    is_recover_keep_current = true,
    delay = 0,
    is_set_follow_pos = true,
    follow_pos = pos_follow,
    is_force_walk = false,
    is_change_play_mode = false,
    is_set_screen_XY = false,
    screen_x = 0,
    screen_y = 0
  }) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_cameraLook_Begin")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_63011(context, evt)
  if 63001 ~= evt.param1 then
    return false
  end
  if 107 ~= evt.param2 then
    return false
  end
  if 1 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_63011(context, evt)
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220134063, EntityType.GADGET, 63010) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_63012(context, evt)
  if 63003 ~= evt.param1 then
    return false
  end
  if 416 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_63012(context, evt)
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220134041, 41001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220134041, 41002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220134041, 41003, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220134041, 41004, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220134041, 41005, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220134041, 41006, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220134041, 41007, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220134041, 41008, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220134041, 41009, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_63014(context, evt)
  if 63001 ~= evt.param1 then
    return false
  end
  if 107 ~= evt.param2 then
    return false
  end
  if 2 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_63014(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220134063, 3)
  return 0
end
function action_EVENT_GROUP_LOAD_63015(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220134063, 3)
  return 0
end
