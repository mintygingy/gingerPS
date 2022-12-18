local base_info = {group_id = 220171001}
monsters = {
  {
    config_id = 1002,
    monster_id = 29070106,
    pos = {
      x = 0.101,
      y = 3.045,
      z = -2.867
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 35,
    drop_id = 1000100
  }
}
npcs = {}
gadgets = {}
regions = {}
triggers = {
  {
    config_id = 1001001,
    name = "QUEST_FINISH_1001",
    event = EventType.EVENT_QUEST_FINISH,
    source = "",
    condition = "condition_EVENT_QUEST_FINISH_1001",
    action = "action_EVENT_QUEST_FINISH_1001"
  },
  {
    config_id = 1001003,
    name = "ANY_MONSTER_DIE_1003",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_1003",
    action = "action_EVENT_ANY_MONSTER_DIE_1003"
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
      "QUEST_FINISH_1001"
    },
    rand_weight = 100
  },
  {
    monsters = {1002},
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_1003"
    },
    rand_weight = 100
  }
}
function condition_EVENT_QUEST_FINISH_1001(context, evt)
  if 303107 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_1001(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220171001, 2)
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_1003(context, evt)
  if evt.param1 ~= 1002 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_1003(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "30310801") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
