local base_info = {group_id = 251006004}
monsters = {
  {
    config_id = 4002,
    monster_id = 20010901,
    pos = {
      x = 7.935,
      y = 8.367,
      z = 78.318
    },
    rot = {
      x = 0.0,
      y = 88.403,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100
  },
  {
    config_id = 4003,
    monster_id = 20010801,
    pos = {
      x = 11.295,
      y = 8.367,
      z = 78.46
    },
    rot = {
      x = 0.0,
      y = 87.228,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100
  },
  {
    config_id = 4004,
    monster_id = 20010801,
    pos = {
      x = 10.909,
      y = 8.367,
      z = 73.704
    },
    rot = {
      x = 0.0,
      y = 49.009,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100
  },
  {
    config_id = 4005,
    monster_id = 20010801,
    pos = {
      x = 11.331,
      y = 8.367,
      z = 85.07
    },
    rot = {
      x = 0.0,
      y = 118.926,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100
  }
}
npcs = {}
gadgets = {
  {
    config_id = 4001,
    gadget_id = 70350082,
    pos = {
      x = 17.134,
      y = 8.367,
      z = 78.506
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
    gadget_id = 70360001,
    pos = {
      x = 17.508,
      y = 9.341,
      z = 78.415
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
    gadget_id = 70211011,
    pos = {
      x = 0.715,
      y = 8.367,
      z = 78.285
    },
    rot = {
      x = 0.0,
      y = 88.025,
      z = 0.0
    },
    level = 1,
    drop_tag = "\230\136\152\230\150\151\228\184\173\231\186\167\231\168\187\229\166\187",
    isOneoff = true,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1004007,
    name = "GADGET_CREATE_4007",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_4007",
    action = "action_EVENT_GADGET_CREATE_4007",
    trigger_count = 0
  },
  {
    config_id = 1004008,
    name = "SELECT_OPTION_4008",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_4008",
    action = "action_EVENT_SELECT_OPTION_4008"
  },
  {
    config_id = 1004009,
    name = "CHALLENGE_SUCCESS_4009",
    event = EventType.EVENT_CHALLENGE_SUCCESS,
    source = "180",
    condition = "",
    action = "action_EVENT_CHALLENGE_SUCCESS_4009",
    trigger_count = 0
  },
  {
    config_id = 1004011,
    name = "CHALLENGE_FAIL_4011",
    event = EventType.EVENT_CHALLENGE_FAIL,
    source = "180",
    condition = "",
    action = "action_EVENT_CHALLENGE_FAIL_4011",
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
    gadgets = {4001, 4006},
    regions = {},
    triggers = {
      "GADGET_CREATE_4007",
      "SELECT_OPTION_4008",
      "CHALLENGE_SUCCESS_4009",
      "CHALLENGE_FAIL_4011"
    },
    rand_weight = 100
  },
  {
    monsters = {
      4002,
      4003,
      4004,
      4005
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_4007(context, evt)
  if 4006 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_4007(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 251006004, 4006, {177}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_4008(context, evt)
  if 4006 ~= evt.param1 then
    return false
  end
  if 177 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_4008(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 251006004, 2)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 4006}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 4001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.ActiveChallenge(context, 180, 180, 60, 251006004, 4, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_challenge")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_SUCCESS_4009(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 4001, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 4010}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_FAIL_4011(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 4001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 4006}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  ScriptLib.RemoveExtraGroupSuite(context, 251006004, 2)
  return 0
end
