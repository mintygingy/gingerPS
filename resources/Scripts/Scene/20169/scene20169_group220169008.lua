local base_info = {group_id = 220169008}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 8001,
    gadget_id = 70360283,
    pos = {
      x = -5.619,
      y = 63.363,
      z = -72.188
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
    gadget_id = 70360283,
    pos = {
      x = -2.701,
      y = 63.671,
      z = -63.282
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
    gadget_id = 70290833,
    pos = {
      x = -5.29,
      y = 54.768,
      z = -80.886
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 8008,
    gadget_id = 70290734,
    pos = {
      x = 15.196,
      y = 77.061,
      z = -80.645
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
    shape = RegionShape.CUBIC,
    size = {
      x = 5.0,
      y = 10.0,
      z = 5.0
    },
    pos = {
      x = -5.619,
      y = 58.466,
      z = -72.188
    }
  },
  {
    config_id = 8004,
    shape = RegionShape.CUBIC,
    size = {
      x = 5.0,
      y = 10.0,
      z = 5.0
    },
    pos = {
      x = -2.701,
      y = 58.657,
      z = -63.282
    }
  },
  {
    config_id = 8005,
    shape = RegionShape.CUBIC,
    size = {
      x = 20.0,
      y = 10.0,
      z = 10.0
    },
    pos = {
      x = -8.082,
      y = 58.552,
      z = -75.708
    }
  },
  {
    config_id = 8007,
    shape = RegionShape.CUBIC,
    size = {
      x = 3.0,
      y = 6.0,
      z = 4.0
    },
    pos = {
      x = -5.29,
      y = 54.768,
      z = -80.886
    }
  },
  {
    config_id = 8009,
    shape = RegionShape.CUBIC,
    size = {
      x = 40.0,
      y = 10.0,
      z = 30.0
    },
    pos = {
      x = 22.899,
      y = 64.053,
      z = -88.281
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
    config_id = 1008004,
    name = "ENTER_REGION_8004",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_8004",
    action = "action_EVENT_ENTER_REGION_8004"
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
    config_id = 1008009,
    name = "ENTER_REGION_8009",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_8009",
    action = "action_EVENT_ENTER_REGION_8009"
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
    gadgets = {8001, 8002},
    regions = {
      8003,
      8004,
      8005,
      8009
    },
    triggers = {
      "ENTER_REGION_8003",
      "ENTER_REGION_8004",
      "ENTER_REGION_8005",
      "ENTER_REGION_8009"
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
    gadgets = {8008},
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
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 8001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_8004(context, evt)
  if evt.param1 ~= 8004 then
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
function action_EVENT_ENTER_REGION_8004(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 8002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
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
  ScriptLib.AddExtraGroupSuite(context, 220169008, 2)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 8006, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
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
  if 0 ~= ScriptLib.AddQuestProgress(context, "30311701") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220169008, 3)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220169013, suite = 3}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_8009(context, evt)
  if evt.param1 ~= 8009 then
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
function action_EVENT_ENTER_REGION_8009(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220169013, suite = 2}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
