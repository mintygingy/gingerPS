local base_info = {group_id = 220143001}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 1001,
    gadget_id = 70360001,
    pos = {
      x = 6.288,
      y = 0.311,
      z = 1.427
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
    config_id = 1001002,
    name = "GADGET_CREATE_1002",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_1002",
    action = "action_EVENT_GADGET_CREATE_1002",
    trigger_count = 0
  },
  {
    config_id = 1001003,
    name = "SELECT_OPTION_1003",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_1003",
    action = "action_EVENT_SELECT_OPTION_1003",
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
    gadgets = {1001},
    regions = {},
    triggers = {
      "GADGET_CREATE_1002",
      "SELECT_OPTION_1003"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_1002(context, evt)
  if 1001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_1002(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220143001, 1001, {199}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_1003(context, evt)
  if 1001 ~= evt.param1 then
    return false
  end
  if 199 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_1003(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007107") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220143001, EntityType.GADGET, 1001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
