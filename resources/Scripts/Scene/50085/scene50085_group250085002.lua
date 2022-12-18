local base_info = {group_id = 250085002}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 2001,
    gadget_id = 70380300,
    pos = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 15.0
    },
    level = 1,
    route_id = 1,
    start_route = false
  },
  {
    config_id = 2002,
    gadget_id = 70360002,
    pos = {
      x = -89.49,
      y = -0.711,
      z = 21.385
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {7}
    }
  }
}
regions = {}
triggers = {
  {
    config_id = 1002003,
    name = "SELECT_OPTION_2003",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_2003",
    action = "action_EVENT_SELECT_OPTION_2003"
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
    gadgets = {2001, 2002},
    regions = {},
    triggers = {
      "SELECT_OPTION_2003"
    },
    rand_weight = 100
  }
}
function condition_EVENT_SELECT_OPTION_2003(context, evt)
  if 2002 ~= evt.param1 then
    return false
  end
  if 7 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_2003(context, evt)
  if 0 ~= ScriptLib.StartPlatform(context, 2001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  return 0
end
