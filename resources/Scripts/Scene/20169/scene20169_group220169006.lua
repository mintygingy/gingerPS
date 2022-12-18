local base_info = {group_id = 220169006}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 6001,
    gadget_id = 70290140,
    pos = {
      x = 25.572,
      y = 77.038,
      z = -81.017
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6002,
    gadget_id = 70290145,
    pos = {
      x = 25.045,
      y = 83.199,
      z = -81.022
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6003,
    gadget_id = 70290142,
    pos = {
      x = 25.315,
      y = 79.034,
      z = -81.019
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6004,
    gadget_id = 70290144,
    pos = {
      x = 25.284,
      y = 78.567,
      z = -81.593
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6005,
    gadget_id = 70290144,
    pos = {
      x = 25.284,
      y = 79.752,
      z = -81.022
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6006,
    gadget_id = 70290143,
    pos = {
      x = 25.269,
      y = 78.57,
      z = -80.492
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6007,
    gadget_id = 70360001,
    pos = {
      x = 25.608,
      y = 77.985,
      z = -81.225
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6016,
    gadget_id = 70290833,
    pos = {
      x = 68.739,
      y = 77.47,
      z = -81.017
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {
  {
    config_id = 6014,
    shape = RegionShape.CUBIC,
    size = {
      x = 10.0,
      y = 10.0,
      z = 15.0
    },
    pos = {
      x = 47.916,
      y = 80.473,
      z = -81.017
    }
  },
  {
    config_id = 6015,
    shape = RegionShape.CUBIC,
    size = {
      x = 4.0,
      y = 6.0,
      z = 3.0
    },
    pos = {
      x = 68.739,
      y = 77.47,
      z = -81.017
    }
  }
}
triggers = {
  {
    config_id = 1006008,
    name = "TIME_AXIS_PASS_6008",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_6008",
    action = "action_EVENT_TIME_AXIS_PASS_6008"
  },
  {
    config_id = 1006009,
    name = "GADGET_STATE_CHANGE_6009",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_6009",
    action = "action_EVENT_GADGET_STATE_CHANGE_6009"
  },
  {
    config_id = 1006010,
    name = "GADGET_STATE_CHANGE_6010",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_6010",
    action = "action_EVENT_GADGET_STATE_CHANGE_6010"
  },
  {
    config_id = 1006011,
    name = "GADGET_STATE_CHANGE_6011",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_6011",
    action = "action_EVENT_GADGET_STATE_CHANGE_6011"
  },
  {
    config_id = 1006012,
    name = "SELECT_OPTION_6012",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_6012",
    action = "action_EVENT_SELECT_OPTION_6012"
  },
  {
    config_id = 1006013,
    name = "QUEST_FINISH_6013",
    event = EventType.EVENT_QUEST_FINISH,
    source = "",
    condition = "condition_EVENT_QUEST_FINISH_6013",
    action = "action_EVENT_QUEST_FINISH_6013"
  },
  {
    config_id = 1006014,
    name = "ENTER_REGION_6014",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_6014",
    action = "action_EVENT_ENTER_REGION_6014"
  },
  {
    config_id = 1006015,
    name = "ENTER_REGION_6015",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_6015",
    action = "action_EVENT_ENTER_REGION_6015"
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
    gadgets = {6001, 6002},
    regions = {6014},
    triggers = {
      "QUEST_FINISH_6013",
      "ENTER_REGION_6014"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {6016},
    regions = {6015},
    triggers = {
      "ENTER_REGION_6015"
    },
    rand_weight = 100
  }
}
function TLA_add_quest_progress(context, evt, quest_param)
  if 0 ~= ScriptLib.AddQuestProgress(context, quest_param) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function TLA_refresh_group_tosuite(context, evt, group_id, suite_id)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = group_id, suite = suite_id}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_6008(context, evt)
  if "timer1" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_6008(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220169006, 6007, {1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220169006, 6003, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_6009(context, evt)
  if 6001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.Default ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_6009(context, evt)
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220169006, 6004, GadgetState.Action01) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_6010(context, evt)
  if 6001 ~= evt.param2 or GadgetState.GearStop ~= evt.param1 or GadgetState.GearStart ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_6010(context, evt)
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220169006, 6005, GadgetState.Action01) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_6011(context, evt)
  if 6001 ~= evt.param2 or GadgetState.GearAction1 ~= evt.param1 or GadgetState.GearStop ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_6011(context, evt)
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220169006, 6006, GadgetState.Action01) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  ScriptLib.InitTimeAxis(context, "timer1", {2}, false)
  return 0
end
function condition_EVENT_SELECT_OPTION_6012(context, evt)
  if 6007 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_6012(context, evt)
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220169006, 6001, GadgetState.GearAction2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 6003}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 6006}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 6004}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 6005}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_FINISH_6013(context, evt)
  if 303118 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_6013(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 6001, GadgetState.GearAction2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_6014(context, evt)
  if evt.param1 ~= 6014 then
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
function action_EVENT_ENTER_REGION_6014(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220169006, 2)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 6016, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_6015(context, evt)
  if evt.param1 ~= 6015 then
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
function action_EVENT_ENTER_REGION_6015(context, evt)
  TLA_add_quest_progress(context, evt, "30311901")
  ScriptLib.SetWeatherAreaState(context, 10150, 1)
  TLA_refresh_group_tosuite(context, evt, 220169013, 4)
  return 0
end
