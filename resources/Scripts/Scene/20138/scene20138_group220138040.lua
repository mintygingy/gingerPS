local base_info = {group_id = 220138040}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 40001,
    gadget_id = 70690011,
    pos = {
      x = -1.628,
      y = 18.969,
      z = 60.355
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 40002,
    gadget_id = 70360002,
    pos = {
      x = 29.012,
      y = 34.084,
      z = 60.919
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
    config_id = 40003,
    shape = RegionShape.CUBIC,
    size = {
      x = 30.0,
      y = 20.0,
      z = 30.0
    },
    pos = {
      x = 2.76,
      y = 24.012,
      z = 59.124
    }
  },
  {
    config_id = 40004,
    shape = RegionShape.CUBIC,
    size = {
      x = 10.0,
      y = 30.0,
      z = 30.0
    },
    pos = {
      x = -16.372,
      y = 49.466,
      z = 60.755
    }
  },
  {
    config_id = 40005,
    shape = RegionShape.CUBIC,
    size = {
      x = 30.0,
      y = 30.0,
      z = 10.0
    },
    pos = {
      x = 1.881,
      y = 49.466,
      z = 41.664
    }
  },
  {
    config_id = 40006,
    shape = RegionShape.CUBIC,
    size = {
      x = 30.0,
      y = 30.0,
      z = 10.0
    },
    pos = {
      x = 2.916,
      y = 49.466,
      z = 81.018
    }
  }
}
triggers = {
  {
    config_id = 1040003,
    name = "ENTER_REGION_40003",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_40003",
    action = "action_EVENT_ENTER_REGION_40003",
    trigger_count = 0
  },
  {
    config_id = 1040004,
    name = "ENTER_REGION_40004",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_40004",
    action = "action_EVENT_ENTER_REGION_40004",
    trigger_count = 0
  },
  {
    config_id = 1040005,
    name = "ENTER_REGION_40005",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_40005",
    action = "action_EVENT_ENTER_REGION_40005",
    trigger_count = 0
  },
  {
    config_id = 1040006,
    name = "ENTER_REGION_40006",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_40006",
    action = "action_EVENT_ENTER_REGION_40006",
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
    gadgets = {40002},
    regions = {
      40003,
      40004,
      40005,
      40006
    },
    triggers = {
      "ENTER_REGION_40003",
      "ENTER_REGION_40004",
      "ENTER_REGION_40005",
      "ENTER_REGION_40006"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {40001},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_40003(context, evt)
  if evt.param1 ~= 40003 then
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
function action_EVENT_ENTER_REGION_40003(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220138040, 2)
  return 0
end
function condition_EVENT_ENTER_REGION_40004(context, evt)
  if evt.param1 ~= 40004 then
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
function action_EVENT_ENTER_REGION_40004(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220138040, 2)
  return 0
end
function condition_EVENT_ENTER_REGION_40005(context, evt)
  if evt.param1 ~= 40005 then
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
function action_EVENT_ENTER_REGION_40005(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220138040, 2)
  return 0
end
function condition_EVENT_ENTER_REGION_40006(context, evt)
  if evt.param1 ~= 40006 then
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
function action_EVENT_ENTER_REGION_40006(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220138040, 2)
  return 0
end
