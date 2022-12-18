local base_info = {group_id = 233735002}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 2001,
    gadget_id = 70350023,
    pos = {
      x = 0.0,
      y = -0.113,
      z = -0.048
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
    config_id = 1002004,
    name = "GADGET_CREATE_2004",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_2004",
    action = "action_EVENT_GADGET_CREATE_2004"
  },
  {
    config_id = 1002005,
    name = "SELECT_OPTION_2005",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_2005",
    action = "action_EVENT_SELECT_OPTION_2005",
    trigger_count = 0
  },
  {
    config_id = 1002006,
    name = "SELECT_OPTION_2006",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_2006",
    action = "action_EVENT_SELECT_OPTION_2006",
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
    gadgets = {2001},
    regions = {},
    triggers = {
      "GADGET_CREATE_2004",
      "SELECT_OPTION_2005",
      "SELECT_OPTION_2006"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_2004(context, evt)
  if 2001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_2004(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 233735002, 2001, {175}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_2005(context, evt)
  if 2001 ~= evt.param1 then
    return false
  end
  if 175 ~= evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValueByGroup(context, "stage", 233735001) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_2005(context, evt)
  if 0 ~= ScriptLib.SetIsAllowUseSkill(context, 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : tower_allow_use_skill")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 233735002, 2001, 175) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 233735003, 2)
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 233735002, 2001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 233735009, 9001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 233735009, 9002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_2006(context, evt)
  if 2001 ~= evt.param1 then
    return false
  end
  if 176 ~= evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValueByGroup(context, "stage", 233735001) ~= 1 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_2006(context, evt)
  if 0 ~= ScriptLib.SetIsAllowUseSkill(context, 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : tower_allow_use_skill")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 233735003, 5)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 233735002, 2001, 176) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 233735002, 2001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 233735009, 9001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 233735009, 9002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
