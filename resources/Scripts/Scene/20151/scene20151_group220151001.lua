local base_info = {group_id = 220151001}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 1001,
    gadget_id = 70330452,
    pos = {
      x = -30.007,
      y = 0.546,
      z = 56.557
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 1002,
    gadget_id = 70330424,
    pos = {
      x = -57.176,
      y = 3.022,
      z = 72.765
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 1004,
    gadget_id = 70330452,
    pos = {
      x = -44.385,
      y = 0.656,
      z = 56.455
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 1005,
    gadget_id = 70330452,
    pos = {
      x = -15.632,
      y = 0.546,
      z = 56.537
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 1007,
    gadget_id = 70900201,
    pos = {
      x = -15.498,
      y = 1.674,
      z = 50.724
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1008,
    gadget_id = 70900201,
    pos = {
      x = -29.79,
      y = 1.545,
      z = 50.764
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1009,
    gadget_id = 70900201,
    pos = {
      x = -44.561,
      y = 1.545,
      z = 50.693
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1011,
    gadget_id = 70290196,
    pos = {
      x = -15.302,
      y = 0.656,
      z = 38.03
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
    config_id = 1003,
    shape = RegionShape.CUBIC,
    size = {
      x = 20.0,
      y = 50.0,
      z = 70.0
    },
    pos = {
      x = -30.001,
      y = 0.701,
      z = 71.863
    }
  },
  {
    config_id = 1006,
    shape = RegionShape.CUBIC,
    size = {
      x = 10.0,
      y = 10.0,
      z = 10.0
    },
    pos = {
      x = 15.298,
      y = 5.057,
      z = 73.285
    }
  },
  {
    config_id = 1010,
    shape = RegionShape.CUBIC,
    size = {
      x = 35.0,
      y = 10.0,
      z = 5.0
    },
    pos = {
      x = -29.68,
      y = 1.828,
      z = 50.401
    }
  }
}
triggers = {
  {
    config_id = 1001003,
    name = "ENTER_REGION_1003",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_1003",
    action = "action_EVENT_ENTER_REGION_1003"
  },
  {
    config_id = 1001006,
    name = "ENTER_REGION_1006",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_1006",
    action = "action_EVENT_ENTER_REGION_1006"
  },
  {
    config_id = 1001010,
    name = "ENTER_REGION_1010",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_1010",
    action = "action_EVENT_ENTER_REGION_1010"
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
    gadgets = {
      1001,
      1002,
      1004,
      1005
    },
    regions = {1003, 1006},
    triggers = {
      "ENTER_REGION_1003",
      "ENTER_REGION_1006"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      1007,
      1008,
      1009,
      1011
    },
    regions = {1010},
    triggers = {
      "ENTER_REGION_1010"
    },
    rand_weight = 100
  },
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
    regions = {},
    triggers = {},
    rand_weight = 100
  },
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
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_1003(context, evt)
  if evt.param1 ~= 1003 then
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
function action_EVENT_ENTER_REGION_1003(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1004, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1005, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220151001, 2)
  return 0
end
function condition_EVENT_ENTER_REGION_1006(context, evt)
  if evt.param1 ~= 1006 then
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
function action_EVENT_ENTER_REGION_1006(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_1010(context, evt)
  if evt.param1 ~= 1010 then
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
function action_EVENT_ENTER_REGION_1010(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 1007}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 1008}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 1009}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
