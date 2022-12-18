local base_info = {group_id = 233738006}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 6001,
    gadget_id = 70360010,
    pos = {
      x = 0.0,
      y = -0.16,
      z = 0.0
    },
    rot = {
      x = 0.0,
      y = 0.15,
      z = 0.0
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1006003,
    name = "GADGET_CREATE_6003",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_6003",
    action = "action_EVENT_GADGET_CREATE_6003"
  },
  {
    config_id = 1006004,
    name = "SELECT_OPTION_6004",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_6004",
    action = "action_EVENT_SELECT_OPTION_6004",
    trigger_count = 0
  },
  {
    config_id = 1006005,
    name = "SELECT_OPTION_6005",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_6005",
    action = "action_EVENT_SELECT_OPTION_6005",
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
    gadgets = {6001},
    regions = {},
    triggers = {
      "GADGET_CREATE_6003",
      "SELECT_OPTION_6004",
      "SELECT_OPTION_6005"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_6003(context, evt)
  if 6001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_6003(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 233738006, 6001, {175}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_6004(context, evt)
  if 6001 ~= evt.param1 then
    return false
  end
  if 175 ~= evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValueByGroup(context, "stage", 233738005) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_6004(context, evt)
  if 0 ~= ScriptLib.SetIsAllowUseSkill(context, 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : tower_allow_use_skill")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 233738006, 6001, 175) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 233738006, 6001, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 233738007, 2)
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 233738009, 9001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 233738009, 9002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_6005(context, evt)
  if 6001 ~= evt.param1 then
    return false
  end
  if 176 ~= evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValueByGroup(context, "stage", 233738005) ~= 1 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_6005(context, evt)
  if 0 ~= ScriptLib.SetIsAllowUseSkill(context, 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : tower_allow_use_skill")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 233738006, 6001, 176) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 233738006, 6001, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 233738008, 2)
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 233738009, 9001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 233738009, 9002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
