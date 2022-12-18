local base_info = {group_id = 220157007}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 7001,
    shape = RegionShape.CUBIC,
    size = {
      x = 10.0,
      y = 10.0,
      z = 10.0
    },
    pos = {
      x = 323.123,
      y = 183.448,
      z = 282.834
    }
  },
  {
    config_id = 7002,
    shape = RegionShape.CUBIC,
    size = {
      x = 20.0,
      y = 30.0,
      z = 10.0
    },
    pos = {
      x = 268.272,
      y = 187.774,
      z = 257.745
    }
  }
}
triggers = {
  {
    config_id = 1007001,
    name = "ENTER_REGION_7001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_7001",
    action = "action_EVENT_ENTER_REGION_7001"
  },
  {
    config_id = 1007002,
    name = "ENTER_REGION_7002",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_7002",
    action = "action_EVENT_ENTER_REGION_7002"
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
    regions = {7001},
    triggers = {
      "ENTER_REGION_7001"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {7002},
    triggers = {
      "ENTER_REGION_7002"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_7001(context, evt)
  if evt.param1 ~= 7001 then
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
function action_EVENT_ENTER_REGION_7001(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 201570101) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_7002(context, evt)
  if evt.param1 ~= 7002 then
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
function action_EVENT_ENTER_REGION_7002(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 201570201) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  return 0
end
