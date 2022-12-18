local base_info = {group_id = 220138004}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 4001,
    gadget_id = 70360001,
    pos = {
      x = 7.102,
      y = -26.986,
      z = -36.505
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 4002,
    gadget_id = 70310148,
    pos = {
      x = 7.156,
      y = -26.986,
      z = -36.619
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 4003,
    gadget_id = 70690010,
    pos = {
      x = -19.692,
      y = 4.295,
      z = -26.857
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
    config_id = 1004004,
    name = "GADGET_CREATE_4004",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_4004",
    action = "action_EVENT_GADGET_CREATE_4004"
  },
  {
    config_id = 1004005,
    name = "SELECT_OPTION_4005",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_4005",
    action = "action_EVENT_SELECT_OPTION_4005"
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
    gadgets = {4001, 4002},
    regions = {},
    triggers = {
      "GADGET_CREATE_4004",
      "SELECT_OPTION_4005"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {4003},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_4004(context, evt)
  if 4001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_4004(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220138004, 4001, {7}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_4005(context, evt)
  if 4001 ~= evt.param1 then
    return false
  end
  if 7 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_4005(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220138004, 3)
  return 0
end
