local base_info = {group_id = 220134033}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 33001,
    gadget_id = 70220113,
    pos = {
      x = 500.131,
      y = 613.465,
      z = -1591.276
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
    config_id = 1033002,
    name = "VARIABLE_CHANGE_33002",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_33002",
    action = "action_EVENT_VARIABLE_CHANGE_33002",
    trigger_count = 0
  },
  {
    config_id = 1033003,
    name = "GROUP_LOAD_33003",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_33003",
    action = "action_EVENT_GROUP_LOAD_33003",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "door1",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 2,
    name = "door2",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 3,
    name = "door3",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 4,
    name = "door4",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 5,
    name = "starreach",
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
    gadgets = {33001},
    regions = {},
    triggers = {
      "VARIABLE_CHANGE_33002",
      "GROUP_LOAD_33003"
    },
    rand_weight = 100
  }
}
function condition_EVENT_VARIABLE_CHANGE_33002(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "starreach") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_33002(context, evt)
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 33001, 6) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 33001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_33003(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "starreach") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_33003(context, evt)
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 33001, 6) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 33001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  return 0
end
