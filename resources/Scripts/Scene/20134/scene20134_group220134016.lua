local base_info = {group_id = 220134016}
local defs = {
  point_sum = 27,
  route_2 = 2,
  gadget_seelie = 16001
}
defs.final_point = defs.point_sum - 1
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 16001,
    gadget_id = 70310244,
    pos = {
      x = 582.338,
      y = 620.4,
      z = -1639.299
    },
    rot = {
      x = 0.0,
      y = 316.716,
      z = 0.0
    },
    level = 1
  }
}
regions = {
  {
    config_id = 16005,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 601.745,
      y = 619.622,
      z = -1650.804
    }
  }
}
triggers = {
  {
    config_id = 1016002,
    name = "GADGET_CREATE_16002",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_16002",
    action = "action_EVENT_GADGET_CREATE_16002",
    trigger_count = 0
  },
  {
    config_id = 1016003,
    name = "PLATFORM_REACH_POINT_16003",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_16003",
    action = "action_EVENT_PLATFORM_REACH_POINT_16003",
    trigger_count = 0
  },
  {
    config_id = 1016004,
    name = "AVATAR_NEAR_PLATFORM_16004",
    event = EventType.EVENT_AVATAR_NEAR_PLATFORM,
    source = "",
    condition = "condition_EVENT_AVATAR_NEAR_PLATFORM_16004",
    action = "action_EVENT_AVATAR_NEAR_PLATFORM_16004",
    trigger_count = 0
  },
  {
    config_id = 1016005,
    name = "ENTER_REGION_16005",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_16005",
    action = "action_EVENT_ENTER_REGION_16005",
    trigger_count = 0
  },
  {
    config_id = 1016006,
    name = "GROUP_LOAD_16006",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_16006",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "reach",
    value = 0,
    no_refresh = true
  }
}
init_config = {
  suite = 1,
  end_suite = 2,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {},
    regions = {16005},
    triggers = {
      "GADGET_CREATE_16002",
      "PLATFORM_REACH_POINT_16003",
      "AVATAR_NEAR_PLATFORM_16004",
      "ENTER_REGION_16005",
      "GROUP_LOAD_16006"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {16001},
    regions = {16005},
    triggers = {
      "GADGET_CREATE_16002",
      "PLATFORM_REACH_POINT_16003",
      "AVATAR_NEAR_PLATFORM_16004",
      "ENTER_REGION_16005",
      "GROUP_LOAD_16006"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_16002(context, evt)
  if 16001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_16002(context, evt)
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 16001, 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 16001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2005, 1, 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_16003(context, evt)
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
function action_EVENT_PLATFORM_REACH_POINT_16003(context, evt)
  if 0 ~= ScriptLib.StopPlatform(context, 16001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : stop_platform")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 16001}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2005, 3, 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  if 0 ~= ScriptLib.AddQuestProgress(context, "monaroute2complete") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "reach", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_AVATAR_NEAR_PLATFORM_16004(context, evt)
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
function action_EVENT_AVATAR_NEAR_PLATFORM_16004(context, evt)
  if 0 ~= ScriptLib.StartPlatform(context, 16001) then
    return -1
  end
  if 0 ~= evt.param3 then
    ScriptLib.MarkPlayerAction(context, 2005, 2, evt.param3 + 1)
  end
  return 0
end
function condition_EVENT_ENTER_REGION_16005(context, evt)
  if evt.param1 ~= 16005 then
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
function action_EVENT_ENTER_REGION_16005(context, evt)
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 16001, 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 16001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2005, 1, 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  return 0
end
function action_EVENT_GROUP_LOAD_16006(context, evt)
  if ScriptLib.GetHostQuestState(context, 4007504) == 2 then
    ScriptLib.AddExtraGroupSuite(context, 220134016, 2)
  end
  return 0
end
