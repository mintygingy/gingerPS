local base_info = {group_id = 220137001}
monsters = {}
npcs = {}
gadgets = {}
regions = {}
triggers = {
  {
    config_id = 1001001,
    name = "GROUP_LOAD_1001",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_1001",
    action = "action_EVENT_GROUP_LOAD_1001",
    trigger_count = 0
  },
  {
    config_id = 1001002,
    name = "QUEST_START_1002",
    event = EventType.EVENT_QUEST_START,
    source = "4007116",
    condition = "condition_EVENT_QUEST_START_1002",
    action = "action_EVENT_QUEST_START_1002",
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
      "GROUP_LOAD_1001",
      "QUEST_START_1002"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GROUP_LOAD_1001(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220137013, 13002) then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_1001(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007116") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_START_1002(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220137013, 13002) then
    return false
  end
  return true
end
function action_EVENT_QUEST_START_1002(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007116") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
