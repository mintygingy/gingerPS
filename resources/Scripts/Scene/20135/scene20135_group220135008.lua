local base_info = {group_id = 220135008}
local defs = {
  fireMachineList = {8013},
  initConfig = {
    [8013] = 1
  },
  controlRelation = {},
  selectID_horizon = 613,
  selectID_vertical = 612,
  horizon_steps = {
    [8014] = {
      0,
      102,
      103,
      104
    },
    [8015] = {
      0,
      102,
      103,
      104
    },
    [8016] = {
      0,
      102,
      103,
      104
    },
    [8017] = {
      0,
      102,
      103,
      104
    },
    [8018] = {
      0,
      102,
      103,
      104
    }
  },
  vertical_steps = {
    [8014] = {
      0,
      302,
      303,
      304
    },
    [8015] = {
      0,
      302,
      303,
      304
    },
    [8016] = {
      0,
      302,
      303,
      304
    },
    [8017] = {
      0,
      102,
      103,
      104
    },
    [8018] = {
      0,
      102,
      103,
      104
    }
  },
  serve_items = {8019, 8021}
}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 8001,
    gadget_id = 70590060,
    pos = {
      x = 149.1,
      y = 79.72,
      z = 21.6
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
    config_id = 8002,
    gadget_id = 70360170,
    pos = {
      x = 151.396,
      y = 77.436,
      z = 34.464
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    persistent = true,
    worktop_config = {
      init_options = {7}
    }
  },
  {
    config_id = 8005,
    gadget_id = 70690034,
    pos = {
      x = 149.254,
      y = 76.17,
      z = 23.118
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 8006,
    gadget_id = 70310369,
    pos = {
      x = 139.508,
      y = 96.413,
      z = 21.529
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 180.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 8010,
    gadget_id = 70690036,
    pos = {
      x = 147.98,
      y = 60.701,
      z = 21.945
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 8011,
    gadget_id = 70290375,
    pos = {
      x = 165.067,
      y = 86.843,
      z = 23.89
    },
    rot = {
      x = 0.0,
      y = 269.193,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 8012,
    gadget_id = 70290375,
    pos = {
      x = 165.226,
      y = 86.884,
      z = 19.134
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 8013,
    gadget_id = 70310367,
    pos = {
      x = 157.185,
      y = 76.802,
      z = 14.078
    },
    rot = {
      x = 0.0,
      y = 271.251,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  {
    config_id = 8014,
    gadget_id = 70310368,
    pos = {
      x = 150.626,
      y = 76.802,
      z = 14.221
    },
    rot = {
      x = 0.0,
      y = 271.251,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {613}
    }
  },
  {
    config_id = 8015,
    gadget_id = 70310368,
    pos = {
      x = 150.777,
      y = 76.802,
      z = 21.102
    },
    rot = {
      x = 0.0,
      y = 271.251,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {612}
    }
  },
  {
    config_id = 8016,
    gadget_id = 70310368,
    pos = {
      x = 150.777,
      y = 96.5,
      z = 21.102
    },
    rot = {
      x = 0.0,
      y = 91.251,
      z = 180.0
    },
    level = 1,
    worktop_config = {
      init_options = {613}
    }
  },
  {
    config_id = 8017,
    gadget_id = 70310368,
    pos = {
      x = 150.841,
      y = 96.5,
      z = 24.043
    },
    rot = {
      x = 0.0,
      y = 91.251,
      z = 180.0
    },
    level = 1,
    worktop_config = {
      init_options = {613}
    }
  },
  {
    config_id = 8018,
    gadget_id = 70310368,
    pos = {
      x = 160.388,
      y = 95.884,
      z = 23.834
    },
    rot = {
      x = 0.0,
      y = 91.251,
      z = 180.0
    },
    level = 1,
    worktop_config = {
      init_options = {613}
    }
  },
  {
    config_id = 8019,
    gadget_id = 70310363,
    pos = {
      x = 160.388,
      y = 95.46,
      z = 28.583
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 180.0
    },
    level = 1,
    state = GadgetState.ChestLocked,
    isOneoff = true
  },
  {
    config_id = 8021,
    gadget_id = 70310363,
    pos = {
      x = 141.7,
      y = 96.256,
      z = 21.299
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 180.0
    },
    level = 1,
    state = GadgetState.ChestLocked,
    isOneoff = true
  },
  {
    config_id = 8022,
    gadget_id = 70310418,
    pos = {
      x = 141.7,
      y = 94.775,
      z = 21.299
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    isOneoff = true,
    persistent = true
  },
  {
    config_id = 8023,
    gadget_id = 70310418,
    pos = {
      x = 160.388,
      y = 94.049,
      z = 28.583
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop,
    isOneoff = true,
    persistent = true
  },
  {
    config_id = 8024,
    gadget_id = 70310366,
    pos = {
      x = 146.823,
      y = 85.951,
      z = 26.826
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 180.0
    },
    level = 1,
    isOneoff = true,
    persistent = true
  },
  {
    config_id = 8026,
    gadget_id = 70211166,
    pos = {
      x = 161.721,
      y = 86.996,
      z = 21.454
    },
    rot = {
      x = 0.0,
      y = 267.414,
      z = 0.0
    },
    level = 16,
    drop_tag = "\232\167\163\232\176\156\228\189\142\231\186\167\231\190\164\229\178\155",
    state = GadgetState.ChestLocked,
    isOneoff = true,
    persistent = true,
    autopick = true
  }
}
regions = {
  {
    config_id = 8033,
    shape = RegionShape.SPHERE,
    radius = 8,
    pos = {
      x = 151.396,
      y = 77.436,
      z = 34.464
    }
  },
  {
    config_id = 8034,
    shape = RegionShape.SPHERE,
    radius = 8,
    pos = {
      x = 151.396,
      y = 77.436,
      z = 34.464
    }
  }
}
triggers = {
  {
    config_id = 1008003,
    name = "SELECT_OPTION_8003",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "",
    action = "action_EVENT_SELECT_OPTION_8003",
    trigger_count = 0
  },
  {
    config_id = 1008004,
    name = "GROUP_LOAD_8004",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_8004",
    trigger_count = 0
  },
  {
    config_id = 1008007,
    name = "ANY_GADGET_DIE_8007",
    event = EventType.EVENT_ANY_GADGET_DIE,
    source = "",
    condition = "condition_EVENT_ANY_GADGET_DIE_8007",
    action = "action_EVENT_ANY_GADGET_DIE_8007",
    trigger_count = 0
  },
  {
    config_id = 1008008,
    name = "ANY_GADGET_DIE_8008",
    event = EventType.EVENT_ANY_GADGET_DIE,
    source = "",
    condition = "condition_EVENT_ANY_GADGET_DIE_8008",
    action = "action_EVENT_ANY_GADGET_DIE_8008",
    trigger_count = 0
  },
  {
    config_id = 1008020,
    name = "GADGET_STATE_CHANGE_8020",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_8020",
    action = "action_EVENT_GADGET_STATE_CHANGE_8020",
    trigger_count = 0
  },
  {
    config_id = 1008025,
    name = "GADGET_STATE_CHANGE_8025",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "",
    action = "action_EVENT_GADGET_STATE_CHANGE_8025",
    trigger_count = 0
  },
  {
    config_id = 1008027,
    name = "SELECT_OPTION_8027",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_8027",
    action = "action_EVENT_SELECT_OPTION_8027",
    trigger_count = 0
  },
  {
    config_id = 1008028,
    name = "TIME_AXIS_PASS_8028",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "temp1",
    condition = "condition_EVENT_TIME_AXIS_PASS_8028",
    action = "action_EVENT_TIME_AXIS_PASS_8028",
    trigger_count = 0
  },
  {
    config_id = 1008029,
    name = "TIME_AXIS_PASS_8029",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "temp2",
    condition = "condition_EVENT_TIME_AXIS_PASS_8029",
    action = "action_EVENT_TIME_AXIS_PASS_8029",
    trigger_count = 0
  },
  {
    config_id = 1008030,
    name = "GADGET_STATE_CHANGE_8030",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_8030",
    action = "action_EVENT_GADGET_STATE_CHANGE_8030",
    trigger_count = 0
  },
  {
    config_id = 1008031,
    name = "QUEST_START_8031",
    event = EventType.EVENT_QUEST_START,
    source = "4006610",
    condition = "condition_EVENT_QUEST_START_8031",
    action = "action_EVENT_QUEST_START_8031",
    trigger_count = 0
  },
  {
    config_id = 1008032,
    name = "GROUP_LOAD_8032",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_8032",
    action = "action_EVENT_GROUP_LOAD_8032",
    trigger_count = 0
  },
  {
    config_id = 1008033,
    name = "ENTER_REGION_8033",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_8033",
    action = "action_EVENT_ENTER_REGION_8033",
    trigger_count = 0
  },
  {
    config_id = 1008034,
    name = "ENTER_REGION_8034",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_8034",
    action = "action_EVENT_ENTER_REGION_8034",
    trigger_count = 0
  },
  {
    config_id = 1008035,
    name = "GROUP_LOAD_8035",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_8035",
    action = "action_EVENT_GROUP_LOAD_8035",
    trigger_count = 0
  },
  {
    config_id = 1008036,
    name = "GROUP_LOAD_8036",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_8036",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 3,
    name = "turn",
    value = 1,
    no_refresh = true
  },
  {
    config_id = 1,
    name = "room",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 2,
    name = "chest",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 4,
    name = "open1",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 5,
    name = "open2",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 6,
    name = "isLock_1",
    value = 1,
    no_refresh = true
  },
  {
    config_id = 7,
    name = "isLock_2",
    value = 1,
    no_refresh = true
  }
}
garbages = {
  gadgets = {
    {
      config_id = 8009,
      gadget_id = 70310386,
      pos = {
        x = 161.603,
        y = 87.316,
        z = 21.427
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1,
      isOneoff = true
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
      8001,
      8002,
      8005,
      8006,
      8011,
      8012,
      8013,
      8014,
      8015,
      8016,
      8017,
      8018,
      8019,
      8021,
      8022,
      8023,
      8024,
      8026
    },
    regions = {8033, 8034},
    triggers = {
      "SELECT_OPTION_8003",
      "GROUP_LOAD_8004",
      "ANY_GADGET_DIE_8007",
      "ANY_GADGET_DIE_8008",
      "GADGET_STATE_CHANGE_8020",
      "GADGET_STATE_CHANGE_8025",
      "SELECT_OPTION_8027",
      "TIME_AXIS_PASS_8028",
      "TIME_AXIS_PASS_8029",
      "GADGET_STATE_CHANGE_8030",
      "QUEST_START_8031",
      "GROUP_LOAD_8032",
      "ENTER_REGION_8033",
      "ENTER_REGION_8034",
      "GROUP_LOAD_8035",
      "GROUP_LOAD_8036"
    },
    rand_weight = 100
  }
}
function action_EVENT_SELECT_OPTION_8003(context, evt)
  if evt.param2 == 7 and ScriptLib.GetGroupVariableValue(context, "turn") == 0 then
    ScriptLib.SetGroupVariableValueByGroup(context, "room5", 1, 220135003)
    ScriptLib.SetGroupVariableValue(context, "turn", 1)
    ScriptLib.SetPlatformPointArray(context, 8001, 8, {1}, {
      route_type = RouteType.OneWay,
      turn_mode = true,
      record_mode = RouteRecordMode.Prereach,
      speed_level = 0,
      arrive_range = 0
    })
    ScriptLib.KillEntityByConfigId(context, {
      group_id = 220135008,
      config_id = 8010,
      entity_type = EntityType.GADGET
    })
    ScriptLib.InitTimeAxis(context, "temp1", {3}, false)
    if ScriptLib.GetGroupVariableValue(context, "room") == 1 then
      ScriptLib.SetGadgetStateByConfigId(context, 8006, GadgetState.GearStart)
    end
    if ScriptLib.GetGroupVariableValue(context, "open1") == 0 then
      ScriptLib.SetGadgetStateByConfigId(context, 8011, GadgetState.Default)
    end
    if ScriptLib.GetGroupVariableValue(context, "open2") == 0 then
      ScriptLib.SetGadgetStateByConfigId(context, 8012, GadgetState.Default)
    end
    ScriptLib.SetGadgetStateByConfigId(context, 8002, GadgetState.Default)
  elseif evt.param2 == 7 and ScriptLib.GetGroupVariableValue(context, "turn") == 1 then
    ScriptLib.SetGroupVariableValueByGroup(context, "room5", 0, 220135003)
    ScriptLib.SetGroupVariableValue(context, "turn", 0)
    ScriptLib.SetPlatformPointArray(context, 8001, 8, {2}, {
      route_type = RouteType.OneWay,
      turn_mode = true,
      record_mode = RouteRecordMode.Prereach,
      speed_level = 0,
      arrive_range = 0
    })
    ScriptLib.SetGadgetStateByConfigId(context, 8006, GadgetState.Default)
    ScriptLib.KillEntityByConfigId(context, {
      group_id = 220135008,
      config_id = 8005,
      entity_type = EntityType.GADGET
    })
    ScriptLib.InitTimeAxis(context, "temp2", {3}, false)
    if ScriptLib.GetGroupVariableValue(context, "open1") == 0 then
      ScriptLib.SetGadgetStateByConfigId(context, 8011, GadgetState.ChestLocked)
    end
    if ScriptLib.GetGroupVariableValue(context, "open2") == 0 then
      ScriptLib.SetGadgetStateByConfigId(context, 8012, GadgetState.ChestLocked)
    end
    ScriptLib.SetGadgetStateByConfigId(context, 8002, GadgetState.GearStart)
  end
  return 0
end
function action_EVENT_GROUP_LOAD_8004(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "turn") == 0 then
    ScriptLib.SetPlatformPointArray(context, 8001, 9, {1}, {
      route_type = RouteType.OneWay,
      turn_mode = true,
      record_mode = RouteRecordMode.Reach,
      speed_level = 0,
      arrive_range = 0
    })
    ScriptLib.KillEntityByConfigId(context, {
      group_id = 220135008,
      config_id = 8005,
      entity_type = EntityType.GADGET
    })
    ScriptLib.CreateGadget(context, {config_id = 8010})
    if ScriptLib.GetGroupVariableValue(context, "open1") == 0 then
      ScriptLib.SetGadgetStateByConfigId(context, 8011, GadgetState.ChestLocked)
    end
    if ScriptLib.GetGroupVariableValue(context, "open2") == 0 then
      ScriptLib.SetGadgetStateByConfigId(context, 8012, GadgetState.ChestLocked)
    end
  end
  return 0
end
function condition_EVENT_ANY_GADGET_DIE_8007(context, evt)
  if 8022 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_GADGET_DIE_8007(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "isLock_2", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 8021, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_GADGET_DIE_8008(context, evt)
  if 8023 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_GADGET_DIE_8008(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "isLock_1", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 8019, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_8020(context, evt)
  if 8011 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_8020(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "open1", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function action_EVENT_GADGET_STATE_CHANGE_8025(context, evt)
  if ScriptLib.GetGadgetStateByConfigId(context, 0, 8012) == 201 and ScriptLib.GetGadgetStateByConfigId(context, 0, 8011) == 201 and ScriptLib.GetGroupVariableValue(context, "room") == 0 then
    ScriptLib.SetGroupVariableValue(context, "room", 1)
    ScriptLib.SetGadgetStateByConfigId(context, 8026, GadgetState.Default)
    ScriptLib.AddQuestProgress(context, "4006610")
    if ScriptLib.GetGroupVariableValue(context, "turn") == 1 then
      ScriptLib.SetGadgetStateByConfigId(context, 8006, GadgetState.GearStart)
      ScriptLib.BeginCameraSceneLook(context, {
        look_pos = {
          x = 139.5,
          y = 94.5,
          z = 21.5
        },
        duration = 2,
        is_force = false,
        is_broadcast = false,
        is_recover_keep_current = true,
        delay = 0,
        is_set_follow_pos = false,
        follow_pos = {
          x = 0,
          y = 0,
          z = 0
        },
        is_force_walk = true,
        is_change_play_mode = true,
        screen_x = 0,
        screen_y = 0,
        is_set_screenXY = false,
        other_params = {},
        keep_rot_type = KeepRotType.KEEP_ROT_X,
        custom_radius = 0
      })
    end
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_8027(context, evt)
  if 8002 ~= evt.param1 then
    return false
  end
  if 7 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_8027(context, evt)
  local pos = {
    x = 149.1,
    y = 79.72,
    z = 21.6
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
function condition_EVENT_TIME_AXIS_PASS_8028(context, evt)
  if "temp1" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_8028(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 8005}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_8029(context, evt)
  if "temp2" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_8029(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 8010}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_8030(context, evt)
  if 8012 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_8030(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "open2", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_START_8031(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220135008, 8006) then
    return false
  end
  return true
end
function action_EVENT_QUEST_START_8031(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4006610") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_8032(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220135008, 8006) then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_8032(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4006610") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_8033(context, evt)
  if evt.param1 ~= 8033 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValueByGroup(context, "turn", 220135002) ~= 1 then
    return false
  end
  if ScriptLib.CheckSceneTag(context, 20135, 1073) ~= true then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_8033(context, evt)
  ScriptLib.ChangeToTargetLevelTag(context, 37)
  return 0
end
function condition_EVENT_ENTER_REGION_8034(context, evt)
  if evt.param1 ~= 8034 then
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
function action_EVENT_ENTER_REGION_8034(context, evt)
  ScriptLib.ActivateDungeonCheckPoint(context, 13)
  return 0
end
function condition_EVENT_GROUP_LOAD_8035(context, evt)
  if GadgetState.GearStop ~= ScriptLib.GetGadgetStateByConfigId(context, 220135008, 8024) then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_8035(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 8024, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function action_EVENT_GROUP_LOAD_8036(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "turn") == 1 then
    ScriptLib.SetGadgetStateByConfigId(context, 8002, GadgetState.Default)
  else
    ScriptLib.SetGadgetStateByConfigId(context, 8002, GadgetState.GearStart)
  end
  return 0
end
require("V2_8/FireMachineColorHandle")
require("V2_8/KazuhaServeItem")
