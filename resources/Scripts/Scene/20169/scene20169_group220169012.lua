local base_info = {group_id = 220169012}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 12001,
    gadget_id = 70360280,
    pos = {
      x = 35.11,
      y = 78.638,
      z = -85.906
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 12002,
    gadget_id = 70360280,
    pos = {
      x = 37.432,
      y = 78.642,
      z = -76.073
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 12003,
    gadget_id = 70360291,
    pos = {
      x = 35.11,
      y = 78.638,
      z = -74.967
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 12004,
    gadget_id = 70360291,
    pos = {
      x = 37.432,
      y = 78.642,
      z = -86.587
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
    config_id = 12005,
    shape = RegionShape.CUBIC,
    size = {
      x = 10.0,
      y = 15.0,
      z = 15.0
    },
    pos = {
      x = 36.342,
      y = 82.386,
      z = -81.117
    }
  }
}
triggers = {
  {
    config_id = 1012005,
    name = "ENTER_REGION_12005",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_12005",
    action = "action_EVENT_ENTER_REGION_12005",
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
    gadgets = {
      12001,
      12002,
      12003,
      12004
    },
    regions = {12005},
    triggers = {
      "ENTER_REGION_12005"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_12005(context, evt)
  if evt.param1 ~= 12005 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 0 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_12005(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 12001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 12002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
