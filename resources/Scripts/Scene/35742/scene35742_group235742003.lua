local base_info = {group_id = 235742003}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 3001,
    gadget_id = 70360010,
    pos = {
      x = 0.022,
      y = -0.45,
      z = 10.125
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1003002,
    name = "GADGET_CREATE_3002",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_3002",
    action = "action_EVENT_GADGET_CREATE_3002"
  },
  {
    config_id = 1003003,
    name = "SELECT_OPTION_3003",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_3003",
    action = "action_EVENT_SELECT_OPTION_3003",
    trigger_count = 0
  },
  {
    config_id = 1003004,
    name = "SELECT_OPTION_3004",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_3004",
    action = "action_EVENT_SELECT_OPTION_3004",
    trigger_count = 0
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
    gadgets = {3001},
    regions = {},
    triggers = {
      "GADGET_CREATE_3002",
      "SELECT_OPTION_3003",
      "SELECT_OPTION_3004"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_3002(context, evt)
  if 3001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_3002(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 235742003, 3001, {175}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_3003(context, evt)
  if 3001 ~= evt.param1 then
    return false
  end
  if 175 ~= evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValueByGroup(context, "stage", 235742002) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_3003(context, evt)
  if 0 ~= ScriptLib.SetIsAllowUseSkill(context, 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : tower_allow_use_skill")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 235742004, 2)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 235742003, 3001, 175) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 235742003, 3001, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 235742001, 1001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 235742001, 1002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_3004(context, evt)
  if 3001 ~= evt.param1 then
    return false
  end
  if 176 ~= evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValueByGroup(context, "stage", 235742002) ~= 1 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_3004(context, evt)
  if 0 ~= ScriptLib.SetIsAllowUseSkill(context, 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : tower_allow_use_skill")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 235742005, 2)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 235742003, 3001, 176) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 235742003, 3001, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 3001}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 235742001, 1001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 235742001, 1002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
