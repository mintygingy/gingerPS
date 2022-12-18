local base_info = {group_id = 247206014}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 14003,
    gadget_id = 70900201,
    pos = {
      x = 278.601,
      y = 160.649,
      z = 442.0
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 14006,
    gadget_id = 70900201,
    pos = {
      x = 273.319,
      y = 160.958,
      z = 292.256
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
    config_id = 14001,
    shape = RegionShape.CUBIC,
    size = {
      x = 25.0,
      y = 20.0,
      z = 20.0
    },
    pos = {
      x = 324.553,
      y = 163.738,
      z = 440.865
    }
  },
  {
    config_id = 14002,
    shape = RegionShape.SPHERE,
    radius = 20,
    pos = {
      x = 301.824,
      y = 172.942,
      z = 287.098
    }
  },
  {
    config_id = 14004,
    shape = RegionShape.CUBIC,
    size = {
      x = 15.0,
      y = 20.0,
      z = 25.0
    },
    pos = {
      x = 278.601,
      y = 164.712,
      z = 442.0
    }
  },
  {
    config_id = 14005,
    shape = RegionShape.CUBIC,
    size = {
      x = 10.0,
      y = 15.0,
      z = 15.0
    },
    pos = {
      x = 273.319,
      y = 165.061,
      z = 292.256
    }
  }
}
triggers = {
  {
    config_id = 1014001,
    name = "ENTER_REGION_14001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_14001",
    action = "action_EVENT_ENTER_REGION_14001",
    trigger_count = 0
  },
  {
    config_id = 1014002,
    name = "ENTER_REGION_14002",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_14002",
    action = "action_EVENT_ENTER_REGION_14002",
    trigger_count = 0,
    forbid_guest = false
  },
  {
    config_id = 1014004,
    name = "ENTER_REGION_14004",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_14004",
    action = "action_EVENT_ENTER_REGION_14004",
    trigger_count = 0
  },
  {
    config_id = 1014005,
    name = "ENTER_REGION_14005",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_14005",
    action = "action_EVENT_ENTER_REGION_14005",
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
    regions = {14001, 14002},
    triggers = {
      "ENTER_REGION_14001",
      "ENTER_REGION_14002"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {14003},
    regions = {
      14001,
      14002,
      14004
    },
    triggers = {
      "ENTER_REGION_14001",
      "ENTER_REGION_14002",
      "ENTER_REGION_14004"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {14006},
    regions = {
      14001,
      14002,
      14005
    },
    triggers = {
      "ENTER_REGION_14001",
      "ENTER_REGION_14002",
      "ENTER_REGION_14005"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_14001(context, evt)
  if evt.param1 ~= 14001 then
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
function action_EVENT_ENTER_REGION_14001(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 247206014, suite = 3}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_14002(context, evt)
  if evt.param1 ~= 14002 then
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
function action_EVENT_ENTER_REGION_14002(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 247206014, suite = 4}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_14004(context, evt)
  if evt.param1 ~= 14004 then
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
function action_EVENT_ENTER_REGION_14004(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 247206014, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_14005(context, evt)
  if evt.param1 ~= 14005 then
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
function action_EVENT_ENTER_REGION_14005(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 247206014, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
