local base_info = {group_id = 250075002}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 2001,
    gadget_id = 70290526,
    pos = {
      x = 458.949,
      y = 13.471,
      z = 498.015
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
    config_id = 1002002,
    name = "GADGET_CREATE_2002",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_2002",
    action = "action_EVENT_GADGET_CREATE_2002"
  },
  {
    config_id = 1002003,
    name = "SELECT_OPTION_2003",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_2003",
    action = "action_EVENT_SELECT_OPTION_2003"
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
      "GADGET_CREATE_2002",
      "SELECT_OPTION_2003"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_2002(context, evt)
  if 2001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_2002(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 250075002, 2001, {7}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_2003(context, evt)
  if 2001 ~= evt.param1 then
    return false
  end
  if 7 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_2003(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 250075002, 2001, 7) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 2001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 250075004, 4001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
