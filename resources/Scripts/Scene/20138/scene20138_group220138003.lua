local base_info = {group_id = 220138003}
monsters = {}
npcs = {}
gadgets = {}
regions = {}
triggers = {
  {
    config_id = 1003001,
    name = "QUEST_START_3001",
    event = EventType.EVENT_QUEST_START,
    source = "4007205",
    condition = "condition_EVENT_QUEST_START_3001",
    action = "action_EVENT_QUEST_START_3001",
    trigger_count = 0
  },
  {
    config_id = 1003002,
    name = "GROUP_LOAD_3002",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_3002",
    action = "action_EVENT_GROUP_LOAD_3002",
    trigger_count = 0
  },
  {
    config_id = 1003003,
    name = "QUEST_START_3003",
    event = EventType.EVENT_QUEST_START,
    source = "4007207",
    condition = "condition_EVENT_QUEST_START_3003",
    action = "action_EVENT_QUEST_START_3003",
    trigger_count = 0
  },
  {
    config_id = 1003004,
    name = "GROUP_LOAD_3004",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_3004",
    action = "action_EVENT_GROUP_LOAD_3004",
    trigger_count = 0
  },
  {
    config_id = 1003005,
    name = "QUEST_START_3005",
    event = EventType.EVENT_QUEST_START,
    source = "4007215",
    condition = "condition_EVENT_QUEST_START_3005",
    action = "action_EVENT_QUEST_START_3005",
    trigger_count = 0
  },
  {
    config_id = 1003006,
    name = "GROUP_LOAD_3006",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_3006",
    action = "action_EVENT_GROUP_LOAD_3006",
    trigger_count = 0
  },
  {
    config_id = 1003007,
    name = "QUEST_START_3007",
    event = EventType.EVENT_QUEST_START,
    source = "4007216",
    condition = "condition_EVENT_QUEST_START_3007",
    action = "action_EVENT_QUEST_START_3007",
    trigger_count = 0
  },
  {
    config_id = 1003008,
    name = "GROUP_LOAD_3008",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_3008",
    action = "action_EVENT_GROUP_LOAD_3008",
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
    gadgets = {},
    regions = {},
    triggers = {
      "QUEST_START_3001",
      "GROUP_LOAD_3002",
      "QUEST_START_3003",
      "GROUP_LOAD_3004",
      "QUEST_START_3005",
      "GROUP_LOAD_3006",
      "QUEST_START_3007",
      "GROUP_LOAD_3008"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_QUEST_START_3001(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220138008, 8002) then
    return false
  end
  return true
end
function action_EVENT_QUEST_START_3001(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007205") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_3002(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220138008, 8002) then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_3002(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007205") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_START_3003(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220138009, 9002) then
    return false
  end
  return true
end
function action_EVENT_QUEST_START_3003(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007207") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_3004(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220138009, 9002) then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_3004(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007207") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_START_3005(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220138010, 10002) then
    return false
  end
  return true
end
function action_EVENT_QUEST_START_3005(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007215") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_3006(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220138010, 10002) then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_3006(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007215") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_START_3007(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220138011, 11002) then
    return false
  end
  return true
end
function action_EVENT_QUEST_START_3007(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007216") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_3008(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220138011, 11002) then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_3008(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007216") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
