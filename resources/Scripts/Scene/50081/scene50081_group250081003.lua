local base_info = {group_id = 250081003}
local defs = {
  point_sum = 11,
  route_2 = 65,
  gadget_seelie = 3033
}
defs.final_point = defs.point_sum - 1
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 3001,
    gadget_id = 70380301,
    pos = {
      x = 301.603,
      y = 80.347,
      z = 848.089
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    start_route = false
  },
  {
    config_id = 3002,
    gadget_id = 70380301,
    pos = {
      x = 263.149,
      y = 81.524,
      z = 848.561
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    start_route = false,
    is_use_point_array = true
  },
  {
    config_id = 3003,
    gadget_id = 70380301,
    pos = {
      x = 312.663,
      y = 81.821,
      z = 817.771
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    start_route = false
  },
  {
    config_id = 3004,
    gadget_id = 70380301,
    pos = {
      x = 312.663,
      y = 77.482,
      z = 828.131
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    start_route = false
  },
  {
    config_id = 3005,
    gadget_id = 70380301,
    pos = {
      x = 312.663,
      y = 78.95,
      z = 808.248
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    start_route = false
  },
  {
    config_id = 3006,
    gadget_id = 70380301,
    pos = {
      x = 323.414,
      y = 77.629,
      z = 828.131
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    start_route = false
  },
  {
    config_id = 3007,
    gadget_id = 70380301,
    pos = {
      x = 323.414,
      y = 77.575,
      z = 808.248
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    start_route = false
  },
  {
    config_id = 3008,
    gadget_id = 70380301,
    pos = {
      x = 333.418,
      y = 77.375,
      z = 828.131
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    start_route = false
  },
  {
    config_id = 3009,
    gadget_id = 70380301,
    pos = {
      x = 333.418,
      y = 78.695,
      z = 808.248
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    start_route = false
  },
  {
    config_id = 3010,
    gadget_id = 70380301,
    pos = {
      x = 343.382,
      y = 76.919,
      z = 828.131
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    start_route = false
  },
  {
    config_id = 3011,
    gadget_id = 70380301,
    pos = {
      x = 343.382,
      y = 77.39,
      z = 808.248
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    start_route = false
  },
  {
    config_id = 3012,
    gadget_id = 70380301,
    pos = {
      x = 353.52,
      y = 79.309,
      z = 828.131
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    start_route = false
  },
  {
    config_id = 3013,
    gadget_id = 70380301,
    pos = {
      x = 353.52,
      y = 77.879,
      z = 808.248
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    start_route = false
  },
  {
    config_id = 3014,
    gadget_id = 70380301,
    pos = {
      x = 363.484,
      y = 77.396,
      z = 828.131
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    start_route = false
  },
  {
    config_id = 3015,
    gadget_id = 70380301,
    pos = {
      x = 363.484,
      y = 77.653,
      z = 808.248
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    start_route = false
  },
  {
    config_id = 3016,
    gadget_id = 70380301,
    pos = {
      x = 373.454,
      y = 77.628,
      z = 828.131
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    start_route = false
  },
  {
    config_id = 3017,
    gadget_id = 70380301,
    pos = {
      x = 373.454,
      y = 77.751,
      z = 808.248
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    start_route = false
  },
  {
    config_id = 3018,
    gadget_id = 70380301,
    pos = {
      x = 353.52,
      y = 61.63,
      z = 818.143
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    start_route = false
  },
  {
    config_id = 3019,
    gadget_id = 70380301,
    pos = {
      x = 333.418,
      y = 61.177,
      z = 818.143
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    start_route = false
  },
  {
    config_id = 3020,
    gadget_id = 70380301,
    pos = {
      x = 353.52,
      y = 60.893,
      z = 798.296
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    start_route = false
  },
  {
    config_id = 3021,
    gadget_id = 70380301,
    pos = {
      x = 333.418,
      y = 60.844,
      z = 798.296
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    start_route = false
  },
  {
    config_id = 3022,
    gadget_id = 70380301,
    pos = {
      x = 353.52,
      y = 60.661,
      z = 787.548
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    start_route = false
  },
  {
    config_id = 3023,
    gadget_id = 70380301,
    pos = {
      x = 333.418,
      y = 60.941,
      z = 788.4
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    start_route = false
  },
  {
    config_id = 3024,
    gadget_id = 70380301,
    pos = {
      x = 347.926,
      y = 79.452,
      z = 780.243
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    start_route = false
  },
  {
    config_id = 3025,
    gadget_id = 70380301,
    pos = {
      x = 337.995,
      y = 79.452,
      z = 780.213
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    start_route = false
  },
  {
    config_id = 3026,
    gadget_id = 70380301,
    pos = {
      x = 333.783,
      y = 79.452,
      z = 747.28
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    start_route = false
  },
  {
    config_id = 3027,
    gadget_id = 70380301,
    pos = {
      x = 372.785,
      y = 81.974,
      z = 674.661
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    start_route = false
  },
  {
    config_id = 3033,
    gadget_id = 70710010,
    pos = {
      x = 300.104,
      y = 71.66,
      z = 846.342
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    start_route = false
  },
  {
    config_id = 3046,
    gadget_id = 70310241,
    pos = {
      x = 360.088,
      y = 66.746,
      z = 712.682
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3047,
    gadget_id = 70290235,
    pos = {
      x = 365.339,
      y = 64.87,
      z = 708.576
    },
    rot = {
      x = 20.294,
      y = 0.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {
  {
    config_id = 3028,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 274.076,
      y = 71.66,
      z = 848.47
    }
  },
  {
    config_id = 3029,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 262.602,
      y = 71.66,
      z = 818.634
    }
  },
  {
    config_id = 3030,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 291.642,
      y = 71.66,
      z = 808.269
    }
  },
  {
    config_id = 3031,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 302.586,
      y = 71.66,
      z = 836.33
    }
  },
  {
    config_id = 3032,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 291.642,
      y = 71.66,
      z = 808.269
    }
  },
  {
    config_id = 3035,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 302.203,
      y = 71.66,
      z = 845.335
    }
  },
  {
    config_id = 3037,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 308.019,
      y = 72.029,
      z = 818.864
    }
  },
  {
    config_id = 3039,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 302.596,
      y = 71.66,
      z = 816.855
    }
  },
  {
    config_id = 3040,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 263.25,
      y = 71.66,
      z = 838.559
    }
  },
  {
    config_id = 3041,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 271.807,
      y = 71.66,
      z = 807.716
    }
  },
  {
    config_id = 3042,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 293.287,
      y = 71.66,
      z = 848.66
    }
  },
  {
    config_id = 3043,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 340.635,
      y = 71.66,
      z = 818.43
    }
  },
  {
    config_id = 3045,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 343.223,
      y = 71.66,
      z = 789.752
    }
  }
}
triggers = {
  {
    config_id = 1003028,
    name = "ENTER_REGION_3028",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3028",
    action = "action_EVENT_ENTER_REGION_3028",
    trigger_count = 0
  },
  {
    config_id = 1003029,
    name = "ENTER_REGION_3029",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3029",
    action = "action_EVENT_ENTER_REGION_3029",
    trigger_count = 0
  },
  {
    config_id = 1003030,
    name = "ENTER_REGION_3030",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3030",
    action = "action_EVENT_ENTER_REGION_3030",
    trigger_count = 0
  },
  {
    config_id = 1003031,
    name = "ENTER_REGION_3031",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3031",
    action = "action_EVENT_ENTER_REGION_3031",
    trigger_count = 0
  },
  {
    config_id = 1003032,
    name = "ENTER_REGION_3032",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3032",
    action = "action_EVENT_ENTER_REGION_3032"
  },
  {
    config_id = 1003034,
    name = "PLATFORM_REACH_POINT_3034",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_3034",
    action = "action_EVENT_PLATFORM_REACH_POINT_3034"
  },
  {
    config_id = 1003035,
    name = "ENTER_REGION_3035",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3035",
    action = "action_EVENT_ENTER_REGION_3035",
    trigger_count = 0
  },
  {
    config_id = 1003036,
    name = "AVATAR_NEAR_PLATFORM_3036",
    event = EventType.EVENT_AVATAR_NEAR_PLATFORM,
    source = "",
    condition = "condition_EVENT_AVATAR_NEAR_PLATFORM_3036",
    action = "action_EVENT_AVATAR_NEAR_PLATFORM_3036",
    trigger_count = 0
  },
  {
    config_id = 1003037,
    name = "ENTER_REGION_3037",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3037",
    action = "action_EVENT_ENTER_REGION_3037"
  },
  {
    config_id = 1003038,
    name = "GROUP_LOAD_3038",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_3038",
    trigger_count = 0
  },
  {
    config_id = 1003039,
    name = "ENTER_REGION_3039",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3039",
    action = "action_EVENT_ENTER_REGION_3039",
    trigger_count = 0
  },
  {
    config_id = 1003040,
    name = "ENTER_REGION_3040",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3040",
    action = "action_EVENT_ENTER_REGION_3040",
    trigger_count = 0
  },
  {
    config_id = 1003041,
    name = "ENTER_REGION_3041",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3041",
    action = "action_EVENT_ENTER_REGION_3041",
    trigger_count = 0
  },
  {
    config_id = 1003042,
    name = "ENTER_REGION_3042",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3042",
    action = "action_EVENT_ENTER_REGION_3042",
    trigger_count = 0
  },
  {
    config_id = 1003043,
    name = "ENTER_REGION_3043",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3043",
    action = "action_EVENT_ENTER_REGION_3043"
  },
  {
    config_id = 1003044,
    name = "PLATFORM_REACH_POINT_3044",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_3044",
    action = "action_EVENT_PLATFORM_REACH_POINT_3044"
  },
  {
    config_id = 1003045,
    name = "ENTER_REGION_3045",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3045",
    action = "action_EVENT_ENTER_REGION_3045"
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
    gadgets = {
      3001,
      3002,
      3003,
      3004,
      3005,
      3006,
      3007,
      3008,
      3009,
      3010,
      3011,
      3012,
      3013,
      3014,
      3015,
      3016,
      3017,
      3018,
      3019,
      3020,
      3021,
      3022,
      3023,
      3024,
      3025,
      3026,
      3027,
      3046,
      3047
    },
    regions = {
      3032,
      3043,
      3045
    },
    triggers = {
      "ENTER_REGION_3032",
      "PLATFORM_REACH_POINT_3034",
      "GROUP_LOAD_3038",
      "ENTER_REGION_3043",
      "PLATFORM_REACH_POINT_3044",
      "ENTER_REGION_3045"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {3033},
    regions = {3035},
    triggers = {
      "ENTER_REGION_3035",
      "AVATAR_NEAR_PLATFORM_3036"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {3037},
    triggers = {
      "ENTER_REGION_3037"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {3029, 3041},
    triggers = {
      "ENTER_REGION_3029",
      "ENTER_REGION_3041"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {3030, 3039},
    triggers = {
      "ENTER_REGION_3030",
      "ENTER_REGION_3039"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {3031, 3042},
    triggers = {
      "ENTER_REGION_3031",
      "ENTER_REGION_3042"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {3028, 3040},
    triggers = {
      "ENTER_REGION_3028",
      "ENTER_REGION_3040"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_3028(context, evt)
  if evt.param1 ~= 3028 then
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
function action_EVENT_ENTER_REGION_3028(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 3002, 1, {1}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 250081003, 4)
  ScriptLib.RemoveExtraGroupSuite(context, 250081003, 7)
  return 0
end
function condition_EVENT_ENTER_REGION_3029(context, evt)
  if evt.param1 ~= 3029 then
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
function action_EVENT_ENTER_REGION_3029(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 3002, 1, {2}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 250081003, 5)
  ScriptLib.RemoveExtraGroupSuite(context, 250081003, 4)
  return 0
end
function condition_EVENT_ENTER_REGION_3030(context, evt)
  if evt.param1 ~= 3030 then
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
function action_EVENT_ENTER_REGION_3030(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 3002, 1, {3}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 250081003, 6)
  ScriptLib.RemoveExtraGroupSuite(context, 250081003, 5)
  return 0
end
function condition_EVENT_ENTER_REGION_3031(context, evt)
  if evt.param1 ~= 3031 then
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
function action_EVENT_ENTER_REGION_3031(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 3002, 1, {4}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 250081003, 7)
  ScriptLib.RemoveExtraGroupSuite(context, 250081003, 6)
  return 0
end
function condition_EVENT_ENTER_REGION_3032(context, evt)
  if evt.param1 ~= 3032 then
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
function action_EVENT_ENTER_REGION_3032(context, evt)
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 250081003, EntityType.GADGET, 3001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 250081003, 2)
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_3034(context, evt)
  if 3033 ~= evt.param1 then
    return false
  end
  if 65 ~= evt.param2 then
    return false
  end
  if 3 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_3034(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 250081003, 3)
  return 0
end
function condition_EVENT_ENTER_REGION_3035(context, evt)
  if evt.param1 ~= 3035 then
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
function action_EVENT_ENTER_REGION_3035(context, evt)
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 3033, 65) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2005, 1, 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  return 0
end
function condition_EVENT_AVATAR_NEAR_PLATFORM_3036(context, evt)
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
function action_EVENT_AVATAR_NEAR_PLATFORM_3036(context, evt)
  if 0 ~= ScriptLib.StartPlatform(context, 3033) then
    return -1
  end
  if 0 ~= evt.param3 then
    ScriptLib.MarkPlayerAction(context, 2005, 2, evt.param3 + 1)
  end
  return 0
end
function condition_EVENT_ENTER_REGION_3037(context, evt)
  if evt.param1 ~= 3037 then
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
function action_EVENT_ENTER_REGION_3037(context, evt)
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 3003, 64) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 3003) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  return 0
end
function action_EVENT_GROUP_LOAD_3038(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 250081003, 7)
  return 0
end
function condition_EVENT_ENTER_REGION_3039(context, evt)
  if evt.param1 ~= 3039 then
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
function action_EVENT_ENTER_REGION_3039(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 3002, 1, {1}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 250081003, 4)
  ScriptLib.RemoveExtraGroupSuite(context, 250081003, 5)
  return 0
end
function condition_EVENT_ENTER_REGION_3040(context, evt)
  if evt.param1 ~= 3040 then
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
function action_EVENT_ENTER_REGION_3040(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 3002, 1, {3}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 250081003, 6)
  ScriptLib.RemoveExtraGroupSuite(context, 250081003, 7)
  return 0
end
function condition_EVENT_ENTER_REGION_3041(context, evt)
  if evt.param1 ~= 3041 then
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
function action_EVENT_ENTER_REGION_3041(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 3002, 1, {4}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 250081003, 7)
  ScriptLib.RemoveExtraGroupSuite(context, 250081003, 4)
  return 0
end
function condition_EVENT_ENTER_REGION_3042(context, evt)
  if evt.param1 ~= 3042 then
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
function action_EVENT_ENTER_REGION_3042(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 3002, 1, {2}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 250081003, 5)
  ScriptLib.RemoveExtraGroupSuite(context, 250081003, 6)
  return 0
end
function condition_EVENT_ENTER_REGION_3043(context, evt)
  if evt.param1 ~= 3043 then
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
function action_EVENT_ENTER_REGION_3043(context, evt)
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 3004, 66) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 3005, 67) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 3006, 68) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 3007, 69) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 3008, 70) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 3009, 71) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 3010, 72) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 3011, 73) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 3012, 74) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 3013, 75) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 3014, 76) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 3015, 77) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 3016, 78) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 3017, 79) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 3004) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 3005) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 3006) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 3007) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 3008) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 3009) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 3010) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 3011) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 3012) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 3013) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 3014) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 3015) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 3016) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 3017) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_3044(context, evt)
  if 3004 ~= evt.param1 then
    return false
  end
  if 66 ~= evt.param2 then
    return false
  end
  if 0 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_3044(context, evt)
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 3018, 80) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 3019, 81) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 3020, 82) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 3021, 83) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 3022, 84) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 3023, 85) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 3012, 86) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 3008, 87) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 3013, 88) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 3009, 89) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 3018) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 3019) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 3020) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 3021) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 3022) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 3023) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 3012) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 3008) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 3013) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 3009) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_3045(context, evt)
  if evt.param1 ~= 3045 then
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
function action_EVENT_ENTER_REGION_3045(context, evt)
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 3024, 90) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 3025, 91) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 3024) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 3025) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  return 0
end
