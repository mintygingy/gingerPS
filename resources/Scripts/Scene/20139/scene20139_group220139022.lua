local base_info = {group_id = 220139022}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 22001,
    gadget_id = 70310484,
    pos = {
      x = 131.747,
      y = 101.466,
      z = 36.938
    },
    rot = {
      x = 0.0,
      y = 89.692,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 22003,
    gadget_id = 70310414,
    pos = {
      x = 126.855,
      y = 93.024,
      z = 36.912
    },
    rot = {
      x = 0.0,
      y = 89.692,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 22004,
    gadget_id = 70310414,
    pos = {
      x = 122.023,
      y = 93.024,
      z = 36.886
    },
    rot = {
      x = 0.0,
      y = 89.692,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 22005,
    gadget_id = 70310415,
    pos = {
      x = 119.776,
      y = 92.995,
      z = 36.168
    },
    rot = {
      x = 0.0,
      y = 90.752,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 22006,
    gadget_id = 70310483,
    pos = {
      x = 124.614,
      y = 90.56,
      z = 15.922
    },
    rot = {
      x = 0.0,
      y = 90.163,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 22007,
    gadget_id = 70310417,
    pos = {
      x = 119.05,
      y = 90.558,
      z = 15.896
    },
    rot = {
      x = 0.0,
      y = 90.082,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 22008,
    gadget_id = 70310417,
    pos = {
      x = 121.381,
      y = 90.558,
      z = 15.893
    },
    rot = {
      x = 0.0,
      y = 90.082,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 22009,
    gadget_id = 70380001,
    pos = {
      x = 131.488,
      y = 100.468,
      z = 36.741
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 22010,
    gadget_id = 70380001,
    pos = {
      x = 124.902,
      y = 89.562,
      z = 15.728
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 22011,
    gadget_id = 70380001,
    pos = {
      x = 115.435,
      y = 101.143,
      z = 10.281
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 22012,
    gadget_id = 70310416,
    pos = {
      x = 124.649,
      y = 102.299,
      z = 20.777
    },
    rot = {
      x = 0.0,
      y = 359.27,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 22013,
    gadget_id = 70310443,
    pos = {
      x = 116.759,
      y = 102.141,
      z = 10.16
    },
    rot = {
      x = 0.0,
      y = 270.403,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 22014,
    gadget_id = 70310444,
    pos = {
      x = 114.3,
      y = 102.141,
      z = 10.164
    },
    rot = {
      x = 0.0,
      y = 269.974,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 22015,
    gadget_id = 70310314,
    pos = {
      x = 111.812,
      y = 109.873,
      z = 10.172
    },
    rot = {
      x = 0.0,
      y = 270.403,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 22016,
    gadget_id = 70310314,
    pos = {
      x = 110.046,
      y = 109.873,
      z = 10.184
    },
    rot = {
      x = 0.0,
      y = 270.403,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 22017,
    gadget_id = 70310266,
    pos = {
      x = 134.772,
      y = 103.024,
      z = 25.736
    },
    rot = {
      x = 0.0,
      y = 271.086,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 22018,
    gadget_id = 70310437,
    pos = {
      x = 135.781,
      y = 101.437,
      z = 36.946
    },
    rot = {
      x = 0.0,
      y = 271.086,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart,
    is_use_point_array = true
  },
  {
    config_id = 22019,
    gadget_id = 70310438,
    pos = {
      x = 116.472,
      y = 90.54,
      z = 15.913
    },
    rot = {
      x = 0.0,
      y = 89.79,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart,
    is_use_point_array = true
  },
  {
    config_id = 22020,
    gadget_id = 70310266,
    pos = {
      x = 120.081,
      y = 102.155,
      z = 10.138
    },
    rot = {
      x = 0.0,
      y = 270.218,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart,
    is_use_point_array = true
  },
  {
    config_id = 22034,
    gadget_id = 70380001,
    pos = {
      x = 131.488,
      y = 92.249,
      z = 36.741
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 22035,
    gadget_id = 70380001,
    pos = {
      x = 124.902,
      y = 101.283,
      z = 15.728
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 22036,
    gadget_id = 70380001,
    pos = {
      x = 115.435,
      y = 108.872,
      z = 10.281
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 22037,
    gadget_id = 70310416,
    pos = {
      x = 124.614,
      y = 102.281,
      z = 15.922
    },
    rot = {
      x = 0.0,
      y = 90.163,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 22038,
    gadget_id = 70310443,
    pos = {
      x = 116.759,
      y = 109.87,
      z = 10.16
    },
    rot = {
      x = 0.0,
      y = 270.403,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 22039,
    gadget_id = 70310444,
    pos = {
      x = 114.3,
      y = 109.87,
      z = 10.164
    },
    rot = {
      x = 0.0,
      y = 269.974,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 22040,
    gadget_id = 70310266,
    pos = {
      x = 111.145,
      y = 109.907,
      z = 10.166
    },
    rot = {
      x = 0.0,
      y = 270.218,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 22045,
    gadget_id = 70310484,
    pos = {
      x = 131.747,
      y = 101.466,
      z = 36.938
    },
    rot = {
      x = 0.0,
      y = 89.692,
      z = 0.0
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1022002,
    name = "GROUP_LOAD_22002",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_22002",
    action = "action_EVENT_GROUP_LOAD_22002",
    trigger_count = 0
  },
  {
    config_id = 1022021,
    name = "PLATFORM_ARRIVAL_22021",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_22021",
    action = "action_EVENT_PLATFORM_ARRIVAL_22021",
    trigger_count = 0
  },
  {
    config_id = 1022022,
    name = "PLATFORM_ARRIVAL_22022",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_22022",
    action = "action_EVENT_PLATFORM_ARRIVAL_22022",
    trigger_count = 0
  },
  {
    config_id = 1022023,
    name = "PLATFORM_ARRIVAL_22023",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_22023",
    action = "action_EVENT_PLATFORM_ARRIVAL_22023",
    trigger_count = 0
  },
  {
    config_id = 1022024,
    name = "VARIABLE_CHANGE_22024",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_22024",
    action = "action_EVENT_VARIABLE_CHANGE_22024",
    trigger_count = 0
  },
  {
    config_id = 1022025,
    name = "VARIABLE_CHANGE_22025",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_22025",
    action = "action_EVENT_VARIABLE_CHANGE_22025",
    trigger_count = 0
  },
  {
    config_id = 1022026,
    name = "VARIABLE_CHANGE_22026",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_22026",
    action = "action_EVENT_VARIABLE_CHANGE_22026",
    trigger_count = 0
  },
  {
    config_id = 1022027,
    name = "PLATFORM_ARRIVAL_22027",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_22027",
    action = "action_EVENT_PLATFORM_ARRIVAL_22027",
    trigger_count = 0
  },
  {
    config_id = 1022028,
    name = "PLATFORM_ARRIVAL_22028",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_22028",
    action = "action_EVENT_PLATFORM_ARRIVAL_22028",
    trigger_count = 0
  },
  {
    config_id = 1022029,
    name = "PLATFORM_ARRIVAL_22029",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_22029",
    action = "action_EVENT_PLATFORM_ARRIVAL_22029",
    trigger_count = 0
  },
  {
    config_id = 1022030,
    name = "GADGET_CREATE_22030",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_22030",
    action = "action_EVENT_GADGET_CREATE_22030",
    trigger_count = 0
  },
  {
    config_id = 1022031,
    name = "PLATFORM_ARRIVAL_22031",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_22031",
    action = "action_EVENT_PLATFORM_ARRIVAL_22031",
    trigger_count = 0
  },
  {
    config_id = 1022032,
    name = "PLATFORM_ARRIVAL_22032",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_22032",
    action = "action_EVENT_PLATFORM_ARRIVAL_22032",
    trigger_count = 0
  },
  {
    config_id = 1022033,
    name = "QUEST_FINISH_22033",
    event = EventType.EVENT_QUEST_FINISH,
    source = "4007319",
    condition = "",
    action = "action_EVENT_QUEST_FINISH_22033",
    trigger_count = 0
  },
  {
    config_id = 1022041,
    name = "GROUP_REFRESH_22041",
    event = EventType.EVENT_GROUP_REFRESH,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_REFRESH_22041",
    trigger_count = 0
  },
  {
    config_id = 1022042,
    name = "QUEST_START_22042",
    event = EventType.EVENT_QUEST_START,
    source = "4007320",
    condition = "",
    action = "action_EVENT_QUEST_START_22042",
    trigger_count = 0
  },
  {
    config_id = 1022043,
    name = "GROUP_LOAD_22043",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_22043",
    trigger_count = 0
  },
  {
    config_id = 1022044,
    name = "QUEST_FINISH_22044",
    event = EventType.EVENT_QUEST_FINISH,
    source = "4007320",
    condition = "",
    action = "action_EVENT_QUEST_FINISH_22044",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "eyefinish1",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 2,
    name = "duankou",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 5,
    name = "eyefinish2",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 6,
    name = "eyefinish3",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 7,
    name = "QuestFinish",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 8,
    name = "FirstLeonMet",
    value = 0,
    no_refresh = true
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
    gadgets = {
      22001,
      22003,
      22004,
      22005,
      22006,
      22007,
      22008,
      22009,
      22010,
      22011,
      22012,
      22013,
      22014,
      22015,
      22016,
      22017,
      22045
    },
    regions = {},
    triggers = {
      "GROUP_LOAD_22002",
      "PLATFORM_ARRIVAL_22021",
      "PLATFORM_ARRIVAL_22022",
      "PLATFORM_ARRIVAL_22023",
      "VARIABLE_CHANGE_22024",
      "VARIABLE_CHANGE_22025",
      "VARIABLE_CHANGE_22026",
      "PLATFORM_ARRIVAL_22027",
      "PLATFORM_ARRIVAL_22028",
      "PLATFORM_ARRIVAL_22029",
      "GADGET_CREATE_22030",
      "PLATFORM_ARRIVAL_22031",
      "PLATFORM_ARRIVAL_22032",
      "QUEST_FINISH_22033"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {22018},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {22019},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {22020},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      22003,
      22004,
      22005,
      22012,
      22015,
      22016,
      22034,
      22035,
      22036,
      22037,
      22038,
      22039
    },
    regions = {},
    triggers = {
      "GROUP_REFRESH_22041",
      "QUEST_START_22042",
      "GROUP_LOAD_22043",
      "QUEST_FINISH_22044"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {22040},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_GROUP_LOAD_22002(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "QuestFinish") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_22002(context, evt)
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220139016, 16001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 22017}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "eyefinish1", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "eyefinish2", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "eyefinish3", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "duankou", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_22021(context, evt)
  if 22018 ~= evt.param1 then
    return false
  end
  if 12 ~= evt.param2 then
    return false
  end
  if 4 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_22021(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "duankou", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_22022(context, evt)
  if 22019 ~= evt.param1 then
    return false
  end
  if 13 ~= evt.param2 then
    return false
  end
  if 4 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_22022(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "duankou", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_22023(context, evt)
  if 22020 ~= evt.param1 then
    return false
  end
  if 14 ~= evt.param2 then
    return false
  end
  if 2 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_22023(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007312") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 22020, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "QuestFinish", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220139022, suite = 5}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_22024(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "eyefinish1") ~= 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "duankou") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_22024(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 22017}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220139022, 2)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 22018, 5, {1, 2}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 22018, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_22025(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "eyefinish2") ~= 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "duankou") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_22025(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 22018}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220139022, 3)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 22019, 6, {
    1,
    2,
    3
  }, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 22019, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_22026(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "eyefinish3") ~= 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "duankou") ~= 2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "QuestFinish") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_22026(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 22019}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220139022, 4)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 22020, 7, {1, 2}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 22020, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_22027(context, evt)
  if 22018 ~= evt.param1 then
    return false
  end
  if 5 ~= evt.param2 then
    return false
  end
  if 2 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_22027(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 22009, 8, {2}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 22018, 12, {
    1,
    2,
    3,
    4
  }, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_22028(context, evt)
  if 22019 ~= evt.param1 then
    return false
  end
  if 6 ~= evt.param2 then
    return false
  end
  if 3 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_22028(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 22010, 9, {2}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 22019, 13, {
    1,
    2,
    3,
    4
  }, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_22029(context, evt)
  if 22020 ~= evt.param1 then
    return false
  end
  if 7 ~= evt.param2 then
    return false
  end
  if 2 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_22029(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 22011, 10, {2}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 22020, 14, {1, 2}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_22030(context, evt)
  if 22017 ~= evt.param1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "FirstLeonMet") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_22030(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 22017, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_22031(context, evt)
  if 22018 ~= evt.param1 then
    return false
  end
  if 12 ~= evt.param2 then
    return false
  end
  if 4 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_22031(context, evt)
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220139017, 17001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_22032(context, evt)
  if 22019 ~= evt.param1 then
    return false
  end
  if 13 ~= evt.param2 then
    return false
  end
  if 4 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_22032(context, evt)
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220139018, 18001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
function action_EVENT_QUEST_FINISH_22033(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "FirstLeonMet", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 22017, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.RemoveExtraGroupSuite(context, 220139022, 4)
  return 0
end
function action_EVENT_GROUP_REFRESH_22041(context, evt)
  if ScriptLib.GetHostQuestState(context, 4007320) == 2 then
    ScriptLib.RemoveExtraGroupSuite(context, 220139022, 4)
    ScriptLib.AddExtraGroupSuite(context, 220139022, 6)
  end
  return 0
end
function action_EVENT_QUEST_START_22042(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220139022, 6)
  return 0
end
function action_EVENT_GROUP_LOAD_22043(context, evt)
  if ScriptLib.GetHostQuestState(context, 4007320) == 2 then
    ScriptLib.AddExtraGroupSuite(context, 220139022, 6)
  end
  return 0
end
function action_EVENT_QUEST_FINISH_22044(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 22040}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
