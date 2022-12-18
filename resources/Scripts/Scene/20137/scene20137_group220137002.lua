local base_info = {group_id = 220137002}
monsters = {}
npcs = {}
gadgets = {}
regions = {}
triggers = {
  {
    config_id = 1002001,
    name = "QUEST_START_2001",
    event = EventType.EVENT_QUEST_START,
    source = "4007104",
    condition = "condition_EVENT_QUEST_START_2001",
    action = "action_EVENT_QUEST_START_2001",
    trigger_count = 0
  },
  {
    config_id = 1002002,
    name = "GROUP_LOAD_2002",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_2002",
    action = "action_EVENT_GROUP_LOAD_2002",
    trigger_count = 0
  },
  {
    config_id = 1002003,
    name = "QUEST_START_2003",
    event = EventType.EVENT_QUEST_START,
    source = "4007108",
    condition = "condition_EVENT_QUEST_START_2003",
    action = "action_EVENT_QUEST_START_2003",
    trigger_count = 0
  },
  {
    config_id = 1002004,
    name = "GROUP_LOAD_2004",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_2004",
    action = "action_EVENT_GROUP_LOAD_2004",
    trigger_count = 0
  },
  {
    config_id = 1002005,
    name = "QUEST_START_2005",
    event = EventType.EVENT_QUEST_START,
    source = "4007104",
    condition = "condition_EVENT_QUEST_START_2005",
    action = "action_EVENT_QUEST_START_2005",
    trigger_count = 0
  },
  {
    config_id = 1002006,
    name = "GROUP_LOAD_2006",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_2006",
    action = "action_EVENT_GROUP_LOAD_2006",
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
      "QUEST_START_2001",
      "GROUP_LOAD_2002",
      "QUEST_START_2003",
      "GROUP_LOAD_2004",
      "QUEST_START_2005",
      "GROUP_LOAD_2006"
    },
    rand_weight = 100
  }
}
function condition_EVENT_QUEST_START_2001(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220137006, 6002) then
    return false
  end
  return true
end
function action_EVENT_QUEST_START_2001(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007104") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_2002(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220137006, 6002) then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_2002(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007104") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_START_2003(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220137008, 8002) then
    return false
  end
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220137009, 9002) then
    return false
  end
  return true
end
function action_EVENT_QUEST_START_2003(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007108") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_2004(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220137008, 8002) then
    return false
  end
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220137009, 9002) then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_2004(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007108") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_START_2005(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220137013, 13002) then
    return false
  end
  return true
end
function action_EVENT_QUEST_START_2005(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007116") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_2006(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220137013, 13002) then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_2006(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007116") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
