local base_info = {group_id = 220149004}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 4001,
    gadget_id = 70290465,
    pos = {
      x = 435.001,
      y = 126.491,
      z = 312.655
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 4005,
    gadget_id = 70290485,
    pos = {
      x = 435.1,
      y = 146.21,
      z = 346.78
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 4017,
    gadget_id = 70220103,
    pos = {
      x = 441.734,
      y = 161.293,
      z = 321.451
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 4018,
    gadget_id = 70290527,
    pos = {
      x = 438.455,
      y = 151.356,
      z = 342.763
    },
    rot = {
      x = 0.0,
      y = 330.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 4019,
    gadget_id = 70350177,
    pos = {
      x = 462.094,
      y = 151.66,
      z = 339.17
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 4020,
    gadget_id = 70290481,
    pos = {
      x = 435.332,
      y = 145.046,
      z = 346.666
    },
    rot = {
      x = 3.162,
      y = 24.846,
      z = 9.219
    },
    level = 1
  },
  {
    config_id = 4021,
    gadget_id = 70350177,
    pos = {
      x = 466.12,
      y = 151.66,
      z = 339.159
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {
  {
    config_id = 4002,
    shape = RegionShape.CUBIC,
    size = {
      x = 8.0,
      y = 10.0,
      z = 8.0
    },
    pos = {
      x = 446.581,
      y = 146.245,
      z = 311.347
    }
  },
  {
    config_id = 4004,
    shape = RegionShape.CUBIC,
    size = {
      x = 18.0,
      y = 5.0,
      z = 8.0
    },
    pos = {
      x = 461.025,
      y = 151.83,
      z = 334.9
    }
  }
}
triggers = {
  {
    config_id = 1004002,
    name = "ENTER_REGION_4002",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "",
    action = "action_EVENT_ENTER_REGION_4002"
  },
  {
    config_id = 1004003,
    name = "TIMER_EVENT_4003",
    event = EventType.EVENT_TIMER_EVENT,
    source = "1",
    condition = "",
    action = "action_EVENT_TIMER_EVENT_4003"
  },
  {
    config_id = 1004004,
    name = "ENTER_REGION_4004",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_4004",
    action = "action_EVENT_ENTER_REGION_4004"
  },
  {
    config_id = 1004006,
    name = "TIMER_EVENT_4006",
    event = EventType.EVENT_TIMER_EVENT,
    source = "2",
    condition = "",
    action = "action_EVENT_TIMER_EVENT_4006"
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
      4005,
      4018,
      4019,
      4020,
      4021
    },
    regions = {4002, 4004},
    triggers = {
      "ENTER_REGION_4002",
      "TIMER_EVENT_4003",
      "ENTER_REGION_4004",
      "TIMER_EVENT_4006"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {4017},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function action_EVENT_ENTER_REGION_4002(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220149014, suite = 2}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.CreateGroupTimerEvent(context, 220149004, "1", 4) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_timerevent_by_group")
    return -1
  end
  local pos = {
    x = 462.0944,
    y = 151.66,
    z = 339.17
  }
  local pos_follow = {
    x = 0,
    y = 0,
    z = 0
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = false,
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
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 4019, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 4021, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function action_EVENT_TIMER_EVENT_4003(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220149015, suite = 2}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_4004(context, evt)
  if evt.param1 ~= 4004 then
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
function action_EVENT_ENTER_REGION_4004(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220149004, 2)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 4019, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 4021, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.CreateGroupTimerEvent(context, 220149004, "2", 4) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_timerevent_by_group")
    return -1
  end
  if 0 ~= ScriptLib.CancelGroupTimerEvent(context, 220149004, "1") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : cancel_timerevent_by_group")
    return -1
  end
  if 0 ~= ScriptLib.CancelGroupTimerEvent(context, 220149014, "1") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : cancel_timerevent_by_group")
    return -1
  end
  if 0 ~= ScriptLib.CancelGroupTimerEvent(context, 220149014, "2") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : cancel_timerevent_by_group")
    return -1
  end
  if 0 ~= ScriptLib.CancelGroupTimerEvent(context, 220149014, "3") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : cancel_timerevent_by_group")
    return -1
  end
  if 0 ~= ScriptLib.CancelGroupTimerEvent(context, 220149015, "1") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : cancel_timerevent_by_group")
    return -1
  end
  if 0 ~= ScriptLib.CancelGroupTimerEvent(context, 220149015, "2") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : cancel_timerevent_by_group")
    return -1
  end
  if 0 ~= ScriptLib.CancelGroupTimerEvent(context, 220149015, "3") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : cancel_timerevent_by_group")
    return -1
  end
  return 0
end
function action_EVENT_TIMER_EVENT_4006(context, evt)
  ScriptLib.SetGroupGadgetStateByConfigId(context, 220149014, 14001, GadgetState.GearStart)
  ScriptLib.SetGroupGadgetStateByConfigId(context, 220149014, 14004, GadgetState.GearStart)
  ScriptLib.SetGroupGadgetStateByConfigId(context, 220149014, 14008, GadgetState.GearStart)
  ScriptLib.SetGroupGadgetStateByConfigId(context, 220149015, 15001, GadgetState.GearStart)
  ScriptLib.SetGroupGadgetStateByConfigId(context, 220149015, 15002, GadgetState.GearStart)
  ScriptLib.SetGroupGadgetStateByConfigId(context, 220149015, 15008, GadgetState.GearStart)
  return 0
end
