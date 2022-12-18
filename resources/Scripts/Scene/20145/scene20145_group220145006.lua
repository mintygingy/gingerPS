local base_info = {group_id = 220145006}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 6001,
    gadget_id = 70290484,
    pos = {
      x = 460.167,
      y = 95.733,
      z = 535.074
    },
    rot = {
      x = 0.0,
      y = 172.706,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6002,
    gadget_id = 70290508,
    pos = {
      x = 460.167,
      y = 95.733,
      z = 535.074
    },
    rot = {
      x = 0.0,
      y = 172.706,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 6003,
    gadget_id = 70310200,
    pos = {
      x = 462.677,
      y = 100.0,
      z = 539.32
    },
    rot = {
      x = 0.0,
      y = 307.82,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6004,
    gadget_id = 70310200,
    pos = {
      x = 454.947,
      y = 100.0,
      z = 536.607
    },
    rot = {
      x = 0.0,
      y = 19.242,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6009,
    gadget_id = 70360001,
    pos = {
      x = 460.167,
      y = 95.733,
      z = 535.074
    },
    rot = {
      x = 0.0,
      y = 172.706,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {220}
    }
  },
  {
    config_id = 6010,
    gadget_id = 70900201,
    pos = {
      x = 460.167,
      y = 98.389,
      z = 535.074
    },
    rot = {
      x = 0.0,
      y = 172.706,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6011,
    gadget_id = 70310200,
    pos = {
      x = 460.555,
      y = 102.405,
      z = 530.402
    },
    rot = {
      x = 0.0,
      y = 346.17,
      z = 0.0
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1006005,
    name = "GADGET_STATE_CHANGE_6005",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_6005",
    action = "action_EVENT_GADGET_STATE_CHANGE_6005",
    trigger_count = 0
  },
  {
    config_id = 1006006,
    name = "GADGET_STATE_CHANGE_6006",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_6006",
    action = "action_EVENT_GADGET_STATE_CHANGE_6006",
    trigger_count = 0
  },
  {
    config_id = 1006007,
    name = "VARIABLE_CHANGE_6007",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "sum",
    condition = "condition_EVENT_VARIABLE_CHANGE_6007",
    action = "action_EVENT_VARIABLE_CHANGE_6007",
    trigger_count = 0
  },
  {
    config_id = 1006008,
    name = "SELECT_OPTION_6008",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_6008",
    action = "action_EVENT_SELECT_OPTION_6008",
    trigger_count = 0
  },
  {
    config_id = 1006012,
    name = "GADGET_STATE_CHANGE_6012",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_6012",
    action = "action_EVENT_GADGET_STATE_CHANGE_6012",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "sum",
    value = 0,
    no_refresh = false
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
      6001,
      6002,
      6003,
      6004,
      6010,
      6011
    },
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_6005",
      "GADGET_STATE_CHANGE_6006",
      "VARIABLE_CHANGE_6007",
      "SELECT_OPTION_6008",
      "GADGET_STATE_CHANGE_6012"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {6009},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_6005(context, evt)
  if 6003 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_6005(context, evt)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "sum", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_6006(context, evt)
  if 6004 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_6006(context, evt)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "sum", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_6007(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "sum") ~= 3 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_6007(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 6001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  local pos = {
    x = 460.5,
    y = 96.39041,
    z = 534.6149
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
  ScriptLib.AddExtraGroupSuite(context, 220145006, 2)
  return 0
end
function condition_EVENT_SELECT_OPTION_6008(context, evt)
  if 6009 ~= evt.param1 then
    return false
  end
  if 220 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_6008(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220145006, 6009, 220) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 6002, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.ChangeGroupVariableValueByGroup(context, "KeyNum", 1, 220145001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 6010}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.ShowReminder(context, -993956595) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_6012(context, evt)
  if 6011 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_6012(context, evt)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "sum", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
