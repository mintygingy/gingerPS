local base_info = {group_id = 220146010}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 10001,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 366.653,
      y = 77.355,
      z = 683.468
    }
  },
  {
    config_id = 10002,
    shape = RegionShape.SPHERE,
    radius = 15,
    pos = {
      x = 264.569,
      y = 96.358,
      z = 691.394
    }
  }
}
triggers = {
  {
    config_id = 1010001,
    name = "ENTER_REGION_10001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_10001",
    action = "action_EVENT_ENTER_REGION_10001"
  },
  {
    config_id = 1010002,
    name = "ENTER_REGION_10002",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_10002",
    action = "action_EVENT_ENTER_REGION_10002"
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
    regions = {10001, 10002},
    triggers = {
      "ENTER_REGION_10001",
      "ENTER_REGION_10002"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_10001(context, evt)
  if evt.param1 ~= 10001 then
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
function action_EVENT_ENTER_REGION_10001(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 33010179) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_10002(context, evt)
  if evt.param1 ~= 10002 then
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
function action_EVENT_ENTER_REGION_10002(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 33010193) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  return 0
end
