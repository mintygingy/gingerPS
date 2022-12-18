local base_info = {group_id = 250075006}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 6001,
    gadget_id = 70290480,
    pos = {
      x = 446.191,
      y = 25.298,
      z = 498.901
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart,
    route_id = 2
  }
}
regions = {
  {
    config_id = 6002,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 456.12,
      y = 23.212,
      z = 496.044
    }
  },
  {
    config_id = 6003,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 440.341,
      y = 33.573,
      z = 513.719
    }
  }
}
triggers = {
  {
    config_id = 1006002,
    name = "ENTER_REGION_6002",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_6002",
    action = "action_EVENT_ENTER_REGION_6002"
  },
  {
    config_id = 1006003,
    name = "ENTER_REGION_6003",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_6003",
    action = "action_EVENT_ENTER_REGION_6003"
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
    gadgets = {6001},
    regions = {6002, 6003},
    triggers = {
      "ENTER_REGION_6002",
      "ENTER_REGION_6003"
    },
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
function condition_EVENT_ENTER_REGION_6002(context, evt)
  if evt.param1 ~= 6002 then
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
function action_EVENT_ENTER_REGION_6002(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 6001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_6003(context, evt)
  if evt.param1 ~= 6003 then
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
function action_EVENT_ENTER_REGION_6003(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 6001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
