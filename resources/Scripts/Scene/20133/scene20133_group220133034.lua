local base_info = {group_id = 220133034}
local defs = {duration = 35, group_id = 220133034}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 34001,
    gadget_id = 70211111,
    pos = {
      x = 4196.102,
      y = 579.27,
      z = 233.718
    },
    rot = {
      x = 13.495,
      y = 89.78,
      z = 354.485
    },
    level = 16,
    drop_tag = "\232\167\163\232\176\156\228\184\173\231\186\167\231\190\164\229\178\155",
    isOneoff = true,
    persistent = true,
    autopick = true,
    vision_level = VisionLevelType.VISION_LEVEL_REMOTE
  },
  {
    config_id = 34002,
    gadget_id = 70350083,
    pos = {
      x = 4245.909,
      y = 571.444,
      z = 153.548
    },
    rot = {
      x = 355.944,
      y = 9.602,
      z = 351.355
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 34003,
    gadget_id = 70360001,
    pos = {
      x = 4245.909,
      y = 571.444,
      z = 153.548
    },
    rot = {
      x = 355.944,
      y = 9.602,
      z = 351.355
    },
    level = 1,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1034004,
    name = "CHALLENGE_SUCCESS_34004",
    event = EventType.EVENT_CHALLENGE_SUCCESS,
    source = "666",
    condition = "",
    action = "action_EVENT_CHALLENGE_SUCCESS_34004",
    trigger_count = 0
  },
  {
    config_id = 1034005,
    name = "CHALLENGE_FAIL_34005",
    event = EventType.EVENT_CHALLENGE_FAIL,
    source = "666",
    condition = "",
    action = "action_EVENT_CHALLENGE_FAIL_34005",
    trigger_count = 0
  },
  {
    config_id = 1034006,
    name = "GADGET_STATE_CHANGE_34006",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_34006",
    action = "action_EVENT_GADGET_STATE_CHANGE_34006",
    trigger_count = 0
  },
  {
    config_id = 1034007,
    name = "GADGET_STATE_CHANGE_34007",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_34007",
    action = "",
    tag = "202"
  },
  {
    config_id = 1034008,
    name = "GADGET_CREATE_34008",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_34008",
    action = "action_EVENT_GADGET_CREATE_34008",
    trigger_count = 0
  },
  {
    config_id = 1034009,
    name = "SELECT_OPTION_34009",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_34009",
    action = "action_EVENT_SELECT_OPTION_34009",
    trigger_count = 0
  },
  {
    config_id = 1034010,
    name = "GROUP_LOAD_34010",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_34010",
    trigger_count = 0
  }
}
variables = {}
init_config = {
  suite = 1,
  end_suite = 3,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {34002, 34003},
    regions = {},
    triggers = {
      "CHALLENGE_SUCCESS_34004",
      "CHALLENGE_FAIL_34005",
      "GADGET_STATE_CHANGE_34006",
      "GADGET_STATE_CHANGE_34007",
      "GADGET_CREATE_34008",
      "SELECT_OPTION_34009",
      "GROUP_LOAD_34010"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {34001},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {34002},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function action_EVENT_CHALLENGE_SUCCESS_34004(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 34002, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.KillExtraGroupSuite(context, 220133034, 2)
  if 0 ~= ScriptLib.GoToGroupSuite(context, 220133034, 3) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : goto_groupSuite")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_FAIL_34005(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220133034, 2)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 34002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 34003}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_34006(context, evt)
  if 34002 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_34006(context, evt)
  if 0 ~= ScriptLib.ActiveChallenge(context, 666, 202, defs.duration, 7, 202, 1) then
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, defs.group_id, 2)
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_34007(context, evt)
  if 34001 ~= evt.param2 or GadgetState.ChestOpened ~= evt.param1 then
    return false
  end
  return true
end
function condition_EVENT_GADGET_CREATE_34008(context, evt)
  if 34003 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_34008(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220133034, 34003, {177}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_34009(context, evt)
  if 34003 ~= evt.param1 then
    return false
  end
  if 177 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_34009(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 34003}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 34002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function action_EVENT_GROUP_LOAD_34010(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220133034, 2)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 34002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 34003}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  return 0
end
