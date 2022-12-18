local base_info = {group_id = 220133046}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 46001,
    gadget_id = 70310306,
    pos = {
      x = -8.372,
      y = 144.928,
      z = 614.72
    },
    rot = {
      x = 4.995,
      y = 171.559,
      z = 8.905
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 46002,
    gadget_id = 70310298,
    pos = {
      x = -8.372,
      y = 144.928,
      z = 614.72
    },
    rot = {
      x = 4.995,
      y = 171.559,
      z = 8.905
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1046003,
    name = "QUEST_FINISH_46003",
    event = EventType.EVENT_QUEST_FINISH,
    source = "4006923",
    condition = "condition_EVENT_QUEST_FINISH_46003",
    action = "action_EVENT_QUEST_FINISH_46003",
    trigger_count = 0
  },
  {
    config_id = 1046004,
    name = "GROUP_REFRESH_46004",
    event = EventType.EVENT_GROUP_REFRESH,
    source = "",
    condition = "condition_EVENT_GROUP_REFRESH_46004",
    action = "action_EVENT_GROUP_REFRESH_46004"
  },
  {
    config_id = 1046005,
    name = "GADGET_STATE_CHANGE_46005",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_46005",
    action = "action_EVENT_GADGET_STATE_CHANGE_46005",
    trigger_count = 0
  },
  {
    config_id = 1046006,
    name = "QUEST_START_46006",
    event = EventType.EVENT_QUEST_START,
    source = "4006923",
    condition = "",
    action = "action_EVENT_QUEST_START_46006",
    trigger_count = 0
  },
  {
    config_id = 1046007,
    name = "GADGET_STATE_CHANGE_46007",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_46007",
    action = "action_EVENT_GADGET_STATE_CHANGE_46007",
    trigger_count = 0
  },
  {
    config_id = 1046008,
    name = "GROUP_LOAD_46008",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_46008",
    action = "action_EVENT_GROUP_LOAD_46008",
    trigger_count = 0
  },
  {
    config_id = 1046009,
    name = "GROUP_LOAD_46009",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_46009"
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
    gadgets = {46001},
    regions = {},
    triggers = {
      "QUEST_FINISH_46003",
      "GADGET_STATE_CHANGE_46005",
      "QUEST_START_46006",
      "GADGET_STATE_CHANGE_46007",
      "GROUP_LOAD_46008"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {46002},
    regions = {},
    triggers = {
      "GROUP_REFRESH_46004",
      "GROUP_LOAD_46009"
    },
    rand_weight = 100
  }
}
function condition_EVENT_QUEST_FINISH_46003(context, evt)
  if 4006923 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_46003(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 46001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220133053, 53001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_REFRESH_46004(context, evt)
  if GadgetState.Default ~= ScriptLib.GetGadgetStateByConfigId(context, 220133046, 46002) then
    return false
  end
  return true
end
function action_EVENT_GROUP_REFRESH_46004(context, evt)
  ScriptLib.SetWeatherAreaState(context, 10074, 1)
  ScriptLib.SetWeatherAreaState(context, 10073, 0)
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_46005(context, evt)
  if 46001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_46005(context, evt)
  ScriptLib.SetWeatherAreaState(context, 10073, 1)
  ScriptLib.SetWeatherAreaState(context, 10072, 0)
  ScriptLib.KillEntityByConfigId(context, {
    group_id = 220133091,
    config_id = 91010,
    entity_type = EntityType.GADGET
  })
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "GadgetBDie", 1, 220133091) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  return 0
end
function action_EVENT_QUEST_START_46006(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 46001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_46007(context, evt)
  if 46001 ~= evt.param2 or GadgetState.Default ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_46007(context, evt)
  ScriptLib.SetWeatherAreaState(context, 10073, 0)
  ScriptLib.SetWeatherAreaState(context, 10072, 1)
  return 0
end
function condition_EVENT_GROUP_LOAD_46008(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220133046, 46001) then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_46008(context, evt)
  ScriptLib.SetWeatherAreaState(context, 10073, 1)
  ScriptLib.SetWeatherAreaState(context, 10072, 0)
  return 0
end
function action_EVENT_GROUP_LOAD_46009(context, evt)
  ScriptLib.SetWeatherAreaState(context, 10074, 1)
  ScriptLib.SetWeatherAreaState(context, 10073, 0)
  ScriptLib.SetWeatherAreaState(context, 10072, 0)
  return 0
end
