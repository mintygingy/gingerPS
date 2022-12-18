local base_info = {group_id = 250083001}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 1001,
    gadget_id = 70380001,
    pos = {
      x = -90.293,
      y = -29.735,
      z = 64.686
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 268.946
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 1003,
    gadget_id = 70310175,
    pos = {
      x = -89.4,
      y = -29.323,
      z = 64.518
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 270.0
    },
    level = 1,
    is_use_point_array = true
  }
}
regions = {
  {
    config_id = 1002,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = -79.354,
      y = -31.322,
      z = 55.086
    }
  }
}
triggers = {
  {
    config_id = 1001002,
    name = "ENTER_REGION_1002",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_1002",
    action = "action_EVENT_ENTER_REGION_1002",
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
    gadgets = {1001, 1003},
    regions = {1002},
    triggers = {
      "ENTER_REGION_1002"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_1002(context, evt)
  if evt.param1 ~= 1002 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 0 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_1002(context, evt)
  local tempParam = {route_type = 0, turn_mode = true}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 1001, 1, {1, 2}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  local tempParam = {route_type = 0, turn_mode = true}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 1003, 2, {1, 2}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  return 0
end
