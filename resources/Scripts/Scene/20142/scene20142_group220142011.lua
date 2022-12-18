local base_info = {group_id = 220142011}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 11001,
    gadget_id = 71700385,
    pos = {
      x = 114.003,
      y = 5.424,
      z = 50.227
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 11004,
    gadget_id = 70360001,
    pos = {
      x = 76.522,
      y = 9.068,
      z = 104.201
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 11006,
    gadget_id = 70710470,
    pos = {
      x = 113.942,
      y = 5.424,
      z = 50.286
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1011002,
    name = "LEVEL_TAG_CHANGE_11002",
    event = EventType.EVENT_LEVEL_TAG_CHANGE,
    source = "",
    condition = "",
    action = "action_EVENT_LEVEL_TAG_CHANGE_11002",
    trigger_count = 0
  },
  {
    config_id = 1011003,
    name = "GROUP_LOAD_11003",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_11003",
    trigger_count = 0
  },
  {
    config_id = 1011005,
    name = "QUEST_START_11005",
    event = EventType.EVENT_QUEST_START,
    source = "4006516",
    condition = "",
    action = "action_EVENT_QUEST_START_11005",
    trigger_count = 0
  },
  {
    config_id = 1011007,
    name = "QUEST_FINISH_11007",
    event = EventType.EVENT_QUEST_FINISH,
    source = "4006516",
    condition = "",
    action = "action_EVENT_QUEST_FINISH_11007",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "start",
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
    gadgets = {11004},
    regions = {},
    triggers = {
      "LEVEL_TAG_CHANGE_11002",
      "GROUP_LOAD_11003",
      "QUEST_START_11005",
      "QUEST_FINISH_11007"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {11006},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {11001},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function action_EVENT_LEVEL_TAG_CHANGE_11002(context, evt)
  if ScriptLib.CheckSceneTag(context, 20142, 1054) and ScriptLib.GetGroupVariableValue(context, "start") == 1 then
    ScriptLib.AddExtraGroupSuite(context, 0, 3)
  else
    ScriptLib.RemoveExtraGroupSuite(context, 220142011, 3)
  end
  return 0
end
function action_EVENT_GROUP_LOAD_11003(context, evt)
  if ScriptLib.CheckSceneTag(context, 20142, 1054) and ScriptLib.GetGroupVariableValue(context, "start") == 1 then
    ScriptLib.AddExtraGroupSuite(context, 0, 3)
  else
    ScriptLib.RemoveExtraGroupSuite(context, 220142011, 3)
  end
  return 0
end
function action_EVENT_QUEST_START_11005(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220142011, 2)
  return 0
end
function action_EVENT_QUEST_FINISH_11007(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "start", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220142011, 3)
  ScriptLib.RemoveExtraGroupSuite(context, 220142011, 2)
  return 0
end
