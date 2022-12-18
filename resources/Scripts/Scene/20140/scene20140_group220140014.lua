local base_info = {group_id = 220140014}
monsters = {}
npcs = {}
gadgets = {}
regions = {}
triggers = {
  {
    config_id = 1014001,
    name = "QUEST_START_14001",
    event = EventType.EVENT_QUEST_START,
    source = "4006704",
    condition = "condition_EVENT_QUEST_START_14001",
    action = "action_EVENT_QUEST_START_14001",
    trigger_count = 0
  },
  {
    config_id = 1014002,
    name = "GROUP_LOAD_14002",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_14002",
    action = "action_EVENT_GROUP_LOAD_14002",
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
      "QUEST_START_14001",
      "GROUP_LOAD_14002"
    },
    rand_weight = 100
  }
}
function condition_EVENT_QUEST_START_14001(context, evt)
  if ScriptLib.GetGroupVariableValueByGroup(context, "temp", 220140017) ~= 1 then
    return false
  end
  return true
end
function action_EVENT_QUEST_START_14001(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4006704") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_14002(context, evt)
  if ScriptLib.GetGroupVariableValueByGroup(context, "temp", 220140017) ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_14002(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4006704") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
