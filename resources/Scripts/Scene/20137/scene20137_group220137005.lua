local base_info = {group_id = 220137005}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 5001,
    gadget_id = 71700418,
    pos = {
      x = 739.518,
      y = 139.121,
      z = 9.262
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5002,
    gadget_id = 70710745,
    pos = {
      x = 739.537,
      y = 140.498,
      z = 9.222
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5003,
    gadget_id = 70360001,
    pos = {
      x = 739.537,
      y = 139.121,
      z = 9.222
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 5006,
    gadget_id = 71700418,
    pos = {
      x = 759.506,
      y = 159.671,
      z = 24.697
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5007,
    gadget_id = 70710745,
    pos = {
      x = 759.525,
      y = 161.047,
      z = 24.657
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1005004,
    name = "GADGET_CREATE_5004",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_5004",
    action = "action_EVENT_GADGET_CREATE_5004",
    trigger_count = 0
  },
  {
    config_id = 1005005,
    name = "SELECT_OPTION_5005",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_5005",
    action = "action_EVENT_SELECT_OPTION_5005",
    trigger_count = 0
  },
  {
    config_id = 1005008,
    name = "GROUP_LOAD_5008",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_5008",
    action = "action_EVENT_GROUP_LOAD_5008",
    trigger_count = 0
  },
  {
    config_id = 1005009,
    name = "VARIABLE_CHANGE_5009",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_5009",
    action = "action_EVENT_VARIABLE_CHANGE_5009",
    trigger_count = 0
  },
  {
    config_id = 1005010,
    name = "GROUP_LOAD_5010",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_5010",
    trigger_count = 0
  },
  {
    config_id = 1005011,
    name = "GROUP_LOAD_5011",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_5011",
    action = "action_EVENT_GROUP_LOAD_5011",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "towerPosition",
    value = 0,
    no_refresh = true
  }
}
init_config = {
  suite = 3,
  end_suite = 0,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {5001, 5002},
    regions = {},
    triggers = {
      "GROUP_LOAD_5010"
    },
    rand_weight = 100,
    ban_refresh = true
  },
  {
    monsters = {},
    gadgets = {
      5001,
      5002,
      5003
    },
    regions = {},
    triggers = {
      "GADGET_CREATE_5004",
      "SELECT_OPTION_5005",
      "GROUP_LOAD_5011"
    },
    rand_weight = 100,
    ban_refresh = true
  },
  {
    monsters = {},
    gadgets = {5006, 5007},
    regions = {},
    triggers = {
      "GROUP_LOAD_5008",
      "VARIABLE_CHANGE_5009"
    },
    rand_weight = 100,
    ban_refresh = true
  }
}
function condition_EVENT_GADGET_CREATE_5004(context, evt)
  if 5003 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_5004(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220137005, 5003, {195}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_5005(context, evt)
  if 5003 ~= evt.param1 then
    return false
  end
  if 195 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_5005(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007118") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_5008(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220137013, 13002) then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_5008(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220137005, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_5009(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "towerPosition") ~= 1 then
    return false
  end
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220137013, 13002) then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_5009(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220137005, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function action_EVENT_GROUP_LOAD_5010(context, evt)
  if ScriptLib.GetHostQuestState(context, 4007118) == 2 then
    ScriptLib.RefreshGroup(context, {group_id = 220137005, suite = 2})
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_5011(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220137013, 13002) then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_5011(context, evt)
  if ScriptLib.GetHostQuestState(context, 4007118) == 3 then
    ScriptLib.RefreshGroup(context, {group_id = 220137005, suite = 1})
  end
  return 0
end
