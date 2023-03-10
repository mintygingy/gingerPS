local base_info = {group_id = 220146001}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 1001,
    gadget_id = 70310198,
    pos = {
      x = 367.014,
      y = 77.345,
      z = 685.428
    },
    rot = {
      x = 0.0,
      y = 107.277,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1002,
    gadget_id = 70310200,
    pos = {
      x = 322.034,
      y = 84.518,
      z = 685.095
    },
    rot = {
      x = 0.0,
      y = 86.334,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1003,
    gadget_id = 70310200,
    pos = {
      x = 353.639,
      y = 82.968,
      z = 677.223
    },
    rot = {
      x = 0.0,
      y = 46.285,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1004,
    gadget_id = 70310200,
    pos = {
      x = 346.914,
      y = 81.829,
      z = 690.022
    },
    rot = {
      x = 359.649,
      y = 315.683,
      z = 359.211
    },
    level = 1
  },
  {
    config_id = 1005,
    gadget_id = 70310199,
    pos = {
      x = 332.065,
      y = 77.445,
      z = 683.661
    },
    rot = {
      x = 0.0,
      y = 68.194,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1006,
    gadget_id = 70310201,
    pos = {
      x = 321.266,
      y = 82.248,
      z = 694.99
    },
    rot = {
      x = 0.0,
      y = 50.912,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1007,
    gadget_id = 70310201,
    pos = {
      x = 320.447,
      y = 82.21,
      z = 675.504
    },
    rot = {
      x = 0.0,
      y = 139.982,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1011,
    gadget_id = 70290485,
    pos = {
      x = 322.204,
      y = 77.357,
      z = 684.949
    },
    rot = {
      x = 0.0,
      y = 81.611,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1012,
    gadget_id = 70310201,
    pos = {
      x = 309.928,
      y = 88.85,
      z = 686.004
    },
    rot = {
      x = 0.0,
      y = 86.334,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1020,
    gadget_id = 70330255,
    pos = {
      x = 317.608,
      y = 82.508,
      z = 686.16
    },
    rot = {
      x = 315.021,
      y = 268.509,
      z = 0.0
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1001008,
    name = "GADGET_STATE_CHANGE_1008",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_1008",
    action = "action_EVENT_GADGET_STATE_CHANGE_1008"
  },
  {
    config_id = 1001009,
    name = "GADGET_STATE_CHANGE_1009",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_1009",
    action = "action_EVENT_GADGET_STATE_CHANGE_1009"
  },
  {
    config_id = 1001010,
    name = "GADGET_STATE_CHANGE_1010",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_1010",
    action = "action_EVENT_GADGET_STATE_CHANGE_1010"
  },
  {
    config_id = 1001013,
    name = "GADGET_STATE_CHANGE_1013",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_1013",
    action = "action_EVENT_GADGET_STATE_CHANGE_1013"
  },
  {
    config_id = 1001014,
    name = "GADGET_STATE_CHANGE_1014",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_1014",
    action = "action_EVENT_GADGET_STATE_CHANGE_1014",
    trigger_count = 0
  },
  {
    config_id = 1001015,
    name = "VARIABLE_CHANGE_1015",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "sum",
    condition = "condition_EVENT_VARIABLE_CHANGE_1015",
    action = "action_EVENT_VARIABLE_CHANGE_1015"
  },
  {
    config_id = 1001016,
    name = "GADGET_STATE_CHANGE_1016",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_1016",
    action = "action_EVENT_GADGET_STATE_CHANGE_1016",
    trigger_count = 0
  },
  {
    config_id = 1001017,
    name = "TIME_AXIS_PASS_1017",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "1",
    condition = "condition_EVENT_TIME_AXIS_PASS_1017",
    action = "action_EVENT_TIME_AXIS_PASS_1017",
    trigger_count = 0
  },
  {
    config_id = 1001018,
    name = "TIME_AXIS_PASS_1018",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "2",
    condition = "condition_EVENT_TIME_AXIS_PASS_1018",
    action = "action_EVENT_TIME_AXIS_PASS_1018",
    trigger_count = 0
  },
  {
    config_id = 1001019,
    name = "GADGET_STATE_CHANGE_1019",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_1019",
    action = "action_EVENT_GADGET_STATE_CHANGE_1019"
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
      1001,
      1003,
      1005,
      1011
    },
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_1008",
      "VARIABLE_CHANGE_1015",
      "GADGET_STATE_CHANGE_1019"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {1004},
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_1009"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {1002},
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_1013"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      1006,
      1007,
      1012,
      1020
    },
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_1010",
      "GADGET_STATE_CHANGE_1014",
      "GADGET_STATE_CHANGE_1016",
      "TIME_AXIS_PASS_1017",
      "TIME_AXIS_PASS_1018"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_1008(context, evt)
  if 1003 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_1008(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 1003}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220146001, 2)
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_1009(context, evt)
  if 1004 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_1009(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 1004}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220146001, 3)
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_1010(context, evt)
  if 1012 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_1010(context, evt)
  ScriptLib.EndTimeAxis(context, "1")
  ScriptLib.EndTimeAxis(context, "2")
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "sum", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 1006}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 1007}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220146001, EntityType.GADGET, 1020) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_1013(context, evt)
  if 1002 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_1013(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 1002}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220146001, 4)
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_1014(context, evt)
  if 1006 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_1014(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 1006}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  ScriptLib.InitTimeAxis(context, "1", {1}, false)
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_1015(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "sum") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_1015(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 1012}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220146005, 2)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1011, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  local pos = {
    x = 315.853,
    y = 77.28713,
    z = 685.3493
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
function condition_EVENT_GADGET_STATE_CHANGE_1016(context, evt)
  if 1007 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_1016(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 1007}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  ScriptLib.InitTimeAxis(context, "2", {1}, false)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_1017(context, evt)
  if "1" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_1017(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 1006}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_1018(context, evt)
  if "2" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_1018(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 1007}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_1019(context, evt)
  if 1005 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_1019(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 33010184) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  return 0
end
