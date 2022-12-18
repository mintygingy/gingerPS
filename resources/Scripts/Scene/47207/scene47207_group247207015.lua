local base_info = {group_id = 247207015}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 15007,
    gadget_id = 70900201,
    pos = {
      x = 324.36,
      y = 158.404,
      z = 402.624
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 15008,
    gadget_id = 70900203,
    pos = {
      x = 210.883,
      y = 160.929,
      z = 292.255
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
    config_id = 15003,
    shape = RegionShape.CUBIC,
    size = {
      x = 20.0,
      y = 20.0,
      z = 20.0
    },
    pos = {
      x = 324.263,
      y = 162.114,
      z = 442.007
    }
  },
  {
    config_id = 15004,
    shape = RegionShape.CUBIC,
    size = {
      x = 10.0,
      y = 20.0,
      z = 10.0
    },
    pos = {
      x = 181.012,
      y = 150.872,
      z = 442.007
    }
  },
  {
    config_id = 15005,
    shape = RegionShape.CUBIC,
    size = {
      x = 20.0,
      y = 20.0,
      z = 10.0
    },
    pos = {
      x = 324.36,
      y = 161.101,
      z = 402.624
    }
  },
  {
    config_id = 15006,
    shape = RegionShape.CUBIC,
    size = {
      x = 10.0,
      y = 20.0,
      z = 10.0
    },
    pos = {
      x = 210.883,
      y = 163.117,
      z = 292.255
    }
  }
}
triggers = {
  {
    config_id = 1015003,
    name = "ENTER_REGION_15003",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_15003",
    action = "action_EVENT_ENTER_REGION_15003",
    trigger_count = 0
  },
  {
    config_id = 1015004,
    name = "ENTER_REGION_15004",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_15004",
    action = "action_EVENT_ENTER_REGION_15004",
    trigger_count = 0
  },
  {
    config_id = 1015005,
    name = "ENTER_REGION_15005",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_15005",
    action = "action_EVENT_ENTER_REGION_15005",
    trigger_count = 0
  },
  {
    config_id = 1015006,
    name = "ENTER_REGION_15006",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_15006",
    action = "action_EVENT_ENTER_REGION_15006",
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
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {15003, 15004},
    triggers = {
      "ENTER_REGION_15003",
      "ENTER_REGION_15004"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {15007},
    regions = {
      15003,
      15004,
      15005
    },
    triggers = {
      "ENTER_REGION_15003",
      "ENTER_REGION_15004",
      "ENTER_REGION_15005"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {15008},
    regions = {
      15003,
      15004,
      15006
    },
    triggers = {
      "ENTER_REGION_15003",
      "ENTER_REGION_15004",
      "ENTER_REGION_15006"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_15003(context, evt)
  if evt.param1 ~= 15003 then
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
function action_EVENT_ENTER_REGION_15003(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 247207015, suite = 3}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_15004(context, evt)
  if evt.param1 ~= 15004 then
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
function action_EVENT_ENTER_REGION_15004(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 247207015, suite = 4}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_15005(context, evt)
  if evt.param1 ~= 15005 then
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
function action_EVENT_ENTER_REGION_15005(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 247207015, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_15006(context, evt)
  if evt.param1 ~= 15006 then
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
function action_EVENT_ENTER_REGION_15006(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 247207015, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
