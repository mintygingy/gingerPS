local base_info = {group_id = 220150001}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 1003,
    gadget_id = 70290509,
    pos = {
      x = 541.99,
      y = 129.979,
      z = 728.873
    },
    rot = {
      x = 1.418,
      y = 109.494,
      z = 258.16
    },
    level = 1
  },
  {
    config_id = 1004,
    gadget_id = 70710829,
    pos = {
      x = 513.72,
      y = 231.17,
      z = 599.3
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_REMOTE
  }
}
regions = {}
triggers = {
  {
    config_id = 1001001,
    name = "QUEST_FINISH_1001",
    event = EventType.EVENT_QUEST_FINISH,
    source = "",
    condition = "condition_EVENT_QUEST_FINISH_1001",
    action = "action_EVENT_QUEST_FINISH_1001",
    trigger_count = 0
  },
  {
    config_id = 1001005,
    name = "QUEST_START_1005",
    event = EventType.EVENT_QUEST_START,
    source = "",
    condition = "condition_EVENT_QUEST_START_1005",
    action = "action_EVENT_QUEST_START_1005",
    trigger_count = 0
  },
  {
    config_id = 1001006,
    name = "QUEST_FINISH_1006",
    event = EventType.EVENT_QUEST_FINISH,
    source = "",
    condition = "condition_EVENT_QUEST_FINISH_1006",
    action = "action_EVENT_QUEST_FINISH_1006",
    trigger_count = 0
  },
  {
    config_id = 1001007,
    name = "QUEST_START_1007",
    event = EventType.EVENT_QUEST_START,
    source = "",
    condition = "condition_EVENT_QUEST_START_1007",
    action = "action_EVENT_QUEST_START_1007",
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
    gadgets = {1003},
    regions = {},
    triggers = {
      "QUEST_FINISH_1001",
      "QUEST_START_1005",
      "QUEST_FINISH_1006",
      "QUEST_START_1007"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {1004},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_QUEST_FINISH_1001(context, evt)
  if 300006 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_1001(context, evt)
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220150001, EntityType.GADGET, 1003) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_START_1005(context, evt)
  local curQuestState = ScriptLib.GetHostQuestState(context, 300007)
  if -1 == curQuestState or 0 == curQuestState then
    return false
  end
  if curQuestState ~= 2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_START_1005(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220150001, 2)
  return 0
end
function condition_EVENT_QUEST_FINISH_1006(context, evt)
  if 300007 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_1006(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220150001, 2)
  return 0
end
function condition_EVENT_QUEST_START_1007(context, evt)
  local curQuestState = ScriptLib.GetHostQuestState(context, 300005)
  if -1 == curQuestState or 0 == curQuestState then
    return false
  end
  if curQuestState ~= 2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_START_1007(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 1003}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  return 0
end
