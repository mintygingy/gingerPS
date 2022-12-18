local base_info = {group_id = 220163006}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 6002,
    gadget_id = 70350464,
    pos = {
      x = 2.64,
      y = 61.891,
      z = 57.581
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
    config_id = 6001,
    shape = RegionShape.SPHERE,
    radius = 7,
    pos = {
      x = 2.847,
      y = 61.143,
      z = 62.043
    }
  }
}
triggers = {
  {
    config_id = 1006001,
    name = "ENTER_REGION_6001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_6001",
    action = "action_EVENT_ENTER_REGION_6001"
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
    gadgets = {6002},
    regions = {6001},
    triggers = {
      "ENTER_REGION_6001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_6001(context, evt)
  if evt.param1 ~= 6001 then
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
function action_EVENT_ENTER_REGION_6001(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 6002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
