local base_info = {group_id = 251019001}
monsters = {
  {
    config_id = 1001,
    monster_id = 21010101,
    pos = {
      x = 53.329,
      y = 0.066,
      z = -41.156
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1002,
    monster_id = 21010101,
    pos = {
      x = 56.781,
      y = 0.067,
      z = -41.398
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1010,
    monster_id = 21020201,
    pos = {
      x = -43.656,
      y = -0.001,
      z = 0.442
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1
  }
}
npcs = {}
gadgets = {
  {
    config_id = 1004,
    gadget_id = 70350003,
    pos = {
      x = 16.224,
      y = 0.232,
      z = -16.646
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1005,
    gadget_id = 70310108,
    pos = {
      x = -4.302,
      y = 2.46,
      z = -31.231
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1007,
    gadget_id = 70310108,
    pos = {
      x = -30.639,
      y = 2.32,
      z = -31.24
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1008,
    gadget_id = 70350003,
    pos = {
      x = -43.919,
      y = 0.232,
      z = -15.956
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  {
    config_id = 1011,
    gadget_id = 70350004,
    pos = {
      x = -43.727,
      y = 0.193,
      z = 13.66
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1012,
    gadget_id = 70350003,
    pos = {
      x = -43.861,
      y = 12.192,
      z = 12.99
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
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 46.42,
      y = 0.055,
      z = -60.174
    }
  },
  {
    config_id = 1006,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = -5.899,
      y = 2.46,
      z = -31.231
    }
  },
  {
    config_id = 1009,
    shape = RegionShape.CUBIC,
    size = {
      x = 10.0,
      y = 10.0,
      z = 10.0
    },
    pos = {
      x = -43.919,
      y = 2.755,
      z = -9.199
    }
  },
  {
    config_id = 1014,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = -43.861,
      y = 14.396,
      z = 21.265
    }
  },
  {
    config_id = 1015,
    shape = RegionShape.CUBIC,
    size = {
      x = 5.0,
      y = 10.0,
      z = 10.0
    },
    pos = {
      x = -43.861,
      y = 2.159,
      z = 25.264
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
    config_id = 1001009,
    name = "ENTER_REGION_1009",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_1009",
    action = "action_EVENT_ENTER_REGION_1009"
  },
  {
    config_id = 1001013,
    name = "ANY_MONSTER_DIE_1013",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_1013",
    action = "action_EVENT_ANY_MONSTER_DIE_1013"
  },
  {
    config_id = 1001014,
    name = "ENTER_REGION_1014",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_1014",
    action = "action_EVENT_ENTER_REGION_1014"
  },
  {
    config_id = 1001015,
    name = "ENTER_REGION_1015",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_1015",
    action = "action_EVENT_ENTER_REGION_1015"
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
      1004,
      1005,
      1007,
      1008,
      1011,
      1012
    },
    regions = {
      1003,
      1006,
      1009,
      1014,
      1015
    },
    triggers = {
      "ENTER_REGION_1003",
      "ENTER_REGION_1006",
      "ENTER_REGION_1009",
      "ENTER_REGION_1014",
      "ENTER_REGION_1015"
    },
    rand_weight = 100
  },
  {
    monsters = {1001, 1002},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {1010},
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_1013"
    },
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
  ScriptLib.AddExtraGroupSuite(context, 251019001, 2)
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
  ScriptLib.TransPlayerToPos(context, {
    uid_list = {
      evt.uid
    },
    pos = {
      x = -33.64,
      y = 0.1,
      z = -31.24
    },
    radius = 0.5,
    rot = {
      x = 0,
      y = 270,
      z = 0
    }
  })
  return 0
end
function condition_EVENT_ENTER_REGION_1009(context, evt)
  if evt.param1 ~= 1009 then
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
function action_EVENT_ENTER_REGION_1009(context, evt)
  ScriptLib.SetGadgetStateByConfigId(context, 1008, GadgetState.Default)
  ScriptLib.AddExtraGroupSuite(context, 251019001, 3)
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_1013(context, evt)
  if evt.param1 ~= 1010 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_1013(context, evt)
  ScriptLib.SetGadgetStateByConfigId(context, 1011, GadgetState.GearStart)
  ScriptLib.SetGadgetStateByConfigId(context, 1012, GadgetState.GearStart)
  return 0
end
function condition_EVENT_ENTER_REGION_1014(context, evt)
  if evt.param1 ~= 1014 then
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
function action_EVENT_ENTER_REGION_1014(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1012, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_1015(context, evt)
  if evt.param1 ~= 1015 then
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
function action_EVENT_ENTER_REGION_1015(context, evt)
  ScriptLib.TransPlayerToPos(context, {
    uid_list = {
      evt.uid
    },
    pos = {
      x = -32.83,
      y = 12.07,
      z = -1.23
    },
    radius = 0.5,
    rot = {
      x = 0,
      y = 270,
      z = 0
    }
  })
  return 0
end
