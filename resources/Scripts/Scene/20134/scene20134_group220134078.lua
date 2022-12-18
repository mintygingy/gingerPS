local base_info = {group_id = 220134078}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 78001,
    gadget_id = 70310456,
    pos = {
      x = 602.742,
      y = 620.86,
      z = -1640.339
    },
    rot = {
      x = 358.337,
      y = 255.517,
      z = 357.395
    },
    level = 1
  },
  {
    config_id = 78002,
    gadget_id = 70310244,
    pos = {
      x = 603.401,
      y = 620.534,
      z = -1640.262
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 78003,
    gadget_id = 70360001,
    pos = {
      x = 602.834,
      y = 620.58,
      z = -1640.558
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {411}
    }
  }
}
regions = {}
triggers = {
  {
    config_id = 1078004,
    name = "SELECT_OPTION_78004",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_78004",
    action = "action_EVENT_SELECT_OPTION_78004",
    trigger_count = 0
  },
  {
    config_id = 1078005,
    name = "AVATAR_NEAR_PLATFORM_78005",
    event = EventType.EVENT_AVATAR_NEAR_PLATFORM,
    source = "",
    condition = "",
    action = "action_EVENT_AVATAR_NEAR_PLATFORM_78005",
    trigger_count = 0
  },
  {
    config_id = 1078006,
    name = "PLATFORM_REACH_POINT_78006",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_78006",
    action = "action_EVENT_PLATFORM_REACH_POINT_78006",
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
    gadgets = {78001, 78003},
    regions = {},
    triggers = {
      "SELECT_OPTION_78004",
      "AVATAR_NEAR_PLATFORM_78005",
      "PLATFORM_REACH_POINT_78006"
    },
    rand_weight = 100
  }
}
function condition_EVENT_SELECT_OPTION_78004(context, evt)
  if 78003 ~= evt.param1 then
    return false
  end
  if 411 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_78004(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 78002}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 78002, 11) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 78002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220134078, 78003, 411) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  return 0
end
function action_EVENT_AVATAR_NEAR_PLATFORM_78005(context, evt)
  if 0 ~= ScriptLib.StartPlatform(context, 78002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_78006(context, evt)
  if 78002 ~= evt.param1 then
    return false
  end
  if 11 ~= evt.param2 then
    return false
  end
  if 7 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_78006(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 78002}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
