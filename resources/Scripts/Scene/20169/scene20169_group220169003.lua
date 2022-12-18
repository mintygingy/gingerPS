local base_info = {group_id = 220169003}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 3001,
    gadget_id = 70290140,
    pos = {
      x = -21.196,
      y = 0.628,
      z = 52.153
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 3002,
    gadget_id = 70290145,
    pos = {
      x = -21.81,
      y = 6.754,
      z = 51.174
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3003,
    gadget_id = 70290142,
    pos = {
      x = -21.417,
      y = 2.456,
      z = 52.157
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3004,
    gadget_id = 70290144,
    pos = {
      x = -21.452,
      y = 2.062,
      z = 51.535
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.Action01
  },
  {
    config_id = 3005,
    gadget_id = 70290144,
    pos = {
      x = -21.452,
      y = 3.229,
      z = 52.163
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.Action01
  },
  {
    config_id = 3006,
    gadget_id = 70290143,
    pos = {
      x = -21.452,
      y = 2.062,
      z = 52.746
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.Action01
  },
  {
    config_id = 3007,
    gadget_id = 70360001,
    pos = {
      x = -21.408,
      y = 1.422,
      z = 52.14
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
    config_id = 1003008,
    name = "TIME_AXIS_PASS_3008",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "",
    action = ""
  },
  {
    config_id = 1003009,
    name = "SELECT_OPTION_3009",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_3009",
    action = "action_EVENT_SELECT_OPTION_3009"
  },
  {
    config_id = 1003010,
    name = "GADGET_STATE_CHANGE_3010",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_3010",
    action = "action_EVENT_GADGET_STATE_CHANGE_3010"
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
    gadgets = {3001, 3002},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_SELECT_OPTION_3009(context, evt)
  if 3007 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_3009(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 3001, GadgetState.GearAction2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 3006, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 3004, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 3005, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 3003, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220169003, 3007, 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_3010(context, evt)
  if 3003 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_3010(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220169003, 3007, {1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
