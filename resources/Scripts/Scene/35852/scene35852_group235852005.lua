local base_info = {group_id = 235852005}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 5002,
    gadget_id = 70310446,
    pos = {
      x = 294.0,
      y = 626.04,
      z = -1675.25
    },
    rot = {
      x = 9.27,
      y = 86.77,
      z = 4.77
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 5003,
    gadget_id = 70310459,
    pos = {
      x = 279.2,
      y = 629.25,
      z = -1689.0
    },
    rot = {
      x = 11.86,
      y = 20.54,
      z = 356.443
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 5004,
    gadget_id = 70310459,
    pos = {
      x = 263.36,
      y = 632.8,
      z = -1700.469
    },
    rot = {
      x = 13.155,
      y = 97.045,
      z = 7.406
    },
    level = 1,
    persistent = true
  }
}
regions = {
  {
    config_id = 5001,
    shape = RegionShape.SPHERE,
    radius = 8,
    pos = {
      x = 298.594,
      y = 625.315,
      z = -1675.707
    }
  },
  {
    config_id = 5005,
    shape = RegionShape.SPHERE,
    radius = 8,
    pos = {
      x = 281.206,
      y = 627.789,
      z = -1679.588
    }
  },
  {
    config_id = 5006,
    shape = RegionShape.SPHERE,
    radius = 8,
    pos = {
      x = 271.918,
      y = 631.449,
      z = -1699.468
    }
  }
}
triggers = {
  {
    config_id = 1005001,
    name = "ENTER_REGION_5001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_5001",
    action = "action_EVENT_ENTER_REGION_5001",
    trigger_count = 0
  },
  {
    config_id = 1005005,
    name = "ENTER_REGION_5005",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_5005",
    action = "action_EVENT_ENTER_REGION_5005",
    trigger_count = 0
  },
  {
    config_id = 1005006,
    name = "ENTER_REGION_5006",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_5006",
    action = "action_EVENT_ENTER_REGION_5006",
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
    regions = {
      5001,
      5005,
      5006
    },
    triggers = {
      "ENTER_REGION_5001",
      "ENTER_REGION_5005",
      "ENTER_REGION_5006"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_5001(context, evt)
  if evt.param1 ~= 5001 then
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
function action_EVENT_ENTER_REGION_5001(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 5002}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_5005(context, evt)
  if evt.param1 ~= 5005 then
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
function action_EVENT_ENTER_REGION_5005(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 5003}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_5006(context, evt)
  if evt.param1 ~= 5006 then
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
function action_EVENT_ENTER_REGION_5006(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 5004}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  return 0
end
