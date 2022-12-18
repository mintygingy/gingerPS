local base_info = {group_id = 247202007}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 7001,
    gadget_id = 70330407,
    pos = {
      x = 181.014,
      y = 148.512,
      z = 419.612
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    server_global_value_config = {SGV_BulletType = 2}
  },
  {
    config_id = 7002,
    gadget_id = 70220103,
    pos = {
      x = 181.067,
      y = 150.751,
      z = 405.398
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 7004,
    gadget_id = 70330407,
    pos = {
      x = 181.027,
      y = 148.46,
      z = 313.06
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    server_global_value_config = {SGV_BulletType = 2}
  },
  {
    config_id = 7005,
    gadget_id = 70220103,
    pos = {
      x = 180.985,
      y = 150.776,
      z = 328.61
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 7006,
    gadget_id = 70220103,
    pos = {
      x = 180.978,
      y = 150.833,
      z = 292.312
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
      x = 180.984,
      y = 152.528,
      z = 419.612
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
      x = 181.027,
      y = 152.464,
      z = 313.06
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
      x = 182.039,
      y = 150.893,
      z = 440.904
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
      7011,
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
  return 0
end
