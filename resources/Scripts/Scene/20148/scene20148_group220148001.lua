local base_info = {group_id = 220148001}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 1001,
    gadget_id = 70290569,
    pos = {
      x = 493.932,
      y = 75.29,
      z = 507.428
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1002,
    gadget_id = 70290570,
    pos = {
      x = 493.932,
      y = 75.29,
      z = 507.428
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1001003,
    name = "QUEST_START_1003",
    event = EventType.EVENT_QUEST_START,
    source = "7303514",
    condition = "",
    action = "action_EVENT_QUEST_START_1003",
    trigger_count = 0
  },
  {
    config_id = 1001004,
    name = "TIME_AXIS_PASS_1004",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_1004",
    action = "action_EVENT_TIME_AXIS_PASS_1004",
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
    gadgets = {1001},
    regions = {},
    triggers = {
      "QUEST_START_1003",
      "TIME_AXIS_PASS_1004"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {1002},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function action_EVENT_QUEST_START_1003(context, evt)
  ScriptLib.InitTimeAxis(context, "timestart7302514", {1}, false)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_1004(context, evt)
  if "timestart7302514" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_1004(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220148001, suite = 2}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
