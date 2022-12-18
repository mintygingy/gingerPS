local base_info = {group_id = 247102003}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 3001,
    gadget_id = 70710535,
    pos = {
      x = 720.311,
      y = 84.5,
      z = 781.183
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {
  {
    config_id = 3002,
    shape = RegionShape.SPHERE,
    radius = 8,
    pos = {
      x = 720.159,
      y = 90.179,
      z = 781.193
    }
  },
  {
    config_id = 3003,
    shape = RegionShape.SPHERE,
    radius = 12,
    pos = {
      x = 741.946,
      y = 93.512,
      z = 747.81
    }
  }
}
triggers = {
  {
    config_id = 1003002,
    name = "ENTER_REGION_3002",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3002",
    action = "action_EVENT_ENTER_REGION_3002",
    trigger_count = 0
  },
  {
    config_id = 1003003,
    name = "ENTER_REGION_3003",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3003",
    action = "action_EVENT_ENTER_REGION_3003",
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
    regions = {3002, 3003},
    triggers = {
      "ENTER_REGION_3002",
      "ENTER_REGION_3003"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {3001},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_3002(context, evt)
  if evt.param1 ~= 3002 then
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
function action_EVENT_ENTER_REGION_3002(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 247102003, 2)
  return 0
end
function condition_EVENT_ENTER_REGION_3003(context, evt)
  if evt.param1 ~= 3003 then
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
function action_EVENT_ENTER_REGION_3003(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 247102003, 2)
  return 0
end
