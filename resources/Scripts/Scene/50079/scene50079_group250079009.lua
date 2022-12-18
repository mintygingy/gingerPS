local base_info = {group_id = 250079009}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 9001,
    gadget_id = 70360002,
    pos = {
      x = 485.786,
      y = 612.363,
      z = -1574.119
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
    config_id = 1009002,
    name = "GADGET_CREATE_9002",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_9002",
    action = "action_EVENT_GADGET_CREATE_9002"
  },
  {
    config_id = 1009003,
    name = "SELECT_OPTION_9003",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "",
    action = "action_EVENT_SELECT_OPTION_9003",
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
    gadgets = {9001},
    regions = {},
    triggers = {
      "GADGET_CREATE_9002",
      "SELECT_OPTION_9003"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_9002(context, evt)
  if 9001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_9002(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 250079009, 9001, {4005}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function action_EVENT_SELECT_OPTION_9003(context, evt)
  ScriptLib.EnterPersistentDungeon(context, evt.param2, 0, {
    pos = {
      x = 0,
      y = 0,
      z = 0
    },
    rot = {
      x = 0,
      y = 0,
      z = 0
    }
  })
  return 0
end
