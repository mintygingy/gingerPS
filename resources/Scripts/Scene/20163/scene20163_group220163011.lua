local base_info = {group_id = 220163011}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 11001,
    gadget_id = 70350464,
    pos = {
      x = 56.021,
      y = 76.427,
      z = -64.294
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 11005,
    gadget_id = 70220103,
    pos = {
      x = 89.534,
      y = 81.281,
      z = -64.292
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 11006,
    gadget_id = 70220103,
    pos = {
      x = 93.457,
      y = 82.726,
      z = -40.682
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 11012,
    gadget_id = 70900203,
    pos = {
      x = 59.578,
      y = 80.96,
      z = 3.318
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
    config_id = 11004,
    shape = RegionShape.CUBIC,
    size = {
      x = 10.0,
      y = 10.0,
      z = 10.0
    },
    pos = {
      x = 62.959,
      y = 73.356,
      z = -63.17
    }
  },
  {
    config_id = 11007,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 94.254,
      y = 80.773,
      z = -35.526
    }
  },
  {
    config_id = 11010,
    shape = RegionShape.CUBIC,
    size = {
      x = 40.0,
      y = 10.0,
      z = 15.0
    },
    pos = {
      x = 77.512,
      y = 80.386,
      z = -63.999
    }
  },
  {
    config_id = 11011,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 94.408,
      y = 81.688,
      z = -34.945
    }
  },
  {
    config_id = 11013,
    shape = RegionShape.CUBIC,
    size = {
      x = 10.0,
      y = 10.0,
      z = 10.0
    },
    pos = {
      x = 60.009,
      y = 84.782,
      z = 3.088
    }
  }
}
triggers = {
  {
    config_id = 1011002,
    name = "VARIABLE_CHANGE_11002",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_11002",
    action = "action_EVENT_VARIABLE_CHANGE_11002",
    trigger_count = 0
  },
  {
    config_id = 1011003,
    name = "VARIABLE_CHANGE_11003",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_11003",
    action = "action_EVENT_VARIABLE_CHANGE_11003",
    trigger_count = 0
  },
  {
    config_id = 1011004,
    name = "ENTER_REGION_11004",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_11004",
    action = "action_EVENT_ENTER_REGION_11004",
    trigger_count = 0
  },
  {
    config_id = 1011007,
    name = "ENTER_REGION_11007",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_11007",
    action = "action_EVENT_ENTER_REGION_11007",
    trigger_count = 0
  },
  {
    config_id = 1011010,
    name = "ENTER_REGION_11010",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_11010",
    action = "action_EVENT_ENTER_REGION_11010",
    trigger_count = 0
  },
  {
    config_id = 1011011,
    name = "ENTER_REGION_11011",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_11011",
    action = "action_EVENT_ENTER_REGION_11011"
  },
  {
    config_id = 1011013,
    name = "ENTER_REGION_11013",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_11013",
    action = "action_EVENT_ENTER_REGION_11013",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "discSuccess3",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 2,
    name = "default",
    value = 0,
    no_refresh = false
  }
}
garbages = {
  gadgets = {
    {
      config_id = 11009,
      gadget_id = 70350085,
      pos = {
        x = 55.252,
        y = 75.335,
        z = -64.041
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1
    }
  },
  triggers = {
    {
      config_id = 1011008,
      name = "GADGET_STATE_CHANGE_11008",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_11008",
      action = "action_EVENT_GADGET_STATE_CHANGE_11008"
    }
  }
}
init_config = {
  suite = 1,
  end_suite = 0,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {11001},
    regions = {
      11004,
      11007,
      11010,
      11011,
      11013
    },
    triggers = {
      "VARIABLE_CHANGE_11002",
      "VARIABLE_CHANGE_11003",
      "ENTER_REGION_11004",
      "ENTER_REGION_11007",
      "ENTER_REGION_11010",
      "ENTER_REGION_11011",
      "ENTER_REGION_11013"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {11005, 11006},
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
function condition_EVENT_VARIABLE_CHANGE_11002(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "discSuccess3") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_11002(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 11001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_11003(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "discSuccess3") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_11003(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 11001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_11004(context, evt)
  if evt.param1 ~= 11004 then
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
function action_EVENT_ENTER_REGION_11004(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220163011, 2)
  return 0
end
function condition_EVENT_ENTER_REGION_11007(context, evt)
  if evt.param1 ~= 11007 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "default") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_11007(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220163011, 2)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "default", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_11010(context, evt)
  if evt.param1 ~= 11010 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "default") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_11010(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220163011, 2)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "default", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_11011(context, evt)
  if evt.param1 ~= 11011 then
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
function action_EVENT_ENTER_REGION_11011(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 11012}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_11013(context, evt)
  if evt.param1 ~= 11013 then
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
function action_EVENT_ENTER_REGION_11013(context, evt)
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220163011, EntityType.GADGET, 11012) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
