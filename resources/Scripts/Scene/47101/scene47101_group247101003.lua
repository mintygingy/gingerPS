local base_info = {group_id = 247101003}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 3001,
    gadget_id = 70710535,
    pos = {
      x = 219.071,
      y = 84.5,
      z = 213.377
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
    radius = 5,
    pos = {
      x = 219.369,
      y = 90.179,
      z = 213.485
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
    name = "GROUP_LOAD_3003",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_3003",
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
    regions = {3002},
    triggers = {
      "ENTER_REGION_3002",
      "GROUP_LOAD_3003"
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
  ScriptLib.AddExtraGroupSuite(context, 247101003, 2)
  return 0
end
function action_EVENT_GROUP_LOAD_3003(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 247101003, 2)
  return 0
end
