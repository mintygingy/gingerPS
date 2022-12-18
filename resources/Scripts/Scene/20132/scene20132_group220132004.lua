local base_info = {group_id = 220132004}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 4001,
    gadget_id = 70290528,
    pos = {
      x = 480.57,
      y = 22.89,
      z = 484.08
    },
    rot = {
      x = 0.0,
      y = 288.803,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 4002,
    gadget_id = 70290508,
    pos = {
      x = 487.941,
      y = 18.533,
      z = 482.8
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 4005,
    gadget_id = 70220103,
    pos = {
      x = 471.996,
      y = 35.416,
      z = 477.217
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 4006,
    gadget_id = 70290480,
    pos = {
      x = 462.567,
      y = 29.164,
      z = 475.716
    },
    rot = {
      x = 0.0,
      y = 140.0,
      z = 0.0
    },
    level = 1,
    route_id = 1
  },
  {
    config_id = 4007,
    gadget_id = 70290577,
    pos = {
      x = 445.5,
      y = 27.637,
      z = 489.0
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 4008,
    gadget_id = 70290577,
    pos = {
      x = 456.036,
      y = 23.849,
      z = 495.904
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 4009,
    gadget_id = 70220103,
    pos = {
      x = 447.826,
      y = 64.558,
      z = 466.121
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 4010,
    gadget_id = 70360001,
    pos = {
      x = 487.982,
      y = 18.956,
      z = 482.788
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 4011,
    gadget_id = 70220103,
    pos = {
      x = 433.917,
      y = 59.069,
      z = 467.109
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 4012,
    gadget_id = 70290577,
    pos = {
      x = 452.719,
      y = 27.537,
      z = 514.787
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 4013,
    gadget_id = 70290577,
    pos = {
      x = 460.779,
      y = 13.54,
      z = 489.469
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 4014,
    gadget_id = 70290577,
    pos = {
      x = 470.809,
      y = 19.439,
      z = 506.937
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
    config_id = 1004003,
    name = "GADGET_CREATE_4003",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_4003",
    action = "action_EVENT_GADGET_CREATE_4003"
  },
  {
    config_id = 1004004,
    name = "SELECT_OPTION_4004",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_4004",
    action = "action_EVENT_SELECT_OPTION_4004"
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
      4001,
      4002,
      4005,
      4006,
      4007,
      4008,
      4009,
      4010,
      4011,
      4012,
      4013,
      4014
    },
    regions = {},
    triggers = {
      "GADGET_CREATE_4003",
      "SELECT_OPTION_4004"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_4003(context, evt)
  if 4010 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_4003(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220132004, 4010, {68}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_4004(context, evt)
  if 4010 ~= evt.param1 then
    return false
  end
  if 68 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_4004(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 4002, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 4001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220132004, 4010, 68) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220132002, suite = 8}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "KeyU", 1, 220132011) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.ChangeGroupVariableValueByGroup(context, "KeyCount", 1, 220132011) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable_by_group")
    return -1
  end
  return 0
end
