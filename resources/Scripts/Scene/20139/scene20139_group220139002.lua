local base_info = {group_id = 220139002}
monsters = {}
npcs = {}
gadgets = {}
regions = {}
triggers = {
  {
    config_id = 1002001,
    name = "QUEST_START_2001",
    event = EventType.EVENT_QUEST_START,
    source = "4007312",
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
      "GROUP_LOAD_2002"
    },
    rand_weight = 100
  }
}
function condition_EVENT_QUEST_START_2001(context, evt)
  if ScriptLib.GetGroupVariableValueByGroup(context, "QuestFinish", 220139022) ~= 1 then
    return false
  end
  return true
end
function action_EVENT_QUEST_START_2001(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007312") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_2002(context, evt)
  if ScriptLib.GetGroupVariableValueByGroup(context, "QuestFinish", 220139022) ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_2002(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007312") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
