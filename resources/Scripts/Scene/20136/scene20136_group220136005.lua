local base_info = {group_id = 220136005}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 5004,
    gadget_id = 70310244,
    pos = {
      x = 277.39,
      y = 0.594,
      z = 633.685
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart,
    route_id = 122
  }
}
regions = {}
triggers = {
  {
    config_id = 1005001,
    name = "QUEST_START_5001",
    event = EventType.EVENT_QUEST_START,
    source = "4007612",
    condition = "",
    action = "action_EVENT_QUEST_START_5001",
    trigger_count = 0
  },
  {
    config_id = 1005002,
    name = "QUEST_START_5002",
    event = EventType.EVENT_QUEST_START,
    source = "4007612",
    condition = "condition_EVENT_QUEST_START_5002",
    action = "action_EVENT_QUEST_START_5002",
    trigger_count = 0
  },
  {
    config_id = 1005005,
    name = "ANY_GADGET_DIE_5005",
    event = EventType.EVENT_ANY_GADGET_DIE,
    source = "",
    condition = "condition_EVENT_ANY_GADGET_DIE_5005",
    action = "action_EVENT_ANY_GADGET_DIE_5005",
    trigger_count = 0
  }
}
variables = {}
init_config = {
  suite = 2,
  end_suite = 1,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {5004},
    regions = {},
    triggers = {
      "QUEST_START_5001",
      "QUEST_START_5002",
      "ANY_GADGET_DIE_5005"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {
      "QUEST_START_5001"
    },
    rand_weight = 100
  }
}
function action_EVENT_QUEST_START_5001(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220136005, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_START_5002(context, evt)
  if ScriptLib.CheckRemainGadgetCountByGroupId(context, {group_id = 220136005}) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_QUEST_START_5002(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "challenge3complete") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_GADGET_DIE_5005(context, evt)
  if 5004 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_GADGET_DIE_5005(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "challenge3complete") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
