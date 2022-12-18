local base_info = {group_id = 220165011}
monsters = {}
npcs = {}
gadgets = {}
regions = {}
triggers = {
  {
    config_id = 1011001,
    name = "GROUP_REFRESH_11001",
    event = EventType.EVENT_GROUP_REFRESH,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_REFRESH_11001"
  },
  {
    config_id = 1011002,
    name = "TIME_AXIS_PASS_11002",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_11002",
    action = "action_EVENT_TIME_AXIS_PASS_11002",
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
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {
      "GROUP_REFRESH_11001",
      "TIME_AXIS_PASS_11002"
    },
    rand_weight = 100
  }
}
function action_EVENT_GROUP_REFRESH_11001(context, evt)
  ScriptLib.InitTimeAxis(context, "timer", {20}, true)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_11002(context, evt)
  if "timer" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_11002(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 400903) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  return 0
end
