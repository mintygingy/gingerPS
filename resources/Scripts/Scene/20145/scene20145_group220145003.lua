local base_info = {group_id = 220145003}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 3001,
    gadget_id = 70330236,
    pos = {
      x = 426.274,
      y = 116.326,
      z = 533.742
    },
    rot = {
      x = 0.0,
      y = 111.838,
      z = 0.0
    },
    level = 27,
    persistent = true
  },
  {
    config_id = 3002,
    gadget_id = 70330236,
    pos = {
      x = 574.626,
      y = 93.13,
      z = 512.281
    },
    rot = {
      x = 0.0,
      y = 332.374,
      z = 0.0
    },
    level = 27,
    persistent = true
  },
  {
    config_id = 3003,
    gadget_id = 70290264,
    pos = {
      x = 574.626,
      y = 93.13,
      z = 512.281
    },
    rot = {
      x = 0.0,
      y = 332.374,
      z = 0.0
    },
    level = 33
  },
  {
    config_id = 3004,
    gadget_id = 70290264,
    pos = {
      x = 426.274,
      y = 116.326,
      z = 533.742
    },
    rot = {
      x = 0.0,
      y = 111.838,
      z = 0.0
    },
    level = 27
  }
}
regions = {}
triggers = {
  {
    config_id = 1003005,
    name = "GADGET_STATE_CHANGE_3005",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_3005",
    action = "action_EVENT_GADGET_STATE_CHANGE_3005"
  },
  {
    config_id = 1003006,
    name = "GADGET_STATE_CHANGE_3006",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_3006",
    action = "action_EVENT_GADGET_STATE_CHANGE_3006",
    trigger_count = 0
  },
  {
    config_id = 1003007,
    name = "GADGET_STATE_CHANGE_3007",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_3007",
    action = "action_EVENT_GADGET_STATE_CHANGE_3007",
    trigger_count = 0
  },
  {
    config_id = 1003008,
    name = "GADGET_STATE_CHANGE_3008",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_3008",
    action = "action_EVENT_GADGET_STATE_CHANGE_3008"
  }
}
variables = {
  {
    config_id = 1,
    name = "first",
    value = 0,
    no_refresh = true
  }
}
init_config = {
  suite = 1,
  end_suite = 2,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {3001, 3002},
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_3005",
      "GADGET_STATE_CHANGE_3006",
      "GADGET_STATE_CHANGE_3007",
      "GADGET_STATE_CHANGE_3008"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      3001,
      3002,
      3003,
      3004
    },
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_3005",
      "GADGET_STATE_CHANGE_3006",
      "GADGET_STATE_CHANGE_3007",
      "GADGET_STATE_CHANGE_3008"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_3005(context, evt)
  if 3001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "first") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_3005(context, evt)
  local pos = {
    x = 433.1534,
    y = 115.5686,
    z = 528.8632
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
function condition_EVENT_GADGET_STATE_CHANGE_3006(context, evt)
  if 3001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_3006(context, evt)
  if 0 ~= ScriptLib.GoToGroupSuite(context, 220145003, 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : goto_groupSuite")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 3002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "first", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_3007(context, evt)
  if 3002 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_3007(context, evt)
  if 0 ~= ScriptLib.GoToGroupSuite(context, 220145003, 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : goto_groupSuite")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 3001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "first", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_3008(context, evt)
  if 3002 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "first") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_3008(context, evt)
  local pos = {
    x = 574.626,
    y = 93.13,
    z = 512.2806
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
