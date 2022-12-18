local base_info = {group_id = 220135004}
local defs = {
  fireMachineList = {4008},
  initConfig = {
    [4008] = 1
  },
  controlRelation = {},
  selectID_horizon = 613,
  selectID_vertical = 612,
  horizon_steps = {
    [4016] = {
      0,
      102,
      103,
      104
    },
    [4017] = {
      0,
      102,
      103,
      104
    },
    [4018] = {
      0,
      102,
      103,
      104
    }
  },
  vertical_steps = {
    [4016] = {
      0,
      302,
      303,
      304
    },
    [4017] = {
      0,
      302,
      303,
      304
    },
    [4018] = {
      0,
      302,
      303,
      304
    }
  },
  serve_items = {4007, 4014}
}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 4001,
    gadget_id = 70590060,
    pos = {
      x = 69.38,
      y = 130.0,
      z = 69.38
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    start_route = false,
    persistent = true,
    is_use_point_array = true,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  {
    config_id = 4002,
    gadget_id = 70290375,
    pos = {
      x = 69.718,
      y = 127.91,
      z = 75.342
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 4003,
    gadget_id = 70360170,
    pos = {
      x = 87.801,
      y = 128.92,
      z = 67.045
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    persistent = true,
    worktop_config = {
      init_options = {7}
    }
  },
  {
    config_id = 4006,
    gadget_id = 70290375,
    pos = {
      x = 69.214,
      y = 127.91,
      z = 63.457
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 4007,
    gadget_id = 70310363,
    pos = {
      x = 77.387,
      y = 146.525,
      z = 92.772
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 180.0
    },
    level = 1,
    state = GadgetState.GearStart,
    isOneoff = true
  },
  {
    config_id = 4008,
    gadget_id = 70310367,
    pos = {
      x = 73.078,
      y = 146.2,
      z = 90.99
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 180.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  {
    config_id = 4009,
    gadget_id = 70310369,
    pos = {
      x = 59.331,
      y = 127.17,
      z = 69.343
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 4012,
    gadget_id = 70690034,
    pos = {
      x = 63.911,
      y = 113.252,
      z = 68.326
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 4013,
    gadget_id = 70290375,
    pos = {
      x = 62.681,
      y = 146.789,
      z = 72.193
    },
    rot = {
      x = 0.0,
      y = 121.871,
      z = 180.0
    },
    level = 1,
    state = GadgetState.GearStart,
    persistent = true
  },
  {
    config_id = 4014,
    gadget_id = 70310363,
    pos = {
      x = 69.411,
      y = 136.613,
      z = 69.407
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 180.0
    },
    level = 1,
    state = GadgetState.GearStart,
    isOneoff = true
  },
  {
    config_id = 4016,
    gadget_id = 70310368,
    pos = {
      x = 73.078,
      y = 146.2,
      z = 83.306
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 180.0
    },
    level = 1,
    worktop_config = {
      init_options = {613}
    }
  },
  {
    config_id = 4017,
    gadget_id = 70310368,
    pos = {
      x = 66.913,
      y = 146.2,
      z = 83.306
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 180.0
    },
    level = 1,
    worktop_config = {
      init_options = {613}
    }
  },
  {
    config_id = 4018,
    gadget_id = 70310368,
    pos = {
      x = 66.913,
      y = 146.2,
      z = 72.616
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 180.0
    },
    level = 1,
    worktop_config = {
      init_options = {613}
    }
  },
  {
    config_id = 4019,
    gadget_id = 70310418,
    pos = {
      x = 62.681,
      y = 145.344,
      z = 72.193
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    isOneoff = true,
    persistent = true
  }
}
regions = {
  {
    config_id = 4023,
    shape = RegionShape.SPHERE,
    radius = 8,
    pos = {
      x = 87.801,
      y = 128.92,
      z = 67.045
    }
  }
}
triggers = {
  {
    config_id = 1004004,
    name = "SELECT_OPTION_4004",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_4004",
    action = "action_EVENT_SELECT_OPTION_4004",
    trigger_count = 0
  },
  {
    config_id = 1004005,
    name = "GROUP_LOAD_4005",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_4005",
    trigger_count = 0
  },
  {
    config_id = 1004010,
    name = "GADGET_STATE_CHANGE_4010",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "",
    action = "action_EVENT_GADGET_STATE_CHANGE_4010",
    trigger_count = 0
  },
  {
    config_id = 1004011,
    name = "QUEST_START_4011",
    event = EventType.EVENT_QUEST_START,
    source = "4006604",
    condition = "condition_EVENT_QUEST_START_4011",
    action = "action_EVENT_QUEST_START_4011",
    trigger_count = 0
  },
  {
    config_id = 1004015,
    name = "GROUP_LOAD_4015",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_4015",
    action = "action_EVENT_GROUP_LOAD_4015",
    trigger_count = 0
  },
  {
    config_id = 1004020,
    name = "ANY_GADGET_DIE_4020",
    event = EventType.EVENT_ANY_GADGET_DIE,
    source = "",
    condition = "condition_EVENT_ANY_GADGET_DIE_4020",
    action = "action_EVENT_ANY_GADGET_DIE_4020"
  },
  {
    config_id = 1004021,
    name = "SELECT_OPTION_4021",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "",
    action = "action_EVENT_SELECT_OPTION_4021",
    trigger_count = 0
  },
  {
    config_id = 1004022,
    name = "TIME_AXIS_PASS_4022",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "createwind",
    condition = "condition_EVENT_TIME_AXIS_PASS_4022",
    action = "action_EVENT_TIME_AXIS_PASS_4022",
    trigger_count = 0
  },
  {
    config_id = 1004023,
    name = "ENTER_REGION_4023",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_4023",
    action = "action_EVENT_ENTER_REGION_4023",
    trigger_count = 0
  },
  {
    config_id = 1004024,
    name = "GROUP_LOAD_4024",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_4024",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "turn",
    value = 1,
    no_refresh = true
  },
  {
    config_id = 2,
    name = "test",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 3,
    name = "wind",
    value = 0,
    no_refresh = true
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
      4001,
      4002,
      4003,
      4006,
      4007,
      4008,
      4009,
      4013,
      4014,
      4016,
      4017,
      4018,
      4019
    },
    regions = {4023},
    triggers = {
      "SELECT_OPTION_4004",
      "GROUP_LOAD_4005",
      "GADGET_STATE_CHANGE_4010",
      "QUEST_START_4011",
      "GROUP_LOAD_4015",
      "ANY_GADGET_DIE_4020",
      "SELECT_OPTION_4021",
      "TIME_AXIS_PASS_4022",
      "ENTER_REGION_4023",
      "GROUP_LOAD_4024"
    },
    rand_weight = 100
  }
}
function condition_EVENT_SELECT_OPTION_4004(context, evt)
  if 4003 ~= evt.param1 then
    return false
  end
  if 7 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_4004(context, evt)
  local pos = {
    x = 59,
    y = 130,
    z = 69.38
  }
  local pos_follow = {
    x = 0,
    y = 0,
    z = 0
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = false,
    duration = 3.5,
    is_force = true,
    is_broadcast = false,
    is_recover_keep_current = true,
    delay = 0,
    is_set_follow_pos = false,
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
function action_EVENT_GROUP_LOAD_4005(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "turn") == 0 then
    ScriptLib.SetPlatformPointArray(context, 4001, 5, {1}, {
      route_type = RouteType.OneWay,
      turn_mode = true,
      record_mode = RouteRecordMode.Reach,
      speed_level = 0,
      arrive_range = 0
    })
    if ScriptLib.GetGroupVariableValue(context, "wind") == 1 then
      ScriptLib.CreateGadget(context, {config_id = 4012})
    end
  end
  return 0
end
function action_EVENT_GADGET_STATE_CHANGE_4010(context, evt)
  if ScriptLib.GetGadgetStateByConfigId(context, 0, 4002) == 201 and ScriptLib.GetGadgetStateByConfigId(context, 0, 4006) == 201 and ScriptLib.GetGroupVariableValue(context, "test") == 0 then
    ScriptLib.AddQuestProgress(context, "4006604")
    ScriptLib.SetGadgetStateByConfigId(context, 4009, GadgetState.GearStart)
    ScriptLib.SetGroupVariableValue(context, "test", 1)
  end
  return 0
end
function condition_EVENT_QUEST_START_4011(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220135004, 4009) then
    return false
  end
  return true
end
function action_EVENT_QUEST_START_4011(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4006604") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_4015(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220135004, 4009) then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_4015(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4006604") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_GADGET_DIE_4020(context, evt)
  if 4019 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_GADGET_DIE_4020(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 4012}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "wind", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function action_EVENT_SELECT_OPTION_4021(context, evt)
  if evt.param1 == 4003 and evt.param2 == 7 and ScriptLib.GetGroupVariableValue(context, "turn") == 0 then
    ScriptLib.SetGroupVariableValue(context, "turn", 1)
    ScriptLib.SetPlatformPointArray(context, 4001, 4, {1}, {
      route_type = RouteType.OneWay,
      turn_mode = true,
      record_mode = RouteRecordMode.Prereach,
      speed_level = 0,
      arrive_range = 0
    })
    ScriptLib.KillEntityByConfigId(context, {
      group_id = 220135004,
      config_id = 4012,
      entity_type = EntityType.GADGET
    })
    if ScriptLib.GetGroupVariableValue(context, "test") == 1 then
      ScriptLib.SetGadgetStateByConfigId(context, 4009, GadgetState.GearStart)
    end
    ScriptLib.SetGadgetStateByConfigId(context, 4003, GadgetState.Default)
  elseif evt.param1 == 4003 and evt.param2 == 7 and ScriptLib.GetGroupVariableValue(context, "turn") == 1 then
    ScriptLib.SetGroupVariableValue(context, "turn", 0)
    ScriptLib.SetPlatformPointArray(context, 4001, 4, {2}, {
      route_type = RouteType.OneWay,
      turn_mode = true,
      record_mode = RouteRecordMode.Prereach,
      speed_level = 0,
      arrive_range = 0
    })
    ScriptLib.SetGadgetStateByConfigId(context, 4009, GadgetState.Default)
    if ScriptLib.GetGroupVariableValue(context, "wind") == 1 then
      ScriptLib.InitTimeAxis(context, "createwind", {3}, false)
    end
    ScriptLib.SetGroupGadgetStateByConfigId(context, 0, 4003, GadgetState.GearStart)
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_4022(context, evt)
  if "createwind" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_4022(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 4012}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_4023(context, evt)
  if evt.param1 ~= 4023 then
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
function action_EVENT_ENTER_REGION_4023(context, evt)
  ScriptLib.ActivateDungeonCheckPoint(context, 3)
  return 0
end
function action_EVENT_GROUP_LOAD_4024(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "turn") == 1 then
    ScriptLib.SetGadgetStateByConfigId(context, 4003, GadgetState.Default)
  else
    ScriptLib.SetGadgetStateByConfigId(context, 4003, GadgetState.GearStart)
  end
  return 0
end
require("V2_8/FireMachineColorHandle")
require("V2_8/KazuhaServeItem")
