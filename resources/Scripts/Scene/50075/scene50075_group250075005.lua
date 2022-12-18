local base_info = {group_id = 250075005}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 5001,
    gadget_id = 70290483,
    pos = {
      x = 452.863,
      y = 14.145,
      z = 483.961
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5002,
    gadget_id = 70290484,
    pos = {
      x = 457.19,
      y = 13.721,
      z = 484.146
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5003,
    gadget_id = 70290485,
    pos = {
      x = 445.57,
      y = 13.952,
      z = 482.766
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5004,
    gadget_id = 70290526,
    pos = {
      x = 452.842,
      y = 13.717,
      z = 484.158
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
    gadget_id = 70290519,
    pos = {
      x = 445.827,
      y = 13.719,
      z = 482.733
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
    gadget_id = 70211002,
    pos = {
      x = 457.425,
      y = 13.728,
      z = 484.139
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    drop_tag = "\230\136\152\230\150\151\228\189\142\231\186\167\232\146\153\229\190\183",
    isOneoff = true,
    persistent = true
  },
  {
    config_id = 5007,
    gadget_id = 70290526,
    pos = {
      x = 450.616,
      y = 13.749,
      z = 489.394
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
    config_id = 1005008,
    name = "GADGET_CREATE_5008",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_5008",
    action = "action_EVENT_GADGET_CREATE_5008"
  },
  {
    config_id = 1005009,
    name = "SELECT_OPTION_5009",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_5009",
    action = "action_EVENT_SELECT_OPTION_5009"
  },
  {
    config_id = 1005010,
    name = "SELECT_OPTION_5010",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_5010",
    action = "action_EVENT_SELECT_OPTION_5010"
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
      5001,
      5002,
      5003,
      5004,
      5005,
      5006,
      5007
    },
    regions = {},
    triggers = {
      "GADGET_CREATE_5008",
      "SELECT_OPTION_5009",
      "SELECT_OPTION_5010"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_5008(context, evt)
  if 5007 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_5008(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 250075005, 5007, {1, 4}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_5009(context, evt)
  if 5007 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_5009(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 250075005, 5007, 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 5001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 5002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 5003, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_5010(context, evt)
  if 5007 ~= evt.param1 then
    return false
  end
  if 4 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_5010(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 250075005, 5007, 4) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 5001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 5002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 5003, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
