local base_info = {group_id = 220134017}
local defs = {
  point_sum = 35,
  route_2 = 3,
  gadget_seelie = 17001
}
defs.final_point = defs.point_sum - 1
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 17001,
    gadget_id = 70310244,
    pos = {
      x = 620.426,
      y = 618.834,
      z = -1537.33
    },
    rot = {
      x = 0.0,
      y = 222.805,
      z = 0.0
    },
    level = 1
  }
}
regions = {
  {
    config_id = 17005,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 620.426,
      y = 618.834,
      z = -1537.33
    }
  }
}
triggers = {
  {
    config_id = 1017002,
    name = "GADGET_CREATE_17002",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_17002",
    action = "action_EVENT_GADGET_CREATE_17002",
    trigger_count = 0
  },
  {
    config_id = 1017003,
    name = "PLATFORM_REACH_POINT_17003",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_17003",
    action = "action_EVENT_PLATFORM_REACH_POINT_17003",
    trigger_count = 0
  },
  {
    config_id = 1017004,
    name = "AVATAR_NEAR_PLATFORM_17004",
    event = EventType.EVENT_AVATAR_NEAR_PLATFORM,
    source = "",
    condition = "condition_EVENT_AVATAR_NEAR_PLATFORM_17004",
    action = "action_EVENT_AVATAR_NEAR_PLATFORM_17004",
    trigger_count = 0
  },
  {
    config_id = 1017005,
    name = "ENTER_REGION_17005",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_17005",
    action = "action_EVENT_ENTER_REGION_17005",
    trigger_count = 0
  },
  {
    config_id = 1017006,
    name = "VARIABLE_CHANGE_17006",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_17006",
    action = "action_EVENT_VARIABLE_CHANGE_17006",
    trigger_count = 0
  },
  {
    config_id = 1017007,
    name = "GROUP_LOAD_17007",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_17007",
    trigger_count = 0
  },
  {
    config_id = 1017008,
    name = "AVATAR_NEAR_PLATFORM_17008",
    event = EventType.EVENT_AVATAR_NEAR_PLATFORM,
    source = "",
    condition = "condition_EVENT_AVATAR_NEAR_PLATFORM_17008",
    action = "action_EVENT_AVATAR_NEAR_PLATFORM_17008",
    trigger_count = 0
  },
  {
    config_id = 1017009,
    name = "AVATAR_NEAR_PLATFORM_17009",
    event = EventType.EVENT_AVATAR_NEAR_PLATFORM,
    source = "",
    condition = "condition_EVENT_AVATAR_NEAR_PLATFORM_17009",
    action = "action_EVENT_AVATAR_NEAR_PLATFORM_17009",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "reach",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 2,
    name = "reach2",
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
    regions = {17005},
    triggers = {
      "GADGET_CREATE_17002",
      "PLATFORM_REACH_POINT_17003",
      "AVATAR_NEAR_PLATFORM_17004",
      "ENTER_REGION_17005",
      "VARIABLE_CHANGE_17006",
      "GROUP_LOAD_17007",
      "AVATAR_NEAR_PLATFORM_17008",
      "AVATAR_NEAR_PLATFORM_17009"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {17001},
    regions = {},
    triggers = {
      "VARIABLE_CHANGE_17006"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_17002(context, evt)
  if 17001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_17002(context, evt)
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 17001, 3) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 17001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2005, 1, 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_17003(context, evt)
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
function action_EVENT_PLATFORM_REACH_POINT_17003(context, evt)
  if 0 ~= ScriptLib.StopPlatform(context, 17001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : stop_platform")
    return -1
  end
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2005, 3, 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  if 0 ~= ScriptLib.AddQuestProgress(context, "monaroute3complete") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "reach", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_AVATAR_NEAR_PLATFORM_17004(context, evt)
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
function action_EVENT_AVATAR_NEAR_PLATFORM_17004(context, evt)
  if 0 ~= ScriptLib.StartPlatform(context, 17001) then
    return -1
  end
  if 0 ~= evt.param3 then
    ScriptLib.MarkPlayerAction(context, 2005, 2, evt.param3 + 1)
  end
  return 0
end
function condition_EVENT_ENTER_REGION_17005(context, evt)
  if evt.param1 ~= 17005 then
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
function action_EVENT_ENTER_REGION_17005(context, evt)
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 17001, 3) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 17001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2005, 1, 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_17006(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "reach2") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_17006(context, evt)
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 17001, 5) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 17001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.AddQuestProgress(context, "monaroute3complete") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "reach", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function action_EVENT_GROUP_LOAD_17007(context, evt)
  if ScriptLib.GetHostQuestState(context, 4007604) == 2 then
    ScriptLib.AddExtraGroupSuite(context, 220134017, 2)
  end
  return 0
end
function condition_EVENT_AVATAR_NEAR_PLATFORM_17008(context, evt)
  if 17001 ~= evt.param1 then
    return false
  end
  if 5 ~= evt.param2 then
    return false
  end
  if 1 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_AVATAR_NEAR_PLATFORM_17008(context, evt)
  if 0 ~= ScriptLib.StartPlatform(context, 17001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  return 0
end
function condition_EVENT_AVATAR_NEAR_PLATFORM_17009(context, evt)
  if 17001 ~= evt.param1 then
    return false
  end
  if 5 ~= evt.param2 then
    return false
  end
  if 3 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_AVATAR_NEAR_PLATFORM_17009(context, evt)
  if 0 ~= ScriptLib.StartPlatform(context, 17001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  return 0
end
