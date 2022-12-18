local base_info = {group_id = 220132005}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 5003,
    gadget_id = 70290508,
    pos = {
      x = 429.015,
      y = 49.72,
      z = 473.619
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5004,
    gadget_id = 70220103,
    pos = {
      x = 452.527,
      y = 50.019,
      z = 513.618
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5005,
    gadget_id = 70360001,
    pos = {
      x = 429.055,
      y = 50.135,
      z = 473.588
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5006,
    gadget_id = 70211101,
    pos = {
      x = 455.813,
      y = 47.408,
      z = 514.842
    },
    rot = {
      x = 0.0,
      y = 60.0,
      z = 0.0
    },
    level = 1,
    drop_tag = "\232\167\163\232\176\156\228\189\142\231\186\167\233\161\187\229\188\165",
    isOneoff = true,
    persistent = true
  },
  {
    config_id = 5007,
    gadget_id = 70290577,
    pos = {
      x = 436.267,
      y = 45.744,
      z = 480.16
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
    config_id = 1005001,
    name = "GADGET_CREATE_5001",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_5001",
    action = "action_EVENT_GADGET_CREATE_5001"
  },
  {
    config_id = 1005002,
    name = "SELECT_OPTION_5002",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_5002",
    action = "action_EVENT_SELECT_OPTION_5002"
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
    gadgets = {
      5003,
      5004,
      5005,
      5006,
      5007
    },
    regions = {},
    triggers = {
      "GADGET_CREATE_5001",
      "SELECT_OPTION_5002"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_5001(context, evt)
  if 5005 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_5001(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220132005, 5005, {68}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_5002(context, evt)
  if 5005 ~= evt.param1 then
    return false
  end
  if 68 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_5002(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 5003, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220132005, 5005, 68) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "KeyHigh", 1, 220132011) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.ChangeGroupVariableValueByGroup(context, "KeyCount", 1, 220132011) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable_by_group")
    return -1
  end
  if ScriptLib.GetGroupVariableValueByGroup(context, "KeyCount", 220132011) ~= 3 then
    if ScriptLib.GetGroupVariableValueByGroup(context, "KeyU", 220132011) ~= 1 then
      ScriptLib.RefreshGroup(context, {group_id = 220132002, suite = 5})
      ScriptLib.RefreshGroup(context, {group_id = 220132010, suite = 1})
    else
      ScriptLib.RefreshGroup(context, {group_id = 220132010, suite = 1})
      ScriptLib.RefreshGroup(context, {group_id = 220132002, suite = 9})
    end
  else
    ScriptLib.RefreshGroup(context, {group_id = 220132011, suite = 2})
    ScriptLib.RefreshGroup(context, {group_id = 220132002, suite = 1})
    ScriptLib.RefreshGroup(context, {group_id = 220132010, suite = 1})
  end
  return 0
end
