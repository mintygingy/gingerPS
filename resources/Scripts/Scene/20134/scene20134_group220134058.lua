local base_info = {group_id = 220134058}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 58002,
    gadget_id = 70310446,
    pos = {
      x = 294.0,
      y = 626.0,
      z = -1675.25
    },
    rot = {
      x = 9.27,
      y = 86.773,
      z = 4.771
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 58003,
    gadget_id = 70310459,
    pos = {
      x = 279.2,
      y = 629.25,
      z = -1689.0
    },
    rot = {
      x = 11.886,
      y = 20.542,
      z = 356.443
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 58004,
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
    config_id = 58001,
    shape = RegionShape.SPHERE,
    radius = 8,
    pos = {
      x = 300.842,
      y = 625.133,
      z = -1674.874
    }
  },
  {
    config_id = 58005,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 281.353,
      y = 627.79,
      z = -1679.244
    }
  },
  {
    config_id = 58006,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 271.931,
      y = 631.449,
      z = -1699.17
    }
  }
}
triggers = {
  {
    config_id = 1058001,
    name = "ENTER_REGION_58001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_58001",
    action = "action_EVENT_ENTER_REGION_58001"
  },
  {
    config_id = 1058005,
    name = "ENTER_REGION_58005",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_58005",
    action = "action_EVENT_ENTER_REGION_58005"
  },
  {
    config_id = 1058006,
    name = "ENTER_REGION_58006",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_58006",
    action = "action_EVENT_ENTER_REGION_58006"
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
      58001,
      58005,
      58006
    },
    triggers = {
      "ENTER_REGION_58001",
      "ENTER_REGION_58005",
      "ENTER_REGION_58006"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_58001(context, evt)
  if evt.param1 ~= 58001 then
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
function action_EVENT_ENTER_REGION_58001(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 58002}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_58005(context, evt)
  if evt.param1 ~= 58005 then
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
function action_EVENT_ENTER_REGION_58005(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 58003}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_58006(context, evt)
  if evt.param1 ~= 58006 then
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
function action_EVENT_ENTER_REGION_58006(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 58004}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  return 0
end
