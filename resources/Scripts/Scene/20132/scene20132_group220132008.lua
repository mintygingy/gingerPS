local base_info = {group_id = 220132008}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 8001,
    gadget_id = 70900201,
    pos = {
      x = 501.085,
      y = 32.81,
      z = 435.392
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 8002,
    gadget_id = 70360001,
    pos = {
      x = 500.798,
      y = 32.294,
      z = 436.292
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 8004,
    gadget_id = 70900201,
    pos = {
      x = 509.426,
      y = 29.76,
      z = 447.059
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 8006,
    gadget_id = 70900201,
    pos = {
      x = 511.197,
      y = 19.787,
      z = 467.54
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 8009,
    gadget_id = 70900201,
    pos = {
      x = 500.824,
      y = 19.82,
      z = 474.996
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
    config_id = 8003,
    shape = RegionShape.CYLINDER,
    radius = 5,
    pos = {
      x = 501.085,
      y = 35.839,
      z = 435.392
    },
    height = 15.0
  },
  {
    config_id = 8005,
    shape = RegionShape.CYLINDER,
    radius = 5,
    pos = {
      x = 509.426,
      y = 34.35,
      z = 447.059
    },
    height = 15.0
  },
  {
    config_id = 8007,
    shape = RegionShape.CUBIC,
    size = {
      x = 25.0,
      y = 10.0,
      z = 6.0
    },
    pos = {
      x = 518.285,
      y = 23.298,
      z = 467.54
    }
  },
  {
    config_id = 8008,
    shape = RegionShape.SPHERE,
    radius = 6,
    pos = {
      x = 497.084,
      y = 37.921,
      z = 442.103
    }
  }
}
triggers = {
  {
    config_id = 1008003,
    name = "ENTER_REGION_8003",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_8003",
    action = "action_EVENT_ENTER_REGION_8003"
  },
  {
    config_id = 1008005,
    name = "ENTER_REGION_8005",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_8005",
    action = "action_EVENT_ENTER_REGION_8005"
  },
  {
    config_id = 1008007,
    name = "ENTER_REGION_8007",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_8007",
    action = "action_EVENT_ENTER_REGION_8007"
  },
  {
    config_id = 1008008,
    name = "ENTER_REGION_8008",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_8008",
    action = "action_EVENT_ENTER_REGION_8008"
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
    gadgets = {8002},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {8001},
    regions = {8003, 8008},
    triggers = {
      "ENTER_REGION_8003",
      "ENTER_REGION_8008"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {8004},
    regions = {8005},
    triggers = {
      "ENTER_REGION_8005"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {8006},
    regions = {8007},
    triggers = {
      "ENTER_REGION_8007"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {8009},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_8003(context, evt)
  if evt.param1 ~= 8003 then
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
function action_EVENT_ENTER_REGION_8003(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220132008, suite = 3}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220132002, EntityType.GADGET, 2021) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_8005(context, evt)
  if evt.param1 ~= 8005 then
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
function action_EVENT_ENTER_REGION_8005(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220132008, suite = 4}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_8007(context, evt)
  if evt.param1 ~= 8007 then
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
function action_EVENT_ENTER_REGION_8007(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220132008, suite = 5}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_8008(context, evt)
  if evt.param1 ~= 8008 then
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
function action_EVENT_ENTER_REGION_8008(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 201320201) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  return 0
end
