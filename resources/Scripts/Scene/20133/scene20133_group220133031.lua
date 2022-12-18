local base_info = {group_id = 220133031}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 31001,
    gadget_id = 70360001,
    pos = {
      x = 1067.443,
      y = -388.465,
      z = 2106.126
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1031002,
    name = "GADGET_CREATE_31002",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_31002",
    action = "action_EVENT_GADGET_CREATE_31002"
  },
  {
    config_id = 1031003,
    name = "SELECT_OPTION_31003",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_31003",
    action = "action_EVENT_SELECT_OPTION_31003"
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
    gadgets = {31001},
    regions = {},
    triggers = {
      "GADGET_CREATE_31002",
      "SELECT_OPTION_31003"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_31002(context, evt)
  if 31001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_31002(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220133031, 31001, {1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_31003(context, evt)
  if 31001 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_31003(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4006911") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
