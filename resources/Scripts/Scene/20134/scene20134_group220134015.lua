local base_info = {group_id = 220134015}
local defs = {
  point_sum = 12,
  route_2 = 1,
  gadget_seelie = 15002
}
defs.final_point = defs.point_sum - 1
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 15002,
    gadget_id = 70310244,
    pos = {
      x = 388.114,
      y = 612.962,
      z = -1648.154
    },
    rot = {
      x = 0.0,
      y = 67.165,
      z = 0.0
    },
    level = 1
  }
}
regions = {
  {
    config_id = 15007,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 388.896,
      y = 613.406,
      z = -1648.215
    }
  }
}
triggers = {
  {
    config_id = 1015001,
    name = "GADGET_CREATE_15001",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_15001",
    action = "action_EVENT_GADGET_CREATE_15001",
    trigger_count = 0
  },
  {
    config_id = 1015003,
    name = "GROUP_LOAD_15003",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_15003",
    trigger_count = 0
  },
  {
    config_id = 1015005,
    name = "PLATFORM_REACH_POINT_15005",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_15005",
    action = "action_EVENT_PLATFORM_REACH_POINT_15005",
    trigger_count = 0
  },
  {
    config_id = 1015006,
    name = "AVATAR_NEAR_PLATFORM_15006",
    event = EventType.EVENT_AVATAR_NEAR_PLATFORM,
    source = "",
    condition = "condition_EVENT_AVATAR_NEAR_PLATFORM_15006",
    action = "action_EVENT_AVATAR_NEAR_PLATFORM_15006",
    trigger_count = 0
  },
  {
    config_id = 1015007,
    name = "ENTER_REGION_15007",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_15007",
    action = "action_EVENT_ENTER_REGION_15007",
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
    regions = {15007},
    triggers = {
      "GADGET_CREATE_15001",
      "GROUP_LOAD_15003",
      "PLATFORM_REACH_POINT_15005",
      "AVATAR_NEAR_PLATFORM_15006",
      "ENTER_REGION_15007"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {15002},
    regions = {15007},
    triggers = {
      "GADGET_CREATE_15001",
      "GROUP_LOAD_15003",
      "PLATFORM_REACH_POINT_15005",
      "AVATAR_NEAR_PLATFORM_15006",
      "ENTER_REGION_15007"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_15001(context, evt)
  if 15002 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_15001(context, evt)
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 15002, 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 15002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2005, 1, 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  return 0
end
function action_EVENT_GROUP_LOAD_15003(context, evt)
  if ScriptLib.GetHostQuestState(context, 4007417) == 2 or ScriptLib.GetHostQuestState(context, 4007406) == 2 then
    ScriptLib.RefreshGroup(context, {group_id = 220134015, suite = 2})
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_15005(context, evt)
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
function action_EVENT_PLATFORM_REACH_POINT_15005(context, evt)
  if 0 ~= ScriptLib.StopPlatform(context, 15002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : stop_platform")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 15002}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2005, 3, 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  if 0 ~= ScriptLib.AddQuestProgress(context, "monaroute1complete") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "reach", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_AVATAR_NEAR_PLATFORM_15006(context, evt)
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
function action_EVENT_AVATAR_NEAR_PLATFORM_15006(context, evt)
  if 0 ~= ScriptLib.StartPlatform(context, 15002) then
    return -1
  end
  if 0 ~= evt.param3 then
    ScriptLib.MarkPlayerAction(context, 2005, 2, evt.param3 + 1)
  end
  return 0
end
function condition_EVENT_ENTER_REGION_15007(context, evt)
  if evt.param1 ~= 15007 then
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
function action_EVENT_ENTER_REGION_15007(context, evt)
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 15002, 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 15002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2005, 1, 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  return 0
end
