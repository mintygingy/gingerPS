local base_info = {group_id = 220137004}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 4001,
    gadget_id = 70290428,
    pos = {
      x = 696.297,
      y = 73.772,
      z = -88.929
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 4007,
    gadget_id = 70360001,
    pos = {
      x = 694.383,
      y = 73.961,
      z = -89.029
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1004002,
    name = "TIME_AXIS_PASS_4002",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_4002",
    action = "action_EVENT_TIME_AXIS_PASS_4002",
    trigger_count = 0
  },
  {
    config_id = 1004003,
    name = "GROUP_LOAD_4003",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_4003",
    trigger_count = 0
  },
  {
    config_id = 1004004,
    name = "TIME_AXIS_PASS_4004",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_4004",
    action = "action_EVENT_TIME_AXIS_PASS_4004",
    trigger_count = 0
  },
  {
    config_id = 1004005,
    name = "GADGET_CREATE_4005",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_4005",
    action = "action_EVENT_GADGET_CREATE_4005",
    trigger_count = 0
  },
  {
    config_id = 1004006,
    name = "SELECT_OPTION_4006",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_4006",
    action = "action_EVENT_SELECT_OPTION_4006",
    trigger_count = 0
  },
  {
    config_id = 1004008,
    name = "GROUP_LOAD_4008",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_4008",
    trigger_count = 0
  },
  {
    config_id = 1004009,
    name = "GROUP_REFRESH_4009",
    event = EventType.EVENT_GROUP_REFRESH,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_REFRESH_4009",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "doorOpen",
    value = 0,
    no_refresh = true
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
    gadgets = {4001},
    regions = {},
    triggers = {
      "GROUP_LOAD_4003"
    },
    rand_weight = 100,
    ban_refresh = true
  },
  {
    monsters = {},
    gadgets = {4001, 4007},
    regions = {},
    triggers = {
      "TIME_AXIS_PASS_4002",
      "GROUP_LOAD_4003",
      "TIME_AXIS_PASS_4004",
      "GADGET_CREATE_4005",
      "SELECT_OPTION_4006"
    },
    rand_weight = 100,
    ban_refresh = true
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {
      "GROUP_LOAD_4008",
      "GROUP_REFRESH_4009"
    },
    rand_weight = 100,
    ban_refresh = true
  }
}
function condition_EVENT_TIME_AXIS_PASS_4002(context, evt)
  if "dooropen" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_4002(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 4001}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
function action_EVENT_GROUP_LOAD_4003(context, evt)
  if ScriptLib.GetHostQuestState(context, 4007116) == 3 or ScriptLib.GetGroupVariableValue(context, "doorOpen") == 1 then
    ScriptLib.RefreshGroup(context, {
      group_id = 0,
      refresh_level_revise = 0,
      exclude_prev = false,
      is_force_random_suite = false,
      suite = 3
    })
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_4004(context, evt)
  if "dooropen" ~= evt.source_name or 2 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_4004(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220137004, suite = 3}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_4005(context, evt)
  if 4007 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_4005(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220137004, 4007, {197}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_4006(context, evt)
  if 4007 ~= evt.param1 then
    return false
  end
  if 197 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_4006(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 60010367) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220137004, EntityType.GADGET, 4007) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  ScriptLib.InitTimeAxis(context, "dooropen", {4, 8}, false)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "DoorOpen", 1, 220137015) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220137015, 15001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "doorOpen", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function action_EVENT_GROUP_LOAD_4008(context, evt)
  if ScriptLib.GetHostQuestState(context, 4007116) == 3 then
    ScriptLib.SetGroupVariableValueByGroup(context, "DoorOpen", 1, 220137015)
    ScriptLib.SetGroupGadgetStateByConfigId(context, 220137015, 15001, GadgetState.Default)
  end
  return 0
end
function action_EVENT_GROUP_REFRESH_4009(context, evt)
  if ScriptLib.GetHostQuestState(context, 4007116) == 3 then
    ScriptLib.SetGroupVariableValueByGroup(context, "DoorOpen", 1, 220137015)
    ScriptLib.SetGroupGadgetStateByConfigId(context, 220137015, 15001, GadgetState.Default)
  end
  return 0
end
