local base_info = {group_id = 220139004}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 4001,
    gadget_id = 70310251,
    pos = {
      x = -5.324,
      y = 84.795,
      z = 22.381
    },
    rot = {
      x = 0.0,
      y = 269.338,
      z = 0.0
    },
    level = 1,
    state = GadgetState.ChestLocked,
    persistent = true,
    arguments = {36}
  },
  {
    config_id = 4002,
    gadget_id = 70310453,
    pos = {
      x = -0.514,
      y = 87.735,
      z = 22.168
    },
    rot = {
      x = 0.0,
      y = 269.1,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 4009,
    gadget_id = 70690011,
    pos = {
      x = 20.584,
      y = 68.814,
      z = 22.703
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
    gadget_id = 70690011,
    pos = {
      x = 48.861,
      y = 74.861,
      z = 22.703
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
    gadget_id = 70690011,
    pos = {
      x = 74.294,
      y = 84.54,
      z = 22.703
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
    name = "GADGET_STATE_CHANGE_4003",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_4003",
    action = "action_EVENT_GADGET_STATE_CHANGE_4003",
    trigger_count = 0
  },
  {
    config_id = 1004004,
    name = "VARIABLE_CHANGE_4004",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_4004",
    action = "action_EVENT_VARIABLE_CHANGE_4004"
  },
  {
    config_id = 1004005,
    name = "VARIABLE_CHANGE_4005",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_4005",
    action = "action_EVENT_VARIABLE_CHANGE_4005"
  },
  {
    config_id = 1004006,
    name = "VARIABLE_CHANGE_4006",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_4006",
    action = "action_EVENT_VARIABLE_CHANGE_4006"
  },
  {
    config_id = 1004007,
    name = "OBSERVATION_POINT_NOTIFY_4007",
    event = EventType.EVENT_OBSERVATION_POINT_NOTIFY,
    source = "",
    condition = "",
    action = "action_EVENT_OBSERVATION_POINT_NOTIFY_4007",
    trigger_count = 0
  },
  {
    config_id = 1004008,
    name = "VARIABLE_CHANGE_4008",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_4008",
    action = "action_EVENT_VARIABLE_CHANGE_4008"
  },
  {
    config_id = 1004012,
    name = "VARIABLE_CHANGE_4012",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_4012",
    action = "action_EVENT_VARIABLE_CHANGE_4012"
  },
  {
    config_id = 1004013,
    name = "QUEST_FINISH_4013",
    event = EventType.EVENT_QUEST_FINISH,
    source = "",
    condition = "condition_EVENT_QUEST_FINISH_4013",
    action = "action_EVENT_QUEST_FINISH_4013"
  },
  {
    config_id = 1004014,
    name = "GADGET_STATE_CHANGE_4014",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_4014",
    action = "action_EVENT_GADGET_STATE_CHANGE_4014",
    trigger_count = 0
  },
  {
    config_id = 1004015,
    name = "GROUP_LOAD_4015",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_4015",
    action = "action_EVENT_GROUP_LOAD_4015",
    trigger_count = 0
  },
  {
    config_id = 1004016,
    name = "QUEST_START_4016",
    event = EventType.EVENT_QUEST_START,
    source = "4007308",
    condition = "condition_EVENT_QUEST_START_4016",
    action = "action_EVENT_QUEST_START_4016",
    trigger_count = 0
  },
  {
    config_id = 1004017,
    name = "QUEST_START_4017",
    event = EventType.EVENT_QUEST_START,
    source = "4007307",
    condition = "condition_EVENT_QUEST_START_4017",
    action = "action_EVENT_QUEST_START_4017",
    trigger_count = 0
  },
  {
    config_id = 1004018,
    name = "GROUP_LOAD_4018",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_4018",
    action = "action_EVENT_GROUP_LOAD_4018",
    trigger_count = 0
  },
  {
    config_id = 1004019,
    name = "GROUP_LOAD_4019",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_4019",
    action = "action_EVENT_GROUP_LOAD_4019",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "CastleToyB",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 2,
    name = "CastleToyC",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 3,
    name = "finish",
    value = 0,
    no_refresh = false
  }
}
init_config = {
  suite = 1,
  end_suite = 0,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {4001, 4002},
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_4003",
      "VARIABLE_CHANGE_4004",
      "VARIABLE_CHANGE_4005",
      "VARIABLE_CHANGE_4006",
      "OBSERVATION_POINT_NOTIFY_4007",
      "VARIABLE_CHANGE_4008",
      "VARIABLE_CHANGE_4012",
      "QUEST_FINISH_4013",
      "GADGET_STATE_CHANGE_4014",
      "GROUP_LOAD_4015",
      "QUEST_START_4016",
      "QUEST_START_4017",
      "GROUP_LOAD_4018",
      "GROUP_LOAD_4019"
    },
    rand_weight = 100,
    ban_refresh = true
  },
  {
    monsters = {},
    gadgets = {
      4009,
      4010,
      4011
    },
    regions = {},
    triggers = {},
    rand_weight = 100,
    ban_refresh = true
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_4003(context, evt)
  if 4002 ~= evt.param2 or GadgetState.GearAction1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_4003(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 4001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_4004(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "CastleToyB") ~= 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "CastleToyC") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_4004(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 4002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_4005(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "CastleToyC") ~= 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "CastleToyB") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_4005(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 4002, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_4006(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "CastleToyC") ~= 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "CastleToyB") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_4006(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 4002, GadgetState.GearAction1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function action_EVENT_OBSERVATION_POINT_NOTIFY_4007(context, evt)
  if 4001 == evt.param1 and 305 == evt.param2 then
    ScriptLib.ChangeToTargetLevelTag(context, 41)
    ScriptLib.AddQuestProgress(context, "4007310")
    ScriptLib.SetGadgetStateByConfigId(context, 4001, GadgetState.ChestOpened)
    ScriptLib.SetGroupVariableValue(context, "finish", 1)
    ScriptLib.SetGroupVariableValueByGroup(context, "castle", 1, 220139046)
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_4008(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "finish") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_4008(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220139004, 2)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 4002}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_4012(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "finish") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_4012(context, evt)
  ScriptLib.ChangeToTargetLevelTag(context, 41)
  return 0
end
function condition_EVENT_QUEST_FINISH_4013(context, evt)
  if 4007309 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_4013(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 4002, GadgetState.GearAction1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_4014(context, evt)
  if 4002 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_4014(context, evt)
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2802, 3, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_4015(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "finish") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_4015(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220139004, 2)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 4002}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_START_4016(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "CastleToyC") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_QUEST_START_4016(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007308") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_START_4017(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "CastleToyB") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_QUEST_START_4017(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007307") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_4018(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "CastleToyC") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_4018(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007308") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_4019(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "CastleToyB") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_4019(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007307") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
