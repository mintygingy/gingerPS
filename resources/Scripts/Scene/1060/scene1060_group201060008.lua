local base_info = {group_id = 201060008}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 8002,
    gadget_id = 70360001,
    pos = {
      x = 11.159,
      y = -0.067,
      z = 3.887
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    room = 1
  }
}
regions = {
  {
    config_id = 8001,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 12.029,
      y = -0.067,
      z = 4.863
    },
    room = 1
  }
}
triggers = {
  {
    config_id = 1008001,
    name = "ENTER_REGION_8001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_8001",
    action = "action_EVENT_ENTER_REGION_8001",
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
    gadgets = {8002},
    regions = {8001},
    triggers = {
      "ENTER_REGION_8001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_8001(context, evt)
  if evt.param1 ~= 8001 then
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
function action_EVENT_ENTER_REGION_8001(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 8002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
