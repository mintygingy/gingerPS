local base_info = {group_id = 247205013}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 13003,
    gadget_id = 70900203,
    pos = {
      x = 209.187,
      y = 160.68,
      z = 441.955
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 13004,
    gadget_id = 70900201,
    pos = {
      x = 324.831,
      y = 158.632,
      z = 331.116
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
    config_id = 13001,
    shape = RegionShape.CUBIC,
    size = {
      x = 10.0,
      y = 15.0,
      z = 10.0
    },
    pos = {
      x = 181.014,
      y = 153.471,
      z = 292.23
    }
  },
  {
    config_id = 13002,
    shape = RegionShape.CUBIC,
    size = {
      x = 25.0,
      y = 80.0,
      z = 40.0
    },
    pos = {
      x = 313.671,
      y = 168.105,
      z = 289.494
    }
  },
  {
    config_id = 13005,
    shape = RegionShape.CUBIC,
    size = {
      x = 10.0,
      y = 15.0,
      z = 10.0
    },
    pos = {
      x = 209.187,
      y = 164.804,
      z = 441.955
    }
  },
  {
    config_id = 13006,
    shape = RegionShape.CUBIC,
    size = {
      x = 10.0,
      y = 20.0,
      z = 10.0
    },
    pos = {
      x = 324.831,
      y = 165.358,
      z = 331.116
    }
  }
}
triggers = {
  {
    config_id = 1013001,
    name = "ENTER_REGION_13001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_13001",
    action = "action_EVENT_ENTER_REGION_13001",
    trigger_count = 0
  },
  {
    config_id = 1013002,
    name = "ENTER_REGION_13002",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_13002",
    action = "action_EVENT_ENTER_REGION_13002",
    trigger_count = 0
  },
  {
    config_id = 1013005,
    name = "ENTER_REGION_13005",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_13005",
    action = "action_EVENT_ENTER_REGION_13005",
    trigger_count = 0
  },
  {
    config_id = 1013006,
    name = "ENTER_REGION_13006",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_13006",
    action = "action_EVENT_ENTER_REGION_13006",
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
    regions = {13001, 13002},
    triggers = {
      "ENTER_REGION_13001",
      "ENTER_REGION_13002"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {13003},
    regions = {
      13001,
      13002,
      13005
    },
    triggers = {
      "ENTER_REGION_13001",
      "ENTER_REGION_13002",
      "ENTER_REGION_13005"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {13004},
    regions = {
      13001,
      13002,
      13006
    },
    triggers = {
      "ENTER_REGION_13001",
      "ENTER_REGION_13002",
      "ENTER_REGION_13006"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_13001(context, evt)
  if evt.param1 ~= 13001 then
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
function action_EVENT_ENTER_REGION_13001(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 247205013, suite = 3}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_13002(context, evt)
  if evt.param1 ~= 13002 then
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
function action_EVENT_ENTER_REGION_13002(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 247205013, suite = 4}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_13005(context, evt)
  if evt.param1 ~= 13005 then
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
function action_EVENT_ENTER_REGION_13005(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 247205013, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_13006(context, evt)
  if evt.param1 ~= 13006 then
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
function action_EVENT_ENTER_REGION_13006(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 247205013, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
