local base_info = {group_id = 220145002}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 2001,
    gadget_id = 70330236,
    pos = {
      x = 475.154,
      y = 68.926,
      z = 530.6
    },
    rot = {
      x = 0.0,
      y = 244.564,
      z = 0.0
    },
    level = 27,
    persistent = true
  },
  {
    config_id = 2002,
    gadget_id = 70330236,
    pos = {
      x = 490.245,
      y = 97.138,
      z = 507.644
    },
    rot = {
      x = 0.0,
      y = 279.255,
      z = 0.0
    },
    level = 27,
    persistent = true
  },
  {
    config_id = 2003,
    gadget_id = 70290264,
    pos = {
      x = 490.245,
      y = 97.346,
      z = 507.644
    },
    rot = {
      x = 0.0,
      y = 279.255,
      z = 0.0
    },
    level = 33
  },
  {
    config_id = 2004,
    gadget_id = 70290264,
    pos = {
      x = 475.154,
      y = 68.926,
      z = 530.6
    },
    rot = {
      x = 0.0,
      y = 244.564,
      z = 0.0
    },
    level = 27
  }
}
regions = {}
triggers = {
  {
    config_id = 1002005,
    name = "GADGET_STATE_CHANGE_2005",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_2005",
    action = "action_EVENT_GADGET_STATE_CHANGE_2005"
  },
  {
    config_id = 1002006,
    name = "GADGET_STATE_CHANGE_2006",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_2006",
    action = "action_EVENT_GADGET_STATE_CHANGE_2006",
    trigger_count = 0
  },
  {
    config_id = 1002007,
    name = "GADGET_STATE_CHANGE_2007",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_2007",
    action = "action_EVENT_GADGET_STATE_CHANGE_2007",
    trigger_count = 0
  },
  {
    config_id = 1002008,
    name = "GADGET_STATE_CHANGE_2008",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_2008",
    action = "action_EVENT_GADGET_STATE_CHANGE_2008"
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
    gadgets = {2001, 2002},
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_2005",
      "GADGET_STATE_CHANGE_2006",
      "GADGET_STATE_CHANGE_2007",
      "GADGET_STATE_CHANGE_2008"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      2001,
      2002,
      2003,
      2004
    },
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_2005",
      "GADGET_STATE_CHANGE_2006",
      "GADGET_STATE_CHANGE_2007",
      "GADGET_STATE_CHANGE_2008"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_2005(context, evt)
  if 2001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "first") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_2005(context, evt)
  local pos = {
    x = 475.1537,
    y = 68.92616,
    z = 530.6
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
function condition_EVENT_GADGET_STATE_CHANGE_2006(context, evt)
  if 2001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_2006(context, evt)
  if 0 ~= ScriptLib.GoToGroupSuite(context, 220145002, 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : goto_groupSuite")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 2002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "first", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_2007(context, evt)
  if 2002 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_2007(context, evt)
  if 0 ~= ScriptLib.GoToGroupSuite(context, 220145002, 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : goto_groupSuite")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 2001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "first", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_2008(context, evt)
  if 2002 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "first") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_2008(context, evt)
  local pos = {
    x = 490.2454,
    y = 97.138,
    z = 507.6439
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
