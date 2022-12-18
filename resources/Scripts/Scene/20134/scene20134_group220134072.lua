local base_info = {group_id = 220134072}
local defs = {
  point_sum = 11,
  route_2 = 7,
  gadget_seelie = 72001
}
defs.final_point = defs.point_sum - 1
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 72001,
    gadget_id = 70310244,
    pos = {
      x = 106.485,
      y = 674.366,
      z = -1854.175
    },
    rot = {
      x = 0.0,
      y = 297.679,
      z = 0.0
    },
    level = 1
  }
}
regions = {
  {
    config_id = 72005,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 157.005,
      y = 649.965,
      z = -1832.274
    }
  }
}
triggers = {
  {
    config_id = 1072002,
    name = "GADGET_CREATE_72002",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_72002",
    action = "action_EVENT_GADGET_CREATE_72002",
    trigger_count = 0
  },
  {
    config_id = 1072003,
    name = "PLATFORM_REACH_POINT_72003",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_72003",
    action = "action_EVENT_PLATFORM_REACH_POINT_72003",
    trigger_count = 0
  },
  {
    config_id = 1072004,
    name = "AVATAR_NEAR_PLATFORM_72004",
    event = EventType.EVENT_AVATAR_NEAR_PLATFORM,
    source = "",
    condition = "condition_EVENT_AVATAR_NEAR_PLATFORM_72004",
    action = "action_EVENT_AVATAR_NEAR_PLATFORM_72004",
    trigger_count = 0
  },
  {
    config_id = 1072005,
    name = "ENTER_REGION_72005",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_72005",
    action = "action_EVENT_ENTER_REGION_72005",
    trigger_count = 0
  },
  {
    config_id = 1072007,
    name = "PLATFORM_REACH_POINT_72007",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_72007",
    action = "action_EVENT_PLATFORM_REACH_POINT_72007",
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
    triggers = {
      "GADGET_CREATE_72002",
      "PLATFORM_REACH_POINT_72003",
      "AVATAR_NEAR_PLATFORM_72004",
      "PLATFORM_REACH_POINT_72007"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {72001},
    regions = {72005},
    triggers = {
      "ENTER_REGION_72005"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_72002(context, evt)
  if 72001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_72002(context, evt)
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 72001, 4) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 72001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2005, 1, 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_72003(context, evt)
  if defs.gadget_seelie ~= evt.param1 then
    return false
  end
  if defs.route_2 ~= evt.param2 then
    return false
  end
  if defs.final_point ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_72003(context, evt)
  if 0 ~= ScriptLib.StopPlatform(context, 72001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : stop_platform")
    return -1
  end
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2005, 3, 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  return 0
end
function condition_EVENT_AVATAR_NEAR_PLATFORM_72004(context, evt)
  if defs.gadget_seelie ~= evt.param1 then
    return false
  end
  if defs.route_2 ~= evt.param2 then
    return false
  end
  if defs.final_point == evt.param3 then
    return false
  end
  return true
end
function action_EVENT_AVATAR_NEAR_PLATFORM_72004(context, evt)
  if 0 ~= ScriptLib.StartPlatform(context, 72001) then
    return -1
  end
  if 0 ~= evt.param3 then
    ScriptLib.MarkPlayerAction(context, 2005, 2, evt.param3 + 1)
  end
  return 0
end
function condition_EVENT_ENTER_REGION_72005(context, evt)
  if evt.param1 ~= 72005 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_72005(context, evt)
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 72001, 7) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 72001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2005, 1, 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_72007(context, evt)
  if 72001 ~= evt.param1 then
    return false
  end
  if 7 ~= evt.param2 then
    return false
  end
  if 10 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_72007(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 72001}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
