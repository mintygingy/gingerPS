local base_info = {group_id = 220146002}
monsters = {
  {
    config_id = 2004,
    monster_id = 26090901,
    pos = {
      x = 376.766,
      y = 75.522,
      z = 707.947
    },
    rot = {
      x = 0.0,
      y = 53.861,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101
  },
  {
    config_id = 2005,
    monster_id = 26090901,
    pos = {
      x = 384.315,
      y = 75.685,
      z = 702.823
    },
    rot = {
      x = 0.0,
      y = 347.073,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101
  },
  {
    config_id = 2006,
    monster_id = 26090701,
    pos = {
      x = 386.662,
      y = 75.666,
      z = 717.625
    },
    rot = {
      x = 0.0,
      y = 197.814,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101
  },
  {
    config_id = 2008,
    monster_id = 26090801,
    pos = {
      x = 379.834,
      y = 75.698,
      z = 715.728
    },
    rot = {
      x = 0.0,
      y = 153.563,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101
  },
  {
    config_id = 2009,
    monster_id = 26090801,
    pos = {
      x = 391.194,
      y = 75.692,
      z = 706.082
    },
    rot = {
      x = 0.0,
      y = 307.735,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101
  },
  {
    config_id = 2010,
    monster_id = 26090701,
    pos = {
      x = 392.519,
      y = 75.584,
      z = 713.63
    },
    rot = {
      x = 0.0,
      y = 254.956,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101
  }
}
npcs = {}
gadgets = {
  {
    config_id = 2001,
    gadget_id = 70290527,
    pos = {
      x = 372.564,
      y = 82.15,
      z = 687.436
    },
    rot = {
      x = 0.0,
      y = 35.001,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2002,
    gadget_id = 70290526,
    pos = {
      x = 383.96,
      y = 75.743,
      z = 709.98
    },
    rot = {
      x = 0.0,
      y = 47.461,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 2003,
    gadget_id = 70290484,
    pos = {
      x = 383.96,
      y = 75.991,
      z = 709.98
    },
    rot = {
      x = 0.0,
      y = 47.461,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2014,
    gadget_id = 70290574,
    pos = {
      x = 545.7,
      y = 106.7,
      z = 669.2
    },
    rot = {
      x = 0.0,
      y = 74.483,
      z = 0.0
    },
    level = 1
  }
}
regions = {
  {
    config_id = 2011,
    shape = RegionShape.SPHERE,
    radius = 8,
    pos = {
      x = 383.96,
      y = 76.492,
      z = 709.98
    }
  }
}
triggers = {
  {
    config_id = 1002007,
    name = "ANY_MONSTER_DIE_2007",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_2007",
    action = "action_EVENT_ANY_MONSTER_DIE_2007"
  },
  {
    config_id = 1002011,
    name = "ENTER_REGION_2011",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_2011",
    action = "action_EVENT_ENTER_REGION_2011"
  },
  {
    config_id = 1002012,
    name = "SELECT_OPTION_2012",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_2012",
    action = "action_EVENT_SELECT_OPTION_2012"
  },
  {
    config_id = 1002013,
    name = "TIME_AXIS_PASS_2013",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_2013",
    action = "action_EVENT_TIME_AXIS_PASS_2013"
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
      2001,
      2002,
      2003,
      2014
    },
    regions = {2011},
    triggers = {
      "ENTER_REGION_2011",
      "SELECT_OPTION_2012",
      "TIME_AXIS_PASS_2013"
    },
    rand_weight = 100
  },
  {
    monsters = {
      2004,
      2005,
      2006,
      2008,
      2009,
      2010
    },
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_2007"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_DIE_2007(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_2007(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 2003, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 2002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220146002, 2002, {98}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  local pos = {
    x = 383.9602,
    y = 75.97663,
    z = 709.98
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
function condition_EVENT_ENTER_REGION_2011(context, evt)
  if evt.param1 ~= 2011 then
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
function action_EVENT_ENTER_REGION_2011(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220146002, 2)
  if 0 ~= ScriptLib.ShowReminder(context, 33010175) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_2012(context, evt)
  if 2002 ~= evt.param1 then
    return false
  end
  if 98 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_2012(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220146002, 2002, 98) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  ScriptLib.InitTimeAxis(context, "OpenDoor", {1}, false)
  local pos = {
    x = 371.8532,
    y = 82.58594,
    z = 687.9339
  }
  local pos_follow = {
    x = 0,
    y = 0,
    z = 0
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = false,
    duration = 3,
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
  ScriptLib.AddExtraGroupSuite(context, 220146004, 2)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_2013(context, evt)
  if "OpenDoor" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_2013(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 2002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 2001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
