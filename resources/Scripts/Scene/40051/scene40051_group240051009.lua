local base_info = {group_id = 240051009}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 9001,
    gadget_id = 70290526,
    pos = {
      x = 438.579,
      y = 115.533,
      z = 526.27
    },
    rot = {
      x = 0.0,
      y = 274.497,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {769}
    }
  },
  {
    config_id = 9002,
    gadget_id = 70350456,
    pos = {
      x = 448.259,
      y = 115.652,
      z = 513.893
    },
    rot = {
      x = 0.0,
      y = 313.857,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 9003,
    gadget_id = 70350456,
    pos = {
      x = 462.514,
      y = 141.922,
      z = 493.09
    },
    rot = {
      x = 3.678,
      y = 343.49,
      z = 0.237
    },
    level = 1
  },
  {
    config_id = 9004,
    gadget_id = 70290480,
    pos = {
      x = 456.076,
      y = 112.968,
      z = 505.785
    },
    rot = {
      x = 0.0,
      y = 309.838,
      z = 0.0
    },
    level = 1,
    route_id = 7,
    start_route = false
  },
  {
    config_id = 9007,
    gadget_id = 70290526,
    pos = {
      x = 486.744,
      y = 116.793,
      z = 502.736
    },
    rot = {
      x = 0.0,
      y = 94.499,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {769}
    }
  }
}
regions = {
  {
    config_id = 9006,
    shape = RegionShape.SPHERE,
    radius = 1,
    pos = {
      x = 456.254,
      y = 115.49,
      z = 506.106
    }
  }
}
triggers = {
  {
    config_id = 1009005,
    name = "SELECT_OPTION_9005",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_9005",
    action = "action_EVENT_SELECT_OPTION_9005",
    trigger_count = 0
  },
  {
    config_id = 1009006,
    name = "ENTER_REGION_9006",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_9006",
    action = "action_EVENT_ENTER_REGION_9006"
  },
  {
    config_id = 1009008,
    name = "SELECT_OPTION_9008",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_9008",
    action = "action_EVENT_SELECT_OPTION_9008",
    trigger_count = 0
  },
  {
    config_id = 1009009,
    name = "TIME_AXIS_PASS_9009",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_9009",
    action = "action_EVENT_TIME_AXIS_PASS_9009"
  },
  {
    config_id = 1009010,
    name = "TIME_AXIS_PASS_9010",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_9010",
    action = "action_EVENT_TIME_AXIS_PASS_9010"
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
    gadgets = {
      9001,
      9002,
      9003,
      9004,
      9007
    },
    regions = {9006},
    triggers = {
      "SELECT_OPTION_9005",
      "ENTER_REGION_9006",
      "SELECT_OPTION_9008",
      "TIME_AXIS_PASS_9009",
      "TIME_AXIS_PASS_9010"
    },
    rand_weight = 100
  }
}
function condition_EVENT_SELECT_OPTION_9005(context, evt)
  if 9001 ~= evt.param1 then
    return false
  end
  if 769 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_9005(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 240051009, 9001, 769) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 9001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.InitTimeAxis(context, "bridge2", {2}, false)
  local pos = {
    x = 462.5136,
    y = 141.9223,
    z = 493.0901
  }
  local pos_follow = {
    x = 440.6,
    y = 119.64,
    z = 517.33
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = false,
    duration = 4,
    is_force = true,
    is_broadcast = false,
    is_recover_keep_current = true,
    delay = 0,
    is_set_follow_pos = true,
    is_abs_follow_pos = true,
    follow_pos = pos_follow,
    is_force_walk = false,
    is_change_play_mode = false,
    disable_protect = 1,
    blend_type = 1,
    blend_duration = 0,
    is_set_screen_XY = false,
    screen_x = 0,
    screen_y = 0
  }) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_cameraLook_Begin")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_9006(context, evt)
  if evt.param1 ~= 9006 then
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
function action_EVENT_ENTER_REGION_9006(context, evt)
  if 0 ~= ScriptLib.StartPlatform(context, 9004) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_9008(context, evt)
  if 9007 ~= evt.param1 then
    return false
  end
  if 769 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_9008(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 240051009, 9007, 769) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 9007, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.InitTimeAxis(context, "bridge1", {2}, false)
  local pos = {
    x = 448.259,
    y = 115.6524,
    z = 513.8931
  }
  local pos_follow = {
    x = 475.33,
    y = 126.49,
    z = 504.77
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = false,
    duration = 4,
    is_force = true,
    is_broadcast = false,
    is_recover_keep_current = true,
    delay = 0,
    is_set_follow_pos = true,
    is_abs_follow_pos = true,
    follow_pos = pos_follow,
    is_force_walk = false,
    is_change_play_mode = false,
    disable_protect = 1,
    blend_type = 1,
    blend_duration = 0,
    is_set_screen_XY = false,
    screen_x = 0,
    screen_y = 0
  }) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_cameraLook_Begin")
    return -1
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_9009(context, evt)
  if "bridge1" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_9009(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 9002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_9010(context, evt)
  if "bridge2" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_9010(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 9003, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
