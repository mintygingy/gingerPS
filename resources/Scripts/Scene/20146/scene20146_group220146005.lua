local base_info = {group_id = 220146005}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 5001,
    gadget_id = 70290480,
    pos = {
      x = 322.199,
      y = 75.214,
      z = 685.289
    },
    rot = {
      x = 0.0,
      y = 83.974,
      z = 0.0
    },
    level = 1,
    start_route = false,
    is_use_point_array = true
  }
}
regions = {
  {
    config_id = 5006,
    shape = RegionShape.SPHERE,
    radius = 1,
    pos = {
      x = 322.314,
      y = 77.629,
      z = 685.057
    }
  }
}
triggers = {
  {
    config_id = 1005002,
    name = "PLATFORM_ARRIVAL_5002",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_5002",
    action = "action_EVENT_PLATFORM_ARRIVAL_5002",
    trigger_count = 0
  },
  {
    config_id = 1005003,
    name = "PLATFORM_ARRIVAL_5003",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_5003",
    action = "action_EVENT_PLATFORM_ARRIVAL_5003",
    trigger_count = 0
  },
  {
    config_id = 1005004,
    name = "TIME_AXIS_PASS_5004",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "1",
    condition = "condition_EVENT_TIME_AXIS_PASS_5004",
    action = "action_EVENT_TIME_AXIS_PASS_5004",
    trigger_count = 0
  },
  {
    config_id = 1005005,
    name = "TIME_AXIS_PASS_5005",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "2",
    condition = "condition_EVENT_TIME_AXIS_PASS_5005",
    action = "action_EVENT_TIME_AXIS_PASS_5005",
    trigger_count = 0
  },
  {
    config_id = 1005006,
    name = "ENTER_REGION_5006",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_5006",
    action = "action_EVENT_ENTER_REGION_5006"
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
    gadgets = {5001},
    regions = {},
    triggers = {
      "PLATFORM_ARRIVAL_5002",
      "PLATFORM_ARRIVAL_5003",
      "TIME_AXIS_PASS_5004",
      "TIME_AXIS_PASS_5005"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {5006},
    triggers = {
      "ENTER_REGION_5006"
    },
    rand_weight = 100
  }
}
function condition_EVENT_PLATFORM_ARRIVAL_5002(context, evt)
  if 5001 ~= evt.param1 then
    return false
  end
  if 2 ~= evt.param2 then
    return false
  end
  if 3 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_5002(context, evt)
  ScriptLib.InitTimeAxis(context, "1", {5}, false)
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_5003(context, evt)
  if 5001 ~= evt.param1 then
    return false
  end
  if 2 ~= evt.param2 then
    return false
  end
  if 1 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_5003(context, evt)
  ScriptLib.InitTimeAxis(context, "2", {5}, false)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_5004(context, evt)
  if "1" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_5004(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 5001, 2, {2, 1}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 5001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_5005(context, evt)
  if "2" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_5005(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 5001, 2, {2, 3}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 5001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_5006(context, evt)
  if evt.param1 ~= 5006 then
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
function action_EVENT_ENTER_REGION_5006(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 5001, 2, {2, 3}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 5001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220146006, 2)
  return 0
end
