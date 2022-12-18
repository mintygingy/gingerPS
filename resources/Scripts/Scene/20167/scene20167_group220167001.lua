local base_info = {group_id = 220167001}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 1001,
    gadget_id = 70290832,
    pos = {
      x = -13.925,
      y = 0.516,
      z = -68.895
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1002,
    gadget_id = 70290832,
    pos = {
      x = 11.913,
      y = 0.516,
      z = -41.685
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
    config_id = 1004,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 7.078,
      y = 0.516,
      z = -43.114
    }
  },
  {
    config_id = 1008,
    shape = RegionShape.SPHERE,
    radius = 4,
    pos = {
      x = -8.496,
      y = 0.516,
      z = -61.813
    }
  },
  {
    config_id = 1009,
    shape = RegionShape.SPHERE,
    radius = 4,
    pos = {
      x = 2.338,
      y = 0.516,
      z = -57.268
    }
  },
  {
    config_id = 1011,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = -6.837,
      y = 0.516,
      z = -78.254
    }
  },
  {
    config_id = 1012,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 6.233,
      y = 0.516,
      z = -54.739
    }
  }
}
triggers = {
  {
    config_id = 1001003,
    name = "QUEST_FINISH_1003",
    event = EventType.EVENT_QUEST_FINISH,
    source = "302915",
    condition = "",
    action = "action_EVENT_QUEST_FINISH_1003"
  },
  {
    config_id = 1001004,
    name = "ENTER_REGION_1004",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_1004",
    action = "action_EVENT_ENTER_REGION_1004"
  },
  {
    config_id = 1001005,
    name = "QUEST_FINISH_1005",
    event = EventType.EVENT_QUEST_FINISH,
    source = "302908",
    condition = "",
    action = "action_EVENT_QUEST_FINISH_1005"
  },
  {
    config_id = 1001008,
    name = "ENTER_REGION_1008",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_1008",
    action = "action_EVENT_ENTER_REGION_1008"
  },
  {
    config_id = 1001009,
    name = "ENTER_REGION_1009",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_1009",
    action = "action_EVENT_ENTER_REGION_1009"
  },
  {
    config_id = 1001010,
    name = "QUEST_FINISH_1010",
    event = EventType.EVENT_QUEST_FINISH,
    source = "",
    condition = "condition_EVENT_QUEST_FINISH_1010",
    action = "action_EVENT_QUEST_FINISH_1010"
  },
  {
    config_id = 1001011,
    name = "ENTER_REGION_1011",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_1011",
    action = "action_EVENT_ENTER_REGION_1011"
  },
  {
    config_id = 1001012,
    name = "ENTER_REGION_1012",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_1012",
    action = "action_EVENT_ENTER_REGION_1012"
  }
}
variables = {}
init_config = {
  suite = 1,
  end_suite = 0,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {1001, 1002},
    regions = {
      1004,
      1011,
      1012
    },
    triggers = {
      "QUEST_FINISH_1003",
      "ENTER_REGION_1004",
      "QUEST_FINISH_1005",
      "QUEST_FINISH_1010",
      "ENTER_REGION_1011",
      "ENTER_REGION_1012"
    },
    rand_weight = 100
  }
}
function TLA_active_cameralook_begin(context, evt, x, y, z, is_allow_input, duration, delay_time, is_set_follow_pos, x_follow, y_follow, z_follow, is_force_walk, is_change_play_mode, is_set_screen_XY, screen_x, screen_y)
  local pos = {
    x = x,
    y = y,
    z = z
  }
  local pos_follow = {
    x = x_follow,
    y = y_follow,
    z = z_follow
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = is_allow_input,
    duration = duration,
    is_force = true,
    is_broadcast = false,
    is_recover_keep_current = true,
    delay = delay_time,
    is_set_follow_pos = is_set_follow_pos,
    follow_pos = pos_follow,
    is_force_walk = is_force_walk,
    is_change_play_mode = is_change_play_mode,
    is_set_screen_XY = is_set_screen_XY,
    screen_x = screen_x,
    screen_y = screen_y
  }) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_cameraLook_Begin")
    return -1
  end
  return 0
end
function action_EVENT_QUEST_FINISH_1003(context, evt)
  TLA_active_cameralook_begin(context, evt, -12.89763, 1.5, -71.08803, false, 3, 0, false, 0, 0, 0, true, false, false, 0, 0)
  ScriptLib.AddQuestProgress(context, "2016701")
  return 0
end
function condition_EVENT_ENTER_REGION_1004(context, evt)
  if evt.param1 ~= 1004 then
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
function action_EVENT_ENTER_REGION_1004(context, evt)
  ScriptLib.AddQuestProgress(context, "2016702")
  return 0
end
function action_EVENT_QUEST_FINISH_1005(context, evt)
  local pos = {
    x = -3.6,
    y = 16,
    z = -14
  }
  local pos_follow = {
    x = 0,
    y = 0,
    z = 0
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = false,
    duration = 4,
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
function condition_EVENT_ENTER_REGION_1008(context, evt)
  if evt.param1 ~= 1008 then
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
function action_EVENT_ENTER_REGION_1008(context, evt)
  local pos = {
    x = -15.79274,
    y = 3.8,
    z = -46.44774
  }
  local pos_follow = {
    x = 0,
    y = 0,
    z = 0
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = true,
    duration = 2,
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
function condition_EVENT_ENTER_REGION_1009(context, evt)
  if evt.param1 ~= 1009 then
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
function action_EVENT_ENTER_REGION_1009(context, evt)
  local pos = {
    x = 23.93276,
    y = 0.5,
    z = -40.42496
  }
  local pos_follow = {
    x = 0,
    y = 0,
    z = 0
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = true,
    duration = 2,
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
function condition_EVENT_QUEST_FINISH_1010(context, evt)
  if 302914 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_1010(context, evt)
  ScriptLib.SetWeatherAreaState(context, 10175, 1)
  return 0
end
function condition_EVENT_ENTER_REGION_1011(context, evt)
  if evt.param1 ~= 1011 then
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
function action_EVENT_ENTER_REGION_1011(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_1012(context, evt)
  if evt.param1 ~= 1012 then
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
function action_EVENT_ENTER_REGION_1012(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
