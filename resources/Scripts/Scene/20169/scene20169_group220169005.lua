local base_info = {group_id = 220169005}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 5001,
    gadget_id = 70290141,
    pos = {
      x = 28.952,
      y = 65.783,
      z = -87.105
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5002,
    gadget_id = 70290141,
    pos = {
      x = -13.086,
      y = 54.575,
      z = -73.675
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5003,
    gadget_id = 70290141,
    pos = {
      x = 10.896,
      y = 71.99,
      z = -94.407
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5007,
    gadget_id = 70360001,
    pos = {
      x = 28.952,
      y = 66.486,
      z = -87.105
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5008,
    gadget_id = 70360001,
    pos = {
      x = -13.086,
      y = 55.266,
      z = -73.675
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5009,
    gadget_id = 70360001,
    pos = {
      x = 10.896,
      y = 72.694,
      z = -94.407
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5013,
    gadget_id = 70220048,
    pos = {
      x = 13.059,
      y = 71.99,
      z = -93.692
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5014,
    gadget_id = 70220048,
    pos = {
      x = 8.502,
      y = 71.99,
      z = -94.62
    },
    rot = {
      x = 0.0,
      y = 30.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5015,
    gadget_id = 70220050,
    pos = {
      x = 8.666,
      y = 71.99,
      z = -93.132
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5016,
    gadget_id = 70220051,
    pos = {
      x = 14.253,
      y = 71.99,
      z = -92.978
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5017,
    gadget_id = 70211101,
    pos = {
      x = 11.07,
      y = 71.99,
      z = -93.705
    },
    rot = {
      x = 0.0,
      y = 45.0,
      z = 0.0
    },
    level = 1,
    drop_tag = "\232\167\163\232\176\156\228\189\142\231\186\167\233\161\187\229\188\165",
    isOneoff = true,
    persistent = true
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
    action = "action_EVENT_GADGET_CREATE_5004"
  },
  {
    config_id = 1005005,
    name = "GADGET_CREATE_5005",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_5005",
    action = "action_EVENT_GADGET_CREATE_5005"
  },
  {
    config_id = 1005006,
    name = "GADGET_CREATE_5006",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_5006",
    action = "action_EVENT_GADGET_CREATE_5006"
  },
  {
    config_id = 1005010,
    name = "SELECT_OPTION_5010",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_5010",
    action = "action_EVENT_SELECT_OPTION_5010"
  },
  {
    config_id = 1005011,
    name = "SELECT_OPTION_5011",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_5011",
    action = "action_EVENT_SELECT_OPTION_5011"
  },
  {
    config_id = 1005012,
    name = "SELECT_OPTION_5012",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_5012",
    action = "action_EVENT_SELECT_OPTION_5012"
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
      5013,
      5014,
      5015,
      5016,
      5017
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_5004(context, evt)
  if 5007 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_5004(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptions(context, {73}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_work_options")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_5005(context, evt)
  if 5008 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_5005(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptions(context, {73}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_work_options")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_5006(context, evt)
  if 5009 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_5006(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptions(context, {73}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_work_options")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_5010(context, evt)
  if 5007 ~= evt.param1 then
    return false
  end
  if 73 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_5010(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 5001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220169005, 5007, 73) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_5011(context, evt)
  if 5008 ~= evt.param1 then
    return false
  end
  if 73 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_5011(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 5002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220169005, 5008, 73) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_5012(context, evt)
  if 5009 ~= evt.param1 then
    return false
  end
  if 73 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_5012(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 5003, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220169005, 5009, 73) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  return 0
end
