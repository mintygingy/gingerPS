local base_info = {group_id = 220157006}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 6001,
    gadget_id = 70900201,
    pos = {
      x = 249.275,
      y = 182.531,
      z = 250.693
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6002,
    gadget_id = 70900202,
    pos = {
      x = 221.625,
      y = 186.371,
      z = 250.477
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6003,
    gadget_id = 70900201,
    pos = {
      x = 259.601,
      y = 176.301,
      z = 250.099
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6005,
    gadget_id = 70900201,
    pos = {
      x = 264.921,
      y = 177.551,
      z = 282.456
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6007,
    gadget_id = 70900202,
    pos = {
      x = 247.993,
      y = 179.86,
      z = 282.624
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6008,
    gadget_id = 70900202,
    pos = {
      x = 194.283,
      y = 179.544,
      z = 282.63
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6009,
    gadget_id = 70360001,
    pos = {
      x = 194.345,
      y = 179.403,
      z = 282.667
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6010,
    gadget_id = 70900201,
    pos = {
      x = 124.248,
      y = 188.718,
      z = 282.662
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6011,
    gadget_id = 70360001,
    pos = {
      x = 194.345,
      y = 179.403,
      z = 282.667
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6012,
    gadget_id = 70900201,
    pos = {
      x = 90.27,
      y = 188.824,
      z = 282.661
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
    config_id = 6004,
    shape = RegionShape.CUBIC,
    size = {
      x = 10.0,
      y = 10.0,
      z = 10.0
    },
    pos = {
      x = 259.601,
      y = 175.667,
      z = 250.099
    }
  },
  {
    config_id = 6006,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 264.921,
      y = 178.998,
      z = 282.669
    }
  }
}
triggers = {
  {
    config_id = 1006004,
    name = "ENTER_REGION_6004",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_6004",
    action = "action_EVENT_ENTER_REGION_6004"
  },
  {
    config_id = 1006006,
    name = "ENTER_REGION_6006",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_6006",
    action = "action_EVENT_ENTER_REGION_6006"
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
    gadgets = {6001},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {6002},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {6003},
    regions = {6004},
    triggers = {
      "ENTER_REGION_6004"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {6005},
    regions = {6006},
    triggers = {
      "ENTER_REGION_6006"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {6007},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {6008},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {6009},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {6010},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {6012},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {6011},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_6004(context, evt)
  if evt.param1 ~= 6004 then
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
function action_EVENT_ENTER_REGION_6004(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220157006, suite = 5}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_6006(context, evt)
  if evt.param1 ~= 6006 then
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
function action_EVENT_ENTER_REGION_6006(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220157006, suite = 6}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
