local base_info = {group_id = 247203007}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 7001,
    gadget_id = 70320002,
    pos = {
      x = 184.77,
      y = 148.512,
      z = 412.057
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 7002,
    gadget_id = 70320002,
    pos = {
      x = 177.322,
      y = 148.512,
      z = 427.293
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 7004,
    gadget_id = 70320002,
    pos = {
      x = 177.151,
      y = 148.451,
      z = 316.206
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 7005,
    gadget_id = 70320002,
    pos = {
      x = 177.136,
      y = 148.451,
      z = 311.726
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 7006,
    gadget_id = 70220103,
    pos = {
      x = 181.081,
      y = 150.812,
      z = 328.624
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 7008,
    gadget_id = 70220103,
    pos = {
      x = 181.02,
      y = 150.686,
      z = 292.234
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 7009,
    gadget_id = 70220103,
    pos = {
      x = 181.12,
      y = 150.807,
      z = 405.422
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 7010,
    gadget_id = 70220103,
    pos = {
      x = 181.922,
      y = 150.742,
      z = 440.968
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 7011,
    gadget_id = 70220103,
    pos = {
      x = 181.014,
      y = 153.0,
      z = 420.165
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 7012,
    gadget_id = 70220103,
    pos = {
      x = 181.027,
      y = 153.0,
      z = 311.993
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 7013,
    gadget_id = 70220103,
    pos = {
      x = 205.75,
      y = 162.604,
      z = 292.208
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 7014,
    gadget_id = 70220103,
    pos = {
      x = 205.148,
      y = 162.343,
      z = 441.862
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
    config_id = 7003,
    shape = RegionShape.CUBIC,
    size = {
      x = 10.0,
      y = 10.0,
      z = 40.0
    },
    pos = {
      x = 181.265,
      y = 152.383,
      z = 423.055
    }
  },
  {
    config_id = 7007,
    shape = RegionShape.CUBIC,
    size = {
      x = 10.0,
      y = 10.0,
      z = 45.0
    },
    pos = {
      x = 181.041,
      y = 152.296,
      z = 313.636
    }
  }
}
triggers = {
  {
    config_id = 1007003,
    name = "ENTER_REGION_7003",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_7003",
    action = "action_EVENT_ENTER_REGION_7003"
  },
  {
    config_id = 1007007,
    name = "ENTER_REGION_7007",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_7007",
    action = "action_EVENT_ENTER_REGION_7007"
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
      7001,
      7002,
      7004,
      7005,
      7006,
      7008,
      7009,
      7010,
      7011,
      7012,
      7013,
      7014
    },
    regions = {7003, 7007},
    triggers = {
      "ENTER_REGION_7003",
      "ENTER_REGION_7007"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_7003(context, evt)
  if evt.param1 ~= 7003 then
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
function action_EVENT_ENTER_REGION_7003(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 7001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 7002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_7007(context, evt)
  if evt.param1 ~= 7007 then
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
function action_EVENT_ENTER_REGION_7007(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 7004, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 7005, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
